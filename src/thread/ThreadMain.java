package thread;


class Score extends Thread{
	
	public void run() {
		for(int i=1;i<=200;i++) {System.out.println(i);}
	}
}

class Players extends Thread{
	public void run() {
		for(int i=1;i<=200;i++) {System.out.println("Player "+ i);}
	}	
}

public class ThreadMain {

	public static void main(String[] args) {
		Score score=new Score();
		Players player=new Players();
		score.start();
		player.start();

	}

}
