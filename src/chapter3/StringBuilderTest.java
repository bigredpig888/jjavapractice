package chapter3;

public class StringBuilderTest {
    public static void main(String[] args)
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("ssss");
        stringBuilder.append("ppppp");
        System.out.println(stringBuilder);
        int age=99;
        String name="wangjie";
        String message=String.format("Hello ,%s next year you will bi %d",name,age);
 System.out.println(message);

    }
}
