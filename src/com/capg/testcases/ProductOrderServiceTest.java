package com.capg.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import com.capg.exceptionclass.NoDataFoundException;
import com.capg.exceptionclass.NoNegativeId;
import com.capg.service.ProductOrderDetailService;

public class ProductOrderServiceTest
{
	ProductOrderDetailService obj;
	Integer List[ ]= {101,202,303,404,505,606};

	@Before
	public void setUp()
	{
		obj=new ProductOrderDetailService ();
	}

	@Test
	public void testGetProductId()
	{
		List<Integer> list=obj.getProductID();
		assertArrayEquals(List,list.toArray());

	}

	@Test
	public void testGetProductOrderDetailsService() 
	{
      try
      {
		assertEquals("Material Name is: Ring  Supplier Id is: 505  Warehouse Id: 500 QuantityValue: 8 PricePerUnit: 1000 DateOfDelivery: 2020-06-12",obj.getProductOrderDetails(505));	
	 }
     catch(NoDataFoundException | NoNegativeId e) 
     {
 		System.out.println(e);
 	}
	}
    @Test
    public void  forValidId() 
    {	
    	try
    	{
    		assertEquals("Not a valid Id ", obj.getProductOrderDetails(808));
    }
    	catch(NoDataFoundException | NoNegativeId e) 
     {
 		System.out.println(e);
 	}
   }
    @Test
    public void NotNegativeId()
    {
    	try
    	{
    		assertEquals("Id should be positive",obj.getProductOrderDetails(-15));
        }
      catch(NoDataFoundException | NoNegativeId e) 
     {
 		System.out.println(e);
 	}
   }
    @Test
    public void zeroId() 
    {
    	try
    	{
    		assertEquals("Id can not be 0",obj.getProductOrderDetails(0));
    }
    	catch(NoDataFoundException | NoNegativeId e) 
     {
 		System.out.println(e);
 	}
   }
}