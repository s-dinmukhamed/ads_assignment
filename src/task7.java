import java.util.Scanner;
public class task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        reverse(n, arr);
    }
    public static void reverse(int n, int[] arr){//task 7
        if(n == 0){
            return;
        }
        System.out.print(arr[n-1] + " ");
        reverse(n - 1, arr);
    }//task 7
}
