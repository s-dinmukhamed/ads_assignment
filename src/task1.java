import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        DigitsOfNumber(x);

    }
    public static void DigitsOfNumber(int x){  //task 1
        if(x == 0) return;
        int last_digit = x % 10;
        x /= 10;
        DigitsOfNumber(x);
        System.out.println(last_digit);
    }
}
