package caculate;

/**
 * Created by dchen on 7/15/14.
 */
public class Application {

    public static void main(String args[]) {
        Client client = new Client();
        client.setCaculator(new LinkCaculator());
        System.out.println(client.add("12", "67"));
        client.setCaculator(new AddCaculator());
        System.out.println(client.add("12", "67"));
    }
}

