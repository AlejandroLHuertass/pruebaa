package edu.eci.cvds.servlet.model;

public class Todo{
	private int uId;
	private int id;
	private String title;
	private boolean completed;
	
	public Todo(){
	}
	
	public int getUserId(){
		return uId;
	}
	
	public int getId(){
		return id;
	}
	
	public String getTitle(){
		return title;
	}
	
	public boolean getCompleted(){
		return completed;
	}
	
	public void setUserId(int newUserId){
		this.uId = newUserId;
	}
	
	public void setId(int newId){
		this.id = newId;
	}
	
	public void setTitle(String newTitle){
		this.title = newTitle;
	}
	
	public void setCompletedState(boolean newCompletedState){
		this.completed = newCompletedState;
	}
}