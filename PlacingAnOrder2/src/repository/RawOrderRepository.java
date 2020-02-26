package repository;
import java.util.HashMap;
import java.util.Map;
import orderDetailsCons.RawOrder;
public class RawOrderRepository {
private RawOrderRepository()
{
}
static Map<Integer,RawOrder> orderMap = new HashMap<Integer,RawOrder>();
static {
	orderMap.put(1,new RawOrder("Sugar",1,10,"3 grams",200,"23 feb 2020"));
	orderMap.put(2,new RawOrder("Wood",2,20,"5 grams",400,"20 feb 2020"));
	orderMap.put(3,new RawOrder("Fevicol",3,30,"10 grams",800,"27 feb 2020"));
}
public static Map<Integer,RawOrder>get()
{
	return orderMap;
}
}
