class Solution {
    boolean ans=false;
    void find(int i,int j,char board[][],String word,int idx){
        if(idx>=word.length()){
            ans=true;
            return;
        }
        if(ans) return;
        if(i<0 || j<0 || i>=board.length || j>=board[i].length){
            return;
        }
        
        if(board[i][j]!=word.charAt(idx)){
            return;
        }
        char t=board[i][j];
        board[i][j]='*';
        find(i-1,j,board,word,idx+1);
        find(i+1,j,board,word,idx+1);
        find(i,j+1,board,word,idx+1);
        find(i,j-1,board,word,idx+1);
        board[i][j]=t;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    find(i,j,board,word,0);
                    if(ans) return true;
                }
            }
        }
        return ans;
    }
}