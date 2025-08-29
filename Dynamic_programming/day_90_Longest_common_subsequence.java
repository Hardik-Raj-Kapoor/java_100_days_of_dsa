package Dynamic_programming;

public class day_90_Longest_common_subsequence {
    public static String findLCS(String X, String Y){
        int m = X.length();
        int n = Y.length();

        int L[][] = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                if(i==0||j==0) L[i][j] = 0;
                else if(X.charAt(i-1) == Y.charAt(j-1)){
                    L[i][j] = L[i-1][j-1]+1;
                }
                else{
                    L[i][j] = Math.max(L[i-1][j],L[i][j-1]);
                }
            }
        }

        int lcslength = L[m][n];

        char[] lcschar = new char[lcslength];
        int index = lcslength - 1;

        int i=m,j=n;
        while (i>0 && j>0){
            if(X.charAt(i-1) == Y.charAt(j-1)){
                lcschar[index] = X.charAt(i-1);
                index--;
                i--;
                j--;
            }
            else if(L[i-1][j]>L[i][j-1]) i--;
            else j--;     
        }
        return new String(lcschar);
    }
    
    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCABA";

        String lcs = findLCS(X, Y);

        System.out.println("String X: " + X);
        System.out.println("String Y: " + Y);
        System.out.println("LCS Length: " + lcs.length());
        System.out.println("LCS: " + lcs);
    }
}
