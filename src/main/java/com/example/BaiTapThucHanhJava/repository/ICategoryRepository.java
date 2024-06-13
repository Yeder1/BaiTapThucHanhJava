package com.example.BaiTapThucHanhJava.repository;

import com.example.BaiTapThucHanhJava.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
