package com.revature;

public class MyChild extends MyParent {

	private int childId;
	private String childName;

	public MyChild() {
		super();
	}

	public MyChild(int childId, String childName) {
		super();
		this.childId = childId;
		this.childName = childName;
	}

	public static void main(String[] args) {
		MyChild obj = new MyChild();

	}

	@Override
	public String toString() {
		return "MyChild [childId=" + childId + ", childName=" + childName + "]";
	}

}
