package OOPs.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("im going to be a coder");
    }

    @Override
    void partner() {
        System.out.println(" i love iron man");
    }
}
