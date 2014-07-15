package caculate;

/**
 * Created by dchen on 7/14/14.
 */
public class Validator {
    public static boolean verify(String add1) {
        boolean flag=false;
        try {
            int number=Integer.parseInt(add1);
            if (number >= 0 && number <= 100) {
                flag=true;
            }


        }catch (Exception e){
            return flag;
        }

        return  flag;

    }
}
