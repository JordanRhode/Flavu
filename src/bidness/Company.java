package bidness;

import com.flavu.R.string;

public class Company extends DataObject
{
	private long _companyID;
	private string _name;
	
	public long get_companyID()
	{
		return _companyID;
	}
	public void set_companyID(long _companyID)
	{
		this._companyID = _companyID;
	}
	public string get_name()
	{
		return _name;
	}
	public void set_name(string _name)
	{
		this._name = _name;
	}
	
	
}
