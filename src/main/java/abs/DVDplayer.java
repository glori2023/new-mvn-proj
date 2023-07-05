package abs;

public class DVDplayer extends Player implements Playable, Test {

    @Override
    public void play() {
        System.out.println("start playing DVD dick....");
    }

    @Override
    public void play(int numberOfSongs) {

    }

    @Override
    public void stop() {
        System.out.println("stop playing DVD dick....");
    }

    @Override
    public void test() {

    }
}
