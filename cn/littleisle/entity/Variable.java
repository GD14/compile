package cn.littleisle.entity;

import cn.littleisle.ast.TypeNode;

import cn.littleisle.type.*;

abstract public class Variable extends Entity{
	public Variable(boolean priv,TypeNode type,String name){
		super(priv,type,name);	
	}
}
