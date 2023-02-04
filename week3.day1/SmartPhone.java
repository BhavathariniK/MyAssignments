package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsapp() {
		// TODO Auto-generated method stub
     System.out.println("Connecting Whatsapp");
     SmartPhone s = new SmartPhone();
     s.sendMsg();
     s.saveContact();
     s.makeCall();
     s.connectWhatsapp();
	}

}
