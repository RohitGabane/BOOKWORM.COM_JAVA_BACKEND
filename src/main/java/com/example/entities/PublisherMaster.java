package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PublisherMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publisherId;
    
    private String publisherName;
    
    private String publisherContactNo;
    // Other publisher attributes

	public Long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherContactNo() {
		return publisherContactNo;
	}

	public void setPublisherContactNo(String publisherContactNo) {
		this.publisherContactNo = publisherContactNo;
	}
    
    // Getter and setter methods
    
}