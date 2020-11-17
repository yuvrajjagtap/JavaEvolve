import java.util.Optional;
import java.util.OptionalDouble;

public class Java8Optional {
    public static void main(String[] args) {
        Number n = 3;
        System.out.println(Optional.ofNullable(n).map(Number::doubleValue));

        User usr = new User();
        Address add = new Address();
        //add.setStreet("Biljmer");
        usr.setAddress(add);

        System.out.println(getStreetNewWay(usr));

    }

    public static String getStreetOldWay(User user) {
        String street = "Unknown Street";
        if (user != null) {
            if (user.getAddress() != null) {
                street = user.getAddress().getStreet();
            }
        }
        return street;
    }

    public static String getStreetNewWay(User user) {
        return Optional.ofNullable(user).map(User::getAddress).map(Address::getStreet).orElse("Unknown Street");
    }
}
