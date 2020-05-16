package bean;

public class MaximalSquareMeth_3 {
	private static int fun(char[][] matrix) {
	    if(matrix.length == 0)
	    	return 0;
	    int m = matrix.length, n = matrix[0].length, max= 0;
	    int[][] res = new int[m+1][n+1];
	    for (int i = 1 ; i <= m; i++) {
	        for (int j = 1; j <= n; j++) {
	            if(matrix[i-1][j-1] == '1') {
	                res[i][j] = Math.min(Math.min(res[i][j-1] , res[i-1][j-1]), res[i-1][j]) + 1;
	                max= Math.max(res[i][j], max);
	            }
	        }
	    }
	    return max*max;
	}
	public static void main(String[] args) {
		char [][]matrix= {{'1'}};

        System.out.println(fun(matrix));

	}

}
