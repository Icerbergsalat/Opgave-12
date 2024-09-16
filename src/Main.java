import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int tal1 = 0;
            int tal2 = 0;
            int sum = 0;
            int guess = 0;
            int korrekt = 0;
            int forkert = 0;

            for (int i = 0; i < 5; i++){
                tal1 = (int)(Math.random() * 10);
                tal2 = (int)(Math.random() * 10);
                sum = tal1 + tal2;
                System.out.println(tal1 + "+" + tal2);
                guess = input.nextInt();
                if (guess == sum){
                    korrekt++;
                } else {
                    forkert++;
                }
            }
        System.out.println("du har fået " + forkert + " forkerte");
        System.out.println("du har fået " + korrekt + " rigtige");
    }
}