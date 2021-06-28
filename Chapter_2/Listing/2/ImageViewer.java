import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 * A program for viewing images.
 * @version 1.30 2019-06-10
 * @author утвс╨ю
 */
public class ImageViewer
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			JFrame frame = new ImageViewerFrame();
			frame.setTitle("ImageViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

/**
 * A frame with a Label to show an image.
 */
class ImageViewerFrame extends JFrame
{
	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 400;

	public  ImageViewerFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// use a label to display the images
		label = new JLabel();
		add(label);
		
		// set up the file chooser
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		
		// set up the menu bar
		JMenuBar menuBar= new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("File");
		menuBar.add(menu);

		JMenuItem openItem = new JMenuItem("open");
		menu.add(openItem);
		openItem.addActionListener(event ->{
			// show file chooser dialog
			int result = chooser.showOpenDialog(null);
			// if file select ed, set it as icor of the label
			if (result == JFileChooser.APPROVE_OPTION)
			{
				String name = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(name));
			}
		});
	
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(event -> System.exit(0));
	}
}
