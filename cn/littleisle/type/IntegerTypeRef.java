package cn.littleisle.type;

import cn.littleisle.ast.Location;

public class IntegerTypeRef extends TypeRef{

	protected String name;
	public IntegerTypeRef(String name){
		this(name,null);	
	}
	public IntegerTypeRef(String name,Location loc){
		super(loc);
		this.name=name;
	}	
	public String name(){
		return name;	
	}

	static public IntegerTypeRef ulongRef(){
		return new IntegerTypeRef("unsigned");	
	}
	static public IntegerTypeRef ulongRef(Location loc){
		return new IntegerTypeRef("unsigned long",loc);	
	}

	static public IntegerTypeRef uintRef(){
		return new IntegerTypeRef("unsigned");	
	}
	static public IntegerTypeRef uintRef(Location loc){
		return new IntegerTypeRef("unsigned int",loc);	
	}

	static public IntegerTypeRef intRef(Location loc){
		return new IntegerTypeRef("int",loc);	
	}
	static public IntegerTypeRef intRef(){
		return new IntegerTypeRef("int");	
	}

	static public IntegerTypeRef longRef(Location loc){
		return new IntegerTypeRef("long",loc);	
	}
	static public IntegerTypeRef longRef(){
		return new IntegerTypeRef("long");	
	}
	
	public String toString(){
		return name;	
	}

}
