class Solution {
    public boolean validPalindrome(String s) {
      int f=0; int l=s.length()-1;
        s=s.toLowerCase();int flag=0;
        while(f<l){
            if(s.charAt(f)==s.charAt(l)){
                f++;
                l--;
            }    
            else{
                return (isPal(s,f+1,l) || isPal(s,f,l-1));
            }
        }
        return true;
    }

    public boolean isPal(String s, int f, int l){
         while(f<l){
            if(s.charAt(f)!=s.charAt(l)){
                return false;
            } 
            f++;
            l--; 
    }
    return true;
}
}