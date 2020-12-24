

//import Labs.Lab4Fall2020.List;

/**
 * Expense list provided by Srini
 */
public class ExpenseList
{
	private List<Expense> expenses;


	public ExpenseList()
	{
		expenses = new List<Expense>();
	}
	public void add(Expense exp)
	{
		expenses.add(exp);
	}

	public boolean isEmpty()
	{
		return expenses.isEmpty();
	}
	public boolean contains(Expense exp)
	{
		return expenses.contains(exp);
	}
	public Expense first()
	{
		return expenses.first();
	}
	public Expense next()
	{
		return expenses.next();
	}
	public void enumerate()
	{
		expenses.enumerate();
	}

    /**
     * returns the highest expense object in the expenses list
	 * @return
     */
	public double maxExpense()
	{
		double max =0.0, amt;
		Expense exp = expenses.first();
		while (exp!=null)
		{
			amt = exp.getAmount();
			if (amt>max)
				max = amt;
			exp = expenses.next();
		}
		return max;
	}

    /**
     * returns the lowest expense object in the expenses list
	 * @return
     */
	public double minExpense()
	{
		double min =Double.MAX_VALUE, amt;
		Expense exp = expenses.first();
		if (exp==null) return 0.0;
		else
		{

			while (exp!=null)
			{
				amt = exp.getAmount();
				if (amt<min)
					min = amt;
				exp = expenses.next();
			}
		}
		return min;
	}

    /**
     * returns the average expense value from the expenses list
	 * @return
     */
	public double avgExpense()  //to be completed by the student
	{
		//your work starts here
		//Initialize total amount
		double total = 0.0;
		int count = 0;
		//
		Expense exp = expenses.first();
		if (exp==null) return 0.0;
		else
		{

			while (exp!=null)
			{
				total = exp.getAmount()+total;//add to total amount each time
				count++;
				exp = expenses.next();
			
		}
		}
		return total/count;
	}

    /**
     * returns the total expenses from the expense list
	 * @return
     */
	public double totalExpense() //to be completed by the student
	{
		double total = 0.0;
		Expense exp = expenses.first();
		if (exp==null) return 0.0;
		else
		{

			while (exp!=null)
			{
				total = exp.getAmount()+total;//add to total amount each time
				exp = expenses.next();
			
		}
		}
		return total;
	}

    /**
     * returns the total amount spent on a given item from the expenses lists
	 * @param expItem
     * @return
     */
	public double amountSpentOn(String expItem) //to be completed by the student
	{
		double total = 0.0;
		Expense exp = expenses.first();
		if (exp==null) return 0.0;
		else
		{

			while (exp!=null)
			{
				//method getItem that matches the given item
				if(exp.getItem().equals(expItem)) {
					total = exp.getAmount()+total;
				
					
				}
				exp = expenses.next();
		}
		}
		return total;
	}


}

