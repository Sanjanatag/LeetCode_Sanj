class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s= new StringBuilder();
        int one=0; int two=0;
        while(one<word1.length() || two<word2.length()){
            if(one<word1.length()){
                s.append(word1.charAt(one));
                one++;
            }
            if(two<word2.length()){
                s.append(word2.charAt(two));
                two++;
            }
        }
        return s.toString();
    }
}