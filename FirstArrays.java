/**
Name: FirstArrays
Description: displays number 0-4 on an array
Created By: Aunjila Parvin
Created On: 01/04/2018
*/
class FirstArrays{
public static void main(String args[]){

int []x;
x = new int [4];
x[0]=0;//initialization
x[1]=1;
x[2]=3;
x[3]=4;




//printing array
for(int i=0;i<x.length;i++)//length is the property of array
System.out.println(x[i]);

}
}