package hwPracticeConstructor;

public class ConstructorPublic02 {

    String name;
    int age;
    String address;
    double zipcode;


    ConstructorPublic02(String name, int age) {

        this.name= name;
        this.age= age;

        System.out.println("Name of the student is "+name+" "+"The age is"+age);

    }

    ConstructorPublic02(String name, int age, String address, double zipcode){

        this.name= name;
        this.age= age;
        this.address= address;
        this.zipcode= zipcode;

        System.out.println("Name of the student is "+name+" "+"The age is"+age+" "+"The address is "+address+" "+"Zip Code is "+zipcode);

    }

    public static void main(String[] args) {

        ConstructorPublic02 ism= new ConstructorPublic02("Ismat", 35);
       ConstructorPublic02 isr= new ConstructorPublic02("Israt",30);
       ConstructorPublic02 dal= new ConstructorPublic02("Dalim", 44);

       ConstructorPublic02 is= new ConstructorPublic02("Ismat",35,"NY",234.764);

    }


}
