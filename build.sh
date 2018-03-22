#!/bin/bash
curPath=`pwd`
cd ./cn/littleisle/parser/
javacc Parser.jj
cd $curPath
find cn -name "*.java" >c.txt

javac @c.txt
