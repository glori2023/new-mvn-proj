package abs;

public interface Drawable extends Printable,Playable {
    void draw();

}

class Triangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("/\\");
        System.out.println("/ \\");
        System.out.println("----");
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

    @Override
    public void print() {

    }
}

class Tester{
    public static void main(String[]args){
        new Triangle().draw();
       new Triangle().printDefault();
    }
}