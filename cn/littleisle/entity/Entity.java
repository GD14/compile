package cn.littleisle.entity;

import cn.littleisle.type.*;

import cn.littleisle.ast.TypeNode;

import cn.littleisle.ast.Location;

abstract public class Entity implements cn.littleisle.ast.Dumpable{

	protected String name;
	protected boolean isPrivate;
	protected TypeNode typeNode;
	protected long nRefered;

	public Entity(boolean priv,TypeNode type,String name){
		this.name=name;
		this.isPrivate=priv;
		this.typeNode=type;
		this.nRefered=0;
	}

	public String name(){
		return name;	
	}

	public String symbolString(){
		return name;	
	}



	public boolean isConstant(){
		return false;	
	}

	public TypeNode typeNode(){
		return typeNode;	
	}

	public Type type(){
		return typeNode.type();	
	}

	public Location location(){
		return typeNode.location();	
	}

	public void dump(cn.littleisle.ast.Dumper d){
	
		d.printClass(this,location());
		_dump(d);
	}

	abstract protected void _dump(cn.littleisle.ast.Dumper d);
}
