package com.company;

public class CalendarLucru {
    private Zi[] calendar = new Zi[7];

    public CalendarLucru()
    {
        calendar[0]= new Zi("luni",true);
        calendar[1]= new Zi("marti",true);
        calendar[2]= new Zi("miercuri",true);
        calendar[3]= new Zi("joi",true);
        calendar[4]= new Zi("vineri",true);
        calendar[5]= new Zi("sambata",false);
        calendar[6]= new Zi("duminica",false);

    }

    public boolean esteLucratoare(String zi)
    {
        for(int i=0;i<7;i++)
            if(calendar[i].getNume().equals(zi))
                return calendar[i].isLucratoare();

        return false;
    }

    public void setZi(String zi, boolean lucratoare)
    {
        for(int i=0;i<7;i++)
            if(calendar[i].getNume().equals(zi))
                calendar[i].setLucratoare(lucratoare);
    }

}
