package unifmi.robot;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int batteryload = 4;
        int firstNumber;
        ChargetheBattery(batteryload);
    }

    public static void ChargetheBattery(int batteryload) {

        //1.Robot get decision
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Enter the number from 0 to 2(0=Wall;1=Chair;2=Nothing):");
        number = scan.nextInt();
        if (number == 0) {
            System.out.println("Go Sideway");
        } else if (number == 1) {
            System.out.println("Jump");
        } else if (number == 2) {
            System.out.println("Forward");
        } else
            System.out.println("Enter valid number between 0 and 2");
    }

    public static boolean FindTheMouSe() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pixels per inch");
        int pixels = scan.nextInt();
        if (pixels % 2 == 0) {
            System.out.println("Mouse detected,ready to attack!");
            return true;
        } else
            System.out.println("No mouse,start again,ask for another direction!");
        return false;

    }

    public static void battery() {
        Scanner scan = new Scanner(System.in);
        int battery = scan.nextInt();
        if (battery > 0) {
            System.out.println("Battery load");
        } else if (battery == 0)
            System.out.println("No battery,going to charge!");
    }

    public static boolean Furniture() {
        Random random = new Random();
        try {
            boolean randomNumber = (random.nextInt((9) + 1) != 5);
            if (randomNumber) {
                System.out.println("Hit will destroy the furniture!");
                return true;
            } else
                System.out.println("The mouse is dead,!");
            return false;
        }
        public static boolean ChargetheBattery(){
            boolean batteryload;
            Random random1 = new Random();
            int firstNumber;
            int secondNumber;

            do {
                firstNumber = random1.nextInt(1000) + 1;
                secondNumber = random1.nextInt(1000) + 1;
            } while (firstNumber == secondNumber);

            if (firstNumber > secondNumber) {
                ChargetheBattery(batteryload);
                return true;
            } else {
                ChargetheBattery(int batteryload);
                return false;
            }
            return ChargetheBattery;
        }
        public static boolean FinishTheJob(){
            for (int i = 10; i > 0; i--) {
                if (i % 2 == 0) {
                    System.out.println(i + " I am a Robottttt! ");
                }
            }
        }
    }
}