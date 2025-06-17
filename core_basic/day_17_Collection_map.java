import java.util.HashMap;
import java.util.Map;

public class day_17_Collection_map {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        //key must be unique
        students.put("Hardik",98);
        students.put("Sukalp",82);
        students.put("Samriddh",76);
        students.put("Abcdef",78);
        students.put("Sukalp",92);
    
        System.out.println(students);
        System.out.println(students.get("Hardik"));
        System.out.println(students.keySet());

        for(String key: students.keySet())
        System.out.println(key+" : "+ students.get(key));
    
    }
}
