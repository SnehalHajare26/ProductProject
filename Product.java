package com.jbkSnehal.Assignment.LeadToRev.Model;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.DBObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document("product")

public class Product {
private String id;
private String name;
private String description;
private double price;
private List<String> catagories;
private List<Map<String,String>> attributes;
private Availability Availability;
private List<Rating> ratings;
}

class Availability{
	private boolean instock;
	private int quantity;
}
class Attribute{
	private int key;
	private Object value;
	private int size;
	private String color;
	private String brand;
}
class Rating{
	private String userid;
	private String rating;
	private String comment;
}

