package java11.feature;

import java.util.stream.Collectors;

public class NewStringMethods {

    public static void main(String[] args) {
        String str1 = "";
        System.out.println(str1.isBlank());

        String str2 = "shal";
        System.out.println(str2.isBlank());

        String str = "Today\nis\nTuesday";
        System.out.println(
                str.lines().collect(Collectors.toList()));

        System.out.println(str2.repeat(4));

        String str3 = "       I m  in right";
        System.out.println(str3.stripLeading());

        String str4 = "I m in left            ";
        System.out.println(str4.stripTrailing());

        String str5 = "   I m here            ";
        System.out.println(str5.strip());
    }
}
