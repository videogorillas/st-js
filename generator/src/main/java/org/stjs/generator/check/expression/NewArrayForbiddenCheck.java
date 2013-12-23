package org.stjs.generator.check.expression;

import org.stjs.generator.GenerationContext;
import org.stjs.generator.check.CheckContributor;
import org.stjs.generator.check.CheckVisitor;

import com.sun.source.tree.NewArrayTree;

/**
 * this checks that no java array is used. You should use {@link org.stjs.javascript.Array} instead.
 * 
 * @author acraciun
 */
public class NewArrayForbiddenCheck implements CheckContributor<NewArrayTree> {

	@Override
	public Void visit(CheckVisitor visitor, NewArrayTree tree, GenerationContext<Void> context) {
		context.addError(tree, "You cannot use Java arrays because they are incompatible with Javascript arrays. "
				+ "Use org.stjs.javascript.Array<T> instead. "
				+ "You can use also the method org.stjs.javascript.Global.$castArray to convert an "
				+ "existent Java array to the corresponding Array type." + "The only exception is void main(String[] args).");

		return null;
	}

}
