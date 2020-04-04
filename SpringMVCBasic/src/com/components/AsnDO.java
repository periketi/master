package com.components;

import org.springframework.stereotype.Component;
@Component
public class AsnDO {
	
	private String asnkey;
	private String storerkey;
	public AsnDO(){}
	public AsnDO(String asnkey, String storerkey, String sku, String packkey, String quantity) {
		super();
		this.asnkey = asnkey;
		this.storerkey = storerkey;
		this.sku = sku;
		this.packkey = packkey;
		this.quantity = quantity;
	}
	private String sku;
	private String packkey;
	private String quantity;
	public String getAsnkey() {
		return asnkey;
	}
	public void setAsnkey(String asnkey) {
		this.asnkey = asnkey;
	}
	public String getStorerkey() {
		return storerkey;
	}
	public void setStorerkey(String storerkey) {
		this.storerkey = storerkey;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getPackkey() {
		return packkey;
	}
	public void setPackkey(String packkey) {
		this.packkey = packkey;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
