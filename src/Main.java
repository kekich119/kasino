import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите, от которого числа будет рклетка");
         int min = in.nextInt();
        System.out.println("Введите число, до которого будет рулетка");
        int max = in.nextInt();



        yes();

    }


    public static int getRan(int max,  int min){


         return (int) (Math.random() * max) +min;

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