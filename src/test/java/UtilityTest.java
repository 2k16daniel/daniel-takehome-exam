import exam.daniel.takehome.module.common.CryptoUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UtilityTest {
    @Test
    public void MD5Test(){
        String desiredResult = "25d55ad283aa400af464c76d713c07ad";
        String input = "12345678";
        String encrypted = CryptoUtil.StringToMD5(input);
        System.out.println("Original: " + input);
        System.out.println("Encrypted MD5: " + encrypted);

        Assertions.assertEquals(desiredResult,encrypted);
    }

    @Test
    public void base64Test(){
        String originalString = "username:12345678";
        String desiredBase64 = "dXNlcm5hbWU6MTIzNDU2Nzg=";

        String encodedString = CryptoUtil.StringToBase64(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Encoded Base64: " + encodedString);

        Assertions.assertEquals(desiredBase64,encodedString);

        String decodedString = CryptoUtil.Base64ToString(encodedString);
        System.out.println("Decoded: " + decodedString);

        Assertions.assertEquals(originalString,decodedString);
    }
}
