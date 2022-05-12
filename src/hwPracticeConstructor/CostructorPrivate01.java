package hwPracticeConstructor;

public class CostructorPrivate01 {

    private CostructorPrivate01(){

    }

    private static CostructorPrivate01 carname= new CostructorPrivate01 ();

    public static CostructorPrivate01 cnm(){
        return carname;
    }

}
