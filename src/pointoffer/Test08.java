package pointoffer;

/**
 * @author my
 * @ create 2019 -08-19-22:28
 */
public class Test08 {
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3, 4, 5, 1, 2｝为｛l ,2, 3, 4, 5}的一个旋转，该数组的最小值为
 *
 * @param numbers 旋转数组
 * @return 数组的最小值
 */
public static int min(int[] numbers)
{
    if(numbers==null||numbers.length==0)
    {
        throw new RuntimeException("Invalid input");
    }
    // 開始處理的第一個位置
    int lo=0;
    //開始處理的最後一個位置
    int hi=numbers.length-1;
    int mi=lo;
   while(lo<hi)
   {
       int mid=lo+(hi-lo)/2;
       if(numbers[mid]>numbers[hi])
       {
           lo=mid-1;
       }else  if(numbers[mid]==numbers[hi])
       {
           hi=hi-1;
       }else {
           hi=mid;111
       }
       return  numbers[lo];
   }

}
}
