package com.example.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.entity.User;

public interface UserRepository extends CassandraRepository<User> {

}
