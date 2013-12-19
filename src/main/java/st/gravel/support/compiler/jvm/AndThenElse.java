package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.Fork;
import st.gravel.support.compiler.jvm.Fork.Fork_Factory;
import st.gravel.support.compiler.jvm.Frame;
import st.gravel.support.compiler.jvm.PushTrue;
import st.gravel.support.compiler.jvm.PushFalse;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMType;

public class AndThenElse extends Fork implements Cloneable {

	public static AndThenElse_Factory factory = new AndThenElse_Factory();

	Frame _left;

	Frame _right;

	public static class AndThenElse_Factory extends Fork_Factory {

		public AndThenElse basicNew() {
			AndThenElse newInstance = new AndThenElse();
			newInstance.initialize();
			return newInstance;
		}

		public AndThenElse left_right_(final Frame _aFrame, final Frame _aFrame2) {
			return this.basicNew().initializeLeft_right_(_aFrame, _aFrame2);
		}

		@Override
		public AndThenElse r_boolean() {
			return ((AndThenElse) this.trueFrame_falseFrame_(PushTrue.factory.basicNew().asFrame(), PushFalse.factory.basicNew().asFrame()));
		}

		@Override
		public AndThenElse trueFrame_falseFrame_(final Frame _aFrame, final Frame _aFrame2) {
			return ((AndThenElse) this.basicNew().initializeTrueFrame_falseFrame_(_aFrame, _aFrame2));
		}
	}

	static public AndThenElse _left_right_(Object receiver, final Frame _aFrame, final Frame _aFrame2) {
		return factory.left_right_(_aFrame, _aFrame2);
	}

	static public AndThenElse _r_boolean(Object receiver) {
		return factory.r_boolean();
	}

	static public AndThenElse _trueFrame_falseFrame_(Object receiver, final Frame _aFrame, final Frame _aFrame2) {
		return factory.trueFrame_falseFrame_(_aFrame, _aFrame2);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitAndThenElse_(this);
	}

	public AndThenElse copy() {
		try {
			AndThenElse _temp1 = (AndThenElse) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		return this.pushTypeOnStack_(_aJVMStack);
	}

	public AndThenElse_Factory factory() {
		return factory;
	}

	@Override
	public AndThenElse initialize() {
		if (_trueFrame == null) {
			_trueFrame = PushTrue.factory.basicNew().asFrame();
		}
		if (_falseFrame == null) {
			_falseFrame = PushFalse.factory.basicNew().asFrame();
		}
		return this;
	}

	public AndThenElse initializeLeft_right_(final Frame _aFrame, final Frame _aFrame2) {
		_left = _aFrame;
		_right = _aFrame2;
		this.initialize();
		return this;
	}

	@Override
	public AndThenElse initializeTrueFrame_falseFrame_(final Frame _aFrame, final Frame _aFrame2) {
		_trueFrame = _aFrame;
		_falseFrame = _aFrame2;
		this.initialize();
		return this;
	}

	public Frame left() {
		return _left;
	}

	@Override
	public AndThenElse printOn_(final StringBuilder _aStream) {
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
	public AndThenElse pushTypeOnStack_(final JVMStack _aJVMStack) {
		if (!this.type().isBottomType()) {
			_aJVMStack.push_(AndThenElse.this.type());
		}
		return this;
	}

	public Frame right() {
		return _right;
	}

	@Override
	public AndThenElse sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public AndThenElse withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return AndThenElse.this;
		}
		throw new RuntimeException("niy");
	}
}