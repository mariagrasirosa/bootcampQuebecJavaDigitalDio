import java.util.Calendar;


public class Message {


    public static void greetings(){

        Calendar hour = Calendar.getInstance();

        int h = hour.get(Calendar.HOUR) + ((Calendar.PM == 1) ? 12 : 0);

        if (h >= 12 && h <= 18 ){
            System.out.println ("Boa tarde!!!\n");
        }
        else if (h > 18 && h <= 24 ){
            System.out.println ("Boa noite!!!\n");

        }else{
            System.out.println ("Bom dia!!!\n");

        }

    }
    
}
