package OOPs.interfaces;

public class NiceCar {
    private Engine engine;
    private Media Player=new CDPlayer();
    public NiceCar(){
        engine=new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public  void start(){
        engine.start();
    }
    public  void stop(){
        engine.stop();
    }
    public  void startMusic(){
        Player.start();
    }
    public  void stopMusic(){
        Player.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine=engine;

    }

    public void upgradeEngine() {// this i si slater created by me on que demand2
        this.engine=new ElectricEngine();
    }
}
