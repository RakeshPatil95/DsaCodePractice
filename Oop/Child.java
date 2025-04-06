package Oop;

import java.util.ArrayList;

abstract class Child implements One{

    public Child(){
        System.out.println("Constructor of Parent Abstract class" + this.hashCode());
    }

    public abstract Object method9();
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {
        System.out.println("M 3");
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }

    @Override
    public void method8() {

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.trimToSize();

    }

    public void method10(){
        System.out.println("method 10");
    }
}
