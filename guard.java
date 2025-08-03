package SACS;
import javax.swing.JOptionPane;

public class guard  extends user {

    public guard(String role) {
        super(role); //Assuming the guard has no balance
    }

    @Override
    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Your role: " + role );
        
    }
    
}
