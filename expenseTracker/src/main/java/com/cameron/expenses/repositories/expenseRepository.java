package com.cameron.expenses.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cameron.expenses.models.Expense;

@Repository
public interface expenseRepository extends CrudRepository<Expense, Long>{
    List<Expense> findAll();
}
