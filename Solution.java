import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*https://www.hackerrank.com/challenges/s10-interquartile-range/problem
     */

    public static void interQuartile(List<Integer> values, List<Integer> freqs) {
    // Print your answer to 1 decimal place within this function
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<values.size();i++){
        for(int j=0;j<freqs.get(i);j++){
            int n=values.get(i);
            list.add(n);
        }
    }
    Collections.sort(list);
    int len=list.size();
    List<Integer> left,right;
    if(len%2==0){
        left=list.subList(0,len/2);
        right=list.subList(len/2,len);
    }
    else{
        left=list.subList(0,len/2);
        right=list.subList(len/2+1,len);
    }
    //q1
    int l1=left.size();
    int l2=right.size();
    int q1,q2;
    if(l1%2==0){
        q1=(left.get(l1/2)+left.get(l1/2 -1))/2;
    }
    else{
        q1=left.get(l1/2);
    }
    
    if(l2%2==0){
        q2=(right.get(l2/2)+right.get(l2/2 -1))/2;
    }
    else{
        q2=right.get(l2/2);
    }
    double res=(int)(q2-q1);
    System.out.printf("%.1f",res);
    
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> val = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> freq = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.interQuartile(val, freq);

        bufferedReader.close();
    }
}
