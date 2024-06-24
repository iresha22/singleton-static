public class Main {

    private static User user;

    public static User myUser(){
        if(user == null){
            user = new User("Name",0);
        }
        return user;
    }

    public static void main(String[] args) {

        User user1 = Main.myUser();
        System.out.println("default " +user1);

        User user2 = Main.myUser();
        user2.setName("iresha");
        user2.setAge(22);
        System.out.println(user2);

    }
}
