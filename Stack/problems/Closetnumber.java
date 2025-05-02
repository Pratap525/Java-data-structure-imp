import java.util.Arrays;
import java.util.Stack;

public class Closetnumber {

    public static void main(String[] args) {
        int arr[] ={5,7,3,12,9};

         solve(arr);
    }

    // private static void solve(int arr[]){
    //     int temp[] = new int[arr.length];
    //     Arrays.fill(temp, -1);

    //     for(int i=0;i<arr.length;i++){
    //         for(int j = i-1;j>=0;j--){
    //             if(arr[j] < arr[i]){
    //                 temp[i] = arr[j];
    //                 break;
    //             }
    //         }
    //     }

    //     System.out.println(Arrays.toString(temp));

    // }


    private static void solve(int []arr){
        Stack<Integer> ss = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            while (!ss.isEmpty() && arr[i] < ss.peek() ) {
                ss.pop();
            }
           
            if(ss.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = ss.peek();
            }

            ss.push(num);
        }

        System.out.println(Arrays.toString(arr));

    }
}