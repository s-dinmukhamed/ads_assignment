import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(power(a, n));
    }
    public static int power(int x, int y){//task 6
        if(y == 0){
            return 1;
        }
        return x*(power(x, y -1));
    }//task 6
}
