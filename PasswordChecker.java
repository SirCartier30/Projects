import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();
        input.close();
        int score = checkPasswordStrength(password);
        switch(score) {
            case 1:
                System.out.println("Weak password");
                break;
            case 2:
                System.out.println("Medium password");
                break;
            case 3:
                System.out.println("Strong password");
                break;
            default:
                System.out.println("Invalid password");
                break;
        }
    }

    public static int checkPasswordStrength(String password) {
        int score = 0;
        if (password.length() < 8) {
            score = 1;
        } else if (password.matches("[a-zA-Z]+")) {
            score = 1;
        } else if (password.matches("[a-zA-Z0-9]+")) {
            score = 2;
        } else {
            score = 3;
        }
        return score;
    }

}
