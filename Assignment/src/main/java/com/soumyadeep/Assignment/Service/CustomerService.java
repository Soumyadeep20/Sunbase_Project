package com.soumyadeep.Assignment.Service;

import com.soumyadeep.Assignment.Model.Customer;
import com.soumyadeep.Assignment.Model.CustomerDTO;
import com.soumyadeep.Assignment.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {
  @Autowired
  CustomerRepo customerRepo;

    public String save(CustomerDTO customer) {
        Customer newUsser= Customer.builder()
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .street(customer.getStreet())
                .address(customer.getAddress())
                .city(customer.getCity())
                .state(customer.getState())
                .email(customer.getEmail())
                .phone(customer.getPhone())
                .build();
        customerRepo.save(newUsser);
        System.out.println(newUsser);
        return "index";
    }


    public void delete(UUID id) {
        customerRepo.deleteById(id);

    }
}
