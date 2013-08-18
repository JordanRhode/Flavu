package bidness;

import java.util.Date;

public class FlavorOfDay 
{
	private long _flavorOfDayID;
	private long _branchID;
	private Branch _branch;
	private long _flavorID;
	private Flavor _flavor;
	private Date _date;
	
	public long get_flavorOfDayID()
	{
		return _flavorOfDayID;
	}
	public void set_flavorOfDayID(long _flavorOfDayID)
	{
		this._flavorOfDayID = _flavorOfDayID;
	}
	public long get_branchID()
	{
		return _branchID;
	}
	public void set_branchID(long _branchID)
	{
		this._branchID = _branchID;
	}
	public Branch get_branch()
	{
		return _branch;
	}
	public void set_branch(Branch _branch)
	{
		this._branch = _branch;
	}
	public long get_flavorID()
	{
		return _flavorID;
	}
	public void set_flavorID(long _flavorID)
	{
		this._flavorID = _flavorID;
	}
	public Flavor get_flavor()
	{
		return _flavor;
	}
	public void set_flavor(Flavor _flavor)
	{
		this._flavor = _flavor;
	}
	public Date get_date()
	{
		return _date;
	}
	public void set_date(Date _date)
	{
		this._date = _date;
	}
	
	
}
