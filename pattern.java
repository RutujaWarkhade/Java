/*solid square
print:
* * * * 
* * * * 
* * * * 
* * * * 
*/

/*public class pattern
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
}*/
/////////////////////////////////

/*
print Hollow rectangle
*****
*   *
*   *
*   *
*****

*/
/*public class pattern{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1||i==5||j==1||j==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/

////////////////////////////////////////////

//inverted half pyramid
/*
print:
* 
* * 
* * * 
* * * * 
* * * * * 

*/

/*public class pattern{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}*/

////////////////////////////////////////////

/*
print
*****
****
***
**
*

*/

/*public class pattern{
    public static void main(String args[])
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

///////////////////////////////////////////////

/*
print
   *
  **
 ***
****

*/

/*public class pattern{
    public static void main(String args[])
    {
        //outer loop
        for(int i=1;i<=4;i++)
        {
            //inner loop -> space print
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");

            }
            //inner loop -> star prit
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/////////////////////////////////////////////////

/*
print half pyramid with numbers

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/

/*public class pattern{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

///////////////////////////////////////////////
/*
print  inverted half pyramid with no's

12345
1234
123
12
1

*/

/*public class pattern{
    public static void main(String args[])
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

///////////////////////////////////////////////////

/*
print Floyd's triangle

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/
/*public class pattern{
    public static void main(String args[])
    {
        int number=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}*/
//////////////////////////////////////

/*
print 0-1 triangle
1
01
101
0101
10101
*/
public class pattern{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum = i+j;
                if(sum%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
