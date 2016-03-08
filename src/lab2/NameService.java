package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private final int NO_SPACE_INDEX = -1;
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) {
        String lastName = null;
        

        int index = fullName.indexOf(" ");
        if(index == NO_SPACE_INDEX || fullName == null || fullName.isEmpty()){
            throw new IllegalArgumentException(
                    "Sorry full name requires a first and last name.");
                }
        lastName = fullName.substring(index, fullName.length());
        
        return lastName;
    }
    

    
    
}
