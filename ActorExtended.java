import java.util.ArrayList;


public class ActorExtended {

    //Initializing variables
    private String name;
    private String address;
    private int age;
    private ArrayList<Film> myFilm;

    // class constructor
    public ActorExtended(String actorName, String address, int age, ArrayList<Film> list) {
        setName(actorName);
        setAddress(address);
        setAge(age);
        setFilm(list);
    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setFilm(ArrayList list) {
        this.myFilm = new ArrayList<>();
        this.myFilm = list;
    }
    
    //Getters
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public int getAge() {
        return this.age;
    }
    public ArrayList<Film> getFilm() {
        return this.myFilm;
    }


    public String toString() {
        return "Name: " + getName() + "\nAddess: " + getAddress() + "\nAge: " + getAge();
    }

    public void print() {
        System.out.println(toString() + "\nMovies:");

        for (Film p : getFilm()) {
            if (p.equals("")) {
                System.out.println("No movies");
                return;
            }
            System.out.println(p);
        }
    }


}


