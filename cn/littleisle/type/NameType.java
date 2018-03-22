package cn.littleisle.type;

import cn.littleisle.ast.Location;

import cn.littleisle.exception.*;

import java.util.*;

abstract public class NameType extends Type{
	protected String name;
	protected Location location;

	public NameType(String name,Location loc){
		this.name=name;
		this.location=loc;
	}

	public String name(){
		return name;	
	}

	public Location location(){
		return location;
	}
}
