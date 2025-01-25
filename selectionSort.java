import java.util.*;
public class selectionSort{
    public static void sortArray(int[] array)
    {
        for(int i=0; i<array.length-1 ; i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
                
    
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter array elements = ");
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        sortArray(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}