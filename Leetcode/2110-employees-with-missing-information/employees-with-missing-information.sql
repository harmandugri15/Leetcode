select Employees.employee_id from Employees left join salaries on Employees.employee_id=salaries.employee_id where salaries.employee_id is NULL 
UNION
select Salaries.employee_id from Employees right join salaries on Employees.employee_id=salaries.employee_id  where Employees.employee_id is NULL

order by employee_id;