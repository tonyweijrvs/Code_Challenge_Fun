import java.util.regex.Pattern;

/**
 * Check if a String contains only digits
 */
public class CheckStringonlyContainsDigits {
  public boolean onlydigigts(String s){
    Pattern pattern = Pattern.compile(".*[^0-9].*");
    return pattern.matcher(s).matches();
  }
}
