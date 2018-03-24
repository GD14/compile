package cn.littleisle.entity;

import cn.littleisle.ast.TypeNode;

public class CBCParameter extends DefinedVariable{
	public CBCParameter(TypeNode type,String name){
		super(false,type,name,null);	
	}

	public boolean isPararmeter(){
		return true;	
	}

	protected void _dump(cn.littleisle.ast.Dumper d){
		d.printMember("name",name);	
		d.printMember("typeNode",typeNode);
	}
}
