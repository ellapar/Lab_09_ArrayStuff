import java.util.Scanner;
public class SafeInput {
    /**
     * Prompts the user for a non-zero length string input.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the prompt message for the user
     * @return a non-zero length string response
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine().trim(); // Read user input and remove leading/trailing spaces
        } while (retString.isEmpty());

        return retString;
    }

    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = getNonZeroLenString(scanner, "Enter your name");
        System.out.println("Hello, " + userName + "!");
        scanner.close();
        return 0;
    }

    public static int getRangedInt(Scanner scanner, String s, int i, int i1) {
    return 0;}
}
