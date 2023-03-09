import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        ArrayList<konsumsi>listkonsumsi = new ArrayList<>();
        konsumsi<Mkaan,minum > breakfast = new konsumsi<>();
        konsumsi<Mkaan,minum > lunch = new konsumsi<>();

        Mkaan roti = new Mkaan();
        roti.setNamaHidangan("Roti Tawar");
        minum susu = new minum();
        susu.setNamaHidangan("SUSU sapi");
        breakfast.setkonsumsi(roti,susu);
        listkonsumsi.add(breakfast);

        Mkaan nasi = new Mkaan();
        nasi.setNamaHidangan(" nasi putih");
        minum air = new minum();
        air.setNamaHidangan("air putih");
        lunch.setkonsumsi(nasi,air);
        listkonsumsi.add(lunch);
        System.out.println("menu konsumsi");
        for (konsumsi<Mkaan,minum> konsumsi: listkonsumsi){
            Mkaan mkaan = konsumsi.getM();
            minum minum = konsumsi.getI();

            System.out.println(mkaan.disantap());
            System.out.println(minum.disantap());
        }
    }


}
