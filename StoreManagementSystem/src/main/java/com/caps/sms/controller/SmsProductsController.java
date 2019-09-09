package com.caps.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.caps.sms.beans.Products;
import com.caps.sms.services.SmsServices;
import com.caps.sms.services.SmsServicesImpl;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class SmsProductsController {

	@Autowired
	SmsServices service = new SmsServicesImpl();

	// Add product
	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public String addProducts(@RequestBody  Products product) {
		String state = "{\"msg\": \"failed\"}";
		boolean result = service.addProduct(product) ;
		if(result)
			state =  "{\"msg\": \"success\"}";
		return state;
	}

	// Fetch product details
	@RequestMapping(value = "/get/product/{id}", method = RequestMethod.GET)
	public Products getProduct(@PathVariable("id")int id)
	{
		return service.getProduct(id);
	}

	// Fetch product price
	@RequestMapping(value = "/productprice/{id}", method = RequestMethod.GET)
	public int productPrice(@PathVariable("id")int productId)
	{
		int state = 0;
		int  result = service.ProductPrice(productId) ;
		if(result >-1)
			state = result ;
		return state;
	}


	// Fetch all product details
	@RequestMapping(value = "/getAllproducts", method = RequestMethod.GET)
	public List<Products> getAll()
	{
		return service.getProducts();
	}

	// Delete product
	@RequestMapping(value = "/deleteproduct/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id")int id)
	{
		String state = "{\"msg\": \"failed\"}";
		boolean res = service.deleteProduct(id) ;
		if(res)
			state = "{\"msg\": \"success\"}";
		return state;
	}



	@RequestMapping(value = "/getproduct/update", method = RequestMethod.PUT)
	public boolean upDateProducts(@RequestBody  Products product)
	{
		return service.updateProduct(product.getManufacturerId(),product.getProductId(), product.getProductName(), product.getProductPrice(), product.getProductStock()) ;
	}

}
