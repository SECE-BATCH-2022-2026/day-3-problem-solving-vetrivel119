import java.io.*;
import java.util.*;

class Twopointer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int result = Tuf.programtocountoccurence(s1,s2);
		System.out.println(result);
}
}

class Tuf{
	public static int programtocountoccurence(String str1,String str2){
	int i = 0; 
    	int j = 0; 
    	int count = 0;

    while (i < str1.length()) {
        if (str1.charAt(i) == str2.charAt(j)) {
            i++;
            j++;

            if (j == str2.length()) {
                count++;
                j = 0; 
            }
        } else {
            i++;
            j = 0;        
        }
    }

    return count;

}
}