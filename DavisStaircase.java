import java.util.Scanner;

public class DavisStaircase {

    /*https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem
    Use this link to view the problem !!! */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0 || n==1) System.out.println(1);
        if(n==2) System.out.println(2);
        int a=1;
        int b=1;
        int c=2;
        int sum=0;
        while(n>2){
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            n--;
        }
        System.out.println(sum);
    }
}
