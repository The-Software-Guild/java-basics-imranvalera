package main.java.BasicAssesment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your dogs name below: ");
        String nameOfDog = scanner.nextLine();

        System.out.println("Well then, I have this highly reliable report on " +  nameOfDog + "'s prestigious background right here.");

        Random random = new Random();
        int randomFirstBreed = random.nextInt(100/4) + 1;
        int randomSecondBreed = random.nextInt(100 - randomFirstBreed) + 1;
        int randomThirdBreed = random.nextInt(100 - randomFirstBreed - randomSecondBreed) + 1;
        int randomFourthBreed = random.nextInt(100- randomFirstBreed -  randomSecondBreed - randomThirdBreed) + 1;
        int randomFinalBreed = 100 - randomFirstBreed -randomSecondBreed - randomThirdBreed -randomFourthBreed;

        System.out.println(randomFirstBreed+"% St. Bernard\n" +
                randomSecondBreed+"% Chihuahua\n" +
                randomThirdBreed+"% Dramatic RedNosed Asian Pug\n" +
                randomFourthBreed+"% Common Cur\n" +
                randomFinalBreed+"% King Doberman\n");
        System.out.println("Wow, that's QUITE the dog!    ");
    }
}
