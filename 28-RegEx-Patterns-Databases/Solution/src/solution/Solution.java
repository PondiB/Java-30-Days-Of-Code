package solution;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<String>();
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            String name = in.next();
            String email = in.next();
            
            if(email.contains("@gmail")){
                names.add(name);
            }            
        }
        
        Collections.sort(names);
        
        for (String firstName : names){
            System.out.println(firstName);
        }
    }
}