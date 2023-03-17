package ru.otus.hw02;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private final long id;
    private String name;
    private long scores;

    //todo: 1. в этом классе надо исправить ошибки

    public Customer(long id, String name, long scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        return new Customer(this.id, name, this.scores);
    }

    public long getScores() {
        return scores;
    }

    public Customer setScores(long scores) {
        return new Customer(this.id, this.name, scores);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + scores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public boolean compare(Customer customer) {
        return compareTo(customer) > 0;
    }

    @Override
    public int compareTo(Customer customer) {
        return Long.compare(scores, customer.getScores());
    }
}