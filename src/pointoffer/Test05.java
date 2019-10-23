package pointoffer;

import java.util.Stack;

/**
 * @author my
 * @ create 2019 -08-19-20:05
 */
public class Test05 {
    public static class ListNode{
        int val;
        ListNode next;
    }
    public static void printListInverselyUsingIteration(ListNode root)
    {
        Stack<ListNode> stack=new Stack<>();
        while(root!=null)
        {
            stack.push(root);
            root= root.next;
        }
        ListNode tmp;
        while(!stack.isEmpty())
        {
            tmp=stack.pop();
            System.out.println(tmp.val+"  ");
        }

    }
    public static void printListInverselyUsingRecursion(ListNode root)
    {
        if(root!=null)
        {
            printListInverselyUsingRecursion(root.next);
            System.out.println(root.val+"  ");
        }
    }
    public static void main(String[] args) {
        ListNode root = new ListNode();
        root.val = 1;
        root.next = new ListNode();
        root.next.val = 2;
        root.next.next = new ListNode();
        root.next.next.val = 3;
        root.next.next.next = new ListNode();
        root.next.next.next.val = 4;
        root.next.next.next.next = new ListNode();
        root.next.next.next.next.val = 5;

        printListInverselyUsingIteration(root);
        System.out.println();
        printListInverselyUsingRecursion(root);
    }

}
