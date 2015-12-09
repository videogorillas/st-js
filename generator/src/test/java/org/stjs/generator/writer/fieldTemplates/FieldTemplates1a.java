package org.stjs.generator.writer.fieldTemplates;

import org.stjs.javascript.annotation.Template;

public class FieldTemplates1a {
	public static class Inner {
		@Template("path")
		public String field;
	}

	@Template("path(method)")
	public Inner inner;

	public String method(String param) {
		return "";
	}

	public void other() {
		String s = inner.field;

	}
}
