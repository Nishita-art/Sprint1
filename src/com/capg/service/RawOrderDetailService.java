package com.capg.service;
import java.util.*;

import com.capg.exceptionclass.NoDataFoundException;
import com.capg.exceptionclass.NoNegativeId;
import com.capg.orderDetailsDao.RawOrderDetails;

public class RawOrderDetailService
{
	RawOrderDetails raworderDaoObj = new RawOrderDetails();
	List<Integer>IDList = new ArrayList<Integer>();

	public List<Integer> getRawID()
	{
		IDList = raworderDaoObj.getRawIDs();
		return IDList;
	}
	
	public String getRawOrderDetails(Integer supplierID) throws NoDataFoundException,NoNegativeId
	{
		String result=null;
		if(supplierID<0)
		 {
			 throw new NoNegativeId("Not a negative number");
		 }
		 else if(supplierID==0)
		 {
			 result="Id can not be zero";
			 return result;
		 }
		for(Integer i : IDList) 
		{
			if(i.equals(supplierID))
			{
				result = raworderDaoObj.getRawOrderDetails(supplierID);
			}
		}
		return result;
	}
		public boolean dateValidate(String date){
			if(date.matches("\\d{4}-\\d{2}-\\d{2}")){
				return true;
			}
			else
			{
				return false;
			}
		}
			List<Integer>getRawId()
			{
				return raworderDaoObj .getRawIDs();
			}
		
}
