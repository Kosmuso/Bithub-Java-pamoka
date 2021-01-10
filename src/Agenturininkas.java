public class Agenturininkas extends DarbuotojoClass
{
    public Agenturininkas()
    {
    }

    public Agenturininkas(String vardas, String pavarde, double alga)
    {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.alga = alga;
    }


    public double algosSkaiciavimas()
    {
        return this.alga;
    }
}
