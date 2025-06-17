import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class day_17_Collection_ArrayList {
    //allows same values
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        //does not support index value: Collections
        //support index value: List
        List<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println(num.indexOf(2));
        System.out.println(num.get(2));
        
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
