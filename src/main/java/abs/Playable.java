package abs;
//100% abstract class
public interface Playable {
    //public abstract by default
    void play();
    void play(int numberOfSongs);
    public abstract void stop();

    // by default filed is public ans static final
    double PI =3.14;

    public static final  double X =0.99;
}
