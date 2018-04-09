/*
 * generated by Xtext 2.13.0
 */
package org.xtext.distj14.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.distj14.math.MathExp

@RunWith(XtextRunner)
@InjectWith(MathInjectorProvider)
class MathParsingTest {
	@Inject
	ParseHelper<MathExp> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: ?errors.join(", ")?''', errors.isEmpty)
	}
}
