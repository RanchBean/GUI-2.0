package gui.controller;

import gui.controller.GUIController;
/**
 * Launches the GUI Program
 * @author ethr5627
 * @version 1 November 11, 2015
 */
public class GUIRunner 
{
	public static void main(String [] args)
	{
		GUIController myGUIController = new GUIController();
		myGUIController.start();
	}
}
