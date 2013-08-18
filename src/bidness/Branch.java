package bidness;

import java.util.ArrayList;

import com.flavu.R.string;

public class Branch extends DataObject
{
	
	private long _branchID;
	private long _companyID;
	private Company _company;
	private string _address;
	private string _city;
	private string _state;
	private string _zip;
	private string _phone;
	
	public long get_branchID()
	{
		return _branchID;
	}
	public void set_branchID(long _branchID)
	{
		this._branchID = _branchID;
	}
	public long get_companyID()
	{
		return _companyID;
	}
	public void set_companyID(long _companyID)
	{
		this._companyID = _companyID;
	}
	public Company get_company()
	{
		return _company;
	}
	public void set_company(Company _company)
	{
		this._company = _company;
	}
	public string get_address()
	{
		return _address;
	}
	public void set_address(string _address)
	{
		this._address = _address;
	}
	public string get_city()
	{
		return _city;
	}
	public void set_city(string _city)
	{
		this._city = _city;
	}
	public string get_state()
	{
		return _state;
	}
	public void set_state(string _state)
	{
		this._state = _state;
	}
	public string get_zip()
	{
		return _zip;
	}
	public void set_zip(string _zip)
	{
		this._zip = _zip;
	}
	public string get_phone()
	{
		return _phone;
	}
	public void set_phone(string _phone)
	{
		this._phone = _phone;
	}
	
	public ArrayList<Flavor> GetFlavors()
	{
		return GetFlavors(new ArrayList<string>());
	}
	
	public ArrayList<Flavor> GetFlavors(ArrayList<string> keywords)
	{
		ArrayList<Flavor> flavors = new ArrayList<Flavor>();
		//TODO: Implement a search object like in snowshoe?
		//Search search = new Search(Flavor
		
		return flavors;
	}
	
}
