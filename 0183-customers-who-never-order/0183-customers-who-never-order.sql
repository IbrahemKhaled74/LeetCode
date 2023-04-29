# Write your MySQL query statement below
# select customers.name as Customers
# from Customers
# where customers.id not in
# (
# select orders.customerId from orders
# );


SELECT Name as Customers 
from Customers
LEFT JOIN Orders
ON Customers.Id = Orders.CustomerId
WHERE Orders.CustomerId IS NULL;
