// Question 3/375

import java.util.Scanner;

public class MaximumSubArraySum
{ 
    // Printing all the sub arrays
    static void allSubArrays(int arr[], int n){
		for(int start = 0; start < n; start++){
		    for(int end = start; end < n; end++){
				int sum = 0;
		        for(int i = start; i<=end; i++){
                    System.out.print(arr[i]);
		        }
		        System.out.print(" ");
		    }
		    System.out.println();
		}
    }
    static void allSubArraysSum(int arr[], int n){
		for(int start = 0; start < n; start++){
		    for(int end = start; end < n; end++){
				int sum = 0;
		        for(int i = start; i<=end; i++){
					sum = sum + arr[i];
		        }
				System.out.print(sum);
		        System.out.print(" ");
		    }
		    System.out.println();
		}
    }

	static void maxSubArraySum(int arr[], int n){
		int max = Integer.MIN_VALUE;
		for(int start = 0; start < n; start++){
			int sum = 0;
			for(int end = start; end < n; end++){
				sum = sum + arr[end];
				if(max < sum){
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = 5;
	    int arr[] = new int[5];
        // inputs of an array
        System.out.print("Enter the elements of an array : ");
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("All possible sub arrays : ");
        allSubArrays(arr, n);

		System.out.println("All possible sub arrays sums : ");
		allSubArraysSum(arr,n);

		System.out.println("Max sub array sum : ");
		maxSubArraySum(arr,n);
	}
}