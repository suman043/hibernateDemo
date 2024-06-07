package org.hibernateExample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernateExample.entity.Employee;
import org.hibernateExample.util.HibernateUtil;

import java.util.List;

public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Employee> getEmployees() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Employee", Employee.class).list();
        }
    }
}