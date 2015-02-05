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
		
		ArrayList<Person> cloned = (ArrayList<Person>)list.clone();
		cloned.remove(3);
		cloned.get(0).name = "Peter";
		System.out.println("****************OBJECTS*******************");
		System.out.println("Cloned: " + cloned);
		System.out.println("Original: " + list);
		System.out.println("****************OBJECTS*******************");
		//////////////////////////////////////////////////////////////////
		ArrayList<String> listStr = new ArrayList<String>();
		listStr.add("A");
		listStr.add("B");
		listStr.add("C");
		listStr.add("D");
		ArrayList<String> clonedStr = (ArrayList<String>)listStr.clone();
		//clonedStr.remove(3);
		clonedStr.set(0, "Peter");
		System.out.println("***************STRINGS********************");
		System.out.println("Cloned STRING: " + clonedStr);
		System.out.println("Original STRING: " + listStr);
		System.out.println(listStr.contains(clonedStr.get(1)));
		System.out.println("***************STRINGS********************");
		//////////////////////////////////////////////////////////////////
		
		
		Object newList = list.clone();
		System.out.println(newList.getClass());
		
		// System.out.println(newList.size()); -- cant call size() method on object
		System.out.println(newList);
		System.out.println(list);
		//after casting can call size() of array
		ArrayList<Person> list2 = (ArrayList<Person>)newList;
		System.out.println(list2);
		System.out.println(list2.size());
		
		list.remove(new Person("Vlad"));
		
		
		
		for(Person p : list){
			System.out.println(p);
		}
		
		//elements are rearranged after remove method
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.size());
		//System.out.println(list.get(3));
		
		String mystr = null;
		System.out.println(mystr);
		

		
		
	}
}

