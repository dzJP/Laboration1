import java.util.*;

public class testss {

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
                    System.out.println("Tryck 1 för Sten.\nTryck 2 för Sax.\nTryck 3 för Påse.");

                    int n = sc.nextInt();
                    String[] userChoice = new String[n];
                    System.out.println();
                    sc.nextLine();

                    String arrayBot;
                    String [] arrayBotChoice = {"Sten", "Sax", "Påse"};
                    Random rand = new Random();

                    arrayBot = arrayBotChoice [rand.nextInt(arrayBotChoice.length)];

                    System.out.println("Botten fick: " + arrayBot);
                    sc.nextLine();





//            Här ska man kunna spela sten sax påse mot datorn. Låt användaren mata in sitt val på något lämpligt
//            sätt och slumpa sedan datorns val. Först till 3 vinster vinner. Mellan varje omgång ska du skriva ut
//            vem som vann omgången eller om det blev oavgjort samt poängställningen just nu.
//            När någon vunnit 3 gånger ska ett gratulationsmeddelande skrivas ut riktat mot vinnaren

                } else if (yourChoice == 4) {
                    System.out.println("Ditt val är: Ordning och reda.");

                } else
                    System.out.println("Ogiltigt val, försök igen.");

            } else if (input.hasNext()) {
                String userInput = input.next();

                if (userInput.equalsIgnoreCase("e")) {
                    run = false;
                }

            }
        }
    }
}
