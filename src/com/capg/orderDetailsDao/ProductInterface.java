package com.capg.orderDetailsDao;

import java.util.List;

public interface ProductInterface
{
	public List<Integer> getProductIDs();
	public String getProductOrderDetails(Integer supplierID);
		
}
