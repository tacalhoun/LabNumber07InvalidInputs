import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by TACasey-Calhoun on 7/18/2017.
 */
public class LabNumber7 {
    public static void main(String[] args) {
        int studentNumber = 0;
        String userWants;
        String answer = "y";

        Scanner scan = new Scanner(System.in);

        String[] classNames = {"Mo", "Tresa", "David", "Marc", "Delwar", "Shay", "Tomas",
                "Nicholas", "Jonathon", "Gagan", "Gabby", "Katie", "Tracey",
                "Jeanette", "Kobe", "Trinity", "Savion", "Santana", "Allie", "Peter"};
        String[] highSchool = {"Mass", "TechTown", "Davison", "Mumford", "Detroit", "Southern", "Technical",
                "Northend", "Jonathong", "Great Lakes", "Gunther", "Katherine", "Trenchtown",
                "Journey", "King", "Truth", "Southfield", "St. Mary", "AllStar", "Public"};
        String[] favColor = {"mauve", "taupe", "dark brown", "maroon", "dark blue", "saffron", "tan",
                "navajo white", "juniper", "green", "gray", "khaki", "tangerine",
                "jasper", "key lime pie", "tangelo", "scarlet", "sea green", "apple", "pumpkin"};

        System.out.println("Welcome to TechHire 2017");
        do {
            try {
                System.out.println("Please enter a student number to learn more (1-20): ");
                studentNumber = scan.nextInt();
                scan.nextLine();

                System.out.println("Your student is: " + classNames[studentNumber - 1]);
                System.out.println("What would you like to learn about us? Enter 'high school' or 'favorite color': ");
                userWants = scan.nextLine();

                if (userWants.contains("school")) {
                    System.out.println("Your student attended " + highSchool[studentNumber - 1] + " high school.");
                } else if (userWants.contains("color")) {
                    System.out.println("Your student's favorite color is  " + favColor[studentNumber - 1]);
                }

                System.out.println("Would you like to learn more about another student? Y/N? ");
                answer = scan.nextLine();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You did not enter a valid student number. ");
            } catch (InputMismatchException ex) {
                //   System.out.println("You did not enter a valid information. ");
                   scan.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("not valid. ");

            }
            while (answer.equalsIgnoreCase("y")) ;
        }
    }
}