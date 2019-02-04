package com.sp.comparator;
import java.util.Comparator;

import com.sp.entity.Student;

public class DeptCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getDept().compareTo(o2.getDept());
	}
	

}
