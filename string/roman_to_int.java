import java.util.*;
public class roman_to_int {
public int romanToInt(String s) {
        Map<String,Integer> map=new HashMap<>();
        s=s.toUpperCase();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        int i=0;
        int sum=0;
        while(i<s.length()){
            if(i+1<s.length()){
                String re=s.substring(i,i+2);
                if(map.containsKey(re)){
                    sum+=map.get(re);
                    i+=2;
                    continue;
                }
            }
            String one=s.substring(i,i+1);
            sum+=map.get(one);
            i++;
        }
        return sum;
       
    }
    public static void main(String args[] ) throws Exception {
        roman_to_int rti=new roman_to_int();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int result=rti.romanToInt(s);
        System.out.println(result);
    }
}