import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int fact = 1;
        for(int l=x; l>0; l--){
            fact= fact * l;
        }return fact;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 1;
        for(int l = 1; l < 30; l++)
            e = e + 1/(double)(factorial(l));
        return e;

    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 5;
        double m = (n+x/n)/2;
        while (Math.abs(m-n)>.000001)
        {
            n=m;
            m=(m+x/m)/2;

        }
        return m;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("input an integer: ");
        //int x = scan.nextInt();
        //double y= factorial(x);
       // System.out.println(y);
        //double ecalc= calculateE();
        //System.out.println(ecalc);
        double x=babylonian(4);
        System.out.println(x);
        scan.close();
    }
}
