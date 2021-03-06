public abstract class DarbuotojoClass
{
    protected String vardas;
    protected String pavarde;
    protected double alga;


    public String pilnasVardas()
    {
        return this.vardas + " " + this.pavarde;
    }

    public abstract double algosSkaiciavimas();

    public  String getVardas()
    {
        return vardas;
    }

    public void setVardas(String vardas)
    {
        this.vardas = vardas;
    }

    public String getPavarde()
    {
        return pavarde;
    }

    public void setPavarde(String pavarde)
    {
        this.pavarde = pavarde;
    }

    public double getAlga()
    {
        return alga;
    }

    public void setAlga(double alga)
    {
        this.alga = alga;
    }

    public String pilnasDarbuotojoIsvedimas()
    {
        String pilnasVP = "";
        pilnasVP += pilnasVardas() + "\n";
        pilnasVP += algosSkaiciavimas() + "\n";
        return pilnasVP;
    }



}
