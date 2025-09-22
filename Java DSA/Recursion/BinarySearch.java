package Recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of element in array");
        int n = sc.nextInt();

        System.out.println("enter the elements in array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {   
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the target element");
        int target = sc.nextInt();

        int l = 0;
        int h = arr.length;
        System.out.println(BS(arr, l, h, target));

        sc.close();
    }

    static int BS(int arr[], int l , int h, int target){
        int mid = (l+h)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]<target){
            return BS(arr,mid+1, h , target );
        }
        else if(arr[mid]<target){
            return BS(arr,l, mid-1 , target );
        }

        return -1;

        
    }
}
