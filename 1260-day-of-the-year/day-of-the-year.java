class Solution {
    public int dayOfYear(String date) {
        int arr[] ={31,28,31,30,31,30,31,31,30,31,30,31};
        int y=Integer.parseInt(date.substring(0,4));
        int m=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8,10));
        int ans=0;
        int i=0;
        while(i<m-1){
            ans=ans+arr[i];
            i++;
        }
        ans=ans+d;
        if(y%4==0 && y%100!=0 || y%400==0){
            if(m>2){
                ans++;
            }
        }
        return ans;
    }
}