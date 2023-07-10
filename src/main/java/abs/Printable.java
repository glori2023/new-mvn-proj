package abs;

public interface Printable {
    void print();
    default void printDefault(){
        System.out.println("default object : " + this.toString());
    }
}

class PrintableUser implements Printable, Playable{
    private String name;
    @Override
    public void print(){
        System.out.println("my name " + name);
    }

    @Override
    public void play() {

    }

    @Override
    public void play(int numberOfSongs) {

    }

    @Override
    public void stop() {

    }
}

class PrintableTest{
    public static void main(String[]args){
        PrintableUser pUser= new PrintableUser();
        pUser.print();
        pUser.printDefault();
    }
}