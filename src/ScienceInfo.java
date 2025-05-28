import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class ScienceInfo extends Information{
    public void bilim(){
        Scanner scanner=new Scanner(System.in);
        int Secim;
        while(true){
            System.out.println("uzay ile ilgili bilgiler için 1 e bas");
            System.out.println("denizler ile ilgili bilgiler için 2 e bas");
            System.out.println("dünya ile ilgil bilgiler için 3 e bas ");
            System.out.println("ana menü için 0 a bas ");


            System.out.println("seçiminiz:");
            Secim=scanner.nextInt();
            scanner.nextLine();


            String DosyaAdi="";
            switch (Secim){
                case 1:
                    DosyaAdi="bilimselbilgi/uzay.txt";
                    break;
                case 2:
                    DosyaAdi="bilimselbilgi/deniz.txt";
                    break;
                case 3:
                    DosyaAdi="bilimselbilgi/uzay.txt";
                    break;
                case 0:
                    return;
                default:
                    System.out.println("geçersiz seçim");
                    continue;
            }

            try {
                File file=new File(DosyaAdi);
                Scanner DosyaOku=new Scanner(file);

                System.out.println("---bilimsel bilgi---");
                while (DosyaOku.hasNextLine()){
                    System.out.println(DosyaOku.nextLine());
                }
                DosyaOku.close();
            }catch (FileNotFoundException e){
                System.out.println("dosya bulunamadı");
            }
        }
    }
}
