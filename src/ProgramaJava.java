import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProgramaJava
{
    public static void main (String[] args)
    {

        File failas = new File("data.txt");
        ArrayList<DarbuotojoClass> darbuotojai = new ArrayList<>();
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
                }

                if (darbuotojoDuomenys.get(darbuotojoDuomenys.size() - 1).equals("agenturos"))
                {
                    double tempAlga = Double.parseDouble(darbuotojoDuomenys.get(2));
                    DarbuotojoClass tempDarbuotojas = new Agenturininkas(darbuotojoDuomenys.get(0), darbuotojoDuomenys.get(1), tempAlga);

                    darbuotojai.add(tempDarbuotojas);
                }


            }

////////////


            System.out.println("Firmoje is viso yra : " + darbuotojai.size() + " darbuotojai");

            System.out.println("Firmoje, didesne nei 1000 bazine alga gauna : " + algaBonus(darbuotojai) + " darbuotojai");



            System.out.println("Daugiausiai uzdirba " + daugiausiaiUzdirbantis(darbuotojai));

            for (int i = 0; i < darbuotojai.size(); i++)
            {
                System.out.println(darbuotojai.get(i).pilnasDarbuotojoIsvedimas());
            }

/////////////

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
        double maxAlga = 0;
        int indexas = 0;
        for (int i = 0; i < darbuotojai.size(); i++)
        {
            if (maxAlga < darbuotojai.get(i).algosSkaiciavimas())
            {
                indexas = i;
            }
        }
        return darbuotojai.get(indexas).pilnasVardas();
    }

}
