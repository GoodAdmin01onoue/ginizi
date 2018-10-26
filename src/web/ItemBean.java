package web;

import java.io.Serializable;

public class ItemBean implements Serializable {


	private int proCd;
	private String proName;
	private int stockNo;
	private int proPrice;
	private int catId;
	private String proImg;
	private String proMsg;
	public int getProCd() {
		return proCd;
	}
	public String getProName() {
		return proName;
	}
	public int getStockNo() {
		return stockNo;
	}
	public int getProPrice() {
		return proPrice;
	}
	public int getCatId() {
		return catId;
	}
	public String getProImg() {
		return proImg;
	}
	public String getProMsg() {
		return proMsg;
	}
	public void setProCd(int proCd) {
		this.proCd = proCd;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public void setStockNo(int stockNo) {
		this.stockNo = stockNo;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public void setProImg(String proImg) {
		this.proImg = proImg;
	}
	public void setProMsg(String proMsg) {
		this.proMsg = proMsg;
	}



}
