import javax.swing.JFrame;

public class newGame extends JFrame{
	public newGame(){
		//���ô��ڴ�С
		this.setSize(532,535);
		System.out.println(this.getSize());
		this.setTitle("������Ϸ");
		this.add(new Map());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String []args){
		newGame game = new newGame();
		game.setVisible(true);
	}
}
