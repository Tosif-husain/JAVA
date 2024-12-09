import javax.swing.*;  
import java.awt.event.*;  

public class swing_radio_13{  
	public static void main(String[] args) {  


		JFrame f=new JFrame("example of radio button");//creating instance of JFrame  
	          
		JLabel l1=new JLabel();
		l1.setBounds(50,50,100,40);	

		JRadioButton r1=new JRadioButton("RED");
		r1.setBounds(50,100,100,40);
		r1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getStateChange()==1)
				{
					l1.setText("You selecetd"+r1.getText());
				}
				
			}
		});

		JRadioButton r2=new JRadioButton("Yellow");
		r2.setBounds(50,150,100,40);
		r2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getStateChange()==1)
				{
					l1.setText("You selecetd"+r2.getText());
				}
			}
		});

		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);		

		
		f.add(l1);
		f.add(r1);
		f.add(r2);
          
		f.setSize(400,400);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  	