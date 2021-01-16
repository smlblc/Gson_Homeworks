package com.example.gsonhomeworks.time_line;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TimeLineResponse{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("_cacheHit")
	private boolean cacheHit;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setCacheHit(boolean cacheHit){
		this.cacheHit = cacheHit;
	}

	public boolean isCacheHit(){
		return cacheHit;
	}
}