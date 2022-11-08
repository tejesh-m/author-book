package com.digitalbooks.service;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalbooks.entity.Book;

@Repository
public interface IBookRepo extends JpaRepository<Book, Integer> {

	
}
