package Section5ControlFlowStatements.src;

import java.io.IOException;
import java.util.*;

    public class Labb1 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            Scanner end = new Scanner(System.in);


            boolean run = true; // gör att koden loopas
            while (run) {       // allt mellan "3brackets" -> {}, kommer att loopas.



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


                        System.out.println("Ditt val är: Upp och ner. \nHur många namn vill du lägga till? ");
                        int n = sc.nextInt();
                        System.out.println("Lägg till " + n + " namn. \nTryck på Enter mellan varje inmatning eller" +
                                " skriv end för att avbryta programmet.");
                        sc.nextLine();
                        String[] names = new String[n]; // datatyp array av namnet namn som sparar input i en variabel
                        // store names in an array

                        for (int i = names.length -1; i >= 0; i--) {
                            names[i] = sc.nextLine();
                        }
                        System.out.println(Arrays.toString(names));
                        sc.close();


                    } else if (yourChoice == 2) {
                        System.out.println("Ditt val är: Min Max.");
                        int n, max;
                        Scanner s = new Scanner(System.in);

                        System.out.print("Hur många tal vill du lägga till?");

                        n = s.nextInt();
                        int a[] = new int[n];

                        System.out.println("Lägg till dina tal");

                        for(int i = 0; i < n; i++)
                        {
                            a[i] = s.nextInt();
                        }
                        max = a[0];
                        for(int i = 0; i < n; i++)
                        {
                            if(max < a[i])
                            {
                                max = a[i];
                            }
                        }
                        System.out.println("Talet med högsta värde är: 2" + +max);

                    } else if (yourChoice == 3) {
                        System.out.println("Ditt val är: Sten Sax Påse.");

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


