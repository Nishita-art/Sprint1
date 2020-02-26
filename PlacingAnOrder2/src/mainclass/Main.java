package mainclass;
import static java.lang.System.out;
import java.util.*;
import Exception.NoDataFoundException;
import service.RawOrderDetailService;
import service.ProductOrderDetailService;

public class Main {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	/*DateValidation dv = new DateValidation();
	int date = sc.nextInt();
	try {
		out.println(dv.getDateValidation);
	}
	catch(NoDataFoundException e) {
		e.printStackTrace();
	}*/
	//Scanner sc=new Scanner(System.in);
	control:while(true)
	{
		System.out.println("Enter \n 1: To place an order for raw material.");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: 
			RawOrderDetailService obj = new RawOrderDetailService();
			out.println("Placing the order details");
			out.println("-------------------------");
			out.println("Available ids are \n"+obj.getRawID());
			out.println("Enter the id from the given list");
			
			int id=sc.nextInt();
            try {
			out.println(obj.getRawOrderDetails(id));
	
            }
            catch(NoDataFoundException e) {
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
