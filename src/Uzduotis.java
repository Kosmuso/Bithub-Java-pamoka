import java.util.Arrays;

public class Uzduotis
{
    public static void main (String[] args)
    {

        //1 Uzduotis
        System.out.println("Staciakampio plotas: " + plotas(12.2, 4.4));

        //2 Uzduotis
        System.out.println(kmtomi(22) + " Myliu");

        //3 Uzduotis
        System.out.println("Pirmas = " + changePoss(12.3f, 15.4f));
        System.out.println("Antras = " + changePoss2(12.3f, 15.4f));

        //3.1 Uzduotis
        int vienas = 24;
        int antras = 66;
        int laikinasVienas = vienas;
        int laikinasAntras = antras;
        vienas = sukeistiVietom(laikinasAntras, laikinasAntras)[0];
        antras = sukeistiVietom(laikinasVienas, laikinasVienas)[1];
        System.out.println("vienas: " + vienas);
        System.out.println("antras: " + antras);

        //4 Uzduotis
        double[] skaiciaiVidurkiui = {12, 15, 17, 163, 2, 424};
        System.out.println("Vidurkis " + findAverage(skaiciaiVidurkiui));

        //5 Uzduotis
        int number = 12345055;
        for (int i = 0; i < getDigitsOf(number).length; i++)
        {
            System.out.println(getDigitsOf(number)[i]);
        }

        //6 Uzduotis

        int[] sarasas2 = {1, 2, 17, 4, 8, 15};
        System.out.println("kas antras: " + Arrays.toString(kasAntras(sarasas2)));


        //7 Uzduotis


        int pradzia = 1;
        int pabaiga = 7;
        double atsitiktinis = Math.random();
        atsitiktinis = atsitiktinis * (pabaiga - pradzia);
        atsitiktinis = atsitiktinis + pradzia;

        int diena = (int) atsitiktinis;
        //System.out.println("savaites dienos random numeris " + diena);

        switch (diena)
        {
            case 1 -> System.out.println("Siandien pirmadienis");
            case 2 -> System.out.println("Siandien antradienis");
            case 3 -> System.out.println("Siandien treciadienis");
            case 4 -> System.out.println("Siandien ketvirtadienis");
            case 5 -> System.out.println("Siandien penktadienis");
            case 6 -> System.out.println("Siandien sestadienis");
            case 7 -> System.out.println("siandien sekmadienis");
        }

    }
    //1 Uzduotis
    public static double plotas (double x, double y)
    {
        return x*y;
    }

    //2 Uzduotis
    public static double kmtomi (double kilometrai)
    {
        double mylios = kilometrai * 0.6214 ;
        return mylios;
    }

    //3 Uzduotis
    public static float changePoss (float x, float y)
    {
        x = y;
        return x;
    }
    public static float changePoss2 (float x, float y)
    {
        y = x;
        return y;
    }

    //3.1 Uzduotis
    public static int[] sukeistiVietom (int x, int y)
    {
        int[] sukeisti = new int[2];
        sukeisti[0] = y;
        sukeisti[1] = x;
        return sukeisti;
    }

    //4 Uzduotis
    public static double findAverage(double[] array)
    {
        double sum = 0;
        double average = 0;
        for (double value : array)
        {
            sum += value;
            average = sum / array.length;
        }
        return average;
    }

    //5 Uzduotis
    public static int[] getDigitsOf(int num)
    {
        int digitCount = Integer.toString(num).length();
        if (num < 0)
            digitCount--;
        int[] result = new int[digitCount];
        while (digitCount-- >0)
        {
            result[digitCount] = num % 10;
            num /= 10;
        }
        return result;
    }

    //6 Uzduotis
    public static int[] kasAntras(int[] sarasas)
    {
        for (int i = 1; i < sarasas.length; i = i+2)
        {
            sarasas[i] = 0;
        }
        return sarasas;
    }
}


