import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibonacсi(n));
    }
    public static int Fibonacсi(int x){//task 5
        if (x == 0){
            return 0;
        }
        if( x == 1 ){
            return 1;
        }
        return Fibonacсi(x - 1) + Fibonacсi(x - 2);
    }//task 5
}
