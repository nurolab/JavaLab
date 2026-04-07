public class Quine {
    public static void main(String[] args) {
        char q = 34;
        String[] s = {
            "public class Quine {",
            "public static void main(String[] args) {",
            "char q = 34;",
            "String[] s = {",
            "};",
            "for (int i = 0; i < 4; i++) System.out.println(s[i]);",
            "for (int i = 0; i < s.length; i++) System.out.println(q + s[i] + q + ',');",
            "for (int i = 4; i < s.length; i++) System.out.println(s[i]);",
            "}",
            "}"
        };
        for (int i = 0; i < 4; i++) System.out.println(s[i]);
        for (int i = 0; i < s.length; i++) System.out.println(q + s[i] + q + ',');
        for (int i = 4; i < s.length; i++) System.out.println(s[i]);
    }
}
