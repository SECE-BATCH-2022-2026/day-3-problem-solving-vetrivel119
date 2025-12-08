package DAY4;

import java.io.*;

public class pr2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(repeatFront(s, n));
    }

    public static String repeatFront(String s, int n) {
        if (n > s.length()) {
            n = s.length();  
        }

        String front = s.substring(0, n);
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            res.append(front);
        }

        return res.toString();
    }
}
