package com.bernardo.webserviceCustomers.services;

import com.sun.tools.jconsole.JConsoleContext;
import com.sun.tools.jconsole.JConsolePlugin;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.bernardo.webserviceCustomers.model.Customer;
@Service
public class CustomerService {
    private static int idCustomer;
    private ArrayList<Customer> list = new ArrayList();

    public ArrayList getAllCustomers(Integer age) {
        if(age != null){
            return getCustomerByAge(age);
        }
        return list;
    }

    public ArrayList<Customer> getCustomerByAge(int age){
        ArrayList<Customer> filteredCustomers = new ArrayList<>();
        for(Customer customer : this.list){
            if(customer.age() == age){
                filteredCustomers.add(customer);
            }
        }
        return filteredCustomers;
    }
    public void addCustomer(Customer customer){
        list.add(new Customer(idCustomer++, customer.name(), customer.age(), customer.profession()));
    }

    public Customer getCustomerById(int id){
        for (Customer customer : this.list) {
            if (customer.id() == id) {
                return customer;
            }
        }
        return null;
    }

    public Customer updateCustomer(int id, Customer customer){
        for(int i = 0; i < this.list.size(); i++){
            if(this.list.get(i).id() == id){
                this.list.set(i, customer);
            }
        }
        return customer;
    }

    public Customer deleteCustomerById(int id){
        for(int i = 0; i < this.list.size(); i++){
            if(this.list.get(i).id() == id){
                return this.list.remove(i);
            }
        }
        return null;
    }
}
