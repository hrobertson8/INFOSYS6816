package edu.umsl.patient;

import java.util.Comparator;

public class PatientSorter implements Comparator<Patient>{

	public int compare(Patient o1, Patient o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}

}
