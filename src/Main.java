import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Кинуть мидас");
        String yes = in.nextLine();

        if (yes.equals("да")){
            yes();
        }




    }
    public static void yes(){


        for  (int i = 1; i < 10; i++){
            System.out.println((int) (Math.random() * 4)+1 );
        }



    }

}