package mypackage;
class Calender
{
	int i,j,monthno,end,date,start=1;
	String weekdays[]={"sun","mon","tue","wed","thu","fri","sat"};
	void january()
	{
		date=1;
		monthno=1;
		
		System.out.println("------------------------JANUARY---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<6;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=31)
				{
					if(j<start&&start>=0)
					{
						System.out.print(" "+"\t");
					}
					else
					{
				System.out.print(date+"\t");
				date++;
				end=j;
					}
				}
			}
			start=-1;
			System.out.println();
			if(end==6)
				end=0;		
		}		
		System.out.println("------------------------------------------------------");
	}
	void fab()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------FEBRUARY---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=28)
				{
				  if(j<start&&start>=0)
				  {
					  System.out.print(" "+"\t");
				  }
				  else
				  {
				  System.out.print(date+"\t");
				 date++;
				 end=j;
				  }
				}
			}
			start=-1;
			System.out.println();
		}
		if(end==6)
			end=0;
		System.out.println("------------------------------------------------------");
	}
	void mar()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------MARCH---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=31)
				{
					if(j<start&&start>=0)
					{
					System.out.print(" "+"\t");
					}
					else
					{
						System.out.print(date+"\t");
						date++;
						end=j;
					}
			}
			}
			start=-1;
			System.out.println();
			if(end==6)
				end=0;
		}
		System.out.println("------------------------------------------------------");
	}
	void april()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------APRIL---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=30)
				{
				 if(j<start&&start>=0)
				 {
					 System.out.print(" "+"\t");
				 }
				 else
				 {
					 System.out.print(date+"\t");
					 date++;
					 end=j;
				 }
				}
			}
			start=-1;
			System.out.println();	
			if(end==6)
			 end=0;
		}
		System.out.println("------------------------------------------------------");
	}
	void may()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------MAY---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=31)
				{
				 if(j<start&&start>=0)
				 {
				  System.out.print(" "+"\t");
				 }
				 else
				 {
				System.out.print(date+"\t");
				date++;
				end=j;
				 }
				}
			}
			start=-1;
			System.out.println();
			if(end==6)
				end=0;
		}
		System.out.println("------------------------------------------------------");
	}
	void jun()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------JUN---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=30)
				{
				 if(j<start&&start>=0)
				 {
					 System.out.print(" "+"\t");
				 }
				 else
				 {
				System.out.print(date+"\t");
				date++;
				end=j;
			}
				}
			}
			start=-1;
			System.out.println();
		}
		if(end==6)
			end=0;
		System.out.println("------------------------------------------------------");
	}
	void july()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------JULY---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=31)
				{
					if(j<start&&start>=0)
					{
				    System.out.print(" "+"\t");
					}
					else
					{
						System.out.print(date+"\t");
					    date++;
					    end=j;
					}
			}
			}
		
			start=-1;
			System.out.println();
		}
		if(end==6)
			end=0;
		System.out.println("------------------------------------------------------");
	}
	void aug()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------AUGUST---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=31)
				{
				 if(j<start&&start>=0)
				 {
					 System.out.print(" "+"\t");
				 }
				 else
				 {
				System.out.print(date+"\t");
				date++;
				end=j;
				 }
			}
			}start=-1;
			System.out.println();
			if(end==6)
				end=0;
		}
		System.out.println("------------------------------------------------------");
	}
	void sep()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------SEPTEMBER---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<6;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=30)
				{
				 if(j<start&&start>=0)
				 {
					 System.out.print(" "+"\t");
				 }
				 else
				 {
				System.out.print(date+"\t");
				date++;
				end=j;
				 }
			}
			}start=-1;
			System.out.println();
			if(end==6)
				end=0;
		}
		System.out.println("------------------------------------------------------");
	}
	void oct()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=end+1;;
		}
		System.out.println("------------------------OCTOBER---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=31)
				{
					if(j<start&&start>=0)
					{
						System.out.print(" "+"\t");
					}
					else
					{
				    System.out.print(date+"\t");
				    date++;
				    end=j;
					}
				}
				
			}start=-1;
			System.out.println();
			if(end==6)
				end=0;
		}
		System.out.println("------------------------------------------------------");
	}
	void nov()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------NOVEMBER---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=31)
				{
					if(j<start&&start>=0)
					{
						System.out.print(" "+"\t");
					}
					else
					{
						System.out.print(date+"\t");
						date++;
						end=j;
					}
			}
			}start=-1;
			System.out.println();
			if(end==6)
				end=0;
		}
		System.out.println("------------------------------------------------------");
	}
	void dec()
	{
		date=1;
		monthno++;
		if(end!=0)
		{
		start=end+1;
		}
		else
		{
			start=0;
		}
		System.out.println("------------------------DECEMBER---------------------");
		System.out.println("MONTH NO="+monthno);
		for(i=0;i<weekdays.length;i++)
		{
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(date<=31)
				{
					
					if(j<start&&start>=0)
					{
					System.out.print(" "+"\t");
					}
				else
				{
				System.out.print(date+"\t");
				date++;
				end=j;
				}
			}
			}start=-1;
			System.out.println();
			if(end==6)
				end=0;
		}
		System.out.println("------------------------------------------------------");
	}
}
public class Main {

	public static void main(String[] args) {
		Calender c=new Calender();
		c.january();
		c.fab();
		c.mar();
		c.april();
		c.may();
		c.jun();
		c.july();
		c.aug();
		c.sep();
		c.oct();
		c.nov();
		c.dec();
	}

}
