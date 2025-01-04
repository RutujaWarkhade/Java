/*import java.util.*;

public class function{
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); //call printMyName function
    }
}*/

////////////////////////////////////////////////

//make a function to add 2 no's and return the sum

/*import java.util.*;
public class function{
    public static int calculateSum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
        int sum = calculateSum(a, b);
        System.out.print("sum of a and b is = "+sum);
    }
}
*/

////////////////////////////////////////////////////

//make a function to multiply 2 no's and return the product


/*import java.util.*;
public class function{
    public static int calculateProduct(int a, int b)
    {
        //int product = a*b;
        return a*b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(calculateProduct(a, b));
       // int product = calculateProduct(a, b);
        //System.out.print("product of a and b = "+product);
    }

}*/


////////////////////////////////////////////////////////

//find the factorial of number

import java.util.*; 
public class function{
    public static void printFactorial(int n)
    {
        if(n<0)
        {
            System.out.print("Invalid number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial = factorial*i;
        }
        System.out.print(factorial);
        return;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
