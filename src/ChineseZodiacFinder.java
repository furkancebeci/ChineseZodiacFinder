import java.util.Scanner;

public class ChineseZodiacFinder {
    public static void main(String[] args) {
        int year, zodiac;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        year = input.nextInt();

        zodiac = year % 12;

        switch (zodiac) {
            case 0:
                System.out.println("Your Chinese zodiac sign: Monkey");
                break;
            case 1:
                System.out.println("Your Chinese zodiac sign: Rooster");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign: Dog");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign: Pig");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign: Mouse");
                break;
            case 5:
                System.out.println("Your Chinese zodiac sign: Ox");
                break;
            case 6:
                System.out.println("Your Chinese zodiac sign: Tiger");
                break;
            case 7:
                System.out.println("Your Chinese zodiac sign: Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign: Dragon");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign: Snake");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign: Horse");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign: Sheep");
                break;
        }
    }
}
