package hwPracticeConstructor;

public class ConstructoorPublic01 {

    String name;      // declaring variables
    int age;
    String address;
    double zip;

    ConstructoorPublic01 (String name, int age, String address, double zip) { //creating constructor

        this.name = name;        // syntax of constructor by this.(variable = value)
        this.age = age;
        this.address = address;
        this.zip = zip;

        System.out.println("Client name is: "+name+", "+"Age is: "+age+", "+"Address is: "+address+", "+"Zip code is: "+zip+"/");   // create concatenation
    }

    public static void main(String[] args) {   // calling main method

        ConstructoorPublic01 p1 = new ConstructoorPublic01("Dalim",44,"IND,CA",92346.76);  //passing argument
        ConstructoorPublic01 p2 = new ConstructoorPublic01("Tahmina",33,"NY", 123.51);
        ConstructoorPublic01 p3 = new ConstructoorPublic01("Fouzia", 35,"VG", 478.231);
        ConstructoorPublic01 p4 = new ConstructoorPublic01("Rashed", 37, "Virginia", 233.322);
        ConstructoorPublic01 p5 = new ConstructoorPublic01("Ismat", 40, "NY", 968.12);
    }

}
