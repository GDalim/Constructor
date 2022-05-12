package hwPracticeConstructor;

public class ConstructoorPrivate03 {

    private ConstructoorPrivate03(){}

    private static ConstructoorPrivate03 car= new ConstructoorPrivate03();

    public static ConstructoorPrivate03 getCar() {
        return car;
    }



    private static ConstructoorPrivate03 model= new ConstructoorPrivate03();

    public static ConstructoorPrivate03 getModel() {
        return model;
    }


}
