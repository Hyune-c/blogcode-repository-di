package com.example.blogcoderepositorydi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public final class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private Integer age;
	private String adress;

	public Student(final String name, final Integer age, final String adress) {
		this.name = name;
		this.age = age;
		this.adress = adress;
	}

	public static Student of(final String name, final Integer age, final String adress) {
		return new Student(name, age, adress);
	}
}
