package Sorting;

public class Mearge {
    public static void conquer(int arr[] , int si,int mid , int ei){
       int merge[] = new int[ei-si+1];

       int indx1 = si;     // for first array
       int indx2 = mid+1;  // for second array
       int x = 0;          // index for merge array

        while (indx1 <= mid && indx2 <= ei){
            if (arr[indx1] <= arr[indx2]){
                merge[x] = arr[indx1];
                x++;
                indx1++;
            }
            else {
                merge[x] = arr[indx2];
                x++;
                indx2++;
            }
        }

        // element remaining in array 1;
        while (indx1 <=mid){
            merge[x++] = arr[indx1++];
        }

        // element remaining in array 2;
        while (indx2 <=ei){
            merge[x++] = arr[indx2++];
        }

        // copy the merge array to original array.
        for (int i = 0,j=si; i < merge.length ; i++,j++) {
            arr[j]= merge[i];
        }
    }
    public static void divide(int arr[] , int si , int ei){
        // Divide upto 1 element.
        if(si>=ei) return;
        int mid = si + (ei - si) /2;   // we use this as when index are very large then we can get space error in (mid=si+ei/2) so we use this.
        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        // conquer
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length-1;
        divide(arr,0,n);

        for (int a:
            arr ) {
            System.out.print(a+" ");
        }
    }
}
