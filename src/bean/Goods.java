package bean;

import java.util.Date;

/**
 * ��Ʒ
 * 
 * @author burns
 *
 */
public class Goods {
	private String goodsId;// ��Ʒ����ID13λ
	private String goodsName;// ��Ʒ����
	private double goodsPrice;// ����
	private String goodsUnit;// ��λ
	private int goodsStore;// �����
	private float discountRate;// �ۿ���0.0~1.0
	private Date discountStartDate;// �ۿۿ�ʼ����
	private Date discountEndDate;// �ۿ۽������ڣ�Ĭ��10��֮��

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public int getGoodsStore() {
		return goodsStore;
	}

	public void setGoodsStore(int goodsStore) {
		this.goodsStore = goodsStore;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

	public Date getDiscountStartDate() {
		return discountStartDate;
	}

	public void setDiscountStartDate(Date discountStartDate) {
		this.discountStartDate = discountStartDate;
	}

	public Date getDiscountEndDate() {
		return discountEndDate;
	}

	public void setDiscountEndDate(Date discountEndDate) {
		this.discountEndDate = discountEndDate;
	}
}
