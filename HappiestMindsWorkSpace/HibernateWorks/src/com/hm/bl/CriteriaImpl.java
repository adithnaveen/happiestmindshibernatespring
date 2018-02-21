package com.hm.bl;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.hm.beans.Employee;
import com.hm.hibernate.util.HibernateUtil;

public class CriteriaImpl {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		
		Session session = sessionFactory.openSession(); 
		
	// 	criteriaWork(session);
		
		// scalarQuery 
		
		scalarQuery(session);
		
		
		
		
	}

	private static void scalarQuery(Session session) {
		session.beginTransaction(); 
		
		String sql="select emp_name, emp_email, emp_sal from Employee where emp_sal > ?";
		
		SQLQuery query = session.createSQLQuery(sql); 
		query.setDouble(0, 35000.0);
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		
		List empList = query.list(); 
		
		for(Object temp : empList){
			Map map = (Map) temp; 
			System.out.println(map.get("emp_name") +", " + 
					map.get("emp_email") +", " + map.get("emp_sal"));
		}
	}

	private static void criteriaWork(Session session) {
		Criteria criteria = session.createCriteria(Employee.class);
		
//		criteria.add(Restrictions.eq("empSal", 35000.0));
//		criteria.add(Restrictions.like("empName", "Di%"));
		
		
		Criterion salaryCriterion = Restrictions.ge("empSal", 36000.0);
		Criterion nameCriterion = Restrictions.like("empName", "san%");
		
		
		LogicalExpression orExp = Restrictions.and(salaryCriterion, nameCriterion);
		
		criteria.add(orExp);
		
		List<Employee> empList = criteria.list(); 
		
		
		for(Employee temp : empList){
			System.out.println(temp);
		}
	}
}
