import java.util.Arrays;
import java.util.List;

public class day_17_for_each {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,8,10,1,2);
        //    	for(int i=0;i<nums.size();i++)
//    	{
//    		System.out.println(nums.get(i));
//    	}
    	
    	
//    	for(int n: nums)
//    	{
//    		System.out.println(n);
//    	}
    	
    	nums.forEach(n -> System.out.println(n));
    }
}
