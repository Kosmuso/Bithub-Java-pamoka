public class Kontraktininkas extends DarbuotojoClass
{
    private int stazasMenesiais;

    public Kontraktininkas()
    {
    }

    public Kontraktininkas(String vardas, String pavarde, double alga, int stazasMenesiais)
    {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.alga = alga;
        this.stazasMenesiais = stazasMenesiais;
    }

    public double algosSkaiciavimas()
    {
        double skaiciuojamaAlga = 0;
        if (this.stazasMenesiais >= 12)
        {
            skaiciuojamaAlga = this.alga * 1.2;
            if (this.stazasMenesiais >= 24)
            {
                skaiciuojamaAlga = this.alga * 1.5;
            }
        }
        else
        {
            skaiciuojamaAlga = this.alga;
        }
        return skaiciuojamaAlga;
    }



    public int getStazasMenesiais()
    {
        return stazasMenesiais;
    }

    public void setStazasMenesiais(int stazasMenesiais)
    {
        this.stazasMenesiais = stazasMenesiais;
    }
}
