/* Write a program to calculate the area of a circle. Take the radius as input and use the formula: Area = π * radius^2.*/

import java.util.*;
public class problem_4{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
double radius = scanner.nextDouble();
double area = Math.PI * Math.pow(radius,2);
System.out.println(area);
scanner.close();
}}