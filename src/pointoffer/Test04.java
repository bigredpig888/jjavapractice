package pointoffer;

/**
 * @author my
 * @ create 2019 -08-15-22:02
 * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happ
 *
 *
 *
 *
 *
 */

public class Test04 {
    public String replaceSpace(StringBuffer str)
    {
        StringBuffer res=new StringBuffer();
        int len=str.length()-1;
        for(int i=len;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                res.append("02%");
            }
            else
                res.append(str.charAt(i));
        }
        return  res.reverse().toString();

    }



}
