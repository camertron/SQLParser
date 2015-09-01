#! /bin/bash

java -jar ./antlr4.jar -o ./src/main/java/com/camertron/SQLParser -visitor -package com.camertron.SQLParser SQLLexer.g SQLParser.g
