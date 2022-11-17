package Questions;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DateParsing {

	public static void main(String[] args) {
		List<DataParsingObj> ls = new ArrayList<>();
		DataParsingObj dtpq1 = new DataParsingObj("may-08-2022","may-20-2022");
		DataParsingObj dtpq2 = new DataParsingObj("jun-12-2022","jun-30-2022");
		DataParsingObj dtpq3 = new DataParsingObj("jan-20-2022","jan-23-2022");
		DataParsingObj dtpq4 = new DataParsingObj("feb-21-2022","feb-27-2022");
		DataParsingObj dtpq5 = new DataParsingObj("sep-09-2022","sep-19-2022");
		ls.add(dtpq1);
		ls.add(dtpq5);
		ls.add(dtpq4);
		ls.add(dtpq3);
		ls.add(dtpq2);
		
		
		List<Date[]> dt = new ArrayList<>();
		dt = parseDate(ls);
		for(Date[] dth : dt) {
		System.out.println(dth);
		}
	}
	public static List<Date[]> parseDate(List<DataParsingObj> ls) {
//		DateObj dObj = new DateObj(); 
		Date[] dObj =new Date[2];
		
		List<Date[]> dt = new ArrayList<>();
		SimpleDateFormat formatter = new SimpleDateFormat("MMM-dd-yyyy", Locale.ENGLISH);		
		
		for(int i=0;i<ls.size();i++){
        
		try {
		dObj[0]  =   formatter.parse(ls.get(i).getEd());
		dObj[1]  =   formatter.parse(ls.get(i).getJd());
		dt.add(dObj);		
			} catch (ParseException e) {			
			e.printStackTrace();
		}catch (Exception exp) {
			exp.printStackTrace();
		}		
		}	
		
		return dt;
		}
}
class DateObj {
	Date jDate;
	Date eDate;
	
	public DateObj() {
		super();
		
	}
	public DateObj(Date jDate, Date eDate) {
		super();
		this.jDate = jDate;
		this.eDate = eDate;
	}
	@Override
	public String toString() {
		return "DateObj [jDate=" + jDate + ", eDate=" + eDate + "]";
	}
	public Date getjDate() {
		return jDate;
	}
	public void setjDate(Date jDate) {
		this.jDate = jDate;
	}
	public Date geteDate() {
		return eDate;
	}
	public void seteDate(Date eDate) {
		this.eDate = eDate;
	}
}

