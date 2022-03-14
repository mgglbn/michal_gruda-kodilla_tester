public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String get_name() {
        return this.name;
    }

    public int get_age() {
        return this.age;
    }

    public static void main(String[] args) {
        User users[] = {
                new User("A", 10),
                new User("B", 15),
                new User("C", 34),
                new User("D", 56),
                new User("E", 75),
                new User("F", 47),
                new User("G", 28),
                new User("H", 35),
                new User("I", 40),
                new User("J", 55)
        };
        int sum = 0;
        for (User user : users) {
            sum += user.get_age();
        }

        double meanAge = Double.valueOf(sum) / Double.valueOf(users.length);

        System.out.println(meanAge);

        for (User user : users) {
            if (user.get_age() < meanAge) {
                System.out.println(user.get_name());
            }
        }
    }
}
