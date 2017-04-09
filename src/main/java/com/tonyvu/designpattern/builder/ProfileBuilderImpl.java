package com.tonyvu.designpattern.builder;

import com.tonyvu.designpattern.builder.enumtype.Gender;

public class ProfileBuilderImpl implements ProfileBuilder {
	
	private Profile profile;
	
	public ProfileBuilderImpl() {
		this.profile = new Profile();
	}

	@Override
	public ProfileBuilder setName(String name) {
		profile.setName(name);
		return this;
	}

	@Override
	public ProfileBuilder setAge(int age) {
		profile.setAge(age);
		return this;
	}

	@Override
	public ProfileBuilder setGender(Gender gender) {
		profile.setGender(gender);
		return this;
	}

	@Override
	public Profile build() {
		return profile;
	}

}
