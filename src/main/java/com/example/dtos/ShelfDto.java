package com.example.dtos;

public class ShelfDto 
{
	private String name;
	private String filePath;
	private String imagePath;
	
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ShelfDto [name=" + name + "]";
	}
	
	

}
