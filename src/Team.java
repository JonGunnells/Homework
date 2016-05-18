/**
 * Created by jonathangunnells on 5/17/16.
 */
/**
 * Created by jonathangunnells on 5/17/16.
 */
public class Team
{
    String memberOneName;
    String memberTwoName;
    String memberThreeName;
    boolean effective;
    int averageIq;

    public Team() {           //default constructor

    }

    public Team(String memOne, String memTwo, String memThree, boolean eff, int iq) { //constructor
        memberOneName = memOne;
        memberTwoName = memTwo;
        memberThreeName = memThree;
        effective = eff;
        averageIq = iq;
    }

    public String getMemberOneName() {           //getter for name
        return memberOneName;
    }

    public void setMemberOneName(String n) {     //setter for name
        memberOneName = n;
    }

    public String getMemberTwoName() {           //getter for name
        return memberTwoName;
    }

    public void setMemberTwoName(String n) {     //setter for name
        memberTwoName = n;
    }

    public String getMemberThreeName() {           //getter for name
        return memberThreeName;
    }

    public void setMemberThreeName(String n) {     //setter for name
        memberThreeName = n;
    }

    public boolean isEffective() {      //getter for effective
        return effective;
    }

    public void isEffective(boolean e) {  //setter for effective
        effective = e;
    }

    public int getAverageIq() {               //getter for averageIq
        return averageIq;
    }

    public void setCalories(int i) {            //setter for averageIq
        averageIq = i;
    }
}
