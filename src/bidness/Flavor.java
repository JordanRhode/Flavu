package bidness;

import java.util.ArrayList;
import com.flavu.R.string;

public class Flavor extends DataObject
{
	private long _flavorID;
	private long _companyID;
	private Company _company;
	private string _title;
	private ArrayList<string> _keywords;
	private string _description;
		
	public long get_flavorID()
	{
		return _flavorID;
	}

	public void set_flavorID(long _flavorID)
	{
		this._flavorID = _flavorID;
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

	public string get_title()
	{
		return _title;
	}

	public void set_title(string _title)
	{
		this._title = _title;
	}

	public ArrayList<string> get_keywords()
	{
		return _keywords;
	}

	public void set_keywords(ArrayList<string> _keywords)
	{
		this._keywords = _keywords;
	}

	public string get_description()
	{
		return _description;
	}

	public void set_description(string _description)
	{
		this._description = _description;
	}

	public boolean ContainsKeyword(string word)
	{
		for (string s : _keywords)
		{
			if (s.equals(word))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean ContainsKeyword(ArrayList<string> words)
	{
		for (string word : words)
		{
			if (ContainsKeyword(word))
			{
				return true;
			}
		}
		
		return false;
	}

}
