package OOPs.interfaces;

public class Car implements Engine,Brake,Media  {
    @Override
    public void brake() {  System.out.println("i brake like normal car");   }

    @Override
    public void start() { System.out.println("i start like normal car");    }

    @Override
    public void stop() { System.out.println("i stop like normal car");   }

    @Override
    public void acc() {  System.out.println("i accelerate like normal car");    }
}
