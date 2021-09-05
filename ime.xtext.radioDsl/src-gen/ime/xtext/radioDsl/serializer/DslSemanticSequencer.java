/*
 * generated by Xtext 2.24.0
 */
package ime.xtext.radioDsl.serializer;

import Action.ActionPackage;
import Action.ActionRadio;
import Action.Bool;
import Action.BoolAttributes;
import Action.Comparator;
import Action.CompoundExp;
import Action.Expression;
import Action.LeftSide;
import Action.Logic;
import Action.Math;
import Action.Num;
import Action.NumAttributes;
import Action.RightSide;
import Action.Rule;
import Action.RuleSet;
import Action.SimpleExp;
import Action.StringAttributes;
import Action.Strings;
import com.google.inject.Inject;
import ime.xtext.radioDsl.services.DslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ActionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ActionPackage.ACTION_RADIO:
				sequence_ActionRadio(context, (ActionRadio) semanticObject); 
				return; 
			case ActionPackage.BOOL:
				sequence_Bool(context, (Bool) semanticObject); 
				return; 
			case ActionPackage.BOOL_ATTRIBUTES:
				sequence_BoolAttributes(context, (BoolAttributes) semanticObject); 
				return; 
			case ActionPackage.COMPARATOR:
				sequence_Comparator(context, (Comparator) semanticObject); 
				return; 
			case ActionPackage.COMPOUND_EXP:
				sequence_CompoundExp(context, (CompoundExp) semanticObject); 
				return; 
			case ActionPackage.EXPRESSION:
				sequence_Expression_Impl(context, (Expression) semanticObject); 
				return; 
			case ActionPackage.LEFT_SIDE:
				sequence_LeftSide_Impl(context, (LeftSide) semanticObject); 
				return; 
			case ActionPackage.LOGIC:
				sequence_Logic(context, (Logic) semanticObject); 
				return; 
			case ActionPackage.MATH:
				sequence_Math(context, (Math) semanticObject); 
				return; 
			case ActionPackage.NUM:
				sequence_Num(context, (Num) semanticObject); 
				return; 
			case ActionPackage.NUM_ATTRIBUTES:
				sequence_NumAttributes(context, (NumAttributes) semanticObject); 
				return; 
			case ActionPackage.RIGHT_SIDE:
				sequence_RightSide_Impl(context, (RightSide) semanticObject); 
				return; 
			case ActionPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case ActionPackage.RULE_SET:
				sequence_RuleSet(context, (RuleSet) semanticObject); 
				return; 
			case ActionPackage.SIMPLE_EXP:
				sequence_SimpleExp(context, (SimpleExp) semanticObject); 
				return; 
			case ActionPackage.STRING_ATTRIBUTES:
				sequence_StringAttributes(context, (StringAttributes) semanticObject); 
				return; 
			case ActionPackage.STRINGS:
				sequence_Strings(context, (Strings) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     RightSide returns ActionRadio
	 *     ActionRadio returns ActionRadio
	 *
	 * Constraint:
	 *     newState=RadioModes
	 */
	protected void sequence_ActionRadio(ISerializationContext context, ActionRadio semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.ACTION_RADIO__NEW_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.ACTION_RADIO__NEW_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionRadioAccess().getNewStateRadioModesEnumRuleCall_3_0(), semanticObject.getNewState());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operand returns BoolAttributes
	 *     BoolAttributes returns BoolAttributes
	 *
	 * Constraint:
	 *     boolAttr=BoolAttr
	 */
	protected void sequence_BoolAttributes(ISerializationContext context, BoolAttributes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.BOOL_ATTRIBUTES__BOOL_ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.BOOL_ATTRIBUTES__BOOL_ATTR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolAttributesAccess().getBoolAttrBoolAttrEnumRuleCall_3_0(), semanticObject.getBoolAttr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operand returns Bool
	 *     Bool returns Bool
	 *
	 * Constraint:
	 *     value?='value'
	 */
	protected void sequence_Bool(ISerializationContext context, Bool semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.BOOL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.BOOL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolAccess().getValueValueKeyword_0_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Comparator
	 *     Comparator returns Comparator
	 *
	 * Constraint:
	 *     Operation=CompOp
	 */
	protected void sequence_Comparator(ISerializationContext context, Comparator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.COMPARATOR__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.COMPARATOR__OPERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparatorAccess().getOperationCompOpEnumRuleCall_3_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LeftSide returns CompoundExp
	 *     Expression returns CompoundExp
	 *     CompoundExp returns CompoundExp
	 *
	 * Constraint:
	 *     (PrecedingLogicOp=LogicOp expression+=Expression expression+=Expression*)
	 */
	protected void sequence_CompoundExp(ISerializationContext context, CompoundExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LeftSide returns Expression
	 *     Expression returns Expression
	 *     Expression_Impl returns Expression
	 *
	 * Constraint:
	 *     {Expression}
	 */
	protected void sequence_Expression_Impl(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LeftSide returns LeftSide
	 *     LeftSide_Impl returns LeftSide
	 *
	 * Constraint:
	 *     {LeftSide}
	 */
	protected void sequence_LeftSide_Impl(ISerializationContext context, LeftSide semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Logic
	 *     Logic returns Logic
	 *
	 * Constraint:
	 *     Operation=LogicOp
	 */
	protected void sequence_Logic(ISerializationContext context, Logic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.LOGIC__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.LOGIC__OPERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLogicAccess().getOperationLogicOpEnumRuleCall_3_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Maths
	 *     Maths returns Maths
	 *
	 * Constraint:
	 *     Operation=MathOp
	 */
	protected void sequence_Math(ISerializationContext context, Math semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.MATH__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.MATH__OPERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathsAccess().getOperationMathOpEnumRuleCall_3_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operand returns NumAttributes
	 *     NumAttributes returns NumAttributes
	 *
	 * Constraint:
	 *     numAttr=NumAttr
	 */
	protected void sequence_NumAttributes(ISerializationContext context, NumAttributes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.NUM_ATTRIBUTES__NUM_ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.NUM_ATTRIBUTES__NUM_ATTR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumAttributesAccess().getNumAttrNumAttrEnumRuleCall_3_0(), semanticObject.getNumAttr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operand returns Num
	 *     Num returns Num
	 *
	 * Constraint:
	 *     value=EDouble
	 */
	protected void sequence_Num(ISerializationContext context, Num semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.NUM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.NUM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumAccess().getValueEDoubleParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RightSide returns RightSide
	 *     RightSide_Impl returns RightSide
	 *
	 * Constraint:
	 *     {RightSide}
	 */
	protected void sequence_RightSide_Impl(ISerializationContext context, RightSide semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleSet returns RuleSet
	 *
	 * Constraint:
	 *     (rule+=Rule rule+=Rule*)?
	 */
	protected void sequence_RuleSet(ISerializationContext context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (priority=EInt name=EString leftside=LeftSide rightside=RightSide)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.RULE__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.RULE__PRIORITY));
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.RULE__LEFTSIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.RULE__LEFTSIDE));
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.RULE__RIGHTSIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.RULE__RIGHTSIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleAccess().getPriorityEIntParserRuleCall_1_0(), semanticObject.getPriority());
		feeder.accept(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRuleAccess().getLeftsideLeftSideParserRuleCall_6_0(), semanticObject.getLeftside());
		feeder.accept(grammarAccess.getRuleAccess().getRightsideRightSideParserRuleCall_8_0(), semanticObject.getRightside());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LeftSide returns SimpleExp
	 *     Expression returns SimpleExp
	 *     SimpleExp returns SimpleExp
	 *
	 * Constraint:
	 *     (PrecedingLogicOp=LogicOp operator=Operator operand+=Operand operand+=Operand*)
	 */
	protected void sequence_SimpleExp(ISerializationContext context, SimpleExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operand returns StringAttributes
	 *     StringAttributes returns StringAttributes
	 *
	 * Constraint:
	 *     stringAttr=StringAttr
	 */
	protected void sequence_StringAttributes(ISerializationContext context, StringAttributes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.STRING_ATTRIBUTES__STRING_ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.STRING_ATTRIBUTES__STRING_ATTR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringAttributesAccess().getStringAttrStringAttrEnumRuleCall_3_0(), semanticObject.getStringAttr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operand returns Strings
	 *     Strings returns Strings
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_Strings(ISerializationContext context, Strings semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionPackage.Literals.STRINGS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionPackage.Literals.STRINGS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringsAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}