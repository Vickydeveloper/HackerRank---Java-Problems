//Give the name "Solution.java" to this file.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int number = scanner.nextInt();
        
        if(number % 2 == 0) {
            if(number >= 2 && number <= 5) {
                System.out.println("Not Weird");
            }
            else if(number >= 6 && number <= 20) {
                System.out.println("Weird");
            }
            else if(number > 20) {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
