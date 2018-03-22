package cn.littleisle.type;

import cn.littleisle.ast.Slot;

import cn.littleisle.ast.Location;

import java.util.*;

public class StructType extends CompositeType{

	public StructType(String name,List<Slot>membs,Location loc){
		super(name,membs,loc);
	}

	public boolean isStruct(){
		return true;	
	}

	public boolean isSameType(Type other){
		if(!other.isStruct()) return false;	
		return equals(other.getStructType());
	}

	protected void computeOffsets(){
		long offset=0;
		long maxAlign=1;
		//for(Slot s:members()){
		//}
		cacheSize=1;
		cacheAlign=1;
	
	}
	public String toString(){
		return "struct "+name;	
	}

}
