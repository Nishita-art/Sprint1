package access_Details;
import java.util.*;

import orderDetailsCons.RawOrder;

import repository.RawOrderRepository;
import java.util.Map;
public class RawOrderDetails {
Map<Integer,RawOrder> repositoryMap;
 // Constructor
public RawOrderDetails() {
	repositoryMap = RawOrderRepository.get();
}
// this function gets the order IDs and returns the List
public List<Integer> getRawIDs(){
	List<Integer> supplierIDList = new ArrayList<Integer>();
	for(Map.Entry<Integer, RawOrder> obj: repositoryMap.entrySet()) {
		supplierIDList.add(obj.getKey());
	}
	return supplierIDList;
}
// this function gives the result by validating the Id
public String getRawOrderDetails(Integer supplierID) {
	String result = null;
	for(Map.Entry<Integer,RawOrder> obj : repositoryMap.entrySet())
	{
		if(obj.getKey().equals(supplierID))
		{
			result =obj.getValue().getSupplierID()+"\n" +obj.getValue().getWarehouseID()+"\n"+obj.getValue().getMaterialName()+"\n"+obj.getValue().getQuantityValueAndUnit()+
					"\n"+obj.getValue().getPricePerUnit()+"\n"+obj.getValue().getDateOfDelivery();
			result="Raw Order Placed successfully";
		}
	}
	return result;
}
}
