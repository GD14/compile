package cn.littleisle.entity;

import cn.littleisle.type.Type;

import cn.littleisle.ast.TypeNode;


public class DefinedVariable extends Variable{

	public DefinedVariable(boolean priv,TypeNode type,String name){
		super(priv,type,name);	
	}
	protected void _dump(cn.littleisle.ast.Dumper d){
	
		d.printMember("name",name);	
		d.printMember("isPrivate",isPrivate);
		d.printMember("typeNode",typeNode);
	}

}
