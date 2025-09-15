class Solution {
    public void reverseString(char[] s) {
         int b=0; int f= s.length-1;
      while(b<f){
        char temp= s[b];
        s[b]=s[f];
        s[f]= temp;
        b++;
        f--;
      }  
    }
}