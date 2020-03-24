package com.capg.testcases;
import static org.junit.Assert.*;
import org.junit.Test;
import com.capg.orderDetailsDao.ProductOrderDetails;
import java.util.List;
public class ProductOrderDetailsTesting
{
		ProductOrderDetails obj=new ProductOrderDetails();
	    Integer List[]= {101,202,303,404,505,606};
	    
		@Test
		public void testgetProductId()
		{
			List<Integer> list=obj.getProductIDs();
			assertArrayEquals(List,list.toArray());
		}
		
		@Test
		public void testGetProductOrderDetailsDao()
		{
			assertEquals("Material Name is: Ring  Supplier Id is: 505  Warehouse Id: 500"
					+ " QuantityValue: 8 PricePerUnit: 1000 DateOfDelivery: 2020-06-12",obj.getProductOrderDetails(55));	
		}
}
