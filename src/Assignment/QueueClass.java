package Assignment;

class Node7{
    int count;
    int sum;
    Node7 next;
    Node7(int count , int sum){
        this.count = count;
        this.sum = sum;
    }
}
public class QueueClass {
   static Node7 front;
   static Node7 rear;
    public static boolean isPrime(int a) {
        if (a == 0 || a == 1)
            return false;
        else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        }
    }


    public static void enQueue(int count , int sum){
        Node7 n  = new Node7(count,sum);
        if (front == null){
            front =n;
            rear = n;
        }
        else {
            if (rear.sum > n.sum){
                n.next = rear;
                rear = n;
            }
            else {
                Node7 temp = front;
                if (temp.sum < n.sum){
                    n.next = front;
                    front = n;
                }
                else {
                    while (temp.next != null){
                        if (temp.next.sum <= n.sum){
                            n.next = temp.next;
                            temp.next = n;
                            break;
                        }

                        else temp = temp.next;
                    }
                }
            }
        }
    }

    public static void disp(){
        Node7 tem = front;
        while (tem != null){
            System.out.print("("+tem.count+" "+ tem.sum+")"+"-->");
            tem = tem.next;
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int size = sc.nextInt();
//        int arr[] = new int[size+1];
//        System.out.println("Enter the size of array");
//        for (int i = 0; i < args.length-1; i++) {
//            arr[i] = sc.nextInt();
//        }
         int arr[] = {1,3,4,3,5,8,7,13,9,53,4,5,7,0};

        int count =0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])){
                count++;
                sum = sum+arr[i];
            }
            else{
                if (sum > 0 && count >0)
                   enQueue(count,sum);
                sum = count =0;
            }
        }
        disp();
//        int i=0,count,sum;
//        while(i<arr.length){
//            if(isPrime(arr[i])){
//                count=sum=0;
//                while(i<arr.length && isPrime(arr[i])){
//                    count++;
//                    sum+=arr[i];
//                    i++;
//                }
//                System.out.println(count+"      "+sum);
//            }
//            else i++;
//        }

    }
}
