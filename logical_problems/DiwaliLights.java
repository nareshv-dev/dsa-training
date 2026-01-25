import java.util.*;
public class DiwaliLights {
    /* https://www.hackerrank.com/challenges/diwali-lights/problem
    I have attached the link in the above line check to understand the problem */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) System.out.println("1");
        n%=100000;
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=(sum*2)%100000;
        }
        System.out.println((long)((sum-1)%100000));
    }
}

