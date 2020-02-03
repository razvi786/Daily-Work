package com.cts.activity.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="employee_type",discriminatorType=DiscriminatorType.STRING,length = 2)
//@DiscriminatorValue(value = "E")
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee implements Serializable {

	private static final long serialVersionUID = -7660959753596294004L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;

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

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
