package cn.littleisle.type;

import cn.littleisle.entity.ParamSlots;

import cn.littleisle.ast.Location;

import java.util.*;

public class ParamTypeRefs extends ParamSlots<TypeRef>{
	public ParamTypeRefs(List<TypeRef> paramDescs){
		super(paramDescs);	
	}

	public ParamTypeRefs(Location loc,List<TypeRef> paramDescs,boolean vararg){
		super(loc,paramDescs,vararg);	
	}

	public List<TypeRef> typerefs(){
		return  paramDescriptors;	
	}

	public boolean equals(Object other){
		return (other instanceof ParamTypeRefs)
				&& equals((ParamTypeRefs)other);	
	}
	public boolean equals(ParamTypeRefs other){
		return vararg== other.vararg	
				&& paramDescriptors.equals(other.paramDescriptors);
	}
}
