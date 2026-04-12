import java.util.Scanner;

public class Quizgame {
    static void main(String [] args){

        String[] questions = {"what is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was facebook launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. Cobol", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("Welcome to the java quiz game!");
        System.out.println("*******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);

            }
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("***********");
                System.out.println("Correct!");
                System.out.println("***********");
                score++;

            }
            else{
                System.out.println("***********");
                System.out.println("Wrong! ");
                System.out.println("***********");

            }

        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);


        // Questions array[]
        // Options[][]
        //declare variables
        //welcome message
        //question (loop)
        //  option
        //  get guess from user
        //  check our guess
        //display final score


        scanner.close();
    }
}
