/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Choice;
import org.xtext.example.mydsl.myDsl.GoToChapter;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Scenario;
import org.xtext.example.mydsl.myDsl.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioImpl#getGoto <em>Goto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected Text text;

  /**
   * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoices()
   * @generated
   * @ordered
   */
  protected EList<Choice> choices;

  /**
   * The cached value of the '{@link #getGoto() <em>Goto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoto()
   * @generated
   * @ordered
   */
  protected GoToChapter goto_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SCENARIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Text getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(Text newText, NotificationChain msgs)
  {
    Text oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SCENARIO__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setText(Text newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SCENARIO__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SCENARIO__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SCENARIO__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Choice> getChoices()
  {
    if (choices == null)
    {
      choices = new EObjectContainmentEList<Choice>(Choice.class, this, MyDslPackage.SCENARIO__CHOICES);
    }
    return choices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GoToChapter getGoto()
  {
    return goto_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoto(GoToChapter newGoto, NotificationChain msgs)
  {
    GoToChapter oldGoto = goto_;
    goto_ = newGoto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SCENARIO__GOTO, oldGoto, newGoto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGoto(GoToChapter newGoto)
  {
    if (newGoto != goto_)
    {
      NotificationChain msgs = null;
      if (goto_ != null)
        msgs = ((InternalEObject)goto_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SCENARIO__GOTO, null, msgs);
      if (newGoto != null)
        msgs = ((InternalEObject)newGoto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SCENARIO__GOTO, null, msgs);
      msgs = basicSetGoto(newGoto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SCENARIO__GOTO, newGoto, newGoto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.SCENARIO__TEXT:
        return basicSetText(null, msgs);
      case MyDslPackage.SCENARIO__CHOICES:
        return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
      case MyDslPackage.SCENARIO__GOTO:
        return basicSetGoto(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.SCENARIO__NAME:
        return getName();
      case MyDslPackage.SCENARIO__TEXT:
        return getText();
      case MyDslPackage.SCENARIO__CHOICES:
        return getChoices();
      case MyDslPackage.SCENARIO__GOTO:
        return getGoto();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.SCENARIO__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.SCENARIO__TEXT:
        setText((Text)newValue);
        return;
      case MyDslPackage.SCENARIO__CHOICES:
        getChoices().clear();
        getChoices().addAll((Collection<? extends Choice>)newValue);
        return;
      case MyDslPackage.SCENARIO__GOTO:
        setGoto((GoToChapter)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.SCENARIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.SCENARIO__TEXT:
        setText((Text)null);
        return;
      case MyDslPackage.SCENARIO__CHOICES:
        getChoices().clear();
        return;
      case MyDslPackage.SCENARIO__GOTO:
        setGoto((GoToChapter)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.SCENARIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.SCENARIO__TEXT:
        return text != null;
      case MyDslPackage.SCENARIO__CHOICES:
        return choices != null && !choices.isEmpty();
      case MyDslPackage.SCENARIO__GOTO:
        return goto_ != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ScenarioImpl
