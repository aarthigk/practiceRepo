package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class StudentA{
	int id=1001;
	String name = "leon"; 
	void basicDetail() {
		System.out.println(id);
		System.out.println(name);
	}
	
}

class Subjects extends StudentA
{
	int socialMark=100;
	int scienceMark=100;
}

class overAll extends Subjects
{
	boolean canDance;
}

public class TestStudent extends overAll{

public static void main(String a[]) {
	
	LocalDate now = LocalDate.now();
	String basicIsoDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
	System.out.println("Basic ISO date format: " + basicIsoDate);


	String future = now.plusDays(100).format(DateTimeFormatter.BASIC_ISO_DATE)	;
	

	String past = now.minusDays(100).format(DateTimeFormatter.BASIC_ISO_DATE)	;

	
//	LocalDate dayAfterTommorrow = currentDate.plusDays(2);
//	LocalDate yesterday = currentDate.minusDays(1); 
	System.out.println("tommorrow (adding 100 day) : " + future);
	System.out.println("past (adding 100 day) : " + future);
//	System.out.println("day after tommorrow : " + dayAfterTommorrow);
//	System.out.println("yesterday : " + yesterday);



	TestStudent sa;
	
	
	sa = new TestStudent(); ///xyz 
	
	System.out.println(sa.id);
	System.out.println(sa.name);
	System.out.println(sa.canDance);


}
	
}
