class Solution {
    public int countSquares(int[][] matrix) {
        if(matrix.length==0){
            if(matrix[0].length==1){
                if(matrix[0][0]==1) return 1;
                else return 0;
            }
            else{
                int ans=0;
                for(int i=0;i<matrix[0].length;i++){
                    if(matrix[0][i]==1) ans++;
                }
                return ans;
            }
        }

        int ans=0;
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=matrix[i][j]+Math.min(Math.min(matrix[i][j-1],matrix[i-1][j]),matrix[i-1][j-1]);
                    ans+=matrix[i][j];
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            ans+=matrix[0][i];
        }
        for(int i=1;i<matrix.length;i++){
            ans+=matrix[i][0];
        }
        return ans;
    }
}