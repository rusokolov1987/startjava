\echo Все роботы в БД
SELECT *
  FROM jaegers;

\echo Не уничтоженные работы
SELECT *
  FROM jaegers
 WHERE status = 'Active';
 
\echo Роботы mark-1 и mark-2
SELECT *
  FROM jaegers
 WHERE mark IN(1, 4); 
 
\echo Роботы не mark-1 и mark-2
SELECT *
  FROM jaegers
 WHERE mark NOT IN(1, 4); 

\echo Роботы отсортированы по полю mark в порядке убывания
SELECT *
  FROM jaegers
  ORDER BY mark DESC;

\echo Информация о самом старом роботе
SELECT *
  FROM jaegers
 WHERE launch <= (SELECT MIN(launch::date) 
                    FROM jaegers
  );

 \echo Роботы, которые уничтожили больше всех kaiju
SELECT *
  FROM jaegers
 WHERE kaijukill >= (SELECT MAX(kaijukill) 
                       FROM jaegers
  );

 \echo Средний вес роботов
 SELECT ROUND(AVG(weight), 3) AS avg_weight
   FROM jaegers;

\echo Увеличение kaijukill на 1 у роботов, которые не уничтоженные
UPDATE jaegers
   SET kaijukill = kaijukill + 1
 WHERE status = 'Active';

\echo Удаление роботов, которые уничтоженны
DELETE FROM jaegers
      WHERE status = 'Destroyed';