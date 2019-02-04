package com.sp.comparator;

import java.util.Comparator;

import com.sp.entity.Student;

public class IdCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	if(o1.getId()>o2.getId()) {return +1;}
	if(o1.getId()<o2.getId()) {return -1;}
	else return 0;
	}
	

}
