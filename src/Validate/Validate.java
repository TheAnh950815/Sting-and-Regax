package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static void main(String[] args) {
        String[] regex = new String[]{"C0318G","C0222G","C022SG"};
        Pattern p = Pattern.compile("[ACP]\\d{4}[G-M]");
        for (int i = 0; i < regex.length; i++) {
            Matcher matcher = p.matcher(regex[i]);
            System.out.println(matcher.matches());
        }
    }
}
