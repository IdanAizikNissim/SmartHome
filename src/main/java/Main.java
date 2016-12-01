import models.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final Object EXIT = "exit";

    public static void main(String[] args) throws IOException {
        Home home = Home.getInstance("10 Downing Street");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        do {
            System.out.println(home);
            input = br.readLine();

        } while (!input.equals(EXIT));
    }
}
