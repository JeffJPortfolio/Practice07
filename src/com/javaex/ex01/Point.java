package com.javaex.ex01;

public class Point extends Shape{

	public Point(String fillColor){
		super(fillColor);

	}
	
	public void draw(){
		System.out.println("[점]#면색:" +super.fillColor+ "그렸습니다.");                                                                        
	}
	@Override
	public void whatwidth() {
		
		
	}
}
