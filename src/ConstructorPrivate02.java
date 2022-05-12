public class ConstructorPrivate02 {

    private ConstructorPrivate02(){
    }

    private static ConstructorPrivate02 foodname = new ConstructorPrivate02();

    public static ConstructorPrivate02 fnm(){
        return foodname;

    }
}
