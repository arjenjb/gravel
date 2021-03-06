package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import org.junit.Test;
import static org.junit.Assert.*;
import st.gravel.support.compiler.ast.VariableAccessToFieldAccessConverter;
import st.gravel.support.compiler.ast.VariableNode;
import st.gravel.support.compiler.ast.Reference;
import st.gravel.support.compiler.ast.AbsoluteReference;
import st.gravel.support.compiler.ast.NonLocalTempWritesToHolderConverter;
import st.gravel.support.compiler.ast.IntermediateNodeRewriter;
import st.gravel.support.compiler.ast.Parser;

public class IntermediateNodeRewriterTest {

	@Test
	public void initialize() {
	}

	@Test
	public void testInstVarAccessToFieldAccessConverter() {
		VariableAccessToFieldAccessConverter.factory.instVarNames_owner_ownerReference_namespace_(new String[] { "x" }, VariableNode.factory.name_("self"), Reference.factory.value_("Foo"), ((AbsoluteReference) Reference.factory.value_("Foo"))).visit_(NonLocalTempWritesToHolderConverter.factory.visit_(IntermediateNodeRewriter.factory.visit_(Parser.factory.parseMethod_("foo ^x"))));
		VariableAccessToFieldAccessConverter.factory.instVarNames_owner_ownerReference_namespace_(new String[] { "x" }, VariableNode.factory.name_("self"), Reference.factory.value_("Foo"), ((AbsoluteReference) Reference.factory.value_("Foo"))).visit_(NonLocalTempWritesToHolderConverter.factory.visit_(IntermediateNodeRewriter.factory.visit_(Parser.factory.parseMethod_("foo: bar x := bar"))));
	}

	@Test
	public void testParseIdentityEquals() {
		NonLocalTempWritesToHolderConverter.factory.visit_(IntermediateNodeRewriter.factory.visit_(Parser.factory.parseMethod_("foo: a bar: b ^a == b")));
	}
}
