package com.soumyadeep.Assignment.Repository;

import com.soumyadeep.Assignment.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {
}
