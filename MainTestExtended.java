import java.util.ArrayList;
import java.util.Scanner;

public class MainTestExtended {

    public static void main(String[] args) {

        //Setting up the variables
        String actorName; // actor name
        String address; // actor address
        int age; // age
        ArrayList<ActorExtended> actorList = new ArrayList<>(); // new array list of actors


        Scanner scan = new Scanner(System.in);
        //nested DO-While loops
        do { //Do-While loop with condition
            System.out.println("Please enter actor name");
            actorName = scan.nextLine();
            System.out.println("Please enter actor address");
            address = scan.nextLine();
            System.out.print("Please enter the age of the actor");
            age = scan.nextInt();

            ArrayList<Film> filmList = new ArrayList<>(); // Each actor has new array of movies assigned
            System.out.println("Would you like to add a movie?");
            
            while (toggleYN(scan).equals("Y")) {
                System.out.println("Enter movie name: ");
                Film newMovie = new Film(scan.nextLine());
                filmList.add(newMovie);

                System.out.println("Would you like to add another movie? Y/N");
            }
            ActorExtended newActor = new ActorExtended(actorName, address, age, filmList); // creating and actor object
            actorList.add(newActor); // adding an object to the array

            System.out.println("Would you like to add another actor? Y/N");
        } while (toggleYN(scan).equals("Y"));

        for (int x = 0; x < actorList.size(); x++) {  //printing actor details
            actorList.get(x).print();
        }

        System.out.print("all good");
    }
    
    
    
    
    // input validation
    public static String toggleYN(Scanner scan) {
        String check;
        boolean test;
        do {
            check = scan.nextLine().toUpperCase();
            if (check.equals("Y") || check.equals("N")) {
                return check;
            }
            System.out.println("Please enter Y or N");
            test = false;
        } while (test == false);

        return check;
    }


}
