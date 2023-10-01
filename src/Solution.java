//import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "1234\n" +
                            "20";
        //System.out.println(mockInput);
        Scanner scanner = new Scanner(mockInput);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        System.out.println(a.add(b)); 
        System.out.println(a.multiply(b));
        scanner.close();

    }
}
