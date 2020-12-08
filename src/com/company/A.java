package com.company;

public class A {
    private int a;

    public A(int a)
    {
        this.a=a;
    }
    public void verificaExamene(int a) throws Exceptia1 {
        if(a < 5)
            throw new Exceptia1("Primul examen e picat");
        else
            System.out.println("Primul examen e promovat");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
