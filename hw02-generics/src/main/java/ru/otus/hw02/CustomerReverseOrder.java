package ru.otus.hw02;

import java.util.ArrayDeque;
import java.util.Deque;

public class CustomerReverseOrder {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"


    public Deque<Customer> customerDeque = new ArrayDeque<>();

    public void add(Customer customer) {
        customerDeque.add(customer);
    }

    public Customer take() {
        return customerDeque.pollLast();
    }
}