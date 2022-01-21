public class exer {
    public static int mystery(int n){
        if (n == 0)
            return 0;
        else
            return n * n + mystery(n-1);
    }
    public static int factorial(int n){
        if (n==0)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static double power(double x, int n){
        if (n == 0)
            return 1;
        else
            return x * power(x,n-1);
    }
    public static double gcd(int m, int n){
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n -2);
    }

    public static void main(String args[]){
        System.out.println(mystery(4));
        System.out.println(factorial(4));
        System.out.println(power(2,2));
        System.out.println(gcd(15,5));
        System.out.println(fibonacci(6));

    }
}