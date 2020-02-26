package repository;
import java.util.*;

import orderDetailsCons.ProductOrder;
public class ProductOrderRepository {
	private ProductOrderRepository()
	{
	}
	static Map<Integer,ProductOrder> productorderMap = new HashMap<Integer,ProductOrder>();
	static {
		productorderMap.put(101,new ProductOrder("Novel",11,100,"3 grams",200,"23 feb 2020"));
		productorderMap.put(202,new ProductOrder("Skirt",22,200,"5 grams",400,"20 feb 2020"));
		productorderMap.put(303,new ProductOrder("Shirt",33,300,"10 grams",800,"27 feb 2020"));
		productorderMap.put(404,new ProductOrder("Bracelet",44,400,"15 grams",1400,"26 feb 2020"));
		productorderMap.put(505,new ProductOrder("Ring",55,500,"8 grams",1000,"25 mar 2020"));
		productorderMap.put(606,new ProductOrder("Jacket",66,600,"9 grams",1300,"3 april 2020"));
	}
	public static Map<Integer,ProductOrder>get()
	{
		return productorderMap;
	}
	}
