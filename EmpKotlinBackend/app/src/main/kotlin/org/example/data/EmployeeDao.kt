package org.example.data

import org.example.model.Employee
import org.jdbi.v3.sqlobject.statement.SqlQuery

interface EmployeeDao {
    @SqlQuery("INSERT INTO employees (name, department, designation, salary) VALUES (:emp.getName(), :emp.getDepartment(), :emp.getDesignation(), :emp.getSalary())")
    fun addEmployee(emp:Employee)
}