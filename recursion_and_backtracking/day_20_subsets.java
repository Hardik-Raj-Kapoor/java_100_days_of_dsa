import java.util.*;

class  subset_1{
    public void Backtrack(int index, int[] num, List<Integer> current, List<List<Integer>> result){
        result.add(new ArrayList<>(current));// saving currennt subset
        for(int i=index;i<num.length;i++){
            current.add(num[i]);//choosing a number

            Backtrack(i+1,num,current,result); //Going forwward
            current.remove(current.size()-1); // backtracking(undoing the choice)
        }
    }
}


public class day_20_subsets {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements you want in an array: ");
        int n = sc.nextInt();
        //araay creation
        int[] num = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter Elements: ");
            int temp = sc.nextInt();
            num[i] = temp;
        }

        //array printing
        System.out.print("Elements: ");
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        
        //result = list of list
        List<List<Integer>> result= new ArrayList<>();

        subset_1 obj = new subset_1();

        obj.Backtrack(0, num, new ArrayList<Integer>(), result);//Starting from 0 index
        System.out.println();
        //printing all subsets
        for (List<Integer> subset : result) {
            System.out.print(subset +" ");
        }
        sc.close();
    }
}
