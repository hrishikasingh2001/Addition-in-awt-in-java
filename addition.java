import java.awt.*;  
import java.awt.event.*;  
class addition extends Frame implements ActionListener{  
TextField tf1,tf2;  
Label l1,l2,l3;
addition(){  
l1 = new Label("First label");
l2 = new Label("Second label");
l1.setBounds(10,50,100,30);
l2.setBounds(10,100,100,30);
l3 = new Label();
l3.setBounds(10,200,300,30);
add(l1);
add(l2);
add(l3);
tf1=new TextField();  
tf1.setBounds(150,50,250,30); 
tf2=new TextField();
tf2.setBounds(150,100,250,30); 
Button b=new Button("Addition");  
b.setBounds(300,400,100,30);  
  
  
b.addActionListener(this);//passing current instance  
  

add(b);add(tf1);add(tf2);;  
setSize(1000,600);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
String s1 = tf1.getText();
String s2 = tf2.getText();
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a+b;
String res = String.valueOf(c); 
l3.setText("The addition of two number is:"+res);
}  
public static void main(String args[]){  
addition a = new addition();  
}  
} 