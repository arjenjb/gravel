package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.TraitUsageNode;
import st.gravel.support.compiler.ast.TraitUsageNode.TraitUsageNode_Factory;
import st.gravel.support.compiler.ast.Reference;
import st.gravel.support.compiler.ast.TraitMethodOperation;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.SystemNode;
import st.gravel.support.compiler.ast.MethodNode;
import st.gravel.support.compiler.ast.ClassDescriptionNode;
import st.gravel.support.compiler.ast.SequenceNode;
import st.gravel.support.compiler.ast.SelfNode;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.CompositeTraitUsageNode;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class SimpleTraitUsageNode extends TraitUsageNode implements Cloneable {

	public static SimpleTraitUsageNode_Factory factory = new SimpleTraitUsageNode_Factory();

	TraitMethodOperation[] _methodOperations;

	Reference _reference;

	public static class SimpleTraitUsageNode_Factory extends TraitUsageNode_Factory {

		public SimpleTraitUsageNode basicNew() {
			SimpleTraitUsageNode newInstance = new SimpleTraitUsageNode();
			newInstance.initialize();
			return newInstance;
		}

		public SimpleTraitUsageNode reference_(final Reference _anAbsoluteReference) {
			return this.reference_methodOperations_(_anAbsoluteReference, new TraitMethodOperation[] {});
		}

		public SimpleTraitUsageNode reference_methodOperations_(final Reference _anAbsoluteReference, final TraitMethodOperation[] _anArray) {
			return this.basicNew().initializeReference_methodOperations_(_anAbsoluteReference, _anArray);
		}
	}

	static public SimpleTraitUsageNode _reference_(Object receiver, final Reference _anAbsoluteReference) {
		return factory.reference_(_anAbsoluteReference);
	}

	static public SimpleTraitUsageNode _reference_methodOperations_(Object receiver, final Reference _anAbsoluteReference, final TraitMethodOperation[] _anArray) {
		return factory.reference_methodOperations_(_anAbsoluteReference, _anArray);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitSimpleTraitUsageNode_(this);
	}

	@Override
	public SimpleTraitUsageNode allMethodsIn_do_(final SystemNode _aSystemNode, final st.gravel.support.jvm.Block1<Object, MethodNode> _aBlock) {
		final ClassDescriptionNode _trait;
		_trait = _aSystemNode.classNodeAt_(_reference);
		_trait.allMethodsIn_do_(_aSystemNode, _aBlock);
		return this;
	}

	@Override
	public SimpleTraitUsageNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public SimpleTraitUsageNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return SimpleTraitUsageNode.this;
			}
		});
		return this;
	}

	@Override
	public SimpleTraitUsageNode[] components() {
		return st.gravel.support.jvm.ArrayFactory.with_(this);
	}

	public SimpleTraitUsageNode copy() {
		try {
			SimpleTraitUsageNode _temp1 = (SimpleTraitUsageNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public SimpleTraitUsageNode_Factory factory() {
		return factory;
	}

	@Override
	public ClassDescriptionNode flattenClassDescriptionNode_in_(final ClassDescriptionNode _aClassDescriptionNode, final SystemNode _aSystemNode) {
		final ClassDescriptionNode[] _n;
		_n = new ClassDescriptionNode[1];
		_n[0] = _aClassDescriptionNode;
		this.allMethodsIn_do_(_aSystemNode, new st.gravel.support.jvm.Block1<Object, MethodNode>() {

			@Override
			public Object value_(final MethodNode _method) {
				final boolean _canUnderstand;
				_canUnderstand = _n[0].canUnderstand_in_(_method.selector(), _aSystemNode);
				if (_method.isTraitRequirement()) {
					if (!_canUnderstand) {
						return _n[0] = _n[0].withMethodNode_ofTrait_(_method.withBody_(SequenceNode.factory.statement_(SelfNode.factory.basicNew().send_("traitRequirementNotDefined"))), _reference);
					}
				} else {
					if (!_canUnderstand) {
						return _n[0] = _n[0].withMethodNode_ofTrait_(_method, _reference);
					}
				}
				return SimpleTraitUsageNode.this;
			}
		});
		return _n[0];
	}

	public SimpleTraitUsageNode initializeReference_methodOperations_(final Reference _anAbsoluteReference, final TraitMethodOperation[] _anArray) {
		_reference = _anAbsoluteReference;
		_methodOperations = _anArray;
		this.initialize();
		return this;
	}

	@Override
	public SimpleTraitUsageNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	public TraitMethodOperation[] methodOperations() {
		return _methodOperations;
	}

	@Override
	public SimpleTraitUsageNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		for (final TraitMethodOperation _temp1 : _methodOperations) {
			_aBlock.value_(_temp1);
		}
		return this;
	}

	@Override
	public Reference[] prerequisiteReferences() {
		return st.gravel.support.jvm.ArrayFactory.with_(_reference);
	}

	@Override
	public SimpleTraitUsageNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public SimpleTraitUsageNode printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(st.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public SimpleTraitUsageNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	public Reference reference() {
		return _reference;
	}

	@Override
	public SimpleTraitUsageNode sourceOn_(final StringBuilder _aStream) {
		_aStream.append(_reference.toString());
		return this;
	}

	@Override
	public SimpleTraitUsageNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public SimpleTraitUsageNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public SimpleTraitUsageNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return SimpleTraitUsageNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}

	@Override
	public TraitUsageNode withTrait_(final TraitUsageNode _aTraitUsageNode) {
		final SimpleTraitUsageNode[] _components;
		_components = st.gravel.support.jvm.ArrayExtensions.copyWith_(_aTraitUsageNode.components(), this);
		return CompositeTraitUsageNode.factory.components_(_components);
	}
}