package main.java.BasicAssesment;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean game = true;
        do {
            int numOfRounds = numOfRounds();


            int numTies = 0;
            int userWins = 0;
            int computerWins = 0;
            for (int i = 0; i < numOfRounds; i++) {
                int playerMove = playerMove();
                int computerMove = computerMove();

                if (playerMove >= 1 || playerMove <= 3) {
                    {
                        String gameResult = gameResult(playerMove, computerMove);

                        switch (gameResult) {
                            case "PLAYER_WIN":
                                userWins++;
                                moveChosen(playerMove, computerMove);
                                System.out.println("You win :) !!!");
                                break;
                            case ("TIE"):
                                numTies++;
                                moveChosen(playerMove, computerMove);
                                System.out.println("Its a TIE :|");
                                break;
                            case "COMPUTER_WIN":
                                computerWins++;
                                moveChosen(playerMove, computerMove);
                                System.out.println("the Computer won :( !!!");
                                break;
                        }
                        System.out.println("Number of Ties so far: " + numTies + "\nNumber of rounds the computer has won:  " + computerWins + " \nNumber of rounds you have won: " + userWins);
                    }
                }
            }
            gameWinner(userWins, computerWins);
            do {
                System.out.println("Play again? Please enter Yes or No.");
                String userInput = scanner.next();
                if (userInput.equalsIgnoreCase("yes")) {
                    break;
                } else if (userInput.equalsIgnoreCase("no")) {
                    game = false;
                    System.out.println("Thanks for playing! GoodBye.");
                    break;
                } else {
                    System.out.println("Try again, the input you have entered is invalid");
                }
            } while (true);


        } while (game);
    }
    public static int numOfRounds(){
        int numOfRounds;
        Scanner scanner = new Scanner(System.in);
        do {
            try {

                System.out.println("How many rounds would you like to play from 1 to 10? ");
                int Rounds = scanner.nextInt();
                if (Rounds <= 0 || Rounds > 10) {
                    System.out.println("Only enter between 1 to 10 rounds! Try again: ");
                } else {
                    numOfRounds = Rounds;
                    break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Try again, only enter an int! ");
                scanner.nextLine();

            }
        }while (true);
        return numOfRounds;
    }
    public static int playerMove() {
        Scanner playerMoveScanner = new Scanner(System.in);
        int playerMove;
        do {
            try {

                System.out.println("Pick a number below that corresponds to the move you want to take! \n");
                System.out.println("1) Rock \n" + "2) Paper \n" + "3) Scissors");
                int Move = playerMoveScanner.nextInt();

                if (Move <= 0 || Move > 3) {
                    System.out.println("Please enter either option 1, 2, 3: Try again! ");
                }

                else {
                    playerMove = Move; //erase prev num entered
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Try again, only enter an int! ");
                playerMoveScanner.nextLine();
            }


        }while (true);
        return playerMove;

    }

    public static int computerMove(){
        Random randomMove = new Random();
        return randomMove.nextInt(3) + 1;
    }

    public static String moveNameToString(int gameMove){
        switch(gameMove){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return  "Scissors";
            default:
                return"Restart Program! something isnt working correctly";
        }
    }

    public static void moveChosen(int playerMove, int computerMove){
        System.out.println("The computer has chosen to play: " + moveNameToString(computerMove) +"\n" + "You have chosen to play: " + moveNameToString(playerMove));
    }

    public static String gameResult(int playerMove, int computerMove){
        if(playerMove == 1 && playerMove == 3){
            return ("PLAYER_WIN");
        }
        else if (playerMove == 2 && computerMove == 1){
            return ("PLAYER_WIN");
        }
        else if(playerMove == computerMove){
            return ("TIE");
        }
        else if(playerMove == 3 && computerMove == 2){
            return ("PLAYER_WIN");
        }

        else{
            return ("COMPUTER_WIN");
        }

    }

    public static void gameWinner(int userWins, int computerWins){
        if(userWins > computerWins){
            System.out.println("\nYou have won the game! Congratulations");
        }
        else if(computerWins > userWins){
            System.out.println("\nThe computer has won the game! Better luck next time. ");
        }
        else{
            System.out.println("\nThe game has ended with a TIE :|");
        }
    }
}
