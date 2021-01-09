package test;
public class Fruit {
	private String name;
	private String flavor;

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, String flavor) {
		super();
		this.name = name;
		this.flavor = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", flavor=" + flavor + "]";
	}
	
	@Override
	public boolean equals(Object obj) {

		if(!(obj instanceof Fruit)) 
			return false;

		Fruit other = (Fruit)obj;
		if(obj != other)
			return false;

		if(!name.equals(other.name))
			return false;

		return true;
	}
}