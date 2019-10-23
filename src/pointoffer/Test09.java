package pointoffer;

/**
 * @author my斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * @ create 2019 -08-19-22:46
 */
public class Test09 {
    public  long  Fibonacci(int n)
    {
       long result=0;
       long preOne=1;
       long preTwo=0;
       if(n==0)
       {
           return preTwo;
       }
       if (n==1)
       {
           return (int) preOne;
       }
       for (int i=2;i<=n;i++)
       {
           result=preOne+preTwo;
           preTwo=preOne;
           preOne=result;
       }
       return  result;
    }
}
