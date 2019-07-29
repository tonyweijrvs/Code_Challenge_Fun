import java.util.Arrays;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    int[] letters = new int[26];
    Arrays.fill(letters,0);
    for (char a:s.toCharArray()){
      letters[a-'a']++;
    }
    for (char b:t.toCharArray()){
      if(letters[b-'a']==0){
        return false;
      }
      letters[b-'a']--;
    }
    return s.length()==t.length();
  }
}
