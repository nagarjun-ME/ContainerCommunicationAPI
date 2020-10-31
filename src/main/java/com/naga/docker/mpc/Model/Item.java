package com.naga.docker.mpc.Model;

public class Item {
	
	private int itemID;
	private String itemName;
	private double itemPrice;
	
	
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", getItemID()="
				+ getItemID() + ", getItemName()=" + getItemName() + ", getItemPrice()=" + getItemPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	/**
	 * @param itemID
	 * @param itemName
	 * @param itemPrice
	 */
	public Item(int itemID, String itemName, double itemPrice) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	/**
	 * @return the itemID
	 */
	public int getItemID() {
		return itemID;
	}
	/**
	 * @param itemID the itemID to set
	 */
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the itemPrice
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

}
