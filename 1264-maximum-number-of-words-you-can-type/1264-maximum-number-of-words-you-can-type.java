class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int word=0;
        HashSet<Character> set= new HashSet<>();
        for(int i=0; i<brokenLetters.length();i++){
            set.add(brokenLetters.charAt(i));
        }
        int flag=0;
        for(int i=0; i<text.length();i++){
            if(text.charAt(i)==' '){
                if(flag==0){word++;}
                flag=0;
            } else{
                if(set.contains(text.charAt(i))){
                    flag++;
                }
        }    
    }
    if (flag == 0) word++;
    return word;
}
}