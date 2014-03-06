package br.com.maquinapr.business.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtils {
	
	
	static public Date XMLtoDate(XMLGregorianCalendar valor){
		
		java.util.Date dt = valor.toGregorianCalendar().getTime();
		return dt;
		
	}
	
	static public XMLGregorianCalendar DateToXML(Date valor) throws DatatypeConfigurationException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		String date = sdf.format(valor);
		XMLGregorianCalendar xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
		
		return xmlCal;
		
	}

}
