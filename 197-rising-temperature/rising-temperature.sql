# Write your MySQL query statement below
select w1.id from weather w1 join weather w2 on 
DATE(w1.recordDate) = DATE_ADD(DATE(w2.recordDate), INTERVAL 1 DAY)
#DATEDIFF(w1.recorddate, w2.recorddate ) = 1 
where w1.temperature > w2.temperature ; 