package cn.littleisle.ast;
import cn.littleisle.type.*;
import java.util.*;


public class StructNode extends CompositeTypeDefinition{

	public StructNode(Location loc, TypeRef ref,String name,List<Slot> membs){
		super(loc,ref,name,membs);	
	}

	public String kind(){
		return "struct";	
	}

	public boolean isStruct(){
		return true;	
	}

	public Type definingType(){
		return new StructType(name(),members(),location());	
	}
}
