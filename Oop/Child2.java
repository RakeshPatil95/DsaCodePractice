package Oop;

public class Child2 extends Child{

    public Child2() {
        System.out.println("Child class"+this.hashCode());
    }

    @Override
    public String method9() {
        Demo demo = new Demo();
        demo.method1(this);
        return "null";
    }

    public static void main(String[] args) {
//        Child2 c = new Child2();
    }

    @Override
    public void method10() {

    }
}
