package cn.littleisle.entity;

import cn.littleisle.type.Type;
import cn.littleisle.ast.ExprNode;
import cn.littleisle.ast.TypeNode;


public class DefinedVariable extends Variable{
	protected ExprNode initializer;

	public DefinedVariable(boolean priv,TypeNode type,String name,ExprNode init){
		super(priv,type,name);	
		initializer=init;	
	}
	protected void _dump(cn.littleisle.ast.Dumper d){
	
		d.printMember("name",name);	
		d.printMember("isPrivate",isPrivate);
		d.printMember("typeNode",typeNode);
		d.printMember("initializer",initializer);
	}

}
