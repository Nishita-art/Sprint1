package com.capg.orderDetailsDao;

import java.util.List;

public interface RawOrderInterface 
{
	
	public List<Integer> getRawIDs();
	public String getRawOrderDetails(Integer supplierID);
	
}
