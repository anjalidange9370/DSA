// package Searching;
// public class Linear {
// public static int linearsearch(int target,int arr[]){
// for(int i=0;i<arr.length;i++){
//     if(arr[i]==target){
// return i;
//     }
// }
// return -1;
// }
// public static void main(String[] args){
//    int arr[] = {10, 20, 30, 40, 50};
//    int target=20;
//    int resault=linearsearch(target, arr);
// System.out.println(resault);

// if(resault!=-1){
//     System.out.println("the "+target+"found at"+resault+"index");
// }
// }
// }
package Searching;
public class Linear{
public static int linearsearch(int arr[],int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args){
int arr[]={1,2,3,4,5,6,7};
int target=7;
int result=linearsearch(arr, target);
System.out.println(result);
if(result!=-1){
    System.out.println(" your "+target+" found at  " +result+" index");
}
}
}