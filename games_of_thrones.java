import java.util.*;
public class games_of_thrones {
    /* to lock the door he needs a key that is an anagram of a palindrome. 
    He starts to go through his box of strings, checking to see if they can be rearranged into a palindrome. 
    Given a string, determine if it can be rearranged into a palindrome. Return the string YES or NO. */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result=gameOfThrones(s);
        System.out.println(result);
    }
    public static String gameOfThrones(String s) {
    int[] arr=new int[26];
    for(int i=0;i<s.length();i++){
        int n=s.charAt(i)-'a';
        arr[n]++;
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            count++;
        }
    }
    if(count<=1){
        return "YES";
    }
    return "NO";

    }}