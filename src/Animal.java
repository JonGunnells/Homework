/**
 * Created by jonathangunnells on 5/17/16.
 */
public class Animal
{
    String name;
    String species;
    boolean alive;
    boolean carnivore;
    int age;

    public Animal() {           //default constructor
        name = "john doe";
    }

    public Animal( String n, String s, boolean f, boolean a, boolean c, int g) {   //constructor with parameters
        name = n;
        species = s;
        alive = a;
        carnivore = c;
        age = g;
    }

    public String getName() {           //getter for name
        return name;
    }

    public void setName(String n) {     //setter for name
        name = n;
    }

    public String getSpecies() {        //getter for species
        return species;
    }

    public void setSpecies(String s) {  //setter for species
        species = s;
    }

    public boolean isCarnivore() {      //getter for boolean carnivore
        return carnivore;
    }

    public void isCarnivore(boolean c) {  //setter for boolean carnivore
        carnivore = c;
    }

    public int getAge() {               //getter for age
        return age;
    }

    public void setAge(int a) {            //setter for age
        age = a;
    }
}