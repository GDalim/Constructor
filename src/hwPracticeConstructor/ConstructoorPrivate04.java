package hwPracticeConstructor;

public class ConstructoorPrivate04 {

    private ConstructoorPrivate04(){}  //default constructor

    private static ConstructoorPrivate04 flower = new ConstructoorPrivate04();

    public static ConstructoorPrivate04 getFlower() {
        return flower;
    }

    private static ConstructoorPrivate04 color = new ConstructoorPrivate04();

    public static ConstructoorPrivate04 getColor() {
        return color;
    }

    private static ConstructoorPrivate04 size = new ConstructoorPrivate04();

    public static ConstructoorPrivate04 getSize() {
        return size;
    }
}

/** this is SINGLE TONE constructor
 * can search youtube videos
 * this is also can called as default private constructor
 */