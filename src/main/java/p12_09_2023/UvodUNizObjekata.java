package p12_09_2023;

import java.util.ArrayList;

public class UvodUNizObjekata {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Milan", "milan@gmail.com"));
        users.add(new User("Nikola", "nikola@gmail.com"));

//        User milan = new User("Milan", "milan@gmail.com");
//        User nikola = new User("Nikola", "nikola@gmail.com");
//
//        users.add(milan);
//        users.add(nikola);

        for (int i = 0; i < users.size(); i++) {

            User x = users.get(i);
            x.print();

            users.get(i).print();

            String printFormat = users.get(i).getName() + "..." + users.get(i).getEmail();
            System.out.println(printFormat);
        }

    }
}
