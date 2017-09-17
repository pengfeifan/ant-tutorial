package com.github.ant.test;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame("hello ant");
		
		frame.setSize(new Dimension(200,300));
		frame.setBackground(new Color(200,200,200));
		frame.setAlwaysOnTop(true);
		frame.getContentPane().add(new JButton("Ant"));
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
