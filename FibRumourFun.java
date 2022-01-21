
 import java.lang.Math.*;
/*
 * Mastery Solo Quiz 2
 * Name: Maxime Sotsky
 * 
 */

public class FibRumourFun {

    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n -2);
    }



	public static boolean isFibCubeRumour(int n) {
		// your code goes here!
		//sum of the cubes
		//f(0)^3 + f(1)^3 +... + f(n)^3
		//equals
		//(f(3n+4) + (-1)^n *6 f(n-1))/10
		double a = Math.pow(fibonacci(n),3);
		if(a == (	fibonacci(3*n+4) + (Math.pow(-1,n) *6 * fibonacci(n-1))/10	)	){
			return true;
		}
			return false;		
	}
	
	public static void main(String[] args) {
		System.out.println(isFibCubeRumour(5));
	}
}
