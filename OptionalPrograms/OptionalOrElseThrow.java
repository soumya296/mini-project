import java.util.Optional;

public class OptionalOrElseThrow {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee is null"));

            System.out.println(e);

        } catch (InvalidEmployeeException ex) {

            System.out.println(ex.getMessage());
        }
    }
}