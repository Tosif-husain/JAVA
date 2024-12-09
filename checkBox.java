import javax.swing.*;
import java.awt.event.*;  


public class checkBox {
  public static void main(String[] args) {
    JFrame f = new JFrame();

    JLabel l = new JLabel();
    l.setBounds(30,50,150,40);
    f.add(l);

    JCheckBox c = new JCheckBox("RED");
    c.setBounds(30,100,150,40);
    f.add(c);

    JCheckBox c1 = new JCheckBox("GREEN");
    c1.setBounds(30,150,150,40);
    f.add(c1);

    JButton b = new JButton("click");
    b.setBounds(30,200,150,40);
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String str = "";
        if(c.isSelected()) {
          str = str+c.getText();
        }
        if(c1.isSelected()) {
          str = str+c1.getText();
        }
        l.setText(str);
      }
    });
    f.add(b);
    

    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);

  }
}