package pointoffer;

/**
 * @author my
 * @ create 2019 -08-20-21:18
 */
public class Test15 {
  public static class ListNode{
      int value;
      ListNode next;
  }
  public ListNode FindKthToTail(ListNode head,int k)
  {
      if(head==null||k==0)
          return  null;
      ListNode temp=head;
      ListNode pre=head;
      ListNode last=head;
     for(int i=1;i<k;i++)
     {
         if(temp.next!=null)
         {
             pre=pre.next;
         }
         else {
             return null;
         }
     }
      while(pre.next!=null)
      {
          pre=pre.next;
          last=last.next;
      }
      return  last;
  }

}
