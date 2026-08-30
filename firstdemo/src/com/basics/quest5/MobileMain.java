package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {
		Mobile m1=new Mobile("Galaxy S26","Samsung","Sky Blue");
		Mobile m2 =new Mobile("Galaxy Z Fold8","Samsung","Lavender");
		Mobile m3 =new Mobile("Razr 70 Plus","Motorola","Pantone Mountain View");
		Mobile m4 =new Mobile("Razr 70 Ultra","Motorola","Pantone Orient Blue");
		Mobile m5 =new Mobile("Redmi Note 17","Redmi","Arctic Blue");
		Mobile[] m=new Mobile[5];
		m[0]=m1;
		m[1]=m2;
		m[2]=m3;
		m[3]=m4;
		m[4]=m5;
		
		for(Mobile mob : m)
		{
			mob.getDetails();
			System.out.println();
		}
		System.out.println("The below are the samsung brands");
		System.out.println();
		for(Mobile mob : m)
		{
			
			if(mob.brand.equals("Samsung"))
			{
				
				mob.getDetails();
			}
		}
	}

}
