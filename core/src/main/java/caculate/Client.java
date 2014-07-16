package caculate;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dchen on 7/15/14.
 */
public class Client {


    private ICaculator caculator;
    @Autowired
    public void setCaculator(ICaculator caculator) {
        this.caculator = caculator;
    }

    public String add(String add1, String add2) {
        //ICaculator caculator = new AddCaculator();


        return caculator.add(add1, add2);


    }
}


