package com.example.gsonhomeworks.dog_brreds;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DogBrredsResponse{

	@SerializedName("message")
	private List<String> message;

	@SerializedName("status")
	private String status;

	public void setMessage(List<String> message){
		this.message = message;
	}

	public List<String> getMessage(){
		return message;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}