"""Alternate positive and negative numbers
EasyAccuracy: 49.41%Submissions: 53211Points: 2
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.
 

Example 1:

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Example 2:

Input: 
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0 


Your Task:  
You don't need to read input or print anything. Your task is to complete the function rearrange() which takes the array of integers arr[] and n as parameters. You need to modify the array itself.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 

Constraints:
1 ≤ N ≤ 107
-106 ≤ Arr[i] ≤ 107



"""


#User function Template for python3

class Solution:
    def rearrange(self,arr, n):
        # code here
        pos = []
        neg = []
        for x in arr:
            if x < 0:
                neg.append(x)
            else:
                pos.append(x)
                
        j=0
        i=0
        while j < n:
            if j<len(pos):
                arr[i]=pos[j]
                i+=1
            if j < len(neg):
                arr[i]=neg[j]
                i+=1
                
            j+=1
        return arr


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	tc = int(input())
	while tc > 0:
		n = int(input())
		arr = list(map(int, input().strip().split()))
		ob = Solution()
		ob.rearrange(arr, n)
		for x in arr:
			print(x, end=" ")
		print()
		tc -= 1

# } Driver Code Ends
