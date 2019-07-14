package com.bessem.metier;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	
	private String login;
	private String resultat;
	private boolean isConnected = false;
	
	public String verifIdentifiants(HttpServletRequest request) {
		this.login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if (login.equals("toto") && pass.equals("1234")) {
			isConnected = true;
			return resultat = "Bravo ! Vous etes connecté !";
		}
		else {
			return resultat = "Désolé ! Vous n'etes pas connecté !";
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public boolean isConnected() {
		return isConnected;
	}

	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}
	
	

}
