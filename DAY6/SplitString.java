package DAY6;
import java.util.*;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        String[] parts = s.split(Character.toString(ch));
        String[] op = new String[parts.length];
        int i = 0;
        for (String part : parts) {
           op[i++] = new StringBuilder(part).reverse().toString();
        }
        for (String reversedPart : op) {
            System.out.println(reversedPart);
        }
    }
}
