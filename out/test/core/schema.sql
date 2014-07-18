create table employee(EmployeeID varchar(5), Name varchar(20),Exp double,Budget double);
create table budget(ExpenseID varchar(10),EmployeeID varchar(5),Name varchar(20),ExpenseType varchar(50),
                ExpenseDate date,Cost double,Description varchar(100));