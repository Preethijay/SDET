select customer_id, Max(purchase_amount) as "Max amount" 
from orders 
group by customer_id;

select * from orders;

select salesman_id, order_date, Max(purchase_amount) as "Max amount"
from orders 
where order_date ='2012-08-17'
group by  salesman_id;

select customer_id ,order_date, Max(purchase_amount) as "Max amount"
from orders 
group by customer_id, order_date
having Max(purchase_amount) in (2030, 3450, 5760, 6000);