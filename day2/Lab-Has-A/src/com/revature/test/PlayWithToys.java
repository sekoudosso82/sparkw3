package com.revature.test;

import com.revature.model.ActionFigure;
import com.revature.model.Doll;

public class PlayWithToys {
	public static void main(String[] args) {
	      Doll doll = new Doll("Annabelle","blue");
	      System.out.println("Our doll "+doll.getName()
	                    +" has "+doll.getEyeColor()+" eyes.");
	      doll.play();
	      doll.makeTalk();
	      
	      ActionFigure actionFigure = new ActionFigure("Barry Allan", "blue", "speed" );
	      
	      System.out.println("Our action figure "+ actionFigure.getName() + " has "+ actionFigure.getEyeColor() +" eyes and " + actionFigure.getSkillField()+".");
	      
	      actionFigure.makeTalk();
	      actionFigure.play();
	      actionFigure.useSkill();
	   }

}
