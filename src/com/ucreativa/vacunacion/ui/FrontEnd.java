package com.ucreativa.vacunacion.ui;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String title){
        super(title);
    }

    public void build(){
        this.screenMaker();
        this.componentMaker();
        super.setVisible(true);
    }

    private void screenMaker(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,200);
        super.setLayout(new GridLayout(5,2));
    }

    private void componentAg(Component component){
        super.getContentPane().add(component);
    }

    private void componentMaker(){
        //labels
        JLabel lblName = new JLabel("Name:");
        JLabel lblIDNumber = new JLabel("ID Number:");
        JLabel lblAge = new JLabel("Your age:");
        JLabel lblRisk = new JLabel("Risk factor?");
        JLabel lblIsFriend = new JLabel("Friend?");
        JLabel lblFriendRelationship = new JLabel("Friend relationship:");
        JLabel lblFacebookAcct = new JLabel("FaceBook account:");
        JLabel lblRelationship = new JLabel("Relationship:");
        JLabel lblBrand = new JLabel("Brand:");

        //Inputs
        JTextField txtName = new JTextField();
        JTextField txtIDNumber = new JTextField();
        JTextField txtAge = new JTextField();
        JCheckBox txtRisk = new JCheckBox();
        JTextField txtFriendRelationship = new JTextField();
        JTextField txtFaceBookAcct = new JTextField();
        JTextField txtRelationship = new JTextField();
        JTextField txtBrand = new JTextField();
        JCheckBox txtIsFriend = new JCheckBox();
        txtIsFriend.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblRelationship.setVisible(!txtIsFriend.isSelected());
                txtRelationship.setVisible(!txtIsFriend.isSelected());
                lblFriendRelationship.setVisible(txtIsFriend.isSelected());
                txtFriendRelationship.setVisible(txtIsFriend.isSelected());
                lblFacebookAcct.setVisible(txtIsFriend.isSelected());
                txtFaceBookAcct.setVisible(txtIsFriend.isSelected());
            }
        });

        //Buttons
        JButton save = new JButton("Save");
        save.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                try {
                    service.save(txtName.getText(),txtIDNumber.getText(),
                            txtAge.getText(), txtRisk.isSelected(),
                            txtIsFriend.isSelected(),txtFriendRelationship.getText(),
                            txtFaceBookAcct.getText(),txtRelationship.getText(),
                            txtBrand.getText());

                    txtName.setText(""); ;
                    txtIDNumber.setText("");
                    txtAge.setText("");
                    txtRisk.setText("");
                    txtIsFriend.setText("");
                    txtFriendRelationship.setText("");
                    txtFaceBookAcct.setText("");
                    txtRelationship.setText("");
                    txtBrand.setText("");

                    String report = String.join("n",service.get());
                    JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(),report);
                } catch (ErrorEdadException error) {
                    JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(),error.getMessage());
                }
            }
        });

        //UI
        this.componentAg(lblName);
        this.componentAg(txtName);
        this.componentAg(lblIDNumber);
        this.componentAg(txtIDNumber);
        this.componentAg(lblAge);
        this.componentAg(txtAge);
        this.componentAg(lblRisk);
        this.componentAg(txtRisk);
        this.componentAg(lblIsFriend);
        this.componentAg(txtIsFriend);
        this.componentAg(lblFriendRelationship);
        this.componentAg(txtFriendRelationship);
        this.componentAg(lblFacebookAcct);
        this.componentAg(txtFaceBookAcct);
        this.componentAg(lblRelationship);
        this.componentAg(txtRelationship);
        this.componentAg(lblBrand);
        this.componentAg(txtBrand);
        this.componentAg(save);


    }

}
