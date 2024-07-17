package com.javaex.ex02;

public class Sparrow extends Bird {
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
    public void sing() {
    	System.out.println("참새("+this.name+") 가 소리내어 웁니다.");
    }

    public void fly() {
    	System.out.println("참새("+this.name+") 가 날아 다닙니다.");

    }
    
    public void showName() {
    	System.out.println("참새의 이릅은 "+this.name+" 입니다.");

    }


}
