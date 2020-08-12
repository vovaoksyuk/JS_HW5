import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.println("Введите стаж работы:");
        double pay = 10;
        double pay1 = pay*0.1, pay2= pay*0.15, pay3= pay*0.25, pay4= pay*0.35,pay5=pay*0.45,pay6=pay*0.5;
        double years = sx.nextInt();
        if (years<5){
            System.out.println("Ваша премия:"+pay1);
        }
        if (years>5&&years<=10) {
            System.out.println("Ваша премия:" + pay2);
        }
        if (years>10&&years<=15) {
            System.out.println("Ваша премия:" + pay3);
        }
        if (years>=15&&years<=20) {
            System.out.println("Ваша премия:" + pay4);
        }
        if (years>=20&&years<=25) {
            System.out.println("Ваша премия:" + pay5);
        }
        if (years>=25) {
            System.out.println("Ваша премия:" + pay6);
        }



    }
}
