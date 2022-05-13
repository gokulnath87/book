package com.verinite.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verinite.bookstore.entity.Publisher;
@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Integer> {

}
