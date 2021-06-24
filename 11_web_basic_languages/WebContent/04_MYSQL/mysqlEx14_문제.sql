# 문제 1) 각사원들의 사원번호 , 이름(first,last) , 부서 번호를 조회하기. (EMPLOYEES , DEPT_EMP 테이블 조인)
SELECT
		E.EMP_NO 		 AS EMP_NO,
        E.FIRST_NAME 	 AS FIRST_NAME,
        E.LAST_NAME		 AS LAST_NAME,
        DE.DEPT_NO 		 AS DEPT_NO
FROM
		EMPLOYEES E
			 JOIN DEPT_EMP DE
			   ON E.EMP_NO = DE.EMP_NO;
# 문제 2) 사원들의 사원번호 , 이름 , 근무 부서 이름을 조회하기. (DEPARTMENTS , DEPT_EMP , EMPLOYEES 테이블 조인)
select
		e.emp_no as emp_no,
        e.first_name as first_name,
        de.dept_name as dept_name
from 
		employees e
			 join dept_emp d
               on e.emp_no = d.emp_no
			 join departments de
               on d.dept_no = de.dept_no;
               
        
	
# 문제 3) 부서별로 그룹화하고 부서이름 , 부서번호 , 직원수를 조회하고 직원수가 많은 곳부터 조회하기. (DEPT_EMP , DEPARTMENTS 테이블 조인)
select
		
		de.dept_name as dept_name,
        de.dept_no as dept_no,
        count(*) as count
from
		DEPT_EMP d
            join DEPARTMENTS de
			  on d.dept_no = de.dept_no
group by 
		de.dept_name

order by 
		count desc;



# 문제 4) 부서별로 그룹화하고 부서별안에 성별을 그룹화하여 직원 수를 조회하기. (DEPT_EMP , DEPARTMENTS , EMPLOYEES 테이블 조인)
select
		count(*) as count,
        de.dept_name as dept_name,
        e.gender as gender
from 
		DEPT_EMP d
            join EMPLOYEES e
              on d.emp_no = e.emp_no
			join DEPARTMENTS de
			  on de.dept_no = d.dept_no
group by 
		 de.dept_name,
		 e.gender;




