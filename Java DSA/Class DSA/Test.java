// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Scanner;

// public class Test {
//    public static void main(String[] args) {
//       Scanner o1 = new Scanner(System.in);
//       int a, b, c;
//       System.out.println("enter three numbers");
//       a = o1.nextInt();
//       b = o1.nextInt();
//       c = o1.nextInt();
//       double res = (double)(a+b)/2;
//       if(res>c){
//          System.out.println("yes");
//       }
//       else{
//          System.out.println("no");
//       }
//    }
// }


// public class Test{
//    public static void main(String[] args) {
//       String str = "abc&def#";
//       if(str.length()%2 ==0 && str.contains("&") && str.contains("#")){
//          System.out.println("yes");
//       }
//       else{
//          System.out.println("no");
//       }
//    }
// }


// public class Test{
//    public static void main(String[] args) {
//       int[] arr = {1,2,3,4,5};
//       int c = 0, d = 0 ;
//       for(int i = 0 ; i < arr.length ; i++){
//          if(arr[i]%2 == 0){
//             c++;
//          }
//          else {
//             d++;
//          }
//       }
//       if(c>d){
//          System.out.println("even");
//       }
//       else if(c<d){
//          System.out.println("odd");
//       }
//       else{
//          System.out.println("tie");
//       }
//    }
// }



// public class Test{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of test cases");
//          int n = sc.nextInt();

//          while(n>0){
//             System.out.println("enter the number of employes");
//             int m = sc.nextInt();
//             Integer arr[] = new Integer[m];


//             System.out.println("enter the values of the array");
//             for(int i = 0 ; i < m ; i++){
//                 arr[i] = sc.nextInt();
//             }

//             // System.out.println("Array sum");
//             // System.out.println(Arrays.stream(arr).sum());
//             // System.out.println("Array max");
//             // System.out.println(Arrays.stream(arr).min().getAsInt());
//             // System.out.println("Array min");
//             // System.out.println(Arrays.stream(arr).max().getAsInt());

//             System.out.println("Sorted Array");
//             Arrays.sort(arr, Collections.reverseOrder());
//             System.out.println(Arrays.toString(arr));
//             Arrays.sort(arr);
//             System.out.println(Arrays.toString(arr));
            
//             n--;
//          }

//          sc.nextInt();
//     }
// }


// public class Test{
//     public static void main(String[] args) {
//         Integer[] arr = {56,39,84,64,98,83,76};

//         System.out.println("sorting arrry.......");

//         Arrays.sort(arr,Collections.reverseOrder());
//         int sum = 0;

//         for(int i = arr.length-5 ; i< arr.length ; i++){
//             sum += arr[i];
//         }

//         System.out.println("The sum is : " + sum);

//         System.out.println("Last 5 students of sorted array are :");
//         for(int i = arr.length-5 ; i < arr.length ; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// public class Test{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the number of element in the array");
//         int n = sc.nextInt();

//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 0 ; i<n ; i++){
//             list.add(sc.nextInt());
//         }

//         int count = Collections.frequency(list, 1);

//         System.out.println(count);

//         list.remove(count);

//         System.out.println(list);

//     }

//     // private void swap(ArrayList<Integer> list, int n1 , int n2){
//     //     int temp = list.get(n1);
//     //     list.set(n1, list.get(n2));
//     //     list.set(n2, temp);
//     // }
// }


// public class Test{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the number of element in the array");
//         int n = sc.nextInt();

//         System.out.println("enter the element in the array");
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 0 ; i<n ; i++){
//             list.add(sc.nextInt());
//         }
        
//         int min = Collections.min(list);
//         int max = Collections.max(list);
        
//         int idxmin = list.indexOf(min);
//         int idxmax = list.indexOf(max);
        
//         ArrayList<Integer> list1 = new ArrayList<>();
//         int s=0,s2=0,m=0,e=0;
//         if(idxmin<idxmax){
//             s2 = idxmin;
//             m = idxmax;
//             e = list.size();
//         }
//         else{
//             s2=idxmax;
//             m=idxmin;
//             e=list.size();
//         }

//         for(int i = s2 ; i<m; i++){
//             list1.add(list.get(i));
//         }
//         for(int i = s ; i<s2; i++){
//             list1.add(list.get(i));
//         }
//         for(int i = m ; i<e; i++){
//             list1.add(list.get(i));
//         }

//         System.out.println(list1);

        
//     }


// }

