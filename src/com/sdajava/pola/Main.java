package com.sdajava.pola;

public class Main {

    public static void main(String[] args) {

        Pola kwadrat = new Pola();

        kwadrat.czytajDane();
        System.out.println("Wynik: " +kwadrat.poleKwadrat());





        Pola kwadratSet = new Pola();
        System.out.println("Pole kwadratu:  " + kwadrat.poleKwadrat());

        kwadrat.setA(12);// <= dopiero od tej linijki obowiązuje seter
        kwadrat.setB(30);

        System.out.println("Pole kwadratu:  " + kwadrat.poleKwadrat());
        System.out.println("Pole prostokatu:  " + kwadrat.poleProstokat());


    }
}
