import java.util.Scanner;
public class task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(counter(s));
    }
    public static int counter(String s){//task 9
        if(s.length() == 0){
            return 0;
        }
        return 1 + counter(s.substring(1));
    }//task 9
}
