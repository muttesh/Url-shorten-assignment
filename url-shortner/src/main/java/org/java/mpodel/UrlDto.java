package org.java.mpodel;

public class UrlDto {
	public String original_url;

	public String getOriginal_url() {
		return original_url;
	}

	public void setOriginal_url(String original_url) {
		this.original_url = original_url;
	}

	public UrlDto() {
		
	}
	
	public UrlDto(String original_url) {
		super();
		this.original_url = original_url;
	}

	@Override
	public String toString() {
		return "UrlDto [original_url=" + original_url + "]";
	}
	
	
}
