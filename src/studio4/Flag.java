package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.25);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledEllipse(0.5, 0.5, 0.13, 0.13);
	}
}