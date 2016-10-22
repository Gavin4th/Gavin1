import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Map extends JPanel{ 
	
	/*
	 * ���ò���Ϊ��ϸ��
	 */
	public void letAlive(){
		
		tempMap[0][1]   = 'A';
		tempMap[0][24]  = 'A';
		tempMap[1][0]   = 'A';
		tempMap[1][24]  = 'A';
		tempMap[1][25]  = 'A';
		tempMap[14][9]  = 'A';
		tempMap[15][11] = 'A';
		tempMap[16][10] = 'A';
		tempMap[22][1]  = 'A';
		
	}
	
	

	//��ʼ��ͼ 24*26,��ʼ��ȫΪ��ϸ��
	private final char[][] world = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N' } 

    };
	
	//���ص�ͼ��С
	public int[] arrayLength(){
		int a[] = {world.length, world[0].length};
		return a; 
	}
	
	//�����ʼ����һ״̬
	public char[][] nextMap = new char[world.length][world[0].length];
	public char[][] tempMap = new char[world.length][world[0].length];
	
	private final char MAP_N = 'N';
	private final char MAP_A = 'A';
	private final int WIDTH = 20;
	private final int HEIGHT = 20;
	
	private Timer timer;
	
	//����ˢ��Ƶ��
	private final int TIME = 300;
	
	public boolean con = true;
	public boolean flag = true;
	JButton jbutton = new JButton("��ʼ��Ϸ");
	JLabel jlabel = new JLabel("���ѡ���ʼ��ϸ����ѡ����Ϻ󣬵����ʼ��Ϸ");
	JButton jbutton2 = new JButton("��ͣ/����");
	
	//������һ״̬��ͼ��ָ�������״̬
	public char returnStatus(int row, int col){
		return tempMap[row][col];
	}
	
	//���캯��
	public Map(){
		setLayout(null);
		letAlive();
		jbutton.setBounds(290,479, 100, 28);
		jbutton2.setBounds(390,479, 100, 28);
		jlabel.setBounds(0, 479, 290, 30);
		this.add(jbutton);
		this.add(jlabel);
		this.add(jbutton2);
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				if(con){
					world[e.getY()/HEIGHT][e.getX()/WIDTH] = MAP_A;
					Graphics g = getGraphics();
					g.setColor(Color.yellow);
					g.fillRect(e.getX()/WIDTH * WIDTH, e.getY()/HEIGHT * HEIGHT, WIDTH, HEIGHT);
					
				}
			}
		});
		
		jbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e){
				con = false;
				startPaint();
			}
		});
		
		jbutton2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e){
				if(flag){
					flag = false;
					timer.stop();
				}
				else {
					flag = true;
					timer.start();
				}
			}
		});
	}
		
	private void startPaint(){
		for(int row = 0; row < world.length; row++){
			for(int col = 0; col < world[0].length; col++){
				nextMap[row][col] = world[row][col];
				tempMap[row][col] = world[row][col];
			}
		}
		
		//���嶨ʱ��
		timer = new Timer(TIME, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				changeStatus();
				repaint();
				
			}
		});	
		timer.start();
	}
	
	//�ı�״̬
	public void changeStatus(){
		for(int row = 0; row < nextMap.length; row++){
			for(int col = 0;col < nextMap[row].length; col++){
				
				switch(closeCount(row, col)){
				case 0:
				case 1:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
					nextMap[row][col] = MAP_N;
					break;
				case 2:
					nextMap[row][col] = tempMap[row][col];
					break;
				case 3:
					nextMap[row][col] = MAP_A;
					break;
				}
			}
		}
		copyMap();
	}
	
	//����ָ��������Χ�Ļ�ϸ������
	public int getCloseCount(int row, int col){
		return closeCount(row, col);
	}
	
	//�����ٽ��Ļ�ϸ����
	private int closeCount(int row, int col){
		int count = 0;
		int r = 0, c = 0;
		for(r = row - 1; r <= row + 1; r++){
			for(c = col - 1;c <= col + 1;c++){
				if(r < 0 || r >= tempMap.length || c < 0 || c >= tempMap[0].length){
					continue;
				}
				if(tempMap[r][c] == MAP_A){
					count++;
				}
			}
		}
		if(tempMap[row][col] == MAP_A){
			count--;
		}
		return count;
	}
	
	//��һ״̬�ĵ�ͼ������ǰ��ͼ
	private void copyMap(){
		for(int row = 0; row < nextMap.length;row++){
			for(int col = 0;col < nextMap[row].length;col++){
				tempMap[row][col] = nextMap[row][col];
			}
		}
	}
	
	//���Ƶ�ͼ
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(int row = 0; row < nextMap.length; row++){
			for(int col = 0;col < nextMap[row].length;col++){
				
				if(nextMap[row][col] == MAP_A){
					g.setColor(Color.yellow);
					g.fillRect(col * WIDTH, row * HEIGHT, WIDTH, HEIGHT);
				}
				else {
					g.setColor(Color.red);
					g.drawRect(col * WIDTH, row * HEIGHT, WIDTH, HEIGHT);
					g.setColor(Color.black);
					g.fillRect(col * WIDTH, row * HEIGHT, WIDTH, HEIGHT);
				}
			}
		}
		
		for(int row = 0; row < nextMap.length; row++){
			for(int col = 0;col < nextMap[row].length;col++){
				g.setColor(Color.red);
				g.drawRect(col * WIDTH, row * HEIGHT, WIDTH, HEIGHT);
			}
		}
	}
	
}

