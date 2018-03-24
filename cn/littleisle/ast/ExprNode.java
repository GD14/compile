package cn.littleisle.ast;

import cn.littleisle.type.Type;

import cn.littleisle.exception.*;


abstract public class ExprNode extends Node{
	public ExprNode(){
		super();	
	}

	abstract public Type type();

	protected Type origType(){
		return type();	
	}
	
	public boolean isConstant(){
		return false;	
	}
	

}
