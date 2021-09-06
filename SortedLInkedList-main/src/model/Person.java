package model;



public class Person implements Comparable<Person> {

private String name;
private String id;
private int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }


    @Override
	public int compareTo(Person o) {
		return getName().compareTo(o.getName());
		

	}

    
}
