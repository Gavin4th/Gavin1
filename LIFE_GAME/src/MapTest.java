import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MapTest {
	private static Map map = new Map();
	
	private final char[][] test = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A',  
                        'A' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                        'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A',  
                        'A' },  
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
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'N', 'N',  
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
	
	@Before
	public void setUp() throws Exception {
		for(int row = 0; row < map.tempMap.length;row++){
			for(int col = 0;col < map.tempMap[0].length;col++){
				map.tempMap[row][col] = 'N';
			}
		}
		map.tempMap[0][1]   = 'A';
		map.tempMap[0][24]  = 'A';
		map.tempMap[1][0]   = 'A';
		map.tempMap[1][24]  = 'A';
		map.tempMap[1][25]  = 'A';
		map.tempMap[14][9]  = 'A';
		map.tempMap[15][11] = 'A';
		map.tempMap[16][10] = 'A';
		map.tempMap[22][1]  = 'A';
	}

	@Test
	public void testMap() {
		/*
		 * 测试初始化Map类对象时,按钮的位置是否正确
		 */
		
		//开始按钮
		assertEquals(290, map.jbutton.getBounds().x);
		assertEquals(479, map.jbutton.getBounds().y);
		assertEquals(100, map.jbutton.getBounds().width);
		assertEquals(28, map.jbutton.getBounds().height);
		
		//暂停继续按钮
		assertEquals(390, map.jbutton2.getBounds().x);
		assertEquals(479, map.jbutton2.getBounds().y);
		assertEquals(100, map.jbutton2.getBounds().width);
		assertEquals(28, map.jbutton2.getBounds().height);
		
		//标签说明
		assertEquals(0, map.jlabel.getBounds().x);
		assertEquals(479, map.jlabel.getBounds().y);
		assertEquals(290, map.jlabel.getBounds().width);
		assertEquals(30, map.jlabel.getBounds().height);
	}
	
	@Test
	public void testCloseCount() {
		/*
		 * 假定所选方块的row和column值
		 */
		
		// (0, 0)
		int row = 0, col = 0;
		assertEquals(2, map.getCloseCount(row, col));
		
		// (0, 25)
		row = 0;
		col = 25;
		assertEquals(3, map.getCloseCount(row, col));
		
		//(15, 10)
		row = 15;
		col = 10;
		assertEquals(3, map.getCloseCount(row, col));
		
		//(23, 0)
		row = 23;
		col = 0;
		assertEquals(1, map.getCloseCount(row, col));
		
		//(23, 25)
		row = 23;
		col = 25;
		assertEquals(0, map.getCloseCount(row, col));
	}
	
	@Test
	public void testChangeStatus() {
		map.changeStatus();
		for(int row = 0; row < map.arrayLength()[0];row++){
			for(int col = 0; col < map.arrayLength()[1];col++){
				assertEquals(test[row][col], map.returnStatus(row, col));				
			}
		}
	}

}
