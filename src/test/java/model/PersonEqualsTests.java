package model;

public class PersonEqualsTests {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setLastName("Johnson");
        p.setAge(55);
        p.setId(100);

        Person p2 = new Person(100,"John","Johnson",55);

        //1.  == сравнивает ссылки, они всегда разные для разных объектов
        System.out.println("p==p2 ?" + (p==p2));

        // объект не создается
        Person p100=p;
        System.out.println("p100==p ?" + (p100==p));
    //    p2=p;
        System.out.println("p2==p100 ?" + (p2==p100));


        // 2  equals по умолчанию проверяет ссылки
        //если не переопределить equals всегда будут сравниваться ссылки

        Cat cat1= new Cat("Murzik");
        Cat cat2= new Cat("Murzik");
        Person person1 = new Person(123,"Mike","Tyson",56);
        person1.setCat(cat1);

        Person person2 = new Person(123,"Mike","Tyson",56);
        person2.setCat(cat2);

//что бы объекты сравнивались корректно надо переопределить метод equals/ как правило объекты сравниваются по полям
        System.out.println("person1 equals person2 " + person1.equals(person2));


        // Hashcode функция, кот вернет целое число
        System.out.println("cart1 hashcode : " + cat1.hashCode());
        System.out.println("cart2 hashcode : " + cat2.hashCode());
        System.out.println("person1 hashcode : " + person1.hashCode());
        System.out.println("person2 hashcode : " + person2.hashCode());
    }
}
