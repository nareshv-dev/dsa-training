import java.util.*;
public class reverse_words {
    /*https://leetcode.com/problems/reverse-words-in-a-string/description/ */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.trim().split("\\s+");
        StringBuilder reversed=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if(i!=0) reversed.append(" ");
        }
        System.out.println(reversed.toString());
    }
}
