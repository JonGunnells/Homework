/**
 * Created by jonathangunnells on 5/17/16.
 */
public class Car
{
    String make;
    boolean slammed;
    boolean fast;
    int weight;
    int mileage;

    public Car() {           //default constructor

    }

    public Car( String m, boolean c, boolean d, int o) { //constructor
        make = m;
        slammed = c;
        fast = d;
        mileage = o;
    }

    public String getMake() {           //getter for make
        return make;
    }

    public void setMake(String m) {     //setter for make
        make = m;
    }

    public boolean isSlammed() {      //getter for slammed
        return slammed;
    }

    public void isSlammed(boolean s) {  //setter for slammed
        slammed = s;
    }
    public boolean isFast() {      //getter for fast
        return fast;
    }

    public void isFast(boolean f) {  //setter for fast
        fast = f;
    }

    public int getMileage() {               //getter for mileage
        return mileage;
    }

    public void setMileage(int m) {            //setter for mileage
        mileage = m;
    }
}