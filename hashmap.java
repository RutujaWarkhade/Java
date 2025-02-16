import java.util.HashMap;
public class hashmap{
    public static void main(String args[])
    {
        //declaraion
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("india", 120);
        map.put("china",150);
        map.put("us",130);

        System.out.println(map);
        //HashMap is unorder pair 

        //same key repeated then it's value will be updated
        map.put("china",180);
        map.put("london",120);
        System.out.println(map);

        //search
        if(map.containsKey("china"))
        {
            System.out.println("key is present in the map");
        }
        else
        {
            System.out.println("key is not present in the map");
        }

        //get value
        System.out.println(map.get("china"));//key exist hence print it's value
        System.out.println(map.get("Indonisia"));//key not exist print null
    }
}