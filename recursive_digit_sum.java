import java.util.*;
public class recursive_digit_sum {

    /* a string will be given and we have to find the single 
    digit sum of a string with the given k times */

    /* Easy way --> (given number % 9) == digit sum 
    simplest way to solve it*/

     public static int superDigit(String n, int k) {
    // Write your code here
    long sum=0;
    for(char ch:n.toCharArray()){
        sum += (ch-'0');
    }
    sum=sum*k;
    while(sum>=10){
        sum=recursive(sum);
    }
    return (int) sum;
    }
    public static long recursive(long m){
        long sum=0;
        while(m>0){
            long rem=m%10;
            sum+=rem;
            m/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int k=sc.nextInt();
        int result=superDigit(n,k);
        System.out.println(result);
    }
}
