DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS budget;
create table employee(EmployeeID varchar(5), Name varchar(20),Exp double,Budget double);
create table budget(ExpenseID varchar(10),EmployeeID varchar(5),Name varchar(20),ExpenseType varchar(50),
                ExpenseDate date,Cost double,Description varchar(100));



INSERT INTO employee VALUES ('00001','lucy',1,0);
INSERT INTO employee VALUES ('00002','lily',0.3,0);
INSERT INTO employee VALUES ('00003','keven',0,0);
INSERT INTO employee VALUES ('00004','john',0.1,0);
INSERT INTO employee VALUES ('00005','joana',0.7,0);
INSERT INTO employee VALUES ('00006','elna ',0.8,0);

INSERT INTO budget VALUES ('00001','00001','lucy','Books','2014-07-01',105.7,'borrow:elna:5');
INSERT INTO budget VALUES ('00002 ','00002','lily','Training/Education','2014-07-02',150,'borrow:lucy:400');
INSERT INTO budget VALUES ('00003 ','00001','lucy','others','2014-07-02',120,'borrow:elna:100');
INSERT INTO budget VALUES ('00004','00002','lily','Books','2014-07-03',230,NULL);
INSERT INTO budget VALUES ('00005','00001','lucy','   ','2014-07-07',500,'   ');