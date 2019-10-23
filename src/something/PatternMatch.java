package something;

import java.util.regex.Pattern;

/**
 * @author my
 * @ create 2019 -08-15-20:02
 */
public class PatternMatch {

    public static void main(String[] args) {
        Pattern p =Pattern.compile("[/]+");
        String[] result=p.split("Kevin has seen《LEON》seveal times,because it is a good film."
                +"/ 凯文已经看过《这个杀手不太冷》几次了，因为它是一部"
                +"好电影。/名词:凯文。");
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);

        }
    }
}
