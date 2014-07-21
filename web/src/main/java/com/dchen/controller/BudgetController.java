package com.dchen.controller;


import com.dchen.dao.ExpenseDao;
import com.dchen.dao.EmployeeDao;
import com.dchen.domain.Expense;
import com.dchen.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.List;

/**
 * Created by dchen on 7/17/14.
 */
@Controller
public class BudgetController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private ExpenseDao expenseDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String indexDisplay() {
        return "index";
    }

    @RequestMapping(value = "/budget", method = RequestMethod.POST)
    String calculateBudget(ModelMap model, HttpServletRequest request) {

        //String name = request.getParameter("name"); //获得用户姓名
        String sid = request.getParameter("id");   //获得用户ID
        // int id=1;


        Employee employee = employeeDao.queryById(sid);
        if (employee!= null) {
            double budget = 2000;   //  Initial budget 2000
            int costSum = 0;
            int loan = 0;   //loan money
            String name = employee.getEmployeeName();
            double exp = employee.getTwExp();
            Calendar ca = Calendar.getInstance();
            int year = ca.get(Calendar.YEAR);//current year
            int month = ca.get(Calendar.MONTH);//current month
            if (exp < 1) {
                int totalMonth = 13 - month + (int) exp * 12;
                if (totalMonth < 12) {
                    budget = budget * totalMonth / 12;

                }

            }
            List<Expense> expenseList = expenseDao.getBudgetListByType(sid, "'Books','Training/Education'");

            if (expenseList != null) {
                for (Expense expense : expenseList) {
                    costSum += expense.getCost();
                    // query += result.getInt("cost") + " ";
                }
            }
            double balance = budget - costSum;
            if (balance <= 0) { //
                balance = 0;
            }
            model.addAttribute("name",name);
            model.addAttribute("budget",budget);
            model.addAttribute("costSum", costSum);
            model.addAttribute("balance", balance);
            return "result";
        } else {
            model.addAttribute("error", "ID wrong or there is no person! ");
            return "index";


        }
    }
}
