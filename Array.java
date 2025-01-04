/*import java.util.*;
public class Array{
    public static void main(String args[])
    {
        //int[] marks = new int[3];
        int marks[] = new int[3];
        marks[0]=20;
        marks[1]=18;
        marks[2]=19;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
*/
//memory store in hexadecimal i.e base 6
//integer has 4 byte size 

////////////////////////////////////////////////

/*import java.util.*;
public class Array{
    public static void main(String args[])
    {
        
        int marks[] = {20, 18, 19};
        //marks[0]=20;
        //marks[1]=18;
        //marks[2]=19;

        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
        }
    }
}*/

////////////////////////////////////////////////

//take input size of array from user

/*import java.util.*;
public class Array{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}*/

//////////////////////////////////////////////////

//take input size and numbers from user

/*
import java.util.*;
public class Array{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<size; i++)
        {
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("number are = "+numbers[i]);
        }
    }
}
*/

/////////////////////////////////////////////////

/*
Take an array as input from user. Search for a given number x
and print the index at which it occurs.
*/

import java.util.*;
public class Array{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array = ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("enter array elements = ");
        for(int i=0;i<size;i++)
        {
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter number you want to search = ");
        int x = sc.nextInt();
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==x)
            {
                System.out.print(x+" found at "+i+" index");
            }
        }


    }
}
