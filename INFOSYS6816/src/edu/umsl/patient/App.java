package edu.umsl.patient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) throws IOException {
		App app = new App();
		app.patientTreeSet();

	}

	public void patientTreeSet() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Set<Patient> patients = new TreeSet<>(new PatientSorter());
		while (patients.size() < 2) {

			System.out.println("Enter Patient ID");
			System.out.println("Enter Patient First Name");
			System.out.println("Enter Patient Last Name");
			System.out.println("Enter Patient Illness");
			System.out.println("Enter Notes");

			int patientId = Integer.parseInt(br.readLine());
			String firstName = br.readLine();
			String lastName = br.readLine();
			String illness = br.readLine();
			String notes = br.readLine();

			patients.add(new Patient(patientId, firstName, lastName, illness, notes));
		}

		for (Patient patient : patients) {

			System.out.println("Patient ID: " + patient.patientID + " First: " + patient.firstName + " Last: "
					+ patient.lastName + " Illness: " + patient.illness + " Notes: " + patient.notes + " ");

		}

	}

}
