import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
//        System.out.println(getPassword());
//        Testkommentar hinzugefügt

        System.out.println(isPasswordValid(getPassword()));

    }

    public static boolean isPasswordValid(String password) {
        if (hasDigit(password) && (proveLength(password)) && (hasSmallAndUpperLetters(password))) {
            return true;
        } else {
            return false;
        }


    }

    public static String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr neues Passwort ein: ");
        String password = scanner.nextLine();
        return password;

    }

    public static boolean hasDigit(String password) {

        char[] charArr = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(charArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean proveLength(String password) {
        int minLength = 8;
        if (password.length() >= minLength) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasSmallAndUpperLetters(String password) {
        boolean hasSmall = false;
        boolean hasUpper = false;

        char[] charArr = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if(Character.isLowerCase(charArr[i])) {
                hasSmall = true;
            }
            if(Character.isUpperCase(charArr[i])) {
                hasUpper = true;
            }
        }
        return (hasSmall && hasUpper);
    }

    public static boolean checkPasswordQuality(String password) {
        String[] forbiddenWords = {"Password", "Passwort", "geheim"};

        for (int i = 0; i < forbiddenWords.length; i++) {
            if (forbiddenWords[i].equals(password)) {
                return false;
            }
        }
        return true;
    }

}
