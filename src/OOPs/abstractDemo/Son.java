package OOPs.abstractDemo;

public class Son extends Parent {
    public Son(int age) {
        super(age);
    }
    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("im going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}
