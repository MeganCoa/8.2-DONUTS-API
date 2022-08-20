package co.grandcircus.APIOne.Models;

import java.util.List;

public class Donut {
	
	private Integer id;
	private String ref;
	private String name;
	private Integer calories; 
	private List<String> extras;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public Donut() {
		 
	}
	public Donut(Integer id, String ref, String name, Integer calories, List<String> extras) {
		super();
		this.id = id;
		this.ref = ref;
		this.name = name;
		this.calories = calories;
		this.extras = extras;
	}
	
	
}
