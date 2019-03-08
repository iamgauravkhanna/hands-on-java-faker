package com.notjustatester.learning_java_faker;

import com.github.javafaker.Faker;

public class Example1 {

	public static void main(String args[]) {

		Faker fakerObj = new Faker();

		System.out.println("First Name : " + fakerObj.name().firstName());

		System.out.println("Last Name : " + fakerObj.name().lastName());

	}

}