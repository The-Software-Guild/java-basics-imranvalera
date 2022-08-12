package main.java.BasicAssesment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int age;
        while (true){
            try {
                System.out.println("What is your age? ");
                age = scanner.nextInt();
                if (age <= 0) {
                    System.out.println("Do not enter an age less than or equal to zero! Try again: ");
                }else{
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Try again, only enter an int! ");
                scanner.nextLine();//to clear the input stream so next input can be taken.
            }
        }
        System.out.println("Your maximum heart rate should be " + getMaxHeartRate(age) + " beats per minute");
        getHearTarget(age);
    }

    private static int getMaxHeartRate(int age){
        return 220 - age;
    }

    private static void getHearTarget(int age){
        int maxHR = getMaxHeartRate(age);
        double minTargetRate = Math.round(maxHR * 0.50);
        double maxTargetRate = Math.round(maxHR * 0.85);
        System.out.println("Your target HR Zone is " + minTargetRate + " - " + maxTargetRate + " beats per minute");
    }
}

