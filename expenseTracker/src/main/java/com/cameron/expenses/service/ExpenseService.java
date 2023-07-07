package com.cameron.expenses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cameron.expenses.models.Expense;
import com.cameron.expenses.repositories.expenseRepository;

@Service
public class ExpenseService {
    @Autowired
    private expenseRepository expenseRepo;

    public Expense addExpense(Expense expense) {
        return expenseRepo.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepo.findAll();
    }

    public Expense getExpenseById(Long id) {
    	return expenseRepo.findById(id).orElse(null);
    }

    public Expense updateExpense(Expense expense) {
        return expenseRepo.save(expense);
    }

    
    public void deleteExpenseById(Long id) {
        expenseRepo.deleteById(id);
    }

    public void deleteAllExpenses() {
        expenseRepo.deleteAll();
    }
}