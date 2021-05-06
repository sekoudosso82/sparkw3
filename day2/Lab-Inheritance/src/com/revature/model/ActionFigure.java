package com.revature.model;

public class ActionFigure extends Doll {
	
	private String skillFied;
	
	

	// default constructor 
	public void ActionFigure() {
		this.name = "Alexa";
		this.eyeColor = "Blue";
		this.skillFied = "medium";
	}
	
	// constructor with parameters
		public ActionFigure(String name, String eyeColor, String skillFied) {
			this.name = "Alexa";
			this.eyeColor = "Blue";
			this.skillFied = "arrow shooting";
			
		}
	
	// getter 
	
	public String getSkillField() {
		return this.skillFied;
	}
	
	// setter
	public void getSkillField(String skillField) {
		this.skillFied = skillField;
	}
	
	// instance methods 
	public void useSkill() {
		System.out.println( "Ka Pow! I’m using my skill, " + this.skillFied);
	}

}
