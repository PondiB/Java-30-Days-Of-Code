
package solutiontimecomplexity;

import java.util.*;
public class SolutionTimeComplexity {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);	// Instantiate scanner
    int T = in.nextInt();			// Number of inputs
    int n;					// The input to evaluate
    
    for (int i = 0; i < T; i++) {		// Loop through inputs
    
        String result = "Not prime";
        n = in.nextInt();			// Get input
        
        if (n == 2 | n == 3) {			// O(1) - best case
            result = "Prime";
        } else if (n > 3 && n % 2 != 0) {	// If false: O(1)
            result = "Prime";
            int root = (int) Math.sqrt(n);	// Done outside loop
            
            // O(sqrt(n)/2)
            for (int j = 3; j <= root; j += 2) {
                if (n % j == 0) {
                    result = "Not prime";
                    break;			// Short-circuit
                }
            }
        }
        System.out.println(result);		// Print result
    }
    in.close();					// Close scanner
    }
}