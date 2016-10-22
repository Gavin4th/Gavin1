import javax.swing.JFrame;

public class newGame extends JFrame{
	public newGame(){
		//设置窗口大小
		this.setSize(532,535);
		System.out.println(this.getSize());
		this.setTitle("生命游戏");
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
