# E-Commerce-Application
**This is the first Web Services Assignment which is an E-commerce API**<br/>
**each class has a model , repository , service and controller.**<br/>
**Classes:**<br/>
**Customers{<br/>
id<br/>
Email<br/>
Password<br/>
Full_name<br/>
Address<br/>
City<br/>
PhoneNum<br/>
PostalCode<br/>
    }**<br/>
    
**Orders{<br/>
id;<br/>
Customer_id;<br/>
Ammount;<br/>
ShippingAddress;<br/>
OrderDate;<br/>
OrderStatus;<br/>
    }**<br/>
**Products{<br/>
id;<br/>
QRCode;<br/>
Name;<br/>
Price;<br/>
weight;<br/>
depiction;<br/>
Category;<br/>
CreationDate;<br/>
ExpirationDate;<br/>
    }***<br/>
    
**HTTP Methods<br/>
Customer Requests:<br/>
GET:http://localhost:8080/getCustomer/1:200 OK:Return Customer by ID<br/>
GET:http://localhost:8080/getCustomers:200 OK:Return all customers<br/>
POST:http://localhost:8080/addCustomer:200 OK:Saves Customer**<br/>

**#Products Requests:<br/>
GET:http://localhost:8080/getProduct/1:200 OK:Return Product by ID<br/>
GET:http://localhost:8080/getProducts:200 OK:Return all products<br/>
POST:http://localhost:8080/addProducts:200 OK:Saves Product<br/>

**#Orders Requests:<br/>
GET:http://localhost:8080/getOrders:200 OK:Return all orders<br/>
GET:http://localhost:8080/getOrder/2:200 OK:Return order by ID<br/>
POST:http://localhost:8080/getOrders:405 Method Not Allowed<br/>
**
