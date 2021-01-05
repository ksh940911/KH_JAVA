package kh.java.collection.set;

import java.util.Objects;

public class Person {

	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this == o)
			return true;
		
		if(o == null || !(o instanceof Person))
			return false;
		
		Person other = (Person)o;
		
		if(name == null) {
			if(other.name != null)
				return false;
		}
		else {
			if(!name.equals(other.name))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	

	
}
