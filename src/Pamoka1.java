import java.util.Collections;
import java.util.Arrays;
public class Pamoka1
{
    public static void main(String[] args)
    {
        System.out.println("Isvedamas tekstas");
        System.out.println("kazka isvesti");
        System.out.println(0.00000000004 < 0.00000000003);

        System.out.println(Math.max(4, 31));

        // Sveikieji skaiciai
        int skaicius = 41245;       // sveikas skaicius
        //    byte mazasSkaicius = 41245;           // labai mazas sveikas skaicius (meta errora nes per didelis)
        byte mazasSkaicius = 4;
        long didelisSkaicius = 9999999;     // didelis sveikas skaicius
        short mazesnisSkaicius = 4;

        int suma = mazasSkaicius + skaicius;
        byte didelisSkaiciusSuspaustas = (byte)didelisSkaicius;
        System.out.println(didelisSkaiciusSuspaustas);

        System.out.println("----------");


        // Realieji skaiciai
        float metaiSuKableliu = 365.25f;
        double kilometraiIMylias = 0.621371192;
        int metaiBeKablelio = (int)metaiSuKableliu;
        System.out.println(metaiBeKablelio);


        System.out.println("----------");

        // Simboliai ir String
        char raide = 'a';
        char simbolis = '/';
        //   char raide2 = "s";              // mes klaida, nes simbolis gali buti tik su vienguba kabute
        char raide2 = 's';

        String zodis = "zoooodis";
        String tekstas = "gali buti ir zodziai su tarpais";
        String zodis2 = String.valueOf('z');                //  neveiks, nes String negali buti su viengubom kabutem

        // Tekstiniai kintamieji ir masyvai
        char[] simboliuMasyvas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int[] skaiciuMasyvas = {1, 4, 5, 9, 7, 2, 8 ,147};
        String[] zodziuMasyvas = {"pirmas zodis", "kitas zodis", "dar vienas", "siaip"};

        String pakeistasCharMasyvasIString = String.valueOf(simboliuMasyvas);
        char[] stringPakeistasIChar = zodis.toCharArray();

        String tekstasSuKabutemis = "Java \\ programavimui \\ naudoju \"Java JDK\", kuri parsisiunciau is \"Oracle\"  ";


        System.out.println(raide);
        System.out.println(simbolis);
        System.out.println(raide2);
        System.out.println(zodis.charAt(3));
        System.out.println(zodis.charAt(5));
        System.out.println(tekstas);
        System.out.println(zodis2);
        //    System.out.println(simboliuMasyvas);
        System.out.println(pakeistasCharMasyvasIString);
        System.out.println(skaiciuMasyvas);
        System.out.println(zodziuMasyvas);
        System.out.println(tekstasSuKabutemis);

        System.out.println(stringPakeistasIChar[0]);
        //     System.out.println(zodis[0]);                 // mes klaida, nes ne masyvas o String kintamasis


        // Operatoriai
        int skOperatoriai = 5;
        skOperatoriai += skOperatoriai;
        skOperatoriai -= 14;
        skOperatoriai *= 2;
        skOperatoriai++;                // skOperatoriai = skOperatoriai + 1;       // skOperatoriai += 1;

        //  x > y
        // 5 < 17
        // 18 == 20
        // >=   <=   !=

        if ((5 < 6) && (18 != 17))
        {
            System.out.println("Veikia");
            // kazka daryti
        }

        boolean arRodytiPaveiksliuka = true;
        boolean arPaveiksliukasIkeltas = false;
      /*  if (arRodytiPaveiksliuka)
        {
            System.out.println("paveiksliuko rodymas");
        }*/

        // Ifai
        if ((arRodytiPaveiksliuka) && (arPaveiksliukasIkeltas))
        {
            System.out.println("Rodome paveiksliuka");
        }
        else
        {
            if (!arRodytiPaveiksliuka)
            {
                System.out.println("Paveiksliukas neturi buti rodomas");
            }
            else
            if (!arPaveiksliukasIkeltas)
            {
                System.out.println("Neikeltas paveiksliukas");
            }
        }

        // Case

        int diena = 6;
        //    int[] savaitesDienos = {1, 2, 3, 4, 5, 6, 7};     // masyvo switch'ui paduoti negalima - turi buti viena primityvi reiksme
        switch (diena)
        {
            case 6:
                System.out.println("Siandien sestadienis");
                break;
            case 7:
                System.out.println("siandien Sekmadienis");
                break;
            default:
                System.out.println("Siandien yra darbo diena");
        }

        System.out.println("----------");
        System.out.println("----------");

        // Ternary operatorius
        int skaicius1 = 18;
        int skaicius2 = 10;
        int ternSkaicius = (skaicius1 > skaicius2) ? skaicius1 : skaicius2;
        System.out.println(ternSkaicius);



        // Math metodus
        int didesnisPorosSkaicius = Math.max(skaicius1, skaicius2);
        int mazesnisPorosSkaicius = Math.min(skaicius1, skaicius2);
        System.out.println(didesnisPorosSkaicius);
        System.out.println(mazesnisPorosSkaicius);
        System.out.println("----------");
        // Modulis
        int neigiamasSkaicius = -77742;
        System.out.println(neigiamasSkaicius);
   /*     if (neigiamasSkaicius < 0)
            neigiamasSkaicius *= -1;   */
        neigiamasSkaicius = Math.abs(neigiamasSkaicius);
        System.out.println(neigiamasSkaicius);

        // Laipsnio kelimas
        int dvejetas = 2;
        double dvejetoSaknis = Math.sqrt(dvejetas);
        System.out.println(dvejetoSaknis);

        double penketoKubas = Math.pow(5, 5);
        double dvejetoSaknisPerPow = Math.pow(2, -4);
        double vienaTrecioji = 1 / 3;               // bus 0, nes sveiko skaicio dalyba is kito skaiciaus sveiku daliu (1 / 3 bus nulis, nes 0.33)
        double kubineSaknis = Math.pow(8, (double) 1 / (double) 3);
        System.out.println(penketoKubas);
        System.out.println(dvejetoSaknisPerPow);
        System.out.println(kubineSaknis);

        // Random
        int pradzia = 5;
        int pabaiga = 15;
        double atsitiktinis = Math.random();
        atsitiktinis = atsitiktinis * (pabaiga - pradzia);
        atsitiktinis = atsitiktinis + pradzia;
        atsitiktinis = (int) atsitiktinis;


        System.out.println(atsitiktinis);


        System.out.println("-----------------------");


        // MASYVO darymai
        int[] skMasyvas = {1, 2, 3, 4, 5};
        int[] naujasSkMasyvas = new int[6];
        for (int i = 0; i < skMasyvas.length ; i++)
        {
            naujasSkMasyvas[i] = skMasyvas[i];
        }
        naujasSkMasyvas[5] = 6;
     /* skMasyvas = Arrays.copyOf(skMasyvas, skMasyvas.length + 1);
        skMasyvas[5] = 6;*/
        for (int i = 0; i < naujasSkMasyvas.length; i++)
        {
            System.out.println(naujasSkMasyvas[i]);
        }
        int[] ivestiSkaiciai;
  /*      System.getSecurityManager();
        Žmogus.akys.getSpalva();
        Žmogus.gautiAmziu();

        var žmogausAkys;
        var žmogausPlaukai;
        Žmogus.akys;
        Žmogus.plaukai;  */


        System.out.println(suma(5, 6));
        isvestiTeksta("ISVEDAMAS TEKSTAS");
        int mazSkaicius1 = 17;
        int mazSkaicius2 = 27;
//        sumazintiDuSkaicius(mazSkaicius1, mazSkaicius2);
        System.out.println(mazSkaicius1);
        System.out.println(mazSkaicius2);

        int[] duSkaiciai = {89, 36};
        sumazintiDuSkaicius(duSkaiciai);
        System.out.println(duSkaiciai[0]);
        System.out.println(duSkaiciai[1]);
        String str;

    }

    public static int suma(int x, int y)
    {
        return x + y;
    }


    public static void isvestiTeksta (String tekstas)
    {
        System.out.println(tekstas);
    }

    public static void sumazintiDuSkaicius(int[] duSkaiciai)
    {
        duSkaiciai[0]--;
        duSkaiciai[1]--;
    }
}
