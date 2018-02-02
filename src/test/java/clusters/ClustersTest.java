package clusters;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
 
import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.hamcrest.*;



public class ClustersTest {
	@Test
	public void testForZero() {
		//arrange
		int[] numbers = {1,2,3};
		Clusters underTest = new Clusters(numbers); 
		//act
		underTest.findCluster();
		int check = 0;
				
		//assert
		assertEquals(underTest.findCluster(),(check)); 
		assertThat(underTest.findCluster(),is(check));
	}

	@Test
	public void testForZeroWithParameters() {
		//arrange
		int[] numbers = {1,2,3};
		Clusters underTest = new Clusters(numbers);  
		int check = 0; 
		//act
		underTest.findCluster();
		
		
		//assert
		assertEquals(check, underTest.findCluster());
	}
	
	@Test
	public void testForOneCluster() {
		//arrange
		int[] numbers = {5,2,2,2,4};
		Clusters underTest = new Clusters(numbers);
		
		//act
		underTest.findCluster();
		int check = 1; 
		
		//assert
		assertThat(underTest.findCluster(), is(check));
		
	}
	
	@Test
	public void testForTwoClusters() {
		//arrange
		int[] numbers = {1,4,4,4,9,6,6,7};
		Clusters underTest = new Clusters(numbers);
		
		//act
		underTest.findCluster();
		int check = 2; 
		
		//assert
		assertThat(underTest.findCluster(), is(check));
		
	}
}
