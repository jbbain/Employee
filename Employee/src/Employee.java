import java.util.Date;

public class Employee {
boolean managerFlag;
String name; 
Date dateHired;
int id;

//Add minimum hours per week and compare it with 40hrs, if it is less than 40 then they are a part time employee
int fullTimeHours = 40;
int minHoursPerWeek;

public String getName() {
	return name;
}

public Date getDateHired() {
	return dateHired;
}

public int getId() {
	return id;
}

//Methods
public boolean isManager(){
	return true;
}

//Use this new method to determine if employee is working full time hours or not
public boolean isPartTime(){
	return minHoursPerWeek < fullTimeHours;
}


}
