package addressBook;
import java.util.Scanner;

public class addressBook {
    public static void main(String[] args) throws Exception { 


        String menuChoice;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to Team 2's Address Book.");

        //Another testing
        do {

            menuChoice = userInput(scnr);

            if ((!menuChoice.equals("X") && !menuChoice.equals("C") && !menuChoice.equals("R") && !menuChoice.equals("U") && !menuChoice.equals("D"))) {
                System.out.println("\nError: Please select an option from the menu\n");
            } else if (menuChoice.equals("X")) {
                break;
            } else if (menuChoice.equals("C") || menuChoice.equals("R") || menuChoice.equals("U") || menuChoice.equals("D")) {
switch (menuChoice) {
                    case "C":
                        System.out.println("\n C test \n");
                        break;
                    case "R":
                        System.out.println("\n R test \n");
                        break;
                    case "U":
                        System.out.println("\n U test \n");
                        break;
                    case "D":
                        System.out.println("\n D test \n");
                        break;
                }
            }
        } while (!menuChoice.equals("X"));

        System.out.println("\nGood-bye");
        }


        public static String userInput(Scanner scnr) {

            String menuChoice;

            System.out.println("Please select an option from the menu below:");
            System.out.println("(C)reate");
            System.out.println("(R)etrieve");
            System.out.println("(U)pdate");
            System.out.println("(D)elete");
            System.out.println("E(X)it");
            System.out.print("Choice: ");

            menuChoice = scnr.nextLine();
            menuChoice = menuChoice.toUpperCase();

            return menuChoice;

     }

}
/* 
public class Person {


    private String Id;
    private String Name;
    private String Address;
    private String Email;
    private int Phone;

    public Person() { 
        setId("Faculty");
    }

    public Person() { 
        setName("Bob Smith");
    }

    public Person() { 
        setAddress("122 Main St");
    }

    public Person() { 
        setEmail("bsmith122@gmail.com");
    }

    public Person() { 
        setPhone("5328754538");
    }



}
*/
