class Solution {
    public String longestCommonPrefix(String[] strs) {
         StringBuilder ans = new StringBuilder();
       // Boolean flag=true;
        for(int j=0; j< strs[0].length(); j++){
         for(int i=0;i<strs.length;i++){
            if (strs[i].length() == 0) return "";
            if(j >= strs[i].length() || strs[i].charAt(j)!=strs[0].charAt(j)){
           //    flag=false;
               return ans.toString();
            }
        }
        ans.append(strs[0].charAt(j));
        }
        return ans.toString();
    }
}