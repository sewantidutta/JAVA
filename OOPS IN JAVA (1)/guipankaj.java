import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends JFrame implements ActionListener {
	JButton r;
	JButton g;
	JButton b;
	MyFrame() {
		super("my frame");
		r = new JButton("red");
		g = new JButton("green");
		b = new JButton("blue");
		setLayout(new FlowLayout());
		add(r);
		add(g);
		add(b);
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Container c = getContentPane();
		if(e.getSource() == r) {
			c.setBackground(Color.red);		}
		else if(e.getSource() == g) {
            c.setBackground(Color.green);
		}
		else {
            c.setBackground(Color.blue);
		}
	}
}
class guipankaj {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.setSize(300,300);
		f.setVisible(true);
	}
}
