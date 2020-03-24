package com.capg.orderDetailsDto;
import java.time.LocalDate;
//Creating Value Object
public  class RawOrder
{
		private String materialname;
		private int supplierID;
		private int warehouseID;
		private int quantityvalue;
		private int priceperunit;
		private LocalDate dateofdelivery;

		public RawOrder(String materialname, int supplierID, int warehouseID, int quantityvalue,  int priceperunit, LocalDate dateofdelivery)
		{
			this.materialname=materialname;
			this.supplierID=supplierID;
			this.warehouseID=warehouseID;
			this.quantityvalue=quantityvalue;
			this.priceperunit=priceperunit;
			this.dateofdelivery=dateofdelivery;
		}
		public String getMaterialName()
		{
			return materialname;
		}
		public void setMaterialName(String materialname) 
		{
				this.materialname=materialname;
		}
		public int getSupplierID()
		{
			return supplierID;
		}
		public void setSupplierID(int supplierID)
		{
			this.supplierID=supplierID;
		}
		public int getWarehouseID()
		{
			return warehouseID;
		}
		public void setWarehouseID(int warehouseID)
		{
			this.warehouseID=warehouseID;
		}
		public int getQuantityValueAndUnit()
		{
			return quantityvalue;
		}
		public void setQuantityValue(int quantityvalue)
		{
			this.quantityvalue=quantityvalue;
		}
		public int getPricePerUnit() 
		{
			return priceperunit;
		}
		public void setPricePerUnit(int priceperunit)
		{
			this.priceperunit=priceperunit;
		}
		public LocalDate getDateOfDelivery() 
		{
			return dateofdelivery;
		}
		public void setDateOfDelivery(LocalDate dateofdelivery) 
		{
			this.dateofdelivery=dateofdelivery;
		}
}
