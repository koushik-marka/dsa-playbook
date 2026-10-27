class Solution {
    public String[] createGrid(int m, int n) {
        String av[]=new String[m];
        String one=".";
        String open=".";
        for(int i=1;i<n;i++){
            one+="#";
            open+=".";
        }
        for(int i=0;i<av.length-1;i++){
            av[i]=one;
        }
        av[m-1]=open;
        return av;
    }
}