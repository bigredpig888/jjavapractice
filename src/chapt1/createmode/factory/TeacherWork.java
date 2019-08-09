package chapt1.createmode.factory;

public class TeacherWork implements Work {
    @Override
    public void deWork() {
        System.out.println("老师审查作业");
    }
}
