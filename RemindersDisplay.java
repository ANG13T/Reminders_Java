import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RemindersDisplay {
	private JFrame frame;
	private JPanel panel;
	private JPanel list;
	private JMenuBar menubar;
	
	
	public static void main(String[] args) {
		new RemindersDisplay().start();
	}
	
	public void start() {
		list = new JPanel();
		list.setLayout(new BoxLayout(list, BoxLayout.Y_AXIS));
		///
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		///
		menubar = new JMenuBar();
		menubar.setBackground(Color.GRAY);
		JMenu fileSave = new JMenu("Save");
		JMenu fileImport = new JMenu("Import");
		menubar.add(fileSave);
		menubar.add(fileImport);
		///
		JLabel title = new JLabel("Reminders");
		title.setForeground(Color.RED);
		title.setFont(new Font("sanserif", Font.BOLD, 60));
		panel.add(title);
		///
		JTextField textfield = new JTextField();
		textfield.setSize(450, 50);
		panel.add(textfield);
		///
		JButton enter = new JButton("OK");
		enter.setFont(new Font("arial", Font.PLAIN, 30));
		enter.setBackground(Color.GRAY);
		enter.setForeground(Color.WHITE);
		enter.setOpaque(true);
		enter.setBorderPainted(false);
		panel.add(enter);
		///
		frame = new JFrame("Reminders");
		frame.setJMenuBar(menubar);
		frame.setSize(1200, 900);
		frame.getContentPane().add(panel);
		frame.getContentPane().add(list);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
