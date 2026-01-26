import java.util.*;
class insertion_sort {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        insertion_sort bs=new insertion_sort();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
            
        }
        bs.insertionSort(arr);
        System.out.println("Sorted array");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}