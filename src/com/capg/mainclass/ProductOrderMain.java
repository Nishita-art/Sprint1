package com.capg.mainclass;

import static java.lang.System.out;
import java.util.Scanner;

import com.capg.exceptionclass.NoDataFoundException;
import com.capg.exceptionclass.NoNegativeId;
import com.capg.service.ProductOrderDetailService;
import com.capg.service.RawOrderDetailService;

public class ProductOrderMain
{
	public static void main(String[] args) throws NoNegativeId
	{
		
		Scanner sc = new Scanner(System.in);
		control:while(true)
		{
			System.out.println("Enter \n 1: To place an order for product order");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				RawOrderDetailService obj = new RawOrderDetailService();
				ProductOrderDetailService objj = new ProductOrderDetailService();
				out.println("Placing the order details");
				out.println("-------------------------");
				out.println("Available ids are \n"+objj.getProductID());
				out.println("Enter the id from the given list");
				
				int id=sc.nextInt();
	            try 
	            {
	            	out.println(objj.getProductOrderDetails(id));		
	            }
	            catch(NoDataFoundException e) 
	            {
	            	e.printStackTrace();
	            }
	            break;
			case 2:
				break;
				default : 
					out.println("You entered the wrong choice");
			}
		}
	}
}
