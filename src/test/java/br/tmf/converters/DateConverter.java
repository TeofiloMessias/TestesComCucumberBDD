package br.tmf.converters;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.Transformer;

public class DateConverter extends Transformer<Date> {

	@Override
	public Date transform(String arg0) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date retorno = format.parse(arg0);
			return retorno;
			
		}catch(ParseException e) {			
			e.printStackTrace();
			return null;
		}
			
		}

	}

