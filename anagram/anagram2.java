import java.util.*;
/*  */
public class anagram2 {
    public static int sherlockAndAnagrams(String s) {
    // Write your code here
    HashMap<String,Integer> map=new HashMap<>();
    int n=s.length();
    
    for(int i=0;i<n;i++){
        for(int j=i+1;j<=n;j++){
            char[] arr=s.substring(i,j).toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            map.put(key,map.getOrDefault(key,0)+1);
        }
    }
    int count=0;
    for(int freq:map.values()){
        count+= (freq*(freq-1)/2);
    }
    return count;
    
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int result=sherlockAndAnagrams(s);
        System.out.println(result);
    }
}
