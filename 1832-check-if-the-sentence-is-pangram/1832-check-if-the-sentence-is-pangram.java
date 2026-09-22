class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean temp[] = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            temp[sentence.charAt(i)-'a'] = true;
        }
        for(int i=0;i<26;i++){
           if(!temp[i])
           {
            return false;
           }
        }
        return true;
    }
}