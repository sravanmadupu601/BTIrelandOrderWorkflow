package com.nbi;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class OrderResponse
{
private int id;
private String Http_response_code;
private String Status;
//default constructor
public OrderResponse()
{
	
}
//constructor using fields
public OrderResponse(int id, String Http_response_code, String Status)
{
super();
this.id = id;
this.Http_response_code = Http_response_code;
this.Status = Status;
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
return Http_response_code;
}
public void setHttp_response(String Http_response)
{
this.Http_response_code = Http_response;
}
public String getOrder_Status()
{
return Status;
}
public void setOrder_Status(String Status)
{
this.Status = Status;
}
}