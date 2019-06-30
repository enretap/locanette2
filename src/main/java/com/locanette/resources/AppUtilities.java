package com.locanette.resources;

import java.text.ParseException;

public interface AppUtilities {

	public String addDays(String date, Integer days);
    
    public String dateFormater(String date,String inputf,String outputf) throws ParseException;
}
