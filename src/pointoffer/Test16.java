package pointoffer;

/**
 * @author my
 * @ create 2019 -08-20-21:40
 * 题目：定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
 */
public class Test16 {
    public static  class ListNode
    {
        int value;
        ListNode next;
    }
     public  static ListNode reversrList(ListNode head)
     {
        ListNode pre=head;
        ListNode cur=head.next;
        ListNode tmp;
        while( cur!=null)
        {
            tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
         System.out.println("test1");
        head.next=null;
        return  pre;

     }
}
