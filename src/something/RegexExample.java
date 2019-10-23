package something;

import java.util.regex.Pattern;

/**
 * @author my
 * @ create 2019 -08-15-20:16
 */
public class RegexExample {
    public static void main(String[] args) {
        String content ="I am noob"+ "from runoob.com";
        String pattern =".*runoob.*";
        boolean isMatch= Pattern.matches(pattern,content);
        System.out.println(isMatch);
    }
}
