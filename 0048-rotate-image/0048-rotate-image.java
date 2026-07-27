class Solution {
    public void rotate(int[][] matrix) {
        int[][] final_matrix=new int[matrix.length][matrix[0].length];
        for(int i=matrix.length-1;i>=0;i--)
        {
            for(int j=0;j<matrix[0].length;j++ )
            {
                final_matrix[j][matrix.length-1-i]=matrix[i][j];
            }
        }
        for(int i = 0; i < matrix.length; i++) 
        {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = final_matrix[i][j];
            }
        }
    }
}