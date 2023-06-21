package com.softuni.bookshop.repositories;

import com.softuni.bookshop.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
