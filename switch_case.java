import java.util.*;
public class switch_case
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.print("hii");
                break;
            case 2:
                System.out.print("hello");
                break;
            case 3:
                System.out.print("hey");
                break;
            default:
                System.out.print("wrong choice");
                break;
        }
    }
}