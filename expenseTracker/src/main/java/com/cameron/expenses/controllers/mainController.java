package com.cameron.expenses.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cameron.expenses.models.Expense;
import com.cameron.expenses.service.ExpenseService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/expenses")
public class mainController {
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("")
	public String home(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> allExpenses = expenseService.getAllExpenses();
		model.addAttribute("expenses", allExpenses);
		return "index.jsp";
		
	}
	
	@PostMapping("/add")
	public String addExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
	    if (result.hasErrors()) {
			List<Expense> allExpenses = expenseService.getAllExpenses();
			model.addAttribute("expenses", allExpenses);
	        model.addAttribute("errors", result.getAllErrors());
	        return "index.jsp";
	    } else {
	        expenseService.addExpense(expense);
	        return "redirect:/";
	    }
	}

	@RequestMapping("/edit/{id}")
	public String editExpenseById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expenseToEdit", this.expenseService.getExpenseById(id));
		return "edit.jsp";
		
	}
	
	@PostMapping(value="/update/{id}")
    public String update(@Valid @ModelAttribute("expenseToEdit") Expense expense, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("Expense", expense);
            return "edit.jsp";
        } else {
            this.expenseService.updateExpense(expense);
            return "redirect:/expenses";
        }
    }
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		this.expenseService.deleteExpenseById(id);
		return "redirect:/expenses";
		
	}
	
	@RequestMapping("/{id}")
	public String specificBookById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expenseToEdit", this.expenseService.getExpenseById(id));
		return "oneExpense.jsp";
		
	}

}
