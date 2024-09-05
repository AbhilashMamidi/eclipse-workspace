package checkedUnckedException;

public class Stack 
{
 private int size;
 private int top= -1;
 private int S[];
 public Stack(int sz)
 {
	 size=sz;
	 S=new int[sz];
 }
	 
	 public void push(int x) throws StackOverFlowException
	 {
		 if(top==size-1)
			 throw new StackOverFlowException();
		 top ++;
		 S[top]=x;
	 }
	 public int pop() throws StackUnderFlowException
	 {
		 int x=-1;
		 if(top==-1)
		  throw new StackUnderFlowException();
		 x=S[top];
		 top--;
		 return x;
	 }
	 
}
