package com.sangamone;

import java.io.Serializable;

public enum Colors implements Serializable{
	BLACK("#000000"),RED("#FF0000"),GREEN("#008000"),BLUE("#008000"),ORANGE("#FFA500"),VIOLET("#8F00FF"),WHITE("#FFFFFF"),PINK("#FFC0CB"),YELLOW("#FFFF00");
	private String code;
	private Colors(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
