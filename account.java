//***********************************************
//************* CLASS ACCOUNT *******************
//***********************************************
import java.io.*;
import java.util.*;


public class account
{
	private int x0;
	private int x1;
	private int x2;
	private int x3;
	private int x4;
	private int x5;
	private int x6;
	private int x7;
	private int x8;
	private int x9;
	public int flag = 0; // Variable for Testing - Oriented Method
	public int Lflag = -1; // Variable for Testing - Oriented Method
	
public final int show_balance()
{
	return x1;
} //testing oriented method

public final int show_state()
{
	return flag;
} //testing oriented method

public final void show_variable()
{
	System.out.println("\n X0 = "+ x0);
	System.out.println("\n X1 = "+ x1);
	System.out.println("\n X2 = "+ x2);
	System.out.println("\n X3 = "+ x3);
	System.out.println("\n X4 = "+ x4);
	System.out.println("\n X5 = "+ x5);
	System.out.println("\n X6 = "+ x6);
	System.out.println("\n X7 = "+ x7);
	System.out.println("\n X8 = "+ x8);
	System.out.println("\n X9 = "+ x9);
	
} //testing oriented method

public account()
{
	x2 = 0;
	x4 = -1;
	x6 = 20;
	x7 = 500;
	x9 = 0;
	x0 = 3;
}
public final int open(int x, int y, int z)
{
	if ((x > 0) && (x4 == -1) && (y > 0) && (z > 0))
	{
		x1 = x;
		x3 = y;
		x5 = z;
		x4 = 0;
		flag = 1; // Variable for Testing - Oriented Method 
		return 0;
	};
	return -1;
}
public final int pin(int x)
{
	if (x4 != 1)
	{
		flag = 0; // Variable for Testing - Oriented Method
		return -1;
	}
	if (x == x3)
	{
		if (x1>=500) // To know after Pin action we are in which state
		{
			flag = 3; // Variable for Testing - Oriented Method
		}
		else // To know after Pin action we are in which state
		{
			flag = 5; // Variable for Testing - Oriented Method
		}
		x4 = 2;
		return 0;
	}
	else
	{
		x9++;
	}
	if (x9 >= x0)
	{
		flag = 1; // Variable for Testing - Oriented Method
		x4 = 0;
	}
	
	return -1;
}
public final int logout()
{
	if ((x4 == 0) || (x2 == 1))
	{
		return -1;
	}
	x4 = 0;
	flag = 1; // Variable for Testing - Oriented Method
	return 0;
}
public final int login(int x)
{
	if (x4 != 0)
	{
		flag = 1; // Variable for Testing - Oriented Method
		return -1;
	}
	if (x5 == x)
	{
		x4 = 1;
		x9 = 0;
		flag = 2; // Variable for Testing - Oriented Method
		return 0;
	}
	flag = 1; // Variable for Testing - Oriented Method
	return -1;
}
public final int balance()
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x1>=500) // To know after balance action we are in which state
		{
			flag = 3; // Variable for Testing - Oriented Method
		}
		else // To know after balance action we are in which state
		{
			flag = 5; // Variable for Testing - Oriented Method
		}
	if (Lflag == 1) // To know after balance action we are in which state
	{
		flag = 4; // Variable for Testing - Oriented Method
	}	
	
	return x1;
}
public final int lock(int x)
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x == x3)
	{
		return -1;
	}
	if (x2 == 0)
	{
		Lflag = 1; // Variable for Testing - Oriented Method
		flag = 4; // Variable for Testing - Oriented Method
		x2 = 1;
		x8 = x;
		return 0;
	}
	else
	{
		return -1;
	}
}
public final int unlock(int x)
{
	if (x4 != 2)
	{
		return -1;
	}
	if ((x2 == 1) && (x == x8))
	{
		Lflag = 0; // Variable for Testing - Oriented Method
		if (x1 >= 500) // To know after unlock action we are in which state
		{
			flag = 3; // Variable for Testing - Oriented Method
		} 
		else // To know after unlock action we are in which state
		{
			flag = 5; // Variable for Testing - Oriented Method
		}
		x2 = 0;
	return 0;
	}
	else
	{
		return -1;
	}
}
public final int deposit(int d)
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x2 == 1)
	{
		return -1;
	};
	if ((x1 + d < x7) && (d>0))
	{
		flag = 5; // Variable for Testing - Oriented Method
		x1 = x1 + d - x6;
		return 0;
	}
	else
	{
		if (d > 0)
		{
		flag = 3; // Variable for Testing - Oriented Method
		x1 = x1 + d;
		return 0;
		}
	}
 return -1;
}
public final int withdraw(int w)
{
if (x4 != 2)
{
	return -1;
}
if (x2 == 1)
{
	return -1;
};
if ((x1 > w) && (w > 0))
{
	if (x1 < x7)
	{
		return -1;
	}
	else
	{
		flag = 3; // Variable for Testing - Oriented Method
		x1 = x1 - w;
	};
	if (x1 < x7)
	{
		flag = 5; // Variable for Testing - Oriented Method
		x1 = x1 - x6;
	}
  return 0;
}
return -1;
}

public static void main( String[] args ) 
{
	account a;
	a = new account();
	int b = -1,X,Y,Z,D,W,R,B,S;
	Scanner s;
	s = new Scanner(System.in);
	while(b != 0)
	{
		System.out.println("\n Select Option from Following: ");
		System.out.println("\n 0. Exit \n 1. Open (X,Y,Z) \n 2. Login (X) \n 3. Logout()\n 4. Pin(X) \n 5. Deposit (D) \n 6. Withdraw (W) \n 7. Balance () \n 8. Lock (X) \n 9. unlock (X) \n");  
		System.out.println(" Testing - Related Methods ");
		System.out.println("\n 10. Show Balance \n 11. Show State \n 12. Show All Variable's Value \n");
		b = s.nextInt();
		switch (b)
		{
			case 0: System.out.println("\n Test Driver Closed.");
					break;
			case 1: System.out.println("\n Enter Balance Value ");
					X = s.nextInt();
					System.out.println("\n Enter Pin Value ");
					Y = s.nextInt();
					System.out.println("\n Enter Account # ");
					Z = s.nextInt();
					R = a.open(X,Y,Z);
					System.out.println("\n The Value returned by Method is " +R +"\n");
					break;
					
			case 2: System.out.println("\n Enter Account # ");
					Z = s.nextInt();
					R = a.login(Z);
					System.out.println("\n The Value returned by Method is " +R +"\n");
					break;
					
			case 3: R = a.logout();
					System.out.println("\n The Value returned by Method is " +R +"\n");
					break;
					
			case 4: System.out.println("\n Enter Pin Value ");
					Y = s.nextInt();
					R = a.pin(Y);
					System.out.println("\n The Value returned by Method is " +R +"\n");
					break;
					
			case 5: System.out.println("\n Enter Amount to be Deposited ");
					D = s.nextInt();
					R = a.deposit(D);
					System.out.println("\n The Value returned by Method is " +R +"\n");
					break;
					
			case 6: System.out.println("\n Enter Amount to be Withdrawn ");
					W = s.nextInt();
					R = a.withdraw(W);
					System.out.println("\n The Value returned by Method is " +R +"\n");
					break;
			
			case 7: R = a.balance();
					System.out.println("\n Current Balance is " +R +"\n");
					break;
					
			case 8: System.out.println("\n Enter a lock # different from Pin # ");
					X = s.nextInt();
					R = a.lock(X);
					System.out.println("\n The Value returned by Method is " +R +"\n");
					break;
					
			case 9: System.out.println("\n Enter a Unlock # different from Pin # ");
					X = s.nextInt();
					R = a.unlock(X);
					System.out.println("\n The Value returned by Method is " +R +"\n");
					break;
					
			case 10: B = a.show_balance(); 
					 System.out.println("\n Current Balance is " + B);
					 break;
					 
			case 11: R = a.show_state();
					 if (R == 0)
					 {
						 System.out.println("\n Start State ");
					 }
					 else if (R == 1)
					 {
						System.out.println("\n Idle State ");
					 }
					 else if (R == 2)
					 {
						System.out.println("\n Pin State ");
					 }
					 else if (R == 3)
					 {
						System.out.println("\n Ready State ");
					 }
					 else if (R == 4)
					 {
						System.out.println("\n Locked State ");
					 }
					 else if (R == 5)
					 {
						System.out.println("\n Overdrawn State ");
					 }
					 break;
					 
			case 12: a.show_variable();
					 break;
					
			default: System.out.println("\n Default Case");
                     break;
		}
	}
}
}


