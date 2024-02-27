//Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        String result = "";
        for(int i=0;i<=S.length()-1;i++){
            if(i<S.length()-1 && S.charAt(i)==S.charAt(i+1)){
                continue;
            }else{
                result+=S.charAt(i);
            }
        }
        return result;
    }
}
