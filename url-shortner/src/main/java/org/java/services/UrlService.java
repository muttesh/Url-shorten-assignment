package org.java.services;



import org.java.mpodel.UrlDto;
import org.java.mpodel.url;


public interface UrlService {
	public url generateShortUrl(UrlDto urldto);
	public url persistShortlink(url url);
	public url getEncodeurl(String url);

}
