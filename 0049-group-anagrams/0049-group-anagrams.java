class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map= new HashMap<>();
        for(String s: strs){
            int count[] = new int[26];
            char[] charA= s.toCharArray();
            for(char c: charA){
                count[c-'a']++;
            }
            String abc= Arrays.toString(count);
            map.putIfAbsent(abc, new ArrayList<>());
            map.get(abc).add(s);
        }
        return new ArrayList<>(map.values()); 
    }
}