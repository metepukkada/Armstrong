import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number = 0, numberArm = 0, numberFixed = 0, numberOfDigits = 0, worth = 0, armstrong = 0;
        Scanner input = new Scanner(System.in);


        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();
        numberArm = number;
        numberFixed = numberArm;
        while (number != 0) {
            worth += number % 10;
            ++numberOfDigits;
            number /= 10;
        }
        System.out.println("Basamak Sayısı: " + numberOfDigits);
        System.out.println("Rakamlar Toplamı: " + worth);

        while (numberArm != 0) {
            armstrong += (int) Math.pow((numberArm % 10), numberOfDigits);
            numberArm /= 10;
        }
        if (armstrong == numberFixed) {
            System.out.println(numberFixed + " Bir Armstrong Sayıdır.");
        } else {
            System.out.println(numberFixed + " Bir Armstrong Sayı Değildir.");
        }
    }
}

