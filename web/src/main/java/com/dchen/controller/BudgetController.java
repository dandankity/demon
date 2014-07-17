package com.dchen.controller;


import com.dchen.dao.BudgetDao;
import com.dchen.dao.EmployeeDao;
import com.dchen.domain.Budget;
import com.dchen.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
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
    private BudgetDao budgetDao;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String indexDisplay(){
        return "index";
    }

    @RequestMapping(value="/budget",method = RequestMethod.POST)
    String calculateBudget(ModelMap model, HttpServletRequest request) {

        String name = request.getParameter("name"); //获得用户姓名
        String sid = request.getParameter("id");   //获得用户ID
        // int id=1;
        int balance = 2000;   //初始金额
        int costSum = 0;

        //String userSql = "select * from employee where uid = '" + sid + "';"; //查询用户信息
        // String sql = "select * from budgetTable where uid = '" + sid + "';"; //查询消费记录

        Employee employee = employeeDao.searchById(sid);
        if (employee != null) {

            double exp = employee.getExp();
            Calendar ca = Calendar.getInstance();
            int year = ca.get(Calendar.YEAR);//获取年份
            int month = ca.get(Calendar.MONTH);//获取月份
            int totalMonth = 12 - month + (int) exp * 12;
            if (totalMonth < 12) {
                balance = balance * totalMonth / 12;
            }
            List<Budget> budgetList = budgetDao.getBudgetList(sid);

            if (budgetList != null) {
                // try {
                for (Budget budget : budgetList) {

                    costSum += budget.getCost();
                    // query += result.getInt("cost") + " ";
                }
            }
        }

        balance = balance - costSum;
        if (balance <= 0) { //余额不能出现负数
            balance = 0;
        }
        model.addAttribute("id", sid);
        model.addAttribute("costSum", costSum);
        model.addAttribute("balance", balance);


        /*request.setAttribute("balance", balance); //余额
        request.setAttribute("costSum", costSum);//姓名
        request.setAttribute("id", sid);//ID号 */
        // request.getRequestDispatcher("showBalance.jsp").forward(request, response); //页面跳转
        return "result";


    }
}
