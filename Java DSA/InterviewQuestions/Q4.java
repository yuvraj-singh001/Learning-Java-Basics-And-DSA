// public class Q4 {
// public static void main(String[] args) {
//     int[] arr = {4,5,6,7,0,1,2};
//     Rarr o1 = new Rarr();
//     int h = arr.length;
//     int l = 0;
//     int result = o1.count(arr, l , h);
//     System.out.println(result);
// }
// }

// class Rarr{
//     public int count(int[] arr, int l, int h){
//         int mid =0, peak = 0;
//         while(l<h){
//             mid = (l+h)/2;
//             if(l<h && arr[mid]>arr[mid+1]){
//                 h = mid;
//             }
//             else if(arr[mid]< arr[l]){
//                 h = mid;
//             }
//             else if(l<h && arr[mid]<arr[mid+1]){
//                 l = mid +1;
//             }
//         }
//         peak = l;
//         return (arr.length-1)-peak;
//     }
// }