package pointoffer;

import java.util.Stack;

/**
 * @author my
 * @ create 2019 -08-19-22:22
 * 题目：用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail 和deleteHead，
 * 分别完成在队列尾部插入结点和在队列头部删除结点的功能。
 */
public class Test07 {
    public static class MList<T>
    {
        private Stack<T> stack1=new Stack<>();
        private  Stack<T> stack2=new Stack<>();
        public  MList()
        {}
        public  void appendTail(T t)
        {
            stack1.add(t);
        }
        public T  deleteHead()
        {
            if(stack2.isEmpty())
            {
                while(!stack1.isEmpty())
                {
                    stack2.add(stack1.pop());
                }
            }
            if(stack2.isEmpty())
            {
                throw new RuntimeException("no more element");
            }
            return  stack2.pop();

        }
    }
}
