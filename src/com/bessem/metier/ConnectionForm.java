package com.bessem.metier;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	
	private String resultat;
	
	public String verifIdentifiants(HttpServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if (login.equals("toto") && pass.equals("1234")) {
			return resultat = "Bravo ! Vous etes connecté !";
		}
		else {
			return resultat = "Désolé ! Vous n'etes pas connecté !";
		}
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	

}
