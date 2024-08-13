package org.example.services

import jakarta.inject.Inject
import org.example.data.EmployeeDao
import org.example.model.Employee
import org.jdbi.v3.core.Jdbi

class EmployeeService @Inject constructor(private val jdbi: Jdbi){
    private val db: EmployeeDao =jdbi.onDemand(EmployeeDao::class.java)

    fun addEmployee(emp:Employee){
        db.addEmployee(emp)
    }
}