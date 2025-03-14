package com.example.bookStores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookStores.entity.MyBookList;


@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}
