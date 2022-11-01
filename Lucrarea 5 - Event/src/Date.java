public class Date
{
    private String numar_eveniment;
    private int nr_invitati;
    private int price;

    public final static int pret_per_oaspete(int pret)
    {
        return pret=35;
    }
    public final static int limita_invitati(int invitati)
    {
        return invitati=50;
    }

    public void setNumar_eveniment(String x)
    {
        numar_eveniment=x;
    }

    public String getNumar_eveniment()
    {
        return numar_eveniment;
    }

    public void setNr_invitati(int y)
    {
        nr_invitati=y;
    }

    public int getNr_invitati()
    {
        return nr_invitati;
    }

    public int getPret_total()
    {
        return getNr_invitati()*pret_per_oaspete(price);
    }
}
