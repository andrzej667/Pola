package com.sdajava.pola;

import java.util.Scanner;

/**
 * Created by Andrzej on 20.02.2017.
 */
public class Pola {

    public int a;
    public int b;

    public Pola(int a,int b)
    {
        this.a=a;
        this.b=b;
    }



    public int poleKwadrat()    {
        return a*a;
    }

    public int poleProstokat()    {
        return a*b;
    }

    public void setA(int a)    {
        this.a=a;
    }

    public int getA(){
        return this.a;
    }
    public void setB(int b)    {
        this.b=b;

    }

    public Pola()
    {
    }

    public void czytajDane()
    {

        Scanner wejscie = new Scanner(System.in);
        this.a = wejscie.nextInt();
        this.b = wejscie.nextInt();
        }

}
