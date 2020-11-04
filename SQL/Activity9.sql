create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);
    
    insert into customers values 
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001),
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002),
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003),
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

select * from salesman;
select * from orders;

select a.customer_name as "Customer name" , a.city, b.salesman_id, b.name as Salesman_name
from customers a
inner join salesman b
On a.salesman_id = b.salesman_id;

select a.customer_name, b.grade , b.city, b.name as "Salesman"
from customers a
left outer join salesman b
on a.salesman_id=b.salesman_id 
where a.grade < 300
order by a.customer_id;

select a.customer_name, b.grade , b.city, b.name as "Salesman" , b.commission
from customers a
inner join salesman b
on a.salesman_id=b.salesman_id 
where b.commission > 12;

select a.order_no, a.order_date, a.purchase_amount,  b.grade, c.commission
from orders a
inner join customers b On a.customer_id = b.customer_id
inner join salesman c on a.salesman_id = c.salesman_id;