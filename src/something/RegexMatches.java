package something;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author my
 * @ create 2019 -08-15-21:53
 */
public class RegexMatches {
    private static String REGEX="dog";
    private  static String INPUT="The dog says meow. "+"All dogs say meow.";
    private  static String REPLACE="cat";


    public static void main(String[] args) {
 Pattern pattern=Pattern.compile(REGEX);
        Matcher m= pattern.matcher(INPUT);
        INPUT =m.replaceAll(REPLACE);
        System.out.println(INPUT);

    }
}
