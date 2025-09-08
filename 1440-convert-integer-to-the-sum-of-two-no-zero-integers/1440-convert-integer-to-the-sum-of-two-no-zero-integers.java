class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans= new int[2];
        for(int a=1; a<n; a++){
            int b= n -a;
            if(nonZero(b) && nonZero(a)){
                ans[0]=a;
                ans[1]=b;
                return ans;
            }
        }
        return ans;
    }

    public boolean nonZero(int b){
        if( b==0) return false;
        while(b>0){
            if(b%10==0) return false;
            b/=10;
        }
        return true;
    }
}