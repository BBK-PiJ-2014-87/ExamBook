package chapter4;

import java.util.ArrayList;

class Person {
	String name;
	Person(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Person: " + this.name;
		
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Person){
			Person p = (Person)obj;
			boolean isEquals = p.name.equals(this.name);
			return isEquals;
		}
		else
			return false;
	}
}

public class RemoveElement{
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person("Vlad");
		Person p2 = new Person("Anna");
		Person p3 = new Person("Marija");
		Person p4 = new Person("Viola");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		list.remove(new Person("Vlad"));
		
		for(Person p : list){
			System.out.println(p);
		}
		
		
	}
}

