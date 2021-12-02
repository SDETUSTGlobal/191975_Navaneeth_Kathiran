package mocki;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
public class TestList {
@Test
public void testList_Argument_Matchers() {
	List mocklist = mock(List.class);
	when(mocklist.get(Mockito.anyInt())).thenReturn("Mockito");
assertEquals("Mockito", mocklist.get(0));
assertEquals("Mockito", mocklist.get(1));
assertEquals("Mockito", mocklist.get(2));
}
}