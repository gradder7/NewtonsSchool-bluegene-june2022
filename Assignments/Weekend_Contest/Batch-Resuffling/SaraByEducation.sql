/* 
Salary by Education
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given the education levels and salaries of a group of individuals, find what is the average salary for each level of education.
Input
DataFrame/SQL Table with the following schema

Tables Schema as Below:
google_salaries
columnName	dataType
id	int64
first_name	object
last_name	object
department	object
education	object
salary	int64

Output
Each row in new line and each value of a row separated by a |, i. e.
0|1|2
1|2|3
2|3|4 
*/
SELECT education,AVG(salary) AS AVERAGE_SALARY FROM google_salaries GROUP BY education;