package org.power;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({A.class,B.class})
public class C {
public static void main(String[] args) {
	Result rs=JUnitCore.runClasses(A.class,B.class);
	System.out.println("run count"+rs.getRunCount());
	System.out.println("Failure count"+rs.getFailureCount());
	System.out.println("Failures:"+rs.getFailures());
	System.out.println("Ignore count"+rs.getIgnoreCount());
	List<Failure>fa = rs.getFailures();
	for(Failure x:fa) {
		System.out.println(x);
	}
}
}

