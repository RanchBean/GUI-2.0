package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class GUIFrame extends JFrame
{

	private GUIController mainController;
	private GUIPanel mainPanel;
	
	public GUIFrame(GUIController mainController)
	{
		this.mainController = mainController;
		mainPanel = new GUIPanel(mainController);
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(mainPanel);
		this.setTitle("Fallout 4 Music");
		this.setSize(420,420);
		this.setResizable(false);
		this.setVisible(true);
	}
}
