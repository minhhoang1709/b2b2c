package b2b2c.dto;

public class SupplierDto {
	
	private int supplierId;
	private String supplierName;
	private String supplierDeliveryPolicy;
	private String supplierInfomation;
	
	public SupplierDto() {
		
	}
	public SupplierDto(int supplierId, String supplierName, String supplierDeliveryPolicy, String supplierInfomation) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierDeliveryPolicy = supplierDeliveryPolicy;
		this.supplierInfomation = supplierInfomation;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierDeliveryPolicy() {
		return supplierDeliveryPolicy;
	}
	public void setSupplierDeliveryPolicy(String supplierDeliveryPolicy) {
		this.supplierDeliveryPolicy = supplierDeliveryPolicy;
	}
	public String getSupplierInfomation() {
		return supplierInfomation;
	}
	public void setSupplierInfomation(String supplierInfomation) {
		this.supplierInfomation = supplierInfomation;
	}
	
}
