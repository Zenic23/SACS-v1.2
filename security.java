package SACS;
import javax.swing.JOptionPane;

public class security {
    private String id;
    private String adminPassword;
    private String password;
    protected String we;
    protected String you;
    protected String balance;
    protected String role;
    
    
    //Admin constructor
    public security(String role, String adminPassword) { 
        this.role = role;
        
        this.id = null;
        this.password = null;
        this.adminPassword = adminPassword;
        
        
    }
    //Guard constructor
    public security(String role, String id, String we) {
        this.role = role;
        this.id = id;
        this.we = null;
        this.adminPassword = null;
        
    }
    //Citizen constructor
    public security(String role,  String password, String balance, String you) {
        this.role = role;
        this.balance = null;
        this.you = null;
        this.password = password;
        this.adminPassword = null;
    }
    

    

    public security(String role, String id, String password,  String adminPassword, String we, String balance, String you){
        this(role, adminPassword, we);
        this.id = id;
        this.you = you;
        this.we = we;
        this.balance = balance;
        this.password = password;
    }
    
    
    private boolean checkPasswordforAdmin(String adminPassword){
        return this.adminPassword.equals("paradox2021");
    }
    private boolean checkIdforGuards(String id){
        return this.id.equals("2019-0001");
    }
    private boolean checkPasswordforcitizen(String password){
        return this.password.equals("citizen450");
    }
    
    public void getAccess() { //this method checks the password, id, and role of the user and grants access accordingly
        switch(role){
            case "Admin":
                if(checkPasswordforAdmin(this.adminPassword)){
                    user role1 = new Admin(role);
                    role1.displayInfo();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Access denied for Admin. Incorrect password.");
                    return; // Exit if the password is invalid
                }
                break;
            case "Guard":
                 if(checkIdforGuards(this.id)){
                    user role2 = new guard(role);
                    role2.displayInfo();
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "Access denied for Guard. Incorrect ID.");
                     return; // Exit if the ID is invalid
                 }
                 break;
            case "Citizen":
                 if(checkPasswordforcitizen(this.password)){
                    user role3 = new citizen(role); // Assuming balance is not needed for Citizen, using 0
                    role3.displayInfo();
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "Access denied for Citizen. Incorrect password.");
                     return; // Exit if the password is invalid
                 }
                 break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid role. Please enter a valid role (Admin, Guard, Citizen).");
                break;
                         
                

        }
        
        

    }
    
}

