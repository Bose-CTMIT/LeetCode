# Write your MySQL query statement below
select p.product_name, s.year,s.price from sales s left join product p on s.product_id = p.product_id order by s.sale_id asc ;