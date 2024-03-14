import java.util.Scanner;  
  
public class LeapYear1   
{  
  
// a method that checks whether the   
// year y is a leap year or not  
boolean isLeapYr(int y)  
{  
// if condition that handles  
// the century year as well as the non-century year  
if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))  
{  
return true;  
}  
  
return false;  
}  
  
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class LeapYear1  
LeapYear1 obj = new LeapYear1();  
  
// we are taking input using the Scanner Class  
  
Scanner scnObj = new Scanner(System.in);  
  
System.out.println("Enter Year ");  
  
// input 1  
int year = scnObj.nextInt();  
  
if(obj.isLeapYr(year))  
{  
    System.out.println("The year " + year + " is a leap year.");  
}  
else  
{  
    System.out.println("The year " + year + " is not a leap year.");  
}  
  
System.out.println();  
  
System.out.println("Enter Year ");  
  
// input 2  
year = scnObj.nextInt();  
  
if(obj.isLeapYr(year))  
{  
    System.out.println("The year " + year + " is a leap year.");  
}  
else  
{  
    System.out.println("The year " + year + " is not a leap year.");  
}  
  
System.out.println();  
  
System.out.println("Enter Year ");  
  
// input 3  
year = scnObj.nextInt();  
  
if(obj.isLeapYr(year))  
{  
    System.out.println("The year " + year + " is a leap year.");  
}  
else  
{  
    System.out.println("The year " + year + " is not a leap year.");  
}  
  
System.out.println();  
  
System.out.println("Enter Year ");  
  
// input 4  
year = scnObj.nextInt();  
  
if(obj.isLeapYr(year))  
{  
    System.out.println("The year " + year + " is a leap year.");  
}  
else  
{  
    System.out.println("The year " + year + " is not a leap year.");  
}  
  
  
  
  
}  
}  
