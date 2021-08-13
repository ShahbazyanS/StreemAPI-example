package util;

import model.Gender;
import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIUtil {


    // find by Gender
    public static List<User> findByGender(List<User> users, Gender gender) {
        return users.stream()
                .filter(user -> user.getGender().equals(gender))
                .collect(Collectors.toList());
    }

    // Sort by age ASK
    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }

    // Sort by name DESK
    public static List<User> sortedByNameDesk(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getName).reversed())
                .collect(Collectors.toList());
    }

    // All Genders
    public static boolean matchAllGender(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getGender().equals(Gender.MALE));
    }

    // Any Genders
    public static boolean matchAnyGender(List<User> users) {
        return users.stream()
                .anyMatch(user -> user.getGender().equals(Gender.MALE));
    }

    // Find oldest User
    public static User oldestUser(List<User> users){
        return users.stream()
                .max(Comparator.comparing(User::getAge)).orElse(null);
    }

    // Group by Gender
    public static Map<Gender, List<User>> groupByGender(List<User> users){
        return users.stream()
                .collect(Collectors.groupingBy(User::getGender));
    }
}
