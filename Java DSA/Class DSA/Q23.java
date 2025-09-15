// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;

// public class Q23 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         ArrayList<ArrayList<Integer>> nestedList = new ArrayList<>();

//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();

//         for (int i = 0; i < rows; i++) {
//             System.out.print("Enter number of elements in row " + (i + 1) + ": ");
//             int cols = sc.nextInt();

//             ArrayList<Integer> innerList = new ArrayList<>();
//             System.out.println("Enter " + cols + " elements:");
//             for (int j = 0; j < cols; j++) {
//                 innerList.add(sc.nextInt());
//             }

//             nestedList.add(innerList);
//         }


//         System.out.println("\nResults per row:");
//         for (int i = 0; i < nestedList.size(); i++) {
//             ArrayList<Integer> row = nestedList.get(i);

//             int sum = row.stream().mapToInt(Integer::intValue).sum();
//             int max = Collections.max(row);
//             int min = Collections.min(row); 
//             System.out.println("Row " + (i + 1) + ": " + row);
//             System.out.println("Sum = " + sum);
//             System.out.println("Max = " + max);
//             System.out.println("Min = " + min);
//             System.out.println();
//         }
//         sc.close();

//     }

// }