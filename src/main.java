public class main {
    public static void main(String[] args) {
        String str = "čąęąč";
        int sk = 15;
        float skFloat = 2.15f;
        char raide = 'a';
        short sh = 1;
        int skaic = (int) 2.74;
        // long
        // double
        // boolean

        // arrays
        int[] x = {1, 2, 3};

        System.out.println(x.length);


        double[][] koord = {
                {1, 2},
                {0, -7},
                {4, -7.47},
                {8, 0.25},
                {-17, -25},
                {4552.047, 999163.064},
                {0.0000001, 0.0000000001}
        };

        for (int i = 0; i < koord.length; i = i + 2)
        {
            boolean arTeigiami = true;
            String koordString = "";
            for (int j = 0; j < koord[i].length; j++)
            {
                if (koord[i][j] < 0)
                    arTeigiami = false;
                koordString += String.valueOf(koord[i][j]) + "  ";
            }
            System.out.println(arTeigiami + "    " + koordString);
        }

        System.out.println("--------");
        System.out.println("--------");
        System.out.println("--------");

        for (double[] koordinate: koord)
        {
            boolean arTeigiami = true;
            for (double taskas: koordinate)
            {
                if (taskas < 0)
                    arTeigiami = false;
            }
            System.out.println(arTeigiami);
        }

        System.out.println("asdasdadsasd");
        int vienas = 24;
        int antras = 75;
        int laikinasVienas = vienas;
        int laikinasAntras = antras;
        vienas = sukeistiVietom(laikinasVienas, laikinasAntras)[0];
        antras = sukeistiVietom(laikinasAntras, laikinasAntras)[1];
        System.out.println("vienas: " + vienas);
        System.out.println("antras: " + antras);


        int[] skaiciaiNeigiami = {4, 12, -7, -84, 2, -74, -3};
        nunulintiNeigiaumus(skaiciaiNeigiami);
        int[] intMetodas = perkrautasMetodas(1 ,2);
        double[] doubleMetodas = perkrautasMetodas(1.0, 1);

        System.out.println(intMetodas[0]);
        System.out.println(intMetodas[1]);
        System.out.println(doubleMetodas[0]);
        System.out.println(doubleMetodas[1]);
        for (int skaiccc: skaiciaiNeigiami)
        {
            System.out.println(skaiccc);
        }

    }

    // Overloaded method
    public static int[] perkrautasMetodas(int x, int y)
    {
        int[] rez = {1 ,3};
        return rez;
    }

    // Overloaded method
    public static double[] perkrautasMetodas(double x, int y)
    {
        double[] rez = {0.14, 1.74};
        return rez;
    }

    public static void nunulintiNeigiaumus (int x[])
    {
        // For each netinka šiuo atveju, kadangi forEach ima tik tai "kopiją" elemento, o ne patį elementą
        // For each yra labai patogu, jeigu reikia masyvo informaciją tik tai panaudoti (pvz. skaičiavime arba išvedime)
        // Tačiau norint pakeisti masyvo elemento reikšmę reikėtų pasirašyti papildomą "index" kintamąjį, jį prieš for each ciklą "nusinulinti"
        // Tada kas kiekvieną for each ciklo iteraciją pliusinti "index" po vienu daugiau
        // Tačiau tada iškyla klausimas kam daryti taip, jei tiesiog galime gan patogiai užsirašyti ir su paprastu for ciklu
    /*    for (int sk : x)
        {
            if (sk < 0)
            {
                System.out.println("alio");
                sk = 0;
            }
        }*/

        for (int i = 0; i < x.length; i++)
        {
            if (x[i] < 0)
            {
                x[i] = 0;
            }
        }



    }













    // Čia yra vienas iš užduočių sprendimų iš užduoties.
    // Palieku jį pačiam gale, kad "netyčia" nepamatytumėt žiūrėdami kitų metodų pavyzdžius
    // Žinoma, būtų gerai pasibandyti ir patiems, tačiau kadangi šis metodas jau buvo šitame faile, tai jį palieku, jei ta užduotis nesigaus - galite pasižiūrėti čia.



    public static int[] sukeistiVietom (int x, int y)
    {
        int[] sukeisti = new int[2];
        sukeisti[0] = y;
        sukeisti[1] = x;
        return sukeisti;
    }
}
