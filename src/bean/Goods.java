package bean;

import java.util.Date;

/**
 * 商品
 * 
 * @author burns
 *
 */
public class Goods {
	private String goodsId;// 商品编码ID13位
	private String goodsName;// 商品名称
	private double goodsPrice;// 单价
	private String goodsUnit;// 单位
	private int goodsStore;// 库存量
	private float discountRate;// 折扣率0.0~1.0
	private Date discountStartDate;// 折扣开始日期
	private Date discountEndDate;// 折扣结束日期，默认10年之后

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
