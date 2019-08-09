package chapt1.createmode.factory;

public class Test {
    public static void main(String[] args)
    {
        IWorkFactory  stu=new StudentWorkFactory();
         stu.getWork().deWork();
         IWorkFactory tea=new TeacherWorkFactory();
         tea.getWork().deWork();



    }
}
