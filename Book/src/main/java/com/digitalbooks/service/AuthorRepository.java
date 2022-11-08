package com.digitalbooks.service;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalbooks.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	@Query("select u.password from Author u where u.username=?1")
	  public String filterByPassword(String username);
}
