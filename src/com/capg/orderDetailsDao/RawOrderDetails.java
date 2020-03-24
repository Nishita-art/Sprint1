package com.capg.orderDetailsDao;
import java.util.*;

import com.capg.orderDetailsDto.RawOrder;
import com.capg.orderRepository.RawOrderRepository;

public class RawOrderDetails implements RawOrderInterface
{
	Map<Integer,RawOrder> repositoryMap;

	// Constructor
	public RawOrderDetails() 
	{
		repositoryMap = RawOrderRepository.get();
	}
	
	
// this function gets the order IDs and returns the List
	public List<Integer> getRawIDs()
	{
		List<Integer> supplierIDList = new ArrayList<Integer>();
		for(Map.Entry<Integer, RawOrder> obj: repositoryMap.entrySet()) 
		{ 
			//returns the set view of the mappings contained in this map		
			supplierIDList.add(obj.getKey()); //returns the key corresponding to this entry
		}
		return supplierIDList;
	}
	
// this function gives the result by validating the Id

	public String getRawOrderDetails(Integer supplierID) 
	{
		String result = null;
		for(Map.Entry<Integer,RawOrder> obj : repositoryMap.entrySet())
		{
			if(obj.getKey().equals(supplierID))//true if the objects are the same, false otherwise
			{
				result =obj.getValue().getSupplierID()+"\n" +obj.getValue().getWarehouseID()+"\n"+obj.getValue().getMaterialName()+"\n"+obj.getValue().getQuantityValueAndUnit()+
					"\n"+obj.getValue().getPricePerUnit()+"\n"+obj.getValue().getDateOfDelivery();
				//Returns the value corresponding to this entry
			
				result="Raw Order Placed successfully";
			}
		}
		return result;
	}	
}

