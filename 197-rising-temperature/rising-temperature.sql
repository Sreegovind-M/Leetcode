# Write your MySQL query statement below
select w1.id as Id from Weather w1 join
Weather w2 on w1.id != w2.id where datediff(w1.recordDate, w2.recordDate) = 1
and w1.temperature > w2.temperature;