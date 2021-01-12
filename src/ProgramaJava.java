import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ProgramaJava
{
    public static void main (String[] args)
    {

        File failas = new File("data.txt");
        ArrayList<DarbuotojoClass> darbuotojai = new ArrayList<>();
        ArrayList<DarbuotojoClass> kontraktoDarb = new ArrayList<>();
        ArrayList<DarbuotojoClass> agenturosDarb = new ArrayList<>();
        try
        {
            Scanner failoSkaitytuvas = new Scanner(failas);
            while (failoSkaitytuvas.hasNextLine())
            {
                String eilute = failoSkaitytuvas.nextLine();
                String[] isskaidytaEilute = eilute.split(",");
                List<String> darbuotojoDuomenys = Arrays.asList(isskaidytaEilute);

                if (darbuotojoDuomenys.get(darbuotojoDuomenys.size() - 1).equals("kontrakto"))
                {
                    double tempAlga = Double.parseDouble(darbuotojoDuomenys.get(2));
                    int tempStazas = Integer.parseInt(darbuotojoDuomenys.get(3));
                    DarbuotojoClass tempDarbuotojas = new Kontraktininkas(darbuotojoDuomenys.get(0), darbuotojoDuomenys.get(1), tempAlga, tempStazas);

                    darbuotojai.add(tempDarbuotojas);
                    kontraktoDarb.add(tempDarbuotojas);
                }

                if (darbuotojoDuomenys.get(darbuotojoDuomenys.size() - 1).equals("agenturos"))
                {
                    double tempAlga = Double.parseDouble(darbuotojoDuomenys.get(2));
                    DarbuotojoClass tempDarbuotojas = new Agenturininkas(darbuotojoDuomenys.get(0), darbuotojoDuomenys.get(1), tempAlga);

                    darbuotojai.add(tempDarbuotojas);
                    agenturosDarb.add(tempDarbuotojas);
                }


            }

////////////

            System.out.println("Firmoje is viso yra : " + darbuotojai.size() + " darbuotojai");

            System.out.println("Firmoje, didesne nei 1000 bazine alga gauna : " + algaBonus(darbuotojai) + " darbuotojai");

            System.out.println("Daugiausiai uzdirba : " + daugiausiaiUzdirbantis(darbuotojai));

            System.out.println("Darbuotojai dirbantys pagal kontrakta, viso per menesi uzdirba : " + kontArAgentViso(kontraktoDarb));

            System.out.println("Darbuotojai dirbantys per agentura, viso per menesi uzdirba : " + kontArAgentViso(agenturosDarb));

            System.out.println("Daugiausiai uzdirbantis agenturos darbuotojas : " + daugiausiaiUzdirbantis(agenturosDarb));

            /*for (int i = 0; i < darbuotojai.size(); i++)
            {
                System.out.println(darbuotojai.get(i).pilnasDarbuotojoIsvedimas());
            }*/

///////////

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    public static int algaBonus(ArrayList<DarbuotojoClass> darbuotojai)
    {
        double bonus = 0;
        int x = 0;
        for (int i = 0; i < darbuotojai.size(); i++)
        {
            bonus = darbuotojai.get(i).algosSkaiciavimas();
            if (bonus >= 1000)
            {
                x++;
            }
        }
        return x;
    }

    public static String daugiausiaiUzdirbantis(ArrayList<DarbuotojoClass> darbuotojai)
    {
        double tempMax = 0;
        int indexas = 0;
        for (int i = 0; i < darbuotojai.size(); i++)
        {
            if (tempMax < darbuotojai.get(i).algosSkaiciavimas())
            {
                tempMax = darbuotojai.get(i).algosSkaiciavimas();
                indexas = i;
            }
        }
        return darbuotojai.get(indexas).pilnasVardas();
    }

    public static double kontArAgentViso(ArrayList<DarbuotojoClass> darbuotojai)
    {
        double total = 0;
        for (int i = 0; i < darbuotojai.size(); i++)
        {
            total += darbuotojai.get(i).algosSkaiciavimas();

        }
        return total;
    }
}
