package com.dev.sms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static Boolean idValidate(String id)
	{
		Pattern pat = Pattern.compile("\\d+");// represents any number bet (0-9)
		Matcher mat = pat.matcher(id);
		if(mat.matches()) {

			return true;
		}else {
			System.out.println("gefudsy");
		}
		return false;
	}
	public static Boolean nameValidate(String name)
	{
		Pattern pat = Pattern.compile("^\\w[\\w.\\-#&\\s]*"); // For Name
		Matcher mat = pat.matcher(name);
		if(mat.matches()) {
			System.out.println(name);
			return true;
		}else {

		}
		return false;
	}
	public static Boolean passwordValidate(String password)
	{
		Pattern pat = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"); //Must contain 8 charactres, Atleat one Uppercase ,one LowerCase, one special Character
		Matcher mat = pat.matcher(password);
		if(mat.matches()) {
			return true;
		} else {
			System.out.println("dkfh");
		}
		return false;
	}
	public static Boolean emailValidate(String email) {
		Pattern pat = Pattern.compile("^([0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9})$"); // for email id's.
		Matcher mat = pat.matcher(email);
		if(mat.matches()) {
			return true;
		}else {
			System.out.println("sdga");
		}
		return false;
	}
	public static Boolean telephoneValidate(String phoneNumber) {
		Pattern pat = Pattern.compile("^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$"); // for phone numbers
		Matcher mat = pat.matcher(phoneNumber);
		if(mat.matches()) {
			return true;
		}else {
			System.out.println("dfsdfsd");
		}
		return false;
	}
	public static Boolean addressValidate(String address)
	{
		Pattern pat = Pattern.compile("^[#.0-9a-zA-Z\\s,-]+$"); // Format #1, North Street, Chennai - 11 
		Matcher mat = pat.matcher(address);
		if(mat.matches()) {
			return true;
		}else {
			System.out.println("dhgc");
		}
		return false;
	}
}
