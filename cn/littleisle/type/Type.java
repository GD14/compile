package cn.littleisle.type;

import cn.littleisle.exception.*;

public abstract class Type{
	static final public long sizeUnknown= -1;

	abstract public long size();

	public long allocSize() {
		return size();
	}
	public long alignment(){
		return allocSize();	
	}
	
	abstract public boolean isSameType(Type other);

	public boolean isVoid(){return false;}
	public boolean isInt(){return false;}
	public boolean isInteger(){return false;}
	public boolean isSigned(){throw new Error("#isSigned for non-integer type");}
	public boolean isPointer(){return false;}
	public boolean isArray(){return false;}
	public boolean isCompositeType(){return false;}
	public boolean isStruct(){return false;}
	public boolean isUnion(){return false;}
	public boolean isUserType(){return false;}
	public boolean isFunction(){return false;}


	public StructType getStructType(){
		return (StructType)this;	
	}
	public CompositeType getCompositeType(){
		return (CompositeType)this;
	}
}
