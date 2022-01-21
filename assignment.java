//Maxime Sotsky
//Dr.Ricker
//COMP 2611 Assignment 1
import java.util.*;
public class assignment{

/* 1) What does the following recursive function do?
    It takes in an integer value then attemps to construct a string.
    
    Does it behave like expected?
    No, it calls itself an infinite amount of time, n grows to negative infinite then crashes.
    what would you do to fix it?
    > I made the function static.
    > I changed the position of the base case since it was unreachable.
    > I added an string parameter because declaring a string inside the function will always create a new string.
    > I guessed that this function wanted to count to the integer value as the input.
*/

    public static String foo(int n, String s){
        if (n <= 0)
            return "";
        else
           s = foo(n-1,s) + n; //+ foo(n-2,s) + n;
        return s;
    }
    /*
    2) what are the values of mystery(2,25) and mystery(3,11)?
    Given positive integers a and b, describe what value mystery(a,b) computers.
    Demonstrate your answer via traciing strategy that we discrussed in class.

    Answer: observing the output it gives out for mystery(2,25) and mystery(3,11)
            it gives the product of a and b.
            Tracing mystery(2,25): (base case b == 0)  
                                                       ^
            |   mystery(64,0) + 32  | <--- return 32   |
            |   mystery(32,1) + 16  | <--- return 16   |
            |   mystery(16,3)       | <--- return      |    2 + 16 + 32
            |   mystery(8,6)        | <--- return      |    output: 50
            |   mystery(4,12) + 2   | <--- return 2    | 
            -------------------------
                    stack
    */

    public static int mystery(int a, int b){
        if (b== 0)
            return 0;
        if(b % 2 == 0)
            return mystery(a+a,b/2);
        return mystery(a+a,b/2) + a;
    }

    public static void main(String args[]){
        System.out.println(foo(0,""));
        System.out.println(foo(1,""));
        System.out.println(foo(2,""));
        System.out.println(foo(3,""));
        System.out.println(foo(4,""));
        System.out.println(foo(5,""));
        System.out.println(foo(6,""));
        System.out.println(foo(10,""));
        System.out.println(mystery(2,25));
        System.out.println(mystery(3,11));
    }
}