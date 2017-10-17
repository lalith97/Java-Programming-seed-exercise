package com.ex8.pack2;

public class Batch {
int sectionnumber;
String division;

public void batchdetails(int sectionnumber,String division)
{
	this.sectionnumber=sectionnumber;
	this.division=division;
	System.out.println(" "+sectionnumber+"\n"+division);
}
}
