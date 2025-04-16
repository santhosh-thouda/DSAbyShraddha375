// Question 2/375

import java.util.Scanner;

public class ReverseArray{

    // reversing the array without sorting
    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args){
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

        System.err.println("The array before reversing : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }

        // For finding the maximum and minimum of an array we call a functions
        
        System.err.println("");
        reverse(arr);
        System.out.println("The array after reversing : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}