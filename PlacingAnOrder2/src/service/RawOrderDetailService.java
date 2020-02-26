package service;
import access_Details.RawOrderDetails;

import java.util.*;

import Exception.NoDataFoundException;

public class RawOrderDetailService {
	
RawOrderDetails raworderDaoObj = new RawOrderDetails();

List<Integer>IDList = new ArrayList<Integer>();

public List<Integer> getRawID(){
	IDList = raworderDaoObj.getRawIDs();
	return IDList;
}
public String getRawOrderDetails(Integer supplierID) throws NoDataFoundException{
	String result=null;
	for(Integer i : IDList) {
		if(i.equals(supplierID)) {
			result = raworderDaoObj.getRawOrderDetails(supplierID);
		}
	}
	if(result == null) {
		throw new NoDataFoundException("It is not a valid ID");
	}
	else {
		return result;
	}
}
}
