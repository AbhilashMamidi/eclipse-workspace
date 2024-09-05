package College;

public class Subject 
{
  private String subId;
  private String name;
  private int maxMarks;
  private int marksObtain;
public String getSubId() 
{
	return subId;
}
public void setSubId(String subId)
{
	this.subId = subId;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public int getMaxMarks()
{
	return maxMarks;
}
public void setMaxMarks(int maxMarks) 
{
	this.maxMarks = maxMarks;
}
public int getMarksObtain()
{
	return marksObtain;
}
public void setMarksObtain(int marksObtain) 
{
	this.marksObtain = marksObtain;
}
public Subject(String subId, String name, int maxMarks) 
{
	super();
	this.subId = subId;
	this.name = name;
	this.maxMarks = maxMarks;
	
}
@Override
public String toString()
{
	return "Subject [subId=" + subId + ", name=" + name + ", maxMarks=" + maxMarks + ", marksObtain=" + marksObtain
			+ "]";
}
  boolean isQualified()
  {
	  return marksObtain>=maxMarks/10*40;
  }
  
}
