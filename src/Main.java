import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое победит от 1 до 10");
        int min = in.nextInt();

        if (min > 10){
            System.out.println("Миша, всё фигня, давай по новому");
        }
        else {
            yes(1);
        }

    }


    public static int getRan(){


         return (int) (Math.random() * 10) +1 ;

    }
    public static void yes(int min) {
        int x = getRan();
        System.out.println("Число которое выпало: "+x);
        if (min == x){
            System.out.println("ВЫ ВЫИГРАЛИ");
        }
        else {
            System.out.println("Вы проиграли");
        }











    }




}