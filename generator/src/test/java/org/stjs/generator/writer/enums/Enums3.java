package org.stjs.generator.writer.enums;

public class Enums3 {
	public enum Value {
		a, b, c;
	}

	public void main() {
		Value x = null;
		switch (x) {
		case a:
			break;
		case b:
			break;
		}
	}
}