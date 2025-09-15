class Solution {
    public boolean isPalindrome(String s) {
        
       s= s.toLowerCase();
       s= s.replaceAll("[^a-z0-9]","");
        int f=0; int l= s.length()-1;
        while(f<l){
                if(s.charAt(f) != s.charAt(l))
                return false;

                l--; f++;
            }
            return true;
       
 


    }
}