import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {

    public static void main (String [] args) {

        
       
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        

        flipNHeads(2);

        
        clock();
    }

    public static String pluralize(String item, int count ) {
        System.out.println("--------------------------------------------------");
        System.out.println("          In Pluralize Method                     ");
        System.out.println("--------------------------------------------------");

        if(count == 1) {
            return item;
        }
        else {
            return item +"s";
        }
    }

    public static void flipNHeads(int number) {

        System.out.println("--------------------------------------------------");
        System.out.println("          In flipNHeads Method                    ");
        System.out.println("--------------------------------------------------");


        String value = "";
        int headCounter = 0;
        int counter = 0;
        while(true) {
            float leftLimit = 0F;
            float rightLimit = 1F;
            float generatedFloat = leftLimit + new Random().nextFloat() * (rightLimit - leftLimit);
            counter++;
            if(generatedFloat <= 0.5) {
                value = "tails";
                if(headCounter < number) {
                    headCounter = 0;
                }
            }
            else {
                headCounter++;
                value = "heads";
            }
            System.out.println(value);
            if(headCounter == number) {
                break;
            }
        }
        System.out.println("It took "+counter+" flips to flip "+number+" heads in a row.");
    }

    public static void clock() {
        System.out.println("--------------------------------------------------");
        System.out.println("          In clock Method                         ");
        System.out.println("--------------------------------------------------");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        LocalDateTime now1 = LocalDateTime.now();
        int secondValue1 = now1.getSecond();
        int secondValue2 = secondValue1;
        //System.out.print(now);
        while(true) {           
            LocalDateTime now2 = LocalDateTime.now();
            secondValue2 = now2.getSecond();            
            if(secondValue1 != secondValue2) {
                LocalDateTime currentTime = LocalDateTime.now();
                String formatDateTime = currentTime.format(formatter);
                System.out.println(formatDateTime);
                secondValue1 = secondValue2;
            }
           
        }
    }
}