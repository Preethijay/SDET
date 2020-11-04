select sum(purchase_amount) as "Total Amount" from orders;

select avg(purchase_amount) as "Average Amount" from orders;

select max(purchase_amount) as "Maximum Amount" from orders;

select min(purchase_amount) as "Minimum Amount" from orders;

select count(distinct salesman_id) as "Count" from orders;