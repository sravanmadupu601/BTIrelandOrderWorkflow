package com.nbi;
public class SubmitOrder
{
private int id;
private String Http_response;
private String Order_id;
private String Order_Acceptance;
//default constructor
public SubmitOrder()
{
	
}
//constructor using fields
public SubmitOrder(int id, String Http_response, String Order_id, String Order_Acceptance)
{
super();
this.id = id;
this.Http_response = Http_response;
this.Order_id = Order_id;
this.Order_Acceptance = Order_Acceptance;
}
//getters and setters
public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
public String getHttp_response()
{
return Http_response;
}
public void setHttp_response(String Http_response)
{
this.Http_response = Http_response;
}
public String getOrder_id()
{
return Order_id;
}
public void setOrder_id(String Order_id)
{
this.Order_id = Order_id;
}
public String getOrder_Acceptance()
{
return Order_Acceptance;
}
public void setOrder_Acceptance(String Order_Acceptance)
{
this.Order_Acceptance = Order_Acceptance;
}
}