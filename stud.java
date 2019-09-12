import java.util.*;
class person
{
 String add[]=new String[20];
 String name[]=new String[20];
 int age[]=new int[20];
 void setdata(int n)
 {
 for(int i=0;i<n;i++)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter name ,age and address of the student."+(i+1));
  name[i]=sc.next();
  age[i]=sc.nextInt();
  add[i]=sc.next();
 }
 }
}

class student1 extends person
{
 int rollno[]=new int[20];
 int sem[]=new int[20];
 
 void set(int n)
 { 
 super.setdata(n);
 for(int i=0;i<n;i++)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter roll no. and sem of the student.");
  rollno[i]=sc.nextInt();
  sem[i]=sc.nextInt();
  }
  
}
}
class exam extends student1
{
	int mark1,mark2;
	
	void average(int n)
	{ int j=0;
	double gr;
	double avg[]=new double[20];
	super.set(n);
	for(int i=0;i<n;i++)
	{
	
	
	Scanner sc=new Scanner(System.in);
	
   	System.out.println("Enter marks of 2 subject for student "+ (i+1));
  	mark1=sc.nextInt();
  	mark2=sc.nextInt();
  	avg[i]=(mark1+mark2)/2;
  	}
  	gr=avg[0];
  	
  	for(int i=0;i<n;i++)
  	{ 
  	if(gr<avg[i])
  	{	gr=avg[i];
  		j=i;
  	}
  	}
  	System.out.println("TOPPER OF CLASS:");
  	System.out.println("name: "+name[j]+"\n"+"Age: "+age[j]+"\n"+"Address: "+add[j]+"\n"+"roll no.: "+rollno[j]+"\n"+"Semester: "+sem[j]+"\n"+"Average: "+avg[j]);
  	}
  	}
  class personmain
  	{
  	public static void main(String args[])
  	{
  		Scanner sc=new Scanner(System.in);
  		System.out.println("Enter number of students");
  		int n=sc.nextInt();
  		person p=new person();
  		student1 s=new student1();
  		exam e=new exam();
  		e.average(n);
  	}
  	}

    
    
    