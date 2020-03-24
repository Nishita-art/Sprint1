package com.capg.orderRepository;
import java.util.HashMap;
import java.util.Map;
import com.capg.orderDetailsDto.RawOrder;
import java.time.LocalDate;
public class RawOrderRepository 
{
	static Map<Integer,RawOrder> orderMap = new HashMap<Integer,RawOrder>();
	static
	{
		orderMap.put(1,new RawOrder("Sugar",1,10,500 ,200,LocalDate.of(2020,07,10)));
		orderMap.put(2,new RawOrder("Wood",2,20,900 ,400,LocalDate.of(2020,04,12)));
		orderMap.put(3,new RawOrder("Fevicol",3,30,1000 ,800,LocalDate.of(2020,06,15)));
		orderMap.put(4,new RawOrder("Rubber",4,40,100 ,300,LocalDate.of(2020,03,19)));
		orderMap.put(5,new RawOrder("Honey",5,50,150 ,600,LocalDate.of(2020,11,18)));
		orderMap.put(6,new RawOrder("Oil",6,60,1000 ,700,LocalDate.of(2020,12,11)));
		orderMap.put(7,new RawOrder("Grains",7,70,500 ,800,LocalDate.of(2020,9,13)));
		orderMap.put(8,new RawOrder("Vegetables",8,80,900 ,300,LocalDate.of(2020,07,16)));
		orderMap.put(9,new RawOrder("Meat",9,90,2000 ,800,LocalDate.of(2020,05,19)));
		orderMap.put(10,new RawOrder("Minerals",10,100,10 ,1200,LocalDate.of(2020,04,14)));
	}
	
	public static Map<Integer,RawOrder>get()
	{
		return orderMap;
	}
}

