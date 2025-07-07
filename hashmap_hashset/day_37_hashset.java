package hashmap_hashset;

import java.util.HashSet;

/*
set.add(value); Adds value if not present.
set.remove(value); Removes value if present.
set.contains(value); Checks if value is present.
set.size(); Returns number of elements.
set.clear(); Empties the set.
set.isEmpty(); Checks if set is empty.
 */
public class day_37_hashset {
    public static void main(String[] args) {

        //creating set
        HashSet<String> set = new HashSet<>();

        //adding values to set
        set.add("Hardik");
        set.add("Vedanshi");
        set.add("Sweksha");
        set.add("Sukalp");
        set.add("Samriddh");
        set.add("Anil");

        System.out.println("\nInitial hashset: "+set);
        
        //removing element
        set.remove("Anil");
        System.out.println("\nSet after removing Anil: "+ set);

        //check if element is present
        System.out.println("\nContains 'Anil': " + set.contains("Anil"));
        System.out.println("\nContains 'Hardik': " + set.contains("Hardik"));

        //size of set
        System.out.println("is the set empty? "+ set.isEmpty());
        System.out.println("\nSize of set: "+ set.size());

        System.out.print("\nIterating through HashSet: ");
        for(String name: set) System.out.print(name+ " ");
        System.out.println();
        //clearing the set
        set.clear();
        System.out.println("\nSet after removing elements: "+ set);
        System.out.println("\nis the set empty now? "+ set.isEmpty());
    }
}
