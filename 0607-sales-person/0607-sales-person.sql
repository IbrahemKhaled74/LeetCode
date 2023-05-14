# Write your MySQL query statement below
SELECT  s.name 
FROM SalesPerson s
WHERE s.sales_id NOT IN (SELECT Orders.sales_id
                         FROM Orders 
                         LEFT JOIN Company
                         ON Company.com_id  = Orders.com_id 
                         WHERE name  = "RED"
                        )
