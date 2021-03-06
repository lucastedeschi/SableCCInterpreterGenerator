/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.analysis;

import java.util.*;
import org.sablecc.sablecc.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGrammar(AGrammar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAHelpers(AHelpers node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAHelperDef(AHelperDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStates(AStates node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATokens(ATokens node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATokenDef(ATokenDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStateList(AStateList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStateListTail(AStateListTail node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATransition(ATransition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgnTokens(AIgnTokens node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARegExp(ARegExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConcat(AConcat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnExp(AUnExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharBasic(ACharBasic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASetBasic(ASetBasic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringBasic(AStringBasic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdBasic(AIdBasic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARegExpBasic(ARegExpBasic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharChar(ACharChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecChar(ADecChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAHexChar(AHexChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOperationSet(AOperationSet node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntervalSet(AIntervalSet node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStarUnOp(AStarUnOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAQMarkUnOp(AQMarkUnOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusUnOp(APlusUnOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusBinOp(APlusBinOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusBinOp(AMinusBinOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProductions(AProductions node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProd(AProd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAlt(AAlt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAltTransform(AAltTransform node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANewTerm(ANewTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListTerm(AListTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleTerm(ASimpleTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANullTerm(ANullTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANewListTerm(ANewListTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleListTerm(ASimpleListTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProdName(AProdName node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElem(AElem node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATokenSpecifier(ATokenSpecifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProductionSpecifier(AProductionSpecifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAst(AAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAstProd(AAstProd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAstAlt(AAstAlt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPkgId(TPkgId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPackage(TPackage node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStates(TStates node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHelpers(THelpers node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTokens(TTokens node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgnored(TIgnored node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProductions(TProductions node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbstract(TAbstract node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSyntax(TSyntax node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTree(TTree node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNew(TNew node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNull(TNull node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTokenSpecifier(TTokenSpecifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProductionSpecifier(TProductionSpecifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDDot(TDDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBkt(TLBkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBkt(TRBkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBrace(TLBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBrace(TRBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTQMark(TQMark node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBar(TBar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrow(TArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDecChar(TDecChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHexChar(THexChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
