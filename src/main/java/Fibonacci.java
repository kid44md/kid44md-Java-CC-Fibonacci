
public class Fibonacci {
    /**
     * Return the nth number of fibonacci sequence.
     * The fibonacci sequence is calculated by adding the previous two numbers in the sequence to obtain the next
     * number. The first two numbers in the whole fibonacci sequence are always 0 and 1.
     * For instance, the sequence starts as:
     * 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3, the 5th number would be 5, the 6th number would be 8, etc.
     *
     * You could either use a for loop to keep track of the current number of the fibonacci sequence as well as the two
     * numbers before it, or you could look up a recursive solution to experiment with recursion for the first time.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int n){
        //FIRST CASE
        // int input = 1;
        // int expected = 1;
//n = 1 
//first = 0
//second = 1
//first + second = 1
int iterative = n - 1; 
int first = 0; 
int second = 1;
int total = 0;
            if(n == 1){
            return  first + second;
            }

        for(int i = 0; i < iterative; i++){
            total = first + second; 
            first = second;
            second = total;
            System.out.println(i + " INDEX");
            System.out.println(total);
            }

        //SECOND CASE
        // int input = 3;
        // int expected = 2;

        //THIRD CASE 
        // int input = 6;
        // int expected = 8;
System.out.println(total + " RESULT");
        return total;
    }
}
