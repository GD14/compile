package cn.littleisle.ast;

import cn.littleisle.utils.TextUtils;
import cn.littleisle.parser.Token;
import cn.littleisle.parser.ParserConstants;
import java.util.*;


public class CflatToken implements Iterable<CflatToken> {

	protected Token token;
	protected boolean isSpecial;

	public CflatToken(Token token){
		this(token,false);	
	}

	public CflatToken(Token token,boolean isSpecial){
		this.token = token;
		this.isSpecial = isSpecial;
	}
	
	//获取字面值
	public String toString() {
		return  token.image;
	}

	//判断是不是特殊字符
	public boolean isSpecial(){
		return this.isSpecial;	
	}
	
	//获取类型id
	public int kindID(){
		return token.kind;	
	}

	//获取类型
	public String kindName(){
		return ParserConstants.tokenImage[token.kind];	
	}
	//获取行号
	public int lineno(){
		return token.beginLine;	
	}
	//获取列号
	public int column(){
		return token.beginColumn;
	}
	//字面值
	public String image(){
		return token.image;	
	}
	//输出	
	public String dumpedImage(){
		return TextUtils.dumpString(token.image);			
	}
	
	//实现迭代重载
	public Iterator<CflatToken> iterator(){
		return buildTokenList(token,false).iterator();
	}

	protected List<CflatToken> tokensWithoutFirstSpecials(){
		return buildTokenList(token,true);	
	}

	protected List<CflatToken> buildTokenList(Token first,boolean rejectFirstSpecials){
		List<CflatToken> result = new ArrayList<CflatToken>();	
		boolean rejectSpecials =rejectFirstSpecials;

		for(Token t= first; t!=null; t=t.next){
			if(t.specialToken !=null&&!rejectSpecials){
				Token s= specialTokenHead(t.specialToken);	
				for(;s!=null;s=s.next){
					result.add(new CflatToken(s));	
				}
			}	
			result.add(new CflatToken(t));
			rejectSpecials=false;	
		}
		return result;	
	}
	protected Token specialTokenHead(Token firstSpecial){
		Token s=firstSpecial;
		while(s.specialToken!=null){
			s=s.specialToken;	
		}
		return s;
	}
	public String includedLine(){
		StringBuffer buf=new StringBuffer();
		for(CflatToken t: tokensWithoutFirstSpecials()){
			int idx=t.image().indexOf("\n");	
			if(idx>=0){
				buf.append(t.image().substring(0,idx));	
				break;
			}
			buf.append(t.image());
		}
		return buf.toString();
	}
}
