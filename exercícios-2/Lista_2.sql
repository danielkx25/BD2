USE psdb;

SELECT 
employees.first_name as Nome,
employees.last_name as Sobrenome,
salaries.salary as Salario,
salaries.from_date as Inicio, 
salaries.to_date as Fim FROM employees
INNER JOIN salaries ON employees.emp_no = salaries.emp_no
WHERE employees.emp_no = 10006 ORDER BY salaries.from_date ASC; /*ex1*/

SELECT 
employees.first_name as Nome,
employees.last_name as Sobrenome,
departments.dept_name as Departamento,
dept_emp.from_date as Inicio, 
dept_emp.to_date as Fim FROM employees
INNER JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
INNER JOIN departments ON dept_emp.dept_no = departments.dept_no; /*ex2*/

SELECT 
employees.first_name as Nome,
employees.last_name as Sobrenome,
departments.dept_name as Gerencia FROM employees
LEFT JOIN dept_manager ON employees.emp_no = dept_manager.emp_no
LEFT JOIN departments ON dept_manager.dept_no = departments.dept_no
WHERE employees.emp_no IN(110022,110085, 10006);/*ex3*/

INSERT INTO departments VALUES ('d99','Compras Internas');
SELECT 
employees.first_name,
employees.last_name,
departments.dept_name FROM employees
RIGHT JOIN dept_manager ON dept_manager.emp_no = employees.emp_no
RIGHT JOIN departments ON dept_manager.dept_no = departments.dept_no; /*ex4*/



