# Write your MySQL query statement below
# SELECT id , 'Root' as type
# FROM Tree 
# WHERE p_id IS NULL

# UNION

# SELECT id , 'Inner' as type
# FROM Tree 
# WHERE id in 
# (
#     SELECT DISTINCT p_id 
#     FROM Tree
#     WHERE p_id  IS NOT NULL
# )
# AND p_id  IS NOT NULL

# UNION

# SELECT id , 'Leaf' as type
# FROM Tree 
# WHERE id not in 
# (
#     SELECT DISTINCT p_id 
#     FROM Tree
#     WHERE p_id  IS NOT NULL
# )
# AND p_id  IS NOT NULL

SELECT id , if
(
p_id is null , 'Root' , if(id in (select p_id from tree) and p_id is not null,'Inner','Leaf')
) as type
from Tree

