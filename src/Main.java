import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        MainContext context = new MainContext();
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            input = br.readLine();
            if(input.length() > 0) {
                context.event(input);
            }
        }
    }
}
