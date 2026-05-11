package Sorting;
public class BubbleSort {
    public static void BubbleSOrt(int arr[]){
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length-1;j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
 }
public static void main(String[] args){
int arr[]={12,9,4,5,23,3};
BubbleSOrt(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+"   ");
}
}
}