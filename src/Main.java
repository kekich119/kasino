import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");



        yes();

    }


    public static int getRan(){


         return (int) (Math.random() * 4) + 1;

    }
    public static void yes() {
        int x = getRan();
        if (x==4){
            System.out.println("ВЫ ВЫИГРАЛИ");
        }
        else {
            System.out.println("Вы проиграли");
        }







            System.out.println(x);



    }



}