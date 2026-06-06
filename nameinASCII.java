import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class project {
    public static void main(String[] args) {
        String A = "    _    \r\n" + 
                        "   / \\   \r\n" + 
                        "  / _ \\  \r\n" + 
                        " / ___ \\ \r\n" + 
                        "/_/   \\_\\";
        String B = " ____  \r\n" + 
                        "| __ ) \r\n" + 
                        "|  _ \\ \r\n" + 
                        "| |_) |\r\n" + 
                        "|____/ ";
        String C = "  ____ \r\n" + 
                        " / ___|\r\n" + 
                        "| |    \r\n" + 
                        "| |___ \r\n" + 
                        " \\____|";
        String D = " ____  \r\n" + 
                        "|  _ \\ \r\n" + 
                        "| | | |\r\n" + 
                        "| |_| |\r\n" + 
                        "|____/ ";
        String E = " _____ \r\n" + 
                        "| ____|\r\n" + 
                        "|  _|  \r\n" + 
                        "| |___ \r\n" + 
                        "|_____|";
        String F = " _____ \r\n" + 
                        "|  ___|\r\n" + 
                        "| |_   \r\n" + 
                        "|  _|  \r\n" + 
                        "|_|    ";
        String G = "  ____ \r\n" + 
                        " / ___|\r\n" + 
                        "| |  _ \r\n" + 
                        "| |_| |\r\n" + 
                        " \\____|";
        String H = " _   _ \r\n" + 
                        "| | | |\r\n" + 
                        "| |_| |\r\n" + 
                        "|  _  |\r\n" + 
                        "|_| |_|";
        String I = " ___ \r\n" + 
                        "|_ _|\r\n" + 
                        " | | \r\n" + 
                        " | | \r\n" + 
                        "|___|";
        String J = "     _ \r\n" + 
                        "    | |\r\n" + 
                        " _  | |\r\n" + 
                        "| |_| |\r\n" + 
                        " \\___/ ";
        String K = " _  __\r\n" + 
                        "| |/ /\r\n" + 
                        "| ' / \r\n" + 
                        "| . \\ \r\n" + 
                        "|_|\\_\\";
        String L = " _     \r\n" + 
                        "| |    \r\n" + 
                        "| |    \r\n" + 
                        "| |___ \r\n" + 
                        "|_____|";
        String M = " __  __ \r\n" + 
                        "|  \\/  |\r\n" + 
                        "| |\\/| |\r\n" + 
                        "| |  | |\r\n" + 
                        "|_|  |_|";
        String N = " _   _ \r\n" + 
                        "| \\ | |\r\n" + 
                        "|  \\| |\r\n" + 
                        "| |\\  |\r\n" + 
                        "|_| \\_|";
        String O = "  ___  \r\n" + 
                        " / _ \\ \r\n" + 
                        "| | | |\r\n" + 
                        "| |_| |\r\n" + 
                        " \\___/ ";
        String P = " ____  \r\n" + 
                        "|  _ \\ \r\n" + 
                        "| |_) |\r\n" + 
                        "|  __/ \r\n" + 
                        "|_|    ";
        String Q = "  ___  \r\n" + 
                        " / _ \\ \r\n" + 
                        "| | | |\r\n" + 
                        "| |_| |\r\n" + 
                        " \\__\\_\\";
        String R = " ____  \r\n" + 
                        "|  _ \\ \r\n" + 
                        "| |_) |\r\n" + 
                        "|  _ < \r\n" + 
                        "|_| \\_\\";
        String S = " ____  \r\n" + 
                        "/ ___| \r\n" + 
                        "\\___ \\ \r\n" + 
                        " ___) |\r\n" + 
                        "|____/ ";
        String T = " _____ \r\n" + 
                        "|_   _|\r\n" + 
                        "  | |  \r\n" + 
                        "  | |  \r\n" + 
                        "  |_|  ";
        String U = " _   _ \r\n" + 
                        "| | | |\r\n" + 
                        "| | | |\r\n" + 
                        "| |_| |\r\n" + 
                        " \\___/ ";
        String V = "__     __\r\n" + 
                        "\\ \\   / /\r\n" + 
                        " \\ \\ / / \r\n" + 
                        "  \\ V /  \r\n" + 
                        "   \\_/   ";
        String W = "__        __\r\n" + 
                        "\\ \\      / /\r\n" + 
                        " \\ \\ /\\ / / \r\n" + 
                        "  \\ V  V /  \r\n" + 
                        "   \\_/\\_/   ";
        String X = "__  __\r\n" + 
                        "\\ \\/ /\r\n" + 
                        " \\  / \r\n" + 
                        " /  \\ \r\n" + 
                        "/_/\\_\\";
        String Y = "__   __\r\n" + 
                        "\\ \\ / /\r\n" + 
                        " \\ V / \r\n" + 
                        "  | |  \r\n" + 
                        "  |_|  ";
        String Z = " _____\r\n" + 
                        "|__  /\r\n" + 
                        "  / / \r\n" + 
                        " / /_ \r\n" + 
                        "/____|";

        List<String> Alphabet = new ArrayList<>(); // Create a list to store the ASCII art representations of the letters
        Alphabet.add(A);
        Alphabet.add(B);
        Alphabet.add(C);
        Alphabet.add(D);
        Alphabet.add(E);
        Alphabet.add(F);
        Alphabet.add(G);
        Alphabet.add(H);
        Alphabet.add(I);
        Alphabet.add(J);
        Alphabet.add(K);
        Alphabet.add(L);
        Alphabet.add(M);
        Alphabet.add(N);
        Alphabet.add(O);
        Alphabet.add(P);
        Alphabet.add(Q);
        Alphabet.add(R);
        Alphabet.add(S);
        Alphabet.add(T);
        Alphabet.add(U);
        Alphabet.add(V);
        Alphabet.add(W);
        Alphabet.add(X);
        Alphabet.add(Y);
        Alphabet.add(Z);

        String heart = "  ***   ***\r\n" +
                        " ***** *****\r\n" +
                        "*************\r\n" +
                        " ***********\r\n" +
                        "  *********\r\n" +
                        "   *******\r\n" +
                        "    *****\r\n" +
                        "     ***\r\n" +
                        "      *";

        Scanner Sc = new Scanner(System.in); // Create a Scanner object to read user input
        System.out.println("Enter your name(ALL CAPS):"); // Prompt the user to enter their name in all capital letters
        String name = Sc.nextLine(); // Read the user's input and store it in the variable 'name'
        for (int row = 0; row < 5; row++) { // Loop through each row of the ASCII art letters (there are 5 rows in each letter)
            for (int index = 0; index < name.length(); index++) { // Loop through each character in the user's name
                char character = name.charAt(index); // Get the current character from the user's name
                for (int i = 0; i < Alphabet.size(); i++) { // Loop through the list of ASCII art letters
                    if (character == (char)('A' + i)) { // Check if the current character matches the letter at index 'i' in the alphabet (e.g., 'A' + 0 = 'A', 'A' + 1 = 'B', etc.)
                        String[] lines = Alphabet.get(i).split("\r\n"); // Split the ASCII art representation of the letter into lines
                        System.out.print(lines[row] + "  ");// Print the current row of the ASCII art letter followed by two spaces for separation
                    }
                }
            }
            System.out.println(); // After printing all the letters for the current row, move to the next line before printing the next row of letters
        } // Basically what this code does, since each letter has 5 rows of characters, it prints the characters in rows for all the letters in the user's name. It starts at row 0 and prints the first row of characters for all the letters, then moves to row 1 and prints the second row of all the letters, and so on until it has printed all 5 rows for each letter in the user's name.
        if (name.equals("AAMNA")){
            String[] lines = heart.split("\r\n"); // Split the heart ASCII art into lines // If the user's name is "AAMNA", print the heart ASCII art after printing the letters of the name
            for (int Row = 0; Row < 9; Row++) { // Loop through each row of the heart ASCII art (there are 9 rows in the heart)
                System.out.print(lines[Row]); // Print the current row of the heart ASCII art and move to the next line
                System.out.println(); // After printing all the letters for the current row, move to the next line before printing the next row of letters
            }
        }// If the user's name is not "AAMNA", the program will simply end after printing the letters of the name without printing the heart ASCII art
    }
}
