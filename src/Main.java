import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(GCD(a, b));
}
//PART 3
public static int GCD(int a, int b){//task 10
    if(b == 0){
        return a;
    }
    return GCD(b, a % b);
}//task 10

public static int counter(String s){//task 9
    if(s.length() == 0){
        return 0;
    }
    return 1 + counter(s.substring(1));
}//task 9
public static String checkDigits(String s){//task 8
    if (s.length() == 0){
        return "Yes";
    }
    if(!Character.isDigit(s.charAt(0))){
        return "No";
    }
    return checkDigits(s.substring(1));
}//task 8


//PART 2
public static void reverse(int n, int[] arr){//task 7
    if(n == 0){
        return;
    }
    System.out.print(arr[n-1] + " ");
    reverse(n - 1, arr);
}//task 7
public static int power(int x, int y){//task 6
    if(y == 0){
        return 1;
    }
    return x*(power(x, y -1));
}//task 6
public static int Fibonacсi(int x){//task 5
    if (x == 0){
        return 0;
    }
    if( x == 1 ){
        return 1;
    }
    return Fibonacсi(x - 1) + Fibonacсi(x - 2);
}//task 5


//PART 1
public static int factorial(int x){//task 4
    if(x == 0 || x == 1){
        return 1;
    }
    return x * factorial(x - 1);
}//task 4
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
public static void DigitsOfNumber(int x){  //task 1
    if(x == 0) return;
    int last_digit = x % 10;
    x /= 10;
    DigitsOfNumber(x);
    System.out.println(last_digit);
}//task 1
public static double avg(int num, int[] arr ){//task 2
    if(num == 1){
        return arr[0];
    }
    double previous_num = avg(num - 1, arr);
    double sum = previous_num * (num-1 ) + arr[num-1];
    double average = sum / num;

    return average;
}//task 2