package br.com.petshop.util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Util {

	public void trataErro(String msgErroConnection001, Exception e) {

		DateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
		System.err.println(dateformat.format(System.currentTimeMillis()) + msgErroConnection001 + e.toString());
	}

	}

