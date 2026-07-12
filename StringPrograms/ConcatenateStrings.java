public class ConcatenateStrings {

    public static void main(String[] args) {

        String a = "Sachin";
        String b = "Tendulkar";

        if (a.charAt(a.length() - 1) == b.charAt(0))
            System.out.println((a + b.substring(1)).toLowerCase());
        else
            System.out.println((a + b).toLowerCase());
    }
}