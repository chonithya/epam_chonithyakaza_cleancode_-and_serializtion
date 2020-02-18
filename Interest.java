package epam.maven;

import java.util.Scanner;
public class Interest  {
	public void amount()
	{
		double principalAmount = 0.0, simpleInterest = 0.0,compoundInterest = 0.0;
		int numberOfTimes = 0,rateOfInterest = 0, time = 0;
	    Scanner sc=new Scanner (System. in);
	    System.out.printf("Enter the principal amount:");
	    principalAmount = sc.nextDouble();
	    System. out. printf("Enter the time(in years):");
	    time = sc.nextInt();
	    System. out. printf("Enter the Rate of  interest:");
	    rateOfInterest=sc.nextInt();
	    System.out.printf("Enter the number of times:");
	    numberOfTimes=sc.nextInt();
		simpleInterest=(principalAmount * time * rateOfInterest)/100;
		compoundInterest=principalAmount * Math.pow(1.0 + rateOfInterest / numberOfTimes,(numberOfTimes * time)) - principalAmount;
		System.out.printf("Simple Interest=%f\n",simpleInterest);
		System.out. printf("Compound Interest=%f\n",compoundInterest);
		sc.close();
	}
}