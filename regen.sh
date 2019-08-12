#! /bin/bash

mvn exec:java -Dexec.mainClass="org.antlr.v4.Tool" -Dexec.args="-o ./src/main/java/com/camertron/SQLParser -visitor -package com.camertron.SQLParser SQLParser.g4 SQLLexer.g4"
