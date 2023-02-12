//Give the name "Solution.java" to this file.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        int a=1;
        while(a<=10) {
            System.out.println(n + " x " + a + " = " +n*a);
            a++;
            
        }
        bufferedReader.close();
    }
}
