package com.caps.sms.beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Devolution {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
    private  int  mproductid  ;
	
	@Column(name =  "mid")
	private  	int mid  ;

	@Column(name =  "mproductname")
	private  	String mproductname  ;

	@Column(name =  "mproductprice")
	private  	int  mproductprice  ;
	
	@Column(name =  "mproductstock")
	private  	int mproductstock  ;


}
