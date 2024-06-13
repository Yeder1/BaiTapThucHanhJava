package com.example.BaiTapThucHanhJava.repository;

import com.example.BaiTapThucHanhJava.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

}
