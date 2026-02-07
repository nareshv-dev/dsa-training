import java.util.*;
class score_string {
    //https://leetcode.com/problems/score-of-a-string/description/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        score_string obj = new score_string();
        int result = obj.scoreOfString(input);
        System.out.println("Score of the string: " + result);
    }
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int a=(int)s.charAt(i);
            int b=(int) s.charAt(i+1);
            sum+=Math.abs(a-b);
        }
        return sum;
    }
}