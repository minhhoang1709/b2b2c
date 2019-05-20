package b2b2c.dto;

public class PaintDto {
	private int paintId;
	private String paintName;
	private String paintBrand;
	private String paintColorCode;
	private String paintWeight;
	private int paintPrice;
	private short paintCount;
	private int paintSupplierId;
	
	public PaintDto() {
		
	}
	
	public PaintDto(int paintId, String paintName, String paintBrand, String paintColorCode, String paintWeight,
			int paintPrice, short paintCount, int paintSupplierId) {
		this.paintId = paintId;
		this.paintName = paintName;
		this.paintBrand = paintBrand;
		this.paintColorCode = paintColorCode;
		this.paintWeight = paintWeight;
		this.paintPrice = paintPrice;
		this.paintCount = paintCount;
		this.paintSupplierId = paintSupplierId;
	}
	public int getPaintId() {
		return paintId;
	}
	public void setPaintId(int paintId) {
		this.paintId = paintId;
	}
	public String getPaintName() {
		return paintName;
	}
	public void setPaintName(String paintName) {
		this.paintName = paintName;
	}
	public String getPaintBrand() {
		return paintBrand;
	}
	public void setPaintBrand(String paintBrand) {
		this.paintBrand = paintBrand;
	}
	public String getPaintColorCode() {
		return paintColorCode;
	}
	public void setPaintColorCode(String paintColorCode) {
		this.paintColorCode = paintColorCode;
	}
	public String getPaintWeight() {
		return paintWeight;
	}
	public void setPaintWeight(String paintWeight) {
		this.paintWeight = paintWeight;
	}
	public int getPaintPrice() {
		return paintPrice;
	}
	public void setPaintPrice(int paintPrice) {
		this.paintPrice = paintPrice;
	}
	public short getPaintCount() {
		return paintCount;
	}
	public void setPaintCount(short paintCount) {
		this.paintCount = paintCount;
	}
	public int getPaintSupplierId() {
		return paintSupplierId;
	}
	public void setPaintSupplierId(int paintSupplierId) {
		this.paintSupplierId = paintSupplierId;
	}
	
	
}
