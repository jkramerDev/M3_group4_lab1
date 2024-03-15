package tree;


/**
 * The entity we're storing in our node
 */

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Integer id;
	private String position;
	
 	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}

	public boolean equals(Employee e) {
		if (this.name.equals(e.name) && this.id == e.id && this.position.equals(e.position))
			return true;
		return false;
	}

	public String toString() {
		return name + " " + id + " " + position;
	}
	
	//
	public int compareTo(Employee o) {
		
		return (this.id).compareTo(o.id);
	 
	}
}
