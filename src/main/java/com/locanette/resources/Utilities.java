package com.locanette.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utilities implements AppUtilities{

	@Override
	public String addDays(String date, Integer days) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String result = "";
                
		try {
			Date df = sdf.parse(date);
			GregorianCalendar calendar = new java.util.GregorianCalendar();
                        //Calendar calendar = Calendar.getInstance();
			calendar.setTime(df);
			calendar.add (Calendar.DAY_OF_MONTH, days);
			//System.out.println(calendar);
			result = sdf.format(calendar.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String dateFormater(String date, String inputf, String outputf) throws ParseException {
		//Simple format
        SimpleDateFormat sdf = new SimpleDateFormat(inputf);
        Date df = sdf.parse(date);
        SimpleDateFormat apdf = new SimpleDateFormat(outputf);
        
        return apdf.format(df);
	}

}
