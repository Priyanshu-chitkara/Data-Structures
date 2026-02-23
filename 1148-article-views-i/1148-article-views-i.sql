# Write your MySQL query statement below
SELECT DISTINCT v.author_id AS id
FROM Views v
INNER JOIN Views a
ON v.author_id = v.viewer_id
ORDER BY id;