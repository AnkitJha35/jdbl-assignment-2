package comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComparableMain {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person(1, "Ankit", 24, 10000));
		people.add(new Person(2, "Rahul", 26, 15000));
		people.add(new Person(3, "Ankur", 25, 9000));
		people.add(new Person(4, "Ankit", 24, 12000));
		people.add(new Person(5, "Gautam", 26, 17000));
		people.add(new Person(6, "Nikhil", 27, 19000));

		System.out.println("********************************Before sorting:***********************************");
		System.out.println(people);

		people.sort(null);

		System.out.println("********************************After sorting:************************************");
		System.out.println(people);
	}

}

class Person implements Comparable<Person> {

	private int id;
	private String name;
	private int age;
	private int salary;

	public Person() {

	}

	public Person(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Person other) {
		int nameComparison = this.name.compareTo(other.name);
		if (nameComparison != 0) {
			return nameComparison;
		}
		return Integer.compare(this.salary, other.salary);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return id == person.id && age == person.age && salary == person.salary && Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, age, salary);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}