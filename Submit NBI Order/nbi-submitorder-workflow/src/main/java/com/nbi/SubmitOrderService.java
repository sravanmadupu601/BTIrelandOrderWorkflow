package com.nbi;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class SubmitOrderService implements IProductService
{
@Override
public List<SubmitOrder> findAll()
{
//creating an object of ArrayList
ArrayList<SubmitOrder> submitOrders = new ArrayList<SubmitOrder>();
//adding products to the List
submitOrders.add(new SubmitOrder(100, "Mobile", "CLK98123", "Yes"));
//returns a list of product
return submitOrders;
}
}
