package DSA_GFG.Array;

//public class LeftRotationByD3 {
//    public static int[] revd(int[] arr, int d){
//        int t =d-1;
//        int temp;
//        for (int i = 0; i < d; i++) {
//            if ( i>=t) {
//                break;
//            }
//            temp = arr[i];
//            arr[i]=arr[t];
//            arr[t]=temp;
//            t--;
//        }
////        while(temp < t)
////        {
////            int tem = arr[temp];
////            arr[temp] = arr[t];
////            arr[t] = tem;
////
////            temp++;
////            t--;
////        }
//        return arr;
//    }
//    public static int[] revr(int arr[],int d){
//        int n= arr.length-1;
//       int tem=0;
//        for (int i = d; i < arr.length ; i++) {
//            if (i>=n){
//                break;
//            }
//            tem=arr[i];
//            arr[i]=arr[n];
//            arr[n]=tem;
//            n--;
//        }
//        return arr;
//    }
//
//    public static int[] revarr(int arr[]){
//        int n = arr.length-1;
//        int temp=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i==n)
//                break;
//            temp = arr[i];
//            arr[i]=arr[n];
//            arr[n]=temp;
//            n--;
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int d=3;
//        int [] arr2=revarr(revr(revd(arr,d),d));
//        for (int a:
//                arr) {
//            System.out.println(a);
//        }
//    }
//}


// MORE EFFICIENT METHOD


  class LeftRoteteByD3
  {
//      static void leftRotate(int arr[], int d, int n)
//      {
//      	reverse(arr, 0, d - 1);
//
//      	reverse(arr, d, n - 1);
//
//      	reverse(arr, 0, n - 1);
//
//      }
//
//      static void reverse(int arr[], int low, int high)
//      {
//      	while(low < high)
//                 {
//      		int temp = arr[low];
//              arr[low] = arr[high];
//      		arr[high] = temp;
//
//      		low++;
//      		high--;
//         }
//      }


      public static void rev(int[] arr,int s,int e){
          while(s<e){
              int temp = arr[s];
              arr[s]= arr[e];
              arr[e]= temp;
              s++;
              e--;
          }
      }

      public static void rotate(int[] nums, int k) {
          int n = nums.length;

          rev(nums,n-k,n-1);

          if(n%2 == 0) rev(nums,0,k-1);
          else rev(nums,0,k);

          rev(nums,0,n-1);
      }

      public static void main(String args[])
      {
         int arr[] = {1}, n = 5, d = 1;

         rotate(arr, d);

//         System.out.println("After Rotation");
//                 for(int i = 0; i < n; i++)
//         {
//         		System.out.print(arr[i]+" ");
//         }

      }

  }