package org.example.resources

import jakarta.inject.Inject
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import org.example.model.Employee
import org.example.services.EmployeeService


@Path("/employee")
class EmployeeResource @Inject constructor(private val empService:EmployeeService) {

    @POST
    fun addEmployee(emp:Employee){
        empService.addEmployee(emp)
    }
}