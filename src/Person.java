/**
 * Created by jonathangunnells on 5/17/16.
 */
public class Person
{
    String name;
    String ethnicity;
    boolean alive;
    int age;

    public Person() {           //default constructor
        name = "john doe";
    }

    public Person(String n, String e, boolean a, int i) { //constructor
        name = n;
        ethnicity = e;
        alive = a;
        age = i;
    }

    public String getName() {           //getter for name
        return name;
    }

    public void setName(String n) {     //setter for name
        name = n;
    }

    public String getEthnicity() {           //getter for ethnicity
        return ethnicity;
    }

    public void setEthnicity(String e) {     //setter for ethnicity
        ethnicity = e;
    }

    public boolean isAlive() {      //getter for alive
        return alive;
    }

    public void isAlive(boolean a) {  //setter for alive
        alive = a;
    }

    public int getAge() {               //getter for age
        return age;
    }

    public void setAge(int a) {            //setter for age
        age = a;
    }
}