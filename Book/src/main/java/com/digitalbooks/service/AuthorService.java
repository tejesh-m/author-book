package com.digitalbooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.Exception.AuthorException;
import com.digitalbooks.entity.Author;

@Service
public class AuthorService {
	@Autowired
	public AuthorRepository authRepo;

	public String saveCredentials(Author author) throws AuthorException {
		try {
			authRepo.save(author);
			return "Registration success , Please Login";
		} catch (Exception ae) {
			throw new AuthorException("Registration failed");
		}
	}

	public String validateUser(String username, String password) throws AuthorException {
		String dbPassword = authRepo.filterByPassword(username);
		if (dbPassword != null) {
			if (dbPassword.equals(password)) {
				return "success";
			} else {
				return "failure";
			}
		} else {
			return "false";
		}

	}

}
