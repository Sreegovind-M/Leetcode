# Write your MySQL query statement below
select customer_id from Customer c join Product p on c.product_key = p.product_key
group by 1 having count(distinct p.product_key) = (select count(product_key) from Product);