import java.util.Scanner;

public class ChatBot extends Information{
    public void konusma(){
        Scanner scanner=new Scanner(System.in);
        String isim=scanner.nextLine();
        System.out.println("eğer sıkılırsan çık demen yeterli");

        while (true){
            System.out.println("Sen:");
            String giris=scanner.nextLine();
            if (giris.equalsIgnoreCase("çık")){
                System.out.println("ChatBot:görüşmek üzere");
                break;
            }
           else if (giris.equalsIgnoreCase("merhaba")){
                System.out.println("ChatBot:başlat bakalım muhabbeti :)");
            }
            else if (giris.equalsIgnoreCase("nasılsın")) {
                System.out.println("ChatBot:iyilik senden  nabersin iyisin hayat nasıl");
            }
            else if (giris.equalsIgnoreCase("hayat kötü")) {
                System.out.println("ChatBot:hayırdır noldu ya konu nedir");
            }
            else if (giris.equalsIgnoreCase("daraldım")){
                    System.out.println("ChatBot:seni anlıyorum ondan dolayı kendine vakit ayır akışa bırak");
            }
            else if(giris.equalsIgnoreCase("herşey çok iyi")){
                    System.out.println("ChatBot:bunu duyduğuma sevindim daha iyi şeyler olur hayatında");
                }

            else {
                    System.out.println("konu hakkında bilgi sahibi değilim ");
                }


            }
        }

    }

