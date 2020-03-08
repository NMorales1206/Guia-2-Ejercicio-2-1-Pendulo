import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        boolean exit = false;
        String choice;
        System.out.println();
        System.out.println("#################################");
        System.out.println("Welcome to the EAN Guide 3 Act. 1");
        System.out.println("#################################");
        System.out.println("------------Pendulum-------------");
        System.out.println();
        do {
            System.out.println("Please add the pendulum's length.");
                if (input.hasNextDouble()) {
                    double length = input.nextDouble();
                    do {
                        input.nextLine();
                        System.out.println("Do you wish to add the gravitational acceleration? " +
                                "(By default the system will use 9.8m/s)");
                        choice = input.nextLine().toLowerCase();
                        if (choice.equals("yes")) {
                            do {
                                System.out.println("Please add the gravitational acceleration");
                                if (input.hasNextDouble()) {
                                    double gAcceleration = input.nextDouble();
                                    Pendulum newPendulum = new Pendulum(length, gAcceleration);
                                    System.out.println("The period of the pendulum with length " + length +
                                            " and gravitational acceleration of " + gAcceleration + "m/s is:" +
                                            newPendulum.oscPeriod());
                                    System.out.println();
                                    Thread.sleep(1500);
                                    break;
                                } else {
                                    System.out.println("ERROR: Please enter numbers");
                                    Thread.sleep(1500);
                                }
                            } while (true);
                            input.nextLine();
                            break;
                        } else if (choice.equals("no")) {
                            Pendulum newPendulum = new Pendulum(length);
                            System.out.println("The period of the pendulum with length " + length +
                                    " and gravitational acceleration of 9.8m/s is:" +
                                    newPendulum.oscPeriod());
                            System.out.println();
                            Thread.sleep(1500);
                            break;
                        } else {
                            System.out.println("Please only use the word Yes or No.");
                            Thread.sleep(1500);
                        }
                    } while(true);
                } else {
                    System.out.println("ERROR: Please use numbers");
                }
            do {
                System.out.println("Do you wish to try again?");
                choice = input.nextLine().toLowerCase();
                if(choice.equals("yes")) {
                    Thread.sleep(1500);
                    break;
                } else if (choice.equals("no")) {
                    exit = true;
                    break;
                } else {
                    System.out.println("ERROR: Please use yes or no.");
                    Thread.sleep(1500);
                }
            } while(true);
        } while (!exit);
        System.out.println("Exiting app.");
    }
}