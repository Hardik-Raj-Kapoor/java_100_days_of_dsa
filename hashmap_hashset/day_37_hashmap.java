package hashmap_hashset;

import java.util.HashMap;
import java.util.Map;

/*
Insert: map.put(key, value); Adds or updates the value for the given key.
Get: map.get(key); Retrieves the value for the given key. Returns null if not present.
Remove: map.remove(key); Removes the mapping for the key.
Contains Key: map.containsKey(key); Checks if the key exists.
Contains Value: map.containsValue(value); Checks if the value exists.
Size: map.size(); Returns number of entries.
Clear: map.clear(); Removes all entries.
Is Empty: map.isEmpty(); Checks if map is empty.
 */
public class day_37_hashmap {
    public static void main(String[] args) {
        // creation of hashmap
        HashMap<String,Integer> map = new HashMap<>();
        
        //inserting elements key,value
        map.put("Hardik",98);
        map.put("Sukalp",82);
        map.put("Samriddh",52);
        map.put("Sweksha",88);
        map.put("Vedanshi",78);
        map.put("Anil",32);

        System.out.println("\nInitial Map: " + map);

        //retieving a value
        System.out.println("\nMarks of Hardik: "+ map.get("Hardik"));

        //removing value
        map.remove("Anil");
        System.out.println("\nAfter removing 'Anil': "+map);
        
        //checking for key presence 
        System.out.println("\nContails Key 'Anil': "+ map.containsKey("Anil"));
        System.out.println("\nContails Key 'Samriddh': "+ map.containsKey("Samriddh"));

        //checking for value
        System.out.println("\nContails Value '88': "+ map.containsValue(88));
        System.out.println("\nContails Value '100': "+ map.containsValue(100));


        //checking size of hashmap
        System.out.println("\nSize of the hashmap is: "+map.size());

        //checking for empty
        System.out.println("\nIs the HashMap empty? "+ map.isEmpty());

        System.out.println("\nIterating through Hashmap: ");
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("Key= "+ entry.getKey()+", Value= "+ entry.getValue());
        }

        //making map empty
        map.clear();
        System.out.println("\nAfter clear" + map);
        System.out.println("\nis it now empty? " + map.isEmpty());
    }
}
