package com.Interest;
import java.lang.Math;
public class CompoundInterest {
 double calculateCompoundInterest(double Principal,double rate,double time_period)
 {
	 return (Principal*(Math.pow(1+rate/100,time_period)));
 }
}
