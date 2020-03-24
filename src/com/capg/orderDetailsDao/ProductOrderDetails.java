package com.capg.orderDetailsDao;

import java.util.*;
import java.util.Map;

import com.capg.orderDetailsDto.ProductOrder;
import com.capg.orderRepository.ProductOrderRepository;

	public class ProductOrderDetails implements ProductInterface
	{
		Map<Integer,ProductOrder> repositoryMap;
		//Constructor
		
		public ProductOrderDetails()
		{		
			repositoryMap = ProductOrderRepository.get();
	    }
		
		
	// this function gets the order IDs and returns the List
	public List<Integer> getProductIDs()
	{
		List<Integer> supplierIDList = new ArrayList<Integer>();
		for(Map.Entry<Integer, ProductOrder> obj: repositoryMap.entrySet()) 
		{
			supplierIDList.add(obj.getKey());
		}
		
		return supplierIDList;
	}
	
	
	// this function gives the result by validating the Id
	public String getProductOrderDetails(Integer supplierID)
	{
		String result = null;
		for(Map.Entry<Integer,ProductOrder> obj : repositoryMap.entrySet())
		{
			if(obj.getKey().equals(supplierID))
			{
				result =obj.getValue().getSupplierID()+"\n" +obj.getValue().getWarehouseID()+"\n"+obj.getValue().getMaterialName()+"\n"+obj.getValue().getQuantityValueAndUnit()+
						"\n"+obj.getValue().getPricePerUnit()+"\n"+obj.getValue().getDateOfDelivery();
				result=" Product Order Placed successfully";
			}
		}
		return result;
	 }
}
