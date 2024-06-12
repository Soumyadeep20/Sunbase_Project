package com.soumyadeep.Assignment.Controller;

import ch.qos.logback.core.model.Model;
import com.soumyadeep.Assignment.Model.CustomerDTO;
import com.soumyadeep.Assignment.Service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/customer")
public class CustomerController {

   @Autowired
    CustomerService customerService;
    @PostMapping("/save")
    public String  save( @RequestBody CustomerDTO customer)
    {
            System.out.println(customer);
             customerService.save(customer);
             return "done";


    }
    @GetMapping("/xyz")
    public String check()
    {
        return " valid";
    }
   @DeleteMapping("/delete")
   public void delete(@RequestParam UUID id)
    {
        customerService.delete(id);
    }
}
