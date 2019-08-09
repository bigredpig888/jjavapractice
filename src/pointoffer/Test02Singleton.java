package pointoffer;

public class Test02Singleton {
    public static class Singleton {
        private final static Singleton INSTANCE = new Singleton();

        //        一上来我就把对象给你 new 好了，你来了直接就可以拿去“吃”了
        private Singleton() {
        }

        public static Singleton getInstance() {
            return INSTANCE;
        }

    }

    public static class Singleton2 {
//        一开始我就不给你 new 对象，你来找我，我在给你创建一个对象
//        要是有人问单例的延迟加载方式指的就是这种方式
//        懒汉式有一个缺点，懒汉式有一个缺点就是在/多线程中使用的时候，可能会创建多个实例对象，比如，线程1来调用 getInstance() 方法，判断了 s==null，然后线程1由于未知的原因阻塞了，线程2再来调用 getInstance() 方法，判断 s==null ，线程2就创建了一个对象，这时候线程1又运行了，那么线程1就会创建一个对象~这样就会造成多个对象~

        //        懒汉式的线程优化——加一个锁/
        private static Singleton2 instance = null;

        private Singleton2() {
        }

        public static Singleton2 getInstance() {
            if (instance == null) {
                instance = new Singleton2();
            }
            return instance;
        }

    }

    public static class Singleton3 {
        private static Singleton3 instance = null;

        private Singleton3() {
        }

        public static synchronized Singleton3 getInstance() {
            if (instance == null) {
                instance = new Singleton3();
            }
            return instance;
        }

    }

    public static class Singleton4 {
        private static Singleton4 instance = null;

        static {
            instance = new Singleton4();
        }

        private Singleton4() {
        }

        public static Singleton4 getInstance() {
            return instance;
        }


    }
    public static class Singleton5
    {
        private  final  static class  SingleHolder{
            private static final Singleton5  INSTANCE =new Singleton5();
        }
        private  Singleton5()
        {}
        public  static Singleton5 getInstance()
        {
            return  SingleHolder.INSTANCE;
        }


    }
    public enum Singleton6
    {
        INSTANCE;
        public void whateverMethod()
        {}
    }
    public static class Singleton7
    {
        private volatile static Singleton7 instance =null;
        private  Singleton7()
        {}
        public static Singleton7 getInstance()
        {
            if(instance==null)
            {
                synchronized (Singleton7.class)
                {
                    if(instance==null)
                    {
                        instance=new Singleton7();
                    }
                }
            }
            return  instance;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(Singleton.getInstance()==Singleton.getInstance());
        System.out.println(Singleton.getInstance()==Singleton.getInstance());
        System.out.println(Singleton.getInstance()==Singleton.getInstance());

    }

}




