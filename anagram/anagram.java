import java.util.*;

/* String : Making anagrams --> to make two string anagrams 
how many characters need to be deleted */

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int[] arr=new int[26];
        for(char ch:a.toCharArray()){
            arr[ch-'a']++;
        }
       for(char ch:b.toCharArray()){
            arr[ch-'a']--;
       }
        int count=0;
        for(int n:arr){
            count+=Math.abs(n);
        }
        System.out.println(count);
    }
}
