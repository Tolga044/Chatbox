import java.io.FileNotFoundException;
import java.util.Scanner;

public class  Information implements Runnable  {
public static void main(String[] args){
    Thread bilgi=new Thread(new Information());
    bilgi.start();
}
   public void run(){

       Scanner scanner=new Scanner(System.in);
       System.out.println("Merhabalar isminiz nedir");
       String isim=scanner.nextLine();
       System.out.println("Bilgiye hoşgeldin "+ isim );
       System.out.println("Sana hangi Konuda Yardımcı olmamı istersin yardımcı olmamı istediğin numaraya bas");
           System.out.println("1=Tarihsel bilgi");
           System.out.println("2=Bilimsel bilgiler");
           System.out.println("3=kültür bilgeri");
           System.out.println("4=kahveleri hazırla hal hatır konuşalım :)");

       int secim= scanner.nextInt();
           switch (secim){
               case 1:

                   HıstoricalInfo hıstoricalInfo=new HıstoricalInfo();
                   try {
                       hıstoricalInfo.Tarih();
                   }catch (Exception e){
                       e.printStackTrace();
                   }
                   break;
                   case 2:
                       ScienceInfo scienceInfo=new ScienceInfo();

                       try{
                           scienceInfo.bilim();
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       break;
               case 3:
                   CulturelInfo culturelInfo=new CulturelInfo();
                   try {
                       culturelInfo.kultur();
                   }catch (Exception e){
                       e.printStackTrace();
                   }
                   break;
               case 4:
                   ChatBot chatBot=new ChatBot();
                   try {
                       chatBot.konusma();
                   }catch (Exception e){
                       e.printStackTrace();

                   }
                   break;




           }
        }

       }



