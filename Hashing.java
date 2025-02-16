import java.util.HashSet;
import java.util.Iterator;
public class Hashing{


    public static void main(String args[])
    {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        //not consider again 1 because in
        //hasing does not has dublicate values
        set.add(1);

        //search
        if(set.contains(1))
        {
            System.out.println("set contains 1");
        }
        if(!set.contains(6))
        {
            System.out.println("does not conatain 6");
        }


        //print size
        System.out.println("Size of set is= "+set.size());

        //print all elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //delete
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("does not contain 1 - we delete 1");
        }
        //print size
        System.out.println("Size of set is= "+set.size());

    }
}