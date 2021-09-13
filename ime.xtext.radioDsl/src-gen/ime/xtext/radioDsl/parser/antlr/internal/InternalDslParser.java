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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RuleSet'", "'{'", "','", "'}'", "'Rule'", "'priority'", "'='", "'rule'", "'-->'", "'('", "')'", "'['", "']'", "'-'", "'.'", "'E'", "'e'", "'true'", "'false'", "'_'", "'and'", "'or'", "'not'", "'>'", "'>='", "'<'", "'<='", "'!='", "'+'", "'/'", "'*'", "'SNRValues_ASC'", "'SNRValues_DESC'", "'OperationalRole'", "'SecurityLevel'", "'CarrierFrequency'", "'SILENT_MODE'", "'ALERT_MODE'", "'FULLDUPLEX_MODE'", "'NORMAL_MODE'", "'MAINTAIN_CURRENT_MODE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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
    // InternalDsl.g:72:1: ruleRuleSet returns [EObject current=null] : ( () otherlv_1= 'RuleSet' otherlv_2= '{' ( ( (lv_rule_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rule_3_0 = null;

        EObject lv_rule_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( () otherlv_1= 'RuleSet' otherlv_2= '{' ( ( (lv_rule_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) )
            // InternalDsl.g:79:2: ( () otherlv_1= 'RuleSet' otherlv_2= '{' ( ( (lv_rule_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            {
            // InternalDsl.g:79:2: ( () otherlv_1= 'RuleSet' otherlv_2= '{' ( ( (lv_rule_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            // InternalDsl.g:80:3: () otherlv_1= 'RuleSet' otherlv_2= '{' ( ( (lv_rule_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) ) )* )? otherlv_6= '}'
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
            		
            // InternalDsl.g:95:3: ( ( (lv_rule_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:96:4: ( (lv_rule_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) ) )*
                    {
                    // InternalDsl.g:96:4: ( (lv_rule_3_0= ruleRule ) )
                    // InternalDsl.g:97:5: (lv_rule_3_0= ruleRule )
                    {
                    // InternalDsl.g:97:5: (lv_rule_3_0= ruleRule )
                    // InternalDsl.g:98:6: lv_rule_3_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_rule_3_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleSetRule());
                    						}
                    						add(
                    							current,
                    							"rule",
                    							lv_rule_3_0,
                    							"ime.xtext.radioDsl.Dsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:115:4: (otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:116:5: otherlv_4= ',' ( (lv_rule_5_0= ruleRule ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalDsl.g:120:5: ( (lv_rule_5_0= ruleRule ) )
                    	    // InternalDsl.g:121:6: (lv_rule_5_0= ruleRule )
                    	    {
                    	    // InternalDsl.g:121:6: (lv_rule_5_0= ruleRule )
                    	    // InternalDsl.g:122:7: lv_rule_5_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDsl.g:149:1: entryRuleLeftSide returns [EObject current=null] : iv_ruleLeftSide= ruleLeftSide EOF ;
    public final EObject entryRuleLeftSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSide = null;


        try {
            // InternalDsl.g:149:49: (iv_ruleLeftSide= ruleLeftSide EOF )
            // InternalDsl.g:150:2: iv_ruleLeftSide= ruleLeftSide EOF
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
    // InternalDsl.g:156:1: ruleLeftSide returns [EObject current=null] : (this_SimpleExp_0= ruleSimpleExp | this_CompoundExp_1= ruleCompoundExp ) ;
    public final EObject ruleLeftSide() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExp_0 = null;

        EObject this_CompoundExp_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:162:2: ( (this_SimpleExp_0= ruleSimpleExp | this_CompoundExp_1= ruleCompoundExp ) )
            // InternalDsl.g:163:2: (this_SimpleExp_0= ruleSimpleExp | this_CompoundExp_1= ruleCompoundExp )
            {
            // InternalDsl.g:163:2: (this_SimpleExp_0= ruleSimpleExp | this_CompoundExp_1= ruleCompoundExp )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==22) ) {
                    alt3=2;
                }
                else if ( (LA3_1==20) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==20) ) {
                    alt3=1;
                }
                else if ( (LA3_2==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==20) ) {
                    alt3=1;
                }
                else if ( (LA3_3==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==22) ) {
                    alt3=2;
                }
                else if ( (LA3_4==20) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:164:3: this_SimpleExp_0= ruleSimpleExp
                    {

                    			newCompositeNode(grammarAccess.getLeftSideAccess().getSimpleExpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleExp_0=ruleSimpleExp();

                    state._fsp--;


                    			current = this_SimpleExp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:173:3: this_CompoundExp_1= ruleCompoundExp
                    {

                    			newCompositeNode(grammarAccess.getLeftSideAccess().getCompoundExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundExp_1=ruleCompoundExp();

                    state._fsp--;


                    			current = this_CompoundExp_1;
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
    // InternalDsl.g:185:1: entryRuleRightSide returns [EObject current=null] : iv_ruleRightSide= ruleRightSide EOF ;
    public final EObject entryRuleRightSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSide = null;


        try {
            // InternalDsl.g:185:50: (iv_ruleRightSide= ruleRightSide EOF )
            // InternalDsl.g:186:2: iv_ruleRightSide= ruleRightSide EOF
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
    // InternalDsl.g:192:1: ruleRightSide returns [EObject current=null] : this_ActionRadio_0= ruleActionRadio ;
    public final EObject ruleRightSide() throws RecognitionException {
        EObject current = null;

        EObject this_ActionRadio_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:198:2: (this_ActionRadio_0= ruleActionRadio )
            // InternalDsl.g:199:2: this_ActionRadio_0= ruleActionRadio
            {

            		newCompositeNode(grammarAccess.getRightSideAccess().getActionRadioParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ActionRadio_0=ruleActionRadio();

            state._fsp--;


            		current = this_ActionRadio_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleOperatorNum"
    // InternalDsl.g:210:1: entryRuleOperatorNum returns [EObject current=null] : iv_ruleOperatorNum= ruleOperatorNum EOF ;
    public final EObject entryRuleOperatorNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorNum = null;


        try {
            // InternalDsl.g:210:52: (iv_ruleOperatorNum= ruleOperatorNum EOF )
            // InternalDsl.g:211:2: iv_ruleOperatorNum= ruleOperatorNum EOF
            {
             newCompositeNode(grammarAccess.getOperatorNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatorNum=ruleOperatorNum();

            state._fsp--;

             current =iv_ruleOperatorNum; 
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
    // $ANTLR end "entryRuleOperatorNum"


    // $ANTLR start "ruleOperatorNum"
    // InternalDsl.g:217:1: ruleOperatorNum returns [EObject current=null] : (this_Comparator_0= ruleComparator | this_Math_1= ruleMath ) ;
    public final EObject ruleOperatorNum() throws RecognitionException {
        EObject current = null;

        EObject this_Comparator_0 = null;

        EObject this_Math_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:223:2: ( (this_Comparator_0= ruleComparator | this_Math_1= ruleMath ) )
            // InternalDsl.g:224:2: (this_Comparator_0= ruleComparator | this_Math_1= ruleMath )
            {
            // InternalDsl.g:224:2: (this_Comparator_0= ruleComparator | this_Math_1= ruleMath )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17||(LA4_0>=34 && LA4_0<=38)) ) {
                alt4=1;
            }
            else if ( (LA4_0==24||(LA4_0>=39 && LA4_0<=41)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:225:3: this_Comparator_0= ruleComparator
                    {

                    			newCompositeNode(grammarAccess.getOperatorNumAccess().getComparatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparator_0=ruleComparator();

                    state._fsp--;


                    			current = this_Comparator_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:234:3: this_Math_1= ruleMath
                    {

                    			newCompositeNode(grammarAccess.getOperatorNumAccess().getMathParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Math_1=ruleMath();

                    state._fsp--;


                    			current = this_Math_1;
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
    // $ANTLR end "ruleOperatorNum"


    // $ANTLR start "entryRuleOperatorString"
    // InternalDsl.g:246:1: entryRuleOperatorString returns [EObject current=null] : iv_ruleOperatorString= ruleOperatorString EOF ;
    public final EObject entryRuleOperatorString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorString = null;


        try {
            // InternalDsl.g:246:55: (iv_ruleOperatorString= ruleOperatorString EOF )
            // InternalDsl.g:247:2: iv_ruleOperatorString= ruleOperatorString EOF
            {
             newCompositeNode(grammarAccess.getOperatorStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatorString=ruleOperatorString();

            state._fsp--;

             current =iv_ruleOperatorString; 
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
    // $ANTLR end "entryRuleOperatorString"


    // $ANTLR start "ruleOperatorString"
    // InternalDsl.g:253:1: ruleOperatorString returns [EObject current=null] : this_ComparatorString_0= ruleComparatorString ;
    public final EObject ruleOperatorString() throws RecognitionException {
        EObject current = null;

        EObject this_ComparatorString_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:259:2: (this_ComparatorString_0= ruleComparatorString )
            // InternalDsl.g:260:2: this_ComparatorString_0= ruleComparatorString
            {

            		newCompositeNode(grammarAccess.getOperatorStringAccess().getComparatorStringParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ComparatorString_0=ruleComparatorString();

            state._fsp--;


            		current = this_ComparatorString_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleOperatorString"


    // $ANTLR start "entryRuleOperatorBoolBefore"
    // InternalDsl.g:271:1: entryRuleOperatorBoolBefore returns [EObject current=null] : iv_ruleOperatorBoolBefore= ruleOperatorBoolBefore EOF ;
    public final EObject entryRuleOperatorBoolBefore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorBoolBefore = null;


        try {
            // InternalDsl.g:271:59: (iv_ruleOperatorBoolBefore= ruleOperatorBoolBefore EOF )
            // InternalDsl.g:272:2: iv_ruleOperatorBoolBefore= ruleOperatorBoolBefore EOF
            {
             newCompositeNode(grammarAccess.getOperatorBoolBeforeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatorBoolBefore=ruleOperatorBoolBefore();

            state._fsp--;

             current =iv_ruleOperatorBoolBefore; 
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
    // $ANTLR end "entryRuleOperatorBoolBefore"


    // $ANTLR start "ruleOperatorBoolBefore"
    // InternalDsl.g:278:1: ruleOperatorBoolBefore returns [EObject current=null] : this_LogicBefore_0= ruleLogicBefore ;
    public final EObject ruleOperatorBoolBefore() throws RecognitionException {
        EObject current = null;

        EObject this_LogicBefore_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:284:2: (this_LogicBefore_0= ruleLogicBefore )
            // InternalDsl.g:285:2: this_LogicBefore_0= ruleLogicBefore
            {

            		newCompositeNode(grammarAccess.getOperatorBoolBeforeAccess().getLogicBeforeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_LogicBefore_0=ruleLogicBefore();

            state._fsp--;


            		current = this_LogicBefore_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleOperatorBoolBefore"


    // $ANTLR start "entryRuleOperandNum"
    // InternalDsl.g:296:1: entryRuleOperandNum returns [EObject current=null] : iv_ruleOperandNum= ruleOperandNum EOF ;
    public final EObject entryRuleOperandNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandNum = null;


        try {
            // InternalDsl.g:296:51: (iv_ruleOperandNum= ruleOperandNum EOF )
            // InternalDsl.g:297:2: iv_ruleOperandNum= ruleOperandNum EOF
            {
             newCompositeNode(grammarAccess.getOperandNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperandNum=ruleOperandNum();

            state._fsp--;

             current =iv_ruleOperandNum; 
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
    // $ANTLR end "entryRuleOperandNum"


    // $ANTLR start "ruleOperandNum"
    // InternalDsl.g:303:1: ruleOperandNum returns [EObject current=null] : (this_Num_0= ruleNum | this_NumAttributes_1= ruleNumAttributes ) ;
    public final EObject ruleOperandNum() throws RecognitionException {
        EObject current = null;

        EObject this_Num_0 = null;

        EObject this_NumAttributes_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:309:2: ( (this_Num_0= ruleNum | this_NumAttributes_1= ruleNumAttributes ) )
            // InternalDsl.g:310:2: (this_Num_0= ruleNum | this_NumAttributes_1= ruleNumAttributes )
            {
            // InternalDsl.g:310:2: (this_Num_0= ruleNum | this_NumAttributes_1= ruleNumAttributes )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||(LA5_0>=24 && LA5_0<=25)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=45 && LA5_0<=46)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:311:3: this_Num_0= ruleNum
                    {

                    			newCompositeNode(grammarAccess.getOperandNumAccess().getNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Num_0=ruleNum();

                    state._fsp--;


                    			current = this_Num_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:320:3: this_NumAttributes_1= ruleNumAttributes
                    {

                    			newCompositeNode(grammarAccess.getOperandNumAccess().getNumAttributesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumAttributes_1=ruleNumAttributes();

                    state._fsp--;


                    			current = this_NumAttributes_1;
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
    // $ANTLR end "ruleOperandNum"


    // $ANTLR start "entryRuleOperandBool"
    // InternalDsl.g:332:1: entryRuleOperandBool returns [EObject current=null] : iv_ruleOperandBool= ruleOperandBool EOF ;
    public final EObject entryRuleOperandBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandBool = null;


        try {
            // InternalDsl.g:332:52: (iv_ruleOperandBool= ruleOperandBool EOF )
            // InternalDsl.g:333:2: iv_ruleOperandBool= ruleOperandBool EOF
            {
             newCompositeNode(grammarAccess.getOperandBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperandBool=ruleOperandBool();

            state._fsp--;

             current =iv_ruleOperandBool; 
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
    // $ANTLR end "entryRuleOperandBool"


    // $ANTLR start "ruleOperandBool"
    // InternalDsl.g:339:1: ruleOperandBool returns [EObject current=null] : (this_Bool_0= ruleBool | this_BoolAttributes_1= ruleBoolAttributes ) ;
    public final EObject ruleOperandBool() throws RecognitionException {
        EObject current = null;

        EObject this_Bool_0 = null;

        EObject this_BoolAttributes_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:345:2: ( (this_Bool_0= ruleBool | this_BoolAttributes_1= ruleBoolAttributes ) )
            // InternalDsl.g:346:2: (this_Bool_0= ruleBool | this_BoolAttributes_1= ruleBoolAttributes )
            {
            // InternalDsl.g:346:2: (this_Bool_0= ruleBool | this_BoolAttributes_1= ruleBoolAttributes )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=28 && LA6_0<=29)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=42 && LA6_0<=43)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:347:3: this_Bool_0= ruleBool
                    {

                    			newCompositeNode(grammarAccess.getOperandBoolAccess().getBoolParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bool_0=ruleBool();

                    state._fsp--;


                    			current = this_Bool_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:356:3: this_BoolAttributes_1= ruleBoolAttributes
                    {

                    			newCompositeNode(grammarAccess.getOperandBoolAccess().getBoolAttributesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolAttributes_1=ruleBoolAttributes();

                    state._fsp--;


                    			current = this_BoolAttributes_1;
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
    // $ANTLR end "ruleOperandBool"


    // $ANTLR start "entryRuleOperandString"
    // InternalDsl.g:368:1: entryRuleOperandString returns [EObject current=null] : iv_ruleOperandString= ruleOperandString EOF ;
    public final EObject entryRuleOperandString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandString = null;


        try {
            // InternalDsl.g:368:54: (iv_ruleOperandString= ruleOperandString EOF )
            // InternalDsl.g:369:2: iv_ruleOperandString= ruleOperandString EOF
            {
             newCompositeNode(grammarAccess.getOperandStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperandString=ruleOperandString();

            state._fsp--;

             current =iv_ruleOperandString; 
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
    // $ANTLR end "entryRuleOperandString"


    // $ANTLR start "ruleOperandString"
    // InternalDsl.g:375:1: ruleOperandString returns [EObject current=null] : (this_Strings_0= ruleStrings | this_StringAttributes_1= ruleStringAttributes ) ;
    public final EObject ruleOperandString() throws RecognitionException {
        EObject current = null;

        EObject this_Strings_0 = null;

        EObject this_StringAttributes_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:381:2: ( (this_Strings_0= ruleStrings | this_StringAttributes_1= ruleStringAttributes ) )
            // InternalDsl.g:382:2: (this_Strings_0= ruleStrings | this_StringAttributes_1= ruleStringAttributes )
            {
            // InternalDsl.g:382:2: (this_Strings_0= ruleStrings | this_StringAttributes_1= ruleStringAttributes )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            else if ( (LA7_0==44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:383:3: this_Strings_0= ruleStrings
                    {

                    			newCompositeNode(grammarAccess.getOperandStringAccess().getStringsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Strings_0=ruleStrings();

                    state._fsp--;


                    			current = this_Strings_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:392:3: this_StringAttributes_1= ruleStringAttributes
                    {

                    			newCompositeNode(grammarAccess.getOperandStringAccess().getStringAttributesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringAttributes_1=ruleStringAttributes();

                    state._fsp--;


                    			current = this_StringAttributes_1;
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
    // $ANTLR end "ruleOperandString"


    // $ANTLR start "entryRuleExpression"
    // InternalDsl.g:404:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDsl.g:404:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDsl.g:405:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDsl.g:411:1: ruleExpression returns [EObject current=null] : (this_SimpleExp_0= ruleSimpleExp | this_CompoundExp_1= ruleCompoundExp ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExp_0 = null;

        EObject this_CompoundExp_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:417:2: ( (this_SimpleExp_0= ruleSimpleExp | this_CompoundExp_1= ruleCompoundExp ) )
            // InternalDsl.g:418:2: (this_SimpleExp_0= ruleSimpleExp | this_CompoundExp_1= ruleCompoundExp )
            {
            // InternalDsl.g:418:2: (this_SimpleExp_0= ruleSimpleExp | this_CompoundExp_1= ruleCompoundExp )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==22) ) {
                    alt8=2;
                }
                else if ( (LA8_1==20) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==20) ) {
                    alt8=1;
                }
                else if ( (LA8_2==22) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==20) ) {
                    alt8=1;
                }
                else if ( (LA8_3==22) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA8_4 = input.LA(2);

                if ( (LA8_4==22) ) {
                    alt8=2;
                }
                else if ( (LA8_4==20) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:419:3: this_SimpleExp_0= ruleSimpleExp
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleExp_0=ruleSimpleExp();

                    state._fsp--;


                    			current = this_SimpleExp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:428:3: this_CompoundExp_1= ruleCompoundExp
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCompoundExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundExp_1=ruleCompoundExp();

                    state._fsp--;


                    			current = this_CompoundExp_1;
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
    // InternalDsl.g:440:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDsl.g:440:45: (iv_ruleRule= ruleRule EOF )
            // InternalDsl.g:441:2: iv_ruleRule= ruleRule EOF
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
    // InternalDsl.g:447:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'priority' )+ (otherlv_4= '=' )+ ( (lv_priority_5_0= ruleEInt ) ) (otherlv_6= 'rule' )+ (otherlv_7= '=' )+ ( (lv_leftside_8_0= ruleLeftSide ) ) otherlv_9= '-->' ( (lv_rightside_10_0= ruleRightSide ) ) otherlv_11= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_priority_5_0 = null;

        EObject lv_leftside_8_0 = null;

        EObject lv_rightside_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:453:2: ( (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'priority' )+ (otherlv_4= '=' )+ ( (lv_priority_5_0= ruleEInt ) ) (otherlv_6= 'rule' )+ (otherlv_7= '=' )+ ( (lv_leftside_8_0= ruleLeftSide ) ) otherlv_9= '-->' ( (lv_rightside_10_0= ruleRightSide ) ) otherlv_11= '}' ) )
            // InternalDsl.g:454:2: (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'priority' )+ (otherlv_4= '=' )+ ( (lv_priority_5_0= ruleEInt ) ) (otherlv_6= 'rule' )+ (otherlv_7= '=' )+ ( (lv_leftside_8_0= ruleLeftSide ) ) otherlv_9= '-->' ( (lv_rightside_10_0= ruleRightSide ) ) otherlv_11= '}' )
            {
            // InternalDsl.g:454:2: (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'priority' )+ (otherlv_4= '=' )+ ( (lv_priority_5_0= ruleEInt ) ) (otherlv_6= 'rule' )+ (otherlv_7= '=' )+ ( (lv_leftside_8_0= ruleLeftSide ) ) otherlv_9= '-->' ( (lv_rightside_10_0= ruleRightSide ) ) otherlv_11= '}' )
            // InternalDsl.g:455:3: otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'priority' )+ (otherlv_4= '=' )+ ( (lv_priority_5_0= ruleEInt ) ) (otherlv_6= 'rule' )+ (otherlv_7= '=' )+ ( (lv_leftside_8_0= ruleLeftSide ) ) otherlv_9= '-->' ( (lv_rightside_10_0= ruleRightSide ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalDsl.g:459:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:460:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:460:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:461:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ime.xtext.radioDsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:482:3: (otherlv_3= 'priority' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:483:4: otherlv_3= 'priority'
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getPriorityKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalDsl.g:488:3: (otherlv_4= '=' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:489:4: otherlv_4= '='
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getEqualsSignKeyword_4());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalDsl.g:494:3: ( (lv_priority_5_0= ruleEInt ) )
            // InternalDsl.g:495:4: (lv_priority_5_0= ruleEInt )
            {
            // InternalDsl.g:495:4: (lv_priority_5_0= ruleEInt )
            // InternalDsl.g:496:5: lv_priority_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getPriorityEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_priority_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_5_0,
            						"ime.xtext.radioDsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:513:3: (otherlv_6= 'rule' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:514:4: otherlv_6= 'rule'
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRuleKeyword_6());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalDsl.g:519:3: (otherlv_7= '=' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:520:4: otherlv_7= '='
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getEqualsSignKeyword_7());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // InternalDsl.g:525:3: ( (lv_leftside_8_0= ruleLeftSide ) )
            // InternalDsl.g:526:4: (lv_leftside_8_0= ruleLeftSide )
            {
            // InternalDsl.g:526:4: (lv_leftside_8_0= ruleLeftSide )
            // InternalDsl.g:527:5: lv_leftside_8_0= ruleLeftSide
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getLeftsideLeftSideParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_leftside_8_0=ruleLeftSide();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"leftside",
            						lv_leftside_8_0,
            						"ime.xtext.radioDsl.Dsl.LeftSide");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_9());
            		
            // InternalDsl.g:548:3: ( (lv_rightside_10_0= ruleRightSide ) )
            // InternalDsl.g:549:4: (lv_rightside_10_0= ruleRightSide )
            {
            // InternalDsl.g:549:4: (lv_rightside_10_0= ruleRightSide )
            // InternalDsl.g:550:5: lv_rightside_10_0= ruleRightSide
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getRightsideRightSideParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_16);
            lv_rightside_10_0=ruleRightSide();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"rightside",
            						lv_rightside_10_0,
            						"ime.xtext.radioDsl.Dsl.RightSide");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleSimpleExp"
    // InternalDsl.g:575:1: entryRuleSimpleExp returns [EObject current=null] : iv_ruleSimpleExp= ruleSimpleExp EOF ;
    public final EObject entryRuleSimpleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExp = null;


        try {
            // InternalDsl.g:575:50: (iv_ruleSimpleExp= ruleSimpleExp EOF )
            // InternalDsl.g:576:2: iv_ruleSimpleExp= ruleSimpleExp EOF
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
    // InternalDsl.g:582:1: ruleSimpleExp returns [EObject current=null] : ( ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '(' ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) ) otherlv_5= ')' ) | ( ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) ) otherlv_7= '(' ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) ) otherlv_11= ')' ) | ( ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) ) otherlv_13= '(' ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) ) otherlv_17= ')' ) | ( ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) ) otherlv_19= '(' ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) ) otherlv_22= ')' ) ) ;
    public final EObject ruleSimpleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Enumerator lv_PrecedingLogicOp_0_0 = null;

        EObject lv_operand_2_0 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_operand_4_0 = null;

        Enumerator lv_PrecedingLogicOp_6_0 = null;

        EObject lv_operand_8_0 = null;

        EObject lv_operator_9_0 = null;

        EObject lv_operand_10_0 = null;

        Enumerator lv_PrecedingLogicOp_12_0 = null;

        EObject lv_operand_14_0 = null;

        EObject lv_operator_15_0 = null;

        EObject lv_operand_16_0 = null;

        Enumerator lv_PrecedingLogicOp_18_0 = null;

        EObject lv_operator_20_0 = null;

        EObject lv_operand_21_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:588:2: ( ( ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '(' ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) ) otherlv_5= ')' ) | ( ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) ) otherlv_7= '(' ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) ) otherlv_11= ')' ) | ( ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) ) otherlv_13= '(' ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) ) otherlv_17= ')' ) | ( ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) ) otherlv_19= '(' ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) ) otherlv_22= ')' ) ) )
            // InternalDsl.g:589:2: ( ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '(' ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) ) otherlv_5= ')' ) | ( ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) ) otherlv_7= '(' ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) ) otherlv_11= ')' ) | ( ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) ) otherlv_13= '(' ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) ) otherlv_17= ')' ) | ( ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) ) otherlv_19= '(' ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) ) otherlv_22= ')' ) )
            {
            // InternalDsl.g:589:2: ( ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '(' ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) ) otherlv_5= ')' ) | ( ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) ) otherlv_7= '(' ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) ) otherlv_11= ')' ) | ( ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) ) otherlv_13= '(' ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) ) otherlv_17= ')' ) | ( ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) ) otherlv_19= '(' ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) ) otherlv_22= ')' ) )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:590:3: ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '(' ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) ) otherlv_5= ')' )
                    {
                    // InternalDsl.g:590:3: ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '(' ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) ) otherlv_5= ')' )
                    // InternalDsl.g:591:4: ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '(' ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) ) otherlv_5= ')'
                    {
                    // InternalDsl.g:591:4: ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) )
                    // InternalDsl.g:592:5: (lv_PrecedingLogicOp_0_0= ruleLogicOp )
                    {
                    // InternalDsl.g:592:5: (lv_PrecedingLogicOp_0_0= ruleLogicOp )
                    // InternalDsl.g:593:6: lv_PrecedingLogicOp_0_0= ruleLogicOp
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpAccess().getPrecedingLogicOpLogicOpEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_PrecedingLogicOp_0_0=ruleLogicOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    						}
                    						set(
                    							current,
                    							"PrecedingLogicOp",
                    							lv_PrecedingLogicOp_0_0,
                    							"ime.xtext.radioDsl.Dsl.LogicOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleExpAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalDsl.g:614:4: ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) )
                    // InternalDsl.g:615:5: ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) )
                    {
                    // InternalDsl.g:615:5: ( (lv_operand_2_0= ruleOperandNum ) )
                    // InternalDsl.g:616:6: (lv_operand_2_0= ruleOperandNum )
                    {
                    // InternalDsl.g:616:6: (lv_operand_2_0= ruleOperandNum )
                    // InternalDsl.g:617:7: lv_operand_2_0= ruleOperandNum
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandNumParserRuleCall_0_2_0_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_operand_2_0=ruleOperandNum();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							add(
                    								current,
                    								"operand",
                    								lv_operand_2_0,
                    								"ime.xtext.radioDsl.Dsl.OperandNum");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDsl.g:634:5: ( (lv_operator_3_0= ruleOperatorNum ) )
                    // InternalDsl.g:635:6: (lv_operator_3_0= ruleOperatorNum )
                    {
                    // InternalDsl.g:635:6: (lv_operator_3_0= ruleOperatorNum )
                    // InternalDsl.g:636:7: lv_operator_3_0= ruleOperatorNum
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperatorOperatorNumParserRuleCall_0_2_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_operator_3_0=ruleOperatorNum();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_3_0,
                    								"ime.xtext.radioDsl.Dsl.OperatorNum");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDsl.g:653:5: ( (lv_operand_4_0= ruleOperandNum ) )
                    // InternalDsl.g:654:6: (lv_operand_4_0= ruleOperandNum )
                    {
                    // InternalDsl.g:654:6: (lv_operand_4_0= ruleOperandNum )
                    // InternalDsl.g:655:7: lv_operand_4_0= ruleOperandNum
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandNumParserRuleCall_0_2_2_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_operand_4_0=ruleOperandNum();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							add(
                    								current,
                    								"operand",
                    								lv_operand_4_0,
                    								"ime.xtext.radioDsl.Dsl.OperandNum");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimpleExpAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:679:3: ( ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) ) otherlv_7= '(' ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) ) otherlv_11= ')' )
                    {
                    // InternalDsl.g:679:3: ( ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) ) otherlv_7= '(' ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) ) otherlv_11= ')' )
                    // InternalDsl.g:680:4: ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) ) otherlv_7= '(' ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) ) otherlv_11= ')'
                    {
                    // InternalDsl.g:680:4: ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) )
                    // InternalDsl.g:681:5: (lv_PrecedingLogicOp_6_0= ruleLogicOp )
                    {
                    // InternalDsl.g:681:5: (lv_PrecedingLogicOp_6_0= ruleLogicOp )
                    // InternalDsl.g:682:6: lv_PrecedingLogicOp_6_0= ruleLogicOp
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpAccess().getPrecedingLogicOpLogicOpEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_PrecedingLogicOp_6_0=ruleLogicOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    						}
                    						set(
                    							current,
                    							"PrecedingLogicOp",
                    							lv_PrecedingLogicOp_6_0,
                    							"ime.xtext.radioDsl.Dsl.LogicOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getSimpleExpAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalDsl.g:703:4: ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) )
                    // InternalDsl.g:704:5: ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) )
                    {
                    // InternalDsl.g:704:5: ( (lv_operand_8_0= ruleOperandString ) )
                    // InternalDsl.g:705:6: (lv_operand_8_0= ruleOperandString )
                    {
                    // InternalDsl.g:705:6: (lv_operand_8_0= ruleOperandString )
                    // InternalDsl.g:706:7: lv_operand_8_0= ruleOperandString
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandStringParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_operand_8_0=ruleOperandString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							add(
                    								current,
                    								"operand",
                    								lv_operand_8_0,
                    								"ime.xtext.radioDsl.Dsl.OperandString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDsl.g:723:5: ( (lv_operator_9_0= ruleOperatorString ) )
                    // InternalDsl.g:724:6: (lv_operator_9_0= ruleOperatorString )
                    {
                    // InternalDsl.g:724:6: (lv_operator_9_0= ruleOperatorString )
                    // InternalDsl.g:725:7: lv_operator_9_0= ruleOperatorString
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperatorOperatorStringParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_operator_9_0=ruleOperatorString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_9_0,
                    								"ime.xtext.radioDsl.Dsl.OperatorString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDsl.g:742:5: ( (lv_operand_10_0= ruleOperandString ) )
                    // InternalDsl.g:743:6: (lv_operand_10_0= ruleOperandString )
                    {
                    // InternalDsl.g:743:6: (lv_operand_10_0= ruleOperandString )
                    // InternalDsl.g:744:7: lv_operand_10_0= ruleOperandString
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandStringParserRuleCall_1_2_2_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_operand_10_0=ruleOperandString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							add(
                    								current,
                    								"operand",
                    								lv_operand_10_0,
                    								"ime.xtext.radioDsl.Dsl.OperandString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getSimpleExpAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:768:3: ( ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) ) otherlv_13= '(' ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) ) otherlv_17= ')' )
                    {
                    // InternalDsl.g:768:3: ( ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) ) otherlv_13= '(' ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) ) otherlv_17= ')' )
                    // InternalDsl.g:769:4: ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) ) otherlv_13= '(' ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) ) otherlv_17= ')'
                    {
                    // InternalDsl.g:769:4: ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) )
                    // InternalDsl.g:770:5: (lv_PrecedingLogicOp_12_0= ruleLogicOp )
                    {
                    // InternalDsl.g:770:5: (lv_PrecedingLogicOp_12_0= ruleLogicOp )
                    // InternalDsl.g:771:6: lv_PrecedingLogicOp_12_0= ruleLogicOp
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpAccess().getPrecedingLogicOpLogicOpEnumRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_PrecedingLogicOp_12_0=ruleLogicOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    						}
                    						set(
                    							current,
                    							"PrecedingLogicOp",
                    							lv_PrecedingLogicOp_12_0,
                    							"ime.xtext.radioDsl.Dsl.LogicOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getSimpleExpAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalDsl.g:792:4: ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) )
                    // InternalDsl.g:793:5: ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) )
                    {
                    // InternalDsl.g:793:5: ( (lv_operand_14_0= ruleOperandBool ) )
                    // InternalDsl.g:794:6: (lv_operand_14_0= ruleOperandBool )
                    {
                    // InternalDsl.g:794:6: (lv_operand_14_0= ruleOperandBool )
                    // InternalDsl.g:795:7: lv_operand_14_0= ruleOperandBool
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandBoolParserRuleCall_2_2_0_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_operand_14_0=ruleOperandBool();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							add(
                    								current,
                    								"operand",
                    								lv_operand_14_0,
                    								"ime.xtext.radioDsl.Dsl.OperandBool");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDsl.g:812:5: ( (lv_operator_15_0= ruleOperatorString ) )
                    // InternalDsl.g:813:6: (lv_operator_15_0= ruleOperatorString )
                    {
                    // InternalDsl.g:813:6: (lv_operator_15_0= ruleOperatorString )
                    // InternalDsl.g:814:7: lv_operator_15_0= ruleOperatorString
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperatorOperatorStringParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_operator_15_0=ruleOperatorString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_15_0,
                    								"ime.xtext.radioDsl.Dsl.OperatorString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDsl.g:831:5: ( (lv_operand_16_0= ruleOperandBool ) )
                    // InternalDsl.g:832:6: (lv_operand_16_0= ruleOperandBool )
                    {
                    // InternalDsl.g:832:6: (lv_operand_16_0= ruleOperandBool )
                    // InternalDsl.g:833:7: lv_operand_16_0= ruleOperandBool
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandBoolParserRuleCall_2_2_2_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_operand_16_0=ruleOperandBool();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							add(
                    								current,
                    								"operand",
                    								lv_operand_16_0,
                    								"ime.xtext.radioDsl.Dsl.OperandBool");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getSimpleExpAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:857:3: ( ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) ) otherlv_19= '(' ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) ) otherlv_22= ')' )
                    {
                    // InternalDsl.g:857:3: ( ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) ) otherlv_19= '(' ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) ) otherlv_22= ')' )
                    // InternalDsl.g:858:4: ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) ) otherlv_19= '(' ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) ) otherlv_22= ')'
                    {
                    // InternalDsl.g:858:4: ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) )
                    // InternalDsl.g:859:5: (lv_PrecedingLogicOp_18_0= ruleLogicOp )
                    {
                    // InternalDsl.g:859:5: (lv_PrecedingLogicOp_18_0= ruleLogicOp )
                    // InternalDsl.g:860:6: lv_PrecedingLogicOp_18_0= ruleLogicOp
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpAccess().getPrecedingLogicOpLogicOpEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_PrecedingLogicOp_18_0=ruleLogicOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    						}
                    						set(
                    							current,
                    							"PrecedingLogicOp",
                    							lv_PrecedingLogicOp_18_0,
                    							"ime.xtext.radioDsl.Dsl.LogicOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,20,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getSimpleExpAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDsl.g:881:4: ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) )
                    // InternalDsl.g:882:5: ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) )
                    {
                    // InternalDsl.g:882:5: ( (lv_operator_20_0= ruleOperatorBoolBefore ) )
                    // InternalDsl.g:883:6: (lv_operator_20_0= ruleOperatorBoolBefore )
                    {
                    // InternalDsl.g:883:6: (lv_operator_20_0= ruleOperatorBoolBefore )
                    // InternalDsl.g:884:7: lv_operator_20_0= ruleOperatorBoolBefore
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperatorOperatorBoolBeforeParserRuleCall_3_2_0_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_operator_20_0=ruleOperatorBoolBefore();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_20_0,
                    								"ime.xtext.radioDsl.Dsl.OperatorBoolBefore");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDsl.g:901:5: ( (lv_operand_21_0= ruleOperandBool ) )
                    // InternalDsl.g:902:6: (lv_operand_21_0= ruleOperandBool )
                    {
                    // InternalDsl.g:902:6: (lv_operand_21_0= ruleOperandBool )
                    // InternalDsl.g:903:7: lv_operand_21_0= ruleOperandBool
                    {

                    							newCompositeNode(grammarAccess.getSimpleExpAccess().getOperandOperandBoolParserRuleCall_3_2_1_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_operand_21_0=ruleOperandBool();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleExpRule());
                    							}
                    							add(
                    								current,
                    								"operand",
                    								lv_operand_21_0,
                    								"ime.xtext.radioDsl.Dsl.OperandBool");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_22=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getSimpleExpAccess().getRightParenthesisKeyword_3_3());
                    			

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
    // $ANTLR end "ruleSimpleExp"


    // $ANTLR start "entryRuleCompoundExp"
    // InternalDsl.g:930:1: entryRuleCompoundExp returns [EObject current=null] : iv_ruleCompoundExp= ruleCompoundExp EOF ;
    public final EObject entryRuleCompoundExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundExp = null;


        try {
            // InternalDsl.g:930:52: (iv_ruleCompoundExp= ruleCompoundExp EOF )
            // InternalDsl.g:931:2: iv_ruleCompoundExp= ruleCompoundExp EOF
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
    // InternalDsl.g:937:1: ruleCompoundExp returns [EObject current=null] : ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '[' ( (lv_expression_2_0= ruleExpression ) ) ( (lv_expression_3_0= ruleExpression ) )* otherlv_4= ']' ) ;
    public final EObject ruleCompoundExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_PrecedingLogicOp_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:943:2: ( ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '[' ( (lv_expression_2_0= ruleExpression ) ) ( (lv_expression_3_0= ruleExpression ) )* otherlv_4= ']' ) )
            // InternalDsl.g:944:2: ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '[' ( (lv_expression_2_0= ruleExpression ) ) ( (lv_expression_3_0= ruleExpression ) )* otherlv_4= ']' )
            {
            // InternalDsl.g:944:2: ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '[' ( (lv_expression_2_0= ruleExpression ) ) ( (lv_expression_3_0= ruleExpression ) )* otherlv_4= ']' )
            // InternalDsl.g:945:3: ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '[' ( (lv_expression_2_0= ruleExpression ) ) ( (lv_expression_3_0= ruleExpression ) )* otherlv_4= ']'
            {
            // InternalDsl.g:945:3: ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) )
            // InternalDsl.g:946:4: (lv_PrecedingLogicOp_0_0= ruleLogicOp )
            {
            // InternalDsl.g:946:4: (lv_PrecedingLogicOp_0_0= ruleLogicOp )
            // InternalDsl.g:947:5: lv_PrecedingLogicOp_0_0= ruleLogicOp
            {

            					newCompositeNode(grammarAccess.getCompoundExpAccess().getPrecedingLogicOpLogicOpEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_PrecedingLogicOp_0_0=ruleLogicOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundExpRule());
            					}
            					set(
            						current,
            						"PrecedingLogicOp",
            						lv_PrecedingLogicOp_0_0,
            						"ime.xtext.radioDsl.Dsl.LogicOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundExpAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDsl.g:968:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalDsl.g:969:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalDsl.g:969:4: (lv_expression_2_0= ruleExpression )
            // InternalDsl.g:970:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCompoundExpAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundExpRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"ime.xtext.radioDsl.Dsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:987:3: ( (lv_expression_3_0= ruleExpression ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=30 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:988:4: (lv_expression_3_0= ruleExpression )
            	    {
            	    // InternalDsl.g:988:4: (lv_expression_3_0= ruleExpression )
            	    // InternalDsl.g:989:5: lv_expression_3_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getCompoundExpAccess().getExpressionExpressionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_expression_3_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompoundExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expression",
            	    						lv_expression_3_0,
            	    						"ime.xtext.radioDsl.Dsl.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCompoundExpAccess().getRightSquareBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleLogic"
    // InternalDsl.g:1014:1: entryRuleLogic returns [EObject current=null] : iv_ruleLogic= ruleLogic EOF ;
    public final EObject entryRuleLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogic = null;


        try {
            // InternalDsl.g:1014:46: (iv_ruleLogic= ruleLogic EOF )
            // InternalDsl.g:1015:2: iv_ruleLogic= ruleLogic EOF
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
    // InternalDsl.g:1021:1: ruleLogic returns [EObject current=null] : ( (lv_Operation_0_0= ruleLogicOp ) ) ;
    public final EObject ruleLogic() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Operation_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1027:2: ( ( (lv_Operation_0_0= ruleLogicOp ) ) )
            // InternalDsl.g:1028:2: ( (lv_Operation_0_0= ruleLogicOp ) )
            {
            // InternalDsl.g:1028:2: ( (lv_Operation_0_0= ruleLogicOp ) )
            // InternalDsl.g:1029:3: (lv_Operation_0_0= ruleLogicOp )
            {
            // InternalDsl.g:1029:3: (lv_Operation_0_0= ruleLogicOp )
            // InternalDsl.g:1030:4: lv_Operation_0_0= ruleLogicOp
            {

            				newCompositeNode(grammarAccess.getLogicAccess().getOperationLogicOpEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_Operation_0_0=ruleLogicOp();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLogicRule());
            				}
            				set(
            					current,
            					"Operation",
            					lv_Operation_0_0,
            					"ime.xtext.radioDsl.Dsl.LogicOp");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleLogic"


    // $ANTLR start "entryRuleLogicMiddle"
    // InternalDsl.g:1050:1: entryRuleLogicMiddle returns [EObject current=null] : iv_ruleLogicMiddle= ruleLogicMiddle EOF ;
    public final EObject entryRuleLogicMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicMiddle = null;


        try {
            // InternalDsl.g:1050:52: (iv_ruleLogicMiddle= ruleLogicMiddle EOF )
            // InternalDsl.g:1051:2: iv_ruleLogicMiddle= ruleLogicMiddle EOF
            {
             newCompositeNode(grammarAccess.getLogicMiddleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicMiddle=ruleLogicMiddle();

            state._fsp--;

             current =iv_ruleLogicMiddle; 
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
    // $ANTLR end "entryRuleLogicMiddle"


    // $ANTLR start "ruleLogicMiddle"
    // InternalDsl.g:1057:1: ruleLogicMiddle returns [EObject current=null] : ( (lv_Operation_0_0= ruleLogicOpMiddle ) ) ;
    public final EObject ruleLogicMiddle() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Operation_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1063:2: ( ( (lv_Operation_0_0= ruleLogicOpMiddle ) ) )
            // InternalDsl.g:1064:2: ( (lv_Operation_0_0= ruleLogicOpMiddle ) )
            {
            // InternalDsl.g:1064:2: ( (lv_Operation_0_0= ruleLogicOpMiddle ) )
            // InternalDsl.g:1065:3: (lv_Operation_0_0= ruleLogicOpMiddle )
            {
            // InternalDsl.g:1065:3: (lv_Operation_0_0= ruleLogicOpMiddle )
            // InternalDsl.g:1066:4: lv_Operation_0_0= ruleLogicOpMiddle
            {

            				newCompositeNode(grammarAccess.getLogicMiddleAccess().getOperationLogicOpMiddleEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_Operation_0_0=ruleLogicOpMiddle();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLogicMiddleRule());
            				}
            				set(
            					current,
            					"Operation",
            					lv_Operation_0_0,
            					"ime.xtext.radioDsl.Dsl.LogicOpMiddle");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleLogicMiddle"


    // $ANTLR start "entryRuleLogicBefore"
    // InternalDsl.g:1086:1: entryRuleLogicBefore returns [EObject current=null] : iv_ruleLogicBefore= ruleLogicBefore EOF ;
    public final EObject entryRuleLogicBefore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicBefore = null;


        try {
            // InternalDsl.g:1086:52: (iv_ruleLogicBefore= ruleLogicBefore EOF )
            // InternalDsl.g:1087:2: iv_ruleLogicBefore= ruleLogicBefore EOF
            {
             newCompositeNode(grammarAccess.getLogicBeforeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicBefore=ruleLogicBefore();

            state._fsp--;

             current =iv_ruleLogicBefore; 
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
    // $ANTLR end "entryRuleLogicBefore"


    // $ANTLR start "ruleLogicBefore"
    // InternalDsl.g:1093:1: ruleLogicBefore returns [EObject current=null] : ( (lv_Operation_0_0= ruleLogicOpBefore ) ) ;
    public final EObject ruleLogicBefore() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Operation_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1099:2: ( ( (lv_Operation_0_0= ruleLogicOpBefore ) ) )
            // InternalDsl.g:1100:2: ( (lv_Operation_0_0= ruleLogicOpBefore ) )
            {
            // InternalDsl.g:1100:2: ( (lv_Operation_0_0= ruleLogicOpBefore ) )
            // InternalDsl.g:1101:3: (lv_Operation_0_0= ruleLogicOpBefore )
            {
            // InternalDsl.g:1101:3: (lv_Operation_0_0= ruleLogicOpBefore )
            // InternalDsl.g:1102:4: lv_Operation_0_0= ruleLogicOpBefore
            {

            				newCompositeNode(grammarAccess.getLogicBeforeAccess().getOperationLogicOpBeforeEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_Operation_0_0=ruleLogicOpBefore();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLogicBeforeRule());
            				}
            				set(
            					current,
            					"Operation",
            					lv_Operation_0_0,
            					"ime.xtext.radioDsl.Dsl.LogicOpBefore");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleLogicBefore"


    // $ANTLR start "entryRuleComparator"
    // InternalDsl.g:1122:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalDsl.g:1122:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalDsl.g:1123:2: iv_ruleComparator= ruleComparator EOF
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
    // InternalDsl.g:1129:1: ruleComparator returns [EObject current=null] : ( (lv_Operation_0_0= ruleCompOp ) ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Operation_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1135:2: ( ( (lv_Operation_0_0= ruleCompOp ) ) )
            // InternalDsl.g:1136:2: ( (lv_Operation_0_0= ruleCompOp ) )
            {
            // InternalDsl.g:1136:2: ( (lv_Operation_0_0= ruleCompOp ) )
            // InternalDsl.g:1137:3: (lv_Operation_0_0= ruleCompOp )
            {
            // InternalDsl.g:1137:3: (lv_Operation_0_0= ruleCompOp )
            // InternalDsl.g:1138:4: lv_Operation_0_0= ruleCompOp
            {

            				newCompositeNode(grammarAccess.getComparatorAccess().getOperationCompOpEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_Operation_0_0=ruleCompOp();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getComparatorRule());
            				}
            				set(
            					current,
            					"Operation",
            					lv_Operation_0_0,
            					"ime.xtext.radioDsl.Dsl.CompOp");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleComparatorString"
    // InternalDsl.g:1158:1: entryRuleComparatorString returns [EObject current=null] : iv_ruleComparatorString= ruleComparatorString EOF ;
    public final EObject entryRuleComparatorString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparatorString = null;


        try {
            // InternalDsl.g:1158:57: (iv_ruleComparatorString= ruleComparatorString EOF )
            // InternalDsl.g:1159:2: iv_ruleComparatorString= ruleComparatorString EOF
            {
             newCompositeNode(grammarAccess.getComparatorStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparatorString=ruleComparatorString();

            state._fsp--;

             current =iv_ruleComparatorString; 
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
    // $ANTLR end "entryRuleComparatorString"


    // $ANTLR start "ruleComparatorString"
    // InternalDsl.g:1165:1: ruleComparatorString returns [EObject current=null] : ( (lv_Operation_0_0= ruleCompOpString ) ) ;
    public final EObject ruleComparatorString() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Operation_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1171:2: ( ( (lv_Operation_0_0= ruleCompOpString ) ) )
            // InternalDsl.g:1172:2: ( (lv_Operation_0_0= ruleCompOpString ) )
            {
            // InternalDsl.g:1172:2: ( (lv_Operation_0_0= ruleCompOpString ) )
            // InternalDsl.g:1173:3: (lv_Operation_0_0= ruleCompOpString )
            {
            // InternalDsl.g:1173:3: (lv_Operation_0_0= ruleCompOpString )
            // InternalDsl.g:1174:4: lv_Operation_0_0= ruleCompOpString
            {

            				newCompositeNode(grammarAccess.getComparatorStringAccess().getOperationCompOpStringEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_Operation_0_0=ruleCompOpString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getComparatorStringRule());
            				}
            				set(
            					current,
            					"Operation",
            					lv_Operation_0_0,
            					"ime.xtext.radioDsl.Dsl.CompOpString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleComparatorString"


    // $ANTLR start "entryRuleComparatorBool"
    // InternalDsl.g:1194:1: entryRuleComparatorBool returns [EObject current=null] : iv_ruleComparatorBool= ruleComparatorBool EOF ;
    public final EObject entryRuleComparatorBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparatorBool = null;


        try {
            // InternalDsl.g:1194:55: (iv_ruleComparatorBool= ruleComparatorBool EOF )
            // InternalDsl.g:1195:2: iv_ruleComparatorBool= ruleComparatorBool EOF
            {
             newCompositeNode(grammarAccess.getComparatorBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparatorBool=ruleComparatorBool();

            state._fsp--;

             current =iv_ruleComparatorBool; 
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
    // $ANTLR end "entryRuleComparatorBool"


    // $ANTLR start "ruleComparatorBool"
    // InternalDsl.g:1201:1: ruleComparatorBool returns [EObject current=null] : ( (lv_Operation_0_0= ruleCompOpBool ) ) ;
    public final EObject ruleComparatorBool() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Operation_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1207:2: ( ( (lv_Operation_0_0= ruleCompOpBool ) ) )
            // InternalDsl.g:1208:2: ( (lv_Operation_0_0= ruleCompOpBool ) )
            {
            // InternalDsl.g:1208:2: ( (lv_Operation_0_0= ruleCompOpBool ) )
            // InternalDsl.g:1209:3: (lv_Operation_0_0= ruleCompOpBool )
            {
            // InternalDsl.g:1209:3: (lv_Operation_0_0= ruleCompOpBool )
            // InternalDsl.g:1210:4: lv_Operation_0_0= ruleCompOpBool
            {

            				newCompositeNode(grammarAccess.getComparatorBoolAccess().getOperationCompOpBoolEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_Operation_0_0=ruleCompOpBool();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getComparatorBoolRule());
            				}
            				set(
            					current,
            					"Operation",
            					lv_Operation_0_0,
            					"ime.xtext.radioDsl.Dsl.CompOpBool");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleComparatorBool"


    // $ANTLR start "entryRuleMath"
    // InternalDsl.g:1230:1: entryRuleMath returns [EObject current=null] : iv_ruleMath= ruleMath EOF ;
    public final EObject entryRuleMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMath = null;


        try {
            // InternalDsl.g:1230:45: (iv_ruleMath= ruleMath EOF )
            // InternalDsl.g:1231:2: iv_ruleMath= ruleMath EOF
            {
             newCompositeNode(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMath=ruleMath();

            state._fsp--;

             current =iv_ruleMath; 
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
    // $ANTLR end "entryRuleMath"


    // $ANTLR start "ruleMath"
    // InternalDsl.g:1237:1: ruleMath returns [EObject current=null] : ( (lv_Operation_0_0= ruleMathOp ) ) ;
    public final EObject ruleMath() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Operation_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1243:2: ( ( (lv_Operation_0_0= ruleMathOp ) ) )
            // InternalDsl.g:1244:2: ( (lv_Operation_0_0= ruleMathOp ) )
            {
            // InternalDsl.g:1244:2: ( (lv_Operation_0_0= ruleMathOp ) )
            // InternalDsl.g:1245:3: (lv_Operation_0_0= ruleMathOp )
            {
            // InternalDsl.g:1245:3: (lv_Operation_0_0= ruleMathOp )
            // InternalDsl.g:1246:4: lv_Operation_0_0= ruleMathOp
            {

            				newCompositeNode(grammarAccess.getMathAccess().getOperationMathOpEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_Operation_0_0=ruleMathOp();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMathRule());
            				}
            				set(
            					current,
            					"Operation",
            					lv_Operation_0_0,
            					"ime.xtext.radioDsl.Dsl.MathOp");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleMath"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:1266:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:1266:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:1267:2: iv_ruleEString= ruleEString EOF
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
    // InternalDsl.g:1273:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1279:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:1280:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:1280:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1281:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1289:3: this_ID_1= RULE_ID
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
    // InternalDsl.g:1300:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:1300:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:1301:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDsl.g:1307:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1313:2: (this_INT_0= RULE_INT )
            // InternalDsl.g:1314:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleNum"
    // InternalDsl.g:1324:1: entryRuleNum returns [EObject current=null] : iv_ruleNum= ruleNum EOF ;
    public final EObject entryRuleNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNum = null;


        try {
            // InternalDsl.g:1324:44: (iv_ruleNum= ruleNum EOF )
            // InternalDsl.g:1325:2: iv_ruleNum= ruleNum EOF
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
    // InternalDsl.g:1331:1: ruleNum returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNum() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1337:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalDsl.g:1338:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalDsl.g:1338:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalDsl.g:1339:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalDsl.g:1339:3: (lv_value_0_0= ruleEDouble )
            // InternalDsl.g:1340:4: lv_value_0_0= ruleEDouble
            {

            				newCompositeNode(grammarAccess.getNumAccess().getValueEDoubleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEDouble();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"ime.xtext.radioDsl.Dsl.EDouble");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleStrings"
    // InternalDsl.g:1360:1: entryRuleStrings returns [EObject current=null] : iv_ruleStrings= ruleStrings EOF ;
    public final EObject entryRuleStrings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrings = null;


        try {
            // InternalDsl.g:1360:48: (iv_ruleStrings= ruleStrings EOF )
            // InternalDsl.g:1361:2: iv_ruleStrings= ruleStrings EOF
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
    // InternalDsl.g:1367:1: ruleStrings returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStrings() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1373:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDsl.g:1374:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDsl.g:1374:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDsl.g:1375:3: (lv_value_0_0= ruleEString )
            {
            // InternalDsl.g:1375:3: (lv_value_0_0= ruleEString )
            // InternalDsl.g:1376:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringsAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringsRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"ime.xtext.radioDsl.Dsl.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleStrings"


    // $ANTLR start "entryRuleBool"
    // InternalDsl.g:1396:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalDsl.g:1396:45: (iv_ruleBool= ruleBool EOF )
            // InternalDsl.g:1397:2: iv_ruleBool= ruleBool EOF
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
    // InternalDsl.g:1403:1: ruleBool returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1409:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalDsl.g:1410:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalDsl.g:1410:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalDsl.g:1411:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalDsl.g:1411:3: (lv_value_0_0= ruleEBoolean )
            // InternalDsl.g:1412:4: lv_value_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getBoolAccess().getValueEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoolRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"ime.xtext.radioDsl.Dsl.EBoolean");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleBoolAttributes"
    // InternalDsl.g:1432:1: entryRuleBoolAttributes returns [EObject current=null] : iv_ruleBoolAttributes= ruleBoolAttributes EOF ;
    public final EObject entryRuleBoolAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolAttributes = null;


        try {
            // InternalDsl.g:1432:55: (iv_ruleBoolAttributes= ruleBoolAttributes EOF )
            // InternalDsl.g:1433:2: iv_ruleBoolAttributes= ruleBoolAttributes EOF
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
    // InternalDsl.g:1439:1: ruleBoolAttributes returns [EObject current=null] : ( (lv_boolAttr_0_0= ruleBoolAttr ) ) ;
    public final EObject ruleBoolAttributes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_boolAttr_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1445:2: ( ( (lv_boolAttr_0_0= ruleBoolAttr ) ) )
            // InternalDsl.g:1446:2: ( (lv_boolAttr_0_0= ruleBoolAttr ) )
            {
            // InternalDsl.g:1446:2: ( (lv_boolAttr_0_0= ruleBoolAttr ) )
            // InternalDsl.g:1447:3: (lv_boolAttr_0_0= ruleBoolAttr )
            {
            // InternalDsl.g:1447:3: (lv_boolAttr_0_0= ruleBoolAttr )
            // InternalDsl.g:1448:4: lv_boolAttr_0_0= ruleBoolAttr
            {

            				newCompositeNode(grammarAccess.getBoolAttributesAccess().getBoolAttrBoolAttrEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_boolAttr_0_0=ruleBoolAttr();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoolAttributesRule());
            				}
            				set(
            					current,
            					"boolAttr",
            					lv_boolAttr_0_0,
            					"ime.xtext.radioDsl.Dsl.BoolAttr");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBoolAttributes"


    // $ANTLR start "entryRuleStringAttributes"
    // InternalDsl.g:1468:1: entryRuleStringAttributes returns [EObject current=null] : iv_ruleStringAttributes= ruleStringAttributes EOF ;
    public final EObject entryRuleStringAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributes = null;


        try {
            // InternalDsl.g:1468:57: (iv_ruleStringAttributes= ruleStringAttributes EOF )
            // InternalDsl.g:1469:2: iv_ruleStringAttributes= ruleStringAttributes EOF
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
    // InternalDsl.g:1475:1: ruleStringAttributes returns [EObject current=null] : ( (lv_stringAttr_0_0= ruleStringAttr ) ) ;
    public final EObject ruleStringAttributes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_stringAttr_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1481:2: ( ( (lv_stringAttr_0_0= ruleStringAttr ) ) )
            // InternalDsl.g:1482:2: ( (lv_stringAttr_0_0= ruleStringAttr ) )
            {
            // InternalDsl.g:1482:2: ( (lv_stringAttr_0_0= ruleStringAttr ) )
            // InternalDsl.g:1483:3: (lv_stringAttr_0_0= ruleStringAttr )
            {
            // InternalDsl.g:1483:3: (lv_stringAttr_0_0= ruleStringAttr )
            // InternalDsl.g:1484:4: lv_stringAttr_0_0= ruleStringAttr
            {

            				newCompositeNode(grammarAccess.getStringAttributesAccess().getStringAttrStringAttrEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_stringAttr_0_0=ruleStringAttr();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringAttributesRule());
            				}
            				set(
            					current,
            					"stringAttr",
            					lv_stringAttr_0_0,
            					"ime.xtext.radioDsl.Dsl.StringAttr");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleStringAttributes"


    // $ANTLR start "entryRuleNumAttributes"
    // InternalDsl.g:1504:1: entryRuleNumAttributes returns [EObject current=null] : iv_ruleNumAttributes= ruleNumAttributes EOF ;
    public final EObject entryRuleNumAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAttributes = null;


        try {
            // InternalDsl.g:1504:54: (iv_ruleNumAttributes= ruleNumAttributes EOF )
            // InternalDsl.g:1505:2: iv_ruleNumAttributes= ruleNumAttributes EOF
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
    // InternalDsl.g:1511:1: ruleNumAttributes returns [EObject current=null] : ( (lv_numAttr_0_0= ruleNumAttr ) ) ;
    public final EObject ruleNumAttributes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_numAttr_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1517:2: ( ( (lv_numAttr_0_0= ruleNumAttr ) ) )
            // InternalDsl.g:1518:2: ( (lv_numAttr_0_0= ruleNumAttr ) )
            {
            // InternalDsl.g:1518:2: ( (lv_numAttr_0_0= ruleNumAttr ) )
            // InternalDsl.g:1519:3: (lv_numAttr_0_0= ruleNumAttr )
            {
            // InternalDsl.g:1519:3: (lv_numAttr_0_0= ruleNumAttr )
            // InternalDsl.g:1520:4: lv_numAttr_0_0= ruleNumAttr
            {

            				newCompositeNode(grammarAccess.getNumAttributesAccess().getNumAttrNumAttrEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_numAttr_0_0=ruleNumAttr();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumAttributesRule());
            				}
            				set(
            					current,
            					"numAttr",
            					lv_numAttr_0_0,
            					"ime.xtext.radioDsl.Dsl.NumAttr");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleNumAttributes"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:1540:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:1540:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:1541:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalDsl.g:1547:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:1553:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:1554:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:1554:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:1555:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:1555:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1556:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1562:3: (this_INT_1= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1563:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_29); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_31); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:1583:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=26 && LA20_0<=27)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1584:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:1584:4: (kw= 'E' | kw= 'e' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==26) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==27) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDsl.g:1585:5: kw= 'E'
                            {
                            kw=(Token)match(input,26,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:1591:5: kw= 'e'
                            {
                            kw=(Token)match(input,27,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:1597:4: (kw= '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==24) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDsl.g:1598:5: kw= '-'
                            {
                            kw=(Token)match(input,24,FOLLOW_30); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalDsl.g:1616:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDsl.g:1616:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDsl.g:1617:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalDsl.g:1623:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1629:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDsl.g:1630:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDsl.g:1630:2: (kw= 'true' | kw= 'false' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1631:3: kw= 'true'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1637:3: kw= 'false'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleActionRadio"
    // InternalDsl.g:1646:1: entryRuleActionRadio returns [EObject current=null] : iv_ruleActionRadio= ruleActionRadio EOF ;
    public final EObject entryRuleActionRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionRadio = null;


        try {
            // InternalDsl.g:1646:52: (iv_ruleActionRadio= ruleActionRadio EOF )
            // InternalDsl.g:1647:2: iv_ruleActionRadio= ruleActionRadio EOF
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
    // InternalDsl.g:1653:1: ruleActionRadio returns [EObject current=null] : ( (lv_newState_0_0= ruleRadioModes ) ) ;
    public final EObject ruleActionRadio() throws RecognitionException {
        EObject current = null;

        Enumerator lv_newState_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1659:2: ( ( (lv_newState_0_0= ruleRadioModes ) ) )
            // InternalDsl.g:1660:2: ( (lv_newState_0_0= ruleRadioModes ) )
            {
            // InternalDsl.g:1660:2: ( (lv_newState_0_0= ruleRadioModes ) )
            // InternalDsl.g:1661:3: (lv_newState_0_0= ruleRadioModes )
            {
            // InternalDsl.g:1661:3: (lv_newState_0_0= ruleRadioModes )
            // InternalDsl.g:1662:4: lv_newState_0_0= ruleRadioModes
            {

            				newCompositeNode(grammarAccess.getActionRadioAccess().getNewStateRadioModesEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_newState_0_0=ruleRadioModes();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getActionRadioRule());
            				}
            				set(
            					current,
            					"newState",
            					lv_newState_0_0,
            					"ime.xtext.radioDsl.Dsl.RadioModes");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleActionRadio"


    // $ANTLR start "ruleLogicOp"
    // InternalDsl.g:1682:1: ruleLogicOp returns [Enumerator current=null] : ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'or' ) | (enumLiteral_3= 'not' ) ) ;
    public final Enumerator ruleLogicOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1688:2: ( ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'or' ) | (enumLiteral_3= 'not' ) ) )
            // InternalDsl.g:1689:2: ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'or' ) | (enumLiteral_3= 'not' ) )
            {
            // InternalDsl.g:1689:2: ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'or' ) | (enumLiteral_3= 'not' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 31:
                {
                alt22=2;
                }
                break;
            case 32:
                {
                alt22=3;
                }
                break;
            case 33:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1690:3: (enumLiteral_0= '_' )
                    {
                    // InternalDsl.g:1690:3: (enumLiteral_0= '_' )
                    // InternalDsl.g:1691:4: enumLiteral_0= '_'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOpAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1698:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDsl.g:1698:3: (enumLiteral_1= 'and' )
                    // InternalDsl.g:1699:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpAccess().getAndEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicOpAccess().getAndEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1706:3: (enumLiteral_2= 'or' )
                    {
                    // InternalDsl.g:1706:3: (enumLiteral_2= 'or' )
                    // InternalDsl.g:1707:4: enumLiteral_2= 'or'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpAccess().getOrEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicOpAccess().getOrEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1714:3: (enumLiteral_3= 'not' )
                    {
                    // InternalDsl.g:1714:3: (enumLiteral_3= 'not' )
                    // InternalDsl.g:1715:4: enumLiteral_3= 'not'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "ruleLogicOpMiddle"
    // InternalDsl.g:1725:1: ruleLogicOpMiddle returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleLogicOpMiddle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1731:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalDsl.g:1732:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalDsl.g:1732:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==32) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1733:3: (enumLiteral_0= 'and' )
                    {
                    // InternalDsl.g:1733:3: (enumLiteral_0= 'and' )
                    // InternalDsl.g:1734:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpMiddleAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOpMiddleAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1741:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDsl.g:1741:3: (enumLiteral_1= 'or' )
                    // InternalDsl.g:1742:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpMiddleAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicOpMiddleAccess().getOrEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLogicOpMiddle"


    // $ANTLR start "ruleLogicOpBefore"
    // InternalDsl.g:1752:1: ruleLogicOpBefore returns [Enumerator current=null] : ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'not' ) ) ;
    public final Enumerator ruleLogicOpBefore() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1758:2: ( ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'not' ) ) )
            // InternalDsl.g:1759:2: ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'not' ) )
            {
            // InternalDsl.g:1759:2: ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'not' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            else if ( (LA24_0==33) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1760:3: (enumLiteral_0= '_' )
                    {
                    // InternalDsl.g:1760:3: (enumLiteral_0= '_' )
                    // InternalDsl.g:1761:4: enumLiteral_0= '_'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpBeforeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOpBeforeAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1768:3: (enumLiteral_1= 'not' )
                    {
                    // InternalDsl.g:1768:3: (enumLiteral_1= 'not' )
                    // InternalDsl.g:1769:4: enumLiteral_1= 'not'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpBeforeAccess().getNotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicOpBeforeAccess().getNotEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLogicOpBefore"


    // $ANTLR start "ruleCompOp"
    // InternalDsl.g:1779:1: ruleCompOp returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalDsl.g:1785:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalDsl.g:1786:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalDsl.g:1786:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt25=1;
                }
                break;
            case 35:
                {
                alt25=2;
                }
                break;
            case 36:
                {
                alt25=3;
                }
                break;
            case 37:
                {
                alt25=4;
                }
                break;
            case 17:
                {
                alt25=5;
                }
                break;
            case 38:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1787:3: (enumLiteral_0= '>' )
                    {
                    // InternalDsl.g:1787:3: (enumLiteral_0= '>' )
                    // InternalDsl.g:1788:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getGreaterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOpAccess().getGreaterEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1795:3: (enumLiteral_1= '>=' )
                    {
                    // InternalDsl.g:1795:3: (enumLiteral_1= '>=' )
                    // InternalDsl.g:1796:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getGreater_equalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOpAccess().getGreater_equalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1803:3: (enumLiteral_2= '<' )
                    {
                    // InternalDsl.g:1803:3: (enumLiteral_2= '<' )
                    // InternalDsl.g:1804:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getLessEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOpAccess().getLessEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1811:3: (enumLiteral_3= '<=' )
                    {
                    // InternalDsl.g:1811:3: (enumLiteral_3= '<=' )
                    // InternalDsl.g:1812:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompOpAccess().getLess_equalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1819:3: (enumLiteral_4= '=' )
                    {
                    // InternalDsl.g:1819:3: (enumLiteral_4= '=' )
                    // InternalDsl.g:1820:4: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getCompOpAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCompOpAccess().getEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1827:3: (enumLiteral_5= '!=' )
                    {
                    // InternalDsl.g:1827:3: (enumLiteral_5= '!=' )
                    // InternalDsl.g:1828:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "ruleCompOpString"
    // InternalDsl.g:1838:1: ruleCompOpString returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleCompOpString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1844:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) )
            // InternalDsl.g:1845:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalDsl.g:1845:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            else if ( (LA26_0==38) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1846:3: (enumLiteral_0= '=' )
                    {
                    // InternalDsl.g:1846:3: (enumLiteral_0= '=' )
                    // InternalDsl.g:1847:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getCompOpStringAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOpStringAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1854:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDsl.g:1854:3: (enumLiteral_1= '!=' )
                    // InternalDsl.g:1855:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCompOpStringAccess().getNot_equalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOpStringAccess().getNot_equalEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCompOpString"


    // $ANTLR start "ruleCompOpBool"
    // InternalDsl.g:1865:1: ruleCompOpBool returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleCompOpBool() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1871:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) )
            // InternalDsl.g:1872:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalDsl.g:1872:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            else if ( (LA27_0==38) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1873:3: (enumLiteral_0= '=' )
                    {
                    // InternalDsl.g:1873:3: (enumLiteral_0= '=' )
                    // InternalDsl.g:1874:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getCompOpBoolAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOpBoolAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1881:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDsl.g:1881:3: (enumLiteral_1= '!=' )
                    // InternalDsl.g:1882:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCompOpBoolAccess().getNot_equalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOpBoolAccess().getNot_equalEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCompOpBool"


    // $ANTLR start "ruleMathOp"
    // InternalDsl.g:1892:1: ruleMathOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '/' ) | (enumLiteral_3= '*' ) ) ;
    public final Enumerator ruleMathOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1898:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '/' ) | (enumLiteral_3= '*' ) ) )
            // InternalDsl.g:1899:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '/' ) | (enumLiteral_3= '*' ) )
            {
            // InternalDsl.g:1899:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '/' ) | (enumLiteral_3= '*' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt28=1;
                }
                break;
            case 24:
                {
                alt28=2;
                }
                break;
            case 40:
                {
                alt28=3;
                }
                break;
            case 41:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1900:3: (enumLiteral_0= '+' )
                    {
                    // InternalDsl.g:1900:3: (enumLiteral_0= '+' )
                    // InternalDsl.g:1901:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMathOpAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOpAccess().getPlusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1908:3: (enumLiteral_1= '-' )
                    {
                    // InternalDsl.g:1908:3: (enumLiteral_1= '-' )
                    // InternalDsl.g:1909:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getMathOpAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOpAccess().getMinusEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1916:3: (enumLiteral_2= '/' )
                    {
                    // InternalDsl.g:1916:3: (enumLiteral_2= '/' )
                    // InternalDsl.g:1917:4: enumLiteral_2= '/'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMathOpAccess().getDividedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOpAccess().getDividedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1924:3: (enumLiteral_3= '*' )
                    {
                    // InternalDsl.g:1924:3: (enumLiteral_3= '*' )
                    // InternalDsl.g:1925:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

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
    // InternalDsl.g:1935:1: ruleBoolAttr returns [Enumerator current=null] : ( (enumLiteral_0= 'SNRValues_ASC' ) | (enumLiteral_1= 'SNRValues_DESC' ) ) ;
    public final Enumerator ruleBoolAttr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1941:2: ( ( (enumLiteral_0= 'SNRValues_ASC' ) | (enumLiteral_1= 'SNRValues_DESC' ) ) )
            // InternalDsl.g:1942:2: ( (enumLiteral_0= 'SNRValues_ASC' ) | (enumLiteral_1= 'SNRValues_DESC' ) )
            {
            // InternalDsl.g:1942:2: ( (enumLiteral_0= 'SNRValues_ASC' ) | (enumLiteral_1= 'SNRValues_DESC' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            else if ( (LA29_0==43) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1943:3: (enumLiteral_0= 'SNRValues_ASC' )
                    {
                    // InternalDsl.g:1943:3: (enumLiteral_0= 'SNRValues_ASC' )
                    // InternalDsl.g:1944:4: enumLiteral_0= 'SNRValues_ASC'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getBoolAttrAccess().getSNRValues_ASCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolAttrAccess().getSNRValues_ASCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1951:3: (enumLiteral_1= 'SNRValues_DESC' )
                    {
                    // InternalDsl.g:1951:3: (enumLiteral_1= 'SNRValues_DESC' )
                    // InternalDsl.g:1952:4: enumLiteral_1= 'SNRValues_DESC'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalDsl.g:1962:1: ruleStringAttr returns [Enumerator current=null] : (enumLiteral_0= 'OperationalRole' ) ;
    public final Enumerator ruleStringAttr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1968:2: ( (enumLiteral_0= 'OperationalRole' ) )
            // InternalDsl.g:1969:2: (enumLiteral_0= 'OperationalRole' )
            {
            // InternalDsl.g:1969:2: (enumLiteral_0= 'OperationalRole' )
            // InternalDsl.g:1970:3: enumLiteral_0= 'OperationalRole'
            {
            enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

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
    // InternalDsl.g:1979:1: ruleNumAttr returns [Enumerator current=null] : ( (enumLiteral_0= 'SecurityLevel' ) | (enumLiteral_1= 'CarrierFrequency' ) ) ;
    public final Enumerator ruleNumAttr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1985:2: ( ( (enumLiteral_0= 'SecurityLevel' ) | (enumLiteral_1= 'CarrierFrequency' ) ) )
            // InternalDsl.g:1986:2: ( (enumLiteral_0= 'SecurityLevel' ) | (enumLiteral_1= 'CarrierFrequency' ) )
            {
            // InternalDsl.g:1986:2: ( (enumLiteral_0= 'SecurityLevel' ) | (enumLiteral_1= 'CarrierFrequency' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            else if ( (LA30_0==46) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1987:3: (enumLiteral_0= 'SecurityLevel' )
                    {
                    // InternalDsl.g:1987:3: (enumLiteral_0= 'SecurityLevel' )
                    // InternalDsl.g:1988:4: enumLiteral_0= 'SecurityLevel'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getNumAttrAccess().getSecLevelEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumAttrAccess().getSecLevelEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1995:3: (enumLiteral_1= 'CarrierFrequency' )
                    {
                    // InternalDsl.g:1995:3: (enumLiteral_1= 'CarrierFrequency' )
                    // InternalDsl.g:1996:4: enumLiteral_1= 'CarrierFrequency'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

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
    // InternalDsl.g:2006:1: ruleRadioModes returns [Enumerator current=null] : ( (enumLiteral_0= 'SILENT_MODE' ) | (enumLiteral_1= 'ALERT_MODE' ) | (enumLiteral_2= 'FULLDUPLEX_MODE' ) | (enumLiteral_3= 'NORMAL_MODE' ) | (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' ) ) ;
    public final Enumerator ruleRadioModes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDsl.g:2012:2: ( ( (enumLiteral_0= 'SILENT_MODE' ) | (enumLiteral_1= 'ALERT_MODE' ) | (enumLiteral_2= 'FULLDUPLEX_MODE' ) | (enumLiteral_3= 'NORMAL_MODE' ) | (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' ) ) )
            // InternalDsl.g:2013:2: ( (enumLiteral_0= 'SILENT_MODE' ) | (enumLiteral_1= 'ALERT_MODE' ) | (enumLiteral_2= 'FULLDUPLEX_MODE' ) | (enumLiteral_3= 'NORMAL_MODE' ) | (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' ) )
            {
            // InternalDsl.g:2013:2: ( (enumLiteral_0= 'SILENT_MODE' ) | (enumLiteral_1= 'ALERT_MODE' ) | (enumLiteral_2= 'FULLDUPLEX_MODE' ) | (enumLiteral_3= 'NORMAL_MODE' ) | (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt31=1;
                }
                break;
            case 48:
                {
                alt31=2;
                }
                break;
            case 49:
                {
                alt31=3;
                }
                break;
            case 50:
                {
                alt31=4;
                }
                break;
            case 51:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalDsl.g:2014:3: (enumLiteral_0= 'SILENT_MODE' )
                    {
                    // InternalDsl.g:2014:3: (enumLiteral_0= 'SILENT_MODE' )
                    // InternalDsl.g:2015:4: enumLiteral_0= 'SILENT_MODE'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getSILENT_MODEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRadioModesAccess().getSILENT_MODEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2022:3: (enumLiteral_1= 'ALERT_MODE' )
                    {
                    // InternalDsl.g:2022:3: (enumLiteral_1= 'ALERT_MODE' )
                    // InternalDsl.g:2023:4: enumLiteral_1= 'ALERT_MODE'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getALERT_MODEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRadioModesAccess().getALERT_MODEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2030:3: (enumLiteral_2= 'FULLDUPLEX_MODE' )
                    {
                    // InternalDsl.g:2030:3: (enumLiteral_2= 'FULLDUPLEX_MODE' )
                    // InternalDsl.g:2031:4: enumLiteral_2= 'FULLDUPLEX_MODE'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getFULLDUPLEX_MODEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRadioModesAccess().getFULLDUPLEX_MODEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:2038:3: (enumLiteral_3= 'NORMAL_MODE' )
                    {
                    // InternalDsl.g:2038:3: (enumLiteral_3= 'NORMAL_MODE' )
                    // InternalDsl.g:2039:4: enumLiteral_3= 'NORMAL_MODE'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRadioModesAccess().getNORMAL_MODEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRadioModesAccess().getNORMAL_MODEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:2046:3: (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' )
                    {
                    // InternalDsl.g:2046:3: (enumLiteral_4= 'MAINTAIN_CURRENT_MODE' )
                    // InternalDsl.g:2047:4: enumLiteral_4= 'MAINTAIN_CURRENT_MODE'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\36\4\24\1\4\4\uffff";
    static final String dfa_3s = "\1\41\4\24\1\56\4\uffff";
    static final String dfa_4s = "\6\uffff\1\4\1\3\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\5",
            "\1\5",
            "\2\10\1\11\21\uffff\2\11\2\uffff\2\7\1\6\2\uffff\1\6\10\uffff\2\7\1\10\2\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "589:2: ( ( ( (lv_PrecedingLogicOp_0_0= ruleLogicOp ) ) otherlv_1= '(' ( ( (lv_operand_2_0= ruleOperandNum ) ) ( (lv_operator_3_0= ruleOperatorNum ) ) ( (lv_operand_4_0= ruleOperandNum ) ) ) otherlv_5= ')' ) | ( ( (lv_PrecedingLogicOp_6_0= ruleLogicOp ) ) otherlv_7= '(' ( ( (lv_operand_8_0= ruleOperandString ) ) ( (lv_operator_9_0= ruleOperatorString ) ) ( (lv_operand_10_0= ruleOperandString ) ) ) otherlv_11= ')' ) | ( ( (lv_PrecedingLogicOp_12_0= ruleLogicOp ) ) otherlv_13= '(' ( ( (lv_operand_14_0= ruleOperandBool ) ) ( (lv_operator_15_0= ruleOperatorString ) ) ( (lv_operand_16_0= ruleOperandBool ) ) ) otherlv_17= ')' ) | ( ( (lv_PrecedingLogicOp_18_0= ruleLogicOp ) ) otherlv_19= '(' ( ( (lv_operator_20_0= ruleOperatorBoolBefore ) ) ( (lv_operand_21_0= ruleOperandBool ) ) ) otherlv_22= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003C0020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000600003000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000003FC01020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0030000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000003C0800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001000040L});

}