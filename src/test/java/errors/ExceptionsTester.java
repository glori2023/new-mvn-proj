package errors;

import model.Person;

public class ExceptionsTester {
    public static void main(String[] args) {
        System.out.println("begin");
       // Person p1 = new Person();
      Person p1 = new Person();

        Throwable throwable;
        Error error;
        Exception exception;
try {
    //потенциально не безопасный код пытаемся словить exception который ожидает в блоке catch
    // в блоке catch ожидается объект конкретного типа - исключение throwable
    p1.clone();// will throw new nullPointerexaption object
}catch (NullPointerException e){
    //обработка в случае наступления ошибки
    System.out.println("OOOOps! NullPointerException ( : " + e.getMessage());
    e.printStackTrace();
    e.getMessage();
}finally {
    //блок выполниться в любом случае -в случае ошибки или без ошибки
    System.out.println("final job");
}


int[] array ={2,12,35};
        int i = 2;
try {

    int val = array[i];
    System.out.println(val);
}catch (NullPointerException e){
    //обработка в случае наступления ошибки
    System.out.println("OOOOps! wrong index ( : " + i );
    e.printStackTrace();
    System.out.println("use next index -> from 0 to  " + (array.length-1));
}finally {
    //default implementation -> first elem
    System.out.println(array[0]);
}




}
String str = "hello Java World!";
    String[]words = str.split("");
    for (String word : words){
try {

        System.out.println(word.charAt(word.indexOf('o')));

    }catch (StringIndexOutOfBoundsException e){

            System.out.println("no  " + word + );}



        System.out.println("fin");
    }
}
