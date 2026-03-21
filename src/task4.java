import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        System.out.println(factorial(x));

    }
    public static int factorial(int x){//task 4
        if(x == 0 || x == 1){
            return 1;
        }
        return x * factorial(x - 1);
    }//task 4
}
