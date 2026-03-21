import java.util.Scanner;
public class task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(checkDigits(s));
    }
    public static String checkDigits(String s) {//task 8
        if (s.length() == 0) {
            return "Yes";
        }
        if (!Character.isDigit(s.charAt(0))) {
            return "No";
        }
        return checkDigits(s.substring(1));
    }
}
