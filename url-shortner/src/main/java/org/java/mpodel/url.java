package org.java.mpodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class url {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String originalurl;
	public String shorturl;

	public url() {
		
	}

	public url(String originalurl, String shorturl) {
		
		this.originalurl = originalurl;
		this.shorturl = shorturl;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOriginalurl() {
		return originalurl;
	}

	public void setOriginalurl(String originalurl) {
		this.originalurl = originalurl;
	}

	public String getShorturl() {
		return shorturl;
	}

	public void setShorturl(String shorturl) {
		this.shorturl = shorturl;
	}
	
	
	
	
}
