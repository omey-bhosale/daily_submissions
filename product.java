/*
Product of maximum in first array and minimum in second
BasicAccuracy: 54.31%Submissions: 27862Points: 1
Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate the product of the maximum element of the first array and minimum element of the second array.

Example 1:

Input : A[] = {5, 7, 9, 3, 6, 2}, 
        B[] = {1, 2, 6, -1, 0, 9}
Output : -9
Explanation:
The first array is 5 7 9 3 6 2. 
The max element among these elements is 9.
The second array is 1 2 6 -1 0 9.
The min element among these elements is -1.
The product of 9 and -1 is 9*-1=-9.

Example 2:

Input : A[] = {0, 0, 0, 0}, 
           B[] = {1, -1, 2}
Output : 0

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function find_multiplication() that takes an array of integer (A), another array of integer (B), size of array A(n), size of array B(m) and return the product of the max element of the first array and the minimum element of the second array. The driver code takes care of the printing.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
 

Output:
For each test case, output the product of the max element of the first array and the minimum element of the second array.

Constraints:
1 ≤ N, M ≤ 106
-108 ≤ Ai, Bi ≤ 108


*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] =  Integer.parseInt(elements[i]);
		    }
		    
		    int sizeOfArray_M = Integer.parseInt(br.readLine());
		    int brr [] = new int[sizeOfArray_M];
		    
		    
		    line = br.readLine();
		    String[] ele = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray_M;i++){
		        brr[i] =  Integer.parseInt(ele[i]);
		    }
		    
		    
		    Solution obj = new Solution();
		    long res = obj.find_multiplication(arr, brr, sizeOfArray, sizeOfArray_M);
		    System.out.println(res);
		}
	}
}


            


// } Driver Code Ends


//User function Template for Java


class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(brr).min().getAsInt();
        return max*min;
    }
    
    
}

