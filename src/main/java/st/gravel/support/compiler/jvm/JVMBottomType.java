package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMType;
import st.gravel.support.compiler.jvm.JVMType.JVMType_Factory;
import st.gravel.support.compiler.jvm.JVMNodeVisitor;
import st.gravel.support.compiler.jvm.CastTo;

public class JVMBottomType extends JVMType implements Cloneable {

	public static JVMBottomType_Factory factory = new JVMBottomType_Factory();

	public static class JVMBottomType_Factory extends JVMType_Factory {

		public JVMBottomType basicNew() {
			JVMBottomType newInstance = new JVMBottomType();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMBottomType_(this);
	}

	@Override
	public JVMType commonSuperTypeWith_(final JVMType _aJVMType) {
		return _aJVMType;
	}

	public JVMBottomType copy() {
		try {
			JVMBottomType _temp1 = (JVMBottomType) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMBottomType descriptorOn_(final StringBuilder _aStream) {
		throw new RuntimeException("Should not occur");
	}

	public JVMBottomType_Factory factory() {
		return factory;
	}

	@Override
	public boolean isBottomType() {
		return true;
	}

	@Override
	public CastTo newCastInstructionTo_(final JVMType _aJVMType) {
		return this.castNotSupported();
	}

	@Override
	public JVMBottomType printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	@Override
	public JVMBottomType sourceOn_(final StringBuilder _aStream) {
		_aStream.append('_');
		return this;
	}
}