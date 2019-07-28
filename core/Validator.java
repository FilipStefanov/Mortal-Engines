package core;

public class Validator {


    public static boolean validateStringName(String name){

        if (name == null || name.equals("")){
            return false;
        }
        return true;

    }
}
