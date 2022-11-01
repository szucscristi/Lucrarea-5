import java.util.Scanner;

public class DouaPersonaje
{
    static int car=1;
    public static void main(String[] args)
    {
        personaj orc = new personaj();
        personaj ciclop = new personaj();

        orc=getData(orc);
        ciclop=getData(ciclop);

        System.out.println("Detalii orc: ");
        System.out.print("Numarul orcilor in joc: "+orc.getNum()+"\nOchi: "+orc.getNr_ochi()+"\nCuloare: "+orc.getCuloare()+"\nVieti: "+orc.getNr_vieti());
        System.out.println("\n\nDetalii elf: ");
        System.out.print("Numarul elfilor in joc: "+ciclop.getNum()+"\nOchi: "+ciclop.getNr_ochi()+"\nCuloare: "+ciclop.getCuloare()+"\nVieti: "+ciclop.getNr_vieti());
    }
    public static personaj getData(personaj pers)
    {
        int num,nr_vieti,nr_ochi;
        String culoare;
        Scanner inputDevice = new Scanner(System.in);
        if(car==1)
            System.out.println("Orci: ");
        if(car==2)
            System.out.println("Elfi: ");
        System.out.println("Scrieti cate asemenea personaje sunt in joc: ");
        num=inputDevice.nextInt();
        inputDevice.nextLine();
        System.out.println("Introduceti culoarea personajului: ");
        culoare=inputDevice.nextLine();
        System.out.println("Introduceti numarul ochilor personajului: ");
        nr_ochi=inputDevice.nextInt();
        System.out.println("Introduceti numarul de vieti ale personajului: ");
        nr_vieti=inputDevice.nextInt();
        pers.setNum(num);
        pers.setCuloare(culoare);
        pers.setNr_ochi(nr_ochi);
        pers.setNr_vieti(nr_vieti);
        car++;
        return pers;
    }

}