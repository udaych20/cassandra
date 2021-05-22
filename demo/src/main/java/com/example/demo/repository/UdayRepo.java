package com.example.demo.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.demo.entity.Uday;

public interface UdayRepo extends CassandraRepository<Uday, Long> {
//  @AllowFiltering
//  List<Uday> findByPublished(boolean published);
//  
//  List<Uday> findByTitleContaining(String title);
  
}