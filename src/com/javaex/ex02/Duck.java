package com.javaex.ex02;

public class Duck extends Bird {
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
    public void sing() {
    	System.out.println("오리("+this.name+") 가 소리내어 웁니다.");
    }

    public void fly() {
    	System.out.println("오리("+this.name+") 가 날지 않습니다.");

    }
    
    public void showName() {
    	System.out.println("오리의 이릅은 "+this.name+" 입니다.");

    }

}
