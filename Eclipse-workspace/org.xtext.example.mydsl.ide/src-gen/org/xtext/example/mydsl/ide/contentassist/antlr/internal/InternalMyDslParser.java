package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'END'", "'true'", "'false'", "'TEXT'", "'NUMBER'", "'YES/NO'", "'LIST'", "'='", "'+'", "'-'", "'*'", "'/'", "'STORY'", "'{'", "'}'", "'STATE'", "'PROPERTY'", "'name'", "','", "'type'", "'value'", "'CHAPTER'", "'id'", "'entrances'", "'('", "')'", "'SCENARIO'", "'CHOICE'", "'scenarioId'", "'description'", "'GOTOCHAPTER'", "'chapterId'", "'entrance'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStory"
    // InternalMyDsl.g:53:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleStory EOF )
            // InternalMyDsl.g:55:1: ruleStory EOF
            {
             before(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getStoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalMyDsl.g:62:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Story__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Story__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Story__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Story__Group__0 )
            // InternalMyDsl.g:69:4: rule__Story__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:78:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleState EOF )
            // InternalMyDsl.g:80:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:87:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__State__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__State__Group__0 )
            // InternalMyDsl.g:94:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleProperty"
    // InternalMyDsl.g:103:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleProperty EOF )
            // InternalMyDsl.g:105:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMyDsl.g:112:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Property__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Property__Group__0 )
            // InternalMyDsl.g:119:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleChapter"
    // InternalMyDsl.g:128:1: entryRuleChapter : ruleChapter EOF ;
    public final void entryRuleChapter() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleChapter EOF )
            // InternalMyDsl.g:130:1: ruleChapter EOF
            {
             before(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_1);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getChapterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // InternalMyDsl.g:137:1: ruleChapter : ( ( rule__Chapter__Group__0 ) ) ;
    public final void ruleChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Chapter__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Chapter__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Chapter__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Chapter__Group__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Chapter__Group__0 )
            // InternalMyDsl.g:144:4: rule__Chapter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleStartPoint"
    // InternalMyDsl.g:153:1: entryRuleStartPoint : ruleStartPoint EOF ;
    public final void entryRuleStartPoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleStartPoint EOF )
            // InternalMyDsl.g:155:1: ruleStartPoint EOF
            {
             before(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_1);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getStartPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartPoint"


    // $ANTLR start "ruleStartPoint"
    // InternalMyDsl.g:162:1: ruleStartPoint : ( ( rule__StartPoint__Group__0 ) ) ;
    public final void ruleStartPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__StartPoint__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__StartPoint__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__StartPoint__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__StartPoint__Group__0 )
            {
             before(grammarAccess.getStartPointAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__StartPoint__Group__0 )
            // InternalMyDsl.g:169:4: rule__StartPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartPoint"


    // $ANTLR start "entryRuleScenario"
    // InternalMyDsl.g:178:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleScenario EOF )
            // InternalMyDsl.g:180:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalMyDsl.g:187:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Scenario__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Scenario__Group__0 )
            // InternalMyDsl.g:194:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleText"
    // InternalMyDsl.g:203:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleText EOF )
            // InternalMyDsl.g:205:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalMyDsl.g:212:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Text__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Text__Group__0 )
            // InternalMyDsl.g:219:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleChoice"
    // InternalMyDsl.g:228:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleChoice EOF )
            // InternalMyDsl.g:230:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalMyDsl.g:237:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Choice__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Choice__Group__0 )
            // InternalMyDsl.g:244:4: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleStateChange"
    // InternalMyDsl.g:253:1: entryRuleStateChange : ruleStateChange EOF ;
    public final void entryRuleStateChange() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleStateChange EOF )
            // InternalMyDsl.g:255:1: ruleStateChange EOF
            {
             before(grammarAccess.getStateChangeRule()); 
            pushFollow(FOLLOW_1);
            ruleStateChange();

            state._fsp--;

             after(grammarAccess.getStateChangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateChange"


    // $ANTLR start "ruleStateChange"
    // InternalMyDsl.g:262:1: ruleStateChange : ( ( rule__StateChange__Group__0 ) ) ;
    public final void ruleStateChange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__StateChange__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__StateChange__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__StateChange__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__StateChange__Group__0 )
            {
             before(grammarAccess.getStateChangeAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__StateChange__Group__0 )
            // InternalMyDsl.g:269:4: rule__StateChange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateChange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateChangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateChange"


    // $ANTLR start "entryRuleGoToChapter"
    // InternalMyDsl.g:278:1: entryRuleGoToChapter : ruleGoToChapter EOF ;
    public final void entryRuleGoToChapter() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleGoToChapter EOF )
            // InternalMyDsl.g:280:1: ruleGoToChapter EOF
            {
             before(grammarAccess.getGoToChapterRule()); 
            pushFollow(FOLLOW_1);
            ruleGoToChapter();

            state._fsp--;

             after(grammarAccess.getGoToChapterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoToChapter"


    // $ANTLR start "ruleGoToChapter"
    // InternalMyDsl.g:287:1: ruleGoToChapter : ( ( rule__GoToChapter__Group__0 ) ) ;
    public final void ruleGoToChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__GoToChapter__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__GoToChapter__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__GoToChapter__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__GoToChapter__Group__0 )
            {
             before(grammarAccess.getGoToChapterAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__GoToChapter__Group__0 )
            // InternalMyDsl.g:294:4: rule__GoToChapter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToChapterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoToChapter"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:303:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleValue EOF )
            // InternalMyDsl.g:305:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:312:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__Value__Alternatives )
            // InternalMyDsl.g:319:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:328:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:333:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:333:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:334:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:335:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:335:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:344:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMyDsl.g:349:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMyDsl.g:349:2: ( ( rule__Operator__Alternatives ) )
            // InternalMyDsl.g:350:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:351:3: ( rule__Operator__Alternatives )
            // InternalMyDsl.g:351:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Scenario__Alternatives_6"
    // InternalMyDsl.g:359:1: rule__Scenario__Alternatives_6 : ( ( ( ( rule__Scenario__ChoicesAssignment_6_0 ) ) ( ( rule__Scenario__ChoicesAssignment_6_0 )* ) ) | ( 'END' ) | ( ( rule__Scenario__GotoAssignment_6_2 ) ) );
    public final void rule__Scenario__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:363:1: ( ( ( ( rule__Scenario__ChoicesAssignment_6_0 ) ) ( ( rule__Scenario__ChoicesAssignment_6_0 )* ) ) | ( 'END' ) | ( ( rule__Scenario__GotoAssignment_6_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:364:2: ( ( ( rule__Scenario__ChoicesAssignment_6_0 ) ) ( ( rule__Scenario__ChoicesAssignment_6_0 )* ) )
                    {
                    // InternalMyDsl.g:364:2: ( ( ( rule__Scenario__ChoicesAssignment_6_0 ) ) ( ( rule__Scenario__ChoicesAssignment_6_0 )* ) )
                    // InternalMyDsl.g:365:3: ( ( rule__Scenario__ChoicesAssignment_6_0 ) ) ( ( rule__Scenario__ChoicesAssignment_6_0 )* )
                    {
                    // InternalMyDsl.g:365:3: ( ( rule__Scenario__ChoicesAssignment_6_0 ) )
                    // InternalMyDsl.g:366:4: ( rule__Scenario__ChoicesAssignment_6_0 )
                    {
                     before(grammarAccess.getScenarioAccess().getChoicesAssignment_6_0()); 
                    // InternalMyDsl.g:367:4: ( rule__Scenario__ChoicesAssignment_6_0 )
                    // InternalMyDsl.g:367:5: rule__Scenario__ChoicesAssignment_6_0
                    {
                    pushFollow(FOLLOW_3);
                    rule__Scenario__ChoicesAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioAccess().getChoicesAssignment_6_0()); 

                    }

                    // InternalMyDsl.g:370:3: ( ( rule__Scenario__ChoicesAssignment_6_0 )* )
                    // InternalMyDsl.g:371:4: ( rule__Scenario__ChoicesAssignment_6_0 )*
                    {
                     before(grammarAccess.getScenarioAccess().getChoicesAssignment_6_0()); 
                    // InternalMyDsl.g:372:4: ( rule__Scenario__ChoicesAssignment_6_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==38) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:372:5: rule__Scenario__ChoicesAssignment_6_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Scenario__ChoicesAssignment_6_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getScenarioAccess().getChoicesAssignment_6_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:377:2: ( 'END' )
                    {
                    // InternalMyDsl.g:377:2: ( 'END' )
                    // InternalMyDsl.g:378:3: 'END'
                    {
                     before(grammarAccess.getScenarioAccess().getENDKeyword_6_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScenarioAccess().getENDKeyword_6_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:383:2: ( ( rule__Scenario__GotoAssignment_6_2 ) )
                    {
                    // InternalMyDsl.g:383:2: ( ( rule__Scenario__GotoAssignment_6_2 ) )
                    // InternalMyDsl.g:384:3: ( rule__Scenario__GotoAssignment_6_2 )
                    {
                     before(grammarAccess.getScenarioAccess().getGotoAssignment_6_2()); 
                    // InternalMyDsl.g:385:3: ( rule__Scenario__GotoAssignment_6_2 )
                    // InternalMyDsl.g:385:4: rule__Scenario__GotoAssignment_6_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__GotoAssignment_6_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioAccess().getGotoAssignment_6_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Alternatives_6"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMyDsl.g:393:1: rule__Value__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Alternatives_2 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Alternatives_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case 12:
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:398:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:398:2: ( RULE_STRING )
                    // InternalMyDsl.g:399:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:404:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:404:2: ( RULE_INT )
                    // InternalMyDsl.g:405:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:410:2: ( ( rule__Value__Alternatives_2 ) )
                    {
                    // InternalMyDsl.g:410:2: ( ( rule__Value__Alternatives_2 ) )
                    // InternalMyDsl.g:411:3: ( rule__Value__Alternatives_2 )
                    {
                     before(grammarAccess.getValueAccess().getAlternatives_2()); 
                    // InternalMyDsl.g:412:3: ( rule__Value__Alternatives_2 )
                    // InternalMyDsl.g:412:4: rule__Value__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Alternatives_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getAlternatives_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Value__Alternatives_2"
    // InternalMyDsl.g:420:1: rule__Value__Alternatives_2 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Value__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:424:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:425:2: ( 'true' )
                    {
                    // InternalMyDsl.g:425:2: ( 'true' )
                    // InternalMyDsl.g:426:3: 'true'
                    {
                     before(grammarAccess.getValueAccess().getTrueKeyword_2_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getTrueKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:431:2: ( 'false' )
                    {
                    // InternalMyDsl.g:431:2: ( 'false' )
                    // InternalMyDsl.g:432:3: 'false'
                    {
                     before(grammarAccess.getValueAccess().getFalseKeyword_2_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getFalseKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives_2"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:441:1: rule__Type__Alternatives : ( ( ( 'TEXT' ) ) | ( ( 'NUMBER' ) ) | ( ( 'YES/NO' ) ) | ( ( 'LIST' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( ( ( 'TEXT' ) ) | ( ( 'NUMBER' ) ) | ( ( 'YES/NO' ) ) | ( ( 'LIST' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:446:2: ( ( 'TEXT' ) )
                    {
                    // InternalMyDsl.g:446:2: ( ( 'TEXT' ) )
                    // InternalMyDsl.g:447:3: ( 'TEXT' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:448:3: ( 'TEXT' )
                    // InternalMyDsl.g:448:4: 'TEXT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:452:2: ( ( 'NUMBER' ) )
                    {
                    // InternalMyDsl.g:452:2: ( ( 'NUMBER' ) )
                    // InternalMyDsl.g:453:3: ( 'NUMBER' )
                    {
                     before(grammarAccess.getTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:454:3: ( 'NUMBER' )
                    // InternalMyDsl.g:454:4: 'NUMBER'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:458:2: ( ( 'YES/NO' ) )
                    {
                    // InternalMyDsl.g:458:2: ( ( 'YES/NO' ) )
                    // InternalMyDsl.g:459:3: ( 'YES/NO' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:460:3: ( 'YES/NO' )
                    // InternalMyDsl.g:460:4: 'YES/NO'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:464:2: ( ( 'LIST' ) )
                    {
                    // InternalMyDsl.g:464:2: ( ( 'LIST' ) )
                    // InternalMyDsl.g:465:3: ( 'LIST' )
                    {
                     before(grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:466:3: ( 'LIST' )
                    // InternalMyDsl.g:466:4: 'LIST'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMyDsl.g:474:1: rule__Operator__Alternatives : ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:479:2: ( ( '=' ) )
                    {
                    // InternalMyDsl.g:479:2: ( ( '=' ) )
                    // InternalMyDsl.g:480:3: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:481:3: ( '=' )
                    // InternalMyDsl.g:481:4: '='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:485:2: ( ( '+' ) )
                    {
                    // InternalMyDsl.g:485:2: ( ( '+' ) )
                    // InternalMyDsl.g:486:3: ( '+' )
                    {
                     before(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:487:3: ( '+' )
                    // InternalMyDsl.g:487:4: '+'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:491:2: ( ( '-' ) )
                    {
                    // InternalMyDsl.g:491:2: ( ( '-' ) )
                    // InternalMyDsl.g:492:3: ( '-' )
                    {
                     before(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:493:3: ( '-' )
                    // InternalMyDsl.g:493:4: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:497:2: ( ( '*' ) )
                    {
                    // InternalMyDsl.g:497:2: ( ( '*' ) )
                    // InternalMyDsl.g:498:3: ( '*' )
                    {
                     before(grammarAccess.getOperatorAccess().getMULTIPLYEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:499:3: ( '*' )
                    // InternalMyDsl.g:499:4: '*'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMULTIPLYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:503:2: ( ( '/' ) )
                    {
                    // InternalMyDsl.g:503:2: ( ( '/' ) )
                    // InternalMyDsl.g:504:3: ( '/' )
                    {
                     before(grammarAccess.getOperatorAccess().getDIVIDEEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:505:3: ( '/' )
                    // InternalMyDsl.g:505:4: '/'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getDIVIDEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Story__Group__0"
    // InternalMyDsl.g:513:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalMyDsl.g:518:2: rule__Story__Group__0__Impl rule__Story__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0"


    // $ANTLR start "rule__Story__Group__0__Impl"
    // InternalMyDsl.g:525:1: rule__Story__Group__0__Impl : ( 'STORY' ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( ( 'STORY' ) )
            // InternalMyDsl.g:530:1: ( 'STORY' )
            {
            // InternalMyDsl.g:530:1: ( 'STORY' )
            // InternalMyDsl.g:531:2: 'STORY'
            {
             before(grammarAccess.getStoryAccess().getSTORYKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getSTORYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0__Impl"


    // $ANTLR start "rule__Story__Group__1"
    // InternalMyDsl.g:540:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalMyDsl.g:545:2: rule__Story__Group__1__Impl rule__Story__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1"


    // $ANTLR start "rule__Story__Group__1__Impl"
    // InternalMyDsl.g:552:1: rule__Story__Group__1__Impl : ( ( rule__Story__NameAssignment_1 ) ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( ( ( rule__Story__NameAssignment_1 ) ) )
            // InternalMyDsl.g:557:1: ( ( rule__Story__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:557:1: ( ( rule__Story__NameAssignment_1 ) )
            // InternalMyDsl.g:558:2: ( rule__Story__NameAssignment_1 )
            {
             before(grammarAccess.getStoryAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:559:2: ( rule__Story__NameAssignment_1 )
            // InternalMyDsl.g:559:3: rule__Story__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Story__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1__Impl"


    // $ANTLR start "rule__Story__Group__2"
    // InternalMyDsl.g:567:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalMyDsl.g:572:2: rule__Story__Group__2__Impl rule__Story__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2"


    // $ANTLR start "rule__Story__Group__2__Impl"
    // InternalMyDsl.g:579:1: rule__Story__Group__2__Impl : ( '{' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( '{' ) )
            // InternalMyDsl.g:584:1: ( '{' )
            {
            // InternalMyDsl.g:584:1: ( '{' )
            // InternalMyDsl.g:585:2: '{'
            {
             before(grammarAccess.getStoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2__Impl"


    // $ANTLR start "rule__Story__Group__3"
    // InternalMyDsl.g:594:1: rule__Story__Group__3 : rule__Story__Group__3__Impl rule__Story__Group__4 ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( rule__Story__Group__3__Impl rule__Story__Group__4 )
            // InternalMyDsl.g:599:2: rule__Story__Group__3__Impl rule__Story__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Story__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3"


    // $ANTLR start "rule__Story__Group__3__Impl"
    // InternalMyDsl.g:606:1: rule__Story__Group__3__Impl : ( ( rule__Story__StateAssignment_3 ) ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( ( rule__Story__StateAssignment_3 ) ) )
            // InternalMyDsl.g:611:1: ( ( rule__Story__StateAssignment_3 ) )
            {
            // InternalMyDsl.g:611:1: ( ( rule__Story__StateAssignment_3 ) )
            // InternalMyDsl.g:612:2: ( rule__Story__StateAssignment_3 )
            {
             before(grammarAccess.getStoryAccess().getStateAssignment_3()); 
            // InternalMyDsl.g:613:2: ( rule__Story__StateAssignment_3 )
            // InternalMyDsl.g:613:3: rule__Story__StateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Story__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3__Impl"


    // $ANTLR start "rule__Story__Group__4"
    // InternalMyDsl.g:621:1: rule__Story__Group__4 : rule__Story__Group__4__Impl rule__Story__Group__5 ;
    public final void rule__Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( rule__Story__Group__4__Impl rule__Story__Group__5 )
            // InternalMyDsl.g:626:2: rule__Story__Group__4__Impl rule__Story__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Story__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__4"


    // $ANTLR start "rule__Story__Group__4__Impl"
    // InternalMyDsl.g:633:1: rule__Story__Group__4__Impl : ( ( ( rule__Story__ChaptersAssignment_4 ) ) ( ( rule__Story__ChaptersAssignment_4 )* ) ) ;
    public final void rule__Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( ( ( rule__Story__ChaptersAssignment_4 ) ) ( ( rule__Story__ChaptersAssignment_4 )* ) ) )
            // InternalMyDsl.g:638:1: ( ( ( rule__Story__ChaptersAssignment_4 ) ) ( ( rule__Story__ChaptersAssignment_4 )* ) )
            {
            // InternalMyDsl.g:638:1: ( ( ( rule__Story__ChaptersAssignment_4 ) ) ( ( rule__Story__ChaptersAssignment_4 )* ) )
            // InternalMyDsl.g:639:2: ( ( rule__Story__ChaptersAssignment_4 ) ) ( ( rule__Story__ChaptersAssignment_4 )* )
            {
            // InternalMyDsl.g:639:2: ( ( rule__Story__ChaptersAssignment_4 ) )
            // InternalMyDsl.g:640:3: ( rule__Story__ChaptersAssignment_4 )
            {
             before(grammarAccess.getStoryAccess().getChaptersAssignment_4()); 
            // InternalMyDsl.g:641:3: ( rule__Story__ChaptersAssignment_4 )
            // InternalMyDsl.g:641:4: rule__Story__ChaptersAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__Story__ChaptersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getChaptersAssignment_4()); 

            }

            // InternalMyDsl.g:644:2: ( ( rule__Story__ChaptersAssignment_4 )* )
            // InternalMyDsl.g:645:3: ( rule__Story__ChaptersAssignment_4 )*
            {
             before(grammarAccess.getStoryAccess().getChaptersAssignment_4()); 
            // InternalMyDsl.g:646:3: ( rule__Story__ChaptersAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:646:4: rule__Story__ChaptersAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Story__ChaptersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStoryAccess().getChaptersAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__4__Impl"


    // $ANTLR start "rule__Story__Group__5"
    // InternalMyDsl.g:655:1: rule__Story__Group__5 : rule__Story__Group__5__Impl ;
    public final void rule__Story__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__Story__Group__5__Impl )
            // InternalMyDsl.g:660:2: rule__Story__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__5"


    // $ANTLR start "rule__Story__Group__5__Impl"
    // InternalMyDsl.g:666:1: rule__Story__Group__5__Impl : ( '}' ) ;
    public final void rule__Story__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( ( '}' ) )
            // InternalMyDsl.g:671:1: ( '}' )
            {
            // InternalMyDsl.g:671:1: ( '}' )
            // InternalMyDsl.g:672:2: '}'
            {
             before(grammarAccess.getStoryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__5__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMyDsl.g:682:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMyDsl.g:687:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalMyDsl.g:694:1: rule__State__Group__0__Impl : ( 'STATE' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( 'STATE' ) )
            // InternalMyDsl.g:699:1: ( 'STATE' )
            {
            // InternalMyDsl.g:699:1: ( 'STATE' )
            // InternalMyDsl.g:700:2: 'STATE'
            {
             before(grammarAccess.getStateAccess().getSTATEKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getSTATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalMyDsl.g:709:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalMyDsl.g:714:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalMyDsl.g:721:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( ( '{' ) )
            // InternalMyDsl.g:726:1: ( '{' )
            {
            // InternalMyDsl.g:726:1: ( '{' )
            // InternalMyDsl.g:727:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalMyDsl.g:736:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalMyDsl.g:741:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalMyDsl.g:748:1: rule__State__Group__2__Impl : ( ( rule__State__PropertiesAssignment_2 )* ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( ( rule__State__PropertiesAssignment_2 )* ) )
            // InternalMyDsl.g:753:1: ( ( rule__State__PropertiesAssignment_2 )* )
            {
            // InternalMyDsl.g:753:1: ( ( rule__State__PropertiesAssignment_2 )* )
            // InternalMyDsl.g:754:2: ( rule__State__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getStateAccess().getPropertiesAssignment_2()); 
            // InternalMyDsl.g:755:2: ( rule__State__PropertiesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:755:3: rule__State__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__State__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalMyDsl.g:763:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( rule__State__Group__3__Impl )
            // InternalMyDsl.g:768:2: rule__State__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalMyDsl.g:774:1: rule__State__Group__3__Impl : ( '}' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( ( '}' ) )
            // InternalMyDsl.g:779:1: ( '}' )
            {
            // InternalMyDsl.g:779:1: ( '}' )
            // InternalMyDsl.g:780:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalMyDsl.g:790:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMyDsl.g:795:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalMyDsl.g:802:1: rule__Property__Group__0__Impl : ( 'PROPERTY' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:806:1: ( ( 'PROPERTY' ) )
            // InternalMyDsl.g:807:1: ( 'PROPERTY' )
            {
            // InternalMyDsl.g:807:1: ( 'PROPERTY' )
            // InternalMyDsl.g:808:2: 'PROPERTY'
            {
             before(grammarAccess.getPropertyAccess().getPROPERTYKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getPROPERTYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalMyDsl.g:817:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalMyDsl.g:822:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalMyDsl.g:829:1: rule__Property__Group__1__Impl : ( 'name' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( ( 'name' ) )
            // InternalMyDsl.g:834:1: ( 'name' )
            {
            // InternalMyDsl.g:834:1: ( 'name' )
            // InternalMyDsl.g:835:2: 'name'
            {
             before(grammarAccess.getPropertyAccess().getNameKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalMyDsl.g:844:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalMyDsl.g:849:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalMyDsl.g:856:1: rule__Property__Group__2__Impl : ( '=' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( ( '=' ) )
            // InternalMyDsl.g:861:1: ( '=' )
            {
            // InternalMyDsl.g:861:1: ( '=' )
            // InternalMyDsl.g:862:2: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalMyDsl.g:871:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalMyDsl.g:876:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalMyDsl.g:883:1: rule__Property__Group__3__Impl : ( ( rule__Property__NameAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( ( ( rule__Property__NameAssignment_3 ) ) )
            // InternalMyDsl.g:888:1: ( ( rule__Property__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:888:1: ( ( rule__Property__NameAssignment_3 ) )
            // InternalMyDsl.g:889:2: ( rule__Property__NameAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:890:2: ( rule__Property__NameAssignment_3 )
            // InternalMyDsl.g:890:3: rule__Property__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalMyDsl.g:898:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalMyDsl.g:903:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalMyDsl.g:910:1: rule__Property__Group__4__Impl : ( ',' ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( ( ',' ) )
            // InternalMyDsl.g:915:1: ( ',' )
            {
            // InternalMyDsl.g:915:1: ( ',' )
            // InternalMyDsl.g:916:2: ','
            {
             before(grammarAccess.getPropertyAccess().getCommaKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // InternalMyDsl.g:925:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // InternalMyDsl.g:930:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // InternalMyDsl.g:937:1: rule__Property__Group__5__Impl : ( 'type' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( ( 'type' ) )
            // InternalMyDsl.g:942:1: ( 'type' )
            {
            // InternalMyDsl.g:942:1: ( 'type' )
            // InternalMyDsl.g:943:2: 'type'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__6"
    // InternalMyDsl.g:952:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // InternalMyDsl.g:957:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6"


    // $ANTLR start "rule__Property__Group__6__Impl"
    // InternalMyDsl.g:964:1: rule__Property__Group__6__Impl : ( '=' ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( '=' ) )
            // InternalMyDsl.g:969:1: ( '=' )
            {
            // InternalMyDsl.g:969:1: ( '=' )
            // InternalMyDsl.g:970:2: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6__Impl"


    // $ANTLR start "rule__Property__Group__7"
    // InternalMyDsl.g:979:1: rule__Property__Group__7 : rule__Property__Group__7__Impl rule__Property__Group__8 ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( rule__Property__Group__7__Impl rule__Property__Group__8 )
            // InternalMyDsl.g:984:2: rule__Property__Group__7__Impl rule__Property__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7"


    // $ANTLR start "rule__Property__Group__7__Impl"
    // InternalMyDsl.g:991:1: rule__Property__Group__7__Impl : ( ( rule__Property__TypeAssignment_7 ) ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( ( ( rule__Property__TypeAssignment_7 ) ) )
            // InternalMyDsl.g:996:1: ( ( rule__Property__TypeAssignment_7 ) )
            {
            // InternalMyDsl.g:996:1: ( ( rule__Property__TypeAssignment_7 ) )
            // InternalMyDsl.g:997:2: ( rule__Property__TypeAssignment_7 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_7()); 
            // InternalMyDsl.g:998:2: ( rule__Property__TypeAssignment_7 )
            // InternalMyDsl.g:998:3: rule__Property__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7__Impl"


    // $ANTLR start "rule__Property__Group__8"
    // InternalMyDsl.g:1006:1: rule__Property__Group__8 : rule__Property__Group__8__Impl rule__Property__Group__9 ;
    public final void rule__Property__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( rule__Property__Group__8__Impl rule__Property__Group__9 )
            // InternalMyDsl.g:1011:2: rule__Property__Group__8__Impl rule__Property__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Property__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8"


    // $ANTLR start "rule__Property__Group__8__Impl"
    // InternalMyDsl.g:1018:1: rule__Property__Group__8__Impl : ( ',' ) ;
    public final void rule__Property__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( ',' ) )
            // InternalMyDsl.g:1023:1: ( ',' )
            {
            // InternalMyDsl.g:1023:1: ( ',' )
            // InternalMyDsl.g:1024:2: ','
            {
             before(grammarAccess.getPropertyAccess().getCommaKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8__Impl"


    // $ANTLR start "rule__Property__Group__9"
    // InternalMyDsl.g:1033:1: rule__Property__Group__9 : rule__Property__Group__9__Impl rule__Property__Group__10 ;
    public final void rule__Property__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( rule__Property__Group__9__Impl rule__Property__Group__10 )
            // InternalMyDsl.g:1038:2: rule__Property__Group__9__Impl rule__Property__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__9"


    // $ANTLR start "rule__Property__Group__9__Impl"
    // InternalMyDsl.g:1045:1: rule__Property__Group__9__Impl : ( 'value' ) ;
    public final void rule__Property__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( 'value' ) )
            // InternalMyDsl.g:1050:1: ( 'value' )
            {
            // InternalMyDsl.g:1050:1: ( 'value' )
            // InternalMyDsl.g:1051:2: 'value'
            {
             before(grammarAccess.getPropertyAccess().getValueKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getValueKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__9__Impl"


    // $ANTLR start "rule__Property__Group__10"
    // InternalMyDsl.g:1060:1: rule__Property__Group__10 : rule__Property__Group__10__Impl rule__Property__Group__11 ;
    public final void rule__Property__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( rule__Property__Group__10__Impl rule__Property__Group__11 )
            // InternalMyDsl.g:1065:2: rule__Property__Group__10__Impl rule__Property__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Property__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__10"


    // $ANTLR start "rule__Property__Group__10__Impl"
    // InternalMyDsl.g:1072:1: rule__Property__Group__10__Impl : ( '=' ) ;
    public final void rule__Property__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( '=' ) )
            // InternalMyDsl.g:1077:1: ( '=' )
            {
            // InternalMyDsl.g:1077:1: ( '=' )
            // InternalMyDsl.g:1078:2: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__10__Impl"


    // $ANTLR start "rule__Property__Group__11"
    // InternalMyDsl.g:1087:1: rule__Property__Group__11 : rule__Property__Group__11__Impl ;
    public final void rule__Property__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( rule__Property__Group__11__Impl )
            // InternalMyDsl.g:1092:2: rule__Property__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__11"


    // $ANTLR start "rule__Property__Group__11__Impl"
    // InternalMyDsl.g:1098:1: rule__Property__Group__11__Impl : ( ( rule__Property__ValueAssignment_11 ) ) ;
    public final void rule__Property__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( ( rule__Property__ValueAssignment_11 ) ) )
            // InternalMyDsl.g:1103:1: ( ( rule__Property__ValueAssignment_11 ) )
            {
            // InternalMyDsl.g:1103:1: ( ( rule__Property__ValueAssignment_11 ) )
            // InternalMyDsl.g:1104:2: ( rule__Property__ValueAssignment_11 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_11()); 
            // InternalMyDsl.g:1105:2: ( rule__Property__ValueAssignment_11 )
            // InternalMyDsl.g:1105:3: rule__Property__ValueAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__11__Impl"


    // $ANTLR start "rule__Chapter__Group__0"
    // InternalMyDsl.g:1114:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // InternalMyDsl.g:1119:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Chapter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__0"


    // $ANTLR start "rule__Chapter__Group__0__Impl"
    // InternalMyDsl.g:1126:1: rule__Chapter__Group__0__Impl : ( 'CHAPTER' ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( ( 'CHAPTER' ) )
            // InternalMyDsl.g:1131:1: ( 'CHAPTER' )
            {
            // InternalMyDsl.g:1131:1: ( 'CHAPTER' )
            // InternalMyDsl.g:1132:2: 'CHAPTER'
            {
             before(grammarAccess.getChapterAccess().getCHAPTERKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getCHAPTERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__0__Impl"


    // $ANTLR start "rule__Chapter__Group__1"
    // InternalMyDsl.g:1141:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // InternalMyDsl.g:1146:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Chapter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__1"


    // $ANTLR start "rule__Chapter__Group__1__Impl"
    // InternalMyDsl.g:1153:1: rule__Chapter__Group__1__Impl : ( 'id' ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( ( 'id' ) )
            // InternalMyDsl.g:1158:1: ( 'id' )
            {
            // InternalMyDsl.g:1158:1: ( 'id' )
            // InternalMyDsl.g:1159:2: 'id'
            {
             before(grammarAccess.getChapterAccess().getIdKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__1__Impl"


    // $ANTLR start "rule__Chapter__Group__2"
    // InternalMyDsl.g:1168:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // InternalMyDsl.g:1173:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Chapter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__2"


    // $ANTLR start "rule__Chapter__Group__2__Impl"
    // InternalMyDsl.g:1180:1: rule__Chapter__Group__2__Impl : ( '=' ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( ( '=' ) )
            // InternalMyDsl.g:1185:1: ( '=' )
            {
            // InternalMyDsl.g:1185:1: ( '=' )
            // InternalMyDsl.g:1186:2: '='
            {
             before(grammarAccess.getChapterAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__2__Impl"


    // $ANTLR start "rule__Chapter__Group__3"
    // InternalMyDsl.g:1195:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // InternalMyDsl.g:1200:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Chapter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__3"


    // $ANTLR start "rule__Chapter__Group__3__Impl"
    // InternalMyDsl.g:1207:1: rule__Chapter__Group__3__Impl : ( ( rule__Chapter__NameAssignment_3 ) ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( ( ( rule__Chapter__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1212:1: ( ( rule__Chapter__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1212:1: ( ( rule__Chapter__NameAssignment_3 ) )
            // InternalMyDsl.g:1213:2: ( rule__Chapter__NameAssignment_3 )
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1214:2: ( rule__Chapter__NameAssignment_3 )
            // InternalMyDsl.g:1214:3: rule__Chapter__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__3__Impl"


    // $ANTLR start "rule__Chapter__Group__4"
    // InternalMyDsl.g:1222:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl rule__Chapter__Group__5 ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( rule__Chapter__Group__4__Impl rule__Chapter__Group__5 )
            // InternalMyDsl.g:1227:2: rule__Chapter__Group__4__Impl rule__Chapter__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Chapter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__4"


    // $ANTLR start "rule__Chapter__Group__4__Impl"
    // InternalMyDsl.g:1234:1: rule__Chapter__Group__4__Impl : ( ',' ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( ( ',' ) )
            // InternalMyDsl.g:1239:1: ( ',' )
            {
            // InternalMyDsl.g:1239:1: ( ',' )
            // InternalMyDsl.g:1240:2: ','
            {
             before(grammarAccess.getChapterAccess().getCommaKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__4__Impl"


    // $ANTLR start "rule__Chapter__Group__5"
    // InternalMyDsl.g:1249:1: rule__Chapter__Group__5 : rule__Chapter__Group__5__Impl rule__Chapter__Group__6 ;
    public final void rule__Chapter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( rule__Chapter__Group__5__Impl rule__Chapter__Group__6 )
            // InternalMyDsl.g:1254:2: rule__Chapter__Group__5__Impl rule__Chapter__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Chapter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__5"


    // $ANTLR start "rule__Chapter__Group__5__Impl"
    // InternalMyDsl.g:1261:1: rule__Chapter__Group__5__Impl : ( 'entrances' ) ;
    public final void rule__Chapter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( 'entrances' ) )
            // InternalMyDsl.g:1266:1: ( 'entrances' )
            {
            // InternalMyDsl.g:1266:1: ( 'entrances' )
            // InternalMyDsl.g:1267:2: 'entrances'
            {
             before(grammarAccess.getChapterAccess().getEntrancesKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getEntrancesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__5__Impl"


    // $ANTLR start "rule__Chapter__Group__6"
    // InternalMyDsl.g:1276:1: rule__Chapter__Group__6 : rule__Chapter__Group__6__Impl rule__Chapter__Group__7 ;
    public final void rule__Chapter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( rule__Chapter__Group__6__Impl rule__Chapter__Group__7 )
            // InternalMyDsl.g:1281:2: rule__Chapter__Group__6__Impl rule__Chapter__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Chapter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__6"


    // $ANTLR start "rule__Chapter__Group__6__Impl"
    // InternalMyDsl.g:1288:1: rule__Chapter__Group__6__Impl : ( '=' ) ;
    public final void rule__Chapter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( ( '=' ) )
            // InternalMyDsl.g:1293:1: ( '=' )
            {
            // InternalMyDsl.g:1293:1: ( '=' )
            // InternalMyDsl.g:1294:2: '='
            {
             before(grammarAccess.getChapterAccess().getEqualsSignKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__6__Impl"


    // $ANTLR start "rule__Chapter__Group__7"
    // InternalMyDsl.g:1303:1: rule__Chapter__Group__7 : rule__Chapter__Group__7__Impl rule__Chapter__Group__8 ;
    public final void rule__Chapter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( rule__Chapter__Group__7__Impl rule__Chapter__Group__8 )
            // InternalMyDsl.g:1308:2: rule__Chapter__Group__7__Impl rule__Chapter__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Chapter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__7"


    // $ANTLR start "rule__Chapter__Group__7__Impl"
    // InternalMyDsl.g:1315:1: rule__Chapter__Group__7__Impl : ( '(' ) ;
    public final void rule__Chapter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( ( '(' ) )
            // InternalMyDsl.g:1320:1: ( '(' )
            {
            // InternalMyDsl.g:1320:1: ( '(' )
            // InternalMyDsl.g:1321:2: '('
            {
             before(grammarAccess.getChapterAccess().getLeftParenthesisKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__7__Impl"


    // $ANTLR start "rule__Chapter__Group__8"
    // InternalMyDsl.g:1330:1: rule__Chapter__Group__8 : rule__Chapter__Group__8__Impl rule__Chapter__Group__9 ;
    public final void rule__Chapter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( rule__Chapter__Group__8__Impl rule__Chapter__Group__9 )
            // InternalMyDsl.g:1335:2: rule__Chapter__Group__8__Impl rule__Chapter__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Chapter__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__8"


    // $ANTLR start "rule__Chapter__Group__8__Impl"
    // InternalMyDsl.g:1342:1: rule__Chapter__Group__8__Impl : ( ( rule__Chapter__EntrancesAssignment_8 ) ) ;
    public final void rule__Chapter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( ( ( rule__Chapter__EntrancesAssignment_8 ) ) )
            // InternalMyDsl.g:1347:1: ( ( rule__Chapter__EntrancesAssignment_8 ) )
            {
            // InternalMyDsl.g:1347:1: ( ( rule__Chapter__EntrancesAssignment_8 ) )
            // InternalMyDsl.g:1348:2: ( rule__Chapter__EntrancesAssignment_8 )
            {
             before(grammarAccess.getChapterAccess().getEntrancesAssignment_8()); 
            // InternalMyDsl.g:1349:2: ( rule__Chapter__EntrancesAssignment_8 )
            // InternalMyDsl.g:1349:3: rule__Chapter__EntrancesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__EntrancesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getEntrancesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__8__Impl"


    // $ANTLR start "rule__Chapter__Group__9"
    // InternalMyDsl.g:1357:1: rule__Chapter__Group__9 : rule__Chapter__Group__9__Impl rule__Chapter__Group__10 ;
    public final void rule__Chapter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( rule__Chapter__Group__9__Impl rule__Chapter__Group__10 )
            // InternalMyDsl.g:1362:2: rule__Chapter__Group__9__Impl rule__Chapter__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Chapter__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__9"


    // $ANTLR start "rule__Chapter__Group__9__Impl"
    // InternalMyDsl.g:1369:1: rule__Chapter__Group__9__Impl : ( ')' ) ;
    public final void rule__Chapter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( ( ')' ) )
            // InternalMyDsl.g:1374:1: ( ')' )
            {
            // InternalMyDsl.g:1374:1: ( ')' )
            // InternalMyDsl.g:1375:2: ')'
            {
             before(grammarAccess.getChapterAccess().getRightParenthesisKeyword_9()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__9__Impl"


    // $ANTLR start "rule__Chapter__Group__10"
    // InternalMyDsl.g:1384:1: rule__Chapter__Group__10 : rule__Chapter__Group__10__Impl rule__Chapter__Group__11 ;
    public final void rule__Chapter__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( rule__Chapter__Group__10__Impl rule__Chapter__Group__11 )
            // InternalMyDsl.g:1389:2: rule__Chapter__Group__10__Impl rule__Chapter__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__Chapter__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__10"


    // $ANTLR start "rule__Chapter__Group__10__Impl"
    // InternalMyDsl.g:1396:1: rule__Chapter__Group__10__Impl : ( '{' ) ;
    public final void rule__Chapter__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( ( '{' ) )
            // InternalMyDsl.g:1401:1: ( '{' )
            {
            // InternalMyDsl.g:1401:1: ( '{' )
            // InternalMyDsl.g:1402:2: '{'
            {
             before(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__10__Impl"


    // $ANTLR start "rule__Chapter__Group__11"
    // InternalMyDsl.g:1411:1: rule__Chapter__Group__11 : rule__Chapter__Group__11__Impl rule__Chapter__Group__12 ;
    public final void rule__Chapter__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( rule__Chapter__Group__11__Impl rule__Chapter__Group__12 )
            // InternalMyDsl.g:1416:2: rule__Chapter__Group__11__Impl rule__Chapter__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Chapter__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__11"


    // $ANTLR start "rule__Chapter__Group__11__Impl"
    // InternalMyDsl.g:1423:1: rule__Chapter__Group__11__Impl : ( ( ( rule__Chapter__ScenariosAssignment_11 ) ) ( ( rule__Chapter__ScenariosAssignment_11 )* ) ) ;
    public final void rule__Chapter__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( ( ( ( rule__Chapter__ScenariosAssignment_11 ) ) ( ( rule__Chapter__ScenariosAssignment_11 )* ) ) )
            // InternalMyDsl.g:1428:1: ( ( ( rule__Chapter__ScenariosAssignment_11 ) ) ( ( rule__Chapter__ScenariosAssignment_11 )* ) )
            {
            // InternalMyDsl.g:1428:1: ( ( ( rule__Chapter__ScenariosAssignment_11 ) ) ( ( rule__Chapter__ScenariosAssignment_11 )* ) )
            // InternalMyDsl.g:1429:2: ( ( rule__Chapter__ScenariosAssignment_11 ) ) ( ( rule__Chapter__ScenariosAssignment_11 )* )
            {
            // InternalMyDsl.g:1429:2: ( ( rule__Chapter__ScenariosAssignment_11 ) )
            // InternalMyDsl.g:1430:3: ( rule__Chapter__ScenariosAssignment_11 )
            {
             before(grammarAccess.getChapterAccess().getScenariosAssignment_11()); 
            // InternalMyDsl.g:1431:3: ( rule__Chapter__ScenariosAssignment_11 )
            // InternalMyDsl.g:1431:4: rule__Chapter__ScenariosAssignment_11
            {
            pushFollow(FOLLOW_24);
            rule__Chapter__ScenariosAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getScenariosAssignment_11()); 

            }

            // InternalMyDsl.g:1434:2: ( ( rule__Chapter__ScenariosAssignment_11 )* )
            // InternalMyDsl.g:1435:3: ( rule__Chapter__ScenariosAssignment_11 )*
            {
             before(grammarAccess.getChapterAccess().getScenariosAssignment_11()); 
            // InternalMyDsl.g:1436:3: ( rule__Chapter__ScenariosAssignment_11 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1436:4: rule__Chapter__ScenariosAssignment_11
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Chapter__ScenariosAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getScenariosAssignment_11()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__11__Impl"


    // $ANTLR start "rule__Chapter__Group__12"
    // InternalMyDsl.g:1445:1: rule__Chapter__Group__12 : rule__Chapter__Group__12__Impl ;
    public final void rule__Chapter__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( rule__Chapter__Group__12__Impl )
            // InternalMyDsl.g:1450:2: rule__Chapter__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__12"


    // $ANTLR start "rule__Chapter__Group__12__Impl"
    // InternalMyDsl.g:1456:1: rule__Chapter__Group__12__Impl : ( '}' ) ;
    public final void rule__Chapter__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( '}' ) )
            // InternalMyDsl.g:1461:1: ( '}' )
            {
            // InternalMyDsl.g:1461:1: ( '}' )
            // InternalMyDsl.g:1462:2: '}'
            {
             before(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__12__Impl"


    // $ANTLR start "rule__StartPoint__Group__0"
    // InternalMyDsl.g:1472:1: rule__StartPoint__Group__0 : rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1 ;
    public final void rule__StartPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1 )
            // InternalMyDsl.g:1477:2: rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__StartPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__0"


    // $ANTLR start "rule__StartPoint__Group__0__Impl"
    // InternalMyDsl.g:1484:1: rule__StartPoint__Group__0__Impl : ( ( rule__StartPoint__NameAssignment_0 ) ) ;
    public final void rule__StartPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( ( rule__StartPoint__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1489:1: ( ( rule__StartPoint__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1489:1: ( ( rule__StartPoint__NameAssignment_0 ) )
            // InternalMyDsl.g:1490:2: ( rule__StartPoint__NameAssignment_0 )
            {
             before(grammarAccess.getStartPointAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1491:2: ( rule__StartPoint__NameAssignment_0 )
            // InternalMyDsl.g:1491:3: rule__StartPoint__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StartPoint__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__0__Impl"


    // $ANTLR start "rule__StartPoint__Group__1"
    // InternalMyDsl.g:1499:1: rule__StartPoint__Group__1 : rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2 ;
    public final void rule__StartPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2 )
            // InternalMyDsl.g:1504:2: rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StartPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__1"


    // $ANTLR start "rule__StartPoint__Group__1__Impl"
    // InternalMyDsl.g:1511:1: rule__StartPoint__Group__1__Impl : ( ',' ) ;
    public final void rule__StartPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( ',' ) )
            // InternalMyDsl.g:1516:1: ( ',' )
            {
            // InternalMyDsl.g:1516:1: ( ',' )
            // InternalMyDsl.g:1517:2: ','
            {
             before(grammarAccess.getStartPointAccess().getCommaKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStartPointAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__1__Impl"


    // $ANTLR start "rule__StartPoint__Group__2"
    // InternalMyDsl.g:1526:1: rule__StartPoint__Group__2 : rule__StartPoint__Group__2__Impl ;
    public final void rule__StartPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( rule__StartPoint__Group__2__Impl )
            // InternalMyDsl.g:1531:2: rule__StartPoint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__2"


    // $ANTLR start "rule__StartPoint__Group__2__Impl"
    // InternalMyDsl.g:1537:1: rule__StartPoint__Group__2__Impl : ( ( rule__StartPoint__ScenarioIdAssignment_2 ) ) ;
    public final void rule__StartPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( ( ( rule__StartPoint__ScenarioIdAssignment_2 ) ) )
            // InternalMyDsl.g:1542:1: ( ( rule__StartPoint__ScenarioIdAssignment_2 ) )
            {
            // InternalMyDsl.g:1542:1: ( ( rule__StartPoint__ScenarioIdAssignment_2 ) )
            // InternalMyDsl.g:1543:2: ( rule__StartPoint__ScenarioIdAssignment_2 )
            {
             before(grammarAccess.getStartPointAccess().getScenarioIdAssignment_2()); 
            // InternalMyDsl.g:1544:2: ( rule__StartPoint__ScenarioIdAssignment_2 )
            // InternalMyDsl.g:1544:3: rule__StartPoint__ScenarioIdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartPoint__ScenarioIdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getScenarioIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalMyDsl.g:1553:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalMyDsl.g:1558:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalMyDsl.g:1565:1: rule__Scenario__Group__0__Impl : ( 'SCENARIO' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( 'SCENARIO' ) )
            // InternalMyDsl.g:1570:1: ( 'SCENARIO' )
            {
            // InternalMyDsl.g:1570:1: ( 'SCENARIO' )
            // InternalMyDsl.g:1571:2: 'SCENARIO'
            {
             before(grammarAccess.getScenarioAccess().getSCENARIOKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getSCENARIOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalMyDsl.g:1580:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalMyDsl.g:1585:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalMyDsl.g:1592:1: rule__Scenario__Group__1__Impl : ( 'id' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( ( 'id' ) )
            // InternalMyDsl.g:1597:1: ( 'id' )
            {
            // InternalMyDsl.g:1597:1: ( 'id' )
            // InternalMyDsl.g:1598:2: 'id'
            {
             before(grammarAccess.getScenarioAccess().getIdKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalMyDsl.g:1607:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalMyDsl.g:1612:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalMyDsl.g:1619:1: rule__Scenario__Group__2__Impl : ( '=' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( '=' ) )
            // InternalMyDsl.g:1624:1: ( '=' )
            {
            // InternalMyDsl.g:1624:1: ( '=' )
            // InternalMyDsl.g:1625:2: '='
            {
             before(grammarAccess.getScenarioAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalMyDsl.g:1634:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalMyDsl.g:1639:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalMyDsl.g:1646:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__NameAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( ( rule__Scenario__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1651:1: ( ( rule__Scenario__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1651:1: ( ( rule__Scenario__NameAssignment_3 ) )
            // InternalMyDsl.g:1652:2: ( rule__Scenario__NameAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1653:2: ( rule__Scenario__NameAssignment_3 )
            // InternalMyDsl.g:1653:3: rule__Scenario__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // InternalMyDsl.g:1661:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalMyDsl.g:1666:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Scenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalMyDsl.g:1673:1: rule__Scenario__Group__4__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( ( '{' ) )
            // InternalMyDsl.g:1678:1: ( '{' )
            {
            // InternalMyDsl.g:1678:1: ( '{' )
            // InternalMyDsl.g:1679:2: '{'
            {
             before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__5"
    // InternalMyDsl.g:1688:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl rule__Scenario__Group__6 ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( rule__Scenario__Group__5__Impl rule__Scenario__Group__6 )
            // InternalMyDsl.g:1693:2: rule__Scenario__Group__5__Impl rule__Scenario__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Scenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__5"


    // $ANTLR start "rule__Scenario__Group__5__Impl"
    // InternalMyDsl.g:1700:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__TextAssignment_5 )? ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( ( rule__Scenario__TextAssignment_5 )? ) )
            // InternalMyDsl.g:1705:1: ( ( rule__Scenario__TextAssignment_5 )? )
            {
            // InternalMyDsl.g:1705:1: ( ( rule__Scenario__TextAssignment_5 )? )
            // InternalMyDsl.g:1706:2: ( rule__Scenario__TextAssignment_5 )?
            {
             before(grammarAccess.getScenarioAccess().getTextAssignment_5()); 
            // InternalMyDsl.g:1707:2: ( rule__Scenario__TextAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1707:3: rule__Scenario__TextAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__TextAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getTextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__5__Impl"


    // $ANTLR start "rule__Scenario__Group__6"
    // InternalMyDsl.g:1715:1: rule__Scenario__Group__6 : rule__Scenario__Group__6__Impl rule__Scenario__Group__7 ;
    public final void rule__Scenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( rule__Scenario__Group__6__Impl rule__Scenario__Group__7 )
            // InternalMyDsl.g:1720:2: rule__Scenario__Group__6__Impl rule__Scenario__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Scenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__6"


    // $ANTLR start "rule__Scenario__Group__6__Impl"
    // InternalMyDsl.g:1727:1: rule__Scenario__Group__6__Impl : ( ( rule__Scenario__Alternatives_6 ) ) ;
    public final void rule__Scenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( ( ( rule__Scenario__Alternatives_6 ) ) )
            // InternalMyDsl.g:1732:1: ( ( rule__Scenario__Alternatives_6 ) )
            {
            // InternalMyDsl.g:1732:1: ( ( rule__Scenario__Alternatives_6 ) )
            // InternalMyDsl.g:1733:2: ( rule__Scenario__Alternatives_6 )
            {
             before(grammarAccess.getScenarioAccess().getAlternatives_6()); 
            // InternalMyDsl.g:1734:2: ( rule__Scenario__Alternatives_6 )
            // InternalMyDsl.g:1734:3: rule__Scenario__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__6__Impl"


    // $ANTLR start "rule__Scenario__Group__7"
    // InternalMyDsl.g:1742:1: rule__Scenario__Group__7 : rule__Scenario__Group__7__Impl ;
    public final void rule__Scenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( rule__Scenario__Group__7__Impl )
            // InternalMyDsl.g:1747:2: rule__Scenario__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__7"


    // $ANTLR start "rule__Scenario__Group__7__Impl"
    // InternalMyDsl.g:1753:1: rule__Scenario__Group__7__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( ( '}' ) )
            // InternalMyDsl.g:1758:1: ( '}' )
            {
            // InternalMyDsl.g:1758:1: ( '}' )
            // InternalMyDsl.g:1759:2: '}'
            {
             before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__7__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalMyDsl.g:1769:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalMyDsl.g:1774:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalMyDsl.g:1781:1: rule__Text__Group__0__Impl : ( 'TEXT' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( ( 'TEXT' ) )
            // InternalMyDsl.g:1786:1: ( 'TEXT' )
            {
            // InternalMyDsl.g:1786:1: ( 'TEXT' )
            // InternalMyDsl.g:1787:2: 'TEXT'
            {
             before(grammarAccess.getTextAccess().getTEXTKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTEXTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalMyDsl.g:1796:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( rule__Text__Group__1__Impl )
            // InternalMyDsl.g:1801:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalMyDsl.g:1807:1: rule__Text__Group__1__Impl : ( ( rule__Text__TextAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( ( ( rule__Text__TextAssignment_1 ) ) )
            // InternalMyDsl.g:1812:1: ( ( rule__Text__TextAssignment_1 ) )
            {
            // InternalMyDsl.g:1812:1: ( ( rule__Text__TextAssignment_1 ) )
            // InternalMyDsl.g:1813:2: ( rule__Text__TextAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1()); 
            // InternalMyDsl.g:1814:2: ( rule__Text__TextAssignment_1 )
            // InternalMyDsl.g:1814:3: rule__Text__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // InternalMyDsl.g:1823:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalMyDsl.g:1828:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // InternalMyDsl.g:1835:1: rule__Choice__Group__0__Impl : ( 'CHOICE' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1839:1: ( ( 'CHOICE' ) )
            // InternalMyDsl.g:1840:1: ( 'CHOICE' )
            {
            // InternalMyDsl.g:1840:1: ( 'CHOICE' )
            // InternalMyDsl.g:1841:2: 'CHOICE'
            {
             before(grammarAccess.getChoiceAccess().getCHOICEKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getCHOICEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // InternalMyDsl.g:1850:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalMyDsl.g:1855:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // InternalMyDsl.g:1862:1: rule__Choice__Group__1__Impl : ( 'scenarioId' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( ( 'scenarioId' ) )
            // InternalMyDsl.g:1867:1: ( 'scenarioId' )
            {
            // InternalMyDsl.g:1867:1: ( 'scenarioId' )
            // InternalMyDsl.g:1868:2: 'scenarioId'
            {
             before(grammarAccess.getChoiceAccess().getScenarioIdKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getScenarioIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // InternalMyDsl.g:1877:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalMyDsl.g:1882:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Choice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // InternalMyDsl.g:1889:1: rule__Choice__Group__2__Impl : ( '=' ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1893:1: ( ( '=' ) )
            // InternalMyDsl.g:1894:1: ( '=' )
            {
            // InternalMyDsl.g:1894:1: ( '=' )
            // InternalMyDsl.g:1895:2: '='
            {
             before(grammarAccess.getChoiceAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__3"
    // InternalMyDsl.g:1904:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalMyDsl.g:1909:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Choice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3"


    // $ANTLR start "rule__Choice__Group__3__Impl"
    // InternalMyDsl.g:1916:1: rule__Choice__Group__3__Impl : ( ( rule__Choice__ScenarioIdAssignment_3 ) ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( ( rule__Choice__ScenarioIdAssignment_3 ) ) )
            // InternalMyDsl.g:1921:1: ( ( rule__Choice__ScenarioIdAssignment_3 ) )
            {
            // InternalMyDsl.g:1921:1: ( ( rule__Choice__ScenarioIdAssignment_3 ) )
            // InternalMyDsl.g:1922:2: ( rule__Choice__ScenarioIdAssignment_3 )
            {
             before(grammarAccess.getChoiceAccess().getScenarioIdAssignment_3()); 
            // InternalMyDsl.g:1923:2: ( rule__Choice__ScenarioIdAssignment_3 )
            // InternalMyDsl.g:1923:3: rule__Choice__ScenarioIdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Choice__ScenarioIdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getScenarioIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3__Impl"


    // $ANTLR start "rule__Choice__Group__4"
    // InternalMyDsl.g:1931:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalMyDsl.g:1936:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Choice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__4"


    // $ANTLR start "rule__Choice__Group__4__Impl"
    // InternalMyDsl.g:1943:1: rule__Choice__Group__4__Impl : ( ',' ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( ',' ) )
            // InternalMyDsl.g:1948:1: ( ',' )
            {
            // InternalMyDsl.g:1948:1: ( ',' )
            // InternalMyDsl.g:1949:2: ','
            {
             before(grammarAccess.getChoiceAccess().getCommaKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__4__Impl"


    // $ANTLR start "rule__Choice__Group__5"
    // InternalMyDsl.g:1958:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalMyDsl.g:1963:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Choice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__5"


    // $ANTLR start "rule__Choice__Group__5__Impl"
    // InternalMyDsl.g:1970:1: rule__Choice__Group__5__Impl : ( 'description' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1974:1: ( ( 'description' ) )
            // InternalMyDsl.g:1975:1: ( 'description' )
            {
            // InternalMyDsl.g:1975:1: ( 'description' )
            // InternalMyDsl.g:1976:2: 'description'
            {
             before(grammarAccess.getChoiceAccess().getDescriptionKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getDescriptionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__5__Impl"


    // $ANTLR start "rule__Choice__Group__6"
    // InternalMyDsl.g:1985:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl rule__Choice__Group__7 ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( rule__Choice__Group__6__Impl rule__Choice__Group__7 )
            // InternalMyDsl.g:1990:2: rule__Choice__Group__6__Impl rule__Choice__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Choice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__6"


    // $ANTLR start "rule__Choice__Group__6__Impl"
    // InternalMyDsl.g:1997:1: rule__Choice__Group__6__Impl : ( '=' ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( ( '=' ) )
            // InternalMyDsl.g:2002:1: ( '=' )
            {
            // InternalMyDsl.g:2002:1: ( '=' )
            // InternalMyDsl.g:2003:2: '='
            {
             before(grammarAccess.getChoiceAccess().getEqualsSignKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__6__Impl"


    // $ANTLR start "rule__Choice__Group__7"
    // InternalMyDsl.g:2012:1: rule__Choice__Group__7 : rule__Choice__Group__7__Impl rule__Choice__Group__8 ;
    public final void rule__Choice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( rule__Choice__Group__7__Impl rule__Choice__Group__8 )
            // InternalMyDsl.g:2017:2: rule__Choice__Group__7__Impl rule__Choice__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Choice__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__7"


    // $ANTLR start "rule__Choice__Group__7__Impl"
    // InternalMyDsl.g:2024:1: rule__Choice__Group__7__Impl : ( ( rule__Choice__DescriptionAssignment_7 ) ) ;
    public final void rule__Choice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( ( ( rule__Choice__DescriptionAssignment_7 ) ) )
            // InternalMyDsl.g:2029:1: ( ( rule__Choice__DescriptionAssignment_7 ) )
            {
            // InternalMyDsl.g:2029:1: ( ( rule__Choice__DescriptionAssignment_7 ) )
            // InternalMyDsl.g:2030:2: ( rule__Choice__DescriptionAssignment_7 )
            {
             before(grammarAccess.getChoiceAccess().getDescriptionAssignment_7()); 
            // InternalMyDsl.g:2031:2: ( rule__Choice__DescriptionAssignment_7 )
            // InternalMyDsl.g:2031:3: rule__Choice__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Choice__DescriptionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__7__Impl"


    // $ANTLR start "rule__Choice__Group__8"
    // InternalMyDsl.g:2039:1: rule__Choice__Group__8 : rule__Choice__Group__8__Impl ;
    public final void rule__Choice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( rule__Choice__Group__8__Impl )
            // InternalMyDsl.g:2044:2: rule__Choice__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__8"


    // $ANTLR start "rule__Choice__Group__8__Impl"
    // InternalMyDsl.g:2050:1: rule__Choice__Group__8__Impl : ( ( rule__Choice__Group_8__0 )? ) ;
    public final void rule__Choice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( ( ( rule__Choice__Group_8__0 )? ) )
            // InternalMyDsl.g:2055:1: ( ( rule__Choice__Group_8__0 )? )
            {
            // InternalMyDsl.g:2055:1: ( ( rule__Choice__Group_8__0 )? )
            // InternalMyDsl.g:2056:2: ( rule__Choice__Group_8__0 )?
            {
             before(grammarAccess.getChoiceAccess().getGroup_8()); 
            // InternalMyDsl.g:2057:2: ( rule__Choice__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:2057:3: rule__Choice__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choice__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__8__Impl"


    // $ANTLR start "rule__Choice__Group_8__0"
    // InternalMyDsl.g:2066:1: rule__Choice__Group_8__0 : rule__Choice__Group_8__0__Impl rule__Choice__Group_8__1 ;
    public final void rule__Choice__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( rule__Choice__Group_8__0__Impl rule__Choice__Group_8__1 )
            // InternalMyDsl.g:2071:2: rule__Choice__Group_8__0__Impl rule__Choice__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Choice__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8__0"


    // $ANTLR start "rule__Choice__Group_8__0__Impl"
    // InternalMyDsl.g:2078:1: rule__Choice__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Choice__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( ',' ) )
            // InternalMyDsl.g:2083:1: ( ',' )
            {
            // InternalMyDsl.g:2083:1: ( ',' )
            // InternalMyDsl.g:2084:2: ','
            {
             before(grammarAccess.getChoiceAccess().getCommaKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8__0__Impl"


    // $ANTLR start "rule__Choice__Group_8__1"
    // InternalMyDsl.g:2093:1: rule__Choice__Group_8__1 : rule__Choice__Group_8__1__Impl rule__Choice__Group_8__2 ;
    public final void rule__Choice__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( rule__Choice__Group_8__1__Impl rule__Choice__Group_8__2 )
            // InternalMyDsl.g:2098:2: rule__Choice__Group_8__1__Impl rule__Choice__Group_8__2
            {
            pushFollow(FOLLOW_14);
            rule__Choice__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8__1"


    // $ANTLR start "rule__Choice__Group_8__1__Impl"
    // InternalMyDsl.g:2105:1: rule__Choice__Group_8__1__Impl : ( ( rule__Choice__StateChangesAssignment_8_1 ) ) ;
    public final void rule__Choice__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( ( rule__Choice__StateChangesAssignment_8_1 ) ) )
            // InternalMyDsl.g:2110:1: ( ( rule__Choice__StateChangesAssignment_8_1 ) )
            {
            // InternalMyDsl.g:2110:1: ( ( rule__Choice__StateChangesAssignment_8_1 ) )
            // InternalMyDsl.g:2111:2: ( rule__Choice__StateChangesAssignment_8_1 )
            {
             before(grammarAccess.getChoiceAccess().getStateChangesAssignment_8_1()); 
            // InternalMyDsl.g:2112:2: ( rule__Choice__StateChangesAssignment_8_1 )
            // InternalMyDsl.g:2112:3: rule__Choice__StateChangesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Choice__StateChangesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getStateChangesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8__1__Impl"


    // $ANTLR start "rule__Choice__Group_8__2"
    // InternalMyDsl.g:2120:1: rule__Choice__Group_8__2 : rule__Choice__Group_8__2__Impl ;
    public final void rule__Choice__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( rule__Choice__Group_8__2__Impl )
            // InternalMyDsl.g:2125:2: rule__Choice__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8__2"


    // $ANTLR start "rule__Choice__Group_8__2__Impl"
    // InternalMyDsl.g:2131:1: rule__Choice__Group_8__2__Impl : ( ( rule__Choice__Group_8_2__0 )* ) ;
    public final void rule__Choice__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( ( ( rule__Choice__Group_8_2__0 )* ) )
            // InternalMyDsl.g:2136:1: ( ( rule__Choice__Group_8_2__0 )* )
            {
            // InternalMyDsl.g:2136:1: ( ( rule__Choice__Group_8_2__0 )* )
            // InternalMyDsl.g:2137:2: ( rule__Choice__Group_8_2__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_8_2()); 
            // InternalMyDsl.g:2138:2: ( rule__Choice__Group_8_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2138:3: rule__Choice__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Choice__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getChoiceAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8__2__Impl"


    // $ANTLR start "rule__Choice__Group_8_2__0"
    // InternalMyDsl.g:2147:1: rule__Choice__Group_8_2__0 : rule__Choice__Group_8_2__0__Impl rule__Choice__Group_8_2__1 ;
    public final void rule__Choice__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( rule__Choice__Group_8_2__0__Impl rule__Choice__Group_8_2__1 )
            // InternalMyDsl.g:2152:2: rule__Choice__Group_8_2__0__Impl rule__Choice__Group_8_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Choice__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8_2__0"


    // $ANTLR start "rule__Choice__Group_8_2__0__Impl"
    // InternalMyDsl.g:2159:1: rule__Choice__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Choice__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( ( ',' ) )
            // InternalMyDsl.g:2164:1: ( ',' )
            {
            // InternalMyDsl.g:2164:1: ( ',' )
            // InternalMyDsl.g:2165:2: ','
            {
             before(grammarAccess.getChoiceAccess().getCommaKeyword_8_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8_2__0__Impl"


    // $ANTLR start "rule__Choice__Group_8_2__1"
    // InternalMyDsl.g:2174:1: rule__Choice__Group_8_2__1 : rule__Choice__Group_8_2__1__Impl ;
    public final void rule__Choice__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( rule__Choice__Group_8_2__1__Impl )
            // InternalMyDsl.g:2179:2: rule__Choice__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8_2__1"


    // $ANTLR start "rule__Choice__Group_8_2__1__Impl"
    // InternalMyDsl.g:2185:1: rule__Choice__Group_8_2__1__Impl : ( ( rule__Choice__StateChangesAssignment_8_2_1 ) ) ;
    public final void rule__Choice__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( ( ( rule__Choice__StateChangesAssignment_8_2_1 ) ) )
            // InternalMyDsl.g:2190:1: ( ( rule__Choice__StateChangesAssignment_8_2_1 ) )
            {
            // InternalMyDsl.g:2190:1: ( ( rule__Choice__StateChangesAssignment_8_2_1 ) )
            // InternalMyDsl.g:2191:2: ( rule__Choice__StateChangesAssignment_8_2_1 )
            {
             before(grammarAccess.getChoiceAccess().getStateChangesAssignment_8_2_1()); 
            // InternalMyDsl.g:2192:2: ( rule__Choice__StateChangesAssignment_8_2_1 )
            // InternalMyDsl.g:2192:3: rule__Choice__StateChangesAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Choice__StateChangesAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getStateChangesAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_8_2__1__Impl"


    // $ANTLR start "rule__StateChange__Group__0"
    // InternalMyDsl.g:2201:1: rule__StateChange__Group__0 : rule__StateChange__Group__0__Impl rule__StateChange__Group__1 ;
    public final void rule__StateChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( rule__StateChange__Group__0__Impl rule__StateChange__Group__1 )
            // InternalMyDsl.g:2206:2: rule__StateChange__Group__0__Impl rule__StateChange__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__StateChange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateChange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__Group__0"


    // $ANTLR start "rule__StateChange__Group__0__Impl"
    // InternalMyDsl.g:2213:1: rule__StateChange__Group__0__Impl : ( ( rule__StateChange__VariableAssignment_0 ) ) ;
    public final void rule__StateChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2217:1: ( ( ( rule__StateChange__VariableAssignment_0 ) ) )
            // InternalMyDsl.g:2218:1: ( ( rule__StateChange__VariableAssignment_0 ) )
            {
            // InternalMyDsl.g:2218:1: ( ( rule__StateChange__VariableAssignment_0 ) )
            // InternalMyDsl.g:2219:2: ( rule__StateChange__VariableAssignment_0 )
            {
             before(grammarAccess.getStateChangeAccess().getVariableAssignment_0()); 
            // InternalMyDsl.g:2220:2: ( rule__StateChange__VariableAssignment_0 )
            // InternalMyDsl.g:2220:3: rule__StateChange__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StateChange__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateChangeAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__Group__0__Impl"


    // $ANTLR start "rule__StateChange__Group__1"
    // InternalMyDsl.g:2228:1: rule__StateChange__Group__1 : rule__StateChange__Group__1__Impl rule__StateChange__Group__2 ;
    public final void rule__StateChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2232:1: ( rule__StateChange__Group__1__Impl rule__StateChange__Group__2 )
            // InternalMyDsl.g:2233:2: rule__StateChange__Group__1__Impl rule__StateChange__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__StateChange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateChange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__Group__1"


    // $ANTLR start "rule__StateChange__Group__1__Impl"
    // InternalMyDsl.g:2240:1: rule__StateChange__Group__1__Impl : ( ( rule__StateChange__OperatorAssignment_1 ) ) ;
    public final void rule__StateChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2244:1: ( ( ( rule__StateChange__OperatorAssignment_1 ) ) )
            // InternalMyDsl.g:2245:1: ( ( rule__StateChange__OperatorAssignment_1 ) )
            {
            // InternalMyDsl.g:2245:1: ( ( rule__StateChange__OperatorAssignment_1 ) )
            // InternalMyDsl.g:2246:2: ( rule__StateChange__OperatorAssignment_1 )
            {
             before(grammarAccess.getStateChangeAccess().getOperatorAssignment_1()); 
            // InternalMyDsl.g:2247:2: ( rule__StateChange__OperatorAssignment_1 )
            // InternalMyDsl.g:2247:3: rule__StateChange__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateChange__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateChangeAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__Group__1__Impl"


    // $ANTLR start "rule__StateChange__Group__2"
    // InternalMyDsl.g:2255:1: rule__StateChange__Group__2 : rule__StateChange__Group__2__Impl ;
    public final void rule__StateChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2259:1: ( rule__StateChange__Group__2__Impl )
            // InternalMyDsl.g:2260:2: rule__StateChange__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateChange__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__Group__2"


    // $ANTLR start "rule__StateChange__Group__2__Impl"
    // InternalMyDsl.g:2266:1: rule__StateChange__Group__2__Impl : ( ( rule__StateChange__ValueAssignment_2 ) ) ;
    public final void rule__StateChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( ( ( rule__StateChange__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:2271:1: ( ( rule__StateChange__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:2271:1: ( ( rule__StateChange__ValueAssignment_2 ) )
            // InternalMyDsl.g:2272:2: ( rule__StateChange__ValueAssignment_2 )
            {
             before(grammarAccess.getStateChangeAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:2273:2: ( rule__StateChange__ValueAssignment_2 )
            // InternalMyDsl.g:2273:3: rule__StateChange__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateChange__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateChangeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__Group__2__Impl"


    // $ANTLR start "rule__GoToChapter__Group__0"
    // InternalMyDsl.g:2282:1: rule__GoToChapter__Group__0 : rule__GoToChapter__Group__0__Impl rule__GoToChapter__Group__1 ;
    public final void rule__GoToChapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2286:1: ( rule__GoToChapter__Group__0__Impl rule__GoToChapter__Group__1 )
            // InternalMyDsl.g:2287:2: rule__GoToChapter__Group__0__Impl rule__GoToChapter__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__GoToChapter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__0"


    // $ANTLR start "rule__GoToChapter__Group__0__Impl"
    // InternalMyDsl.g:2294:1: rule__GoToChapter__Group__0__Impl : ( 'GOTOCHAPTER' ) ;
    public final void rule__GoToChapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( 'GOTOCHAPTER' ) )
            // InternalMyDsl.g:2299:1: ( 'GOTOCHAPTER' )
            {
            // InternalMyDsl.g:2299:1: ( 'GOTOCHAPTER' )
            // InternalMyDsl.g:2300:2: 'GOTOCHAPTER'
            {
             before(grammarAccess.getGoToChapterAccess().getGOTOCHAPTERKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGoToChapterAccess().getGOTOCHAPTERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__0__Impl"


    // $ANTLR start "rule__GoToChapter__Group__1"
    // InternalMyDsl.g:2309:1: rule__GoToChapter__Group__1 : rule__GoToChapter__Group__1__Impl rule__GoToChapter__Group__2 ;
    public final void rule__GoToChapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( rule__GoToChapter__Group__1__Impl rule__GoToChapter__Group__2 )
            // InternalMyDsl.g:2314:2: rule__GoToChapter__Group__1__Impl rule__GoToChapter__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__GoToChapter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__1"


    // $ANTLR start "rule__GoToChapter__Group__1__Impl"
    // InternalMyDsl.g:2321:1: rule__GoToChapter__Group__1__Impl : ( 'chapterId' ) ;
    public final void rule__GoToChapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( 'chapterId' ) )
            // InternalMyDsl.g:2326:1: ( 'chapterId' )
            {
            // InternalMyDsl.g:2326:1: ( 'chapterId' )
            // InternalMyDsl.g:2327:2: 'chapterId'
            {
             before(grammarAccess.getGoToChapterAccess().getChapterIdKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGoToChapterAccess().getChapterIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__1__Impl"


    // $ANTLR start "rule__GoToChapter__Group__2"
    // InternalMyDsl.g:2336:1: rule__GoToChapter__Group__2 : rule__GoToChapter__Group__2__Impl rule__GoToChapter__Group__3 ;
    public final void rule__GoToChapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( rule__GoToChapter__Group__2__Impl rule__GoToChapter__Group__3 )
            // InternalMyDsl.g:2341:2: rule__GoToChapter__Group__2__Impl rule__GoToChapter__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__GoToChapter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__2"


    // $ANTLR start "rule__GoToChapter__Group__2__Impl"
    // InternalMyDsl.g:2348:1: rule__GoToChapter__Group__2__Impl : ( '=' ) ;
    public final void rule__GoToChapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2352:1: ( ( '=' ) )
            // InternalMyDsl.g:2353:1: ( '=' )
            {
            // InternalMyDsl.g:2353:1: ( '=' )
            // InternalMyDsl.g:2354:2: '='
            {
             before(grammarAccess.getGoToChapterAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGoToChapterAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__2__Impl"


    // $ANTLR start "rule__GoToChapter__Group__3"
    // InternalMyDsl.g:2363:1: rule__GoToChapter__Group__3 : rule__GoToChapter__Group__3__Impl rule__GoToChapter__Group__4 ;
    public final void rule__GoToChapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2367:1: ( rule__GoToChapter__Group__3__Impl rule__GoToChapter__Group__4 )
            // InternalMyDsl.g:2368:2: rule__GoToChapter__Group__3__Impl rule__GoToChapter__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__GoToChapter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__3"


    // $ANTLR start "rule__GoToChapter__Group__3__Impl"
    // InternalMyDsl.g:2375:1: rule__GoToChapter__Group__3__Impl : ( ( rule__GoToChapter__ChapterIdAssignment_3 ) ) ;
    public final void rule__GoToChapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2379:1: ( ( ( rule__GoToChapter__ChapterIdAssignment_3 ) ) )
            // InternalMyDsl.g:2380:1: ( ( rule__GoToChapter__ChapterIdAssignment_3 ) )
            {
            // InternalMyDsl.g:2380:1: ( ( rule__GoToChapter__ChapterIdAssignment_3 ) )
            // InternalMyDsl.g:2381:2: ( rule__GoToChapter__ChapterIdAssignment_3 )
            {
             before(grammarAccess.getGoToChapterAccess().getChapterIdAssignment_3()); 
            // InternalMyDsl.g:2382:2: ( rule__GoToChapter__ChapterIdAssignment_3 )
            // InternalMyDsl.g:2382:3: rule__GoToChapter__ChapterIdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GoToChapter__ChapterIdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGoToChapterAccess().getChapterIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__3__Impl"


    // $ANTLR start "rule__GoToChapter__Group__4"
    // InternalMyDsl.g:2390:1: rule__GoToChapter__Group__4 : rule__GoToChapter__Group__4__Impl rule__GoToChapter__Group__5 ;
    public final void rule__GoToChapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2394:1: ( rule__GoToChapter__Group__4__Impl rule__GoToChapter__Group__5 )
            // InternalMyDsl.g:2395:2: rule__GoToChapter__Group__4__Impl rule__GoToChapter__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__GoToChapter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__4"


    // $ANTLR start "rule__GoToChapter__Group__4__Impl"
    // InternalMyDsl.g:2402:1: rule__GoToChapter__Group__4__Impl : ( ',' ) ;
    public final void rule__GoToChapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2406:1: ( ( ',' ) )
            // InternalMyDsl.g:2407:1: ( ',' )
            {
            // InternalMyDsl.g:2407:1: ( ',' )
            // InternalMyDsl.g:2408:2: ','
            {
             before(grammarAccess.getGoToChapterAccess().getCommaKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGoToChapterAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__4__Impl"


    // $ANTLR start "rule__GoToChapter__Group__5"
    // InternalMyDsl.g:2417:1: rule__GoToChapter__Group__5 : rule__GoToChapter__Group__5__Impl rule__GoToChapter__Group__6 ;
    public final void rule__GoToChapter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( rule__GoToChapter__Group__5__Impl rule__GoToChapter__Group__6 )
            // InternalMyDsl.g:2422:2: rule__GoToChapter__Group__5__Impl rule__GoToChapter__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__GoToChapter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__5"


    // $ANTLR start "rule__GoToChapter__Group__5__Impl"
    // InternalMyDsl.g:2429:1: rule__GoToChapter__Group__5__Impl : ( 'entrance' ) ;
    public final void rule__GoToChapter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2433:1: ( ( 'entrance' ) )
            // InternalMyDsl.g:2434:1: ( 'entrance' )
            {
            // InternalMyDsl.g:2434:1: ( 'entrance' )
            // InternalMyDsl.g:2435:2: 'entrance'
            {
             before(grammarAccess.getGoToChapterAccess().getEntranceKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGoToChapterAccess().getEntranceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__5__Impl"


    // $ANTLR start "rule__GoToChapter__Group__6"
    // InternalMyDsl.g:2444:1: rule__GoToChapter__Group__6 : rule__GoToChapter__Group__6__Impl rule__GoToChapter__Group__7 ;
    public final void rule__GoToChapter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( rule__GoToChapter__Group__6__Impl rule__GoToChapter__Group__7 )
            // InternalMyDsl.g:2449:2: rule__GoToChapter__Group__6__Impl rule__GoToChapter__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__GoToChapter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__6"


    // $ANTLR start "rule__GoToChapter__Group__6__Impl"
    // InternalMyDsl.g:2456:1: rule__GoToChapter__Group__6__Impl : ( '=' ) ;
    public final void rule__GoToChapter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2460:1: ( ( '=' ) )
            // InternalMyDsl.g:2461:1: ( '=' )
            {
            // InternalMyDsl.g:2461:1: ( '=' )
            // InternalMyDsl.g:2462:2: '='
            {
             before(grammarAccess.getGoToChapterAccess().getEqualsSignKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGoToChapterAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__6__Impl"


    // $ANTLR start "rule__GoToChapter__Group__7"
    // InternalMyDsl.g:2471:1: rule__GoToChapter__Group__7 : rule__GoToChapter__Group__7__Impl ;
    public final void rule__GoToChapter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( rule__GoToChapter__Group__7__Impl )
            // InternalMyDsl.g:2476:2: rule__GoToChapter__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoToChapter__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__7"


    // $ANTLR start "rule__GoToChapter__Group__7__Impl"
    // InternalMyDsl.g:2482:1: rule__GoToChapter__Group__7__Impl : ( ( rule__GoToChapter__EntranceAssignment_7 ) ) ;
    public final void rule__GoToChapter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( ( ( rule__GoToChapter__EntranceAssignment_7 ) ) )
            // InternalMyDsl.g:2487:1: ( ( rule__GoToChapter__EntranceAssignment_7 ) )
            {
            // InternalMyDsl.g:2487:1: ( ( rule__GoToChapter__EntranceAssignment_7 ) )
            // InternalMyDsl.g:2488:2: ( rule__GoToChapter__EntranceAssignment_7 )
            {
             before(grammarAccess.getGoToChapterAccess().getEntranceAssignment_7()); 
            // InternalMyDsl.g:2489:2: ( rule__GoToChapter__EntranceAssignment_7 )
            // InternalMyDsl.g:2489:3: rule__GoToChapter__EntranceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GoToChapter__EntranceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGoToChapterAccess().getEntranceAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__Group__7__Impl"


    // $ANTLR start "rule__Story__NameAssignment_1"
    // InternalMyDsl.g:2498:1: rule__Story__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Story__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2502:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2503:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2503:2: ( RULE_ID )
            // InternalMyDsl.g:2504:3: RULE_ID
            {
             before(grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__NameAssignment_1"


    // $ANTLR start "rule__Story__StateAssignment_3"
    // InternalMyDsl.g:2513:1: rule__Story__StateAssignment_3 : ( ruleState ) ;
    public final void rule__Story__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2517:1: ( ( ruleState ) )
            // InternalMyDsl.g:2518:2: ( ruleState )
            {
            // InternalMyDsl.g:2518:2: ( ruleState )
            // InternalMyDsl.g:2519:3: ruleState
            {
             before(grammarAccess.getStoryAccess().getStateStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getStateStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__StateAssignment_3"


    // $ANTLR start "rule__Story__ChaptersAssignment_4"
    // InternalMyDsl.g:2528:1: rule__Story__ChaptersAssignment_4 : ( ruleChapter ) ;
    public final void rule__Story__ChaptersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2532:1: ( ( ruleChapter ) )
            // InternalMyDsl.g:2533:2: ( ruleChapter )
            {
            // InternalMyDsl.g:2533:2: ( ruleChapter )
            // InternalMyDsl.g:2534:3: ruleChapter
            {
             before(grammarAccess.getStoryAccess().getChaptersChapterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getChaptersChapterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__ChaptersAssignment_4"


    // $ANTLR start "rule__State__PropertiesAssignment_2"
    // InternalMyDsl.g:2543:1: rule__State__PropertiesAssignment_2 : ( ruleProperty ) ;
    public final void rule__State__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2547:1: ( ( ruleProperty ) )
            // InternalMyDsl.g:2548:2: ( ruleProperty )
            {
            // InternalMyDsl.g:2548:2: ( ruleProperty )
            // InternalMyDsl.g:2549:3: ruleProperty
            {
             before(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__PropertiesAssignment_2"


    // $ANTLR start "rule__Property__NameAssignment_3"
    // InternalMyDsl.g:2558:1: rule__Property__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2562:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2563:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2563:2: ( RULE_ID )
            // InternalMyDsl.g:2564:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_3"


    // $ANTLR start "rule__Property__TypeAssignment_7"
    // InternalMyDsl.g:2573:1: rule__Property__TypeAssignment_7 : ( ruleType ) ;
    public final void rule__Property__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2577:1: ( ( ruleType ) )
            // InternalMyDsl.g:2578:2: ( ruleType )
            {
            // InternalMyDsl.g:2578:2: ( ruleType )
            // InternalMyDsl.g:2579:3: ruleType
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_7"


    // $ANTLR start "rule__Property__ValueAssignment_11"
    // InternalMyDsl.g:2588:1: rule__Property__ValueAssignment_11 : ( ruleValue ) ;
    public final void rule__Property__ValueAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( ( ruleValue ) )
            // InternalMyDsl.g:2593:2: ( ruleValue )
            {
            // InternalMyDsl.g:2593:2: ( ruleValue )
            // InternalMyDsl.g:2594:3: ruleValue
            {
             before(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_11"


    // $ANTLR start "rule__Chapter__NameAssignment_3"
    // InternalMyDsl.g:2603:1: rule__Chapter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2608:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2608:2: ( RULE_ID )
            // InternalMyDsl.g:2609:3: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__NameAssignment_3"


    // $ANTLR start "rule__Chapter__EntrancesAssignment_8"
    // InternalMyDsl.g:2618:1: rule__Chapter__EntrancesAssignment_8 : ( ruleStartPoint ) ;
    public final void rule__Chapter__EntrancesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2622:1: ( ( ruleStartPoint ) )
            // InternalMyDsl.g:2623:2: ( ruleStartPoint )
            {
            // InternalMyDsl.g:2623:2: ( ruleStartPoint )
            // InternalMyDsl.g:2624:3: ruleStartPoint
            {
             before(grammarAccess.getChapterAccess().getEntrancesStartPointParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getEntrancesStartPointParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__EntrancesAssignment_8"


    // $ANTLR start "rule__Chapter__ScenariosAssignment_11"
    // InternalMyDsl.g:2633:1: rule__Chapter__ScenariosAssignment_11 : ( ruleScenario ) ;
    public final void rule__Chapter__ScenariosAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2637:1: ( ( ruleScenario ) )
            // InternalMyDsl.g:2638:2: ( ruleScenario )
            {
            // InternalMyDsl.g:2638:2: ( ruleScenario )
            // InternalMyDsl.g:2639:3: ruleScenario
            {
             before(grammarAccess.getChapterAccess().getScenariosScenarioParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getScenariosScenarioParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__ScenariosAssignment_11"


    // $ANTLR start "rule__StartPoint__NameAssignment_0"
    // InternalMyDsl.g:2648:1: rule__StartPoint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StartPoint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2652:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2653:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2653:2: ( RULE_ID )
            // InternalMyDsl.g:2654:3: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartPointAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__NameAssignment_0"


    // $ANTLR start "rule__StartPoint__ScenarioIdAssignment_2"
    // InternalMyDsl.g:2663:1: rule__StartPoint__ScenarioIdAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__ScenarioIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2667:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2668:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2668:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2669:3: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getScenarioIdScenarioCrossReference_2_0()); 
            // InternalMyDsl.g:2670:3: ( RULE_ID )
            // InternalMyDsl.g:2671:4: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getScenarioIdScenarioIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartPointAccess().getScenarioIdScenarioIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStartPointAccess().getScenarioIdScenarioCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__ScenarioIdAssignment_2"


    // $ANTLR start "rule__Scenario__NameAssignment_3"
    // InternalMyDsl.g:2682:1: rule__Scenario__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Scenario__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2687:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2687:2: ( RULE_ID )
            // InternalMyDsl.g:2688:3: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__NameAssignment_3"


    // $ANTLR start "rule__Scenario__TextAssignment_5"
    // InternalMyDsl.g:2697:1: rule__Scenario__TextAssignment_5 : ( ruleText ) ;
    public final void rule__Scenario__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( ( ruleText ) )
            // InternalMyDsl.g:2702:2: ( ruleText )
            {
            // InternalMyDsl.g:2702:2: ( ruleText )
            // InternalMyDsl.g:2703:3: ruleText
            {
             before(grammarAccess.getScenarioAccess().getTextTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTextTextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__TextAssignment_5"


    // $ANTLR start "rule__Scenario__ChoicesAssignment_6_0"
    // InternalMyDsl.g:2712:1: rule__Scenario__ChoicesAssignment_6_0 : ( ruleChoice ) ;
    public final void rule__Scenario__ChoicesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( ruleChoice ) )
            // InternalMyDsl.g:2717:2: ( ruleChoice )
            {
            // InternalMyDsl.g:2717:2: ( ruleChoice )
            // InternalMyDsl.g:2718:3: ruleChoice
            {
             before(grammarAccess.getScenarioAccess().getChoicesChoiceParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getChoicesChoiceParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__ChoicesAssignment_6_0"


    // $ANTLR start "rule__Scenario__GotoAssignment_6_2"
    // InternalMyDsl.g:2727:1: rule__Scenario__GotoAssignment_6_2 : ( ruleGoToChapter ) ;
    public final void rule__Scenario__GotoAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( ( ruleGoToChapter ) )
            // InternalMyDsl.g:2732:2: ( ruleGoToChapter )
            {
            // InternalMyDsl.g:2732:2: ( ruleGoToChapter )
            // InternalMyDsl.g:2733:3: ruleGoToChapter
            {
             before(grammarAccess.getScenarioAccess().getGotoGoToChapterParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGoToChapter();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getGotoGoToChapterParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__GotoAssignment_6_2"


    // $ANTLR start "rule__Text__TextAssignment_1"
    // InternalMyDsl.g:2742:1: rule__Text__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2746:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2747:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2747:2: ( RULE_STRING )
            // InternalMyDsl.g:2748:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment_1"


    // $ANTLR start "rule__Choice__ScenarioIdAssignment_3"
    // InternalMyDsl.g:2757:1: rule__Choice__ScenarioIdAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Choice__ScenarioIdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2761:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2762:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2762:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2763:3: ( RULE_ID )
            {
             before(grammarAccess.getChoiceAccess().getScenarioIdScenarioCrossReference_3_0()); 
            // InternalMyDsl.g:2764:3: ( RULE_ID )
            // InternalMyDsl.g:2765:4: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getScenarioIdScenarioIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getScenarioIdScenarioIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getChoiceAccess().getScenarioIdScenarioCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__ScenarioIdAssignment_3"


    // $ANTLR start "rule__Choice__DescriptionAssignment_7"
    // InternalMyDsl.g:2776:1: rule__Choice__DescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Choice__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2780:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2781:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2781:2: ( RULE_STRING )
            // InternalMyDsl.g:2782:3: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__DescriptionAssignment_7"


    // $ANTLR start "rule__Choice__StateChangesAssignment_8_1"
    // InternalMyDsl.g:2791:1: rule__Choice__StateChangesAssignment_8_1 : ( ruleStateChange ) ;
    public final void rule__Choice__StateChangesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2795:1: ( ( ruleStateChange ) )
            // InternalMyDsl.g:2796:2: ( ruleStateChange )
            {
            // InternalMyDsl.g:2796:2: ( ruleStateChange )
            // InternalMyDsl.g:2797:3: ruleStateChange
            {
             before(grammarAccess.getChoiceAccess().getStateChangesStateChangeParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStateChange();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getStateChangesStateChangeParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__StateChangesAssignment_8_1"


    // $ANTLR start "rule__Choice__StateChangesAssignment_8_2_1"
    // InternalMyDsl.g:2806:1: rule__Choice__StateChangesAssignment_8_2_1 : ( ruleStateChange ) ;
    public final void rule__Choice__StateChangesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2810:1: ( ( ruleStateChange ) )
            // InternalMyDsl.g:2811:2: ( ruleStateChange )
            {
            // InternalMyDsl.g:2811:2: ( ruleStateChange )
            // InternalMyDsl.g:2812:3: ruleStateChange
            {
             before(grammarAccess.getChoiceAccess().getStateChangesStateChangeParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStateChange();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getStateChangesStateChangeParserRuleCall_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__StateChangesAssignment_8_2_1"


    // $ANTLR start "rule__StateChange__VariableAssignment_0"
    // InternalMyDsl.g:2821:1: rule__StateChange__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StateChange__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2826:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2826:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2827:3: ( RULE_ID )
            {
             before(grammarAccess.getStateChangeAccess().getVariablePropertyCrossReference_0_0()); 
            // InternalMyDsl.g:2828:3: ( RULE_ID )
            // InternalMyDsl.g:2829:4: RULE_ID
            {
             before(grammarAccess.getStateChangeAccess().getVariablePropertyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateChangeAccess().getVariablePropertyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStateChangeAccess().getVariablePropertyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__VariableAssignment_0"


    // $ANTLR start "rule__StateChange__OperatorAssignment_1"
    // InternalMyDsl.g:2840:1: rule__StateChange__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__StateChange__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2844:1: ( ( ruleOperator ) )
            // InternalMyDsl.g:2845:2: ( ruleOperator )
            {
            // InternalMyDsl.g:2845:2: ( ruleOperator )
            // InternalMyDsl.g:2846:3: ruleOperator
            {
             before(grammarAccess.getStateChangeAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getStateChangeAccess().getOperatorOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__OperatorAssignment_1"


    // $ANTLR start "rule__StateChange__ValueAssignment_2"
    // InternalMyDsl.g:2855:1: rule__StateChange__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__StateChange__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2859:1: ( ( ruleValue ) )
            // InternalMyDsl.g:2860:2: ( ruleValue )
            {
            // InternalMyDsl.g:2860:2: ( ruleValue )
            // InternalMyDsl.g:2861:3: ruleValue
            {
             before(grammarAccess.getStateChangeAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getStateChangeAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateChange__ValueAssignment_2"


    // $ANTLR start "rule__GoToChapter__ChapterIdAssignment_3"
    // InternalMyDsl.g:2870:1: rule__GoToChapter__ChapterIdAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__GoToChapter__ChapterIdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2874:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2875:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2875:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2876:3: ( RULE_ID )
            {
             before(grammarAccess.getGoToChapterAccess().getChapterIdChapterCrossReference_3_0()); 
            // InternalMyDsl.g:2877:3: ( RULE_ID )
            // InternalMyDsl.g:2878:4: RULE_ID
            {
             before(grammarAccess.getGoToChapterAccess().getChapterIdChapterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGoToChapterAccess().getChapterIdChapterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGoToChapterAccess().getChapterIdChapterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__ChapterIdAssignment_3"


    // $ANTLR start "rule__GoToChapter__EntranceAssignment_7"
    // InternalMyDsl.g:2889:1: rule__GoToChapter__EntranceAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__GoToChapter__EntranceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2893:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2894:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2894:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2895:3: ( RULE_ID )
            {
             before(grammarAccess.getGoToChapterAccess().getEntranceStartPointCrossReference_7_0()); 
            // InternalMyDsl.g:2896:3: ( RULE_ID )
            // InternalMyDsl.g:2897:4: RULE_ID
            {
             before(grammarAccess.getGoToChapterAccess().getEntranceStartPointIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGoToChapterAccess().getEntranceStartPointIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGoToChapterAccess().getEntranceStartPointCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoToChapter__EntranceAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000024000004800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});

}