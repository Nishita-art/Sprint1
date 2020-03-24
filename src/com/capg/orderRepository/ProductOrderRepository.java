package com.capg.orderRepository;

import java.util.*;
import com.capg.orderDetailsDto.ProductOrder;
import java.time.LocalDate;
public class ProductOrderRepository 
{
	static Map<Integer,ProductOrder> productorderMap = new HashMap<Integer,ProductOrder>();
	static 	
	{
		productorderMap.put(101,new ProductOrder("Novel",11,100,3  ,200,LocalDate.of(2020,05,10)));
		productorderMap.put(202,new ProductOrder("Skirt",22,200,5 ,400,LocalDate.of(2020,04,14)));
		productorderMap.put(303,new ProductOrder("Shirt",33,300,10 ,800,LocalDate.of(2020,03,19)));
		productorderMap.put(404,new ProductOrder("Bracelet",44,400,15,400 ,LocalDate.of(2020,07,17)));
		productorderMap.put(505,new ProductOrder("Ring",55,500,8 ,1000,LocalDate.of(2020,06,12)));
		productorderMap.put(606,new ProductOrder("Jacket",66,600,9 ,1300,LocalDate.of(2020,8,13)));
	}
	public static Map<Integer,ProductOrder>get()
	{
		return productorderMap;
	}
}
