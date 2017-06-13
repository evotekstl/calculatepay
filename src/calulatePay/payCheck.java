package calulatePay;

import java.util.Scanner;

public final class payCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1;//Name
		double h;//hours
		double  f; //Fed tax rate
		double cf;//Calc Fed
		double cs;//Calc State
		double gp;//Gross Pay		
		double s; //State tax rate
		double  r;//Pay Rate
		
		System.out.println("Enter employee's name:");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextLine();
		
		System.out.print("Enter hours workedin a week:");
		h = sc.nextDouble();
		
		System.out.println("Enter hourly rate:");
		r = sc.nextDouble();
		
		System.out.print("Enter federal tax withholding rate:");
		f = sc.nextDouble();
		
		System.out.println("Enter state tax withholding rate:");
		s = sc.nextDouble();
		
		  gp = r * h;
		  cs = s * gp
		
		System.out.println("Employee Name:  " + n1);
		System.out.println("Hours Worked:  " + h);
		System.out.println("Pay Rate:   " + r);
		System.out.println("Gross Pay:  $" + (h * r = gp));
		System.out.println("  Federal Withholding   (" + f + "%):     " (f*gp=cf));
		System.out.println("  State Withholding    ("  + s + "%):     " (s*gp=cs));
		System.out.println("  Total Deduction  :      " + (cs+cf);
		
		
				
	}

}
