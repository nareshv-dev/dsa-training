import java.util.*;
public class second_largest {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int max=arr[n-1];
        if(n==1) return -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=max) return arr[i];
        }
        return -1;
    }
    public static void main(String args[] ) throws Exception {
        second_largest sl=new second_largest();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=sl.getSecondLargest(arr);
        System.out.println(result);
    }
}

