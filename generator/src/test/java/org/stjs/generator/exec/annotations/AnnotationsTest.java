package org.stjs.generator.exec.annotations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stjs.generator.utils.GeneratorTestHelper;

public class AnnotationsTest {
	@Test
	public void testAnnotationClass() {
		assertEquals(10.0, GeneratorTestHelper.executeAndReturnNumber(Annotation1.class), 0);
	}

	@Test
	public void testAnnotationParam() {
		assertEquals(5.0, GeneratorTestHelper.executeAndReturnNumber(Annotation5.class), 0);
	}
}
