package Searching;
public class Binary{
public static int Binarysearch(int target,int arr[]){
    int start=0;
    int n=arr.length-1;
    int end=n;
    while(start<end){
    int mid=(start+end)/2;
     if (arr[mid] == target) {
            return mid;
            }
   else  if(arr[mid]<target){
    start=mid+1;
}
else{
    end=mid-1;
}
}
return -1;
}
    public static void main(String[] args) {
int arr[]={1,4,7,9,45,89};
int ans=Binarysearch(7, arr);    
    
if(ans!=1){
System.out.println(" your found at  " +ans+" index");
}
else{
    System.out.println("element does not found ");
}
    }
}