package com.nbi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class OrderResponseController
{
@Autowired
private IProductService productService;
//mapping the getProduct() method to /product
@GetMapping(value = "/orderresponse", produces = "application/json; charset=UTF-8")
public List<OrderResponse> getProduct()
{
//finds all the products
List<OrderResponse> orderResponses = productService.findAll();
//returns the product list
return orderResponses;
}
}
