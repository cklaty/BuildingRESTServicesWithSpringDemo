package com.SpringRestDemo.payrollz;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long>
{
}
