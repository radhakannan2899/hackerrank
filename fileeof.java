import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int line_num = 0;
        Scanner input=new Scanner(System.in);
        while(input.hasNext())
            System.out.println(++line_num + " " + input.nextLine());
        input.close();
    
    }
}
