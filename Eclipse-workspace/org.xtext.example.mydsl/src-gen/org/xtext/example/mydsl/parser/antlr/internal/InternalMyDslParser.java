package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STORY'", "'{'", "'}'", "'STATE'", "'PROPERTY'", "'name'", "'='", "','", "'type'", "'value'", "'CHAPTER'", "'id'", "'entrances'", "'('", "')'", "'SCENARIO'", "'END'", "'TEXT'", "'CHOICE'", "'scenarioId'", "'description'", "'GOTOCHAPTER'", "'chapterId'", "'entrance'", "'true'", "'false'", "'NUMBER'", "'YES/NO'", "'LIST'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Story";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStory"
    // InternalMyDsl.g:65:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleStory= ruleStory EOF )
            // InternalMyDsl.g:66:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
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
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalMyDsl.g:72:1: ruleStory returns [EObject current=null] : (otherlv_0= 'STORY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) ) ( (lv_chapters_4_0= ruleChapter ) )+ otherlv_5= '}' ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_state_3_0 = null;

        EObject lv_chapters_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'STORY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) ) ( (lv_chapters_4_0= ruleChapter ) )+ otherlv_5= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'STORY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) ) ( (lv_chapters_4_0= ruleChapter ) )+ otherlv_5= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'STORY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) ) ( (lv_chapters_4_0= ruleChapter ) )+ otherlv_5= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'STORY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) ) ( (lv_chapters_4_0= ruleChapter ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStoryAccess().getSTORYKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:106:3: ( (lv_state_3_0= ruleState ) )
            // InternalMyDsl.g:107:4: (lv_state_3_0= ruleState )
            {
            // InternalMyDsl.g:107:4: (lv_state_3_0= ruleState )
            // InternalMyDsl.g:108:5: lv_state_3_0= ruleState
            {

            					newCompositeNode(grammarAccess.getStoryAccess().getStateStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_3_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoryRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_3_0,
            						"org.xtext.example.mydsl.MyDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:125:3: ( (lv_chapters_4_0= ruleChapter ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:126:4: (lv_chapters_4_0= ruleChapter )
            	    {
            	    // InternalMyDsl.g:126:4: (lv_chapters_4_0= ruleChapter )
            	    // InternalMyDsl.g:127:5: lv_chapters_4_0= ruleChapter
            	    {

            	    					newCompositeNode(grammarAccess.getStoryAccess().getChaptersChapterParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_chapters_4_0=ruleChapter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chapters",
            	    						lv_chapters_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Chapter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStoryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:152:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:152:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:153:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:159:1: ruleState returns [EObject current=null] : (otherlv_0= 'STATE' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:165:2: ( (otherlv_0= 'STATE' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:166:2: (otherlv_0= 'STATE' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:166:2: (otherlv_0= 'STATE' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}' )
            // InternalMyDsl.g:167:3: otherlv_0= 'STATE' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getSTATEKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:175:3: ( (lv_properties_2_0= ruleProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:176:4: (lv_properties_2_0= ruleProperty )
            	    {
            	    // InternalMyDsl.g:176:4: (lv_properties_2_0= ruleProperty )
            	    // InternalMyDsl.g:177:5: lv_properties_2_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_properties_2_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleProperty"
    // InternalMyDsl.g:202:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMyDsl.g:202:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMyDsl.g:203:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMyDsl.g:209:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'PROPERTY' otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ',' otherlv_9= 'value' otherlv_10= '=' ( (lv_value_11_0= ruleValue ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:215:2: ( (otherlv_0= 'PROPERTY' otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ',' otherlv_9= 'value' otherlv_10= '=' ( (lv_value_11_0= ruleValue ) ) ) )
            // InternalMyDsl.g:216:2: (otherlv_0= 'PROPERTY' otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ',' otherlv_9= 'value' otherlv_10= '=' ( (lv_value_11_0= ruleValue ) ) )
            {
            // InternalMyDsl.g:216:2: (otherlv_0= 'PROPERTY' otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ',' otherlv_9= 'value' otherlv_10= '=' ( (lv_value_11_0= ruleValue ) ) )
            // InternalMyDsl.g:217:3: otherlv_0= 'PROPERTY' otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ',' otherlv_9= 'value' otherlv_10= '=' ( (lv_value_11_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPROPERTYKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:229:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:230:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:230:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:231:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:259:3: ( (lv_type_7_0= ruleType ) )
            // InternalMyDsl.g:260:4: (lv_type_7_0= ruleType )
            {
            // InternalMyDsl.g:260:4: (lv_type_7_0= ruleType )
            // InternalMyDsl.g:261:5: lv_type_7_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_7_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getValueKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getPropertyAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:290:3: ( (lv_value_11_0= ruleValue ) )
            // InternalMyDsl.g:291:4: (lv_value_11_0= ruleValue )
            {
            // InternalMyDsl.g:291:4: (lv_value_11_0= ruleValue )
            // InternalMyDsl.g:292:5: lv_value_11_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_11_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_11_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleChapter"
    // InternalMyDsl.g:313:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // InternalMyDsl.g:313:48: (iv_ruleChapter= ruleChapter EOF )
            // InternalMyDsl.g:314:2: iv_ruleChapter= ruleChapter EOF
            {
             newCompositeNode(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChapter=ruleChapter();

            state._fsp--;

             current =iv_ruleChapter; 
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
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // InternalMyDsl.g:320:1: ruleChapter returns [EObject current=null] : (otherlv_0= 'CHAPTER' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrances' otherlv_6= '=' otherlv_7= '(' ( (lv_entrances_8_0= ruleStartPoint ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_scenarios_11_0= ruleScenario ) )+ otherlv_12= '}' ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_entrances_8_0 = null;

        EObject lv_scenarios_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:326:2: ( (otherlv_0= 'CHAPTER' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrances' otherlv_6= '=' otherlv_7= '(' ( (lv_entrances_8_0= ruleStartPoint ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_scenarios_11_0= ruleScenario ) )+ otherlv_12= '}' ) )
            // InternalMyDsl.g:327:2: (otherlv_0= 'CHAPTER' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrances' otherlv_6= '=' otherlv_7= '(' ( (lv_entrances_8_0= ruleStartPoint ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_scenarios_11_0= ruleScenario ) )+ otherlv_12= '}' )
            {
            // InternalMyDsl.g:327:2: (otherlv_0= 'CHAPTER' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrances' otherlv_6= '=' otherlv_7= '(' ( (lv_entrances_8_0= ruleStartPoint ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_scenarios_11_0= ruleScenario ) )+ otherlv_12= '}' )
            // InternalMyDsl.g:328:3: otherlv_0= 'CHAPTER' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrances' otherlv_6= '=' otherlv_7= '(' ( (lv_entrances_8_0= ruleStartPoint ) ) otherlv_9= ')' otherlv_10= '{' ( (lv_scenarios_11_0= ruleScenario ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getChapterAccess().getCHAPTERKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getChapterAccess().getIdKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getChapterAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:340:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:341:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:341:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:342:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChapterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getChapterAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChapterAccess().getEntrancesKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getChapterAccess().getEqualsSignKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getChapterAccess().getLeftParenthesisKeyword_7());
            		
            // InternalMyDsl.g:374:3: ( (lv_entrances_8_0= ruleStartPoint ) )
            // InternalMyDsl.g:375:4: (lv_entrances_8_0= ruleStartPoint )
            {
            // InternalMyDsl.g:375:4: (lv_entrances_8_0= ruleStartPoint )
            // InternalMyDsl.g:376:5: lv_entrances_8_0= ruleStartPoint
            {

            					newCompositeNode(grammarAccess.getChapterAccess().getEntrancesStartPointParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_entrances_8_0=ruleStartPoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChapterRule());
            					}
            					add(
            						current,
            						"entrances",
            						lv_entrances_8_0,
            						"org.xtext.example.mydsl.MyDsl.StartPoint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getChapterAccess().getRightParenthesisKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:401:3: ( (lv_scenarios_11_0= ruleScenario ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:402:4: (lv_scenarios_11_0= ruleScenario )
            	    {
            	    // InternalMyDsl.g:402:4: (lv_scenarios_11_0= ruleScenario )
            	    // InternalMyDsl.g:403:5: lv_scenarios_11_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getChapterAccess().getScenariosScenarioParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_scenarios_11_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChapterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_11_0,
            	    						"org.xtext.example.mydsl.MyDsl.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleStartPoint"
    // InternalMyDsl.g:428:1: entryRuleStartPoint returns [EObject current=null] : iv_ruleStartPoint= ruleStartPoint EOF ;
    public final EObject entryRuleStartPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartPoint = null;


        try {
            // InternalMyDsl.g:428:51: (iv_ruleStartPoint= ruleStartPoint EOF )
            // InternalMyDsl.g:429:2: iv_ruleStartPoint= ruleStartPoint EOF
            {
             newCompositeNode(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartPoint=ruleStartPoint();

            state._fsp--;

             current =iv_ruleStartPoint; 
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
    // $ANTLR end "entryRuleStartPoint"


    // $ANTLR start "ruleStartPoint"
    // InternalMyDsl.g:435:1: ruleStartPoint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStartPoint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:441:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:442:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:442:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:443:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMyDsl.g:443:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:444:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:444:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:445:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStartPointAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartPointAccess().getCommaKeyword_1());
            		
            // InternalMyDsl.g:465:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:466:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:466:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:467:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartPointRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getStartPointAccess().getScenarioIdScenarioCrossReference_2_0());
            				

            }


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
    // $ANTLR end "ruleStartPoint"


    // $ANTLR start "entryRuleScenario"
    // InternalMyDsl.g:482:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalMyDsl.g:482:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalMyDsl.g:483:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalMyDsl.g:489:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'SCENARIO' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_text_5_0= ruleText ) )? ( ( (lv_choices_6_0= ruleChoice ) )+ | otherlv_7= 'END' | ( (lv_goto_8_0= ruleGoToChapter ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_text_5_0 = null;

        EObject lv_choices_6_0 = null;

        EObject lv_goto_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:495:2: ( (otherlv_0= 'SCENARIO' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_text_5_0= ruleText ) )? ( ( (lv_choices_6_0= ruleChoice ) )+ | otherlv_7= 'END' | ( (lv_goto_8_0= ruleGoToChapter ) ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:496:2: (otherlv_0= 'SCENARIO' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_text_5_0= ruleText ) )? ( ( (lv_choices_6_0= ruleChoice ) )+ | otherlv_7= 'END' | ( (lv_goto_8_0= ruleGoToChapter ) ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:496:2: (otherlv_0= 'SCENARIO' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_text_5_0= ruleText ) )? ( ( (lv_choices_6_0= ruleChoice ) )+ | otherlv_7= 'END' | ( (lv_goto_8_0= ruleGoToChapter ) ) ) otherlv_9= '}' )
            // InternalMyDsl.g:497:3: otherlv_0= 'SCENARIO' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_text_5_0= ruleText ) )? ( ( (lv_choices_6_0= ruleChoice ) )+ | otherlv_7= 'END' | ( (lv_goto_8_0= ruleGoToChapter ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getSCENARIOKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getIdKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:509:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:510:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:510:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:511:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_3_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:531:3: ( (lv_text_5_0= ruleText ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:532:4: (lv_text_5_0= ruleText )
                    {
                    // InternalMyDsl.g:532:4: (lv_text_5_0= ruleText )
                    // InternalMyDsl.g:533:5: lv_text_5_0= ruleText
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getTextTextParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_text_5_0=ruleText();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"text",
                    						lv_text_5_0,
                    						"org.xtext.example.mydsl.MyDsl.Text");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:550:3: ( ( (lv_choices_6_0= ruleChoice ) )+ | otherlv_7= 'END' | ( (lv_goto_8_0= ruleGoToChapter ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:551:4: ( (lv_choices_6_0= ruleChoice ) )+
                    {
                    // InternalMyDsl.g:551:4: ( (lv_choices_6_0= ruleChoice ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==29) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:552:5: (lv_choices_6_0= ruleChoice )
                    	    {
                    	    // InternalMyDsl.g:552:5: (lv_choices_6_0= ruleChoice )
                    	    // InternalMyDsl.g:553:6: lv_choices_6_0= ruleChoice
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioAccess().getChoicesChoiceParserRuleCall_6_0_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_choices_6_0=ruleChoice();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"choices",
                    	    							lv_choices_6_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Choice");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:571:4: otherlv_7= 'END'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getENDKeyword_6_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:576:4: ( (lv_goto_8_0= ruleGoToChapter ) )
                    {
                    // InternalMyDsl.g:576:4: ( (lv_goto_8_0= ruleGoToChapter ) )
                    // InternalMyDsl.g:577:5: (lv_goto_8_0= ruleGoToChapter )
                    {
                    // InternalMyDsl.g:577:5: (lv_goto_8_0= ruleGoToChapter )
                    // InternalMyDsl.g:578:6: lv_goto_8_0= ruleGoToChapter
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getGotoGoToChapterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_goto_8_0=ruleGoToChapter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						set(
                    							current,
                    							"goto",
                    							lv_goto_8_0,
                    							"org.xtext.example.mydsl.MyDsl.GoToChapter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleText"
    // InternalMyDsl.g:604:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalMyDsl.g:604:45: (iv_ruleText= ruleText EOF )
            // InternalMyDsl.g:605:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalMyDsl.g:611:1: ruleText returns [EObject current=null] : (otherlv_0= 'TEXT' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:617:2: ( (otherlv_0= 'TEXT' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:618:2: (otherlv_0= 'TEXT' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:618:2: (otherlv_0= 'TEXT' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:619:3: otherlv_0= 'TEXT' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTEXTKeyword_0());
            		
            // InternalMyDsl.g:623:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMyDsl.g:624:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:624:4: (lv_text_1_0= RULE_STRING )
            // InternalMyDsl.g:625:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleChoice"
    // InternalMyDsl.g:645:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalMyDsl.g:645:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalMyDsl.g:646:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalMyDsl.g:652:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'CHOICE' otherlv_1= 'scenarioId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_stateChanges_9_0= ruleStateChange ) ) (otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) ) )* )? ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_stateChanges_9_0 = null;

        EObject lv_stateChanges_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:658:2: ( (otherlv_0= 'CHOICE' otherlv_1= 'scenarioId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_stateChanges_9_0= ruleStateChange ) ) (otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) ) )* )? ) )
            // InternalMyDsl.g:659:2: (otherlv_0= 'CHOICE' otherlv_1= 'scenarioId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_stateChanges_9_0= ruleStateChange ) ) (otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) ) )* )? )
            {
            // InternalMyDsl.g:659:2: (otherlv_0= 'CHOICE' otherlv_1= 'scenarioId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_stateChanges_9_0= ruleStateChange ) ) (otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) ) )* )? )
            // InternalMyDsl.g:660:3: otherlv_0= 'CHOICE' otherlv_1= 'scenarioId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_stateChanges_9_0= ruleStateChange ) ) (otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) ) )* )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getCHOICEKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getScenarioIdKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:672:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:673:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:673:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:674:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getScenarioIdScenarioCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getChoiceAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:697:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalMyDsl.g:698:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:698:4: (lv_description_7_0= RULE_STRING )
            // InternalMyDsl.g:699:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_description_7_0, grammarAccess.getChoiceAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:715:3: (otherlv_8= ',' ( (lv_stateChanges_9_0= ruleStateChange ) ) (otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:716:4: otherlv_8= ',' ( (lv_stateChanges_9_0= ruleStateChange ) ) (otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) ) )*
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getChoiceAccess().getCommaKeyword_8_0());
                    			
                    // InternalMyDsl.g:720:4: ( (lv_stateChanges_9_0= ruleStateChange ) )
                    // InternalMyDsl.g:721:5: (lv_stateChanges_9_0= ruleStateChange )
                    {
                    // InternalMyDsl.g:721:5: (lv_stateChanges_9_0= ruleStateChange )
                    // InternalMyDsl.g:722:6: lv_stateChanges_9_0= ruleStateChange
                    {

                    						newCompositeNode(grammarAccess.getChoiceAccess().getStateChangesStateChangeParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_stateChanges_9_0=ruleStateChange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoiceRule());
                    						}
                    						add(
                    							current,
                    							"stateChanges",
                    							lv_stateChanges_9_0,
                    							"org.xtext.example.mydsl.MyDsl.StateChange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:739:4: (otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:740:5: otherlv_10= ',' ( (lv_stateChanges_11_0= ruleStateChange ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getChoiceAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:744:5: ( (lv_stateChanges_11_0= ruleStateChange ) )
                    	    // InternalMyDsl.g:745:6: (lv_stateChanges_11_0= ruleStateChange )
                    	    {
                    	    // InternalMyDsl.g:745:6: (lv_stateChanges_11_0= ruleStateChange )
                    	    // InternalMyDsl.g:746:7: lv_stateChanges_11_0= ruleStateChange
                    	    {

                    	    							newCompositeNode(grammarAccess.getChoiceAccess().getStateChangesStateChangeParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_stateChanges_11_0=ruleStateChange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChoiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stateChanges",
                    	    								lv_stateChanges_11_0,
                    	    								"org.xtext.example.mydsl.MyDsl.StateChange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleStateChange"
    // InternalMyDsl.g:769:1: entryRuleStateChange returns [EObject current=null] : iv_ruleStateChange= ruleStateChange EOF ;
    public final EObject entryRuleStateChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateChange = null;


        try {
            // InternalMyDsl.g:769:52: (iv_ruleStateChange= ruleStateChange EOF )
            // InternalMyDsl.g:770:2: iv_ruleStateChange= ruleStateChange EOF
            {
             newCompositeNode(grammarAccess.getStateChangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateChange=ruleStateChange();

            state._fsp--;

             current =iv_ruleStateChange; 
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
    // $ANTLR end "entryRuleStateChange"


    // $ANTLR start "ruleStateChange"
    // InternalMyDsl.g:776:1: ruleStateChange returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleStateChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:782:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMyDsl.g:783:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMyDsl.g:783:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) )
            // InternalMyDsl.g:784:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMyDsl.g:784:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:785:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:785:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:786:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateChangeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getStateChangeAccess().getVariablePropertyCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:797:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalMyDsl.g:798:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalMyDsl.g:798:4: (lv_operator_1_0= ruleOperator )
            // InternalMyDsl.g:799:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getStateChangeAccess().getOperatorOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateChangeRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.xtext.example.mydsl.MyDsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:816:3: ( (lv_value_2_0= ruleValue ) )
            // InternalMyDsl.g:817:4: (lv_value_2_0= ruleValue )
            {
            // InternalMyDsl.g:817:4: (lv_value_2_0= ruleValue )
            // InternalMyDsl.g:818:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getStateChangeAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateChangeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleStateChange"


    // $ANTLR start "entryRuleGoToChapter"
    // InternalMyDsl.g:839:1: entryRuleGoToChapter returns [EObject current=null] : iv_ruleGoToChapter= ruleGoToChapter EOF ;
    public final EObject entryRuleGoToChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoToChapter = null;


        try {
            // InternalMyDsl.g:839:52: (iv_ruleGoToChapter= ruleGoToChapter EOF )
            // InternalMyDsl.g:840:2: iv_ruleGoToChapter= ruleGoToChapter EOF
            {
             newCompositeNode(grammarAccess.getGoToChapterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoToChapter=ruleGoToChapter();

            state._fsp--;

             current =iv_ruleGoToChapter; 
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
    // $ANTLR end "entryRuleGoToChapter"


    // $ANTLR start "ruleGoToChapter"
    // InternalMyDsl.g:846:1: ruleGoToChapter returns [EObject current=null] : (otherlv_0= 'GOTOCHAPTER' otherlv_1= 'chapterId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrance' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleGoToChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:852:2: ( (otherlv_0= 'GOTOCHAPTER' otherlv_1= 'chapterId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrance' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalMyDsl.g:853:2: (otherlv_0= 'GOTOCHAPTER' otherlv_1= 'chapterId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrance' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalMyDsl.g:853:2: (otherlv_0= 'GOTOCHAPTER' otherlv_1= 'chapterId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrance' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )
            // InternalMyDsl.g:854:3: otherlv_0= 'GOTOCHAPTER' otherlv_1= 'chapterId' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'entrance' otherlv_6= '=' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToChapterAccess().getGOTOCHAPTERKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToChapterAccess().getChapterIdKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGoToChapterAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:866:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:867:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:867:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:868:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToChapterRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getGoToChapterAccess().getChapterIdChapterCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getGoToChapterAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getGoToChapterAccess().getEntranceKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGoToChapterAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:891:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:892:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:892:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:893:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToChapterRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getGoToChapterAccess().getEntranceStartPointCrossReference_7_0());
            				

            }


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
    // $ANTLR end "ruleGoToChapter"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:908:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalMyDsl.g:908:45: (iv_ruleValue= ruleValue EOF )
            // InternalMyDsl.g:909:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:915:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (kw= 'true' | kw= 'false' ) ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:921:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (kw= 'true' | kw= 'false' ) ) )
            // InternalMyDsl.g:922:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (kw= 'true' | kw= 'false' ) )
            {
            // InternalMyDsl.g:922:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (kw= 'true' | kw= 'false' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case 35:
            case 36:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:923:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:931:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:939:3: (kw= 'true' | kw= 'false' )
                    {
                    // InternalMyDsl.g:939:3: (kw= 'true' | kw= 'false' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==35) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==36) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:940:4: kw= 'true'
                            {
                            kw=(Token)match(input,35,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getValueAccess().getTrueKeyword_2_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:946:4: kw= 'false'
                            {
                            kw=(Token)match(input,36,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getValueAccess().getFalseKeyword_2_1());
                            			

                            }
                            break;

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:956:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'YES/NO' ) | (enumLiteral_3= 'LIST' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:962:2: ( ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'YES/NO' ) | (enumLiteral_3= 'LIST' ) ) )
            // InternalMyDsl.g:963:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'YES/NO' ) | (enumLiteral_3= 'LIST' ) )
            {
            // InternalMyDsl.g:963:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'YES/NO' ) | (enumLiteral_3= 'LIST' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:964:3: (enumLiteral_0= 'TEXT' )
                    {
                    // InternalMyDsl.g:964:3: (enumLiteral_0= 'TEXT' )
                    // InternalMyDsl.g:965:4: enumLiteral_0= 'TEXT'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:972:3: (enumLiteral_1= 'NUMBER' )
                    {
                    // InternalMyDsl.g:972:3: (enumLiteral_1= 'NUMBER' )
                    // InternalMyDsl.g:973:4: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:980:3: (enumLiteral_2= 'YES/NO' )
                    {
                    // InternalMyDsl.g:980:3: (enumLiteral_2= 'YES/NO' )
                    // InternalMyDsl.g:981:4: enumLiteral_2= 'YES/NO'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:988:3: (enumLiteral_3= 'LIST' )
                    {
                    // InternalMyDsl.g:988:3: (enumLiteral_3= 'LIST' )
                    // InternalMyDsl.g:989:4: enumLiteral_3= 'LIST'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:999:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1005:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) ) )
            // InternalMyDsl.g:1006:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) )
            {
            // InternalMyDsl.g:1006:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            case 42:
                {
                alt12=4;
                }
                break;
            case 43:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1007:3: (enumLiteral_0= '=' )
                    {
                    // InternalMyDsl.g:1007:3: (enumLiteral_0= '=' )
                    // InternalMyDsl.g:1008:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getASSIGNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1015:3: (enumLiteral_1= '+' )
                    {
                    // InternalMyDsl.g:1015:3: (enumLiteral_1= '+' )
                    // InternalMyDsl.g:1016:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1023:3: (enumLiteral_2= '-' )
                    {
                    // InternalMyDsl.g:1023:3: (enumLiteral_2= '-' )
                    // InternalMyDsl.g:1024:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1031:3: (enumLiteral_3= '*' )
                    {
                    // InternalMyDsl.g:1031:3: (enumLiteral_3= '*' )
                    // InternalMyDsl.g:1032:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMULTIPLYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getMULTIPLYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1039:3: (enumLiteral_4= '/' )
                    {
                    // InternalMyDsl.g:1039:3: (enumLiteral_4= '/' )
                    // InternalMyDsl.g:1040:4: enumLiteral_4= '/'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getDIVIDEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getDIVIDEEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000E010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001800000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000138000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000F0000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});

}