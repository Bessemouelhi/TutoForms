package com.bessem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bessem.beans.User;

public class UserDaoImpl implements UserDao {
	
	private DaoFactory daoFactory;

	UserDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

	@Override
	public void add(User user) {
		Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            
            preparedStatement = connexion.prepareStatement("INSERT INTO user(nom, prenom) VALUES(?, ?);");
            preparedStatement.setString(1, user.getNom());
            preparedStatement.setString(2, user.getPrenom());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public List<User> getAllUser() {
		
		 List<User> users = new ArrayList<User>();
	        Connection connexion = null;
	        Statement statement = null;
	        ResultSet resultat = null;

	        try {
	            connexion = daoFactory.getConnection();
	            statement = connexion.createStatement();
	            resultat = statement.executeQuery("SELECT nom, prenom FROM user;");

	            while (resultat.next()) {
	                String nom = resultat.getString("nom");
	                String prenom = resultat.getString("prenom");

	                User utilisateur = new User();
	                utilisateur.setNom(nom);
	                utilisateur.setPrenom(prenom);

	                users.add(utilisateur);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return users;
	}

}
