package org.java.mpodel;

public class UrlResponseDto {
	
	public String original_url;
	public String short_url;
	 
	public UrlResponseDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UrlResponseDto(String original_url, String short_url) {
		super();
		this.original_url = original_url;
		this.short_url = short_url;
	}
	public String getOriginal_url() {
		return original_url;
	}
	public void setOriginal_url(String original_url) {
		this.original_url = original_url;
	}
	public String getShort_url() {
		return short_url;
	}
	public void setShort_url(String short_url) {
		this.short_url = short_url;
	}
	@Override
	public String toString() {
		return "UrlResponseDto [original_url=" + original_url + ", short_url=" + short_url + "]";
	}
	
	

}
