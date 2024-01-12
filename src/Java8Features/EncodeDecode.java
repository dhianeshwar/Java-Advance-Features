package Java8Features;

import java.util.Base64;

public class EncodeDecode {
    public static void main(String[] args) {
        String normalText="A";
        String encodedText= Base64.getEncoder().encodeToString(normalText.getBytes());
        System.out.println(encodedText);

        byte[] decodedBytes=Base64.getDecoder().decode(encodedText);
        String decodedText=new String(decodedBytes);
        System.out.println(decodedText);
    }
}
