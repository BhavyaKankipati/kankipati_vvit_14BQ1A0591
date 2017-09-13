import java.util.Date;
import java.io.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation  extends Exception{

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
     		// Add your implementation here
                
		Students[] s=new Students[len];
                for(int i=0;i<Student.length;i++)
		   s[i]=Students[i];
           return s;
		
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(student==null)
		{
		  throw new IllegalArgumentException("invalid");
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
                
		if(index<0 || index>=Student.length)
		{
                    throw new IllegalArgumentException("invalid");
		}
		else
		{
                   int i=0;
		   for(i=0;i<Student.length;i++)
		   {
		      if(i==index)
			return Student[i;
		   }
                 }
			
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=Student.length)
		{
                    throw new IllegalArgumentException("invalid");
		}
		else
		{
			int i;
			for(i=index;i<Student.length;i++)
			{
				Student[i+1]=Student[i];
			}
			Student[index]=student;
		}
			
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		{
                  throw new IllegalArgumentException("invalid");
		}
		else
		{
		   int first=0;
                   for(i=0;i<Students.length;i++)
		   {
			Student[i+1]=Student[i];
                    }
                   Student[0]=student;
		}

	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
               if(student==null)
		{
                   throw new IllegalArgumentException("invalid");
		}
               else
		{
		   int len=Student.length;
                   Student[len+1]=student;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
		{
		  throw new IllegalArgumentException("invalid");
		}
                else if(index<0 || index>Student.length)
		{
                    throw new IllegalArgumentException("invalid");
		}
		else
		{
			 for(int i=index;i<Student.length;i++)
		             Student[i+1]=Student[i];
			Student[index]=student;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
		throw new IllegalArgumentException("invalid");
		else
		{  int index,i;
		   for(i=0;i<Student.length;i++)
		   {
		      if(Student[i]==student)
		         index=i;
		    }
                   for(i=index;i<Student.length;i++)
			Student[i+1]=Student[i];
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=Student.length)
		  throw new IllegalArgumentException("invalid");
		else
		 { 
			int index;
                    for(i=index+1;i<Student.length;i++)
		    {
			Student[i]=null;
		    }
		}
		    
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException("invalid");
		else
		{ 
			int index;
			int len=Student.length;
			for(int i=0;i<Student.length;i++)
			{
				if(Student[i]==student)
					index=i;
			}
			Student[len-index-1];

		}

	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
             if(index<0 || index>=Student.length)
	        throw new IllegalArgumentException("invalid");
	     else
	     {
		Student[index]=null;
	     }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
              if(student==null)
		throw new IllegalArgumentException("invalid");
	      else
		{
                   int index,i;
		   for(i=0;i<Student.length;i++)
		   {
			if(Student[i]==student)
				index=i;
		   }
		   for(i=index;i<Student.length;i++)
		   {
                    Student[index]=Student[index+1];
		    }
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
            int i=0;
           for(i=0;i<Student.length;i++)
	   {
		for(j=i+1;j<n;j++)
		{
			if(Student[i+1].compareTo(Student[i])>0)
			{
				Student temp;
				temp=Student[i];
				Student[i]=Student[i+1];
				Student[i+1]=temp;
			}
		}
	   }	
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null)
			throw new IllegalArgumentException("invalid");
		else
		{
                   Student[] temp;
		   int i=0,j=0;
		   for(i=0;i<Student.length;i++)
		   {
			if(Student[i].getBirthDate<=date)
			{
			   temp[j]=Student[i];
				j++;
			}
		   }
                    rerurn temp;		
		}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
                 if(firstDate==null || lastDate==null)
			throw new IllegalArgumentException("invalid");
    		else
		{  
                   int len=Student.length;
		   Student[] betdates=new Student[len];
		   int i,j=0;
		   for(i=0;i<Student.length;i++)
		   {
			if(Student[i].getBirthDate>= firstDate || Student[i].getBirthDate<=lastDate)
			{
				betdates[j]=Student[i];
				j++;
			}
		    }
                     return betdates;
		}
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==null)
		  throw new IllegalArgumentException("invalid");
                else
		{
                  int len=Student.length;
  		   Student[] near=new Student[len];
		   int i,j=0;
                   for(i=0;i<Student.length;i++)
		   {
			if(Student[i].getBirthDate==date)
			{
				near[j]=Student[i];
				j++;
			}
		   }
                   return near;
               }
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
                if(indexOfStudent==0)
		    throw new IllegalArgumentException();
		else
		{
	           Student current;
                   present=2017-09-13;
                      current=Student[indexOfStudent]
                      int age=current.getBirthDate-present;
                     return age;
		}
                 return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		if(age==0)
		    throw new IllegalArgumentException("invalid");
		else
		{
	           Student current;
		   int len=Student.length;
		   Student[] byage=new Student[len];
                   present=2017-09-13;
                   int i,j;
                   for(i=0;i<len;i++)
		   {
                     int studentage=Student[i].getBirthDate-present;
                     if(studentage==age)
		     {
		       byage[j]=Student[i];
			j++;
		     }
                   }
                   return byage;
		}
		
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int i=0,max=-999;
		int len=Student.length;
		Student temp[]=new Student[len];
		for(i=0;i<Student.length;i++)
		{
			if(Student[i].getAvgMark>=max)
				max=Student[i].getAvgMark;
		}
		int j=0;
		for(i=0;i<Student.length;i++)
		{
			if(Student[i].getAvgMark==max)
			   temp[j]=Student[i];
			  j++;
		}
                return temp;
		
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
             if(student==null)
	    {
		throw new  IllegalArgumentException();
	    }
	     else
		{
		   int index,i;
		   for(i=0;i<Student.length;i++)
		   {
			if(Student[i]==student)
				index=i;
		   }
		   return Student[index+1];
		}	
         }
}
