package com.andrew.spring_project.repositories;

import com.andrew.spring_project.entity.Book;
import com.andrew.spring_project.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByReader(Person reader);

    List<Book> findByTitleStartingWithIgnoreCase(String startString);
}
