import java.util.*;
public class pattern{

    // pattern 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // right angle triangle pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {       
                if(i>=j){                         
                    System.out.print("* ");    
                }                               
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // right angle triangle pattern (inverted)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {       
                if(j>=i){                         
                    System.out.print("* ");    
                }                               
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // right angle triangle pattern (right side)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {       
                if((i+j)>= (n-1)){                         
                    System.out.print("* ");    
                }                               
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // right angle triangle pattern (upside down)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {       
                if((i+j)<= (n-1)){                         
                    System.out.print("* ");    
                }                               
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}