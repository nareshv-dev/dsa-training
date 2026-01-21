import java.util.*;
public class square_free {
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
