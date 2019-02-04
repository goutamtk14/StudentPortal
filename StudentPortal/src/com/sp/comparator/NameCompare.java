package com.sp.comparator;
import java.util.Comparator;

import com.sp.entity.Student;
public class NameCompare implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {

		return s1.getName().compareTo(s2.getName()); 
	}

}
