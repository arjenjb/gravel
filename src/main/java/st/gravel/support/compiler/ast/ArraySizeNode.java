package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.ArrayAccessNode;
import st.gravel.support.compiler.ast.ArrayAccessNode.ArrayAccessNode_Factory;
import st.gravel.support.compiler.ast.Expression;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class ArraySizeNode extends ArrayAccessNode implements Cloneable {

	public static ArraySizeNode_Factory factory = new ArraySizeNode_Factory();

	public static class ArraySizeNode_Factory extends ArrayAccessNode_Factory {

		public ArraySizeNode basicNew() {
			ArraySizeNode newInstance = new ArraySizeNode();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public ArraySizeNode receiver_(final Expression _anExpression) {
			return ((ArraySizeNode) this.basicNew().initializeReceiver_(_anExpression));
		}
	}

	static public ArraySizeNode _receiver_(Object receiver, final Expression _anExpression) {
		return factory.receiver_(_anExpression);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitArraySizeNode_(this);
	}

	@Override
	public ArraySizeNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public ArraySizeNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return ArraySizeNode.this;
			}
		});
		return this;
	}

	public ArraySizeNode copy() {
		try {
			ArraySizeNode _temp1 = (ArraySizeNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public ArraySizeNode_Factory factory() {
		return factory;
	}

	@Override
	public ArraySizeNode initializeReceiver_(final Expression _anExpression) {
		_receiver = _anExpression;
		this.initialize();
		return this;
	}

	@Override
	public ArraySizeNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("{");
		_receiver.sourceOn_(_aStream);
		_aStream.append(" size}");
		return this;
	}

	@Override
	public ArraySizeNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public ArraySizeNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(_receiver);
		return this;
	}

	@Override
	public ArraySizeNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public ArraySizeNode printOn_(final StringBuilder _aStream) {
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
	public ArraySizeNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public ArraySizeNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public Expression unoptimized() {
		return _receiver.send_("size");
	}

	@Override
	public ArraySizeNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public ArraySizeNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public ArraySizeNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return ArraySizeNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
