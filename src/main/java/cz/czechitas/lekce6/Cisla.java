package cz.czechitas.lekce6;

public class Cisla {
    private long cislo1;
    private Long cislo2;

    public static void main(String[] args) {
        new Cisla().vypis();

    }

    private void vypis() {
        System.out.println(cislo1);
        System.out.println(cislo2);


        int cisloInt = 5;
        long cisloLong = 6L;

        cisloLong = cisloInt;
        cisloInt = (int) cisloLong;


    }
}
