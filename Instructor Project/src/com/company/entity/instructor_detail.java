package com.company.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "instructor_detail")
public class instructor_detail {
	
	@OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
	private instructor instructor;
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "youtube_channel")
	private String youtube;
	
	@Column(name = "hobby")
	private String hobby;
	

	public instructor_detail() {
		
	}

	public instructor_detail(String youtube, String hobby) {
		this.youtube = youtube;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	//For bi-directional
	public instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(instructor instructor) {
		this.instructor = instructor;
	}
	

	@Override
	public String toString() {
		return "instructor_detail [id=" + id + ", youtube=" + youtube + ", hobby=" + hobby + "]";
	}

	
	
	
}
