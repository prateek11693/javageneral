package com.general.general;

public class Persons implements Comparable {

	String name;
	Integer id;

	public Persons(String name, int id) {
		this.name = name;
		this.id = id;

	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", id=" + id + "]";
	}

	/*
	 * @Override public int compareTo(Object anotherPerson) {
	 * 
	 * return this.getName().compareTo(((Persons) anotherPerson).getName()); }
	 */

	@Override
	public int compareTo(Object anotherPerson) {

		return this.getId().compareTo(((Persons) anotherPerson).getId());
	}

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

}
