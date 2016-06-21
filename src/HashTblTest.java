import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HashTblTest {
	
	HashTbl h ;

	@Before
	public void before(){
		h = new HashTbl();
	}
	
	@Test
	public void findMaxtest() {
	
		assertEquals(4, h.findMax(new int[] {1,2,3,4}));
		assertEquals(0, h.findMax(new int[] {-9,-2,0}));
		//assertEquals(null, h.findMax(new int[]{}));
		assertEquals(4, h.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1, h.findMax(new int[]{-12,-1,-3,-4,-2})); 
		
		
	}

}
