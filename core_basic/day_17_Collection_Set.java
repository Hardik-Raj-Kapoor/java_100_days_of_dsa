import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class day_17_Collection_Set {
    public static void main(String[] args) {
        //Accepts only unique value
        Set<Integer> nums1 = new HashSet<Integer>();//Collection<Integer> nums1 = new HashSet<Integer>();
        nums1.add(2);
        nums1.add(4);
        nums1.add(1);
        nums1.add(3);
        nums1.add(2);
        nums1.add(1);

        Iterator<Integer> values= nums1.iterator();
        while (values.hasNext()) {
            System.out.print(values.next()+" ");
        }
        System.out.println();
        //ignores duplicates
        for(int n:nums1){
            System.out.print(n+" ");
        }
        System.out.println();
        //for sorted set
        Set<Integer> num = new TreeSet<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(2);
        num.add(1);
        for(int n: num){
            System.out.print(n+" ");
        }
        
    }


}
