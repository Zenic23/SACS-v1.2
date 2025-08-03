package SACS;
import javax.swing.JOptionPane;

public class Admin extends user {
    
    public Admin(String role) {
        super(role); // Assuming balance is not needed for Admin, using 0
    }
    @Override
    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Admin role: " + role);
        
    }
}
