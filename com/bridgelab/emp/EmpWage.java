package com.bridgelab.emp;

public class EmpWage {
	public static void main(String[] args){
		int IS_Full_Time = 1;
		double empCheck = Math.floor(Math.random() * 100) % 2 ;
		if ( empCheck == IS_Full_Time )
			System.out.println(" Employee is present");
		else
			System.out.println("employee is absent");
	}
}
