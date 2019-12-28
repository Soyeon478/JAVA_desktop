package java191223;

public class Ex07_BookingTicket extends Ex07_Ticket {
	
	String reservationTicket;
	String reservationDay;
	
	@Override
	public String toString() {
		return "Ex07_BookingTicket [reservationTicket=" + reservationTicket + ", reservationDay=" + reservationDay
				+ ", ticketNum=" + ticketNum + "]";
	}
	
	public void day30() {
		System.out.println("30일전 예매시 50% 할인");
	}
	
	public void day10() {
		System.out.println("10일전 예매시 20% 할인");
	}
	
	public void day5() {
		System.out.println("5일전 예매시 10% 할인");
	}

	public void ticketNum(int num) {
		System.out.println("티켓 번호 : " + num);
	}

	public void ticketPrice(String price) {
		System.out.println("티켓 가격 : " + price + "원");
	}

	public void reservationDay(String reservation) {
		System.out.println("사전예약일 : " + reservation);
	}
	
}
