package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }

    // max vaction days is Max_Vacation_Days, minimum is 0
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException  {
        if(daysVacation > MAX_VACATION_DAYS || daysVacation < 0){
            throw new IllegalArgumentException(
                    "Sorry vacation days must be between 0 and " + MAX_VACATION_DAYS);
                }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }
    
    //firstName cannot be null or empty, maximum 15 characters
    public final void setFirstName(String firstName) throws IllegalArgumentException  {
       if(firstName == null || firstName.isEmpty() || 
                firstName.length() > 15){
            throw new IllegalArgumentException(
                    "Sorry firstName is mandatory and must be between 1 and 15 characters");
                }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }
    //lastName cannot be null or empty, maximum 15 characters
    public final void setLastName(String lastName) throws IllegalArgumentException  {
      if(lastName == null || lastName.isEmpty() || 
                lastName.length() > 15){
            throw new IllegalArgumentException(
                    "Sorry lastName is mandatory and must be between 1 and 15 characters");
                }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }
    
    //needs validation
    public final void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
