package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMInstruction.JVMInstruction_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMMethodType;
import st.gravel.support.compiler.jvm.JVMType;
import st.gravel.support.compiler.jvm.JVMDynamicObjectType;

public class DynamicFieldRead extends JVMInstruction implements Cloneable {

	public static DynamicFieldRead_Factory factory = new DynamicFieldRead_Factory();

	String _name;

	public static class DynamicFieldRead_Factory extends JVMInstruction_Factory {

		public DynamicFieldRead basicNew() {
			DynamicFieldRead newInstance = new DynamicFieldRead();
			newInstance.initialize();
			return newInstance;
		}

		public DynamicFieldRead name_(final String _aString) {
			return this.basicNew().initializeName_(_aString);
		}
	}

	static public DynamicFieldRead _name_(Object receiver, final String _aString) {
		return factory.name_(_aString);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitDynamicFieldRead_(this);
	}

	public DynamicFieldRead copy() {
		try {
			DynamicFieldRead _temp1 = (DynamicFieldRead) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		_aJVMStack.pop();
		_aJVMStack.push_(this.type());
		return this;
	}

	public DynamicFieldRead_Factory factory() {
		return factory;
	}

	public DynamicFieldRead initializeName_(final String _aString) {
		_name = _aString;
		this.initialize();
		return this;
	}

	public JVMMethodType methodType() {
		return JVMMethodType.factory.returnType_dynamic_(this.type(), 1);
	}

	public String name() {
		return _name;
	}

	@Override
	public DynamicFieldRead printOn_(final StringBuilder _aStream) {
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
	public DynamicFieldRead sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return JVMDynamicObjectType.factory.basicNew();
	}

	@Override
	public DynamicFieldRead withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return DynamicFieldRead.this;
		}
		throw new RuntimeException("niy");
	}
}
