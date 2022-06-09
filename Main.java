import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int randomInt = random.nextInt(100)+ 1;
         System.out.println(randomInt);

        int a;
        boolean win=false;

        Scanner input= new Scanner(System.in);



        while(win==false){
            System.out.println("Pick one number from 1 to 100: ");
             a=input.nextInt();


            if (randomInt == a) {
                win = true;
                System.out.println("congratulations,you guessed it ");


            } else if (randomInt < a) {
                System.out.println("Please enter a smaller number");


            } else if (randomInt > a) {
                System.out.println("Please enter a larger number");

            }

        }
    }
}
