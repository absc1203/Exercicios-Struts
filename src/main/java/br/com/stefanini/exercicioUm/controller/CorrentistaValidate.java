package br.com.stefanini.exercicioUm.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrentistaValidate {

	public Boolean isNome(String nome) {
		Pattern pattern = Pattern.compile("[a-zA-Z ]{2,50}");
		Matcher matcher = pattern.matcher(nome);
		return matcher.matches();

	}
	
	public Boolean isId(Integer id) {
		if(id > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean isEmail(String email) {
		Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
