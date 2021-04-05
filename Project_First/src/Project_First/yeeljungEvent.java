package Project_First;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class yeeljungEvent implements ActionListener {
	Calendar		cal				= Calendar.getInstance();
	yeeljungView	ylv				= null;
	YeelJungDialog	searchDialog	= null;
//	Date date = new Date();

	public yeeljungEvent(yeeljungView ylv) {
		this.ylv = ylv;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();

		if (obj == ylv.jbtn_left) {
			ylv.month--;

			if (ylv.month < 1) {
				ylv.month = 12;
				ylv.year--;
			}
			ylv.RefreshDate();
		}

		if (obj == ylv.jbtn_right) {
			ylv.month++;

			if (ylv.month > 12) {
				ylv.month = 1;
				ylv.year++;
			}
			ylv.RefreshDate();

		}
		if (obj == ylv.jbtn_search) {
			searchDialog = new YeelJungDialog();
		}
		
		if (obj == ylv.jbtn_in) {
			cal.getTime();
			System.out.println(cal.getTime());
		}
		
		if (obj == ylv.jbtn_out) {
			System.out.println("퇴근시간:");
		}
		
		if (obj == ylv.jbtn_attendance) {
			System.out.println("이걸 어쩐다요??");
		}
//		if (obj == ylv.jbtn_nalja) {
//			for(int i = 0 ; i <42 ; i++) {
//				ylv.jbtn_nalja[i];
//			}
//			System.out.println("새창이 나온다요??");
//		}
		YJattendance yjt= new YJattendance(); 
	
//		System.out.println("나석원 바보");
//		System.out.println("형 화이팅 무야호");
	}

}