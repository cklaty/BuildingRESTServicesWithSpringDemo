package com.SpringRestDemo.payrollz;

class OrderNotFoundException extends RuntimeException
{
    OrderNotFoundException(Long id)
    {
        super("Could not find employee " + id);
    }
}
