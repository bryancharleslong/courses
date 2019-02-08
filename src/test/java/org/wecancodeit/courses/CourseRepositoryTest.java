package org.wecancodeit.courses;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

public class CourseRepositoryTest {
	
	private long firstCourseId =1L;
	private Course firstCourse = new Course(firstCourseId, "first course name", "first course description");
	private long secondCourseId = 2L;
	private Course secondCourse = new Course(secondCourseId, "second course name", "second course description");
	CourseRepository underTest;
	
	@Test
	public void shouldFindACourse() {
		underTest = new CourseRepository(firstCourse);
		Course result = underTest.findOne(firstCourseId);
		assertThat(result, is(firstCourse));
	}
	
	@Test
	public void shouldFindASecondCourse() {
		underTest = new CourseRepository(secondCourse);
		Course result = underTest.findOne(secondCourseId);
		assertThat(result, is (secondCourse));
	}
	
	@Test
	public void shouldFindAllCourses() {
		underTest = new CourseRepository(firstCourse, secondCourse);
		Collection<Course> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstCourse, secondCourse));
	}
}
