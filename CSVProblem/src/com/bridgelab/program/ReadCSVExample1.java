package com.bridgelab.program;

import java.io.*;  
import java.util.Scanner;  
public class ReadCSVExample1  
{  
public static void main(String[] args) throws Exception  
{   
Scanner sc = new Scanner(new File("F:\\CSVDemo.csv"));  
sc.useDelimiter(",");   
while (sc.hasNext())   
{  
System.out.print(sc.next());  
}   
sc.close(); 
}  
}  

