package org.stjs.generator.exec.params;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stjs.generator.utils.AbstractStjsTest;

public class VarArgsTest extends AbstractStjsTest {
	@Test
	public void testSimple() {
		Double result = executeAndReturnNumber(VarArgs1.class);
		assertEquals(10.0, result, 0);
	}
}
