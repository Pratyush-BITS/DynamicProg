package Extra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class SHA_256_Trial {

    private static void printHashCode(String stringForHash) throws Exception {
        try {
            MessageDigest messageDigest= MessageDigest.getInstance("SHA-256");
            messageDigest.update(stringForHash.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash)
                System.out.printf("%02x", b);

        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
        String stringForHash = buff.readLine().trim();
        printHashCode(stringForHash);

    }
}