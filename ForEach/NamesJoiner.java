import java.util.ArrayList;
import java.util.StringJoiner;

public class NamesJoiner {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Soumya");
        names.add("Rahul");
        names.add("Priya");
        names.add("Kiran");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}