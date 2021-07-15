import java.util.Scanner;

class SocSecException extends Exception {
    public SocSecException(String error) {
        super("Invalid social security number, " + error);
    }
}

public class SocSecProcessor {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean continueRun = true;
        while (continueRun) {
            System.out.print("Name?   ");
            String name = in.nextLine();
            System.out.print("SSN?    ");
            String ssn = in.nextLine();
            try {
                if (SocSecProcessor.isValid(ssn))
                    System.out.printf("%s %s is valid\n", name, ssn);
            } catch(SocSecException e) {
                System.err.println(e.getMessage());
            }
            System.out.print("Continue? ");
            String continueString = in.nextLine();
            if (continueString.length() > 0 && continueString.toLowerCase().charAt(0) == 'y')
                continueRun = true;
            else
                continueRun = false;
        }
    }

    public static boolean isValid(String ssn) throws SocSecException {
        if (ssn.length() != 11) {
            throw new SocSecException("wrong number of characters");
        }
        for (int i = 0; i < ssn.length(); i++) {
            char ch = ssn.charAt(i);
            if (i == 3 || i == 6) {
                if (ch != '-') {
                    throw new SocSecException("dashes at wrong positions");
                }
            }
            if (!Character.isDigit(ch) && ch != '-') {
                throw new SocSecException("contains a character that is not a digit");
            }
        }
        return true;
    }
}