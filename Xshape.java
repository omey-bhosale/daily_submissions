/*
X Total Shapes
MediumAccuracy: 59.4%Submissions: 16599Points: 4
Given  a grid of n*m consisting of O's and X's. The task is to find the number of 'X' total shapes.
Note: 'X' shape consists of one or more adjacent X's (diagonals not included).
 

Example 1:

Input: grid = {{X,O,X},{O,X,O},{X,X,X}}
Output: 3
Explanation: 
The grid is-
X O X
O X O
X X X
So, X with same colour are adjacent to each 
other vertically for horizontally (diagonals 
not included). So, there are 3 different groups 
in the given grid.

Example 2:

Input: grid = {{X,X},{X,X}}
Output: 1
Expanation: 
The grid is- 
X X
X X
So, X with same colour are adjacent to each
other vertically for horizontally (diagonals
not included). So, there is only 1 group
in the given grid.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function xShape() which takes grid as input parameter and returns the count of total X shapes.
 

Expected Time Compelxity: O(n*m)
Expected Space Compelxity: O(n*m)
 
*/

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            Solution obj = new Solution();
            int ans = obj.xShape(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends




class Solution
{
    public boolean isSafe(char [][]grid,int r,int c)
    {
        int n = grid.length;
        int m = grid[0].length;
        
        if((r >=0 && c >=0)&&(r < n && c < m))
            return true;
        return false;
    }
    public void path(char [][]grid,int r,int c)
    {
        if(!isSafe(grid,r,c)) return;
        if(grid[r][c] == 'O') return;
        
        grid[r][c] = 'O';
        //Up
        path(grid,r-1,c);
        //Down
        path(grid,r+1,c);
        //Left
        path(grid,r,c-1);
        //Right
        path(grid,r,c+1);
    }
    public int xShape(char[][] grid)
    {
        int count = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 'X')
                {
                    count++;
                    path(grid,i,j);
                }
            }
        }
        return count;
    }
}
