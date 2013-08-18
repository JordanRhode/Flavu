package bidness;

import java.util.Date;
import com.flavu.R.string;
import android.text.format.Time;

public class Special extends DataObject
{
	private long _specialID;
	private long _companyID;
	private Company _company;
	private Date _startDate;
	private Date _endDate;
	private Time _startTime;
	private Time _endTime;
	private string _name;
	private string _description;
	
	public long get_specialID()
	{
		return _specialID;
	}
	public void set_specialID(long _specialID)
	{
		this._specialID = _specialID;
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
	public Date get_startDate()
	{
		return _startDate;
	}
	public void set_startDate(Date _startDate)
	{
		this._startDate = _startDate;
	}
	public Date get_endDate()
	{
		return _endDate;
	}
	public void set_endDate(Date _endDate)
	{
		this._endDate = _endDate;
	}
	public Time get_startTime()
	{
		return _startTime;
	}
	public void set_startTime(Time _startTime)
	{
		this._startTime = _startTime;
	}
	public Time get_endTime()
	{
		return _endTime;
	}
	public void set_endTime(Time _endTime)
	{
		this._endTime = _endTime;
	}
	public string get_name()
	{
		return _name;
	}
	public void set_name(string _name)
	{
		this._name = _name;
	}
	public string get_description()
	{
		return _description;
	}
	public void set_description(string _description)
	{
		this._description = _description;
	}
	
	
}
