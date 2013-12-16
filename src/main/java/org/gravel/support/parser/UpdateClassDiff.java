package org.gravel.support.parser;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.parser.AbstractClassDiff;
import org.gravel.support.parser.AbstractClassDiff.AbstractClassDiff_Factory;
import org.gravel.support.parser.Reference;
import org.gravel.support.parser.MethodNode;
import org.gravel.support.parser.DiffVisitor;
import org.gravel.support.parser.ClassDescriptionNode;
import org.gravel.support.parser.SystemNode;
import org.gravel.support.parser.NewClassDiff;
import org.gravel.support.parser.BranchDiff;
import org.gravel.support.parser.Diff;

public class UpdateClassDiff extends AbstractClassDiff implements Cloneable {

	public static UpdateClassDiff_Factory factory = new UpdateClassDiff_Factory();

	String[] _deletedSelectors;

	MethodNode[] _methodNodes;

	Reference _reference;

	MethodNode[] _updatedMethodNodes;

	public static class UpdateClassDiff_Factory extends AbstractClassDiff_Factory {

		public UpdateClassDiff basicNew() {
			UpdateClassDiff newInstance = new UpdateClassDiff();
			newInstance.initialize();
			return newInstance;
		}

		public UpdateClassDiff reference_methodNodes_(final Reference _anAbsoluteReference, final MethodNode[] _anArray) {
			return ((UpdateClassDiff) this.reference_methodNodes_updatedMethodNodes_deletedSelectors_(_anAbsoluteReference, _anArray, new MethodNode[] {}, new String[] {}));
		}

		public UpdateClassDiff reference_methodNodes_updatedMethodNodes_deletedSelectors_(final Reference _anAbsoluteReference, final MethodNode[] _anArray, final MethodNode[] _updatedMethodNodes, final String[] _deletedSelectors) {
			return ((UpdateClassDiff) this.basicNew().initializeReference_methodNodes_updatedMethodNodes_deletedSelectors_(_anAbsoluteReference, _anArray, _updatedMethodNodes, _deletedSelectors));
		}
	}

	static public UpdateClassDiff _reference_methodNodes_(Object receiver, final Reference _anAbsoluteReference, final MethodNode[] _anArray) {
		return factory.reference_methodNodes_(_anAbsoluteReference, _anArray);
	}

	static public UpdateClassDiff _reference_methodNodes_updatedMethodNodes_deletedSelectors_(Object receiver, final Reference _anAbsoluteReference, final MethodNode[] _anArray, final MethodNode[] _updatedMethodNodes, final String[] _deletedSelectors) {
		return factory.reference_methodNodes_updatedMethodNodes_deletedSelectors_(_anAbsoluteReference, _anArray, _updatedMethodNodes, _deletedSelectors);
	}

	@Override
	public DiffVisitor accept_(final DiffVisitor _visitor) {
		return _visitor.visitUpdateClassDiff_(this);
	}

	public ClassDescriptionNode applyOnClassNode_(final ClassDescriptionNode _startClassNode) {
		ClassDescriptionNode _classNode;
		_classNode = ((ClassDescriptionNode) org.gravel.support.jvm.ArrayExtensions.inject_into_(_methodNodes, _startClassNode, ((org.gravel.support.jvm.Block2<ClassDescriptionNode, ClassDescriptionNode, MethodNode>) (new org.gravel.support.jvm.Block2<ClassDescriptionNode, ClassDescriptionNode, MethodNode>() {

			@Override
			public ClassDescriptionNode value_value_(final ClassDescriptionNode _cn, final MethodNode _m) {
				return (ClassDescriptionNode) _cn.withMethodNode_(_m);
			}
		}))));
		_classNode = ((ClassDescriptionNode) org.gravel.support.jvm.ArrayExtensions.inject_into_(_updatedMethodNodes, _classNode, ((org.gravel.support.jvm.Block2<ClassDescriptionNode, ClassDescriptionNode, MethodNode>) (new org.gravel.support.jvm.Block2<ClassDescriptionNode, ClassDescriptionNode, MethodNode>() {

			@Override
			public ClassDescriptionNode value_value_(final ClassDescriptionNode _cn, final MethodNode _m) {
				return (ClassDescriptionNode) _cn.copyReplaceMethodNode_(_m);
			}
		}))));
		return ((ClassDescriptionNode) org.gravel.support.jvm.ArrayExtensions.inject_into_(_deletedSelectors, _classNode, ((org.gravel.support.jvm.Block2<ClassDescriptionNode, ClassDescriptionNode, String>) (new org.gravel.support.jvm.Block2<ClassDescriptionNode, ClassDescriptionNode, String>() {

			@Override
			public ClassDescriptionNode value_value_(final ClassDescriptionNode _cn, final String _sel) {
				return (ClassDescriptionNode) _cn.copyRemoveSelector_(_sel);
			}
		}))));
	}

	@Override
	public SystemNode applyOnSystemNode_(final SystemNode _aSystemNode) {
		final ClassDescriptionNode _classNode;
		_classNode = this.applyOnClassNode_(_aSystemNode.classNodeAt_(_reference));
		return _aSystemNode.withClassDescriptionNode_(_classNode);
	}

	@Override
	public UpdateClassDiff beStatic() {
		return this.copy().pvtSetStatic_(true);
	}

	@Override
	public UpdateClassDiff beStatic_(final boolean _aBoolean) {
		if (_aBoolean && (!this.isStatic())) {
			return UpdateClassDiff.this.beStatic();
		}
		return this;
	}

	public UpdateClassDiff copy() {
		try {
			UpdateClassDiff _temp1 = (UpdateClassDiff) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public String[] deletedSelectors() {
		return _deletedSelectors;
	}

	public UpdateClassDiff_Factory factory() {
		return factory;
	}

	@Override
	public UpdateClassDiff initialize() {
		super.initialize();
		_isStatic = this.isStaticDefault();
		_cache = new java.util.IdentityHashMap<AbstractClassDiff, Boolean>();
		return this;
	}

	public UpdateClassDiff initializeReference_methodNodes_updatedMethodNodes_deletedSelectors_(final Reference _aReference, final MethodNode[] _anArray, final MethodNode[] _anArray2, final String[] _anArray3) {
		_reference = _aReference;
		_methodNodes = _anArray;
		_updatedMethodNodes = _anArray2;
		_deletedSelectors = _anArray3;
		this.initialize();
		return this;
	}

	@Override
	public boolean isPrereqOrDependentOfNewClassDiff_(final NewClassDiff _aClassDiff) {
		return org.gravel.support.jvm.ObjectExtensions.equals_(_reference, _aClassDiff.reference());
	}

	@Override
	public boolean isPrereqOrDependent_(final AbstractClassDiff _aDiff) {
		return _aDiff.isPrereqOrDependentOfUpdateClassDiff_(this);
	}

	public MethodNode[] methodNodes() {
		return _methodNodes;
	}

	@Override
	public UpdateClassDiff printDescriptionOn_(final StringBuilder _aStream) {
		_aStream.append(_reference.toString());
		return this;
	}

	@Override
	public UpdateClassDiff pvtSetStatic_(final boolean _aBoolean) {
		_isStatic = _aBoolean;
		return this;
	}

	public Reference reference() {
		return _reference;
	}

	public MethodNode[] updatedMethodNodes() {
		return _updatedMethodNodes;
	}

	@Override
	public Diff withBranchDiff_(final BranchDiff _aBranchDiff) {
		return _aBranchDiff.withUpdateClassDiff_(this);
	}

	@Override
	public Diff withDiff_(final Diff _aDiff) {
		return _aDiff.withUpdateClassDiff_(this);
	}

	@Override
	public AbstractClassDiff withNewClassDiff_(final NewClassDiff _aNewClassDiff) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(_aNewClassDiff.reference(), _reference)) {
			return _aNewClassDiff.withMethodNodes_(_methodNodes);
		}
		return ((AbstractClassDiff) ClassDiffs.factory.with_with_(this, _aNewClassDiff));
	}

	@Override
	public Diff withUpdateClassDiff_(final UpdateClassDiff _anUpdateClassDiff) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(_reference, _anUpdateClassDiff.reference())) {
			return org.gravel.support.jvm.ObjectExtensions.halt(UpdateClassDiff.this);
		}
		org.gravel.support.jvm.ObjectExtensions.halt(this);
		return this;
	}
}