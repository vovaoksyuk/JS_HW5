import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sx = new Scanner((System.in));
        System.out.println("Введите число");
        int number = sx.nextInt();
        int operation = number%2;
        if (operation==0){
            System.out.println(number+"- число кратно 2");
        }
        else {
            System.out.println("Введите другое число");
        }

    }
}
