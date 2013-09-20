package kata1;

import java.util.Date;

public class Student {
    private String name;
    private Date birthdate;

    public Student(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge (){
        return (int) ((today().getTime() - birthdate.getTime())/getMillisecondsInAYear());
    }
    
    private Date today(){
        return new Date();
    }
    
    private double getMillisecondsInAYear (){
        return 1000*60*60*24*365.25;
    }
}
