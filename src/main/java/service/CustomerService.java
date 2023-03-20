package service;

import model.Customer;
import repository.CustomerListRepository;
import util.Util;

import java.util.Optional;
import java.util.Random;

public class CustomerService {
    private final CustomerListRepository customerListRepository;
    private final Random random = new Random();

    private static CustomerService instance;

    private CustomerService(final CustomerListRepository customerListRepository) {
        this.customerListRepository = customerListRepository;
    }

    public static CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerService(CustomerListRepository.getInstance());
        }
        return instance;
    }

    public static CustomerService getInstance(final CustomerListRepository repository) {
        if (instance == null) {
            instance = new CustomerService(repository);
        }
        return instance;
    }

    public Customer createRundomCustomer() {
        Customer customer = new Customer(Util.getRandomString(), random.nextInt(100));
        customerListRepository.save(customer);
        return customer;
    }

    public Customer[] getAll() {
        return customerListRepository.getAll();
    }

    public Optional<Customer> getById(final String id) {
        return customerListRepository.getById(id);
    }

    public void delete(final String id) {
        customerListRepository.delete(id);
    }
    }