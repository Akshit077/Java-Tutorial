package Mypack;

public class Account
{
	long ph_no;
	String name;
	long acc_no;
	String email;
	float bal;
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public long getno()
	{
		return ph_no;
	}
	public void setphno(long ph_no)
	{
		this.ph_no=ph_no;
	}
	public String getemail()
	{
		return email;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public float getbal()
	{
		return bal;
	}
	public void setbal(float bal)
	{
		this.bal=bal;
	}
	}


