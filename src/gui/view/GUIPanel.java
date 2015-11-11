package gui.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import gui.controller.GUIController;
import java.awt.Color;

public class GUIPanel extends JPanel
{

	private GUIController mainController;
	private JButton falloutButton;
	private JTextField falloutText;
	private SpringLayout mainLayout;
	
	public GUIPanel(GUIController mainController)
	{
		this.mainController = mainController;
		mainLayout = new SpringLayout();
		falloutButton = new JButton("Vault-Tec is evil. ");
		falloutText = new JTextField("Trevor doesnt like fallout 4. ");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	
	}
	
	private void setupPanel()
	{
		this.setLayout(mainLayout);
		this.add(falloutButton);
		this.add(falloutText);
	}
	private void setupLayout()
	{
		falloutButton.setBackground(UIManager.getColor("desktop"));
		falloutButton.setForeground(Color.RED);
		mainLayout.putConstraint(SpringLayout.WEST, falloutButton, 131, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.NORTH, falloutButton, 67, SpringLayout.SOUTH, falloutText);
		mainLayout.putConstraint(SpringLayout.NORTH, falloutText, 58, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, falloutText, 112, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		falloutButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				falloutText.setText("Fallout 4 is GOTY");
			}
		});
	}
}
