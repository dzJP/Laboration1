package Section5ControlFlowStatements.src;

import java.util.*;

public class Labb1 {

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("""
                    1. Upp och ner. 
                    2. Min Max.
                    3. Sten Sax Påse.
                    4. Ordning och reda.
                    e. Avsluta. """);

            Scanner end = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);

            int yourChoice = 0;


            if (input.hasNextInt()) {
                yourChoice = input.nextInt();

                if (yourChoice == 1) { // if choice 1, continue loop

                    Scanner userExit = new Scanner(System.in);


                    System.out.println("Val 1: Upp och ner. \nLägg till namn och tryck på Enter efter varje " +
                            "inmatning. ");
                    String[] names = new String[3];
                    for (int i = 0; i < names.length; i++) {
                        names[i] = input.next(); // add user input to array
                    }
                    System.out.println("Tryck på Enter för att fortsätta eller skriv end för att avsluta.");
                    // choice
                    String userInput = end.nextLine();
                    if (userInput.equalsIgnoreCase("end")) {
                        System.out.println("Avslutar programmet..");
                        System.exit(0);
                    }  // if "end" exists system else prints out array.

                    System.out.println(names[2] + " " + names[1] + " " + names[0]);
                }


                if (yourChoice == 2) { // if choice 2,continue loop
                    System.out.println("Val 2: Min Max.");


                    double max = 0;
                    double min = Double.MAX_VALUE;
                    Scanner inputNumber = new Scanner(System.in);
                    double[] numbers = new double[5]; //  array with 5 positions

                    System.out.println("Lägg till tal.");

                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = input.nextDouble();
                    }

                    for (int i = 0; i < 5; i++) {

                        double number = numbers[i];
                        // add number to total


                        // if this is the highest number we've encountered, set as the max.
                        if (max < number) {
                            max = number;
                        }
                        // if this is the smallest number we've encountered, set as the min.
                        if (min > number) {
                            min = number;
                        }
                    }

                    System.out.println("Högsta tal är: " + max);
                    System.out.println("Minsta tal är: " + min);
                }

                if (yourChoice == 3) { // if choice 3, continue loop

                    System.out.println("\nVal 3: Sten, Sax, Påse.");
                    Scanner in = new Scanner(System.in);
                    int playerScore = 0;
                    int botScore = 0;

                    // while(true) loop and only breaks the loop if the user wants to quit
                    while (true) {

                        // get the user's move through user input
                        System.out.println("\nSkriv sten, sax, påse eller skriv end för att avsluta programmet.");
                        String myInput = in.nextLine();

                        // check if the user wants to quit the game
                        if (myInput.equalsIgnoreCase("end")) {
                            break;
                        }

                        // check if the user's move is valid (rock, paper, or scissors = false)
                        if (!myInput.equals("sten") && !myInput.equals("påse") && !myInput.equals("sax")) {

                            System.out.println("Felaktigt drag!");

                        } else {

                            // get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
                            int randomNumber = (int) (Math.random() * 3);

                            // convert the random number to a string using conditionals and print the opponent's move
                            String botChoice = "";
                            if (randomNumber == 0) {
                                botChoice = "sten";
                            } else if (randomNumber == 1) {
                                botChoice = "påse";
                            } else {
                                botChoice = "sax";
                            }
                            System.out.println("\nDatorns drag: " + botChoice);

                            // print the results of the game: tie, lose, win
                            if (myInput.equalsIgnoreCase(botChoice)) {
                                System.out.println("Oavgjort.");
                                System.out.println("Du har: " + playerScore + " poäng. " + "\nDatorn har: " + botScore + " poäng.");

                            } else if ((myInput.equals("sten") && botChoice.equals("sax")) ||
                                    (myInput.equals("sax") && botChoice.equals("påse")) ||
                                    (myInput.equals("påse") && botChoice.equals("sten"))) {
                                System.out.println("Du vann!");
                                playerScore = playerScore + 1;
                                System.out.println("Du har: " + playerScore + " poäng." + "\nDatorn har: " + botScore + " poäng.");

                            } else {
                                System.out.println("Du förlorade omgången!");
                                botScore = botScore + 1;
                                System.out.println("Du har: " + playerScore + " poäng." + "\nDatorn har: " + botScore + " poäng.");

                            }
                            if (playerScore == 3) {
                                System.out.println("\n******************" + "\nGrattis! Du vann!" + "\n******************\n");
                                break;
                            }
                            if (botScore == 3) {
                                System.out.println("\n******************" + "\nDu förlorade! =(" + "\n******************\n");
                                break;
                            }
                        }
                    }
                }

                if (yourChoice == 4) { // if choice 4, continue loop

                    int[] numbers;
                    int sum = 0;
                    int max = 0;
                    int min = Integer.MAX_VALUE;
                    numbers = new int[5];

                    System.out.println("Val 4: Lägg till tal.");

                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = input.nextInt();
                        sum = sum + numbers[i];
                    }

                    for (int i = 0; i < 5; i++) {
                        int number = numbers[i];
                        // add the number to the total


                        // if this is the highest number we've encountered, set as the max.
                        if (max < number) {
                            max = number;
                        }
                        // if this is the lowest number we've encountered, set as min.
                        if (min > number) {
                            min = number;
                        }
                    }

                    System.out.print(Arrays.toString(numbers).replaceAll("[\\[|,\\]]", ""));
                    System.out.print("\nStörst:" + max);
                    System.out.print("\nMinst:" + min);
                    System.out.print("\nNäst minst:" + numbers[3]);
                    System.out.print("\nNäst störst:" + numbers[1]);

                    System.out.print("\nSumma " + sum);
                    Arrays.sort(numbers);
                    if (numbers == numbers) {
                        System.out.print("\ntrue"); // true
                    } else {
                        System.out.print("\nfalse"); // false
                    }

                    System.out.println("\nTryck på Enter för att börja om.");
                    sc.nextLine();
                }

            } else {
                System.out.println("Programmet avslutas.."); // in all other circumstances, exit system.
                System.exit(0);
            }
        }
    }
}
