package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int in1, int in2, int exp) throws Exception {

	  Computation com = new Computation();
      int result = 0; 
      result = com.getDiscount(in1, in2);
      Assert.assertEquals(result, exp);

   }
}
