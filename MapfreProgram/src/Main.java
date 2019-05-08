import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

//Ben Anderson
//Mapfre Test ff

public class Main {
    public static void main(String[] args) {
        //creates a Linked List that accepts values of type integer
        Queue<Integer> value = new LinkedList<>();
        //Creates two scanner objects for inputs from the user
        //Then asks the user to enter a number for what they want to do
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 if you would like to add a value to the Queue or 2 to remove a value from the Queue");
        //int answer = input.nextInt();

        //A for loop that receives the input from the user
        //If a certain number is selected it will do a certain action to the Queue
        for (int i = 0; i <= 10; i++) {
            //Makes sure the input is an int
            while (!input.hasNextInt())
            {
                input.next();
                System.out.println("Please enter a valid integer: Enter 1 to add to the Queue or 2 to remove a value from the Queue");
            }

            int answer = input.nextInt();
                if (answer == 1) {
                    //Made a couple of if statements for certain scenarios that might occur
                    //adds a value to the Queue from user input and then asks if they would like to proceed
                    if (i <= 9) {
                        System.out.println("Please enter an integer to add to the Queue");
                        value.add(scan.nextInt());
                        System.out.println(value);
                        System.out.println("Would you like to add or remove another value from the Queue? Enter 1 to add, Enter 2 to remove or Enter 3 to end");


                    } else if (i == 10) {
                        System.out.println("Sorry. The Queue is currently full, Please try again later when a value has been removed from the Queue");
                        System.out.println("Enter 2 if you would like to remove a value from the Queue or 3 if you want to end");
                        i--;
                    }
                }
                //More if statements for certain scenarios
                //Removes a value from the Queue in FIFO order
                //Tells the user the value that was removed
                else if (answer == 2) {
                    if (i <= 0) {
                        System.out.println("There is nothing in the Queue right now, please enter 1 to add a value to the Queue");
                        i--;
                    } else {
                        System.out.println("You're removing the latest value you added");
                        int t = value.remove();
                        System.out.println("The value you removed was " + t);
                        i = i - 2;
                        System.out.println("This is your updated Queue" + value);
                        System.out.println("Would you like to add or remove another value from the Queue? Press 1 to add, Press 2 to remove, Press 3 to end");

                    }
                }
                //Ends the Queue and provides the User with the Queue they have made
                else if (answer == 3) {
                    System.out.println("This is your Queue" + value);
                    break;
                }
                //If the user doesn't enter the numbers they should
                //They are prompted to enter a valid number
                else {
                    System.out.println("Please enter a valid number to continue: 1 to add to the Queue, 2 to remove from the Queue");
                    i--;
                }
        }
    }
}
