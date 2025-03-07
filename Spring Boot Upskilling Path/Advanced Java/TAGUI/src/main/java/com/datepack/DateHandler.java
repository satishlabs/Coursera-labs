package com.datepack;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateHandler extends TagSupport{
	public int doStartTag() {
		Date today = new Date();
		DateFormat dft = DateFormat.getDateInstance(DateFormat.LONG);
		String date = dft.format(today);
		try {
			JspWriter out = pageContext.getOut();
			out.println(date);
		}catch (IOException e) {
			System.out.println(e);
		}
		return SKIP_BODY;
	}
}
