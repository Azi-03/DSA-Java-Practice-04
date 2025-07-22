import java.util.*;
public class Main{
    //Method to Print Array
    static void PrintArr(int[]arr){
       int n= arr.length;
        for(int i=0; i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    //Method to swap 2 elemets in an array
    static void swap(int arr[], int i, int j){
        int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
    }
    //Method to Reverse a given Array
    static void RevArr(int[] arr){
        System.out.print("Given Array: ");
        PrintArr(arr);
        int n= arr.length;
        int swap=0;
        int j=n-1;
        for(int i=0; i<n/2;i++){
            swap(arr,i,j);
            j--;
        }
        System.out.print("Reversed Array: ");
        PrintArr(arr);
    }
    
    //Method to find Maximum & Minimum in a given array
    static void MaxMin(int[]arr){
        System.out.print("Given Array: ");
        PrintArr(arr);
        int max=arr[0];
        int min=arr[0];
        int n= arr.length;
        for(int i=0; i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum ="+ max);
         System.out.println("Minimum ="+ min);
    }
    
    //Method to find Kth Minimum And Kth Maximum
    static void KthMinMax(int[]arr, int k){
        System.out.print("Given Array: ");
        PrintArr(arr);
        int n= arr.length;
        Arrays.sort(arr);
        System.out.println(k+"th Maximum = "+ arr[n-k]);
         System.out.println(k+"th Minimum = "+ arr[k-1]);
    }
    
    //Method to sort Zero's,  1s & 2's in the given array
    static void SortZOT(int[]arr){
        System.out.print("unsorted array: ");
        PrintArr(arr);
        int n = arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
               
            }
        }
        System.out.print("Sorted Array: ");
        PrintArr(arr);
    }
    
    static void SortNP(int arr[]){
        System.out.print("Given Array: ");
        PrintArr(arr);
        int n = arr.length;
       
    int[] temp = new int[n];
    int index = 0;
        for (int i = 0; i < n; i++) {
        if (arr[i] < 0) {
            temp[index++] = arr[i];
        }
    }
    for (int i = 0; i < n; i++) {
        if (arr[i] >= 0) {
            temp[index++] = arr[i];
        }
    }
    System.out.print("Sorted Array: ");
        PrintArr(temp);
    }
    
    static void unionNintersection(int[] arr2, int[] arr){
        int n= arr.length;
        int m= arr2.length;
        System.out.print("Given 1st Array: ");
        PrintArr(arr2);
        System.out.print("Given 2nd Array: ");
        PrintArr(arr);
        int[] arr3 = new int[m+n];
        int[] arr4 = new int[m+n];
        for(int i=0;i<n;i++){
            arr3[i]=arr[i];
        }
        for(int i=0;i<m;i++){
                  arr3[i+n]=arr2[i];
        }
        Arrays.sort(arr3);
        System.out.println("Union: ");
        System.out.print(arr3[0] + " "); 

    for (int i = 1; i < arr3.length; i++) {
    if (arr3[i] != arr3[i - 1]) {
        System.out.print(arr3[i] + " ");
    }
}
System.out.println();
//intersection
       Arrays.sort(arr);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();

        while (i < arr.length && j < arr2.length) {
            if (arr[i] == arr2[j]) {
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != arr[i]) {
                    intersection.add(arr[i]);
                }
                i++;
                j++;
            } else if (arr[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("Intersection: " + intersection);
    }
    
    //cyclically rotate an array by one.
    static void CyclicRotateBy1(int [] arr){
         System.out.print("Given Array: ");
        PrintArr(arr);
        int n= arr.length;
        int k= arr[n-1];
        for(int i=n-1; i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=k;
        System.out.print("Rotated Array: ");
        PrintArr(arr);
    }
    public static void main(String args[]){
      int arr[]= {1,2,3,4,5};
      int arr2[]={1,0,2,0,1,0,2,1};
      int arr3[]={-1,2,-3,4,-5,6};
      RevArr(arr);
      MaxMin(arr);
      KthMinMax(arr, 3);
      SortZOT(arr2);
      SortNP(arr3);
      unionNintersection(arr,arr2);
      CyclicRotateBy1(arr);
    }
}