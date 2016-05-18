/**
 * Created by jonathangunnells on 5/17/16.
 */
public class Food
{
    String name;
    boolean healthy;
    int calories;

    public Food() {           //default constructor

    }

    public Food(String n, boolean h, int c) { //constructor
        name = n;
        healthy = h;
        calories = c;
    }

    public String getName() {           //getter for name
        return name;
    }

    public void setName(String n) {     //setter for name
        name = n;
    }

    public boolean isHealthy() {      //getter for healthy
        return healthy;
    }

    public void isHealthy(boolean h) {  //setter for healthy
        healthy = h;
    }

    public int getCalories() {               //getter for calories
        return calories;
    }

    public void setCalories(int c) {            //setter for calories
        calories = c;
    }
}
