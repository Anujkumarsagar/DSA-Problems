class Solution {
    public String mergeAlternately(String word1, String word2) {
         int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder result = new StringBuilder();
        int min = Math.min(len1, len2);
        
      for (int i = 0; i < min; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        
        
        if(len1> min){
            result.append(word1.substring(min));
        }
         if(len2> min){
            result.append(word2.substring(min));
        }
        return result.toString();
    }
}