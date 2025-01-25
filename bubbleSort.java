import java.util.*;
public class bubbleSort{
    public static void sortArray(int[] array)
    {
        for(int i=0; i<array.length-1 ; i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
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

// Time Complexity = O(n^2)