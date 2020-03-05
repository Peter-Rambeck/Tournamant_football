import Model.*;

public class Main {

    public static void main(String[] args) {
        Team team1 = new Team("Golden Eagels", new String[] {"Jens", "Gustav"});
        Team team2 = new Team("Frozen pinguins", new String[] {"Mogens", "Peter"});
        Team team3 = new Team("Swinging Monkies", new String[] {"Matthias", "Ali"});
        Team team4 = new Team("Jumping Lizards", new String[] {"Emil", "Jack"});
        Team team5 = new Team("Crawling Antz", new String[] {"Ditte", "Murat"});
        Team team6 = new Team("Bad Boyz", new String[] {"Andreas", "Jakob"});
        Team team7 = new Team("Sizzy boys", new String[] {"Mattias", "Robert"});
        Team team8 = new Team("Incoming", new String[] {"Natasja", "Nicolai"});

        System.out.println(team1);

    }
}
