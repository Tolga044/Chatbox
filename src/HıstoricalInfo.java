import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


public class HıstoricalInfo extends Information{
    public void Tarih()  {
        Scanner scanner=new Scanner(System.in);
        int secim;
        while(true){
        System.out.println("Atatürk ile ilgili bilgiler için 1 e bas");
        System.out.println("Türkiye ile ilgili bilgiler için 2 e bas");
        System.out.println("Türk Silahlı kuvvetleri ile ilgili bilgiler için 3 e bas");
        System.out.println("0-Ana menüye dön/çıkış");

        System.out.println("seçiminiz:");
        secim=scanner.nextInt();
        scanner.nextLine();


        String DosyaAdi="";
        switch (secim) {
            case 1:
                DosyaAdi = "bilgiler/tarıhselbılgı.txt.txt";
                break;
            case 2:
                DosyaAdi = "bilgiler/türkiye.txt";
                break;
            case 3:
                DosyaAdi = "bilgiler/tsk.txt";
                break;
            case 0:
                return;
                default:
                System.out.println("geçersiz seçim");
                continue;
        }


        //dosya okuma işlemi
        try{
            File file = new File(DosyaAdi);
            Scanner DosyaOku=new Scanner(file);

            System.out.println("---bilgiler---");
            while (DosyaOku.hasNextLine()){
                System.out.println(DosyaOku.nextLine());
            }
            DosyaOku.close();
        }catch (FileNotFoundException e){
            System.out.println("dosya bulunamadı");
        }
        System.out.println("devam etmek için entera bas");
        scanner.nextLine();

        }
    }
}



