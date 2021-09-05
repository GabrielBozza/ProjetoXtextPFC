package ime.xtext.radioDsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ime.xtext.radioDsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RuleSet'", "'{'", "'rule'", "','", "'}'", "'Rule'", "'name'", "'leftside'", "'rightside'", "'LeftSide'", "'RightSide'", "'-'", "'SimpleExp'", "'PrecedingLogicOp'", "'operator'", "'operand'", "'CompoundExp'", "'expression'", "'Expression'", "'Logic'", "'Operation'", "'Comparator'", "'Maths'", "'Num'", "'value'", "'Strings'", "'BoolAttributes'", "'boolAttr'", "'StringAttributes'", "'stringAttr'", "'NumAttributes'", "'numAttr'", "'Bool'", "'.'", "'E'", "'e'", "'ActionRadio'", "'newState'", "'None'", "'and'", "'or'", "'not'", "'greater'", "'greater_equal'", "'less'", "'less_equal'", "'equal'", "'not_equal'", "'plus'", "'minus'", "'divided'", "'multiplication'", "'SNRValues_ASC'", "'SNRValues_DESC'", "'OpRole'", "'SecLevel'", "'CarrierFreq'", "'SILENT_MODE'", "'ALERT_MODE'", "'FULLDUPLEX_MODE'", "'NORMAL_MODE'", "'MAINTAIN_CURRENT_MODE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RuleSet";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRuleSet"
    // InternalDsl.g:65:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalDsl.g:65:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalDsl.g:66:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalDsl.g:72:1: ruleRuleSet returns [EObject current=null] : ( () otherlv_1= 'RuleSet' otherlv_2= '{' (otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_rule_5_0 = null;

        EObject lv_rule_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( () otherlv_1= 'RuleSet' otherlv_2= '{' (otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalDsl.g:79:2: ( () otherlv_1= 'RuleSet' otherlv_2= '{' (otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalDsl.g:79:2: ( () otherlv_1= 'RuleSet' otherlv_2= '{' (otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalDsl.g:80:3: () otherlv_1= 'RuleSet' otherlv_2= '{' (otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalDsl.g:80:3: ()
            // InternalDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleSetAccess().getRuleSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleSetAccess().getRuleSetKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:95:3: (otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:96:4: otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleSetAccess().getRuleKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:104:4: ( (lv_rule_5_0= ruleRule ) )
                    // InternalDsl.g:105:5: (lv_rule_5_0= ruleRule )
                    {
                    // InternalDsl.g:105:5: (lv_rule_5_0= ruleRule )
                    // InternalDsl.g:106:6: lv_rule_5_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_rule_5_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleSetRule());
                    						}
                    						add(
                    							current,
                    							"rule",
                    							lv_rule_5_0,
                    							"ime.xtext.radioDsl.Dsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:123:4: (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:124:5: otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRuleSetAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:128:5: ( (lv_rule_7_0= ruleRule ) )
                    	    // InternalDsl.g:129:6: (lv_rule_7_0= ruleRule )
                    	    {
                    	    // InternalDsl.g:129:6: (lv_rule_7_0= ruleRule )
                    	    // InternalDsl.g:130:7: lv_rule_7_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_rule_7_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleSetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rule",
                    	    								lv_rule_7_0,
                    	    								"ime.xtext.radioDsl.Dsl.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleLeftSide"
    // InternalDsl.g:161:1: entryRuleLeftSide returns [EObject current=null] : iv_ruleLeftSide= ruleLeftSide EOF ;
    public final EObject entryRuleLeftSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSide = null;


        try {
            // InternalDsl.g:161:49: (iv_ruleLeftSide= ruleLeftSide EOF )
            // InternalDsl.g:162:2: iv_ruleLeftSide= ruleLeftSide EOF
            {
             newCompositeNode(grammarAccess.getLeftSideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftSide=ruleLeftSide();

            state._fsp--;

             current =iv_ruleLeftSide; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftSide"


    // $ANTLR start "ruleLeftSide"
    // InternalDsl.g:168:1: ruleLeftSide returns [EObject current=null] : (this_LeftSide_Impl_0= ruleLeftSide_Impl | this_SimpleExp_1= ruleSimpleExp | this_CompoundExp_2= ruleCompoundExp | this_Expression_Impl_3= ruleExpression_Impl ) ;
    public final EObject ruleLeftSide() throws RecognitionException {
        EObject current = null;

        EObject this_LeftSide_Impl_0 = null;

        EObject this_SimpleExp_1 = null;

        EObject this_CompoundExp_2 = null;

        EObject this_Expression_Impl_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:174:2: ( (this_LeftSide_Impl_0= ruleLeftSide_Impl | this_SimpleExp_1= ruleSimpleExp | this_CompoundExp_2= ruleCompoundExp | this_Expression_Impl_3= ruleExpression_Impl ) )
            // InternalDsl.g:175:2: (this_LeftSide_Impl_0= ruleLeftSide_Impl | this_SimpleExp_1= ruleSimpleExp | this_CompoundExp_2= ruleCompoundExp | this_Expression_Impl_3= ruleExpression_Impl )
            {
            // InternalDsl.g:175:2: (this_LeftSide_Impl_0= ruleLeftSide_Impl | this_SimpleExp_1= ruleSimpleExp | this_CompoundExp_2= ruleCompoundExp | this_Expression_Impl_3= ruleExpression_Impl )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:176:3: this_LeftSide_Impl_0= ruleLeftSide_Impl
                    {

                    			newCompositeNode(grammarAccess.getLeftSideAccess().getLeftSide_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftSide_Impl_0=ruleLeftSide_Impl();

                    state._fsp--;


                    			current = this_LeftSide_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:185:3: this_SimpleExp_1= ruleSimpleExp
                    {

                    			newCompositeNode(grammarAccess.getLeftSideAccess().getSimpleExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleExp_1=ruleSimpleExp();

                    state._fsp--;


                    			current = this_SimpleExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:194:3: this_CompoundExp_2= ruleCompoundExp
                    {

                    			newCompositeNode(grammarAccess.getLeftSideAccess().getCompoundExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundExp_2=ruleCompoundExp();

                    state._fsp--;


                    			current = this_CompoundExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:203:3: this_Expression_Impl_3= ruleExpression_Impl
                    {

                    			newCompositeNode(grammarAccess.getLeftSideAccess().getExpression_ImplParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Impl_3=ruleExpression_Impl();

                    state._fsp--;


                    			current = this_Expression_Impl_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftSide"


    // $ANTLR start "entryRuleRightSide"
    // InternalDsl.g:215:1: entryRuleRightSide returns [EObject current=null] : iv_ruleRightSide= ruleRightSide EOF ;
    public final EObject entryRuleRightSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSide = null;


        try {
            // InternalDsl.g:215:50: (iv_ruleRightSide= ruleRightSide EOF )
            // InternalDsl.g:216:2: iv_ruleRightSide= ruleRightSide EOF
            {
             newCompositeNode(grammarAccess.getRightSideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightSide=ruleRightSide();

            state._fsp--;

             current =iv_ruleRightSide; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightSide"


    // $ANTLR start "ruleRightSide"
    // InternalDsl.g:222:1: ruleRightSide returns [EObject current=null] : (this_RightSide_Impl_0= ruleRightSide_Impl | this_ActionRadio_1= ruleActionRadio ) ;
    public final EObject ruleRightSide() throws RecognitionException {
        EObject current = null;

        EObject this_RightSide_Impl_0 = null;

        EObject this_ActionRadio_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:228:2: ( (this_RightSide_Impl_0= ruleRightSide_Impl | this_ActionRadio_1= ruleActionRadio ) )
            // InternalDsl.g:229:2: (this_RightSide_Impl_0= ruleRightSide_Impl | this_ActionRadio_1= ruleActionRadio )
            {
            // InternalDsl.g:229:2: (this_RightSide_Impl_0= ruleRightSide_Impl | this_ActionRadio_1= ruleActionRadio )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:230:3: this_RightSide_Impl_0= ruleRightSide_Impl
                    {

                    			newCompositeNode(grammarAccess.getRightSideAccess().getRightSide_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightSide_Impl_0=ruleRightSide_Impl();

                    state._fsp--;


                    			current = this_RightSide_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:239:3: this_ActionRadio_1= ruleActionRadio
                    {

                    			newCompositeNode(grammarAccess.getRightSideAccess().getActionRadioParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionRadio_1=ruleActionRadio();

                    state._fsp--;


                    			current = this_ActionRadio_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightSide"


    // $ANTLR start "entryRuleOperator"
    // InternalDsl.g:251:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalDsl.g:251:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalDsl.g:252:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalDsl.g:258:1: ruleOperator returns [EObject current=null] : (this_Logic_0= ruleLogic | this_Comparator_1= ruleComparator | this_Maths_2= ruleMaths ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_Logic_0 = null;

        EObject this_Comparator_1 = null;

        EObject this_Maths_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:264:2: ( (this_Logic_0= ruleLogic | this_Comparator_1= ruleComparator | this_Maths_2= ruleMaths ) )
            // InternalDsl.g:265:2: (this_Logic_0= ruleLogic | this_Comparator_1= ruleComparator | this_Maths_2= ruleMaths )
            {
            // InternalDsl.g:265:2: (this_Logic_0= ruleLogic | this_Comparator_1= ruleComparator | this_Maths_2= ruleMaths )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:266:3: this_Logic_0= ruleLogic
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getLogicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Logic_0=ruleLogic();

                    state._fsp--;


                    			current = this_Logic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:275:3: this_Comparator_1= ruleComparator
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getComparatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparator_1=ruleComparator();

                    state._fsp--;


                    			current = this_Comparator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:284:3: this_Maths_2= ruleMaths
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getMathsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Maths_2=ruleMaths();

                    state._fsp--;


                    			current = this_Maths_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleOperand"
    // InternalDsl.g:296:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalDsl.g:296:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalDsl.g:297:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalDsl.g:303:1: ruleOperand returns [EObject current=null] : (this_Num_0= ruleNum | this_Strings_1= ruleStrings | this_BoolAttributes_2= ruleBoolAttributes | this_StringAttributes_3= ruleStringAttributes | this_NumAttributes_4= ruleNumAttributes | this_Bool_5= ruleBool ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject this_Num_0 = null;

        EObject this_Strings_1 = null;

        EObject this_BoolAttributes_2 = null;

        EObject this_StringAttributes_3 = null;

        EObject this_NumAttributes_4 = null;

        EObject this_Bool_5 = null;



        	enterRule();

        try {
            // InternalDsl.g:309:2: ( (this_Num_0= ruleNum | this_Strings_1= ruleStrings | this_BoolAttributes_2= ruleBoolAttributes | this_StringAttributes_3= ruleStringAttributes | this_NumAttributes_4= ruleNumAttributes | this_Bool_5= ruleBool ) )
            // InternalDsl.g:310:2: (this_Num_0= ruleNum | this_Strings_1= ruleStrings | this_BoolAttributes_2= ruleBoolAttributes | this_StringAttributes_3= ruleStringAttributes | this_NumAttributes_4= ruleNumAttributes | this_Bool_5= ruleBool )
            {
            // InternalDsl.g:310:2: (this_Num_0= ruleNum | this_Strings_1= ruleStrings | this_BoolAttributes_2= ruleBoolAttributes | this_StringAttributes_3= ruleStringAttributes | this_NumAttributes_4= ruleNumAttributes | this_Bool_5= ruleBool )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 39:
                {
                alt6=4;
                }
                break;
            case 41:
                {
                alt6=5;
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:311:3: this_Num_0= ruleNum
                    {

                    			newCompositeNode(grammarAccess.getOperandAccess().getNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Num_0=ruleNum();

                    state._fsp--;


                    			current = this_Num_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:320:3: this_Strings_1= ruleStrings
                    {

                    			newCompositeNode(grammarAccess.getOperandAccess().getStringsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Strings_1=ruleStrings();

                    state._fsp--;


                    			current = this_Strings_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:329:3: this_BoolAttributes_2= ruleBoolAttributes
                    {

                    			newCompositeNode(grammarAccess.getOperandAccess().getBoolAttributesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolAttributes_2=ruleBoolAttributes();

                    state._fsp--;


                    			current = this_BoolAttributes_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:338:3: this_StringAttributes_3= ruleStringAttributes
                    {

                    			newCompositeNode(grammarAccess.getOperandAccess().getStringAttributesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringAttributes_3=ruleStringAttributes();

                    state._fsp--;


                    			current = this_StringAttributes_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:347:3: this_NumAttributes_4= ruleNumAttributes
                    {

                    			newCompositeNode(grammarAccess.getOperandAccess().getNumAttributesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumAttributes_4=ruleNumAttributes();

                    state._fsp--;


                    			current = this_NumAttributes_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:356:3: this_Bool_5= ruleBool
                    {

                    			newCompositeNode(grammarAccess.getOperandAccess().getBoolParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bool_5=ruleBool();

                    state._fsp--;


                    			current = this_Bool_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleExpression"
    // InternalDsl.g:368:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDsl.g:368:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDsl.g:369:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDsl.g:375:1: ruleExpression returns [EObject current=null] : (this_Expression_Impl_0= ruleExpression_Impl | this_SimpleExp_1= ruleSimpleExp | this_CompoundExp_2= ruleCompoundExp ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_Impl_0 = null;

        EObject this_SimpleExp_1 = null;

        EObject this_CompoundExp_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:381:2: ( (this_Expression_Impl_0= ruleExpression_Impl | this_SimpleExp_1= ruleSimpleExp | this_CompoundExp_2= ruleCompoundExp ) )
            // InternalDsl.g:382:2: (this_Expression_Impl_0= ruleExpression_Impl | this_SimpleExp_1= ruleSimpleExp | this_CompoundExp_2= ruleCompoundExp )
            {
            // InternalDsl.g:382:2: (this_Expression_Impl_0= ruleExpression_Impl | this_SimpleExp_1= ruleSimpleExp | this_CompoundExp_2= ruleCompoundExp )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:383:3: this_Expression_Impl_0= ruleExpression_Impl
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getExpression_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Impl_0=ruleExpression_Impl();

                    state._fsp--;


                    			current = this_Expression_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:392:3: this_SimpleExp_1= ruleSimpleExp
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleExp_1=ruleSimpleExp();

                    state._fsp--;


                    			current = this_SimpleExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:401:3: this_CompoundExp_2= ruleCompoundExp
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCompoundExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundExp_2=ruleCompoundExp();

                    state._fsp--;


                    			current = this_CompoundExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleRule"
    // InternalDsl.g:413:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDsl.g:413:45: (iv_ruleRule= ruleRule EOF )
            // InternalDsl.g:414:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDsl.g:420:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_priority_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'leftside' ( (lv_leftside_6_0= ruleLeftSide ) ) otherlv_7= 'rightside' ( (lv_rightside_8_0= ruleRightSide ) ) otherlv_9= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_priority_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_leftside_6_0 = null;

        EObject lv_rightside_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:426:2: ( (otherlv_0= 'Rule' ( (lv_priority_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'leftside' ( (lv_leftside_6_0= ruleLeftSide ) ) otherlv_7= 'rightside' ( (lv_rightside_8_0= ruleRightSide ) ) otherlv_9= '}' ) )
            // InternalDsl.g:427:2: (otherlv_0= 'Rule' ( (lv_priority_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'leftside' ( (lv_leftside_6_0= ruleLeftSide ) ) otherlv_7= 'rightside' ( (lv_rightside_8_0= ruleRightSide ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:427:2: (otherlv_0= 'Rule' ( (lv_priority_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'leftside' ( (lv_leftside_6_0= ruleLeftSide ) ) otherlv_7= 'rightside' ( (lv_rightside_8_0= ruleRightSide ) ) otherlv_9= '}' )
            // InternalDsl.g:428:3: otherlv_0= 'Rule' ( (lv_priority_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'leftside' ( (lv_leftside_6_0= ruleLeftSide ) ) otherlv_7= 'rightside' ( (lv_rightside_8_0= ruleRightSide ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalDsl.g:432:3: ( (lv_priority_1_0= ruleEInt ) )
            // InternalDsl.g:433:4: (lv_priority_1_0= ruleEInt )
            {
            // InternalDsl.g:433:4: (lv_priority_1_0= ruleEInt )
            // InternalDsl.g:434:5: lv_priority_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getPriorityEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_priority_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_1_0,
            						"ime.xtext.radioDsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getNameKeyword_3());
            		
            // InternalDsl.g:459:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDsl.g:460:4: (lv_name_4_0= ruleEString )
            {
            // InternalDsl.g:460:4: (lv_name_4_0= ruleEString )
            // InternalDsl.g:461:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"ime.xtext.radioDsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getLeftsideKeyword_5());
            		
            // InternalDsl.g:482:3: ( (lv_leftside_6_0= ruleLeftSide ) )
            // InternalDsl.g:483:4: (lv_leftside_6_0= ruleLeftSide )
            {
            // InternalDsl.g:483:4: (lv_leftside_6_0= ruleLeftSide )
            // InternalDsl.g:484:5: lv_leftside_6_0= ruleLeftSide
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getLeftsideLeftSideParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_leftside_6_0=ruleLeftSide();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"leftside",
            						lv_leftside_6_0,
            						"ime.xtext.radioDsl.Dsl.LeftSide");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightsideKeyword_7());
            		
            // InternalDsl.g:505:3: ( (lv_rightside_8_0= ruleRightSide ) )
            // InternalDsl.g:506:4: (lv_rightside_8_0= ruleRightSide )
            {
            // InternalDsl.g:506:4: (lv_rightside_8_0= ruleRightSide )
            // InternalDsl.g:507:5: lv_rightside_8_0= ruleRightSide
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getRightsideRightSideParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_rightside_8_0=ruleRightSide();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"rightside",
            						lv_rightside_8_0,
            						"ime.xtext.radioDsl.Dsl.RightSide");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleLeftSide_Impl"
    // InternalDsl.g:532:1: entryRuleLeftSide_Impl returns [EObject current=null] : iv_ruleLeftSide_Impl= ruleLeftSide_Impl EOF ;
    public final EObject entryRuleLeftSide_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSide_Impl = null;


        try {
            // InternalDsl.g:532:54: (iv_ruleLeftSide_Impl= ruleLeftSide_Impl EOF )
            // InternalDsl.g:533:2: iv_ruleLeftSide_Impl= ruleLeftSide_Impl EOF
            {
             newCompositeNode(grammarAccess.getLeftSide_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftSide_Impl=ruleLeftSide_Impl();

            state._fsp--;

             current =iv_ruleLeftSide_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftSide_Impl"


    // $ANTLR start "ruleLeftSide_Impl"
    // InternalDsl.g:539:1: ruleLeftSide_Impl returns [EObject current=null] : ( () otherlv_1= 'LeftSide' ) ;
    public final EObject ruleLeftSide_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:545:2: ( ( () otherlv_1= 'LeftSide' ) )
            // InternalDsl.g:546:2: ( () otherlv_1= 'LeftSide' )
            {
            // InternalDsl.g:546:2: ( () otherlv_1= 'LeftSide' )
            // InternalDsl.g:547:3: () otherlv_1= 'LeftSide'
            {
            // InternalDsl.g:547:3: ()
            // InternalDsl.g:548:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftSide_ImplAccess().getLeftSideAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftSide_ImplAccess().getLeftSideKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftSide_Impl"


    // $ANTLR start "entryRuleRightSide_Impl"
    // InternalDsl.g:562:1: entryRuleRightSide_Impl returns [EObject current=null] : iv_ruleRightSide_Impl= ruleRightSide_Impl EOF ;
    public final EObject entryRuleRightSide_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSide_Impl = null;


        try {
            // InternalDsl.g:562:55: (iv_ruleRightSide_Impl= ruleRightSide_Impl EOF )
            // InternalDsl.g:563:2: iv_ruleRightSide_Impl= ruleRightSide_Impl EOF
            {
             newCompositeNode(grammarAccess.getRightSide_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightSide_Impl=ruleRightSide_Impl();

            state._fsp--;

             current =iv_ruleRightSide_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightSide_Impl"


    // $ANTLR start "ruleRightSide_Impl"
    // InternalDsl.g:569:1: ruleRightSide_Impl returns [EObject current=null] : ( () otherlv_1= 'RightSide' ) ;
    public final EObject ruleRightSide_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:575:2: ( ( () otherlv_1= 'RightSide' ) )
            // InternalDsl.g:576:2: ( () otherlv_1= 'RightSide' )
            {
            // InternalDsl.g:576:2: ( () otherlv_1= 'RightSide' )
            // InternalDsl.g:577:3: () otherlv_1= 'RightSide'
            {
            // InternalDsl.g:577:3: ()
            // InternalDsl.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightSide_ImplAccess().getRightSideAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRightSide_ImplAccess().getRightSideKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightSide_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:592:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:592:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:593:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:599:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:605:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:606:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:606:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:607:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:615:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:626:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:626:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:627:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:633:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:639:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:640:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:640:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:641:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:641:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:642:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSimpleExp"
    // InternalDsl.g:659:1: entryRuleSimpleExp returns [EObject current=null] : iv_ruleSimpleExp= ruleSimpleExp EOF ;
    public final EObject entryRuleSimpleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExp = null;


        try {
            // InternalDsl.g:659:50: (iv_ruleSimpleExp= ruleSimpleExp EOF )
            // InternalDsl.g:660:2: iv_ruleSimpleExp= ruleSimpleExp EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleExp=ruleSimpleExp();

            state._fsp--;

             current =iv_ruleSimpleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExp"


    // $ANTLR start "ruleSimpleExp"
    // InternalDsl.g:666:1: ruleSimpleExp returns [EObject current=null] : (otherlv_0= 'SimpleExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'operand' otherlv_7= '{' ( (lv_operand_8_0= ruleOperand ) ) (otherlv_9= ',' ( (lv_operand_10_0= ruleOperand ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleSimpleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_PrecedingLogicOp_3_0 = null;

        EObject lv_operator_5_0 = null;

        EObject lv_operand_8_0 = null;

        EObject lv_operand_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:672:2: ( (otherlv_0= 'SimpleExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'operand' otherlv_7= '{' ( (lv_operand_8_0= ruleOperand ) ) (otherlv_9= ',' ( (lv_operand_10_0= ruleOperand ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalDsl.g:673:2: (otherlv_0= 'SimpleExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'operand' otherlv_7= '{' ( (lv_operand_8_0= ruleOperand ) ) (otherlv_9= ',' ( (lv_operand_10_0= ruleOperand ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalDsl.g:673:2: (otherlv_0= 'SimpleExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'operand' otherlv_7= '{' ( (lv_operand_8_0= ruleOperand ) ) (otherlv_9= ',' ( (lv_operand_10_0= ruleOperand ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalDsl.g:674:3: otherlv_0= 'SimpleExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'operand' otherlv_7= '{' ( (lv_operand_8_0= ruleOperand ) ) (otherlv_9= ',' ( (lv_operand_10_0= ruleOperand ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleExpAccess().getSimpleExpKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleExpAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleExpAccess().getPrecedingLogicOpKeyword_2());
            		
            // InternalDsl.g:686:3: ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) )
            // InternalDsl.g:687:4: (lv_PrecedingLogicOp_3_0= ruleLogicOp )
            {
            // InternalDsl.g:687:4: (lv_PrecedingLogicOp_3_0= ruleLogicOp )
            // InternalDsl.g:688:5: lv_PrecedingLogicOp_3_0= ruleLogicOp
            {

            					newCompositeNode(grammarAccess.getSimpleExpAccess().getPrecedingLogicOpLogicOpEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_PrecedingLogicOp_3_0=ruleLogicOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleExpRule());
            					}
            					set(
            						current,
            						"PrecedingLogicOp",
            						lv_PrecedingLogicOp_3_0,
            						"ime.xtext.radioDsl.Dsl.LogicOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleExpAccess().getOperatorKeyword_4());
            		
            // InternalDsl.g:709:3: ( (lv_operator_5_0= ruleOperator ) )
            // InternalDsl.g:710:4: (lv_operator_5_0= ruleOperator )
            {
            // InternalDsl.g:710:4: (lv_operator_5_0= ruleOperator )
            // InternalDsl.g:711:5: lv_operator_5_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getSimpleExpAccess().getOperatorOperatorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_operator_5_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleExpRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_5_0,
            						"ime.xtext.radioDsl.Dsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getSimpleExpAccess().getOperandKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getSimpleExpAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDsl.g:736:3: ( (lv_operand_8_0= ruleOperand ) )
            // InternalDsl.g:737:4: (lv_operand_8_0= ruleOperand )
            {
            // InternalDsl.g:737:4: (lv_operand_8_0= ruleOperand )
            // InternalDsl.g:738:5: lv_operand_8_0= ruleOperand
            {

            					newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_operand_8_0=ruleOperand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleExpRule());
            					}
            					add(
            						current,
            						"operand",
            						lv_operand_8_0,
            						"ime.xtext.radioDsl.Dsl.Operand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:755:3: (otherlv_9= ',' ( (lv_operand_10_0= ruleOperand ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:756:4: otherlv_9= ',' ( (lv_operand_10_0= ruleOperand ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_21); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSimpleExpAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalDsl.g:760:4: ( (lv_operand_10_0= ruleOperand ) )
            	    // InternalDsl.g:761:5: (lv_operand_10_0= ruleOperand )
            	    {
            	    // InternalDsl.g:761:5: (lv_operand_10_0= ruleOperand )
            	    // InternalDsl.g:762:6: lv_operand_10_0= ruleOperand
            	    {

            	    						newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operand_10_0=ruleOperand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimpleExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_10_0,
            	    							"ime.xtext.radioDsl.Dsl.Operand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getSimpleExpAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSimpleExpAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExp"


    // $ANTLR start "entryRuleCompoundExp"
    // InternalDsl.g:792:1: entryRuleCompoundExp returns [EObject current=null] : iv_ruleCompoundExp= ruleCompoundExp EOF ;
    public final EObject entryRuleCompoundExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundExp = null;


        try {
            // InternalDsl.g:792:52: (iv_ruleCompoundExp= ruleCompoundExp EOF )
            // InternalDsl.g:793:2: iv_ruleCompoundExp= ruleCompoundExp EOF
            {
             newCompositeNode(grammarAccess.getCompoundExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundExp=ruleCompoundExp();

            state._fsp--;

             current =iv_ruleCompoundExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundExp"


    // $ANTLR start "ruleCompoundExp"
    // InternalDsl.g:799:1: ruleCompoundExp returns [EObject current=null] : (otherlv_0= 'CompoundExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleCompoundExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_PrecedingLogicOp_3_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:805:2: ( (otherlv_0= 'CompoundExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalDsl.g:806:2: (otherlv_0= 'CompoundExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalDsl.g:806:2: (otherlv_0= 'CompoundExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalDsl.g:807:3: otherlv_0= 'CompoundExp' otherlv_1= '{' otherlv_2= 'PrecedingLogicOp' ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) ) otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundExpAccess().getCompoundExpKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundExpAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCompoundExpAccess().getPrecedingLogicOpKeyword_2());
            		
            // InternalDsl.g:819:3: ( (lv_PrecedingLogicOp_3_0= ruleLogicOp ) )
            // InternalDsl.g:820:4: (lv_PrecedingLogicOp_3_0= ruleLogicOp )
            {
            // InternalDsl.g:820:4: (lv_PrecedingLogicOp_3_0= ruleLogicOp )
            // InternalDsl.g:821:5: lv_PrecedingLogicOp_3_0= ruleLogicOp
            {

            					newCompositeNode(grammarAccess.getCompoundExpAccess().getPrecedingLogicOpLogicOpEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_PrecedingLogicOp_3_0=ruleLogicOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundExpRule());
            					}
            					set(
            						current,
            						"PrecedingLogicOp",
            						lv_PrecedingLogicOp_3_0,
            						"ime.xtext.radioDsl.Dsl.LogicOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCompoundExpAccess().getExpressionKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCompoundExpAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDsl.g:846:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalDsl.g:847:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalDsl.g:847:4: (lv_expression_6_0= ruleExpression )
            // InternalDsl.g:848:5: lv_expression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCompoundExpAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_expression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundExpRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"ime.xtext.radioDsl.Dsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:865:3: (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:866:4: otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCompoundExpAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalDsl.g:870:4: ( (lv_expression_8_0= ruleExpression ) )
            	    // InternalDsl.g:871:5: (lv_expression_8_0= ruleExpression )
            	    {
            	    // InternalDsl.g:871:5: (lv_expression_8_0= ruleExpression )
            	    // InternalDsl.g:872:6: lv_expression_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompoundExpAccess().getExpressionExpressionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_expression_8_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompoundExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expression",
            	    							lv_expression_8_0,
            	    							"ime.xtext.radioDsl.Dsl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getCompoundExpAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCompoundExpAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundExp"


    // $ANTLR start "entryRuleExpression_Impl"
    // InternalDsl.g:902:1: entryRuleExpression_Impl returns [EObject current=null] : iv_ruleExpression_Impl= ruleExpression_Impl EOF ;
    public final EObject entryRuleExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Impl = null;


        try {
            // InternalDsl.g:902:56: (iv_ruleExpression_Impl= ruleExpression_Impl EOF )
            // InternalDsl.g:903:2: iv_ruleExpression_Impl= ruleExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getExpression_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Impl=ruleExpression_Impl();

            state._fsp--;

             current =iv_ruleExpression_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Impl"


    // $ANTLR start "ruleExpression_Impl"
    // InternalDsl.g:909:1: ruleExpression_Impl returns [EObject current=null] : ( () otherlv_1= 'Expression' ) ;
    public final EObject ruleExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:915:2: ( ( () otherlv_1= 'Expression' ) )
            // InternalDsl.g:916:2: ( () otherlv_1= 'Expression' )
            {
            // InternalDsl.g:916:2: ( () otherlv_1= 'Expression' )
            // InternalDsl.g:917:3: () otherlv_1= 'Expression'
            {
            // InternalDsl.g:917:3: ()
            // InternalDsl.g:918:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_ImplAccess().getExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExpression_ImplAccess().getExpressionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Impl"


    // $ANTLR start "entryRuleLogic"
    // InternalDsl.g:932:1: entryRuleLogic returns [EObject current=null] : iv_ruleLogic= ruleLogic EOF ;
    public final EObject entryRuleLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogic = null;


        try {
            // InternalDsl.g:932:46: (iv_ruleLogic= ruleLogic EOF )
            // InternalDsl.g:933:2: iv_ruleLogic= ruleLogic EOF
            {
             newCompositeNode(grammarAccess.getLogicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogic=ruleLogic();

            state._fsp--;

             current =iv_ruleLogic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogic"


    // $ANTLR start "ruleLogic"
    // InternalDsl.g:939:1: ruleLogic returns [EObject current=null] : (otherlv_0= 'Logic' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleLogicOp ) ) otherlv_4= '}' ) ;
    public final EObject ruleLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_Operation_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:945:2: ( (otherlv_0= 'Logic' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleLogicOp ) ) otherlv_4= '}' ) )
            // InternalDsl.g:946:2: (otherlv_0= 'Logic' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleLogicOp ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:946:2: (otherlv_0= 'Logic' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleLogicOp ) ) otherlv_4= '}' )
            // InternalDsl.g:947:3: otherlv_0= 'Logic' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleLogicOp ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicAccess().getLogicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicAccess().getOperationKeyword_2());
            		
            // InternalDsl.g:959:3: ( (lv_Operation_3_0= ruleLogicOp ) )
            // InternalDsl.g:960:4: (lv_Operation_3_0= ruleLogicOp )
            {
            // InternalDsl.g:960:4: (lv_Operation_3_0= ruleLogicOp )
            // InternalDsl.g:961:5: lv_Operation_3_0= ruleLogicOp
            {

            					newCompositeNode(grammarAccess.getLogicAccess().getOperationLogicOpEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_Operation_3_0=ruleLogicOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicRule());
            					}
            					set(
            						current,
            						"Operation",
            						lv_Operation_3_0,
            						"ime.xtext.radioDsl.Dsl.LogicOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogic"


    // $ANTLR start "entryRuleComparator"
    // InternalDsl.g:986:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalDsl.g:986:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalDsl.g:987:2: iv_ruleComparator= ruleComparator EOF
            {
             newCompositeNode(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparator=ruleComparator();

            state._fsp--;

             current =iv_ruleComparator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalDsl.g:993:1: ruleComparator returns [EObject current=null] : (otherlv_0= 'Comparator' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleCompOp ) ) otherlv_4= '}' ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_Operation_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:999:2: ( (otherlv_0= 'Comparator' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleCompOp ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1000:2: (otherlv_0= 'Comparator' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleCompOp ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1000:2: (otherlv_0= 'Comparator' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleCompOp ) ) otherlv_4= '}' )
            // InternalDsl.g:1001:3: otherlv_0= 'Comparator' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleCompOp ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComparatorAccess().getComparatorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getComparatorAccess().getOperationKeyword_2());
            		
            // InternalDsl.g:1013:3: ( (lv_Operation_3_0= ruleCompOp ) )
            // InternalDsl.g:1014:4: (lv_Operation_3_0= ruleCompOp )
            {
            // InternalDsl.g:1014:4: (lv_Operation_3_0= ruleCompOp )
            // InternalDsl.g:1015:5: lv_Operation_3_0= ruleCompOp
            {

            					newCompositeNode(grammarAccess.getComparatorAccess().getOperationCompOpEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_Operation_3_0=ruleCompOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparatorRule());
            					}
            					set(
            						current,
            						"Operation",
            						lv_Operation_3_0,
            						"ime.xtext.radioDsl.Dsl.CompOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComparatorAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleMaths"
    // InternalDsl.g:1040:1: entryRuleMaths returns [EObject current=null] : iv_ruleMaths= ruleMaths EOF ;
    public final EObject entryRuleMaths() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaths = null;


        try {
            // InternalDsl.g:1040:46: (iv_ruleMaths= ruleMaths EOF )
            // InternalDsl.g:1041:2: iv_ruleMaths= ruleMaths EOF
            {
             newCompositeNode(grammarAccess.getMathsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaths=ruleMaths();

            state._fsp--;

             current =iv_ruleMaths; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaths"


    // $ANTLR start "ruleMaths"
    // InternalDsl.g:1047:1: ruleMaths returns [EObject current=null] : (otherlv_0= 'Maths' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleMathOp ) ) otherlv_4= '}' ) ;
    public final EObject ruleMaths() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_Operation_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1053:2: ( (otherlv_0= 'Maths' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleMathOp ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1054:2: (otherlv_0= 'Maths' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleMathOp ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1054:2: (otherlv_0= 'Maths' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleMathOp ) ) otherlv_4= '}' )
            // InternalDsl.g:1055:3: otherlv_0= 'Maths' otherlv_1= '{' otherlv_2= 'Operation' ( (lv_Operation_3_0= ruleMathOp ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathsAccess().getMathsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getMathsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getMathsAccess().getOperationKeyword_2());
            		
            // InternalDsl.g:1067:3: ( (lv_Operation_3_0= ruleMathOp ) )
            // InternalDsl.g:1068:4: (lv_Operation_3_0= ruleMathOp )
            {
            // InternalDsl.g:1068:4: (lv_Operation_3_0= ruleMathOp )
            // InternalDsl.g:1069:5: lv_Operation_3_0= ruleMathOp
            {

            					newCompositeNode(grammarAccess.getMathsAccess().getOperationMathOpEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_Operation_3_0=ruleMathOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathsRule());
            					}
            					set(
            						current,
            						"Operation",
            						lv_Operation_3_0,
            						"ime.xtext.radioDsl.Dsl.MathOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMathsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaths"


    // $ANTLR start "entryRuleNum"
    // InternalDsl.g:1094:1: entryRuleNum returns [EObject current=null] : iv_ruleNum= ruleNum EOF ;
    public final EObject entryRuleNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNum = null;


        try {
            // InternalDsl.g:1094:44: (iv_ruleNum= ruleNum EOF )
            // InternalDsl.g:1095:2: iv_ruleNum= ruleNum EOF
            {
             newCompositeNode(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNum=ruleNum();

            state._fsp--;

             current =iv_ruleNum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // InternalDsl.g:1101:1: ruleNum returns [EObject current=null] : (otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEDouble ) ) otherlv_4= '}' ) ;
    public final EObject ruleNum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1107:2: ( (otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEDouble ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1108:2: (otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEDouble ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1108:2: (otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEDouble ) ) otherlv_4= '}' )
            // InternalDsl.g:1109:3: otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEDouble ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNumAccess().getNumKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getNumAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getNumAccess().getValueKeyword_2());
            		
            // InternalDsl.g:1121:3: ( (lv_value_3_0= ruleEDouble ) )
            // InternalDsl.g:1122:4: (lv_value_3_0= ruleEDouble )
            {
            // InternalDsl.g:1122:4: (lv_value_3_0= ruleEDouble )
            // InternalDsl.g:1123:5: lv_value_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getNumAccess().getValueEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"ime.xtext.radioDsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNumAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleStrings"
    // InternalDsl.g:1148:1: entryRuleStrings returns [EObject current=null] : iv_ruleStrings= ruleStrings EOF ;
    public final EObject entryRuleStrings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrings = null;


        try {
            // InternalDsl.g:1148:48: (iv_ruleStrings= ruleStrings EOF )
            // InternalDsl.g:1149:2: iv_ruleStrings= ruleStrings EOF
            {
             newCompositeNode(grammarAccess.getStringsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrings=ruleStrings();

            state._fsp--;

             current =iv_ruleStrings; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrings"


    // $ANTLR start "ruleStrings"
    // InternalDsl.g:1155:1: ruleStrings returns [EObject current=null] : (otherlv_0= 'Strings' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleStrings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1161:2: ( (otherlv_0= 'Strings' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1162:2: (otherlv_0= 'Strings' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1162:2: (otherlv_0= 'Strings' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalDsl.g:1163:3: otherlv_0= 'Strings' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringsAccess().getStringsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getStringsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getStringsAccess().getValueKeyword_2());
            		
            // InternalDsl.g:1175:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDsl.g:1176:4: (lv_value_3_0= ruleEString )
            {
            // InternalDsl.g:1176:4: (lv_value_3_0= ruleEString )
            // InternalDsl.g:1177:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringsAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringsRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"ime.xtext.radioDsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrings"


    // $ANTLR start "entryRuleBoolAttributes"
    // InternalDsl.g:1202:1: entryRuleBoolAttributes returns [EObject current=null] : iv_ruleBoolAttributes= ruleBoolAttributes EOF ;
    public final EObject entryRuleBoolAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolAttributes = null;


        try {
            // InternalDsl.g:1202:55: (iv_ruleBoolAttributes= ruleBoolAttributes EOF )
            // InternalDsl.g:1203:2: iv_ruleBoolAttributes= ruleBoolAttributes EOF
            {
             newCompositeNode(grammarAccess.getBoolAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolAttributes=ruleBoolAttributes();

            state._fsp--;

             current =iv_ruleBoolAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolAttributes"


    // $ANTLR start "ruleBoolAttributes"
    // InternalDsl.g:1209:1: ruleBoolAttributes returns [EObject current=null] : (otherlv_0= 'BoolAttributes' otherlv_1= '{' otherlv_2= 'boolAttr' ( (lv_boolAttr_3_0= ruleBoolAttr ) ) otherlv_4= '}' ) ;
    public final EObject ruleBoolAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_boolAttr_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1215:2: ( (otherlv_0= 'BoolAttributes' otherlv_1= '{' otherlv_2= 'boolAttr' ( (lv_boolAttr_3_0= ruleBoolAttr ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1216:2: (otherlv_0= 'BoolAttributes' otherlv_1= '{' otherlv_2= 'boolAttr' ( (lv_boolAttr_3_0= ruleBoolAttr ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1216:2: (otherlv_0= 'BoolAttributes' otherlv_1= '{' otherlv_2= 'boolAttr' ( (lv_boolAttr_3_0= ruleBoolAttr ) ) otherlv_4= '}' )
            // InternalDsl.g:1217:3: otherlv_0= 'BoolAttributes' otherlv_1= '{' otherlv_2= 'boolAttr' ( (lv_boolAttr_3_0= ruleBoolAttr ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoolAttributesAccess().getBoolAttributesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolAttributesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getBoolAttributesAccess().getBoolAttrKeyword_2());
            		
            // InternalDsl.g:1229:3: ( (lv_boolAttr_3_0= ruleBoolAttr ) )
            // InternalDsl.g:1230:4: (lv_boolAttr_3_0= ruleBoolAttr )
            {
            // InternalDsl.g:1230:4: (lv_boolAttr_3_0= ruleBoolAttr )
            // InternalDsl.g:1231:5: lv_boolAttr_3_0= ruleBoolAttr
            {

            					newCompositeNode(grammarAccess.getBoolAttributesAccess().getBoolAttrBoolAttrEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_boolAttr_3_0=ruleBoolAttr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolAttributesRule());
            					}
            					set(
            						current,
            						"boolAttr",
            						lv_boolAttr_3_0,
            						"ime.xtext.radioDsl.Dsl.BoolAttr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBoolAttributesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolAttributes"


    // $ANTLR start "entryRuleStringAttributes"
    // InternalDsl.g:1256:1: entryRuleStringAttributes returns [EObject current=null] : iv_ruleStringAttributes= ruleStringAttributes EOF ;
    public final EObject entryRuleStringAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributes = null;


        try {
            // InternalDsl.g:1256:57: (iv_ruleStringAttributes= ruleStringAttributes EOF )
            // InternalDsl.g:1257:2: iv_ruleStringAttributes= ruleStringAttributes EOF
            {
             newCompositeNode(grammarAccess.getStringAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringAttributes=ruleStringAttributes();

            state._fsp--;

             current =iv_ruleStringAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringAttributes"


    // $ANTLR start "ruleStringAttributes"
    // InternalDsl.g:1263:1: ruleStringAttributes returns [EObject current=null] : (otherlv_0= 'StringAttributes' otherlv_1= '{' otherlv_2= 'stringAttr' ( (lv_stringAttr_3_0= ruleStringAttr ) ) otherlv_4= '}' ) ;
    public final EObject ruleStringAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_stringAttr_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1269:2: ( (otherlv_0= 'StringAttributes' otherlv_1= '{' otherlv_2= 'stringAttr' ( (lv_stringAttr_3_0= ruleStringAttr ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1270:2: (otherlv_0= 'StringAttributes' otherlv_1= '{' otherlv_2= 'stringAttr' ( (lv_stringAttr_3_0= ruleStringAttr ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1270:2: (otherlv_0= 'StringAttributes' otherlv_1= '{' otherlv_2= 'stringAttr' ( (lv_stringAttr_3_0= ruleStringAttr ) ) otherlv_4= '}' )
            // InternalDsl.g:1271:3: otherlv_0= 'StringAttributes' otherlv_1= '{' otherlv_2= 'stringAttr' ( (lv_stringAttr_3_0= ruleStringAttr ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringAttributesAccess().getStringAttributesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getStringAttributesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getStringAttributesAccess().getStringAttrKeyword_2());
            		
            // InternalDsl.g:1283:3: ( (lv_stringAttr_3_0= ruleStringAttr ) )
            // InternalDsl.g:1284:4: (lv_stringAttr_3_0= ruleStringAttr )
            {
            // InternalDsl.g:1284:4: (lv_stringAttr_3_0= ruleStringAttr )
            // InternalDsl.g:1285:5: lv_stringAttr_3_0= ruleStringAttr
            {

            					newCompositeNode(grammarAccess.getStringAttributesAccess().getStringAttrStringAttrEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_stringAttr_3_0=ruleStringAttr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringAttributesRule());
            					}
            					set(
            						current,
            						"stringAttr",
            						lv_stringAttr_3_0,
            						"ime.xtext.radioDsl.Dsl.StringAttr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringAttributesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringAttributes"


    // $ANTLR start "entryRuleNumAttributes"
    // InternalDsl.g:1310:1: entryRuleNumAttributes returns [EObject current=null] : iv_ruleNumAttributes= ruleNumAttributes EOF ;
    public final EObject entryRuleNumAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAttributes = null;


        try {
            // InternalDsl.g:1310:54: (iv_ruleNumAttributes= ruleNumAttributes EOF )
            // InternalDsl.g:1311:2: iv_ruleNumAttributes= ruleNumAttributes EOF
            {
             newCompositeNode(grammarAccess.getNumAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumAttributes=ruleNumAttributes();

            state._fsp--;

             current =iv_ruleNumAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumAttributes"


    // $ANTLR start "ruleNumAttributes"
    // InternalDsl.g:1317:1: ruleNumAttributes returns [EObject current=null] : (otherlv_0= 'NumAttributes' otherlv_1= '{' otherlv_2= 'numAttr' ( (lv_numAttr_3_0= ruleNumAttr ) ) otherlv_4= '}' ) ;
    public final EObject ruleNumAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_numAttr_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1323:2: ( (otherlv_0= 'NumAttributes' otherlv_1= '{' otherlv_2= 'numAttr' ( (lv_numAttr_3_0= ruleNumAttr ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1324:2: (otherlv_0= 'NumAttributes' otherlv_1= '{' otherlv_2= 'numAttr' ( (lv_numAttr_3_0= ruleNumAttr ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1324:2: (otherlv_0= 'NumAttributes' otherlv_1= '{' otherlv_2= 'numAttr' ( (lv_numAttr_3_0= ruleNumAttr ) ) otherlv_4= '}' )
            // InternalDsl.g:1325:3: otherlv_0= 'NumAttributes' otherlv_1= '{' otherlv_2= 'numAttr' ( (lv_numAttr_3_0= ruleNumAttr ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNumAttributesAccess().getNumAttributesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getNumAttributesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getNumAttributesAccess().getNumAttrKeyword_2());
            		
            // InternalDsl.g:1337:3: ( (lv_numAttr_3_0= ruleNumAttr ) )
            // InternalDsl.g:1338:4: (lv_numAttr_3_0= ruleNumAttr )
            {
            // InternalDsl.g:1338:4: (lv_numAttr_3_0= ruleNumAttr )
            // InternalDsl.g:1339:5: lv_numAttr_3_0= ruleNumAttr
            {

            					newCompositeNode(grammarAccess.getNumAttributesAccess().getNumAttrNumAttrEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_numAttr_3_0=ruleNumAttr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumAttributesRule());
            					}
            					set(
            						current,
            						"numAttr",
            						lv_numAttr_3_0,
            						"ime.xtext.radioDsl.Dsl.NumAttr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNumAttributesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumAttributes"


    // $ANTLR start "entryRuleBool"
    // InternalDsl.g:1364:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalDsl.g:1364:45: (iv_ruleBool= ruleBool EOF )
            // InternalDsl.g:1365:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalDsl.g:1371:1: ruleBool returns [EObject current=null] : ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Bool' ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1377:2: ( ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Bool' ) )
            // InternalDsl.g:1378:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Bool' )
            {
            // InternalDsl.g:1378:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Bool' )
            // InternalDsl.g:1379:3: ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Bool'
            {
            // InternalDsl.g:1379:3: ( (lv_value_0_0= 'value' ) )
            // InternalDsl.g:1380:4: (lv_value_0_0= 'value' )
            {
            // InternalDsl.g:1380:4: (lv_value_0_0= 'value' )
            // InternalDsl.g:1381:5: lv_value_0_0= 'value'
            {
            lv_value_0_0=(Token)match(input,35,FOLLOW_34); 

            					newLeafNode(lv_value_0_0, grammarAccess.getBoolAccess().getValueValueKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0 != null, "value");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getBoolKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:1401:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:1401:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:1402:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:1408:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:1414:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:1415:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:1415:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:1416:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:1416:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1417:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1423:3: (this_INT_1= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1424:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_36); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,44,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_37); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:1444:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=45 && LA16_0<=46)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1445:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:1445:4: (kw= 'E' | kw= 'e' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==45) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==46) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalDsl.g:1446:5: kw= 'E'
                            {
                            kw=(Token)match(input,45,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:1452:5: kw= 'e'
                            {
                            kw=(Token)match(input,46,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:1458:4: (kw= '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==22) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDsl.g:1459:5: kw= '-'
                            {
                            kw=(Token)match(input,22,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleActionRadio"
    // InternalDsl.g:1477:1: entryRuleActionRadio returns [EObject current=null] : iv_ruleActionRadio= ruleActionRadio EOF ;
    public final EObject entryRuleActionRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionRadio = null;


        try {
            // InternalDsl.g:1477:52: (iv_ruleActionRadio= ruleActionRadio EOF )
            // InternalDsl.g:1478:2: iv_ruleActionRadio= ruleActionRadio EOF
            {
             newCompositeNode(grammarAccess.getActionRadioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionRadio=ruleActionRadio();

            state._fsp--;

             current =iv_ruleActionRadio; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionRadio"


    // $ANTLR start "ruleActionRadio"
    // InternalDsl.g:1484:1: ruleActionRadio returns [EObject current=null] : (otherlv_0= 'ActionRadio' otherlv_1= '{' otherlv_2= 'newState' ( (lv_newState_3_0= ruleRadioModes ) ) otherlv_4= '}' ) ;
    public final EObject ruleActionRadio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_newState_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1490:2: ( (otherlv_0= 'ActionRadio' otherlv_1= '{' otherlv_2= 'newState' ( (lv_newState_3_0= ruleRadioModes ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1491:2: (otherlv_0= 'ActionRadio' otherlv_1= '{' otherlv_2= 'newState' ( (lv_newState_3_0= ruleRadioModes ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1491:2: (otherlv_0= 'ActionRadio' otherlv_1= '{' otherlv_2= 'newState' ( (lv_newState_3_0= ruleRadioModes ) ) otherlv_4= '}' )
            // InternalDsl.g:1492:3: otherlv_0= 'ActionRadio' otherlv_1= '{' otherlv_2= 'newState' ( (lv_newState_3_0= ruleRadioModes ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionRadioAccess().getActionRadioKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getActionRadioAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getActionRadioAccess().getNewStateKeyword_2());
            		
            // InternalDsl.g:1504:3: ( (lv_newState_3_0= ruleRadioModes ) )
            // InternalDsl.g:1505:4: (lv_newState_3_0= ruleRadioModes )
            {
            // InternalDsl.g:1505:4: (lv_newState_3_0= ruleRadioModes )
            // InternalDsl.g:1506:5: lv_newState_3_0= ruleRadioModes
            {

            					newCompositeNode(grammarAccess.getActionRadioAccess().getNewStateRadioModesEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_newState_3_0=ruleRadioModes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRadioRule());
            					}
            					set(
            						current,
            						"newState",
            						lv_newState_3_0,
            						"ime.xtext.radioDsl.Dsl.RadioModes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getActionRadioAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionRadio"


    // $ANTLR start "ruleLogicOp"
    // InternalDsl.g:1531:1: ruleLogicOp returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'or' ) | (enumLiteral_3= 'not' ) ) ;
    public final Enumerator ruleLogicOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1537:2: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'or' ) | (enumLiteral_3= 'not' ) ) )
            // InternalDsl.g:1538:2: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'or' ) | (enumLiteral_3= 'not' ) )
            {
            // InternalDsl.g:1538:2: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'or' ) | (enumLiteral_3= 'not' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt17=1;
                }
                break;
            case 50:
                {
                alt17=2;
                }
                break;
            case 51:
                {
                alt17=3;
                }
                break;
            case 52:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1539:3: (enumLiteral_0= 'None' )
                    {
                    // InternalDsl.g:1539:3: (enumLiteral_0= 'None' )
                    // InternalDsl.g:1540:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOpAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1547:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDsl.g:1547:3: (enumLiteral_1= 'and' )
                    // InternalDsl.g:1548:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpAccess().getAndEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicOpAccess().getAndEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1555:3: (enumLiteral_2= 'or' )
                    {
                    // InternalDsl.g:1555:3: (enumLiteral_2= 'or' )
                    // InternalDsl.g:1556:4: enumLiteral_2= 'or'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpAccess().getOrEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicOpAccess().getOrEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1563:3: (enumLiteral_3= 'not' )
                    {
                    // InternalDsl.g:1563:3: (enumLiteral_3= 'not' )
                    // InternalDsl.g:1564:4: enumLiteral_3= 'not'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpAccess().getNotEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLogicOpAccess().getNotEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOp"


    // $ANTLR start "ruleCompOp"
    // InternalDsl.g:1574:1: ruleCompOp returns [Enumerator current=null] : ( (enumLiteral_0= 'greater' ) | (enumLiteral_1= 'greater_equal' ) | (enumLiteral_2= 'less' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'equal' ) | (enumLiteral_5= 'not_equal' ) ) ;
    public final Enumerator ruleCompOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDsl.g:1580:2: ( ( (enumLiteral_0= 'greater' ) | (enumLiteral_1= 'greater_equal' ) | (enumLiteral_2= 'less' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'equal' ) | (enumLiteral_5= 'not_equal' ) ) )
            // InternalDsl.g:1581:2: ( (enumLiteral_0= 'greater' ) | (enumLiteral_1= 'greater_equal' ) | (enumLiteral_2= 'less' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'equal' ) | (enumLiteral_5= 'not_equal' ) )
            {
            // InternalDsl.g:1581:2: ( (enumLiteral_0= 'greater' ) | (enumLiteral_1= 'greater_equal' ) | (enumLiteral_2= 'less' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'equal' ) | (enumLiteral_5= 'not_equal' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt18=1;
                }
                break;
            case 54:
                {
                alt18=2;
                }
                break;
            case 55:
                {
                alt18=3;
                }
                break;
            case 56:
                {
                alt18=4;
                }
                break;
            case 57:
                {
                alt18=5;
                }
                break;
            case 58:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1582:3: (enumLiteral_0= 'greater' )
                    {
                    // InternalDsl.g:1582:3: (enumLiteral_0= 'greater' )
                    // InternalDsl.g:1583:4: enumLiteral_0= 'greater'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getGreaterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOpAccess().getGreaterEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1590:3: (enumLiteral_1= 'greater_equal' )
                    {
                    // InternalDsl.g:1590:3: (enumLiteral_1= 'greater_equal' )
                    // InternalDsl.g:1591:4: enumLiteral_1= 'greater_equal'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getGreater_equalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOpAccess().getGreater_equalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1598:3: (enumLiteral_2= 'less' )
                    {
                    // InternalDsl.g:1598:3: (enumLiteral_2= 'less' )
                    // InternalDsl.g:1599:4: enumLiteral_2= 'less'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getLessEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOpAccess().getLessEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1606:3: (enumLiteral_3= 'less_equal' )
                    {
                    // InternalDsl.g:1606:3: (enumLiteral_3= 'less_equal' )
                    // InternalDsl.g:1607:4: enumLiteral_3= 'less_equal'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompOpAccess().getLess_equalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1614:3: (enumLiteral_4= 'equal' )
                    {
                    // InternalDsl.g:1614:3: (enumLiteral_4= 'equal' )
                    // InternalDsl.g:1615:4: enumLiteral_4= 'equal'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCompOpAccess().getEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1622:3: (enumLiteral_5= 'not_equal' )
                    {
                    // InternalDsl.g:1622:3: (enumLiteral_5= 'not_equal' )
                    // InternalDsl.g:1623:4: enumLiteral_5= 'not_equal'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getNot_equalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCompOpAccess().getNot_equalEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompOp"


    // $ANTLR start "ruleMathOp"
    // InternalDsl.g:1633:1: ruleMathOp returns [Enumerator current=null] : ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'minus' ) | (enumLiteral_2= 'divided' ) | (enumLiteral_3= 'multiplication' ) ) ;
    public final Enumerator ruleMathOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1639:2: ( ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'minus' ) | (enumLiteral_2= 'divided' ) | (enumLiteral_3= 'multiplication' ) ) )
            // InternalDsl.g:1640:2: ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'minus' ) | (enumLiteral_2= 'divided' ) | (enumLiteral_3= 'multiplication' ) )
            {
            // InternalDsl.g:1640:2: ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'minus' ) | (enumLiteral_2= 'divided' ) | (enumLiteral_3= 'multiplication' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt19=1;
                }
                break;
            case 60:
                {
                alt19=2;
                }
                break;
            case 61:
                {
                alt19=3;
                }
                break;
            case 62:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1641:3: (enumLiteral_0= 'plus' )
                    {
                    // InternalDsl.g:1641:3: (enumLiteral_0= 'plus' )
                    // InternalDsl.g:1642:4: enumLiteral_0= 'plus'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMathOpAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOpAccess().getPlusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1649:3: (enumLiteral_1= 'minus' )
                    {
                    // InternalDsl.g:1649:3: (enumLiteral_1= 'minus' )
                    // InternalDsl.g:1650:4: enumLiteral_1= 'minus'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getMathOpAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOpAccess().getMinusEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1657:3: (enumLiteral_2= 'divided' )
                    {
                    // InternalDsl.g:1657:3: (enumLiteral_2= 'divided' )
                    // InternalDsl.g:1658:4: enumLiteral_2= 'divided'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMathOpAccess().getDividedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOpAccess().getDividedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1665:3: (enumLiteral_3= 'multiplication' )
                    {
                    // InternalDsl.g:1665:3: (enumLiteral_3= 'multiplication' )
                    // InternalDsl.g:1666:4: enumLiteral_3= 'multiplication'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getMathOpAccess().getMultiplicationEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMathOpAccess().getMultiplicationEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathOp"


    // $ANTLR start "ruleBoolAttr"
    // InternalDsl.g:1676:1: ruleBoolAttr returns [Enumerator current=null] : ( (enumLiteral_0= 'SNRValues_ASC' ) | (enumLiteral_1= 'SNRValues_DESC' ) ) ;
    public final Enumerator ruleBoolAttr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1682:2: ( ( (enumLiteral_0= 'SNRValues_ASC' ) | (enumLiteral_1= 'SNRValues_DESC' ) ) )
            // InternalDsl.g:1683:2: ( (enumLiteral_0= 'SNRValues_ASC' ) | (enumLiteral_1= 'SNRValues_DESC' ) )
            {
            // InternalDsl.g:1683:2: ( (enumLiteral_0= 'SNRValues_ASC' ) | (enumLiteral_1= 'SNRValues_DESC' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==63) ) {
                alt20=1;
            }
            else if ( (LA20_0==64) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1684:3: (enumLiteral_0= 'SNRValues_ASC' )
                    {
                    // InternalDsl.g:1684:3: (enumLiteral_0= 'SNRValues_ASC' )
                    // InternalDsl.g:1685:4: enumLiteral_0= 'SNRValues_ASC'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBoolAttrAccess().getSNRValues_ASCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolAttrAccess().getSNRValues_ASCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1692:3: (enumLiteral_1= 'SNRValues_DESC' )
                    {
                    // InternalDsl.g:1692:3: (enumLiteral_1= 'SNRValues_DESC' )
                    // InternalDsl.g:1693:4: enumLiteral_1= 'SNRValues_DESC'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBoolAttrAccess().getSNRValues_DESCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolAttrAccess().getSNRValues_DESCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolAttr"


    // $ANTLR start "ruleStringAttr"
    // InternalDsl.g:1703:1: ruleStringAttr returns [Enumerator current=null] : (enumLiteral_0= 'OpRole' ) ;
    public final Enumerator ruleStringAttr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1709:2: ( (enumLiteral_0= 'OpRole' ) )
            // InternalDsl.g:1710:2: (enumLiteral_0= 'OpRole' )
            {
            // InternalDsl.g:1710:2: (enumLiteral_0= 'OpRole' )
            // InternalDsl.g:1711:3: enumLiteral_0= 'OpRole'
            {
            enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

            			current = grammarAccess.getStringAttrAccess().getOpRoleEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getStringAttrAccess().getOpRoleEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringAttr"


    // $ANTLR start "ruleNumAttr"
    // InternalDsl.g:1720:1: ruleNumAttr returns [Enumerator current=null] : ( (enumLiteral_0= 'SecLevel' ) | (enumLiteral_1= 'CarrierFreq' ) ) ;
    public final Enumerator ruleNumAttr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1726:2: ( ( (enumLiteral_0= 'SecLevel' ) | (enumLiteral_1= 'CarrierFreq' ) ) )
            // InternalDsl.g:1727:2: ( (enumLiteral_0= 'SecLevel' ) | (enumLiteral_1= 'CarrierFreq' ) )
            {
            // InternalDsl.g:1727:2: ( (enumLiteral_0= 'SecLevel' ) | (enumLiteral_1= 'CarrierFreq' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==66) ) {
                alt21=1;
            }
            else if ( (LA21_0==67) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1728:3: (enumLiteral_0= 'SecLevel' )
                    {
                    // InternalDsl.g:1728:3: (enumLiteral_0= 'SecLevel' )
                    // InternalDsl.g:1729:4: enumLiteral_0= 'SecLevel'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getNumAttrAccess().getSecLevelEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumAttrAccess().getSecLevelEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1736:3: (enumLiteral_1= 'CarrierFreq' )
                    {
                    // InternalDsl.g:1736:3: (enumLiteral_1= 'CarrierFreq' )
                    // InternalDsl.g:1737:4: enumLiteral_1= 'CarrierFreq'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getNumAttrAccess().getCarrierFreqEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumAttrAccess().getCarrierFreqEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumAttr"


    // $ANTLR start "ruleRadioModes"
    // InternalDsl.g:1747:1: ruleRadioModes returns [Enumerator current=null] : ( (enumLiteral_0= 'SILENT_MODE' ) | (enumLiteral_1= 'ALERT_MODE' ) | (enumLiteral_2= 'FULLDUPLEX_MODE' ) | (enumLiteral_3= 'NORMAL_MODE' ) | (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' ) ) ;
    public final Enumerator ruleRadioModes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDsl.g:1753:2: ( ( (enumLiteral_0= 'SILENT_MODE' ) | (enumLiteral_1= 'ALERT_MODE' ) | (enumLiteral_2= 'FULLDUPLEX_MODE' ) | (enumLiteral_3= 'NORMAL_MODE' ) | (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' ) ) )
            // InternalDsl.g:1754:2: ( (enumLiteral_0= 'SILENT_MODE' ) | (enumLiteral_1= 'ALERT_MODE' ) | (enumLiteral_2= 'FULLDUPLEX_MODE' ) | (enumLiteral_3= 'NORMAL_MODE' ) | (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' ) )
            {
            // InternalDsl.g:1754:2: ( (enumLiteral_0= 'SILENT_MODE' ) | (enumLiteral_1= 'ALERT_MODE' ) | (enumLiteral_2= 'FULLDUPLEX_MODE' ) | (enumLiteral_3= 'NORMAL_MODE' ) | (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt22=1;
                }
                break;
            case 69:
                {
                alt22=2;
                }
                break;
            case 70:
                {
                alt22=3;
                }
                break;
            case 71:
                {
                alt22=4;
                }
                break;
            case 72:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1755:3: (enumLiteral_0= 'SILENT_MODE' )
                    {
                    // InternalDsl.g:1755:3: (enumLiteral_0= 'SILENT_MODE' )
                    // InternalDsl.g:1756:4: enumLiteral_0= 'SILENT_MODE'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getSILENT_MODEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRadioModesAccess().getSILENT_MODEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1763:3: (enumLiteral_1= 'ALERT_MODE' )
                    {
                    // InternalDsl.g:1763:3: (enumLiteral_1= 'ALERT_MODE' )
                    // InternalDsl.g:1764:4: enumLiteral_1= 'ALERT_MODE'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getALERT_MODEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRadioModesAccess().getALERT_MODEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1771:3: (enumLiteral_2= 'FULLDUPLEX_MODE' )
                    {
                    // InternalDsl.g:1771:3: (enumLiteral_2= 'FULLDUPLEX_MODE' )
                    // InternalDsl.g:1772:4: enumLiteral_2= 'FULLDUPLEX_MODE'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getFULLDUPLEX_MODEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRadioModesAccess().getFULLDUPLEX_MODEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1779:3: (enumLiteral_3= 'NORMAL_MODE' )
                    {
                    // InternalDsl.g:1779:3: (enumLiteral_3= 'NORMAL_MODE' )
                    // InternalDsl.g:1780:4: enumLiteral_3= 'NORMAL_MODE'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getNORMAL_MODEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRadioModesAccess().getNORMAL_MODEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1787:3: (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' )
                    {
                    // InternalDsl.g:1787:3: (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' )
                    // InternalDsl.g:1788:4: enumLiteral_4= 'MAINTAIN_CURRENT_MODE'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getMAINTAIN_CURRENT_MODEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRadioModesAccess().getMAINTAIN_CURRENT_MODEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadioModes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000028900000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000340000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000002BC00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000400040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F0L});

}