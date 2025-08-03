package SACS;
import javax.swing.JOptionPane;

public class citizen extends user {
    public citizen(String role) {
        
        super(role); // Call the constructor of the superclass with role and balance
    }
    @Override
    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Citizen role: " + role );
        //System.out.println("Balance: " + balance);
    }
    
}
