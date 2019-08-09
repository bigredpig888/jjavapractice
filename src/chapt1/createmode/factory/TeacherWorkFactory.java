package chapt1.createmode.factory;

public class TeacherWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
