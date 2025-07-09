package hashmap_hashset;

import java.util.*;

class  group_anagram{
    public List<List<String>> anagram(String[] str){
        if(str == null || str.length == 0) return new ArrayList<>();
        Map<String,List<String>> map =new HashMap<>();
    
        for(String s: str){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
    
            String key = new String(charArray);
        
            if(!map.containsKey(key)) map.put(key,new ArrayList<>());
        
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

}


public class day_39_group_anagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        group_anagram group = new group_anagram();
        System.out.print("Enter Number of String in Array: ");
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0;i<n;i++){
            System.out.print("Enter String at "+i+" : ");
            String temp = sc.next();
            str[i] = temp;
        }
        
        System.out.print("Your Array of Strings: ");
        for(String i : str) System.out.print(i+ " ");

        System.out.println("\nGroup Anagram: "+ group.anagram(str));
        sc.close();
    }

}
