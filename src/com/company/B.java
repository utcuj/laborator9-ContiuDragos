package com.company;

public class B extends A {
    private int b;

    public B(int a, int b)
    {
        super(a);
        this.b=b;
    }

    public void verificaExamene(int a, int b) throws Exceptia1
    {
        super.verificaExamene(a);
        if(b<5)
        {
            throw new Exceptia2("Al doilea examen e picat");
        }
        else
            System.out.println("Al doilea examen e promovat");
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
