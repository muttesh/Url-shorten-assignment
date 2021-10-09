package org.java.controller;

import org.apache.catalina.connector.Response;
import org.java.mpodel.UrlDto;
import org.java.mpodel.UrlErrorResponseDto;
import org.java.mpodel.UrlResponseDto;
import org.java.mpodel.url;
import org.java.services.UrlService;
import org.java.services.UrlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	
	UrlService urlService=new UrlServiceImpl();
	
	@PostMapping("/val")
	public ResponseEntity<?> generateShortUrl(@RequestBody UrlDto urlDto) {
		//ModelAndView modelAndView=new ModelAndView("index");
		url url=urlService.generateShortUrl(urlDto);
		if(url!=null) {
			UrlResponseDto urlResponseDto=new UrlResponseDto();
			urlResponseDto.setOriginal_url(url.getOriginalurl());
			urlResponseDto.setShort_url(url.getShorturl());
			return new ResponseEntity<UrlResponseDto>(urlResponseDto, HttpStatus.OK);
			//modelAndView.addObject("shorturl", urlResponseDto.getShort_url());
			
		}
		else {
		UrlErrorResponseDto urlErrorResponseDto=new UrlErrorResponseDto("404", "error while processing");
		return new ResponseEntity<UrlErrorResponseDto>(urlErrorResponseDto, HttpStatus.OK);
		//modelAndView.addObject("shorturl", urlErrorResponseDto.getError());
		//return null;
		}
		
	}
	public ModelAndView redirectOriginal(@PathVariable String shortlink){
		url url=urlService.getEncodeurl(shortlink);
		//redirect view code to be written
		
		return null;
		
	}
	

}
