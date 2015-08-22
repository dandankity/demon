DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS budget;
create table employee(EmployeeID varchar(5), Name varchar(20),Exp double,Budget double);
create table budget(ExpenseID varchar(10),EmployeeID varchar(5),Name varchar(20),ExpenseType varchar(50),
                ExpenseDate date,Cost double,Description varchar(100));



INSERT INTO employee VALUES ('00001','guanyuan',1,0);
INSERT INTO employee VALUES ('00002','lihongjing',0.3,0);
INSERT INTO employee VALUES ('00003','xiefang',0,0);
INSERT INTO employee VALUES ('00004','pangmin',0.1,0);
INSERT INTO employee VALUES ('00005','chendan',0.7,0);
INSERT INTO employee VALUES ('00006','zhaolan ',0.8,0);

INSERT INTO budget VALUES ('00001','00001','guanyuan','Books','2014-07-01',105.7,'borrow:chendan:5');
INSERT INTO budget VALUES ('00002 ','00002','lihongjing','Training/Education','2014-07-02',150,'borrow:chendan:400');
INSERT INTO budget VALUES ('00003 ','00001','guanyuan','others','2014-07-02',120,'borrow:chendan:100');
INSERT INTO budget VALUES ('00004','00002','lihongjing','Books','2014-07-03',230,NULL);
INSERT INTO budget VALUES ('00005','00001','guanyuan','   ','2014-07-07',500,'   ');