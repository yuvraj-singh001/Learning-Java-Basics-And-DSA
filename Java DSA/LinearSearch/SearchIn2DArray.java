// public class SearchIn2DArray {
//     public static void main(String[] args) {
//         // I am taking the array directly.

//         int[][] arr = {
//             {23,4,1},
//             {18,12,3,9},
//             {78,99,34,56},
//             {18,12}
//         };

//         int target = 34;

//         SearchIn2D o1 = new SearchIn2D();
//         o1.searchIn2D(arr, target);

//     }
// }

// class SearchIn2D{
//     public void searchIn2D(int[][] arr , int target){
//         int flag = 0;
//         for(int i = 0; i<arr.length; i++){
//             for(int j = 0; j<arr[i].length; j++){
//                 if(arr[i][j]== target){
//                     flag = 1;
//                     break;
//                 }
//             }
//         }
//         if (flag == 1) {
//             System.out.println("");      
//             System.out.println("Element found");

//         }
//          else {            
//              System.out.println("No such element found");
//         }
//     }
// }

// // we can also find the max and the min num in the array as in the 1d array.