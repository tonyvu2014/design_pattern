package com.tonyvu.designpattern.builder;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tonyvu.designpattern.builder.Profile;
import com.tonyvu.designpattern.builder.ProfileBuilder;
import com.tonyvu.designpattern.builder.ProfileBuilderImpl;
import com.tonyvu.designpattern.builder.enumtype.Gender;

public class ProfileBuilderTest {
	
	ProfileBuilder profileBuilder;

	@Before
	public void setUp() throws Exception {
		profileBuilder = new ProfileBuilderImpl();
	}

	@After
	public void tearDown() throws Exception {
		profileBuilder = null;
	}

	@Test
	public void testBuild() {
		Profile profile = profileBuilder.setName("Alibaba").setGender(Gender.MALE).setAge(2000).build();
		
		assertEquals(profile.getAge(), 2000);
		assertEquals(profile.getName(), "Alibaba");
		assertEquals(profile.getGender(), Gender.MALE);
	}

}
