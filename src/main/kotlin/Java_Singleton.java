public class Java_Singleton {

    private static final Java_Singleton INSTANCE = new Java_Singleton();

    private Java_Singleton() {
        /* do nothing */
    }

    public Java_Singleton getInstance() {
        return INSTANCE.INSTANCE;
    }

}
