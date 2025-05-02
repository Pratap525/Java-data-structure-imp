import java.util.ArrayList;

public class Maximumsumofsubarray {

    public static void main(String[] args) {
        int arr[] = {12,10,9,15,20,8};
        int k = 3;

        find(arr,k);
    }


    static void find(int[] arr, int k){
        ArrayList<Integer> al = new ArrayList<>();

        int max = arr[0];
        for(int i=0;i<k;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        for(int i=k;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                System.out.println(max);
                // al.add(arr[i]);
            }
        }
        // System.out.println(al);
    }
}

//   static  void find(int[] arr,int k){
//         int i =0 , j=k;
//         int sum =0,maxsum = -100;

//         while (j<arr.length) {
//             if (i<j) {
//                 sum += arr[i];
//                 if (sum > maxsum) {
//                     maxsum = sum;
//                     System.out.println(maxsum);
//                 }
//                 i++;
//             }
//             else{
//                 sum -= arr[j-i];
//                 j++;

//                 sum +=arr[i];
//                 if (sum > maxsum) {
//                     maxsum = sum;
//                 }
//                 System.out.println(maxsum);
//             }


//         }

//         // System.out.println(maxsum);
      
//     }
// }