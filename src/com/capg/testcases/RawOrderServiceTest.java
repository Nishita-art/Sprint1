package com.capg.testcases;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.time.LocalDate;

import com.capg.exceptionclass.NoDataFoundException;
import com.capg.exceptionclass.NoNegativeId;
import com.capg.service.RawOrderDetailService;

public class RawOrderServiceTest
{
	RawOrderDetailService obj;
	Integer List[ ]= {1,2,3,4,5,6,7,8,9,10};

	@Before
	public void setUp()
	{
		obj=new RawOrderDetailService ();
	}

	@Test
	public void testGetRawId()
	{
		List<Integer> list=obj.getRawID();
		assertArrayEquals(List,list.toArray());

	}

	@Test
	public void testGetRawOrderDetailsService()
	{
     try
     {
		assertEquals("Material Name is: Oil  Supplier Id is: 6  Warehouse Id: 60  QuantityValue: 1000 PricePerUnit: 700 DateOfDelivery: 2020-12-11",obj.getRawOrderDetails(6));	
	}
     catch (NoDataFoundException | NoNegativeId e) 
     {
 		System.out.println(e);
 	}
}
     @Test
    public void  ValidId()
    {	
    	 try
    	 {
    assertEquals("Not a valid  ID", obj.getRawOrderDetails(15));
         }
        catch(NoDataFoundException | NoNegativeId e) 
     {
 		System.out.println(e);
 	 }
   }
    @Test
    public void notNegativeId()
    {
    	try
    	{
    	assertEquals("Id should be positive",obj.getRawOrderDetails(-15));
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
    	assertEquals("Id cannot be zero",obj.getRawOrderDetails(0));
        }
    	catch(NoDataFoundException | NoNegativeId e) 
     {
 		System.out.println(e);
 	 }
   }
}