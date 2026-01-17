import java.util.*;   
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindrome p=new palindrome();
        if(p.isPalindrome(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public boolean isPalindrome(int x) {
        int rev=0;
        if(x<0) return false;
        int temp=x;
        while(x!=0){
            int d=x%10;
            if ((rev > Integer.MAX_VALUE / 10) || (rev < Integer.MIN_VALUE / 10) ) return false;
            rev=(rev*10)+d;
            x=x/10;
        }
        if(rev==temp) return true;
        else return false;
    }
}
