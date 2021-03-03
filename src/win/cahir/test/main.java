package win.cahir.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String line = reader.readLine();
                System.out.println(line.replace("a", "").replace("A", ""));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
