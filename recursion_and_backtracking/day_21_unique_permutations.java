import java.util.*;
class Permutation_1{
    public void permute(int[] num,int index, List<List<Integer>> result){
        if(index == num.length){
            List<Integer> permutation = new ArrayList<>();
            for(int nums: num){
                permutation.add(nums);
            }
            result.add(permutation);
            return;
        }
        Set<Integer> seen = new HashSet<>();
        for(int i = index;i<num.length;i++){
            if(seen.contains(num[i]))continue;
            seen.add(num[i]);
            swap(num,index,i);
            permute(num, index+1, result);
            swap(num,index,i);
        }
    }
    public void swap(int[] num,int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j]=temp;
    }
}
public class day_21_unique_permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of elements in Array: ");
        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter number at index "+i+": ");
            int temp = sc.nextInt();
            num[i]=temp;
        }

        System.out.print("Your Array: ");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        Arrays.sort(num);
        System.out.println();
        List<List<Integer>> result = new ArrayList<>();
        Permutation_1 obj = new Permutation_1();
        obj.permute(num, 0, result);

        for(List<Integer> res: result){
            System.out.println(res);
        }
        sc.close();
    }
}
