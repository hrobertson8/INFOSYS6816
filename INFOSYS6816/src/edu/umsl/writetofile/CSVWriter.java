package edu.umsl.writetofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVWriter {
  public static void main(String[] args) {

    try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

      StringBuilder sb = new StringBuilder();
      sb.append("Date");
      sb.append(",");
      sb.append("Meal");
      sb.append(",");
      sb.append("Food Item");
      sb.append(",");
      sb.append("Calories");
      sb.append(",");
      sb.append("Carbs");
      sb.append(",");
      sb.append("Sugar");
      sb.append(",");
      sb.append("Fiber");
      sb.append(",");
      sb.append("Protein");
      sb.append(",");
      sb.append("Total Fat");
      sb.append('\n');

      writer.write(sb.toString());

      System.out.println("File Printed!");

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }

  }
}