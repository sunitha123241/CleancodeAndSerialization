package com.Interest;
import java.util.*;
public class CalculatingInterests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.format("%s","Select your options:1)Simple Interest 2)Compound Interest");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: SimpleInerest obj1 =new SimpleInerest();
			   System.out.format("%s","enter principal,rate and timeperiod");
		       float principal = sc.nextFloat();
		       float rate = sc.nextFloat();
		       float timeperiod = sc.nextFloat();
		       float result = obj1.ClaculateSimpleInterest(principal,rate,timeperiod);
		       System.out.format("%f",result);
		       break;
		case 2:CompoundInterest obj2 = new CompoundInterest();
		       System.out.format("%s","Enter principle,rate and number of years");
		       double principal1 = sc.nextDouble();
		       double rate_of_interest = sc.nextDouble();
		       double num_of_years = sc.nextDouble();
		       double result1 = obj2.calculateCompoundInterest(principal1,rate_of_interest,num_of_years);
		       System.out.format("%f",result1);
		       break;

		}
		

	}

}
