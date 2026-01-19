import java.util.*;

public class factor_3 {
    public static void main(String args[] ) throws Exception {
        
        /* https://www.hackerrank.com/contests/2027-practice-gv-lab/
        challenges/factor-of-3/problem */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int[] arr=new int[l];
            int count=0;
            for(int j=0;j<l;j++){
                arr[j]=sc.nextInt();
                if(arr[j]%3==0){
                    count++;
                }
            }
            if(l%2==0){
                if(l/2 >=count){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
            if((l/2)+1 >=count){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }}
        }
        
        sc.close();
    }
}
