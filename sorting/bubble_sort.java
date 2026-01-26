import java.util.*;
class bubble_sort {
    public void bubbleSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        bubble_sort bs=new bubble_sort();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
            
        }
        bs.bubbleSort(arr);
        System.out.println("Sorted array");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
