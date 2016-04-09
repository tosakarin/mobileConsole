package com.acedata.repository;

import com.acedata.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yangyanbo on 16/4/9.
 */
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
