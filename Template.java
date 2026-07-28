package DSA;

import java.io.*;
import java.util.*;

public class Template {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        if (System.getProperty("ONLINE_JUDGE") == null) {
            System.setIn(new FileInputStream("src/input.txt"));
            System.setOut(new PrintStream("src/output.txt"));
        }

        solve();

        out.flush();
    }

    static void solve() throws Exception {
        // Write your logic here
    }
}
