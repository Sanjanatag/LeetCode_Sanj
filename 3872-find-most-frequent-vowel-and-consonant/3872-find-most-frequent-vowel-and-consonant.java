class Solution {
    public int maxFreqSum(String s) {
        int o=0; int c=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char k= entry.getKey();
            if(k=='a'|| k=='e'|| k=='i'|| k=='o'|| k=='u'){
               o = Math.max(o, entry.getValue());
            }
            else{
                 c = Math.max(c, entry.getValue());
            }
        }
        return o+c;
    }
}