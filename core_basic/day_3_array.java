public class day_3_array {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};//1D array
        arr[0] = 0;
        System.out.println(arr[0]);
        for(int i=0;i<=3;i++){
        System.out.println(arr[i]);
        }

        int[][] arr2 = new int[2][2];
        arr2[0][0] = 1;//2D array
        arr2[0][1] = 2;
        arr2[1][0] = 3;
        arr2[1][1] = 4;

        arr2[0][0] = 0;
        System.out.println(arr2[0][0]);
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.print(arr2[i][j]);
            }
        }
        // int[][][] arr3 = new int[2][3][1];//3D Array
        // arr3[0][0][0] = 0;
        // System.out.println(arr3[0][0][0]);
        // for(int i=0;i<=1;i++){
        //     for(int j=0;j<=1;j++){
        //         for(int k=0;k<=1;k++){
        //             System.out.print(arr3[i][j][k]);
        //     }
            }
        
    }
