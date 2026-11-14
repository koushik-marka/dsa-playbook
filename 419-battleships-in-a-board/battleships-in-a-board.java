class Solution {
    int av=0;
    void dfs(char[][] board,int r,int c){
        if(r<0||c<0||r>=board.length||c>=board[0].length||board[r][c]=='.'){
            return ;
        }
        board[r][c]='.';
        dfs(board,r-1,c);
        dfs(board,r,c-1);
        dfs(board,r+1,c);
        dfs(board,r,c+1);
    }
    public int countBattleships(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='X'){
                    av++;
                    dfs(board,i,j);
                }
            }
        }
        return av;
    }
}