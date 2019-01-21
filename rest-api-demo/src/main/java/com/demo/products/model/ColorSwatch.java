package com.demo.products.model;

import java.util.ArrayList;
import java.util.List;

public class ColorSwatch {
	private String color; 
	private String rgbColor;
	private String skuID;
	
	List <ColorSwatch> colorSwatch = new ArrayList<ColorSwatch>();
	
	public ColorSwatch () {}
	
	public ColorSwatch(String color, String rgdColor, String skuID) {
		this.setColor(color);
		this.setRgbColor(rgdColor);
		this.setSkuID(skuID);
	}
	
	public int hashCode(String code) { // java String#hashCode
	    int hash = 0;
	    for (int i = 0; i < code.length(); i++) {
	       hash = code.charAt(i) + ((hash << 5) - hash);
	    }
	    return hash;
	} 

	public static String intToARGB(int i){
	    return Integer.toHexString(((i>>24)&0xFF))+
	        Integer.toHexString(((i>>16)&0xFF))+
	        Integer.toHexString(((i>>8)&0xFF))+
	        Integer.toHexString((i&0xFF));
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRgbColor() {
		return rgbColor;
	}
	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
	}
	public String getSkuID() {
		return skuID;
	}
	public void setSkuID(String skuID) {
		this.skuID = skuID;
	} 

}
