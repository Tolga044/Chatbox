import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class CulturelInfo extends Information{
    public void kultur(){
        Scanner scanner=new Scanner(System.in);
        int Secim;

        while (true){
            System.out.println("türk kültürü için 1 e bas");
            System.out.println("avrupa kültürü için 2 e bas");
            System.out.println("asya kültürü için 3 e bas");
            System.out.println("amerika kültürü için 4 e bas");
            System.out.println("ana menü için 0 a bas");

            System.out.println("seçiminiz");
            Secim=scanner.nextInt();
            scanner.nextLine();

            String DosyaAdı="";
            switch (Secim){
                case 1:
                DosyaAdı="kültürelbilgi/türk kültürü.txt";
                break;
                case 2:
                    DosyaAdı="kültürelbilgi/avrupa kültürü.txt";
                    break;
                case 3:
                    DosyaAdı="kültürelbilgi/asya kültürü.txt";
                    break;
                case 4:
                    DosyaAdı="kültürelbilgi/amerikan kültürü.txt";
                case 0:
                    return;
                default:
                    System.out.println("geçersiz seçim");
                    continue;
            }
            try {
                File file = new File(DosyaAdı);
                Scanner DosyaOku = new Scanner(file);
                System.out.println("---kültürel bilgi---");
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
