package org.xtext.distj14.ide.contentassist.antlr.internal;

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
import org.xtext.distj14.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }


    	private MathGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleMathExp EOF )
            // InternalMath.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:62:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalMath.g:67:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalMath.g:67:2: ( ( rule__MathExp__Group__0 ) )
            // InternalMath.g:68:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalMath.g:69:3: ( rule__MathExp__Group__0 )
            // InternalMath.g:69:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:78:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleExp EOF )
            // InternalMath.g:80:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:87:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalMath.g:92:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalMath.g:92:2: ( ( rule__Exp__Group__0 ) )
            // InternalMath.g:93:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalMath.g:94:3: ( rule__Exp__Group__0 )
            // InternalMath.g:94:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:103:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleFactor EOF )
            // InternalMath.g:105:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:112:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Factor__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Factor__Group__0 )
            // InternalMath.g:119:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleExpOpWeak"
    // InternalMath.g:128:1: entryRuleExpOpWeak : ruleExpOpWeak EOF ;
    public final void entryRuleExpOpWeak() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleExpOpWeak EOF )
            // InternalMath.g:130:1: ruleExpOpWeak EOF
            {
             before(grammarAccess.getExpOpWeakRule()); 
            pushFollow(FOLLOW_1);
            ruleExpOpWeak();

            state._fsp--;

             after(grammarAccess.getExpOpWeakRule()); 
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
    // $ANTLR end "entryRuleExpOpWeak"


    // $ANTLR start "ruleExpOpWeak"
    // InternalMath.g:137:1: ruleExpOpWeak : ( ( rule__ExpOpWeak__Alternatives ) ) ;
    public final void ruleExpOpWeak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__ExpOpWeak__Alternatives ) ) )
            // InternalMath.g:142:2: ( ( rule__ExpOpWeak__Alternatives ) )
            {
            // InternalMath.g:142:2: ( ( rule__ExpOpWeak__Alternatives ) )
            // InternalMath.g:143:3: ( rule__ExpOpWeak__Alternatives )
            {
             before(grammarAccess.getExpOpWeakAccess().getAlternatives()); 
            // InternalMath.g:144:3: ( rule__ExpOpWeak__Alternatives )
            // InternalMath.g:144:4: rule__ExpOpWeak__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpOpWeak__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpOpWeakAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpOpWeak"


    // $ANTLR start "entryRuleExpOpStrong"
    // InternalMath.g:153:1: entryRuleExpOpStrong : ruleExpOpStrong EOF ;
    public final void entryRuleExpOpStrong() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( ruleExpOpStrong EOF )
            // InternalMath.g:155:1: ruleExpOpStrong EOF
            {
             before(grammarAccess.getExpOpStrongRule()); 
            pushFollow(FOLLOW_1);
            ruleExpOpStrong();

            state._fsp--;

             after(grammarAccess.getExpOpStrongRule()); 
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
    // $ANTLR end "entryRuleExpOpStrong"


    // $ANTLR start "ruleExpOpStrong"
    // InternalMath.g:162:1: ruleExpOpStrong : ( ( rule__ExpOpStrong__Alternatives ) ) ;
    public final void ruleExpOpStrong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__ExpOpStrong__Alternatives ) ) )
            // InternalMath.g:167:2: ( ( rule__ExpOpStrong__Alternatives ) )
            {
            // InternalMath.g:167:2: ( ( rule__ExpOpStrong__Alternatives ) )
            // InternalMath.g:168:3: ( rule__ExpOpStrong__Alternatives )
            {
             before(grammarAccess.getExpOpStrongAccess().getAlternatives()); 
            // InternalMath.g:169:3: ( rule__ExpOpStrong__Alternatives )
            // InternalMath.g:169:4: rule__ExpOpStrong__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpOpStrong__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpOpStrongAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpOpStrong"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:178:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( rulePrimary EOF )
            // InternalMath.g:180:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:187:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:192:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:192:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:193:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:194:3: ( rule__Primary__Alternatives )
            // InternalMath.g:194:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:203:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleParenthesis EOF )
            // InternalMath.g:205:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:212:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMath.g:217:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMath.g:217:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMath.g:218:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMath.g:219:3: ( rule__Parenthesis__Group__0 )
            // InternalMath.g:219:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:228:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMath.g:229:1: ( ruleNumber EOF )
            // InternalMath.g:230:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:237:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:241:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalMath.g:242:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalMath.g:242:2: ( ( rule__Number__ValueAssignment ) )
            // InternalMath.g:243:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalMath.g:244:3: ( rule__Number__ValueAssignment )
            // InternalMath.g:244:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__ExpOpWeak__Alternatives"
    // InternalMath.g:252:1: rule__ExpOpWeak__Alternatives : ( ( ( rule__ExpOpWeak__Group_0__0 ) ) | ( ( rule__ExpOpWeak__Group_1__0 ) ) );
    public final void rule__ExpOpWeak__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:256:1: ( ( ( rule__ExpOpWeak__Group_0__0 ) ) | ( ( rule__ExpOpWeak__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMath.g:257:2: ( ( rule__ExpOpWeak__Group_0__0 ) )
                    {
                    // InternalMath.g:257:2: ( ( rule__ExpOpWeak__Group_0__0 ) )
                    // InternalMath.g:258:3: ( rule__ExpOpWeak__Group_0__0 )
                    {
                     before(grammarAccess.getExpOpWeakAccess().getGroup_0()); 
                    // InternalMath.g:259:3: ( rule__ExpOpWeak__Group_0__0 )
                    // InternalMath.g:259:4: rule__ExpOpWeak__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOpWeak__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpWeakAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:263:2: ( ( rule__ExpOpWeak__Group_1__0 ) )
                    {
                    // InternalMath.g:263:2: ( ( rule__ExpOpWeak__Group_1__0 ) )
                    // InternalMath.g:264:3: ( rule__ExpOpWeak__Group_1__0 )
                    {
                     before(grammarAccess.getExpOpWeakAccess().getGroup_1()); 
                    // InternalMath.g:265:3: ( rule__ExpOpWeak__Group_1__0 )
                    // InternalMath.g:265:4: rule__ExpOpWeak__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOpWeak__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpWeakAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpOpWeak__Alternatives"


    // $ANTLR start "rule__ExpOpStrong__Alternatives"
    // InternalMath.g:273:1: rule__ExpOpStrong__Alternatives : ( ( ( rule__ExpOpStrong__Group_0__0 ) ) | ( ( rule__ExpOpStrong__Group_1__0 ) ) );
    public final void rule__ExpOpStrong__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:277:1: ( ( ( rule__ExpOpStrong__Group_0__0 ) ) | ( ( rule__ExpOpStrong__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:278:2: ( ( rule__ExpOpStrong__Group_0__0 ) )
                    {
                    // InternalMath.g:278:2: ( ( rule__ExpOpStrong__Group_0__0 ) )
                    // InternalMath.g:279:3: ( rule__ExpOpStrong__Group_0__0 )
                    {
                     before(grammarAccess.getExpOpStrongAccess().getGroup_0()); 
                    // InternalMath.g:280:3: ( rule__ExpOpStrong__Group_0__0 )
                    // InternalMath.g:280:4: rule__ExpOpStrong__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOpStrong__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpStrongAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:284:2: ( ( rule__ExpOpStrong__Group_1__0 ) )
                    {
                    // InternalMath.g:284:2: ( ( rule__ExpOpStrong__Group_1__0 ) )
                    // InternalMath.g:285:3: ( rule__ExpOpStrong__Group_1__0 )
                    {
                     before(grammarAccess.getExpOpStrongAccess().getGroup_1()); 
                    // InternalMath.g:286:3: ( rule__ExpOpStrong__Group_1__0 )
                    // InternalMath.g:286:4: rule__ExpOpStrong__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOpStrong__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpStrongAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpOpStrong__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:294:1: rule__Primary__Alternatives : ( ( ( rule__Primary__NumberAssignment_0 ) ) | ( ( rule__Primary__ParAssignment_1 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:298:1: ( ( ( rule__Primary__NumberAssignment_0 ) ) | ( ( rule__Primary__ParAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:299:2: ( ( rule__Primary__NumberAssignment_0 ) )
                    {
                    // InternalMath.g:299:2: ( ( rule__Primary__NumberAssignment_0 ) )
                    // InternalMath.g:300:3: ( rule__Primary__NumberAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberAssignment_0()); 
                    // InternalMath.g:301:3: ( rule__Primary__NumberAssignment_0 )
                    // InternalMath.g:301:4: rule__Primary__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:305:2: ( ( rule__Primary__ParAssignment_1 ) )
                    {
                    // InternalMath.g:305:2: ( ( rule__Primary__ParAssignment_1 ) )
                    // InternalMath.g:306:3: ( rule__Primary__ParAssignment_1 )
                    {
                     before(grammarAccess.getPrimaryAccess().getParAssignment_1()); 
                    // InternalMath.g:307:3: ( rule__Primary__ParAssignment_1 )
                    // InternalMath.g:307:4: rule__Primary__ParAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ParAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getParAssignment_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalMath.g:315:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:319:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMath.g:320:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

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
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalMath.g:327:1: rule__MathExp__Group__0__Impl : ( 'result' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:331:1: ( ( 'result' ) )
            // InternalMath.g:332:1: ( 'result' )
            {
            // InternalMath.g:332:1: ( 'result' )
            // InternalMath.g:333:2: 'result'
            {
             before(grammarAccess.getMathExpAccess().getResultKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getResultKeyword_0()); 

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
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalMath.g:342:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:346:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMath.g:347:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

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
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalMath.g:354:1: rule__MathExp__Group__1__Impl : ( 'is' ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:358:1: ( ( 'is' ) )
            // InternalMath.g:359:1: ( 'is' )
            {
            // InternalMath.g:359:1: ( 'is' )
            // InternalMath.g:360:2: 'is'
            {
             before(grammarAccess.getMathExpAccess().getIsKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalMath.g:369:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:373:1: ( rule__MathExp__Group__2__Impl )
            // InternalMath.g:374:2: rule__MathExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2__Impl();

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
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalMath.g:380:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:384:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalMath.g:385:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalMath.g:385:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalMath.g:386:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalMath.g:387:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalMath.g:387:3: rule__MathExp__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalMath.g:396:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:400:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalMath.g:401:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

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
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalMath.g:408:1: rule__Exp__Group__0__Impl : ( ( rule__Exp__LeftAssignment_0 ) ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:412:1: ( ( ( rule__Exp__LeftAssignment_0 ) ) )
            // InternalMath.g:413:1: ( ( rule__Exp__LeftAssignment_0 ) )
            {
            // InternalMath.g:413:1: ( ( rule__Exp__LeftAssignment_0 ) )
            // InternalMath.g:414:2: ( rule__Exp__LeftAssignment_0 )
            {
             before(grammarAccess.getExpAccess().getLeftAssignment_0()); 
            // InternalMath.g:415:2: ( rule__Exp__LeftAssignment_0 )
            // InternalMath.g:415:3: rule__Exp__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalMath.g:423:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:427:1: ( rule__Exp__Group__1__Impl )
            // InternalMath.g:428:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

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
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalMath.g:434:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )? ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:438:1: ( ( ( rule__Exp__Group_1__0 )? ) )
            // InternalMath.g:439:1: ( ( rule__Exp__Group_1__0 )? )
            {
            // InternalMath.g:439:1: ( ( rule__Exp__Group_1__0 )? )
            // InternalMath.g:440:2: ( rule__Exp__Group_1__0 )?
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalMath.g:441:2: ( rule__Exp__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:441:3: rule__Exp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalMath.g:450:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:454:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalMath.g:455:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

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
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalMath.g:462:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__OperatorAssignment_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:466:1: ( ( ( rule__Exp__OperatorAssignment_1_0 ) ) )
            // InternalMath.g:467:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            {
            // InternalMath.g:467:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            // InternalMath.g:468:2: ( rule__Exp__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 
            // InternalMath.g:469:2: ( rule__Exp__OperatorAssignment_1_0 )
            // InternalMath.g:469:3: rule__Exp__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 

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
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalMath.g:477:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:481:1: ( rule__Exp__Group_1__1__Impl )
            // InternalMath.g:482:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalMath.g:488:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:492:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalMath.g:493:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalMath.g:493:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalMath.g:494:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalMath.g:495:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalMath.g:495:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalMath.g:504:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:508:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalMath.g:509:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

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
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalMath.g:516:1: rule__Factor__Group__0__Impl : ( ( rule__Factor__PrimaryAssignment_0 ) ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:520:1: ( ( ( rule__Factor__PrimaryAssignment_0 ) ) )
            // InternalMath.g:521:1: ( ( rule__Factor__PrimaryAssignment_0 ) )
            {
            // InternalMath.g:521:1: ( ( rule__Factor__PrimaryAssignment_0 ) )
            // InternalMath.g:522:2: ( rule__Factor__PrimaryAssignment_0 )
            {
             before(grammarAccess.getFactorAccess().getPrimaryAssignment_0()); 
            // InternalMath.g:523:2: ( rule__Factor__PrimaryAssignment_0 )
            // InternalMath.g:523:3: rule__Factor__PrimaryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__PrimaryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getPrimaryAssignment_0()); 

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
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalMath.g:531:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl rule__Factor__Group__2 ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:535:1: ( rule__Factor__Group__1__Impl rule__Factor__Group__2 )
            // InternalMath.g:536:2: rule__Factor__Group__1__Impl rule__Factor__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Factor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__2();

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
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalMath.g:543:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__OperatorAssignment_1 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:547:1: ( ( ( rule__Factor__OperatorAssignment_1 )? ) )
            // InternalMath.g:548:1: ( ( rule__Factor__OperatorAssignment_1 )? )
            {
            // InternalMath.g:548:1: ( ( rule__Factor__OperatorAssignment_1 )? )
            // InternalMath.g:549:2: ( rule__Factor__OperatorAssignment_1 )?
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1()); 
            // InternalMath.g:550:2: ( rule__Factor__OperatorAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:550:3: rule__Factor__OperatorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__OperatorAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group__2"
    // InternalMath.g:558:1: rule__Factor__Group__2 : rule__Factor__Group__2__Impl ;
    public final void rule__Factor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:562:1: ( rule__Factor__Group__2__Impl )
            // InternalMath.g:563:2: rule__Factor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__2__Impl();

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
    // $ANTLR end "rule__Factor__Group__2"


    // $ANTLR start "rule__Factor__Group__2__Impl"
    // InternalMath.g:569:1: rule__Factor__Group__2__Impl : ( ( rule__Factor__SecondAssignment_2 )? ) ;
    public final void rule__Factor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:573:1: ( ( ( rule__Factor__SecondAssignment_2 )? ) )
            // InternalMath.g:574:1: ( ( rule__Factor__SecondAssignment_2 )? )
            {
            // InternalMath.g:574:1: ( ( rule__Factor__SecondAssignment_2 )? )
            // InternalMath.g:575:2: ( rule__Factor__SecondAssignment_2 )?
            {
             before(grammarAccess.getFactorAccess().getSecondAssignment_2()); 
            // InternalMath.g:576:2: ( rule__Factor__SecondAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMath.g:576:3: rule__Factor__SecondAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__SecondAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getSecondAssignment_2()); 

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
    // $ANTLR end "rule__Factor__Group__2__Impl"


    // $ANTLR start "rule__ExpOpWeak__Group_0__0"
    // InternalMath.g:585:1: rule__ExpOpWeak__Group_0__0 : rule__ExpOpWeak__Group_0__0__Impl rule__ExpOpWeak__Group_0__1 ;
    public final void rule__ExpOpWeak__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:589:1: ( rule__ExpOpWeak__Group_0__0__Impl rule__ExpOpWeak__Group_0__1 )
            // InternalMath.g:590:2: rule__ExpOpWeak__Group_0__0__Impl rule__ExpOpWeak__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpOpWeak__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOpWeak__Group_0__1();

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
    // $ANTLR end "rule__ExpOpWeak__Group_0__0"


    // $ANTLR start "rule__ExpOpWeak__Group_0__0__Impl"
    // InternalMath.g:597:1: rule__ExpOpWeak__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpOpWeak__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:601:1: ( ( () ) )
            // InternalMath.g:602:1: ( () )
            {
            // InternalMath.g:602:1: ( () )
            // InternalMath.g:603:2: ()
            {
             before(grammarAccess.getExpOpWeakAccess().getPlusAction_0_0()); 
            // InternalMath.g:604:2: ()
            // InternalMath.g:604:3: 
            {
            }

             after(grammarAccess.getExpOpWeakAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOpWeak__Group_0__0__Impl"


    // $ANTLR start "rule__ExpOpWeak__Group_0__1"
    // InternalMath.g:612:1: rule__ExpOpWeak__Group_0__1 : rule__ExpOpWeak__Group_0__1__Impl ;
    public final void rule__ExpOpWeak__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:616:1: ( rule__ExpOpWeak__Group_0__1__Impl )
            // InternalMath.g:617:2: rule__ExpOpWeak__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOpWeak__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExpOpWeak__Group_0__1"


    // $ANTLR start "rule__ExpOpWeak__Group_0__1__Impl"
    // InternalMath.g:623:1: rule__ExpOpWeak__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpOpWeak__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:627:1: ( ( '+' ) )
            // InternalMath.g:628:1: ( '+' )
            {
            // InternalMath.g:628:1: ( '+' )
            // InternalMath.g:629:2: '+'
            {
             before(grammarAccess.getExpOpWeakAccess().getPlusSignKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpOpWeakAccess().getPlusSignKeyword_0_1()); 

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
    // $ANTLR end "rule__ExpOpWeak__Group_0__1__Impl"


    // $ANTLR start "rule__ExpOpWeak__Group_1__0"
    // InternalMath.g:639:1: rule__ExpOpWeak__Group_1__0 : rule__ExpOpWeak__Group_1__0__Impl rule__ExpOpWeak__Group_1__1 ;
    public final void rule__ExpOpWeak__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:643:1: ( rule__ExpOpWeak__Group_1__0__Impl rule__ExpOpWeak__Group_1__1 )
            // InternalMath.g:644:2: rule__ExpOpWeak__Group_1__0__Impl rule__ExpOpWeak__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpOpWeak__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOpWeak__Group_1__1();

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
    // $ANTLR end "rule__ExpOpWeak__Group_1__0"


    // $ANTLR start "rule__ExpOpWeak__Group_1__0__Impl"
    // InternalMath.g:651:1: rule__ExpOpWeak__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpOpWeak__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:655:1: ( ( () ) )
            // InternalMath.g:656:1: ( () )
            {
            // InternalMath.g:656:1: ( () )
            // InternalMath.g:657:2: ()
            {
             before(grammarAccess.getExpOpWeakAccess().getMinusAction_1_0()); 
            // InternalMath.g:658:2: ()
            // InternalMath.g:658:3: 
            {
            }

             after(grammarAccess.getExpOpWeakAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOpWeak__Group_1__0__Impl"


    // $ANTLR start "rule__ExpOpWeak__Group_1__1"
    // InternalMath.g:666:1: rule__ExpOpWeak__Group_1__1 : rule__ExpOpWeak__Group_1__1__Impl ;
    public final void rule__ExpOpWeak__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:670:1: ( rule__ExpOpWeak__Group_1__1__Impl )
            // InternalMath.g:671:2: rule__ExpOpWeak__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOpWeak__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpOpWeak__Group_1__1"


    // $ANTLR start "rule__ExpOpWeak__Group_1__1__Impl"
    // InternalMath.g:677:1: rule__ExpOpWeak__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpOpWeak__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:681:1: ( ( '-' ) )
            // InternalMath.g:682:1: ( '-' )
            {
            // InternalMath.g:682:1: ( '-' )
            // InternalMath.g:683:2: '-'
            {
             before(grammarAccess.getExpOpWeakAccess().getHyphenMinusKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpOpWeakAccess().getHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__ExpOpWeak__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOpStrong__Group_0__0"
    // InternalMath.g:693:1: rule__ExpOpStrong__Group_0__0 : rule__ExpOpStrong__Group_0__0__Impl rule__ExpOpStrong__Group_0__1 ;
    public final void rule__ExpOpStrong__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:697:1: ( rule__ExpOpStrong__Group_0__0__Impl rule__ExpOpStrong__Group_0__1 )
            // InternalMath.g:698:2: rule__ExpOpStrong__Group_0__0__Impl rule__ExpOpStrong__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpOpStrong__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOpStrong__Group_0__1();

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
    // $ANTLR end "rule__ExpOpStrong__Group_0__0"


    // $ANTLR start "rule__ExpOpStrong__Group_0__0__Impl"
    // InternalMath.g:705:1: rule__ExpOpStrong__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpOpStrong__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:709:1: ( ( () ) )
            // InternalMath.g:710:1: ( () )
            {
            // InternalMath.g:710:1: ( () )
            // InternalMath.g:711:2: ()
            {
             before(grammarAccess.getExpOpStrongAccess().getMultAction_0_0()); 
            // InternalMath.g:712:2: ()
            // InternalMath.g:712:3: 
            {
            }

             after(grammarAccess.getExpOpStrongAccess().getMultAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOpStrong__Group_0__0__Impl"


    // $ANTLR start "rule__ExpOpStrong__Group_0__1"
    // InternalMath.g:720:1: rule__ExpOpStrong__Group_0__1 : rule__ExpOpStrong__Group_0__1__Impl ;
    public final void rule__ExpOpStrong__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:724:1: ( rule__ExpOpStrong__Group_0__1__Impl )
            // InternalMath.g:725:2: rule__ExpOpStrong__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOpStrong__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExpOpStrong__Group_0__1"


    // $ANTLR start "rule__ExpOpStrong__Group_0__1__Impl"
    // InternalMath.g:731:1: rule__ExpOpStrong__Group_0__1__Impl : ( '*' ) ;
    public final void rule__ExpOpStrong__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:735:1: ( ( '*' ) )
            // InternalMath.g:736:1: ( '*' )
            {
            // InternalMath.g:736:1: ( '*' )
            // InternalMath.g:737:2: '*'
            {
             before(grammarAccess.getExpOpStrongAccess().getAsteriskKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpOpStrongAccess().getAsteriskKeyword_0_1()); 

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
    // $ANTLR end "rule__ExpOpStrong__Group_0__1__Impl"


    // $ANTLR start "rule__ExpOpStrong__Group_1__0"
    // InternalMath.g:747:1: rule__ExpOpStrong__Group_1__0 : rule__ExpOpStrong__Group_1__0__Impl rule__ExpOpStrong__Group_1__1 ;
    public final void rule__ExpOpStrong__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:751:1: ( rule__ExpOpStrong__Group_1__0__Impl rule__ExpOpStrong__Group_1__1 )
            // InternalMath.g:752:2: rule__ExpOpStrong__Group_1__0__Impl rule__ExpOpStrong__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpOpStrong__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOpStrong__Group_1__1();

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
    // $ANTLR end "rule__ExpOpStrong__Group_1__0"


    // $ANTLR start "rule__ExpOpStrong__Group_1__0__Impl"
    // InternalMath.g:759:1: rule__ExpOpStrong__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpOpStrong__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:763:1: ( ( () ) )
            // InternalMath.g:764:1: ( () )
            {
            // InternalMath.g:764:1: ( () )
            // InternalMath.g:765:2: ()
            {
             before(grammarAccess.getExpOpStrongAccess().getDivAction_1_0()); 
            // InternalMath.g:766:2: ()
            // InternalMath.g:766:3: 
            {
            }

             after(grammarAccess.getExpOpStrongAccess().getDivAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOpStrong__Group_1__0__Impl"


    // $ANTLR start "rule__ExpOpStrong__Group_1__1"
    // InternalMath.g:774:1: rule__ExpOpStrong__Group_1__1 : rule__ExpOpStrong__Group_1__1__Impl ;
    public final void rule__ExpOpStrong__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:778:1: ( rule__ExpOpStrong__Group_1__1__Impl )
            // InternalMath.g:779:2: rule__ExpOpStrong__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOpStrong__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpOpStrong__Group_1__1"


    // $ANTLR start "rule__ExpOpStrong__Group_1__1__Impl"
    // InternalMath.g:785:1: rule__ExpOpStrong__Group_1__1__Impl : ( '/' ) ;
    public final void rule__ExpOpStrong__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:789:1: ( ( '/' ) )
            // InternalMath.g:790:1: ( '/' )
            {
            // InternalMath.g:790:1: ( '/' )
            // InternalMath.g:791:2: '/'
            {
             before(grammarAccess.getExpOpStrongAccess().getSolidusKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpOpStrongAccess().getSolidusKeyword_1_1()); 

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
    // $ANTLR end "rule__ExpOpStrong__Group_1__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMath.g:801:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:805:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMath.g:806:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

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
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMath.g:813:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:817:1: ( ( '(' ) )
            // InternalMath.g:818:1: ( '(' )
            {
            // InternalMath.g:818:1: ( '(' )
            // InternalMath.g:819:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMath.g:828:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:832:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMath.g:833:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

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
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMath.g:840:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__ExpAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:844:1: ( ( ( rule__Parenthesis__ExpAssignment_1 ) ) )
            // InternalMath.g:845:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            {
            // InternalMath.g:845:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            // InternalMath.g:846:2: ( rule__Parenthesis__ExpAssignment_1 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 
            // InternalMath.g:847:2: ( rule__Parenthesis__ExpAssignment_1 )
            // InternalMath.g:847:3: rule__Parenthesis__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 

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
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMath.g:855:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:859:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalMath.g:860:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

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
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMath.g:866:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:870:1: ( ( ')' ) )
            // InternalMath.g:871:1: ( ')' )
            {
            // InternalMath.g:871:1: ( ')' )
            // InternalMath.g:872:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__MathExp__ExpAssignment_2"
    // InternalMath.g:882:1: rule__MathExp__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:886:1: ( ( ruleExp ) )
            // InternalMath.g:887:2: ( ruleExp )
            {
            // InternalMath.g:887:2: ( ruleExp )
            // InternalMath.g:888:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MathExp__ExpAssignment_2"


    // $ANTLR start "rule__Exp__LeftAssignment_0"
    // InternalMath.g:897:1: rule__Exp__LeftAssignment_0 : ( ruleFactor ) ;
    public final void rule__Exp__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:901:1: ( ( ruleFactor ) )
            // InternalMath.g:902:2: ( ruleFactor )
            {
            // InternalMath.g:902:2: ( ruleFactor )
            // InternalMath.g:903:3: ruleFactor
            {
             before(grammarAccess.getExpAccess().getLeftFactorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getLeftFactorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Exp__LeftAssignment_0"


    // $ANTLR start "rule__Exp__OperatorAssignment_1_0"
    // InternalMath.g:912:1: rule__Exp__OperatorAssignment_1_0 : ( ruleExpOpWeak ) ;
    public final void rule__Exp__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:916:1: ( ( ruleExpOpWeak ) )
            // InternalMath.g:917:2: ( ruleExpOpWeak )
            {
            // InternalMath.g:917:2: ( ruleExpOpWeak )
            // InternalMath.g:918:3: ruleExpOpWeak
            {
             before(grammarAccess.getExpAccess().getOperatorExpOpWeakParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpOpWeak();

            state._fsp--;

             after(grammarAccess.getExpAccess().getOperatorExpOpWeakParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Exp__OperatorAssignment_1_0"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalMath.g:927:1: rule__Exp__RightAssignment_1_1 : ( ruleExp ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:931:1: ( ( ruleExp ) )
            // InternalMath.g:932:2: ( ruleExp )
            {
            // InternalMath.g:932:2: ( ruleExp )
            // InternalMath.g:933:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__PrimaryAssignment_0"
    // InternalMath.g:942:1: rule__Factor__PrimaryAssignment_0 : ( rulePrimary ) ;
    public final void rule__Factor__PrimaryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:946:1: ( ( rulePrimary ) )
            // InternalMath.g:947:2: ( rulePrimary )
            {
            // InternalMath.g:947:2: ( rulePrimary )
            // InternalMath.g:948:3: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getPrimaryPrimaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPrimaryPrimaryParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Factor__PrimaryAssignment_0"


    // $ANTLR start "rule__Factor__OperatorAssignment_1"
    // InternalMath.g:957:1: rule__Factor__OperatorAssignment_1 : ( ruleExpOpStrong ) ;
    public final void rule__Factor__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:961:1: ( ( ruleExpOpStrong ) )
            // InternalMath.g:962:2: ( ruleExpOpStrong )
            {
            // InternalMath.g:962:2: ( ruleExpOpStrong )
            // InternalMath.g:963:3: ruleExpOpStrong
            {
             before(grammarAccess.getFactorAccess().getOperatorExpOpStrongParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpOpStrong();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getOperatorExpOpStrongParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Factor__OperatorAssignment_1"


    // $ANTLR start "rule__Factor__SecondAssignment_2"
    // InternalMath.g:972:1: rule__Factor__SecondAssignment_2 : ( ruleFactor ) ;
    public final void rule__Factor__SecondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:976:1: ( ( ruleFactor ) )
            // InternalMath.g:977:2: ( ruleFactor )
            {
            // InternalMath.g:977:2: ( ruleFactor )
            // InternalMath.g:978:3: ruleFactor
            {
             before(grammarAccess.getFactorAccess().getSecondFactorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getSecondFactorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Factor__SecondAssignment_2"


    // $ANTLR start "rule__Primary__NumberAssignment_0"
    // InternalMath.g:987:1: rule__Primary__NumberAssignment_0 : ( ruleNumber ) ;
    public final void rule__Primary__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:991:1: ( ( ruleNumber ) )
            // InternalMath.g:992:2: ( ruleNumber )
            {
            // InternalMath.g:992:2: ( ruleNumber )
            // InternalMath.g:993:3: ruleNumber
            {
             before(grammarAccess.getPrimaryAccess().getNumberNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getNumberNumberParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Primary__NumberAssignment_0"


    // $ANTLR start "rule__Primary__ParAssignment_1"
    // InternalMath.g:1002:1: rule__Primary__ParAssignment_1 : ( ruleParenthesis ) ;
    public final void rule__Primary__ParAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1006:1: ( ( ruleParenthesis ) )
            // InternalMath.g:1007:2: ( ruleParenthesis )
            {
            // InternalMath.g:1007:2: ( ruleParenthesis )
            // InternalMath.g:1008:3: ruleParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getParParenthesisParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getParParenthesisParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Primary__ParAssignment_1"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_1"
    // InternalMath.g:1017:1: rule__Parenthesis__ExpAssignment_1 : ( ruleExp ) ;
    public final void rule__Parenthesis__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1021:1: ( ( ruleExp ) )
            // InternalMath.g:1022:2: ( ruleExp )
            {
            // InternalMath.g:1022:2: ( ruleExp )
            // InternalMath.g:1023:3: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parenthesis__ExpAssignment_1"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalMath.g:1032:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1036:1: ( ( RULE_INT ) )
            // InternalMath.g:1037:2: ( RULE_INT )
            {
            // InternalMath.g:1037:2: ( RULE_INT )
            // InternalMath.g:1038:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Number__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}