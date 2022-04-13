package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    private static String MD5message(String input) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("Extra.MD5");
        byte[] messageDigest = md.digest(input.getBytes());
        BigInteger no = new BigInteger(1, messageDigest);

        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }

        return hashtext;
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));

        String input = buff.readLine().trim();
        System.out.println(MD5message(input));

    }

}
