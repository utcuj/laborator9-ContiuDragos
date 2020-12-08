package com.company;

public class C extends B{
    private int c;

    public C(int a, int b, int c)
    {
        super(a,b);
        this.c=c;
    }

    public void verificaExamene(int a, int b, int c) throws Exceptia1
    {
        super.verificaExamene(a,b);
        if(c<5)
            throw new Exceptia3("Al treilea examen e picat");
        else
            System.out.println("Al treilea examen e promovat");
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
