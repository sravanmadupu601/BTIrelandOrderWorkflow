package com.nbi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SubmitOrderController
{
@Autowired
private IProductService productService;
//mapping the getProduct() method to /product
@RequestMapping(value="/orderresponse", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public List<SubmitOrder> getProduct()
{
//finds all the products
List<SubmitOrder> submitOrders = productService.findAll();
//returns the product list
return submitOrders;
}
}
