/*import java.util.*;
public class sbuilder{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        
        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //insert char at index 
        sb.insert(0, 's');
        System.out.println(sb);

        sb.insert(3, 'n');
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(3, 4);
        System.out.println(sb);

        //append (aad at last)
        sb.append("h");
        System.out.println(sb);

        //print length of string
        System.out.println(sb.length());
    }
}*/


//string reverse

import java.util.*;
public class sbuilder
{

    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++)
        {
            int front = i;
            int back = sb.length()-1-i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.print(sb);
    }

}