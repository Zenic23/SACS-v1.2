
package SACS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main {
   public static void main(String[] args){
       SwingUtilities.invokeLater(() -> new main().createAndShowGUI());

   }
   public void createAndShowGUI() {
    //frame setup
    JFrame frame = new JFrame("SACS Application v1.2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800,600);
    frame.setVisible(true);

    //panel setup
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3,1));
    frame.add(panel);

    //loops for section
    for(int i = 0; i < 1; i++){
        //section setup
        JPanel section = new JPanel();
        section.setLayout(new  BoxLayout(section, BoxLayout.Y_AXIS));
        panel.add(section);

        //label setup
        JLabel label = new JLabel("Welcome to SACS Application v1.2" );
        label.setAlignmentX(label.TOP_ALIGNMENT);
        section.add(label);

        //spceing
        section.add(Box.createVerticalStrut(2));

        //textfiled setup
        JTextField textFIeld = new JTextField();
        textFIeld.setText("Enter your profession:-" );
        textFIeld.setPreferredSize(new Dimension(30,150));
        section.add(textFIeld);

        //spacing
        section.add(Box.createVerticalStrut(5));

        //button setup
        JButton button = new JButton("Proceed");
        button.setAlignmentX(button.BOTTOM_ALIGNMENT);
        section.add(button);
        button.addActionListener( ActionListener ->{
            String role1 = new String(textFIeld.getText());

            
                if(role1.equals("Admin")){
                
                //frame setup
                    JFrame adminFrame = new JFrame("Security Panel");
                    adminFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    adminFrame.setSize(250,80);
                    adminFrame.setResizable(false);
                    adminFrame.setVisible(true);

                //panel setup
                    JPanel adminPanel = new JPanel();
                    adminPanel.setLayout(new BoxLayout(adminPanel, BoxLayout.X_AXIS));
                    adminFrame.add(adminPanel);

                //label setup
                    JLabel adminLable = new JLabel("Password ");
                    adminPanel.add(adminLable);
                
                //spacing
                    adminPanel.add(Box.createHorizontalStrut(5));

                //textfield setup
                    JPasswordField adminTextField = new JPasswordField();
                    adminPanel.add(adminTextField);
                
                //button setup
                    JButton adminButton = new JButton("Procced");
                    adminPanel.add(adminButton);
                    adminButton.addActionListener( actionListener ->{
                        String adminPassword = new String(adminTextField.getPassword());
                        String role = new String(textFIeld.getText());
                        
                        
                        
                        security obj = new security(  role, adminPassword);
                        obj.getAccess();


                    });

                


                    
                }
                
                else if(role1.equals("Citizen")){
                //frame setup
                    JFrame adminFrame2 = new JFrame("Security Panel");
                    adminFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    adminFrame2.setSize(250,80);
                    adminFrame2.setResizable(false);
                    adminFrame2.setVisible(true);

                //panel setup
                    JPanel adminPanel2 = new JPanel();
                    adminPanel2.setLayout(new BoxLayout(adminPanel2, BoxLayout.X_AXIS));
                    adminFrame2.add(adminPanel2);

                //label setup
                    JLabel adminLable2 = new JLabel("Password ");
                    adminPanel2.add(adminLable2);
                
                //spacing
                    adminPanel2.add(Box.createHorizontalStrut(5));

                //textfield setup
                    JPasswordField adminTextField2 = new JPasswordField();
                    adminPanel2.add(adminTextField2);
                
                //button setup
                    JButton adminButton2 = new JButton("Procced");
                    adminPanel2.add(adminButton2);
                    adminButton2.addActionListener( actionListener ->{
                        String password = new String(adminTextField2.getPassword());
                        String role = new String(textFIeld.getText());
                        String balance = "";
                        String you = "";
                        
                        
                        
                        security obj = new security( role, password, balance, you );
                        obj.getAccess();


                    });

                }
                     
            
                else if(role1.equals("Guard")){
                    //frame setup
                    JFrame adminFrame3 = new JFrame("Security Panel");
                    adminFrame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    adminFrame3.setSize(250,80);
                    adminFrame3.setResizable(false);
                    adminFrame3.setVisible(true);

                //panel setup
                    JPanel adminPanel3 = new JPanel();
                    adminPanel3.setLayout(new BoxLayout(adminPanel3, BoxLayout.X_AXIS));
                    adminFrame3.add(adminPanel3);

                //label setup
                    JLabel adminLable3 = new JLabel("ID ");
                    adminPanel3.add(adminLable3);
                
                //spacing
                    adminPanel3.add(Box.createHorizontalStrut(5));

                //textfield setup
                    JTextField adminTextField3 = new JTextField();
                    adminPanel3.add(adminTextField3);
                
                //button setup
                    JButton adminButton3 = new JButton("Procced");
                    adminPanel3.add(adminButton3);
                    adminButton3.addActionListener( actionListener ->{
                        String id = new String(adminTextField3.getText());
                        String role = new String(textFIeld.getText());
                        String we = "";
                        
                        
                        
                        security obj = new security(role, id, we);
                        obj.getAccess();


                    });
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid profession");
            }



        });
            
        
    }
   }
}
