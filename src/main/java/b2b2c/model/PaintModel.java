package b2b2c.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblpaint")
public class PaintModel {
	@Id
	@Column(name = "paint_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paintId;

	@Column(name = "paint_name")
	private String paintName;

	@Column(name = "paint_brand")
	private String paintBrand;

	@Column(name = "paint_color_code")
	private String paintColorCode;

	@Column(name = "paint_weight")
	private String paintWeight;

	@Column(name = "paint_price")
	private int paintPrice;

	@Column(name = "paint_count")
	private short paintCount;

	@Column(name = "paint_supplier_id")
	private int paintSupplierId;

	public PaintModel() {

	}

	public PaintModel(int paintId, String paintName, String paintBrand, String paintColorCode, String paintWeight,
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
