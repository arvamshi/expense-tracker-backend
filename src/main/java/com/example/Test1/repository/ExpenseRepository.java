package com.example.Test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Test1.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
