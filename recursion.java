/*public class recursion{
    /*public static void printReverse(String str, int idx)
    {
        if(idx==0)
        {
            System.out.print(str.charAt(idx));
            return ;
        }
        System.out.print(str.charAt(idx));
        printReverse(str, idx-1);
    }
    }*/


/*public class recursion{
    public static void main(String[] args)
    {
        String str = "abcd";
        //int idx = str.length()-1;
        //printReverse(str, idx);
        System.out.println(str.charAt(0));
        System.out.print(str.charAt(str.length()-1));

    }
}*/

//find 1st and last occuerence of element
public class recursion{
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx, char ele)
    {
        //base condition
        if(idx==str.length()-1)
        {
            System.out.println(first);
            System.out.println(last);
            return ;
        }

        char currentchar = str.charAt(idx);
        if(currentchar == ele)
        {
            if(first==-1)
            {
                first = idx;
            }
            else
        {
            last = idx;
        }
        }
        
        findOccurence(str, idx+1, ele);


    }
    public static void main(String args[])
    {
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'a');
    }
}