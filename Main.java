import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        rockPaperScissorsAgainstSuperiorAI();
    }

    private static void rockPaperScissorsAgainstSuperiorAI() {
        int userScore = 0;
        int AIScore = 0;
        boolean game  = true;

        while (game) {

            System.out.println("\nThe AI has already decided on it's move. \nPick your move by typing out your choice from these " +
                    "available ones: ROCK, PAPER, SCISSORS or END to end game:");

            String userInput = scanner.next().toUpperCase();
            String superiorAI;

            switch (userInput) {

                case "ROCK":
                    superiorAI = "PAPER";
                    System.out.println("You lose, the AI chose: " + superiorAI);
                    AIScore++;
                    System.out.println("Score: \nAI: " + AIScore + "\nYour score: " + userScore);
                    break;

                case "PAPER":
                    superiorAI = "SCISSORS";
                    System.out.println("You lose, the AI chose: " + superiorAI);
                    AIScore++;
                    System.out.println("Score: \nAI: " + AIScore + "\nYour score: " + userScore);
                    break;

                case "SCISSORS":
                    superiorAI = "ROCK";
                    System.out.println("You lose, the Superior AI chose: " + superiorAI);
                    AIScore++;
                    System.out.println("Score: \nAI: " + AIScore + "\nYour score: " + userScore);
                    break;

                case "END":
                    System.out.println("You have quit the game.");
                    game = false;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
            
            if (AIScore == 3) {
                System.out.println("\nYou really are bad at this game");
            }

            if(AIScore == 5) {
                System.out.println("\nJust give up and quit. You are fighting against a superior AI.");
            }

            if(AIScore == 7) {
                System.out.println("\nYou know what? The AI decided to give you one point just out of pity");
                userScore++;
                System.out.println("Score: \nAI: " + AIScore + "\nYour score: " + userScore);
            }
        }
    }
}
