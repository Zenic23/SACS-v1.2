package SACS;

public abstract class user {
    
    String role;
    
    public user(String role) {
        this.role = role;
        
    }

    public abstract void displayInfo();
    
    
}
