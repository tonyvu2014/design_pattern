package com.tonyvu.designpattern.builder;

import com.tonyvu.designpattern.builder.enumtype.Gender;

public interface ProfileBuilder {
	
	public ProfileBuilder setName(String name);
	
	public ProfileBuilder setAge(int age);
	
	public ProfileBuilder setGender(Gender gender);
	
	public Profile build();

}
