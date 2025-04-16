// Question 1/375

import java.util.Scanner;

public class MaximumMinimumElement{
    static int maximum(int arr[], int n){
        int maxElement = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    static int minimum(int arr[], int n){
        int minElement = arr[0];
        for(int i = 0; i<n; i++){
            if(minElement > arr[i]){
                minElement = arr[i];
            }
        }
        return minElement;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the no. of elements in an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.err.println();

        // Enter the elements of an array
        System.err.println("Enter the elements of an array : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.err.println("The elements of an array : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }

        // For finding the maximum and minimum of an array we call a functions
        System.err.println("The maximum valued element in an array : " +maximum(arr, n));
        System.err.println("The manimum valued element in an array : " +minimum(arr, n));
    }
}