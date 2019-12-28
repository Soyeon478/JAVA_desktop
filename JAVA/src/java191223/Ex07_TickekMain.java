package java191223;

public class Ex07_TickekMain {

	public static void main(String[] args) {
		// 4.TickekMain 클래스
		// A.사전예약 티켓, 일반 예매 티켓을 각각 객체로 만들어서 각 티켓의 티켓번호, 구매가격을 출력하시오.
		
		Ex07_BookingTicket booking = new Ex07_BookingTicket();
		
		booking.ticketNum(1);
		booking.ticketPrice("10,000원");
		booking.reservationDay("2019년 12월 21일");
		booking.day30();
		booking.day10();
		booking.day5();
		
		Ex07_NormalTicket normal = new Ex07_NormalTicket();
		
		normal.ticketNum(2);
		normal.ticketPrice("10,500원");
		normal.card("yes");
		
	}

}
