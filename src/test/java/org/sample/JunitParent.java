package org.sample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Junit.class,Junit1.class})


public class JunitParent {
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(Junit.class,Junit1.class);
		System.out.println(rs.getIgnoreCount());
		System.out.println(rs.getFailureCount());
		System.out.println(rs.getRunCount());
		System.out.println(rs.getRunTime());
		System.out.println(rs.wasSuccessful());
		List<Failure> failures = rs.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
			
		}
		
	}
			
		
	}


