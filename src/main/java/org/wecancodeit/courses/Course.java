package org.wecancodeit.courses;

public class Course {

	private long id;
	private String courseName;
	private String courseDescription;

	public Long getId() {
		return id;
	}
	
	public Course(long id, String courseName, String courseDescription) {
		this.id=id;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}

}
