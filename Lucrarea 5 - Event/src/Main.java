import java.util.Scanner;

public class Main
{
    static int count=1;
    public static void main(String[] args)
    {
        Date botez_alina=new Date();
        Date majorat_marius=new Date();
        botez_alina=getData(botez_alina);
        majorat_marius=getData(majorat_marius);

        System.out.println("Detalii botez Alina: ");
        System.out.print("Numarul evenimentului: "+botez_alina.getNumar_eveniment()+"\nNumarul invitatilor: "+botez_alina.getNr_invitati()+"\nPret total: "+botez_alina.getPret_total());
        System.out.println("\n\nDetalii majorat Marius: ");
        System.out.print("\nNumarul evenimentului: "+majorat_marius.getNumar_eveniment()+"\nNumarul invitatilor: "+majorat_marius.getNr_invitati()+"\nPret total: "+majorat_marius.getPret_total());
    }

    public static Date getData(Date detalii)
    {
        String numarul_evenimentului;
        int numar_invitati;
        Scanner inputDevice=new Scanner(System.in);
        if(count==1)
            System.out.println("Botez Alina: ");
        if(count==2)
            System.out.println("Majorat Marius: ");
        System.out.println("Introduceti numarul evenimentului: ");
        numarul_evenimentului=inputDevice.nextLine();
        System.out.println("Introduceti numarul invitatilor: ");
        numar_invitati=inputDevice.nextInt();
        detalii.setNumar_eveniment(numarul_evenimentului);
        detalii.setNr_invitati(numar_invitati);
        detalii.getPret_total();
        return detalii;
    }

}