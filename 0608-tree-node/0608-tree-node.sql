# Write your MySQL query statement below
SELECT id , 'Root' as type
FROM Tree 
WHERE p_id IS NULL

UNION

SELECT id , 'Inner' as type
FROM Tree 
WHERE id in 
(
    SELECT p_id 
    FROM Tree
    WHERE p_id  IS NOT NULL
)
AND p_id  IS NOT NULL

UNION

SELECT id , 'Leaf' as type
FROM Tree 
WHERE id not in 
(
    SELECT p_id 
    FROM Tree
    WHERE p_id  IS NOT NULL
)
AND p_id  IS NOT NULL

