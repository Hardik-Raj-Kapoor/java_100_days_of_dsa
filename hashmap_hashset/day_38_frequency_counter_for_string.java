package hashmap_hashset;
import java.util.Scanner;
import java.util.HashMap;


/*
 used: getOrDefault(key, defaultValue); 
 which is short for
if(freq.containsKey(key)) value = map.getKey();
else value = defaultValue;
 */

 
class string_freq_count{
    public String freq_count(String input){
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char ch: input.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        for(char ch: freq.keySet()){
            System.out.println(ch+"->"+freq.get(ch));
        }
        return input;
    }
    }

public class day_38_frequency_counter_for_string {
    public static void main(String[] args) {
        string_freq_count freq = new string_freq_count();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.next();
        freq.freq_count(str);
        sc.close();
        
}
}