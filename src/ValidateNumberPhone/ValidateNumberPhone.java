package ValidateNumberPhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        String numberPhone = new String("(84)-(0978489648)");
        Pattern pattern = Pattern.compile("[(][0-9]{2}[)][-][(][0][0-9]{9}[)]");
        Matcher matcher = pattern.matcher(numberPhone);
        System.out.println(matcher.matches());
    }
}
