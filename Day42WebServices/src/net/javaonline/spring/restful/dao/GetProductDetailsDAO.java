package net.javaonline.spring.restful.dao;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;


import net.javaonline.spring.restful.model.ProductDetails;

@Repository
public class GetProductDetailsDAO {
	
	
	Map<String, ProductDetails> products = new HashMap<String, ProductDetails>();
	
//	List<ProductDetails> products=new ArrayList<>();
	
	public GetProductDetailsDAO()
	{
		Connection con=null;
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="root";
		con=DriverManager.getConnection(url, username, password);
		if(con!=null) {
			System.out.println("Connected");
		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
		}

		//product details to be retrieved from the database. 
		
//		products.put("1", new ProductDetails("1", "LCD TV"));
//		products.put("2", new ProductDetails("2", "LED TV"));
//		products.put("3", new ProductDetails("3", "AC"));
//		products.put("4", new ProductDetails("4", "Laptop"));
		
		try {
			
			String sql="SELECT * FROM items";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				ProductDetails pd=new ProductDetails(rs.getString(1),rs.getString(2));
				products.put(pd.getItemcode(),pd);
			}
			
		}catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
		
	}
	
	public ProductDetails getProductDetails(String itemcode) throws Exception
	{
		if(products.containsKey(itemcode))
		return products.get(itemcode);
		throw new Exception();
	}
	
	public List<ProductDetails> getAllProductDetails()
	{	
		ProductDetails pd=null;
		List<ProductDetails> list=new ArrayList<>();
	    /*
		Set<Entry<String,ProductDetails>> s=products.entrySet();
	    Iterator<Entry<String,ProductDetails>> itr=s.iterator();
	    */
		Collection<ProductDetails> col= products.values();
		Iterator<ProductDetails> itr=col.iterator();
	    while(itr.hasNext())
	    {
	   //Map.Entry<String,ProductDetails> me=(Entry<String,ProductDetails>)itr.next();
	   //pd=(ProductDetails)me.getValue();
	   //pd.setItemcode(itemcode);
	   list.add(itr.next());
	    }
		return list;		
	}
	
	public ProductDetails addProductDetails(String pId,ProductDetails newProduct)
	{
		 ProductDetails pd=	products.put(pId, newProduct);
		 System.out.println("Product added::");
	     return pd;		
	}
	
	public ProductDetails delProductDetails(String pId)
	{
		 ProductDetails pd=	products.remove(pId);
		 System.out.println("deleted:::"+pd.getItemcode());
	     return pd;		
	}
}
