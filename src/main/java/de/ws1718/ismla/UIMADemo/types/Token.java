

/* First created by JCasGen Mon Oct 30 14:49:57 CET 2017 */
package de.ws1718.ismla.UIMADemo.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** word
 * Updated by JCasGen Sun Nov 05 11:55:28 CET 2017
 * XML source: C:/Users/mihai/Desktop/ISMLA/UIMADemo/src/main/resources/myTypeSystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: lemma

  /** getter for lemma - gets lemma of String
   * @generated
   * @return value of the feature 
   */
  public String getLemma() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "de.ws1718.ismla.UIMADemo.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_lemma);}
    
  /** setter for lemma - sets lemma of String 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLemma(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "de.ws1718.ismla.UIMADemo.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_lemma, v);}    
   
    
  //*--------------*
  //* Feature: POS

  /** getter for POS - gets POS
   * @generated
   * @return value of the feature 
   */
  public String getPOS() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_POS == null)
      jcasType.jcas.throwFeatMissing("POS", "de.ws1718.ismla.UIMADemo.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_POS);}
    
  /** setter for POS - sets POS 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPOS(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_POS == null)
      jcasType.jcas.throwFeatMissing("POS", "de.ws1718.ismla.UIMADemo.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_POS, v);}    
  }

    