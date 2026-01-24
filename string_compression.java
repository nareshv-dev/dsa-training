public class string_compression {
    public int compress(char[] chars) {
        /*https://leetcode.com/problems/string-compression/ */
        String str="";
        int count=1;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }
            else{
                str+=chars[i];
                if(count>1){
                    str+=count;
                }
                count=1;
            }
        }
        str+=chars[chars.length-1];
        if(count>1){
            str+=count;
        }
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
    public static void main(String[] args) {
        string_compression sc=new string_compression();
        char[] chars={'a','a','b','b','c','c','c'};
        int len=sc.compress(chars);
        System.out.println(len);
        for(int i=0;i<len;i++){
            System.out.print(chars[i]+" ");
        }
    }
} 
    

