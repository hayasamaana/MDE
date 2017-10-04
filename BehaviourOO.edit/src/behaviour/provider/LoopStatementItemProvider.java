/**
 */
package behaviour.provider;


import behaviour.BehaviourFactory;
import behaviour.BehaviourPackage;
import behaviour.LoopStatement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link behaviour.LoopStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopStatementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_EXPRESSION);
			childrenFeatures.add(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LoopStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LoopStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LoopStatement_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LoopStatement.class)) {
			case BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION:
			case BehaviourPackage.LOOP_STATEMENT__LOOP_BODY_STATEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_EXPRESSION,
				 BehaviourFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_EXPRESSION,
				 BehaviourFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_EXPRESSION,
				 BehaviourFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_EXPRESSION,
				 BehaviourFactory.eINSTANCE.createReadLine()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_EXPRESSION,
				 BehaviourFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_EXPRESSION,
				 BehaviourFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createCondionalStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createAssignmentStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createCallFunctionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createTryCatchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createExceptionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createWriteLineStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.LOOP_STATEMENT__LOOP_BODY_STATEMENTS,
				 BehaviourFactory.eINSTANCE.createReadLineStatement()));
	}

}
