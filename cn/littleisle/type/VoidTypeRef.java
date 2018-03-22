package cn.littleisle.type;

import cn.littleisle.ast.Location;

public class VoidTypeRef extends TypeRef{
	public VoidTypeRef(){
		super(null);	
	}
	public VoidTypeRef(Location loc){
		super(loc);	
	}
	public boolean isVoid(){
		return true;	
	}
	public boolean equals(Object other){
		return (other instanceof VoidTypeRef);	
	}

	public String toString(){
		return "void";	
	}

}
