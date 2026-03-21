import java.util.Scanner;
public class task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(GCD(a, b));
    }
    public static int GCD(int a, int b){//task 10
        if(b == 0){
            return a;
        }
        return GCD(b, a % b);
    }//task 10
}
