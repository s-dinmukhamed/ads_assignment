import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(isPrime(n, 2)){
            System.out.println("Prime");
        }else{
            System.out.println("Composite");
        }
    }

    public static boolean isPrime(int n, int i){//task 3
        if(n <= 1){
            System.out.println("n is neither a prime nor a composite number ");
            return false;
        }
        if(i*i > n){
            return true;
        }
        if(n % i == 0){
            return false;
        }
        return isPrime(n, i+1);
    }//task 3
}
