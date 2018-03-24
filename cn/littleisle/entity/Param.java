package cn.littleisle.entity;

import cn.littleisle.TypeRef;
import cn.littleisle.ParamTypeRefs;
import cn.littleisle.Location;
import java.util.List;
import java.util.ArrayList;


public class Param extends ParamSlots<CBCParameter>
		implements cn.littleisle.as.Dumplable{
		
	public Param(Location loc,List<CBCParameter> paramDescs){
		super(loc,paramDescs,false);
	}
	public List<CBCParameter> parameters(){
		return paramDescriptors;	
	}

	public ParamTypeRefs parametersTypeRef(){
		List<TypeRef> typerefs=new ArrayList<TypeRef>();	
		for (CBCParameter param: paramDescriptors){
			typerefs.add(param.typeNode().typeRef());
		}
		return new ParamTypeRefs(location,typerefs,vararg);
	}

	public boolean equals(Object other){
		return (other instanceof Param)&& equals((Params)other);	
	}

	public boolean equals(Params other){
		return other.vararg==vararg
				&& other.paramDescriptors.equals(paramDescriptors);
	}
	public void dump(cn.littleisle.ast.Dumper d){
		d.printNodeList("parameters",parameters());	
	}
}
