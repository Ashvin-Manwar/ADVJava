package OOPs.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Rock Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
