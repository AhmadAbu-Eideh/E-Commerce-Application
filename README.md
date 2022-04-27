# E-Commerce-Application
**#This is the first Web Services Assignment which is an E-commerce API**
**#each class has a model , repository , service and controller.**
**#Classes:**
**#Customers{
id
Email
Password
Full_name
Address
City
PhoneNum
PostalCode
    }**
    
**#Orders{
private int id;
Customer_id;
Ammount;
ShippingAddress;
OrderDate;
OrderStatus;
    }**
**#Products{
id;
QRCode;
Name;
Price;
weight;
depiction;
Category;
CreationDate;
ExpirationDate;
    }***
    
**#HTTP Methods
#Customer Requests:
#GET:http://localhost:8080/getCustomer/1:200 OK:Return Customer by ID
#GET:http://localhost:8080/getCustomers:200 OK:Return all customers
#POST:http://localhost:8080/addCustomer:200 OK:Saves Customer**

**#Products Requests:
#GET:http://localhost:8080/getProduct/1:200 OK:Return Product by ID
#GET:http://localhost:8080/getProducts:200 OK:Return all products
#POST:http://localhost:8080/addProducts:200 OK:Saves Product

**#Orders Requests:
#GET:http://localhost:8080/getOrders:200 OK:Return all orders
#GET:http://localhost:8080/getOrder/2:200 OK:Return order by ID
#POST:http://localhost:8080/getOrders:405 Method Not Allowed
**
