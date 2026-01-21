import java.util.*;
public class square_free {
    /*A number is square-free if it is not divisible by any perfect square other than 1. 
    For example, 70 is square-free because its divisors (2, 5, 7, 10, 14, 35, 70) do not contain any perfect squares other than 1.
     However, 72 is not square-free because it is divisible by 4, 9, and 36, all of which are perfect squares. 
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int count = 0;
        for(int a : list){
           if(factor(a)){
              count++;
           }
        }
        System.out.println(count);

        
    }
    public static boolean factor(int a){
        // if(a%4==0 || a%9==0 || a%25==0  || a%49==0 ){
        //     return false;
        // }
        // return true;
        for(int i=2;i<=a;i++){
            if(a%i==0){
                int s=(int)Math.sqrt(i);
                if(s*s==i){
                    return false;
                }
            }//735134400
        }
        return true;
    }
}
