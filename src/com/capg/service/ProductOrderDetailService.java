package com.capg.service;
import java.util.ArrayList;
import java.util.List;

import com.capg.exceptionclass.NoDataFoundException;
import com.capg.exceptionclass.NoNegativeId;
import com.capg.orderDetailsDao.ProductOrderDetails;

public class ProductOrderDetailService 
{
	ProductOrderDetails productorderDaoObj = new ProductOrderDetails();
	List<Integer>IDList = new ArrayList<Integer>();
	public List<Integer> getProductID()
	{
			IDList = productorderDaoObj.getProductIDs();
			return IDList;
	}
	
	public String getProductOrderDetails(Integer supplierID) throws NoDataFoundException, NoNegativeId
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
				result = productorderDaoObj.getProductOrderDetails(supplierID);
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
				return productorderDaoObj .getProductIDs();
			}
}
