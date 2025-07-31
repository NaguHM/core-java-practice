package in.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class Product implements Comparator<Product> {
  String product;
  int price;
  
  Product(String product,int price){
	  this.product=product;
	  this.price=price;
  }

@Override
public int compare(Product p1, Product p2) {
	// TODO Auto-generated method stub
	return p1.price-p2.price;
}
}

class ComparatorDemo{
	
	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<>();
		list.add(new Product("pen",10));
		list.add(new Product("book",30));
		list.add(new Product("box",50));
		
		//Colllections.
	}
}