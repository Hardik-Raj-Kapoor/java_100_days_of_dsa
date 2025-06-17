import java.util.Arrays;
import java.util.List;
// import java.util.stream.Stream;

public class day_17_stream {
    public static void main(String[] args) {
        // List<Integer> nums = Arrays.asList(4,8,10,11,1,2,7);
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n->n%2==0);//filters the value based on the logic
        // Stream<Integer> s3 = s2.map(n->n*2);//Map is used to perform certain operations
        // int result=s3.reduce(0,(c,e)->c+e);
    	// //Stream can only be used once
        // //does not affects the List
    	// nums.forEach(n -> System.out.print(n+" "));
        
        // System.out.println("Stream:");
        // s1.forEach(n ->System.out.print(n+" "));
        // System.out.println("Stream Filter: ");
        // s2.forEach(n-> System.out.print(n+" "));
        // System.out.println("Stream Map: ");
        // s3.forEach(n-> System.out.print(n+" "));
        // System.out.println("Stream Reduce: "+result);
        
        List<Integer> num = Arrays.asList(4,8,10,11,1,2,7);

        int result_main = num.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        .reduce(0,(c,e)->c+e);
                        //.sorted can be used to sort values
        System.out.println(result_main);
    }
}
