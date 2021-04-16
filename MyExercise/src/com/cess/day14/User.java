package com.cess.day14;

class User {
	String name;
	int age;
	
	// 重写其equals()方法
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User)obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	
	
	
}
