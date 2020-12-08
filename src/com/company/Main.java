package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        /*
        CalendarLucru calendar1 = new CalendarLucru();
        CalendarLucru calendar2 = new CalendarLucru();

        calendar2.setZi("marti",false);
        calendar2.setZi("joi",false);
        calendar2.setZi("sambata",true);

        Lucrator lucrator1 = new Lucrator("Gigel",calendar1);
        Lucrator lucrator2 = new Lucrator("Sorin",calendar2);

        try
        {
            lucrator1.lucreaza("luni");
        }
        catch (ExceptieZiNelucratoare e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            lucrator1.lucreaza("sambata");
        }
        catch (ExceptieZiNelucratoare e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            lucrator2.lucreaza("marti");
        }
        catch (ExceptieZiNelucratoare e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            lucrator2.lucreaza("luni");
        }
        catch (ExceptieZiNelucratoare e)
        {
            System.out.println(e.getMessage());
        }

        Zi ziua=new Zi("Luni",true);
        System.out.println(ziua.getNume());


        try {
            Zi[] calendar=new Zi[7];
            ziua=null;
            System.out.println(ziua.getNume());
            System.out.println(calendar[7]);

        }

        catch (NullPointerException e) {
            System.out.println("NullPointerException "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException "+e.getMessage());
        }

        try {
            Zi[] calendar=new Zi[7];
            ziua=null;
            System.out.println(calendar[7]);
            System.out.println(ziua.getNume());

        }

        catch (NullPointerException e) {
            System.out.println("NullPointerException "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException "+e.getMessage());
        }

        Zi ziua2=new Zi("Marti",true);
        System.out.println(ziua2.getNume());

        try{
            f();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static void f() throws Exception  {
        try {
            g();
        }
        catch(ExceptiaMea e) {
            throw new Exception(e.getMessage());
        }

    }

    public static void g() throws ExceptiaMea {
        throw new ExceptiaMea("ExceptiaMea!");

    }
         */

        System.out.println("Se verifica daca examenele sunt trecute sau picate\nAlgoritmul se opreste la primul examen picat\n");
        C vector = new C(5, 7, 4);
        try {
            vector.verificaExamene(vector.getA(), vector.getB(), vector.getC());
        } catch (Exceptia1 e) {
            System.out.println(e.getMessage());
        }
    }
}
