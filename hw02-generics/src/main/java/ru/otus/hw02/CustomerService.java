package ru.otus.hw02;

import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    private final TreeMap<Customer, String> map = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        return map.entrySet().iterator().next();
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return map.entrySet().stream()
                .filter(entry -> entry.getKey().compare(customer))
                .findFirst()
                .orElse(null);
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }
}