package com.kodilla.ecommercee;

import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<ProductOrder, Long> {

}
