/*package cz.czechitas.lekce6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class poznámky {
}
package cz.czechitas.lekce6;

        import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.List;

public class Kolekce {
    private List<String> seznamJmen = new ArrayList<>();
    private List<Integer> seznamCisel = new LinkedList<>();
    /*private String text = "Ahoj";    */

    /*public void test (){
        /*
        seznamJmen.remove ("Honza");   /*prvek s názvem Honza*/
    /*seznamJmen.remove(6);      /*prvek na šesté pozici*/
    /*seznamJmen.set(5, "Eva"); /*to znamená, že prvek na páté pozici nahradím prvkem "eva" */
    /*seznamJmen.subList ();/*umí vybrat třeba prvky od 5 do 20    */
    /*dnyVTydnu.add("pondelí");   */
/*
    public void (){
        seznamJmen.add("Eva");
        seznamJmen.add("Marie");
        seznamJmen.add("Jolana");
        seznamJmen.add("Iveta");
        seznamJmen.add("Adriana");

        seznamJmen.remove ("Marie");
        seznamJmen.remove (0);


        for (int i = 0; i < seznamJmen.size(); i++) {
            String jmeno = seznamJmen.get(i);
            System.out.println(jmeno);
        }

        dnyVTydnu.add("pondeli");
        dnyVTydnu.add("uterý");
        dnyVTydnu.add("středa");
        dnyVTydnu.add("čtvrtek");
        dnyVTydnu.add("pátek");
        dnyVTydnu.add("sobota");
        dnyVTydnu.add("neděle");
        for (String den : dnyVTydnu) {
            System.out.println(den);
 */
/*
        }
    }

}
 */
/*
List<String> - když říkám, že je něco seznam, musím říct, čeho jet o seznam. To "čeho" je ve špičatých záovorek
to ve špičatých závorkách se nazývá "generika" - bude to mít v sobě objeky...
  do toho listu si mohu přidat třeba nějaké metody - říká to, co to musí umět, ale neříká to, jak se to udělá
  v tomto případě, jedna z implementací listu je "arrayList" a ta už ví, co to má udělat. Například, když se zavolá metoda "is empty", nic moc se tam neukáže
  Představit si to můžeme jako zásovku (klasickou) an 230V, máme rozhraní a mám jen stanoveno, jak má vypadat
  ta zástrčka
  existují 2 typy seznamů
  a) arraylist - má rychlý přístup k tomu prvku, pokud prvek přidáváme prvek nakonec, tak ta operace může trvat déle..
  b) LinkedList - ten funguje tak, že když budeme chtít zhískat prvek podle pořadí, tak musí jít od začátku
      a bere prvek po prvku a počítá, který to je.     Je to pomalé, ale když budu chtít přidat něco na začátek nebo konec,
      je to rychlé.   Spíše se používá ArrayList
      Když voláme arraylist, ty kulaté závorky jsou konstruktory


 */
/*
package cz.czechitas.lekce6;
/*pritimivní datové typy + primitivní datová "dvojčata"*/
/*public class Cisla {
    private long cislo1;
    private Long cislo2;
    /*
    private boolean b = true;      */
   /* public static void main (String[]args){
        new Cisla().vypis();


        private void vypis (){
            System.out.println(cislo1);
            System.out.println(cislo2);
            System.out.println(b);
            /*ukázky převodů mezi datovými typy. speciální explicitní
              zápis je nutný když potřebuji hlavně z většího na menší
              */  /*
            int cisloInt = 5;
            long cisloLong = 6L;

            cisloLong = cisloInt;
            cisloInt = (int) cisloLong;

            /* když to budu chtít z malého na velké:
            cisloInt = (int)cisloLong
            cislo1 = cislo 2
             */
          /*dále se budeme zabývat složitějšími datovými typy:
          budeme se zabývat java collections frame work - což jsou třídy, které umožňují pracovat s větším počtem objedktů najednou)
          Kolekce umí ukládat víc objektů do jednoho místa, nebo je pojmenovávat do jedné proměnné.
          Například viz úkol - u těch disků, bychom mohli mít proměnnou, že to jsou všechny disky v počítači a těch disků by tam bylo víc
          Ty kolece jsou větší množsství prvků a to, čím se to liší je to, jak ty kolekce mohou vypadat
          2 hlavní typy kolekcí
          a) typ List (seznam) - má zadáno, v jakém pořadí jsou prvky seřazeny. Můžu říct,"dej mi druhý
              prvek z toho seznamu"  Nový prvek se zařadí nakonec

          b) typ Set (asi množina) - prvky nejsou seřazené a naopak je tam zařučené, že tam každý prvek
             může být jen jednou. Nelze to samé vložit 2x. Nejsou ale seřazené, neeviduje se, který je nejnovější


           */
