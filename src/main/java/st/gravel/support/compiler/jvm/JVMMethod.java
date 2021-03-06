package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMNode;
import st.gravel.support.compiler.jvm.JVMNode.JVMNode_Factory;
import st.gravel.support.compiler.jvm.JVMLocalDeclaration;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMMethodType;
import st.gravel.support.compiler.jvm.JVMNodeVisitor;

public class JVMMethod extends JVMNode implements Cloneable {

	public static JVMMethod_Factory factory = new JVMMethod_Factory();

	JVMInstruction[] _instructions;

	boolean _isStatic;

	JVMLocalDeclaration[] _locals;

	String _name;

	JVMMethodType _signature;

	public static class JVMMethod_Factory extends JVMNode_Factory {

		public JVMMethod basicNew() {
			JVMMethod newInstance = new JVMMethod();
			newInstance.initialize();
			return newInstance;
		}

		public JVMMethod name_locals_instructions_isStatic_signature_(final String _aString, final JVMLocalDeclaration[] _anArray, final JVMInstruction[] _anArray2, final boolean _isStatic, final JVMMethodType _aJVMMethodType) {
			return this.basicNew().initializeName_locals_instructions_isStatic_signature_(_aString, _anArray, _anArray2, _isStatic, _aJVMMethodType);
		}
	}

	static public JVMMethod _name_locals_instructions_isStatic_signature_(Object receiver, final String _aString, final JVMLocalDeclaration[] _anArray, final JVMInstruction[] _anArray2, final boolean _isStatic, final JVMMethodType _aJVMMethodType) {
		return factory.name_locals_instructions_isStatic_signature_(_aString, _anArray, _anArray2, _isStatic, _aJVMMethodType);
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMMethod_(this);
	}

	public JVMMethod copy() {
		try {
			JVMMethod _temp1 = (JVMMethod) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public JVMMethod_Factory factory() {
		return factory;
	}

	public JVMMethod initializeName_locals_instructions_isStatic_signature_(final String _anObject, final JVMLocalDeclaration[] _anArray, final JVMInstruction[] _anArray2, final boolean _aBoolean, final JVMMethodType _aJVMMethodType) {
		_name = _anObject;
		_locals = _anArray;
		_instructions = _anArray2;
		_isStatic = _aBoolean;
		_signature = _aJVMMethodType;
		this.initialize();
		return this;
	}

	public JVMInstruction[] instructions() {
		return _instructions;
	}

	public boolean isStatic() {
		return _isStatic;
	}

	public JVMLocalDeclaration[] locals() {
		return _locals;
	}

	public String name() {
		return _name;
	}

	@Override
	public JVMMethod printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	public JVMMethodType signature() {
		return _signature;
	}

	@Override
	public JVMMethod sourceOn_(final StringBuilder _aStream) {
		if (_isStatic) {
			_aStream.append("static ");
		}
		_aStream.append(_name);
		_aStream.append(_signature.toString());
		return this;
	}
}
