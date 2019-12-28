package java191223;

public class Ex07_Ticket {
	/*
	 * 1.Ticket 클래스
	 * A.각 티켓은 티켓 번호와 가격 정보를 가지고 있음.
	 * B.티켓의 가격은 변경 가능함.
	 * 2.BookingTicket 클래스 (Ticket 상속)
	 * A.사전예약 티켓. 티켓 번호와 사전예약 일수 정보를 가지고 있음.
	 * B.언제 예매를 했느냐에 따라 가격이 달라짐.
	 * i.30일 전 : 50% 할인
	 * ii.10일 전 : 20% 할인
	 * iii.5일 전 : 10% 할인
	 * 3.NormalTicket 클래스 (Ticket 상속)
	 * A.일반 티켓. 티켓이 발행될 때 티켓번호와 신용카드 결제 여부 정보를 가지고 있음.
	 * B.신용카드로 결제하는 경우 5% 금액이 가산됨.
	 * 4.TickekMain 클래스
	 * A.사전예약 티켓, 일반 예매 티켓을 각각 객체로 만들어서 각 티켓의 티켓번호, 구매가격을 출력하시오.
	 */
	
	int ticketNum;
	String ticketPrice;
	
	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
}
