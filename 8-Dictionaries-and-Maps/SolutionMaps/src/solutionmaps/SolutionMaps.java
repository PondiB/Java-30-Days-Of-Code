
package solutionmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Pondi Brian
 */
class SolutionMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBook = new HashMap<String,Integer>(); 

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

        //add each name and number to the phonebook.
            phoneBook.put(name,phone);
    }

    while(in.hasNext()){
        String s = in.next();

        //if name is not found (null), print "Not found" to the console.
        //Otherwise, print name + "=" + phone number.

            if (phoneBook.get(s) == null){
                System.out.println("Not found");
            }

            else {
                System.out.println(s + "=" + phoneBook.get(s));
            }


    }
    in.close();
    }
}