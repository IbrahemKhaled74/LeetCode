# Write your MySQL query statement below
select e.employee_id from Employees e

LEFT JOIN Salaries s

ON e.employee_id =s.employee_id

WHERE s.employee_id is null

UNION 

select s.employee_id from Salaries s

LEFT JOIN Employees e

ON s.employee_id =e.employee_id

WHERE e.employee_id is null

ORDER BY employee_id ASC