package com.nbi;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class OrderResponseService implements IProductService
{
@Override
public List<OrderResponse> findAll()
{
//creating an object of ArrayList
ArrayList<OrderResponse> orderResponses = new ArrayList<OrderResponse>();
//adding products to the List
orderResponses.add(new OrderResponse(100, "200", "Success"));
//returns a list of product
return orderResponses;
}
}
