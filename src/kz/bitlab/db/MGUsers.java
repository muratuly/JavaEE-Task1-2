package kz.bitlab.db;

import java.util.ArrayList;

public class MGUsers {
   private static ArrayList<User> users = new ArrayList<>();

   static {
       users.add(new User("Askar", "Nurzhanov", "IS", 5000));
       users.add(new User("Nursultan", "Kelisuly", "VTIPO", 3000));
       users.add(new User("Aida", "Bilimzharova", "FIN", 4500));
       users.add(new User("Gulnur", "Zhakiyanova", "MAN", 1500));
       users.add(new User("Abay", "Mukhtarov", "SIB", 1000));
       users.add(new User("Enlik", "Tanirbergenova", "DIR", 8000));
       users.add(new User("Aidar", "Baskov", "ADM", 7700));
       users.add(new User("Madina", "Guldariya", "CS", 6500));
   }
   public static ArrayList<User> getAllUsers(){
       return users;
   }
}
