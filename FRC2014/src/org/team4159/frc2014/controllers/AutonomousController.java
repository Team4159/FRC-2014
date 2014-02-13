package org.team4159.frc2014.controllers;

import org.team4159.frc2014.IO;
import org.team4159.frc2014.subsystems.DashboardManager;
import org.team4159.support.Controller;
import org.team4159.support.DriverStationLCD;
import org.team4159.support.ModeEnumerator;

public class AutonomousController extends Controller 
{
    	public static final int MODE_LEFT = 1;
	public static final int MODE_RIGHT = 2;
	public static final int MODE_STATIC = 3;
        
	public AutonomousController ()
	{
		super (ModeEnumerator.AUTONOMOUS);
	}
        public void run(){
        // remember to use this.sleep() in case autonomous mode ends early
	// make sure that only sleep() blocks
            	switch (DashboardManager.instance.getAutonomousMode ())
		{
			case MODE_LEFT:
				break;
			case MODE_RIGHT:
				break;
			case MODE_STATIC:
				break;
			default:
				System.out.println ("Invalid autonomous mode!");
				break;
		}
        }
	
}
