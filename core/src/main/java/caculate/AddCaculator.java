package caculate;

import caculate.Validator;

/**
 * Created by dchen on 7/14/14.
 */
public class AddCaculator implements ICaculator {
    @Override
    public String add(String add1, String add2) {
        String result="error";
        if (Validator.verify(add1) && Validator.verify(add1)) {
            result=String.valueOf(Integer.parseInt(add1)+Integer.parseInt(add2));

        }

        return result;
    }

}
