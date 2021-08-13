import model.Gender;
import model.User;
import util.StreamAPIUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Poxos", 20, Gender.MALE));
        users.add(new User("Petros", 24, Gender.MALE));
        users.add(new User("Poxosuhi", 25, Gender.FEMALE));
        users.add(new User("Martiros", 28, Gender.MALE));
        users.add(new User("Martirosuhi", 20, Gender.FEMALE));
        users.add(new User("Petrosuhi", 27, Gender.FEMALE));

        // find by gender
        System.out.println(StreamAPIUtil.findByGender(users, Gender.MALE));

        // Sort by age ASK
        System.out.println(StreamAPIUtil.sortByAge(users));

        // Sort by name DESK
        System.out.println(StreamAPIUtil.sortedByNameDesk(users));

        // All Genders
        System.out.println(StreamAPIUtil.matchAllGender(users));

        // Any Genders
        System.out.println(StreamAPIUtil.matchAnyGender(users));

        // Oldest User
        System.out.println(StreamAPIUtil.oldestUser(users));

        // Group by Gender
        System.out.println(StreamAPIUtil.groupByGender(users));
    }
}
