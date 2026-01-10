import java.util.*;

public class MeanMedianMode{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        float mean=(float) sum/n;
        Arrays.sort(arr);
        float median;
        if (n % 2 == 0) {
            median = (arr[n / 2] + arr[n / 2 - 1]) / 2.0f;
        } else {
            median = arr[n / 2];
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int k:arr){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        int mode=arr[0];
        int maxfreq=0;
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq >maxfreq || (freq==maxfreq && key<mode)){
                maxfreq=freq;
                mode=key;
            }
        }
        
        System.out.printf("%.1f\n",mean);
        System.out.printf("%.1f\n",median);
        System.out.println(mode);
    }
}
