import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
            //i can't input array without loop but it isn't in function so i thought its alright
        }
        System.out.println(avg(n, arr));
        scanner.close();
    }
    public static double avg(int num, int[] arr ){//task 2
        if(num == 1){
            return arr[0];
        }
        double previous_num = avg(num - 1, arr);
        double sum = previous_num * (num-1 ) + arr[num-1];
        double average = sum / num;

        return average;
    }//task 2
}
