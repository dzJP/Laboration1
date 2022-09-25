package Section5ControlFlowStatements.src;

import java.util.*;

public class Labb1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner end = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("""
                    1. Upp och ner. 
                    2. Min Max
                    3. Sten Sax Påse
                    4. Ordning och reda
                    e. Avsluta. """);

            int yourChoice = 0;

            if (input.hasNextInt()) {
                yourChoice = input.nextInt();


                if (yourChoice == 1) {


                    System.out.println("Ditt val är Upp och ner. \nHur många namn vill du lägga till? ");
                    int n = sc.nextInt();
                    System.out.println("Lägg till " + n + " namn. \nTryck på Enter mellan varje inmatning eller" +
                            " skriv end för att avbryta programmet.");
                    sc.nextLine();

                    String[] names = new String[n]; // datatyp array av namnet namn som sparar input i en variabel
                    // store names in an array

                    for (int i = names.length - 1; i >= 0; i--) {
                        names[i] = sc.nextLine();
                    }
                    System.out.println(Arrays.toString(names));

                }

                if (yourChoice == 2) {
                    System.out.println("Ditt val är Min Max.");


                    double max = 0;
                    double min = Double.MAX_VALUE;
                    Scanner inputNumber = new Scanner(System.in);
                    double[] numbers = new double[5];

                    System.out.println("Lägg till tal.");

                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = input.nextDouble();
                    }

                    for (int i = 0; i < 5; i++) {

                        double number = numbers[i];
                        //Add the number to the total


                        //If this is the highest number we've encountered, set as the max.
                        if (max < number) {
                            max = number;
                        }
                        //If this is the lowest number we've encountered, set as min.
                        if (min > number) {
                            min = number;
                        }
                    }

                    System.out.println("Högsta tal är: " + max);
                    System.out.println("Minsta tal är: " + min);
                }

                if (yourChoice == 3) {

                    System.out.println("Ditt val är: Sten Sax Påse.");
                    Scanner in = new Scanner(System.in);

                    //Use a while(true) loop and only break the loop if the user wants to quit
                    while (true) {

                        //Get the user's move through user input
                        System.out.print("Skriv sten, sax, påse eller skriv quit för att avsluta programmet.");
                        String myInput = in.nextLine();

                        //Check if the user wants to quit the game
                        if (myInput.equalsIgnoreCase("quit")) {
                            break;
                        }

                        //Check if the user's move is valid (rock, paper, or scissors = false)
                        if (!myInput.equals("sten") && !myInput.equals("paper") && !myInput.equals("sax")) {

                            System.out.println("Your move isn't valid!");

                        } else {

                            //Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
                            int randomNumber = (int) (Math.random() * 3);

                            //Convert the random number to a string using conditionals and print the opponent's move
                            String botChoice = "";
                            if (randomNumber == 0) {
                                botChoice = "sten";
                            } else if (randomNumber == 1) {
                                botChoice = "påse";
                            } else {
                                botChoice = "sax";
                            }
                            System.out.println("Bottens drag: " + botChoice);

                            //Print the results of the game: tie, lose, win
                            if (myInput.equalsIgnoreCase(botChoice)) {
                                System.out.println("Oavgjort.");
                            } else if ((myInput.equals("sten") && botChoice.equals("sax")) ||
                                    (myInput.equals("sax") && botChoice.equals("påse")) ||
                                    (myInput.equals("påse") && botChoice.equals("sten"))) {
                                System.out.println("Du vann!");
                            } else {
                                System.out.println("Du förlorade!");
                            }
                        }
                    }
                }


                if (yourChoice == 4) {
                    int[] numbers;
                    while (true) {

                        int max = 0;
                        int min = Integer.MAX_VALUE;
                        numbers = new int[5];

                        System.out.println("Lägg till tal.");

                        for (int i = 0; i < numbers.length; i++) {
                            numbers[i] = input.nextInt();
                        }

                        for (int i = 0; i < 5; i++) {

                            int number = numbers[i];
                            //Add the number to the total


                            //If this is the highest number we've encountered, set as the max.
                            if (max < number) {
                                max = number;
                            }
                            //If this is the lowest number we've encountered, set as min.
                            if (min > number) {
                                min = number;
                            }

                        }

                        System.out.println(Arrays.toString(numbers).replaceAll("[\\[|,\\]]", ""));
                        System.out.print("Störst:" + max);
                        System.out.print("\nMinst:" + min);
                        System.out.println("\nNäst minst:" + numbers[3]);
                        System.out.println("Näst störst:" + numbers[1]);

                    }
                }
            }
        }
    }
}

