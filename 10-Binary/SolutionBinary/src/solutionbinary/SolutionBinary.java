
package solutionbinary;

import java.io.*;
import java.util.*;

public class SolutionBinary {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder=0,s=0,t=0;
        while(n> 0){
            remainder = n%2;
            n =n/2;
            if (remainder == 1){
                s++;
                if (s>=t)
                    t =s;
            }else{
                s =0;
            }
            
        }
        System.out.println(t);
    }
}