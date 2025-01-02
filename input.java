/*import java.util.*;
public class input{
    public static void main(String[] args)
    {
        //input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nextInt()
        //nextFloat()
        System.out.println(name);
    }
}*/

//take 2 variable from user and print their sum
import java.util.*;
public class input{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("Sum is = "+sum);
    }
}