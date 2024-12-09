import java.awt.event.*;
import javax.swing.*;  


public class combo{
  public static void main(String[] args) {
    JFrame f = new JFrame();
     
    JLabel l = new JLabel();
    l.setBounds(50,50,100,40);
    f.add(l);

    String country[] = {"IND","PAK","AUS","SA","NZ"};

    JComboBox c = new JComboBox(country);
    c.setBounds(50,100,100,40);
    f.add(c);

    JButton b = new JButton("OK");
    b.setBounds(50,150,100,40);
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String data = (c.getItemAt(c.getSelectedIndex())).toString();
        l.setText(data);
      }
    });
    f.add(b);

    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
  }
}