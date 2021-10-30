package GUIComponnts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
    public class LoginPanel implements ActionListener {

        JFrame frame;
        final JPasswordField pass;
        final JLabel lbl;
        JLabel lbl1;
        JLabel lbl2;
        JButton login , reset;
        JTextField txt;
        JCheckBox cb;
        JOptionPane op = new JOptionPane();
        LoginPanel(){

            cb = new JCheckBox("Show Password");
            cb.setBounds(110,230,150,30);
            cb.setFocusable(false);
            cb.setBackground(Color.orange);

            lbl = new JLabel();
            lbl.setBounds(10,100,390,30);
            lbl.setFont(new Font("Helvetica",Font.PLAIN,20));

            pass = new JPasswordField();
            pass.setBounds(100,190,200,30);

            lbl1 = new JLabel("UserName");
            lbl1.setBounds(10,150,200,30);
            lbl1.setFont(new Font("consolas",Font.PLAIN,18));
            lbl2 = new JLabel("Password");
            lbl2.setBounds(10,190,200,30);
            lbl2.setFont(new Font("consolas",Font.PLAIN,18));

            login = new JButton("login");
            login.setBounds(80,290,100,30);
            login.setFocusable(false);

            reset = new JButton("Reset");
            reset.setBounds(200,290,100,30);
            reset.setFocusable(false);

            txt = new JTextField();
            txt.setBounds(100,150,200,30);

            frame = new JFrame("Password Example");

            frame.add(pass);
            frame.add(lbl1);
            frame.add(lbl2);
            frame.add(txt);
            frame.add(cb);
            cb.addActionListener(this);
            frame.add(login);
            login.addActionListener(this);
            frame.add(reset);
            reset.addActionListener(this);


            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(430,430);
            frame.setLayout(null);
            frame.getContentPane().setBackground(Color.orange);

            frame.setVisible(true);

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            //login button
            if(e.getSource()==login){
                String data = txt.getText();
                String pass1 = String.valueOf(pass.getPassword());
                if(data.equals("isha")&& pass1.equals("software")){
                    JOptionPane.showMessageDialog(null, "Login Successful");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            }
            //reset button
            if(e.getSource()==reset){
                txt.setText("");
                pass.setText("");
            }
            //show password
            if(e.getSource()==cb){
                if(cb.isSelected()){
                    pass.setEchoChar((char)0); //Setting a value of 0 indicates that
                    //you wish to see the text as it is typed.
                }
                else{
                    pass.setEchoChar('*');
                }
            }

        }

    }
    class Main{
        public static void main(String [] args){
            new LoginPanel();
        }
    }

