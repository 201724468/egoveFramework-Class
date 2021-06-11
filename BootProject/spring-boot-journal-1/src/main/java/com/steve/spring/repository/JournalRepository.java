package com.steve.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steve.spring.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long>{

}
