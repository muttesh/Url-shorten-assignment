package org.java.services;


import java.nio.charset.StandardCharsets;

import org.apache.commons.lang3.StringUtils;
import org.java.mpodel.UrlDto;
import org.java.mpodel.url;
import org.java.repository.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.hash.Hashing;


public class UrlServiceImpl implements UrlService {

	@Autowired
	public StoreRepo repo;
	
	@Override
	public url generateShortUrl(UrlDto urldto) {
		// TODO Auto-generated method stub
		
		if(StringUtils.isNotEmpty(urldto.getOriginal_url())) {
			String encodedurl=encodedurl(urldto.getOriginal_url());
			url urlpers=new url();
			
			urlpers.setOriginalurl(urldto.getOriginal_url());
			urlpers.setShorturl(encodedurl);
			url urltoreturn=persistShortlink(urlpers);
			if(urltoreturn!=null)
				return urltoreturn;
			
				return null;
		}
		return null;
	}

	private String encodedurl(String original_url) {
		// TODO Auto-generated method stub
		String encodedurl="";
		encodedurl=Hashing.murmur3_32()
				.hashString(original_url,StandardCharsets.UTF_8).toString();
		System.out.println(encodedurl);
		return encodedurl;
	}

	@Override
	public url persistShortlink(url url) {
		// TODO Auto-generated method stub
		url urlret=repo.save(url);
		return urlret;
	}

	@Override
	public url getEncodeurl(String shortlink) {
		// TODO Auto-generated method stub
		url encodeurl=repo.findByShorturl(shortlink);
		return encodeurl;
	}

	
}
