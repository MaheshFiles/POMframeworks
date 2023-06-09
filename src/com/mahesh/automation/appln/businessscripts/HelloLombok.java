package com.mahesh.automation.appln.businessscripts;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class HelloLombok {

	private int id;
	private String res;
	private double sal;
	;;;;;;;
	private String profession;
	@Getter @Setter private static int num;   //for static variable its not going to generate setter&getter thats why we use @setter & getter
	
	
	public static void main(String[] args) {
		
		HelloLombok lombok = new HelloLombok();
		lombok.setId(456);
		lombok.setProfession("Tester");
		lombok.setRes("job");
		lombok.setSal(45000);
		lombok.setNum(456456);	
		
		System.out.println(lombok.getId());
		System.out.println(lombok.getProfession());
		System.out.println(lombok.getRes());
		System.out.println(lombok.getSal());
		System.out.println(lombok.getNum());
		
	}
	
}
