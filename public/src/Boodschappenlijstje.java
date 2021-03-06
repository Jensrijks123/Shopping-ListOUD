import java.util.ArrayList;
import java.util.Objects;

public class Boodschappenlijstje {

    private String lijsteNaam;
    private ArrayList<Item> items;
    private ArrayList<User> users;

    public Boodschappenlijstje(String lijsteNaam) {
        this.lijsteNaam = lijsteNaam;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Boodschappenlijstje) {
            Boodschappenlijstje anderLijstje = (Boodschappenlijstje) obj;

            if (this.lijsteNaam.equals(anderLijstje.lijsteNaam)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String getLijsteNaam() {
        return lijsteNaam;
    }

    public void setLijsteNaam(String lijsteNaam) {
        this.lijsteNaam = lijsteNaam;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
