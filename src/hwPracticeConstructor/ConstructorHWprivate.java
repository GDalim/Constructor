package hwPracticeConstructor;

public class ConstructorHWprivate {


    private ConstructorHWprivate() {

        System.out.println("Hi there");
    }

    private static ConstructorHWprivate pv = new ConstructorHWprivate(); //creating an object on private

    public static ConstructorHWprivate getins() {       // creating a return method on public
        // return method + syntax (access modifier datatype/classname(we used as we have no datatype)+ method name + parenthesis
        return pv;


    }

}






    //** Method
    // return method with parameter
    // return method without parameter
    // nonreturn method with parameter
    // nonreturn method without parameter


