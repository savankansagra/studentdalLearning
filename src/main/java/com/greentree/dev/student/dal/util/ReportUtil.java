package com.greentree.dev.student.dal.util;

import java.io.File;
import java.util.List;

public interface ReportUtil {

	public void generatePieChart(File path, List<Object[]> data);
	
	
}
