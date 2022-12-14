package com.capgemini.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
class Address
{
	private int plotNo;
	private String Street;
	private String Area;
	private String City;
	private String state;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		this.plotNo = plotNo;
		Street = street;
		Area = area;
		City = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return String.format("Address [plotNo=%s, Street=%s, Area=%s, City=%s, state=%s]", plotNo, Street, Area, City,
				state);
	}
}
public class MailList {
	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		//adds elements to the LL(linked list)
		obj.add(new Address(653,"Lane no 4","Balewadi","Pune","Maharashtra"));	
		obj.add(new Address(295,"Lane no 9","Hadapsar","Pune","Maharashtra"));	
		Iterator i=obj.iterator();
		while(i.hasNext())
			{
				Object elem=i.next();
				System.out.println(elem);
			}
		System.out.println();
	}
}
