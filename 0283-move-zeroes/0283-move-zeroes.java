class Solution {
    public void moveZeroes(int[] arr) {
        int n= arr.length;
        int ans [] = new int[n];
        int s=0,e=n-1;
        for(int i=0; i<n;i++){
            if(arr[i]!=0)
            ans[s++]=arr[i];
            else
            ans[e--]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
}