package com.capg.testcases;
import static org.junit.Assert.*;
import org.junit.Test;
import com.capg.orderDetailsDao.RawOrderDetails;
import java.util.List;
public class RawOrderDetailsTesting
{
	RawOrderDetails obj=new RawOrderDetails();
    Integer List[]= {1,2,3,4,5,6,7,8,9,10};
    
	@Test
	public void testgetRawId()
	{
		List<Integer> list=obj.getRawIDs();
		assertArrayEquals(List,list.toArray());
	}
	
	@Test
	public void testGetRawOrderDetailsDao()
	{
		assertEquals("Material Name is: Oil  Supplier Id is: 6  Warehouse Id: 60"
				+ " QuantityValue: 1000 PricePerUnit: 700 DateOfDelivery: 2020-12-11",obj.getRawOrderDetails(6));	
	}
}