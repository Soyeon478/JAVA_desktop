package java191223;

public class Ex07_NormalTicket extends Ex07_Ticket {
	
	String ticket;
	String card;
	
	@Override
	public String toString() {
		return "Ex07_NormalTicket [ticket=" + ticket + ", card=" + card + ", ticketNum=" + ticketNum + "]";
	}
	
	public void ticketNum(int num) {
		System.out.println("티켓 번호 : " + num);
	}

	public void ticketPrice(String price) {
		System.out.println("티켓 가격 : " + price + "원");
	}

	public void card(String card) {
		System.out.println("신용카드 결제 여부 : " + card);
		System.out.println("신용카드로 결제시 5% 가산");
	}
	
}
