package ExceptionHandling;

public class MyDate {
	int day,month,year;
	public MyDate(){
		day=1;
		month=1;
		year=1;
	}
	public MyDate(String s)throws InvalidDayException,InvalidMonthException{
		String[]starr = s.split("/");
		day=Integer.parseInt(starr[0]);
		month=Integer.parseInt(starr[1]);
		year=Integer.parseInt(starr[2]);

		if(month<1||month>12){
			throw new InvalidMonthException("Month is invalid");
		}
        if((day>=1 && day<=31) && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12))
        	System.out.println("Valid date");
        else if((day>=1 && day<=30) && (month==4 || month==6 || month==9 || month==11))
        	System.out.println("Valid date");
        else if((day>=1 && day<=28) && (month==2))
        	System.out.println("Valid date");
        else if(day==29 && month==2 && (year%400==0 ||(year%4==0 && year%100!=0)))
            System.out.println("Valid date");
        else
            throw new InvalidDayException("Day is invalid");
	}
}
