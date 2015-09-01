// Generated from SQLParser.g by ANTLR 4.2
package com.camertron.SQLParser;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ISODOW=85, OVERWRITE=101, PRECISION=104, ILIKE=22, Character_String_Literal=201, 
		NOT=34, EXCEPT=16, BYTEA=166, CHARACTER=58, MONTH=98, BlockComment=198, 
		VARBIT=136, CREATE=10, STDDEV_POP=114, USING=50, NOT_EQUAL=179, TIMEZONE_MINUTE=122, 
		VERTICAL_BAR=193, TIMESTAMPTZ=161, REGEXP=108, GEQ=183, STDDEV_SAMP=115, 
		DIVIDE=189, BLOB=165, GROUPING=79, ASC=6, SUBPARTITION=116, ELSE=15, NUMBER=196, 
		BOOL=134, TRAILING=46, INT=143, SEMI_COLON=176, RLIKE=109, LEADING=29, 
		TABLESPACE=118, MILLISECONDS=95, REAL=148, INTERSECT=25, GROUP=20, REAL_NUMBER=197, 
		TRIM=123, LOCATION=90, LEFT_PAREN=184, END=14, TIMEZONE_HOUR=121, CAST_EXPRESSION=172, 
		ISOYEAR=86, NCHAR=155, TABLE=44, VARCHAR=154, MICROSECONDS=93, FLOAT=149, 
		ASYMMETRIC=5, SUM=117, Space=202, AS=1, TIME=158, RIGHT_PAREN=185, THEN=45, 
		MAXVALUE=92, AVG=54, LEFT=30, ZONE=132, COLUMN=61, PLUS=186, EXISTS=72, 
		NVARCHAR=156, Not_Similar_To=169, LIKE=31, INTEGER=144, OUTER=37, BY=56, 
		TO=124, RIGHT=40, SET=112, HAVING=21, MIN=96, TEXT=162, MINUS=187, HOUR=81, 
		UNION=48, CONCATENATION_OPERATOR=178, COLON=175, DECIMAL=152, DROP=69, 
		BIGINT=145, WHEN=51, BIT=135, FORMAT=77, NATURAL=33, BETWEEN=55, FIRST=76, 
		CAST=9, EXTERNAL=73, WEEK=130, DOUBLE_QUOTE=195, VARYING=129, CASE=8, 
		INT8=140, CHAR=153, DAY=64, COUNT=62, INT2=138, INT1=137, Identifier=200, 
		INT4=139, QUOTE=194, MODULAR=190, FULL=18, QUARTER=106, THAN=119, INSERT=83, 
		INTERSECTION=84, LESS=88, BOTH=7, TINYINT=141, DOUBLE=150, Similar_To_Case_Insensitive=170, 
		SYMMETRIC=43, LAST=87, SELECT=41, INTO=26, UNIQUE=49, COALESCE=60, SECOND=111, 
		EPOCH=70, ROLLUP=110, NULL=35, EVERY=71, ON=36, NUMERIC=151, INET4=167, 
		LIST=89, UNDERLINE=192, Not_Similar_To_Case_Insensitive=171, CUBE=63, 
		NATIONAL=99, OR=38, VAR_POP=128, FILTER=75, FROM=19, COLLECT=59, FALSE=17, 
		DISTINCT=13, TIMESTAMP=160, DEC=65, WHERE=52, NULLIF=100, VAR_SAMP=127, 
		TIMETZ=159, INNER=24, YEAR=131, ORDER=39, TIMEZONE=120, LIMIT=32, DECADE=66, 
		GTH=182, White_Space=203, MAX=91, LineComment=199, FLOAT4=146, FLOAT8=147, 
		AND=3, CROSS=11, Similar_To=168, INDEX=82, BOOLEAN=133, IN=23, UNKNOWN=125, 
		MULTIPLY=188, COMMA=177, IS=27, PARTITION=102, PARTITIONS=103, SOME=42, 
		ALL=2, EQUAL=174, EXTRACT=74, DOT=191, CENTURY=57, DOW=67, WITH=53, DOY=68, 
		FUSION=78, VARBINARY=164, VALUES=126, HASH=80, MILLENNIUM=94, RANGE=107, 
		PURGE=105, TRUE=47, JOIN=28, SIMILAR=113, LTH=180, ANY=4, BAD=204, ASSIGN=173, 
		DESC=12, BINARY=163, MINUTE=97, DATE=157, SMALLINT=142, LEQ=181;
	public static final String[] tokenNames = {
		"<INVALID>", "AS", "ALL", "AND", "ANY", "ASYMMETRIC", "ASC", "BOTH", "CASE", 
		"CAST", "CREATE", "CROSS", "DESC", "DISTINCT", "END", "ELSE", "EXCEPT", 
		"FALSE", "FULL", "FROM", "GROUP", "HAVING", "ILIKE", "IN", "INNER", "INTERSECT", 
		"INTO", "IS", "JOIN", "LEADING", "LEFT", "LIKE", "LIMIT", "NATURAL", "NOT", 
		"NULL", "ON", "OUTER", "OR", "ORDER", "RIGHT", "SELECT", "SOME", "SYMMETRIC", 
		"TABLE", "THEN", "TRAILING", "TRUE", "UNION", "UNIQUE", "USING", "WHEN", 
		"WHERE", "WITH", "AVG", "BETWEEN", "BY", "CENTURY", "CHARACTER", "COLLECT", 
		"COALESCE", "COLUMN", "COUNT", "CUBE", "DAY", "DEC", "DECADE", "DOW", 
		"DOY", "DROP", "EPOCH", "EVERY", "EXISTS", "EXTERNAL", "EXTRACT", "FILTER", 
		"FIRST", "FORMAT", "FUSION", "GROUPING", "HASH", "HOUR", "INDEX", "INSERT", 
		"INTERSECTION", "ISODOW", "ISOYEAR", "LAST", "LESS", "LIST", "LOCATION", 
		"MAX", "MAXVALUE", "MICROSECONDS", "MILLENNIUM", "MILLISECONDS", "MIN", 
		"MINUTE", "MONTH", "NATIONAL", "NULLIF", "OVERWRITE", "PARTITION", "PARTITIONS", 
		"PRECISION", "PURGE", "QUARTER", "RANGE", "REGEXP", "RLIKE", "ROLLUP", 
		"SECOND", "SET", "SIMILAR", "STDDEV_POP", "STDDEV_SAMP", "SUBPARTITION", 
		"SUM", "TABLESPACE", "THAN", "TIMEZONE", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", 
		"TRIM", "TO", "UNKNOWN", "VALUES", "VAR_SAMP", "VAR_POP", "VARYING", "WEEK", 
		"YEAR", "ZONE", "BOOLEAN", "BOOL", "BIT", "VARBIT", "INT1", "INT2", "INT4", 
		"INT8", "TINYINT", "SMALLINT", "INT", "INTEGER", "BIGINT", "FLOAT4", "FLOAT8", 
		"REAL", "FLOAT", "DOUBLE", "NUMERIC", "DECIMAL", "CHAR", "VARCHAR", "NCHAR", 
		"NVARCHAR", "DATE", "TIME", "TIMETZ", "TIMESTAMP", "TIMESTAMPTZ", "TEXT", 
		"BINARY", "VARBINARY", "BLOB", "BYTEA", "INET4", "'~'", "'!~'", "'~*'", 
		"'!~*'", "CAST_EXPRESSION", "':='", "'='", "':'", "';'", "','", "CONCATENATION_OPERATOR", 
		"NOT_EQUAL", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'.'", "'_'", "'|'", "'''", "'\"'", "NUMBER", "REAL_NUMBER", 
		"BlockComment", "LineComment", "Identifier", "Character_String_Literal", 
		"' '", "White_Space", "BAD"
	};
	public static final int
		RULE_sql = 0, RULE_statement = 1, RULE_data_statement = 2, RULE_data_change_statement = 3, 
		RULE_schema_statement = 4, RULE_index_statement = 5, RULE_create_table_statement = 6, 
		RULE_table_elements = 7, RULE_field_element = 8, RULE_field_type = 9, 
		RULE_param_clause = 10, RULE_param = 11, RULE_method_specifier = 12, RULE_table_space_specifier = 13, 
		RULE_table_space_name = 14, RULE_table_partitioning_clauses = 15, RULE_range_partitions = 16, 
		RULE_range_value_clause_list = 17, RULE_range_value_clause = 18, RULE_hash_partitions = 19, 
		RULE_individual_hash_partitions = 20, RULE_individual_hash_partition = 21, 
		RULE_hash_partitions_by_quantity = 22, RULE_list_partitions = 23, RULE_list_value_clause_list = 24, 
		RULE_list_value_partition = 25, RULE_column_partitions = 26, RULE_partition_name = 27, 
		RULE_drop_table_statement = 28, RULE_identifier = 29, RULE_nonreserved_keywords = 30, 
		RULE_unsigned_literal = 31, RULE_general_literal = 32, RULE_datetime_literal = 33, 
		RULE_time_literal = 34, RULE_timestamp_literal = 35, RULE_date_literal = 36, 
		RULE_boolean_literal = 37, RULE_data_type = 38, RULE_predefined_type = 39, 
		RULE_character_string_type = 40, RULE_type_length = 41, RULE_national_character_string_type = 42, 
		RULE_binary_large_object_string_type = 43, RULE_numeric_type = 44, RULE_exact_numeric_type = 45, 
		RULE_approximate_numeric_type = 46, RULE_precision_param = 47, RULE_boolean_type = 48, 
		RULE_datetime_type = 49, RULE_bit_type = 50, RULE_binary_type = 51, RULE_value_expression_primary = 52, 
		RULE_parenthesized_value_expression = 53, RULE_nonparenthesized_value_expression_primary = 54, 
		RULE_unsigned_value_specification = 55, RULE_unsigned_numeric_literal = 56, 
		RULE_signed_numerical_literal = 57, RULE_set_function_specification = 58, 
		RULE_aggregate_function = 59, RULE_general_set_function = 60, RULE_set_function_type = 61, 
		RULE_filter_clause = 62, RULE_grouping_operation = 63, RULE_case_expression = 64, 
		RULE_case_abbreviation = 65, RULE_case_specification = 66, RULE_simple_case = 67, 
		RULE_searched_case = 68, RULE_simple_when_clause = 69, RULE_searched_when_clause = 70, 
		RULE_else_clause = 71, RULE_result = 72, RULE_cast_specification = 73, 
		RULE_cast_operand = 74, RULE_cast_target = 75, RULE_value_expression = 76, 
		RULE_common_value_expression = 77, RULE_numeric_value_expression = 78, 
		RULE_term = 79, RULE_factor = 80, RULE_array = 81, RULE_numeric_primary = 82, 
		RULE_sign = 83, RULE_numeric_value_function = 84, RULE_extract_expression = 85, 
		RULE_extract_field = 86, RULE_time_zone_field = 87, RULE_extract_source = 88, 
		RULE_string_value_expression = 89, RULE_character_value_expression = 90, 
		RULE_character_factor = 91, RULE_character_primary = 92, RULE_string_value_function = 93, 
		RULE_trim_function = 94, RULE_trim_operands = 95, RULE_trim_specification = 96, 
		RULE_boolean_value_expression = 97, RULE_or_predicate = 98, RULE_and_predicate = 99, 
		RULE_boolean_factor = 100, RULE_boolean_test = 101, RULE_is_clause = 102, 
		RULE_truth_value = 103, RULE_boolean_primary = 104, RULE_boolean_predicand = 105, 
		RULE_parenthesized_boolean_value_expression = 106, RULE_row_value_expression = 107, 
		RULE_row_value_special_case = 108, RULE_explicit_row_value_constructor = 109, 
		RULE_row_value_predicand = 110, RULE_row_value_constructor_predicand = 111, 
		RULE_table_expression = 112, RULE_from_clause = 113, RULE_table_reference_list = 114, 
		RULE_table_reference = 115, RULE_joined_table = 116, RULE_joined_table_primary = 117, 
		RULE_cross_join = 118, RULE_qualified_join = 119, RULE_natural_join = 120, 
		RULE_union_join = 121, RULE_join_type = 122, RULE_outer_join_type = 123, 
		RULE_outer_join_type_part2 = 124, RULE_join_specification = 125, RULE_join_condition = 126, 
		RULE_named_columns_join = 127, RULE_table_primary = 128, RULE_column_name_list = 129, 
		RULE_derived_table = 130, RULE_where_clause = 131, RULE_search_condition = 132, 
		RULE_groupby_clause = 133, RULE_grouping_element_list = 134, RULE_grouping_element = 135, 
		RULE_ordinary_grouping_set = 136, RULE_ordinary_grouping_set_list = 137, 
		RULE_rollup_list = 138, RULE_cube_list = 139, RULE_empty_grouping_set = 140, 
		RULE_having_clause = 141, RULE_row_value_predicand_list = 142, RULE_query_expression = 143, 
		RULE_query_expression_body = 144, RULE_non_join_query_expression = 145, 
		RULE_query_term = 146, RULE_non_join_query_term = 147, RULE_query_primary = 148, 
		RULE_non_join_query_primary = 149, RULE_simple_table = 150, RULE_explicit_table = 151, 
		RULE_table_or_query_name = 152, RULE_table_name = 153, RULE_query_specification = 154, 
		RULE_select_list = 155, RULE_select_sublist = 156, RULE_derived_column = 157, 
		RULE_qualified_asterisk = 158, RULE_set_qualifier = 159, RULE_column_reference = 160, 
		RULE_as_clause = 161, RULE_column_reference_list = 162, RULE_scalar_subquery = 163, 
		RULE_row_subquery = 164, RULE_table_subquery = 165, RULE_subquery = 166, 
		RULE_predicate = 167, RULE_comparison_predicate = 168, RULE_comp_op = 169, 
		RULE_between_predicate = 170, RULE_between_predicate_part_2 = 171, RULE_in_predicate = 172, 
		RULE_in_predicate_value = 173, RULE_in_value_list = 174, RULE_pattern_matching_predicate = 175, 
		RULE_pattern_matcher = 176, RULE_negativable_matcher = 177, RULE_regex_matcher = 178, 
		RULE_null_predicate = 179, RULE_quantified_comparison_predicate = 180, 
		RULE_quantifier = 181, RULE_all = 182, RULE_some = 183, RULE_exists_predicate = 184, 
		RULE_unique_predicate = 185, RULE_primary_datetime_field = 186, RULE_non_second_primary_datetime_field = 187, 
		RULE_extended_datetime_field = 188, RULE_routine_invocation = 189, RULE_function_names_for_reserved_words = 190, 
		RULE_function_name = 191, RULE_sql_argument_list = 192, RULE_orderby_clause = 193, 
		RULE_sort_specifier_list = 194, RULE_sort_specifier = 195, RULE_order_specification = 196, 
		RULE_limit_clause = 197, RULE_null_ordering = 198, RULE_insert_statement = 199, 
		RULE_insert_value_list = 200;
	public static final String[] ruleNames = {
		"sql", "statement", "data_statement", "data_change_statement", "schema_statement", 
		"index_statement", "create_table_statement", "table_elements", "field_element", 
		"field_type", "param_clause", "param", "method_specifier", "table_space_specifier", 
		"table_space_name", "table_partitioning_clauses", "range_partitions", 
		"range_value_clause_list", "range_value_clause", "hash_partitions", "individual_hash_partitions", 
		"individual_hash_partition", "hash_partitions_by_quantity", "list_partitions", 
		"list_value_clause_list", "list_value_partition", "column_partitions", 
		"partition_name", "drop_table_statement", "identifier", "nonreserved_keywords", 
		"unsigned_literal", "general_literal", "datetime_literal", "time_literal", 
		"timestamp_literal", "date_literal", "boolean_literal", "data_type", "predefined_type", 
		"character_string_type", "type_length", "national_character_string_type", 
		"binary_large_object_string_type", "numeric_type", "exact_numeric_type", 
		"approximate_numeric_type", "precision_param", "boolean_type", "datetime_type", 
		"bit_type", "binary_type", "value_expression_primary", "parenthesized_value_expression", 
		"nonparenthesized_value_expression_primary", "unsigned_value_specification", 
		"unsigned_numeric_literal", "signed_numerical_literal", "set_function_specification", 
		"aggregate_function", "general_set_function", "set_function_type", "filter_clause", 
		"grouping_operation", "case_expression", "case_abbreviation", "case_specification", 
		"simple_case", "searched_case", "simple_when_clause", "searched_when_clause", 
		"else_clause", "result", "cast_specification", "cast_operand", "cast_target", 
		"value_expression", "common_value_expression", "numeric_value_expression", 
		"term", "factor", "array", "numeric_primary", "sign", "numeric_value_function", 
		"extract_expression", "extract_field", "time_zone_field", "extract_source", 
		"string_value_expression", "character_value_expression", "character_factor", 
		"character_primary", "string_value_function", "trim_function", "trim_operands", 
		"trim_specification", "boolean_value_expression", "or_predicate", "and_predicate", 
		"boolean_factor", "boolean_test", "is_clause", "truth_value", "boolean_primary", 
		"boolean_predicand", "parenthesized_boolean_value_expression", "row_value_expression", 
		"row_value_special_case", "explicit_row_value_constructor", "row_value_predicand", 
		"row_value_constructor_predicand", "table_expression", "from_clause", 
		"table_reference_list", "table_reference", "joined_table", "joined_table_primary", 
		"cross_join", "qualified_join", "natural_join", "union_join", "join_type", 
		"outer_join_type", "outer_join_type_part2", "join_specification", "join_condition", 
		"named_columns_join", "table_primary", "column_name_list", "derived_table", 
		"where_clause", "search_condition", "groupby_clause", "grouping_element_list", 
		"grouping_element", "ordinary_grouping_set", "ordinary_grouping_set_list", 
		"rollup_list", "cube_list", "empty_grouping_set", "having_clause", "row_value_predicand_list", 
		"query_expression", "query_expression_body", "non_join_query_expression", 
		"query_term", "non_join_query_term", "query_primary", "non_join_query_primary", 
		"simple_table", "explicit_table", "table_or_query_name", "table_name", 
		"query_specification", "select_list", "select_sublist", "derived_column", 
		"qualified_asterisk", "set_qualifier", "column_reference", "as_clause", 
		"column_reference_list", "scalar_subquery", "row_subquery", "table_subquery", 
		"subquery", "predicate", "comparison_predicate", "comp_op", "between_predicate", 
		"between_predicate_part_2", "in_predicate", "in_predicate_value", "in_value_list", 
		"pattern_matching_predicate", "pattern_matcher", "negativable_matcher", 
		"regex_matcher", "null_predicate", "quantified_comparison_predicate", 
		"quantifier", "all", "some", "exists_predicate", "unique_predicate", "primary_datetime_field", 
		"non_second_primary_datetime_field", "extended_datetime_field", "routine_invocation", 
		"function_names_for_reserved_words", "function_name", "sql_argument_list", 
		"orderby_clause", "sort_specifier_list", "sort_specifier", "order_specification", 
		"limit_clause", "null_ordering", "insert_statement", "insert_value_list"
	};

	@Override
	public String getGrammarFileName() { return "SQLParser.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SqlContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(SQLParser.SEMI_COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); statement();
			setState(404);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(403); match(SEMI_COLON);
				}
			}

			setState(406); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Index_statementContext index_statement() {
			return getRuleContext(Index_statementContext.class,0);
		}
		public Schema_statementContext schema_statement() {
			return getRuleContext(Schema_statementContext.class,0);
		}
		public Data_change_statementContext data_change_statement() {
			return getRuleContext(Data_change_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408); data_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409); data_change_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410); schema_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411); index_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_statementContext extends ParserRuleContext {
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Data_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterData_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitData_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitData_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_statementContext data_statement() throws RecognitionException {
		Data_statementContext _localctx = new Data_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); query_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_change_statementContext extends ParserRuleContext {
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Data_change_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_change_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterData_change_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitData_change_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitData_change_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_change_statementContext data_change_statement() throws RecognitionException {
		Data_change_statementContext _localctx = new Data_change_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_change_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); insert_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_statementContext extends ParserRuleContext {
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Schema_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSchema_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSchema_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSchema_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_statementContext schema_statement() throws RecognitionException {
		Schema_statementContext _localctx = new Schema_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_schema_statement);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(418); create_table_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(419); drop_table_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_statementContext extends ParserRuleContext {
		public Token u;
		public IdentifierContext n;
		public Table_nameContext t;
		public Method_specifierContext m;
		public Sort_specifier_listContext s;
		public Param_clauseContext p;
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public Sort_specifier_listContext sort_specifier_list() {
			return getRuleContext(Sort_specifier_listContext.class,0);
		}
		public Param_clauseContext param_clause() {
			return getRuleContext(Param_clauseContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Method_specifierContext method_specifier() {
			return getRuleContext(Method_specifierContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public Index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIndex_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIndex_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIndex_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_statementContext index_statement() throws RecognitionException {
		Index_statementContext _localctx = new Index_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(CREATE);
			setState(424);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(423); ((Index_statementContext)_localctx).u = match(UNIQUE);
				}
			}

			setState(426); match(INDEX);
			setState(427); ((Index_statementContext)_localctx).n = identifier();
			setState(428); match(ON);
			setState(429); ((Index_statementContext)_localctx).t = table_name();
			setState(431);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(430); ((Index_statementContext)_localctx).m = method_specifier();
				}
			}

			setState(433); match(LEFT_PAREN);
			setState(434); ((Index_statementContext)_localctx).s = sort_specifier_list();
			setState(435); match(RIGHT_PAREN);
			setState(437);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(436); ((Index_statementContext)_localctx).p = param_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public IdentifierContext file_type;
		public Token path;
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public Param_clauseContext param_clause() {
			return getRuleContext(Param_clauseContext.class,0);
		}
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public Table_partitioning_clausesContext table_partitioning_clauses() {
			return getRuleContext(Table_partitioning_clausesContext.class,0);
		}
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Table_elementsContext table_elements() {
			return getRuleContext(Table_elementsContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(SQLParser.EXTERNAL, 0); }
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCreate_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCreate_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCreate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_table_statement);
		int _la;
		try {
			setState(489);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439); match(CREATE);
				setState(440); match(EXTERNAL);
				setState(441); match(TABLE);
				setState(442); table_name();
				setState(443); table_elements();
				setState(444); match(USING);
				setState(445); ((Create_table_statementContext)_localctx).file_type = identifier();
				setState(447);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(446); param_clause();
					}
				}

				setState(450);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(449); table_partitioning_clauses();
					}
				}

				{
				setState(452); match(LOCATION);
				setState(453); ((Create_table_statementContext)_localctx).path = match(Character_String_Literal);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455); match(CREATE);
				setState(456); match(TABLE);
				setState(457); table_name();
				setState(458); table_elements();
				setState(461);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(459); match(USING);
					setState(460); ((Create_table_statementContext)_localctx).file_type = identifier();
					}
				}

				setState(464);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(463); param_clause();
					}
				}

				setState(467);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(466); table_partitioning_clauses();
					}
				}

				setState(471);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(469); match(AS);
					setState(470); query_expression();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473); match(CREATE);
				setState(474); match(TABLE);
				setState(475); table_name();
				setState(478);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(476); match(USING);
					setState(477); ((Create_table_statementContext)_localctx).file_type = identifier();
					}
				}

				setState(481);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(480); param_clause();
					}
				}

				setState(484);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(483); table_partitioning_clauses();
					}
				}

				setState(486); match(AS);
				setState(487); query_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_elementsContext extends ParserRuleContext {
		public Field_elementContext field_element(int i) {
			return getRuleContext(Field_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Field_elementContext> field_element() {
			return getRuleContexts(Field_elementContext.class);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_elementsContext table_elements() throws RecognitionException {
		Table_elementsContext _localctx = new Table_elementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_table_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); match(LEFT_PAREN);
			setState(492); field_element();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(493); match(COMMA);
				setState(494); field_element();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_elementContext extends ParserRuleContext {
		public IdentifierContext name;
		public Field_typeContext field_type() {
			return getRuleContext(Field_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Field_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterField_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitField_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitField_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_elementContext field_element() throws RecognitionException {
		Field_elementContext _localctx = new Field_elementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502); ((Field_elementContext)_localctx).name = identifier();
			setState(503); field_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Field_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterField_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitField_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitField_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_typeContext field_type() throws RecognitionException {
		Field_typeContext _localctx = new Field_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_clauseContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Param_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterParam_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitParam_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitParam_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_clauseContext param_clause() throws RecognitionException {
		Param_clauseContext _localctx = new Param_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); match(WITH);
			setState(508); match(LEFT_PAREN);
			setState(509); param();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(510); match(COMMA);
				setState(511); param();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Token key;
		public Numeric_value_expressionContext value;
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); ((ParamContext)_localctx).key = match(Character_String_Literal);
			setState(520); match(EQUAL);
			setState(521); ((ParamContext)_localctx).value = numeric_value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_specifierContext extends ParserRuleContext {
		public IdentifierContext m;
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Method_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterMethod_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitMethod_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitMethod_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_specifierContext method_specifier() throws RecognitionException {
		Method_specifierContext _localctx = new Method_specifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); match(USING);
			setState(524); ((Method_specifierContext)_localctx).m = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_space_specifierContext extends ParserRuleContext {
		public Table_space_nameContext table_space_name() {
			return getRuleContext(Table_space_nameContext.class,0);
		}
		public TerminalNode TABLESPACE() { return getToken(SQLParser.TABLESPACE, 0); }
		public Table_space_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_space_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_space_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_space_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_space_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_space_specifierContext table_space_specifier() throws RecognitionException {
		Table_space_specifierContext _localctx = new Table_space_specifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_table_space_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); match(TABLESPACE);
			setState(527); table_space_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_space_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_space_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_space_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_space_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_space_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_space_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_space_nameContext table_space_name() throws RecognitionException {
		Table_space_nameContext _localctx = new Table_space_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table_space_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_partitioning_clausesContext extends ParserRuleContext {
		public Column_partitionsContext column_partitions() {
			return getRuleContext(Column_partitionsContext.class,0);
		}
		public Hash_partitionsContext hash_partitions() {
			return getRuleContext(Hash_partitionsContext.class,0);
		}
		public List_partitionsContext list_partitions() {
			return getRuleContext(List_partitionsContext.class,0);
		}
		public Range_partitionsContext range_partitions() {
			return getRuleContext(Range_partitionsContext.class,0);
		}
		public Table_partitioning_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_partitioning_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_partitioning_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_partitioning_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_partitioning_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_partitioning_clausesContext table_partitioning_clauses() throws RecognitionException {
		Table_partitioning_clausesContext _localctx = new Table_partitioning_clausesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_partitioning_clauses);
		try {
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531); range_partitions();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532); hash_partitions();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533); list_partitions();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534); column_partitions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_partitionsContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(SQLParser.RANGE, 0); }
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public Range_value_clause_listContext range_value_clause_list() {
			return getRuleContext(Range_value_clause_listContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public Range_partitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_partitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRange_partitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRange_partitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRange_partitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_partitionsContext range_partitions() throws RecognitionException {
		Range_partitionsContext _localctx = new Range_partitionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_range_partitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537); match(PARTITION);
			setState(538); match(BY);
			setState(539); match(RANGE);
			setState(540); match(LEFT_PAREN);
			setState(541); column_reference_list();
			setState(542); match(RIGHT_PAREN);
			setState(543); match(LEFT_PAREN);
			setState(544); range_value_clause_list();
			setState(545); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_value_clause_listContext extends ParserRuleContext {
		public Range_value_clauseContext range_value_clause(int i) {
			return getRuleContext(Range_value_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Range_value_clauseContext> range_value_clause() {
			return getRuleContexts(Range_value_clauseContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Range_value_clause_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_value_clause_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRange_value_clause_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRange_value_clause_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRange_value_clause_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_value_clause_listContext range_value_clause_list() throws RecognitionException {
		Range_value_clause_listContext _localctx = new Range_value_clause_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range_value_clause_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); range_value_clause();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(548); match(COMMA);
				setState(549); range_value_clause();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_value_clauseContext extends ParserRuleContext {
		public TerminalNode THAN() { return getToken(SQLParser.THAN, 0); }
		public TerminalNode LESS() { return getToken(SQLParser.LESS, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public TerminalNode MAXVALUE() { return getToken(SQLParser.MAXVALUE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public Range_value_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_value_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRange_value_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRange_value_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRange_value_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_value_clauseContext range_value_clause() throws RecognitionException {
		Range_value_clauseContext _localctx = new Range_value_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_range_value_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(PARTITION);
			setState(556); partition_name();
			setState(557); match(VALUES);
			setState(558); match(LESS);
			setState(559); match(THAN);
			setState(571);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(560); match(LEFT_PAREN);
				setState(561); value_expression();
				setState(562); match(RIGHT_PAREN);
				}
				break;

			case 2:
				{
				setState(565);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(564); match(LEFT_PAREN);
					}
				}

				setState(567); match(MAXVALUE);
				setState(569);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(568); match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hash_partitionsContext extends ParserRuleContext {
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public Hash_partitions_by_quantityContext hash_partitions_by_quantity() {
			return getRuleContext(Hash_partitions_by_quantityContext.class,0);
		}
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public Individual_hash_partitionsContext individual_hash_partitions() {
			return getRuleContext(Individual_hash_partitionsContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode HASH() { return getToken(SQLParser.HASH, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public Hash_partitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_partitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterHash_partitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitHash_partitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitHash_partitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hash_partitionsContext hash_partitions() throws RecognitionException {
		Hash_partitionsContext _localctx = new Hash_partitionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_hash_partitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(PARTITION);
			setState(574); match(BY);
			setState(575); match(HASH);
			setState(576); match(LEFT_PAREN);
			setState(577); column_reference_list();
			setState(578); match(RIGHT_PAREN);
			setState(584);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(579); match(LEFT_PAREN);
				setState(580); individual_hash_partitions();
				setState(581); match(RIGHT_PAREN);
				}
				break;
			case PARTITIONS:
				{
				setState(583); hash_partitions_by_quantity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Individual_hash_partitionsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Individual_hash_partitionContext> individual_hash_partition() {
			return getRuleContexts(Individual_hash_partitionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Individual_hash_partitionContext individual_hash_partition(int i) {
			return getRuleContext(Individual_hash_partitionContext.class,i);
		}
		public Individual_hash_partitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individual_hash_partitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIndividual_hash_partitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIndividual_hash_partitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIndividual_hash_partitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Individual_hash_partitionsContext individual_hash_partitions() throws RecognitionException {
		Individual_hash_partitionsContext _localctx = new Individual_hash_partitionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_individual_hash_partitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); individual_hash_partition();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(587); match(COMMA);
				setState(588); individual_hash_partition();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Individual_hash_partitionContext extends ParserRuleContext {
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public Individual_hash_partitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individual_hash_partition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIndividual_hash_partition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIndividual_hash_partition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIndividual_hash_partition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Individual_hash_partitionContext individual_hash_partition() throws RecognitionException {
		Individual_hash_partitionContext _localctx = new Individual_hash_partitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_individual_hash_partition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594); match(PARTITION);
			setState(595); partition_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hash_partitions_by_quantityContext extends ParserRuleContext {
		public Numeric_value_expressionContext quantity;
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode PARTITIONS() { return getToken(SQLParser.PARTITIONS, 0); }
		public Hash_partitions_by_quantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_partitions_by_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterHash_partitions_by_quantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitHash_partitions_by_quantity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitHash_partitions_by_quantity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hash_partitions_by_quantityContext hash_partitions_by_quantity() throws RecognitionException {
		Hash_partitions_by_quantityContext _localctx = new Hash_partitions_by_quantityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_hash_partitions_by_quantity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(PARTITIONS);
			setState(598); ((Hash_partitions_by_quantityContext)_localctx).quantity = numeric_value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_partitionsContext extends ParserRuleContext {
		public List_value_clause_listContext list_value_clause_list() {
			return getRuleContext(List_value_clause_listContext.class,0);
		}
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode LIST() { return getToken(SQLParser.LIST, 0); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public List_partitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_partitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterList_partitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitList_partitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitList_partitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_partitionsContext list_partitions() throws RecognitionException {
		List_partitionsContext _localctx = new List_partitionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list_partitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600); match(PARTITION);
			setState(601); match(BY);
			setState(602); match(LIST);
			setState(603); match(LEFT_PAREN);
			setState(604); column_reference_list();
			setState(605); match(RIGHT_PAREN);
			setState(606); match(LEFT_PAREN);
			setState(607); list_value_clause_list();
			setState(608); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_value_clause_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<List_value_partitionContext> list_value_partition() {
			return getRuleContexts(List_value_partitionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List_value_partitionContext list_value_partition(int i) {
			return getRuleContext(List_value_partitionContext.class,i);
		}
		public List_value_clause_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_value_clause_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterList_value_clause_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitList_value_clause_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitList_value_clause_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_value_clause_listContext list_value_clause_list() throws RecognitionException {
		List_value_clause_listContext _localctx = new List_value_clause_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list_value_clause_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); list_value_partition();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(611); match(COMMA);
				setState(612); list_value_partition();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_value_partitionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public In_value_listContext in_value_list() {
			return getRuleContext(In_value_listContext.class,0);
		}
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public List_value_partitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_value_partition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterList_value_partition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitList_value_partition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitList_value_partition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_value_partitionContext list_value_partition() throws RecognitionException {
		List_value_partitionContext _localctx = new List_value_partitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_list_value_partition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); match(PARTITION);
			setState(619); partition_name();
			setState(620); match(VALUES);
			setState(622);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(621); match(IN);
				}
			}

			setState(624); match(LEFT_PAREN);
			setState(625); in_value_list();
			setState(626); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_partitionsContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public Table_elementsContext table_elements() {
			return getRuleContext(Table_elementsContext.class,0);
		}
		public Column_partitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_partitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_partitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_partitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumn_partitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_partitionsContext column_partitions() throws RecognitionException {
		Column_partitionsContext _localctx = new Column_partitionsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_column_partitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628); match(PARTITION);
			setState(629); match(BY);
			setState(630); match(COLUMN);
			setState(631); table_elements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPartition_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPartition_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPartition_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode PURGE() { return getToken(SQLParser.PURGE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDrop_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDrop_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDrop_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); match(DROP);
			setState(636); match(TABLE);
			setState(637); table_name();
			setState(639);
			_la = _input.LA(1);
			if (_la==PURGE) {
				{
				setState(638); match(PURGE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Nonreserved_keywordsContext nonreserved_keywords() {
			return getRuleContext(Nonreserved_keywordsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SQLParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		try {
			setState(643);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(641); match(Identifier);
				}
				break;
			case AVG:
			case BETWEEN:
			case BY:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXISTS:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case REGEXP:
			case RLIKE:
			case ROLLUP:
			case SECOND:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNKNOWN:
			case VALUES:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case WEEK:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
				enterOuterAlt(_localctx, 2);
				{
				setState(642); nonreserved_keywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonreserved_keywordsContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public TerminalNode COALESCE() { return getToken(SQLParser.COALESCE, 0); }
		public TerminalNode STDDEV_POP() { return getToken(SQLParser.STDDEV_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(SQLParser.VAR_SAMP, 0); }
		public TerminalNode BIT() { return getToken(SQLParser.BIT, 0); }
		public TerminalNode SUM() { return getToken(SQLParser.SUM, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode QUARTER() { return getToken(SQLParser.QUARTER, 0); }
		public TerminalNode EVERY() { return getToken(SQLParser.EVERY, 0); }
		public TerminalNode NVARCHAR() { return getToken(SQLParser.NVARCHAR, 0); }
		public TerminalNode INT1() { return getToken(SQLParser.INT1, 0); }
		public TerminalNode MAX() { return getToken(SQLParser.MAX, 0); }
		public TerminalNode ROLLUP() { return getToken(SQLParser.ROLLUP, 0); }
		public TerminalNode SECOND() { return getToken(SQLParser.SECOND, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode YEAR() { return getToken(SQLParser.YEAR, 0); }
		public TerminalNode SIMILAR() { return getToken(SQLParser.SIMILAR, 0); }
		public TerminalNode RLIKE() { return getToken(SQLParser.RLIKE, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode PURGE() { return getToken(SQLParser.PURGE, 0); }
		public TerminalNode BYTEA() { return getToken(SQLParser.BYTEA, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public TerminalNode VARBINARY() { return getToken(SQLParser.VARBINARY, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
		public TerminalNode AVG() { return getToken(SQLParser.AVG, 0); }
		public TerminalNode INET4() { return getToken(SQLParser.INET4, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode FLOAT8() { return getToken(SQLParser.FLOAT8, 0); }
		public TerminalNode VAR_POP() { return getToken(SQLParser.VAR_POP, 0); }
		public TerminalNode MINUTE() { return getToken(SQLParser.MINUTE, 0); }
		public TerminalNode ISOYEAR() { return getToken(SQLParser.ISOYEAR, 0); }
		public TerminalNode LAST() { return getToken(SQLParser.LAST, 0); }
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public TerminalNode OVERWRITE() { return getToken(SQLParser.OVERWRITE, 0); }
		public TerminalNode NCHAR() { return getToken(SQLParser.NCHAR, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(SQLParser.TIMEZONE_HOUR, 0); }
		public TerminalNode TIMETZ() { return getToken(SQLParser.TIMETZ, 0); }
		public TerminalNode TABLESPACE() { return getToken(SQLParser.TABLESPACE, 0); }
		public TerminalNode TEXT() { return getToken(SQLParser.TEXT, 0); }
		public TerminalNode MONTH() { return getToken(SQLParser.MONTH, 0); }
		public TerminalNode BLOB() { return getToken(SQLParser.BLOB, 0); }
		public TerminalNode DEC() { return getToken(SQLParser.DEC, 0); }
		public TerminalNode INTERSECTION() { return getToken(SQLParser.INTERSECTION, 0); }
		public TerminalNode LESS() { return getToken(SQLParser.LESS, 0); }
		public TerminalNode MILLENNIUM() { return getToken(SQLParser.MILLENNIUM, 0); }
		public TerminalNode TINYINT() { return getToken(SQLParser.TINYINT, 0); }
		public TerminalNode GROUPING() { return getToken(SQLParser.GROUPING, 0); }
		public TerminalNode TIMESTAMPTZ() { return getToken(SQLParser.TIMESTAMPTZ, 0); }
		public TerminalNode NATIONAL() { return getToken(SQLParser.NATIONAL, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public TerminalNode FUSION() { return getToken(SQLParser.FUSION, 0); }
		public TerminalNode INT2() { return getToken(SQLParser.INT2, 0); }
		public TerminalNode VARBIT() { return getToken(SQLParser.VARBIT, 0); }
		public TerminalNode WEEK() { return getToken(SQLParser.WEEK, 0); }
		public TerminalNode ZONE() { return getToken(SQLParser.ZONE, 0); }
		public TerminalNode FIRST() { return getToken(SQLParser.FIRST, 0); }
		public TerminalNode NULLIF() { return getToken(SQLParser.NULLIF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode TIME() { return getToken(SQLParser.TIME, 0); }
		public TerminalNode TRIM() { return getToken(SQLParser.TRIM, 0); }
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode DOUBLE() { return getToken(SQLParser.DOUBLE, 0); }
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public TerminalNode CENTURY() { return getToken(SQLParser.CENTURY, 0); }
		public TerminalNode LIST() { return getToken(SQLParser.LIST, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLParser.SMALLINT, 0); }
		public TerminalNode ISODOW() { return getToken(SQLParser.ISODOW, 0); }
		public TerminalNode FORMAT() { return getToken(SQLParser.FORMAT, 0); }
		public TerminalNode DOY() { return getToken(SQLParser.DOY, 0); }
		public TerminalNode MIN() { return getToken(SQLParser.MIN, 0); }
		public TerminalNode FILTER() { return getToken(SQLParser.FILTER, 0); }
		public TerminalNode PRECISION() { return getToken(SQLParser.PRECISION, 0); }
		public TerminalNode SUBPARTITION() { return getToken(SQLParser.SUBPARTITION, 0); }
		public TerminalNode DOW() { return getToken(SQLParser.DOW, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLParser.EXTERNAL, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SQLParser.MICROSECONDS, 0); }
		public TerminalNode HASH() { return getToken(SQLParser.HASH, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLParser.DECIMAL, 0); }
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public TerminalNode THAN() { return getToken(SQLParser.THAN, 0); }
		public TerminalNode EPOCH() { return getToken(SQLParser.EPOCH, 0); }
		public TerminalNode REGEXP() { return getToken(SQLParser.REGEXP, 0); }
		public TerminalNode TIMEZONE() { return getToken(SQLParser.TIMEZONE, 0); }
		public TerminalNode FLOAT4() { return getToken(SQLParser.FLOAT4, 0); }
		public TerminalNode CUBE() { return getToken(SQLParser.CUBE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(SQLParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public TerminalNode REAL() { return getToken(SQLParser.REAL, 0); }
		public TerminalNode DAY() { return getToken(SQLParser.DAY, 0); }
		public TerminalNode COLLECT() { return getToken(SQLParser.COLLECT, 0); }
		public TerminalNode BIGINT() { return getToken(SQLParser.BIGINT, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(SQLParser.STDDEV_SAMP, 0); }
		public TerminalNode RANGE() { return getToken(SQLParser.RANGE, 0); }
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public TerminalNode EXTRACT() { return getToken(SQLParser.EXTRACT, 0); }
		public TerminalNode MAXVALUE() { return getToken(SQLParser.MAXVALUE, 0); }
		public TerminalNode INT4() { return getToken(SQLParser.INT4, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SQLParser.MILLISECONDS, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLParser.NUMERIC, 0); }
		public TerminalNode BOOL() { return getToken(SQLParser.BOOL, 0); }
		public TerminalNode INT8() { return getToken(SQLParser.INT8, 0); }
		public TerminalNode DECADE() { return getToken(SQLParser.DECADE, 0); }
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLParser.PARTITIONS, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public Nonreserved_keywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonreserved_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNonreserved_keywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNonreserved_keywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNonreserved_keywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonreserved_keywordsContext nonreserved_keywords() throws RecognitionException {
		Nonreserved_keywordsContext _localctx = new Nonreserved_keywordsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (AVG - 54)) | (1L << (BETWEEN - 54)) | (1L << (BY - 54)) | (1L << (CENTURY - 54)) | (1L << (CHARACTER - 54)) | (1L << (COLLECT - 54)) | (1L << (COALESCE - 54)) | (1L << (COLUMN - 54)) | (1L << (COUNT - 54)) | (1L << (CUBE - 54)) | (1L << (DAY - 54)) | (1L << (DEC - 54)) | (1L << (DECADE - 54)) | (1L << (DOW - 54)) | (1L << (DOY - 54)) | (1L << (DROP - 54)) | (1L << (EPOCH - 54)) | (1L << (EVERY - 54)) | (1L << (EXISTS - 54)) | (1L << (EXTERNAL - 54)) | (1L << (EXTRACT - 54)) | (1L << (FILTER - 54)) | (1L << (FIRST - 54)) | (1L << (FORMAT - 54)) | (1L << (FUSION - 54)) | (1L << (GROUPING - 54)) | (1L << (HASH - 54)) | (1L << (INDEX - 54)) | (1L << (INSERT - 54)) | (1L << (INTERSECTION - 54)) | (1L << (ISODOW - 54)) | (1L << (ISOYEAR - 54)) | (1L << (LAST - 54)) | (1L << (LESS - 54)) | (1L << (LIST - 54)) | (1L << (LOCATION - 54)) | (1L << (MAX - 54)) | (1L << (MAXVALUE - 54)) | (1L << (MICROSECONDS - 54)) | (1L << (MILLENNIUM - 54)) | (1L << (MILLISECONDS - 54)) | (1L << (MIN - 54)) | (1L << (MINUTE - 54)) | (1L << (MONTH - 54)) | (1L << (NATIONAL - 54)) | (1L << (NULLIF - 54)) | (1L << (OVERWRITE - 54)) | (1L << (PARTITION - 54)) | (1L << (PARTITIONS - 54)) | (1L << (PRECISION - 54)) | (1L << (PURGE - 54)) | (1L << (QUARTER - 54)) | (1L << (RANGE - 54)) | (1L << (REGEXP - 54)) | (1L << (RLIKE - 54)) | (1L << (ROLLUP - 54)) | (1L << (SECOND - 54)) | (1L << (SET - 54)) | (1L << (SIMILAR - 54)) | (1L << (STDDEV_POP - 54)) | (1L << (STDDEV_SAMP - 54)) | (1L << (SUBPARTITION - 54)) | (1L << (SUM - 54)))) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (TABLESPACE - 118)) | (1L << (THAN - 118)) | (1L << (TIMEZONE - 118)) | (1L << (TIMEZONE_HOUR - 118)) | (1L << (TIMEZONE_MINUTE - 118)) | (1L << (TRIM - 118)) | (1L << (TO - 118)) | (1L << (UNKNOWN - 118)) | (1L << (VALUES - 118)) | (1L << (VAR_SAMP - 118)) | (1L << (VAR_POP - 118)) | (1L << (VARYING - 118)) | (1L << (WEEK - 118)) | (1L << (YEAR - 118)) | (1L << (ZONE - 118)) | (1L << (BOOLEAN - 118)) | (1L << (BOOL - 118)) | (1L << (BIT - 118)) | (1L << (VARBIT - 118)) | (1L << (INT1 - 118)) | (1L << (INT2 - 118)) | (1L << (INT4 - 118)) | (1L << (INT8 - 118)) | (1L << (TINYINT - 118)) | (1L << (SMALLINT - 118)) | (1L << (INT - 118)) | (1L << (INTEGER - 118)) | (1L << (BIGINT - 118)) | (1L << (FLOAT4 - 118)) | (1L << (FLOAT8 - 118)) | (1L << (REAL - 118)) | (1L << (FLOAT - 118)) | (1L << (DOUBLE - 118)) | (1L << (NUMERIC - 118)) | (1L << (DECIMAL - 118)) | (1L << (CHAR - 118)) | (1L << (VARCHAR - 118)) | (1L << (NCHAR - 118)) | (1L << (NVARCHAR - 118)) | (1L << (DATE - 118)) | (1L << (TIME - 118)) | (1L << (TIMETZ - 118)) | (1L << (TIMESTAMP - 118)) | (1L << (TIMESTAMPTZ - 118)) | (1L << (TEXT - 118)) | (1L << (VARBINARY - 118)) | (1L << (BLOB - 118)) | (1L << (BYTEA - 118)) | (1L << (INET4 - 118)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_literalContext extends ParserRuleContext {
		public General_literalContext general_literal() {
			return getRuleContext(General_literalContext.class,0);
		}
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public Unsigned_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUnsigned_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUnsigned_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUnsigned_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_literalContext unsigned_literal() throws RecognitionException {
		Unsigned_literalContext _localctx = new Unsigned_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unsigned_literal);
		try {
			setState(649);
			switch (_input.LA(1)) {
			case NUMBER:
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(647); unsigned_numeric_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case Character_String_Literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(648); general_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_literalContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Datetime_literalContext datetime_literal() {
			return getRuleContext(Datetime_literalContext.class,0);
		}
		public General_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterGeneral_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitGeneral_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitGeneral_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_literalContext general_literal() throws RecognitionException {
		General_literalContext _localctx = new General_literalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_general_literal);
		try {
			setState(654);
			switch (_input.LA(1)) {
			case Character_String_Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(651); match(Character_String_Literal);
				}
				break;
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(652); datetime_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
				enterOuterAlt(_localctx, 3);
				{
				setState(653); boolean_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datetime_literalContext extends ParserRuleContext {
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Time_literalContext time_literal() {
			return getRuleContext(Time_literalContext.class,0);
		}
		public Datetime_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatetime_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatetime_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatetime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_literalContext datetime_literal() throws RecognitionException {
		Datetime_literalContext _localctx = new Datetime_literalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_datetime_literal);
		try {
			setState(659);
			switch (_input.LA(1)) {
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(656); timestamp_literal();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(657); time_literal();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(658); date_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_literalContext extends ParserRuleContext {
		public Token time_string;
		public TerminalNode TIME() { return getToken(SQLParser.TIME, 0); }
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Time_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTime_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTime_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_literalContext time_literal() throws RecognitionException {
		Time_literalContext _localctx = new Time_literalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_time_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); match(TIME);
			setState(662); ((Time_literalContext)_localctx).time_string = match(Character_String_Literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public Token timestamp_string;
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664); match(TIMESTAMP);
			setState(665); ((Timestamp_literalContext)_localctx).timestamp_string = match(Character_String_Literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public Token date_string;
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); match(DATE);
			setState(668); ((Date_literalContext)_localctx).date_string = match(Character_String_Literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672); predefined_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_typeContext extends ParserRuleContext {
		public Bit_typeContext bit_type() {
			return getRuleContext(Bit_typeContext.class,0);
		}
		public Character_string_typeContext character_string_type() {
			return getRuleContext(Character_string_typeContext.class,0);
		}
		public Binary_large_object_string_typeContext binary_large_object_string_type() {
			return getRuleContext(Binary_large_object_string_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public National_character_string_typeContext national_character_string_type() {
			return getRuleContext(National_character_string_typeContext.class,0);
		}
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public Binary_typeContext binary_type() {
			return getRuleContext(Binary_typeContext.class,0);
		}
		public Datetime_typeContext datetime_type() {
			return getRuleContext(Datetime_typeContext.class,0);
		}
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPredefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPredefined_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPredefined_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_predefined_type);
		try {
			setState(682);
			switch (_input.LA(1)) {
			case CHARACTER:
			case CHAR:
			case VARCHAR:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(674); character_string_type();
				}
				break;
			case NATIONAL:
			case NCHAR:
			case NVARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(675); national_character_string_type();
				}
				break;
			case BLOB:
			case BYTEA:
				enterOuterAlt(_localctx, 3);
				{
				setState(676); binary_large_object_string_type();
				}
				break;
			case DEC:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(677); numeric_type();
				}
				break;
			case BOOLEAN:
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(678); boolean_type();
				}
				break;
			case DATE:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
				enterOuterAlt(_localctx, 6);
				{
				setState(679); datetime_type();
				}
				break;
			case BIT:
			case VARBIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(680); bit_type();
				}
				break;
			case BINARY:
			case VARBINARY:
				enterOuterAlt(_localctx, 8);
				{
				setState(681); binary_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_string_typeContext extends ParserRuleContext {
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(SQLParser.TEXT, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public Character_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCharacter_string_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCharacter_string_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCharacter_string_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_string_typeContext character_string_type() throws RecognitionException {
		Character_string_typeContext _localctx = new Character_string_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_character_string_type);
		int _la;
		try {
			setState(707);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684); match(CHARACTER);
				setState(686);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(685); type_length();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688); match(CHAR);
				setState(690);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(689); type_length();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692); match(CHARACTER);
				setState(693); match(VARYING);
				setState(695);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(694); type_length();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(697); match(CHAR);
				setState(698); match(VARYING);
				setState(700);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(699); type_length();
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(702); match(VARCHAR);
				setState(704);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(703); type_length();
					}
				}

				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(706); match(TEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_lengthContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode NUMBER() { return getToken(SQLParser.NUMBER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Type_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterType_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitType_length(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitType_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_lengthContext type_length() throws RecognitionException {
		Type_lengthContext _localctx = new Type_lengthContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709); match(LEFT_PAREN);
			setState(710); match(NUMBER);
			setState(711); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class National_character_string_typeContext extends ParserRuleContext {
		public TerminalNode NATIONAL() { return getToken(SQLParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode NVARCHAR() { return getToken(SQLParser.NVARCHAR, 0); }
		public TerminalNode NCHAR() { return getToken(SQLParser.NCHAR, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public National_character_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_national_character_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNational_character_string_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNational_character_string_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNational_character_string_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final National_character_string_typeContext national_character_string_type() throws RecognitionException {
		National_character_string_typeContext _localctx = new National_character_string_typeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_national_character_string_type);
		int _la;
		try {
			setState(748);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713); match(NATIONAL);
				setState(714); match(CHARACTER);
				setState(716);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(715); type_length();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718); match(NATIONAL);
				setState(719); match(CHAR);
				setState(721);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(720); type_length();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723); match(NCHAR);
				setState(725);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(724); type_length();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(727); match(NATIONAL);
				setState(728); match(CHARACTER);
				setState(729); match(VARYING);
				setState(731);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(730); type_length();
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(733); match(NATIONAL);
				setState(734); match(CHAR);
				setState(735); match(VARYING);
				setState(737);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(736); type_length();
					}
				}

				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(739); match(NCHAR);
				setState(740); match(VARYING);
				setState(742);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(741); type_length();
					}
				}

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(744); match(NVARCHAR);
				setState(746);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(745); type_length();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_large_object_string_typeContext extends ParserRuleContext {
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode BLOB() { return getToken(SQLParser.BLOB, 0); }
		public TerminalNode BYTEA() { return getToken(SQLParser.BYTEA, 0); }
		public Binary_large_object_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_large_object_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBinary_large_object_string_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBinary_large_object_string_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBinary_large_object_string_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_large_object_string_typeContext binary_large_object_string_type() throws RecognitionException {
		Binary_large_object_string_typeContext _localctx = new Binary_large_object_string_typeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_binary_large_object_string_type);
		int _la;
		try {
			setState(758);
			switch (_input.LA(1)) {
			case BLOB:
				enterOuterAlt(_localctx, 1);
				{
				setState(750); match(BLOB);
				setState(752);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(751); type_length();
					}
				}

				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(754); match(BYTEA);
				setState(756);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(755); type_length();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_typeContext extends ParserRuleContext {
		public Exact_numeric_typeContext exact_numeric_type() {
			return getRuleContext(Exact_numeric_typeContext.class,0);
		}
		public Approximate_numeric_typeContext approximate_numeric_type() {
			return getRuleContext(Approximate_numeric_typeContext.class,0);
		}
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNumeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNumeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNumeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_numeric_type);
		try {
			setState(762);
			switch (_input.LA(1)) {
			case DEC:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case NUMERIC:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(760); exact_numeric_type();
				}
				break;
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(761); approximate_numeric_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exact_numeric_typeContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(SQLParser.TINYINT, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode DEC() { return getToken(SQLParser.DEC, 0); }
		public TerminalNode INT1() { return getToken(SQLParser.INT1, 0); }
		public TerminalNode INT4() { return getToken(SQLParser.INT4, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLParser.NUMERIC, 0); }
		public Precision_paramContext precision_param() {
			return getRuleContext(Precision_paramContext.class,0);
		}
		public TerminalNode INT8() { return getToken(SQLParser.INT8, 0); }
		public TerminalNode INT2() { return getToken(SQLParser.INT2, 0); }
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLParser.DECIMAL, 0); }
		public TerminalNode BIGINT() { return getToken(SQLParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLParser.SMALLINT, 0); }
		public Exact_numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exact_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExact_numeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExact_numeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExact_numeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exact_numeric_typeContext exact_numeric_type() throws RecognitionException {
		Exact_numeric_typeContext _localctx = new Exact_numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exact_numeric_type);
		int _la;
		try {
			setState(785);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(764); match(NUMERIC);
				setState(766);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(765); precision_param();
					}
				}

				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(768); match(DECIMAL);
				setState(770);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(769); precision_param();
					}
				}

				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(772); match(DEC);
				setState(774);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(773); precision_param();
					}
				}

				}
				break;
			case INT1:
				enterOuterAlt(_localctx, 4);
				{
				setState(776); match(INT1);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(777); match(TINYINT);
				}
				break;
			case INT2:
				enterOuterAlt(_localctx, 6);
				{
				setState(778); match(INT2);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(779); match(SMALLINT);
				}
				break;
			case INT4:
				enterOuterAlt(_localctx, 8);
				{
				setState(780); match(INT4);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 9);
				{
				setState(781); match(INT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 10);
				{
				setState(782); match(INTEGER);
				}
				break;
			case INT8:
				enterOuterAlt(_localctx, 11);
				{
				setState(783); match(INT8);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 12);
				{
				setState(784); match(BIGINT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Approximate_numeric_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public Precision_paramContext precision_param() {
			return getRuleContext(Precision_paramContext.class,0);
		}
		public TerminalNode FLOAT4() { return getToken(SQLParser.FLOAT4, 0); }
		public TerminalNode DOUBLE() { return getToken(SQLParser.DOUBLE, 0); }
		public TerminalNode REAL() { return getToken(SQLParser.REAL, 0); }
		public TerminalNode PRECISION() { return getToken(SQLParser.PRECISION, 0); }
		public TerminalNode FLOAT8() { return getToken(SQLParser.FLOAT8, 0); }
		public Approximate_numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_approximate_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterApproximate_numeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitApproximate_numeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitApproximate_numeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Approximate_numeric_typeContext approximate_numeric_type() throws RecognitionException {
		Approximate_numeric_typeContext _localctx = new Approximate_numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_approximate_numeric_type);
		int _la;
		try {
			setState(797);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787); match(FLOAT);
				setState(789);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(788); precision_param();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791); match(FLOAT4);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(792); match(REAL);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(793); match(FLOAT8);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(794); match(DOUBLE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(795); match(DOUBLE);
				setState(796); match(PRECISION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precision_paramContext extends ParserRuleContext {
		public Token precision;
		public Token scale;
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SQLParser.NUMBER); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Precision_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPrecision_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPrecision_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPrecision_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precision_paramContext precision_param() throws RecognitionException {
		Precision_paramContext _localctx = new Precision_paramContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_precision_param);
		try {
			setState(807);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799); match(LEFT_PAREN);
				setState(800); ((Precision_paramContext)_localctx).precision = match(NUMBER);
				setState(801); match(RIGHT_PAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802); match(LEFT_PAREN);
				setState(803); ((Precision_paramContext)_localctx).precision = match(NUMBER);
				setState(804); match(COMMA);
				setState(805); ((Precision_paramContext)_localctx).scale = match(NUMBER);
				setState(806); match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SQLParser.BOOL, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLParser.BOOLEAN, 0); }
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBoolean_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBoolean_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBoolean_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_boolean_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datetime_typeContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public List<TerminalNode> TIME() { return getTokens(SQLParser.TIME); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode TIME(int i) {
			return getToken(SQLParser.TIME, i);
		}
		public TerminalNode TIMETZ() { return getToken(SQLParser.TIMETZ, 0); }
		public TerminalNode ZONE() { return getToken(SQLParser.ZONE, 0); }
		public TerminalNode TIMESTAMPTZ() { return getToken(SQLParser.TIMESTAMPTZ, 0); }
		public Datetime_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatetime_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatetime_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatetime_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_typeContext datetime_type() throws RecognitionException {
		Datetime_typeContext _localctx = new Datetime_typeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_datetime_type);
		try {
			setState(824);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811); match(DATE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812); match(TIME);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813); match(TIME);
				setState(814); match(WITH);
				setState(815); match(TIME);
				setState(816); match(ZONE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(817); match(TIMETZ);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(818); match(TIMESTAMP);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(819); match(TIMESTAMP);
				setState(820); match(WITH);
				setState(821); match(TIME);
				setState(822); match(ZONE);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(823); match(TIMESTAMPTZ);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_typeContext extends ParserRuleContext {
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode BIT() { return getToken(SQLParser.BIT, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode VARBIT() { return getToken(SQLParser.VARBIT, 0); }
		public Bit_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBit_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBit_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBit_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_typeContext bit_type() throws RecognitionException {
		Bit_typeContext _localctx = new Bit_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bit_type);
		int _la;
		try {
			setState(839);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826); match(BIT);
				setState(828);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(827); type_length();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830); match(VARBIT);
				setState(832);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(831); type_length();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(834); match(BIT);
				setState(835); match(VARYING);
				setState(837);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(836); type_length();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_typeContext extends ParserRuleContext {
		public TerminalNode VARBINARY() { return getToken(SQLParser.VARBINARY, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(SQLParser.BINARY, 0); }
		public Binary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBinary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBinary_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBinary_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_typeContext binary_type() throws RecognitionException {
		Binary_typeContext _localctx = new Binary_typeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_binary_type);
		int _la;
		try {
			setState(854);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(841); match(BINARY);
				setState(843);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(842); type_length();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845); match(BINARY);
				setState(846); match(VARYING);
				setState(848);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(847); type_length();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(850); match(VARBINARY);
				setState(852);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(851); type_length();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_expression_primaryContext extends ParserRuleContext {
		public Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() {
			return getRuleContext(Nonparenthesized_value_expression_primaryContext.class,0);
		}
		public Parenthesized_value_expressionContext parenthesized_value_expression() {
			return getRuleContext(Parenthesized_value_expressionContext.class,0);
		}
		public Value_expression_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterValue_expression_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitValue_expression_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitValue_expression_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_expression_primaryContext value_expression_primary() throws RecognitionException {
		Value_expression_primaryContext _localctx = new Value_expression_primaryContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_value_expression_primary);
		try {
			setState(858);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856); parenthesized_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857); nonparenthesized_value_expression_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_value_expressionContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Parenthesized_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterParenthesized_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitParenthesized_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitParenthesized_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_value_expressionContext parenthesized_value_expression() throws RecognitionException {
		Parenthesized_value_expressionContext _localctx = new Parenthesized_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parenthesized_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860); match(LEFT_PAREN);
			setState(861); value_expression();
			setState(862); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonparenthesized_value_expression_primaryContext extends ParserRuleContext {
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Unsigned_value_specificationContext unsigned_value_specification() {
			return getRuleContext(Unsigned_value_specificationContext.class,0);
		}
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public Cast_specificationContext cast_specification() {
			return getRuleContext(Cast_specificationContext.class,0);
		}
		public Set_function_specificationContext set_function_specification() {
			return getRuleContext(Set_function_specificationContext.class,0);
		}
		public Column_referenceContext column_reference() {
			return getRuleContext(Column_referenceContext.class,0);
		}
		public Routine_invocationContext routine_invocation() {
			return getRuleContext(Routine_invocationContext.class,0);
		}
		public Nonparenthesized_value_expression_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonparenthesized_value_expression_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNonparenthesized_value_expression_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNonparenthesized_value_expression_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNonparenthesized_value_expression_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() throws RecognitionException {
		Nonparenthesized_value_expression_primaryContext _localctx = new Nonparenthesized_value_expression_primaryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_nonparenthesized_value_expression_primary);
		try {
			setState(871);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(864); unsigned_value_specification();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865); column_reference();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(866); set_function_specification();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(867); scalar_subquery();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(868); case_expression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(869); cast_specification();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(870); routine_invocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_value_specificationContext extends ParserRuleContext {
		public Unsigned_literalContext unsigned_literal() {
			return getRuleContext(Unsigned_literalContext.class,0);
		}
		public Unsigned_value_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_value_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUnsigned_value_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUnsigned_value_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUnsigned_value_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_value_specificationContext unsigned_value_specification() throws RecognitionException {
		Unsigned_value_specificationContext _localctx = new Unsigned_value_specificationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unsigned_value_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873); unsigned_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_numeric_literalContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(SQLParser.REAL_NUMBER, 0); }
		public TerminalNode NUMBER() { return getToken(SQLParser.NUMBER, 0); }
		public Unsigned_numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUnsigned_numeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUnsigned_numeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUnsigned_numeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_numeric_literalContext unsigned_numeric_literal() throws RecognitionException {
		Unsigned_numeric_literalContext _localctx = new Unsigned_numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unsigned_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numerical_literalContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public Signed_numerical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_numerical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSigned_numerical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSigned_numerical_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSigned_numerical_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numerical_literalContext signed_numerical_literal() throws RecognitionException {
		Signed_numerical_literalContext _localctx = new Signed_numerical_literalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_signed_numerical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(877); sign();
				}
			}

			setState(880); unsigned_numeric_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_function_specificationContext extends ParserRuleContext {
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public Set_function_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_function_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSet_function_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSet_function_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSet_function_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_function_specificationContext set_function_specification() throws RecognitionException {
		Set_function_specificationContext _localctx = new Set_function_specificationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_set_function_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882); aggregate_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_functionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public General_set_functionContext general_set_function() {
			return getRuleContext(General_set_functionContext.class,0);
		}
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAggregate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAggregate_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAggregate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_aggregate_function);
		try {
			setState(892);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884); match(COUNT);
				setState(885); match(LEFT_PAREN);
				setState(886); match(MULTIPLY);
				setState(887); match(RIGHT_PAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888); general_set_function();
				setState(890);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(889); filter_clause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_set_functionContext extends ParserRuleContext {
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Set_function_typeContext set_function_type() {
			return getRuleContext(Set_function_typeContext.class,0);
		}
		public General_set_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_set_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterGeneral_set_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitGeneral_set_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitGeneral_set_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_set_functionContext general_set_function() throws RecognitionException {
		General_set_functionContext _localctx = new General_set_functionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_general_set_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894); set_function_type();
			setState(895); match(LEFT_PAREN);
			setState(897);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(896); set_qualifier();
				}
			}

			setState(899); value_expression();
			setState(900); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_function_typeContext extends ParserRuleContext {
		public TerminalNode STDDEV_SAMP() { return getToken(SQLParser.STDDEV_SAMP, 0); }
		public TerminalNode STDDEV_POP() { return getToken(SQLParser.STDDEV_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(SQLParser.VAR_SAMP, 0); }
		public TerminalNode SUM() { return getToken(SQLParser.SUM, 0); }
		public TerminalNode EVERY() { return getToken(SQLParser.EVERY, 0); }
		public TerminalNode ANY() { return getToken(SQLParser.ANY, 0); }
		public TerminalNode AVG() { return getToken(SQLParser.AVG, 0); }
		public TerminalNode INTERSECTION() { return getToken(SQLParser.INTERSECTION, 0); }
		public TerminalNode MIN() { return getToken(SQLParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SQLParser.MAX, 0); }
		public TerminalNode VAR_POP() { return getToken(SQLParser.VAR_POP, 0); }
		public TerminalNode SOME() { return getToken(SQLParser.SOME, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode FUSION() { return getToken(SQLParser.FUSION, 0); }
		public TerminalNode COLLECT() { return getToken(SQLParser.COLLECT, 0); }
		public Set_function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSet_function_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSet_function_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSet_function_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_function_typeContext set_function_type() throws RecognitionException {
		Set_function_typeContext _localctx = new Set_function_typeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_set_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << SOME) | (1L << AVG) | (1L << COLLECT) | (1L << COUNT))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (EVERY - 71)) | (1L << (FUSION - 71)) | (1L << (INTERSECTION - 71)) | (1L << (MAX - 71)) | (1L << (MIN - 71)) | (1L << (STDDEV_POP - 71)) | (1L << (STDDEV_SAMP - 71)) | (1L << (SUM - 71)) | (1L << (VAR_SAMP - 71)) | (1L << (VAR_POP - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode FILTER() { return getToken(SQLParser.FILTER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Filter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFilter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFilter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitFilter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_clauseContext filter_clause() throws RecognitionException {
		Filter_clauseContext _localctx = new Filter_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_filter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); match(FILTER);
			setState(905); match(LEFT_PAREN);
			setState(906); match(WHERE);
			setState(907); search_condition();
			setState(908); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_operationContext extends ParserRuleContext {
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode GROUPING() { return getToken(SQLParser.GROUPING, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Grouping_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterGrouping_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitGrouping_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitGrouping_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_operationContext grouping_operation() throws RecognitionException {
		Grouping_operationContext _localctx = new Grouping_operationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_grouping_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910); match(GROUPING);
			setState(911); match(LEFT_PAREN);
			setState(912); column_reference_list();
			setState(913); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_expressionContext extends ParserRuleContext {
		public Case_specificationContext case_specification() {
			return getRuleContext(Case_specificationContext.class,0);
		}
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCase_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_case_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915); case_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_abbreviationContext extends ParserRuleContext {
		public TerminalNode COALESCE() { return getToken(SQLParser.COALESCE, 0); }
		public Boolean_value_expressionContext boolean_value_expression(int i) {
			return getRuleContext(Boolean_value_expressionContext.class,i);
		}
		public TerminalNode NULLIF() { return getToken(SQLParser.NULLIF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Boolean_value_expressionContext> boolean_value_expression() {
			return getRuleContexts(Boolean_value_expressionContext.class);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Case_abbreviationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_abbreviation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCase_abbreviation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCase_abbreviation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCase_abbreviation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_abbreviationContext case_abbreviation() throws RecognitionException {
		Case_abbreviationContext _localctx = new Case_abbreviationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_case_abbreviation);
		int _la;
		try {
			setState(935);
			switch (_input.LA(1)) {
			case NULLIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(917); match(NULLIF);
				setState(918); match(LEFT_PAREN);
				setState(919); numeric_value_expression();
				setState(920); match(COMMA);
				setState(921); boolean_value_expression();
				setState(922); match(RIGHT_PAREN);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(924); match(COALESCE);
				setState(925); match(LEFT_PAREN);
				setState(926); numeric_value_expression();
				setState(929); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(927); match(COMMA);
					setState(928); boolean_value_expression();
					}
					}
					setState(931); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(933); match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_specificationContext extends ParserRuleContext {
		public Searched_caseContext searched_case() {
			return getRuleContext(Searched_caseContext.class,0);
		}
		public Simple_caseContext simple_case() {
			return getRuleContext(Simple_caseContext.class,0);
		}
		public Case_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCase_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCase_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCase_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_specificationContext case_specification() throws RecognitionException {
		Case_specificationContext _localctx = new Case_specificationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_case_specification);
		try {
			setState(939);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937); simple_case();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938); searched_case();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_caseContext extends ParserRuleContext {
		public List<Simple_when_clauseContext> simple_when_clause() {
			return getRuleContexts(Simple_when_clauseContext.class);
		}
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public TerminalNode CASE() { return getToken(SQLParser.CASE, 0); }
		public Simple_when_clauseContext simple_when_clause(int i) {
			return getRuleContext(Simple_when_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public TerminalNode END() { return getToken(SQLParser.END, 0); }
		public Simple_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSimple_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSimple_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSimple_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_caseContext simple_case() throws RecognitionException {
		Simple_caseContext _localctx = new Simple_caseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_simple_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941); match(CASE);
			setState(942); boolean_value_expression();
			setState(944); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(943); simple_when_clause();
				}
				}
				setState(946); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(949);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(948); else_clause();
				}
			}

			setState(951); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Searched_caseContext extends ParserRuleContext {
		public List<Searched_when_clauseContext> searched_when_clause() {
			return getRuleContexts(Searched_when_clauseContext.class);
		}
		public TerminalNode CASE() { return getToken(SQLParser.CASE, 0); }
		public Searched_when_clauseContext searched_when_clause(int i) {
			return getRuleContext(Searched_when_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public TerminalNode END() { return getToken(SQLParser.END, 0); }
		public Searched_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searched_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSearched_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSearched_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSearched_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Searched_caseContext searched_case() throws RecognitionException {
		Searched_caseContext _localctx = new Searched_caseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_searched_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953); match(CASE);
			setState(955); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(954); searched_when_clause();
				}
				}
				setState(957); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(960);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(959); else_clause();
				}
			}

			setState(962); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_when_clauseContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SQLParser.THEN, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(SQLParser.WHEN, 0); }
		public Simple_when_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_when_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSimple_when_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSimple_when_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSimple_when_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_when_clauseContext simple_when_clause() throws RecognitionException {
		Simple_when_clauseContext _localctx = new Simple_when_clauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_simple_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964); match(WHEN);
			setState(965); search_condition();
			setState(966); match(THEN);
			setState(967); result();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Searched_when_clauseContext extends ParserRuleContext {
		public Search_conditionContext c;
		public ResultContext r;
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SQLParser.THEN, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(SQLParser.WHEN, 0); }
		public Searched_when_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searched_when_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSearched_when_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSearched_when_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSearched_when_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Searched_when_clauseContext searched_when_clause() throws RecognitionException {
		Searched_when_clauseContext _localctx = new Searched_when_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_searched_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969); match(WHEN);
			setState(970); ((Searched_when_clauseContext)_localctx).c = search_condition();
			setState(971); match(THEN);
			setState(972); ((Searched_when_clauseContext)_localctx).r = result();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public ResultContext r;
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SQLParser.ELSE, 0); }
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); match(ELSE);
			setState(975); ((Else_clauseContext)_localctx).r = result();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_result);
		try {
			setState(979);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977); value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978); match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_specificationContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_operandContext cast_operand() {
			return getRuleContext(Cast_operandContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(SQLParser.CAST, 0); }
		public Cast_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCast_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCast_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCast_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_specificationContext cast_specification() throws RecognitionException {
		Cast_specificationContext _localctx = new Cast_specificationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_cast_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981); match(CAST);
			setState(982); match(LEFT_PAREN);
			setState(983); cast_operand();
			setState(984); match(AS);
			setState(985); cast_target();
			setState(986); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_operandContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Cast_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCast_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCast_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCast_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_operandContext cast_operand() throws RecognitionException {
		Cast_operandContext _localctx = new Cast_operandContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_cast_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988); value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_targetContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCast_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCast_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_cast_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_expressionContext extends ParserRuleContext {
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public Common_value_expressionContext common_value_expression() {
			return getRuleContext(Common_value_expressionContext.class,0);
		}
		public Row_value_expressionContext row_value_expression() {
			return getRuleContext(Row_value_expressionContext.class,0);
		}
		public Value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterValue_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitValue_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitValue_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_value_expression);
		try {
			setState(995);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992); common_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993); row_value_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(994); boolean_value_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_value_expressionContext extends ParserRuleContext {
		public String_value_expressionContext string_value_expression() {
			return getRuleContext(String_value_expressionContext.class,0);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Common_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCommon_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCommon_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCommon_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_value_expressionContext common_value_expression() throws RecognitionException {
		Common_value_expressionContext _localctx = new Common_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_common_value_expression);
		try {
			setState(1000);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997); numeric_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998); string_value_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(999); match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_value_expressionContext extends ParserRuleContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Numeric_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNumeric_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNumeric_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNumeric_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_value_expressionContext numeric_value_expression() throws RecognitionException {
		Numeric_value_expressionContext _localctx = new Numeric_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_numeric_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002); ((Numeric_value_expressionContext)_localctx).left = term();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(1003);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1004); ((Numeric_value_expressionContext)_localctx).right = term();
				}
				}
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext left;
		public FactorContext right;
		public List<TerminalNode> MODULAR() { return getTokens(SQLParser.MODULAR); }
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MULTIPLY(int i) {
			return getToken(SQLParser.MULTIPLY, i);
		}
		public TerminalNode DIVIDE(int i) {
			return getToken(SQLParser.DIVIDE, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(SQLParser.MULTIPLY); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SQLParser.DIVIDE); }
		public TerminalNode MODULAR(int i) {
			return getToken(SQLParser.MODULAR, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010); ((TermContext)_localctx).left = factor();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (MULTIPLY - 188)) | (1L << (DIVIDE - 188)) | (1L << (MODULAR - 188)))) != 0)) {
				{
				{
				setState(1011);
				_la = _input.LA(1);
				if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (MULTIPLY - 188)) | (1L << (DIVIDE - 188)) | (1L << (MODULAR - 188)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1012); ((TermContext)_localctx).right = factor();
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Numeric_primaryContext numeric_primary() {
			return getRuleContext(Numeric_primaryContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1018); sign();
				}
			}

			setState(1021); numeric_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Numeric_value_expressionContext> numeric_value_expression() {
			return getRuleContexts(Numeric_value_expressionContext.class);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Numeric_value_expressionContext numeric_value_expression(int i) {
			return getRuleContext(Numeric_value_expressionContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023); match(LEFT_PAREN);
			setState(1024); numeric_value_expression();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1025); match(COMMA);
				setState(1026); numeric_value_expression();
				}
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_primaryContext extends ParserRuleContext {
		public Cast_targetContext cast_target(int i) {
			return getRuleContext(Cast_targetContext.class,i);
		}
		public List<Cast_targetContext> cast_target() {
			return getRuleContexts(Cast_targetContext.class);
		}
		public Numeric_value_functionContext numeric_value_function() {
			return getRuleContext(Numeric_value_functionContext.class,0);
		}
		public List<TerminalNode> CAST_EXPRESSION() { return getTokens(SQLParser.CAST_EXPRESSION); }
		public TerminalNode CAST_EXPRESSION(int i) {
			return getToken(SQLParser.CAST_EXPRESSION, i);
		}
		public Value_expression_primaryContext value_expression_primary() {
			return getRuleContext(Value_expression_primaryContext.class,0);
		}
		public Numeric_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNumeric_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNumeric_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNumeric_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_primaryContext numeric_primary() throws RecognitionException {
		Numeric_primaryContext _localctx = new Numeric_primaryContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_numeric_primary);
		int _la;
		try {
			setState(1043);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034); value_expression_primary();
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CAST_EXPRESSION) {
					{
					{
					setState(1035); match(CAST_EXPRESSION);
					setState(1036); cast_target();
					}
					}
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042); numeric_value_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_value_functionContext extends ParserRuleContext {
		public Extract_expressionContext extract_expression() {
			return getRuleContext(Extract_expressionContext.class,0);
		}
		public Numeric_value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_value_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNumeric_value_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNumeric_value_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNumeric_value_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_value_functionContext numeric_value_function() throws RecognitionException {
		Numeric_value_functionContext _localctx = new Numeric_value_functionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_numeric_value_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047); extract_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_expressionContext extends ParserRuleContext {
		public Extract_fieldContext extract_field_string;
		public Extract_fieldContext extract_field() {
			return getRuleContext(Extract_fieldContext.class,0);
		}
		public TerminalNode EXTRACT() { return getToken(SQLParser.EXTRACT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Extract_sourceContext extract_source() {
			return getRuleContext(Extract_sourceContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public Extract_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExtract_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExtract_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExtract_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_expressionContext extract_expression() throws RecognitionException {
		Extract_expressionContext _localctx = new Extract_expressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_extract_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); match(EXTRACT);
			setState(1050); match(LEFT_PAREN);
			setState(1051); ((Extract_expressionContext)_localctx).extract_field_string = extract_field();
			setState(1052); match(FROM);
			setState(1053); extract_source();
			setState(1054); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_fieldContext extends ParserRuleContext {
		public Extended_datetime_fieldContext extended_datetime_field() {
			return getRuleContext(Extended_datetime_fieldContext.class,0);
		}
		public Primary_datetime_fieldContext primary_datetime_field() {
			return getRuleContext(Primary_datetime_fieldContext.class,0);
		}
		public Time_zone_fieldContext time_zone_field() {
			return getRuleContext(Time_zone_fieldContext.class,0);
		}
		public Extract_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExtract_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExtract_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExtract_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_fieldContext extract_field() throws RecognitionException {
		Extract_fieldContext _localctx = new Extract_fieldContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_extract_field);
		try {
			setState(1059);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056); primary_datetime_field();
				}
				break;
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057); time_zone_field();
				}
				break;
			case CENTURY:
			case DECADE:
			case DOW:
			case DOY:
			case EPOCH:
			case ISODOW:
			case ISOYEAR:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case QUARTER:
			case WEEK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1058); extended_datetime_field();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_zone_fieldContext extends ParserRuleContext {
		public TerminalNode TIMEZONE_MINUTE() { return getToken(SQLParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode TIMEZONE() { return getToken(SQLParser.TIMEZONE, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(SQLParser.TIMEZONE_HOUR, 0); }
		public Time_zone_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_zone_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTime_zone_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTime_zone_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTime_zone_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_zone_fieldContext time_zone_field() throws RecognitionException {
		Time_zone_fieldContext _localctx = new Time_zone_fieldContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_time_zone_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (TIMEZONE - 120)) | (1L << (TIMEZONE_HOUR - 120)) | (1L << (TIMEZONE_MINUTE - 120)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_sourceContext extends ParserRuleContext {
		public Column_referenceContext column_reference() {
			return getRuleContext(Column_referenceContext.class,0);
		}
		public Datetime_literalContext datetime_literal() {
			return getRuleContext(Datetime_literalContext.class,0);
		}
		public Extract_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExtract_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExtract_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExtract_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_sourceContext extract_source() throws RecognitionException {
		Extract_sourceContext _localctx = new Extract_sourceContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_extract_source);
		try {
			setState(1065);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063); column_reference();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064); datetime_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_value_expressionContext extends ParserRuleContext {
		public Character_value_expressionContext character_value_expression() {
			return getRuleContext(Character_value_expressionContext.class,0);
		}
		public String_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterString_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitString_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitString_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_value_expressionContext string_value_expression() throws RecognitionException {
		String_value_expressionContext _localctx = new String_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_string_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); character_value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_value_expressionContext extends ParserRuleContext {
		public List<TerminalNode> CONCATENATION_OPERATOR() { return getTokens(SQLParser.CONCATENATION_OPERATOR); }
		public List<Character_factorContext> character_factor() {
			return getRuleContexts(Character_factorContext.class);
		}
		public TerminalNode CONCATENATION_OPERATOR(int i) {
			return getToken(SQLParser.CONCATENATION_OPERATOR, i);
		}
		public Character_factorContext character_factor(int i) {
			return getRuleContext(Character_factorContext.class,i);
		}
		public Character_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCharacter_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCharacter_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCharacter_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_value_expressionContext character_value_expression() throws RecognitionException {
		Character_value_expressionContext _localctx = new Character_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_character_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069); character_factor();
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCATENATION_OPERATOR) {
				{
				{
				setState(1070); match(CONCATENATION_OPERATOR);
				setState(1071); character_factor();
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_factorContext extends ParserRuleContext {
		public Character_primaryContext character_primary() {
			return getRuleContext(Character_primaryContext.class,0);
		}
		public Character_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCharacter_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCharacter_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCharacter_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_factorContext character_factor() throws RecognitionException {
		Character_factorContext _localctx = new Character_factorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_character_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077); character_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_primaryContext extends ParserRuleContext {
		public String_value_functionContext string_value_function() {
			return getRuleContext(String_value_functionContext.class,0);
		}
		public Value_expression_primaryContext value_expression_primary() {
			return getRuleContext(Value_expression_primaryContext.class,0);
		}
		public Character_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCharacter_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCharacter_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCharacter_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_primaryContext character_primary() throws RecognitionException {
		Character_primaryContext _localctx = new Character_primaryContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_character_primary);
		try {
			setState(1081);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079); value_expression_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1080); string_value_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_value_functionContext extends ParserRuleContext {
		public Trim_functionContext trim_function() {
			return getRuleContext(Trim_functionContext.class,0);
		}
		public String_value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterString_value_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitString_value_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitString_value_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_value_functionContext string_value_function() throws RecognitionException {
		String_value_functionContext _localctx = new String_value_functionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_string_value_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083); trim_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trim_functionContext extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(SQLParser.TRIM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Trim_operandsContext trim_operands() {
			return getRuleContext(Trim_operandsContext.class,0);
		}
		public Trim_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTrim_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTrim_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTrim_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trim_functionContext trim_function() throws RecognitionException {
		Trim_functionContext _localctx = new Trim_functionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_trim_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085); match(TRIM);
			setState(1086); match(LEFT_PAREN);
			setState(1087); trim_operands();
			setState(1088); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trim_operandsContext extends ParserRuleContext {
		public Character_value_expressionContext trim_character;
		public Character_value_expressionContext trim_source;
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Character_value_expressionContext character_value_expression(int i) {
			return getRuleContext(Character_value_expressionContext.class,i);
		}
		public Trim_specificationContext trim_specification() {
			return getRuleContext(Trim_specificationContext.class,0);
		}
		public List<Character_value_expressionContext> character_value_expression() {
			return getRuleContexts(Character_value_expressionContext.class);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public Trim_operandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_operands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTrim_operands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTrim_operands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTrim_operands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trim_operandsContext trim_operands() throws RecognitionException {
		Trim_operandsContext _localctx = new Trim_operandsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_trim_operands);
		int _la;
		try {
			setState(1104);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1091);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOTH) | (1L << LEADING) | (1L << TRAILING))) != 0)) {
						{
						setState(1090); trim_specification();
						}
					}

					setState(1094);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << SOME) | (1L << TRUE) | (1L << AVG) | (1L << BETWEEN) | (1L << BY) | (1L << CENTURY) | (1L << CHARACTER) | (1L << COLLECT) | (1L << COALESCE) | (1L << COLUMN) | (1L << COUNT) | (1L << CUBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAY - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXISTS - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAST - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (OVERWRITE - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (PRECISION - 64)) | (1L << (PURGE - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (REGEXP - 64)) | (1L << (RLIKE - 64)) | (1L << (ROLLUP - 64)) | (1L << (SECOND - 64)) | (1L << (SET - 64)) | (1L << (SIMILAR - 64)) | (1L << (STDDEV_POP - 64)) | (1L << (STDDEV_SAMP - 64)) | (1L << (SUBPARTITION - 64)) | (1L << (SUM - 64)) | (1L << (TABLESPACE - 64)) | (1L << (THAN - 64)) | (1L << (TIMEZONE - 64)) | (1L << (TIMEZONE_HOUR - 64)) | (1L << (TIMEZONE_MINUTE - 64)) | (1L << (TRIM - 64)) | (1L << (TO - 64)) | (1L << (UNKNOWN - 64)) | (1L << (VALUES - 64)) | (1L << (VAR_SAMP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)) | (1L << (DECIMAL - 128)) | (1L << (CHAR - 128)) | (1L << (VARCHAR - 128)) | (1L << (NCHAR - 128)) | (1L << (NVARCHAR - 128)) | (1L << (DATE - 128)) | (1L << (TIME - 128)) | (1L << (TIMETZ - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TIMESTAMPTZ - 128)) | (1L << (TEXT - 128)) | (1L << (VARBINARY - 128)) | (1L << (BLOB - 128)) | (1L << (BYTEA - 128)) | (1L << (INET4 - 128)) | (1L << (LEFT_PAREN - 128)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (NUMBER - 196)) | (1L << (REAL_NUMBER - 196)) | (1L << (Identifier - 196)) | (1L << (Character_String_Literal - 196)))) != 0)) {
						{
						setState(1093); ((Trim_operandsContext)_localctx).trim_character = character_value_expression();
						}
					}

					setState(1096); match(FROM);
					}
					break;
				}
				setState(1099); ((Trim_operandsContext)_localctx).trim_source = character_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100); ((Trim_operandsContext)_localctx).trim_source = character_value_expression();
				setState(1101); match(COMMA);
				setState(1102); ((Trim_operandsContext)_localctx).trim_character = character_value_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trim_specificationContext extends ParserRuleContext {
		public TerminalNode BOTH() { return getToken(SQLParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(SQLParser.TRAILING, 0); }
		public TerminalNode LEADING() { return getToken(SQLParser.LEADING, 0); }
		public Trim_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTrim_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTrim_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTrim_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trim_specificationContext trim_specification() throws RecognitionException {
		Trim_specificationContext _localctx = new Trim_specificationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_trim_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOTH) | (1L << LEADING) | (1L << TRAILING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_value_expressionContext extends ParserRuleContext {
		public Or_predicateContext or_predicate() {
			return getRuleContext(Or_predicateContext.class,0);
		}
		public Boolean_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBoolean_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBoolean_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBoolean_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_value_expressionContext boolean_value_expression() throws RecognitionException {
		Boolean_value_expressionContext _localctx = new Boolean_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_boolean_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108); or_predicate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_predicateContext extends ParserRuleContext {
		public List<Or_predicateContext> or_predicate() {
			return getRuleContexts(Or_predicateContext.class);
		}
		public Or_predicateContext or_predicate(int i) {
			return getRuleContext(Or_predicateContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SQLParser.OR); }
		public And_predicateContext and_predicate() {
			return getRuleContext(And_predicateContext.class,0);
		}
		public TerminalNode OR(int i) {
			return getToken(SQLParser.OR, i);
		}
		public Or_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOr_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOr_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOr_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_predicateContext or_predicate() throws RecognitionException {
		Or_predicateContext _localctx = new Or_predicateContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_or_predicate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1110); and_predicate();
			setState(1115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1111); match(OR);
					setState(1112); or_predicate();
					}
					} 
				}
				setState(1117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_predicateContext extends ParserRuleContext {
		public Boolean_factorContext boolean_factor() {
			return getRuleContext(Boolean_factorContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(SQLParser.AND); }
		public List<And_predicateContext> and_predicate() {
			return getRuleContexts(And_predicateContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(SQLParser.AND, i);
		}
		public And_predicateContext and_predicate(int i) {
			return getRuleContext(And_predicateContext.class,i);
		}
		public And_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAnd_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAnd_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAnd_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_predicateContext and_predicate() throws RecognitionException {
		And_predicateContext _localctx = new And_predicateContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_and_predicate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1118); boolean_factor();
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1119); match(AND);
					setState(1120); and_predicate();
					}
					} 
				}
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_factorContext extends ParserRuleContext {
		public Boolean_testContext boolean_test() {
			return getRuleContext(Boolean_testContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Boolean_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBoolean_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBoolean_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBoolean_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_factorContext boolean_factor() throws RecognitionException {
		Boolean_factorContext _localctx = new Boolean_factorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_boolean_factor);
		try {
			setState(1129);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126); boolean_test();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127); match(NOT);
				setState(1128); boolean_test();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_testContext extends ParserRuleContext {
		public Is_clauseContext is_clause() {
			return getRuleContext(Is_clauseContext.class,0);
		}
		public Boolean_primaryContext boolean_primary() {
			return getRuleContext(Boolean_primaryContext.class,0);
		}
		public Boolean_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBoolean_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBoolean_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBoolean_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_testContext boolean_test() throws RecognitionException {
		Boolean_testContext _localctx = new Boolean_testContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_boolean_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131); boolean_primary();
			setState(1133);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1132); is_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_clauseContext extends ParserRuleContext {
		public Truth_valueContext t;
		public Truth_valueContext truth_value() {
			return getRuleContext(Truth_valueContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public Is_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIs_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIs_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIs_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_clauseContext is_clause() throws RecognitionException {
		Is_clauseContext _localctx = new Is_clauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_is_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135); match(IS);
			setState(1137);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1136); match(NOT);
				}
			}

			setState(1139); ((Is_clauseContext)_localctx).t = truth_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truth_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public Truth_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truth_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTruth_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTruth_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTruth_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truth_valueContext truth_value() throws RecognitionException {
		Truth_valueContext _localctx = new Truth_valueContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_truth_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_primaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Boolean_predicandContext boolean_predicand() {
			return getRuleContext(Boolean_predicandContext.class,0);
		}
		public Boolean_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBoolean_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBoolean_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBoolean_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_primaryContext boolean_primary() throws RecognitionException {
		Boolean_primaryContext _localctx = new Boolean_primaryContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_boolean_primary);
		try {
			setState(1145);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143); predicate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144); boolean_predicand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_predicandContext extends ParserRuleContext {
		public Parenthesized_boolean_value_expressionContext parenthesized_boolean_value_expression() {
			return getRuleContext(Parenthesized_boolean_value_expressionContext.class,0);
		}
		public Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() {
			return getRuleContext(Nonparenthesized_value_expression_primaryContext.class,0);
		}
		public Boolean_predicandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_predicand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBoolean_predicand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBoolean_predicand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBoolean_predicand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_predicandContext boolean_predicand() throws RecognitionException {
		Boolean_predicandContext _localctx = new Boolean_predicandContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_boolean_predicand);
		try {
			setState(1149);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147); parenthesized_boolean_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148); nonparenthesized_value_expression_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_boolean_value_expressionContext extends ParserRuleContext {
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Parenthesized_boolean_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_boolean_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterParenthesized_boolean_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitParenthesized_boolean_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitParenthesized_boolean_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_boolean_value_expressionContext parenthesized_boolean_value_expression() throws RecognitionException {
		Parenthesized_boolean_value_expressionContext _localctx = new Parenthesized_boolean_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parenthesized_boolean_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151); match(LEFT_PAREN);
			setState(1152); boolean_value_expression();
			setState(1153); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_expressionContext extends ParserRuleContext {
		public Row_value_special_caseContext row_value_special_case() {
			return getRuleContext(Row_value_special_caseContext.class,0);
		}
		public Explicit_row_value_constructorContext explicit_row_value_constructor() {
			return getRuleContext(Explicit_row_value_constructorContext.class,0);
		}
		public Row_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRow_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRow_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRow_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_value_expressionContext row_value_expression() throws RecognitionException {
		Row_value_expressionContext _localctx = new Row_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_row_value_expression);
		try {
			setState(1157);
			switch (_input.LA(1)) {
			case ANY:
			case CASE:
			case CAST:
			case FALSE:
			case LEFT:
			case RIGHT:
			case SOME:
			case TRUE:
			case AVG:
			case BETWEEN:
			case BY:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXISTS:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case REGEXP:
			case RLIKE:
			case ROLLUP:
			case SECOND:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNKNOWN:
			case VALUES:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case WEEK:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case LEFT_PAREN:
			case NUMBER:
			case REAL_NUMBER:
			case Identifier:
			case Character_String_Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155); row_value_special_case();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156); explicit_row_value_constructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_special_caseContext extends ParserRuleContext {
		public Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() {
			return getRuleContext(Nonparenthesized_value_expression_primaryContext.class,0);
		}
		public Row_value_special_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_special_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRow_value_special_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRow_value_special_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRow_value_special_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_value_special_caseContext row_value_special_case() throws RecognitionException {
		Row_value_special_caseContext _localctx = new Row_value_special_caseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_row_value_special_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159); nonparenthesized_value_expression_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_row_value_constructorContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Explicit_row_value_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_row_value_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExplicit_row_value_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExplicit_row_value_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExplicit_row_value_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_row_value_constructorContext explicit_row_value_constructor() throws RecognitionException {
		Explicit_row_value_constructorContext _localctx = new Explicit_row_value_constructorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_explicit_row_value_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161); match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_predicandContext extends ParserRuleContext {
		public Row_value_special_caseContext row_value_special_case() {
			return getRuleContext(Row_value_special_caseContext.class,0);
		}
		public Row_value_constructor_predicandContext row_value_constructor_predicand() {
			return getRuleContext(Row_value_constructor_predicandContext.class,0);
		}
		public Row_value_predicandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_predicand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRow_value_predicand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRow_value_predicand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRow_value_predicand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_value_predicandContext row_value_predicand() throws RecognitionException {
		Row_value_predicandContext _localctx = new Row_value_predicandContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_row_value_predicand);
		try {
			setState(1165);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163); row_value_special_case();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164); row_value_constructor_predicand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_constructor_predicandContext extends ParserRuleContext {
		public Boolean_predicandContext boolean_predicand() {
			return getRuleContext(Boolean_predicandContext.class,0);
		}
		public Common_value_expressionContext common_value_expression() {
			return getRuleContext(Common_value_expressionContext.class,0);
		}
		public Row_value_constructor_predicandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_constructor_predicand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRow_value_constructor_predicand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRow_value_constructor_predicand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRow_value_constructor_predicand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_value_constructor_predicandContext row_value_constructor_predicand() throws RecognitionException {
		Row_value_constructor_predicandContext _localctx = new Row_value_constructor_predicandContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_row_value_constructor_predicand);
		try {
			setState(1169);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167); common_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168); boolean_predicand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_expressionContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_expressionContext table_expression() throws RecognitionException {
		Table_expressionContext _localctx = new Table_expressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171); from_clause();
			setState(1173);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1172); where_clause();
				}
			}

			setState(1176);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1175); groupby_clause();
				}
			}

			setState(1179);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1178); having_clause();
				}
			}

			setState(1182);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1181); orderby_clause();
				}
			}

			setState(1185);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1184); limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public Table_reference_listContext table_reference_list() {
			return getRuleContext(Table_reference_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187); match(FROM);
			setState(1188); table_reference_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_reference_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_reference_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_reference_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_reference_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_reference_listContext table_reference_list() throws RecognitionException {
		Table_reference_listContext _localctx = new Table_reference_listContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_table_reference_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190); table_reference();
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1191); match(COMMA);
				setState(1192); table_reference();
				}
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_table_reference);
		try {
			setState(1200);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198); joined_table();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199); table_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joined_tableContext extends ParserRuleContext {
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public List<Joined_table_primaryContext> joined_table_primary() {
			return getRuleContexts(Joined_table_primaryContext.class);
		}
		public Joined_table_primaryContext joined_table_primary(int i) {
			return getRuleContext(Joined_table_primaryContext.class,i);
		}
		public Joined_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoined_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoined_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitJoined_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joined_tableContext joined_table() throws RecognitionException {
		Joined_tableContext _localctx = new Joined_tableContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_joined_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); table_primary();
			setState(1204); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1203); joined_table_primary();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1206); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joined_table_primaryContext extends ParserRuleContext {
		public Table_primaryContext right;
		public Join_typeContext t;
		public Join_specificationContext s;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode UNION() { return getToken(SQLParser.UNION, 0); }
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SQLParser.NATURAL, 0); }
		public TerminalNode CROSS() { return getToken(SQLParser.CROSS, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Join_specificationContext join_specification() {
			return getRuleContext(Join_specificationContext.class,0);
		}
		public Joined_table_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_table_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoined_table_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoined_table_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitJoined_table_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joined_table_primaryContext joined_table_primary() throws RecognitionException {
		Joined_table_primaryContext _localctx = new Joined_table_primaryContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_joined_table_primary);
		int _la;
		try {
			setState(1227);
			switch (_input.LA(1)) {
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208); match(CROSS);
				setState(1209); match(JOIN);
				setState(1210); ((Joined_table_primaryContext)_localctx).right = table_primary();
				}
				break;
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
					{
					setState(1211); ((Joined_table_primaryContext)_localctx).t = join_type();
					}
				}

				setState(1214); match(JOIN);
				setState(1215); ((Joined_table_primaryContext)_localctx).right = table_primary();
				setState(1216); ((Joined_table_primaryContext)_localctx).s = join_specification();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1218); match(NATURAL);
				setState(1220);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
					{
					setState(1219); ((Joined_table_primaryContext)_localctx).t = join_type();
					}
				}

				setState(1222); match(JOIN);
				setState(1223); ((Joined_table_primaryContext)_localctx).right = table_primary();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 4);
				{
				setState(1224); match(UNION);
				setState(1225); match(JOIN);
				setState(1226); ((Joined_table_primaryContext)_localctx).right = table_primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cross_joinContext extends ParserRuleContext {
		public Table_primaryContext r;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SQLParser.CROSS, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Cross_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cross_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCross_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCross_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCross_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cross_joinContext cross_join() throws RecognitionException {
		Cross_joinContext _localctx = new Cross_joinContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_cross_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229); match(CROSS);
			setState(1230); match(JOIN);
			setState(1231); ((Cross_joinContext)_localctx).r = table_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_joinContext extends ParserRuleContext {
		public Join_typeContext t;
		public Table_primaryContext r;
		public Join_specificationContext s;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Join_specificationContext join_specification() {
			return getRuleContext(Join_specificationContext.class,0);
		}
		public Qualified_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQualified_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQualified_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQualified_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_joinContext qualified_join() throws RecognitionException {
		Qualified_joinContext _localctx = new Qualified_joinContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_qualified_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
				{
				setState(1233); ((Qualified_joinContext)_localctx).t = join_type();
				}
			}

			setState(1236); match(JOIN);
			setState(1237); ((Qualified_joinContext)_localctx).r = table_primary();
			setState(1238); ((Qualified_joinContext)_localctx).s = join_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Natural_joinContext extends ParserRuleContext {
		public Join_typeContext t;
		public Table_primaryContext r;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SQLParser.NATURAL, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Natural_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNatural_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNatural_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNatural_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Natural_joinContext natural_join() throws RecognitionException {
		Natural_joinContext _localctx = new Natural_joinContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_natural_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240); match(NATURAL);
			setState(1242);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
				{
				setState(1241); ((Natural_joinContext)_localctx).t = join_type();
				}
			}

			setState(1244); match(JOIN);
			setState(1245); ((Natural_joinContext)_localctx).r = table_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_joinContext extends ParserRuleContext {
		public Table_primaryContext r;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode UNION() { return getToken(SQLParser.UNION, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Union_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUnion_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUnion_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUnion_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_joinContext union_join() throws RecognitionException {
		Union_joinContext _localctx = new Union_joinContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_union_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247); match(UNION);
			setState(1248); match(JOIN);
			setState(1249); ((Union_joinContext)_localctx).r = table_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_typeContext extends ParserRuleContext {
		public Outer_join_typeContext t;
		public Outer_join_typeContext outer_join_type() {
			return getRuleContext(Outer_join_typeContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQLParser.INNER, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoin_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitJoin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_join_type);
		try {
			setState(1253);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1252); ((Join_typeContext)_localctx).t = outer_join_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outer_join_typeContext extends ParserRuleContext {
		public TerminalNode OUTER() { return getToken(SQLParser.OUTER, 0); }
		public Outer_join_type_part2Context outer_join_type_part2() {
			return getRuleContext(Outer_join_type_part2Context.class,0);
		}
		public Outer_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outer_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOuter_join_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOuter_join_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOuter_join_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outer_join_typeContext outer_join_type() throws RecognitionException {
		Outer_join_typeContext _localctx = new Outer_join_typeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_outer_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255); outer_join_type_part2();
			setState(1257);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(1256); match(OUTER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outer_join_type_part2Context extends ParserRuleContext {
		public TerminalNode FULL() { return getToken(SQLParser.FULL, 0); }
		public TerminalNode LEFT() { return getToken(SQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLParser.RIGHT, 0); }
		public Outer_join_type_part2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outer_join_type_part2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOuter_join_type_part2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOuter_join_type_part2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOuter_join_type_part2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outer_join_type_part2Context outer_join_type_part2() throws RecognitionException {
		Outer_join_type_part2Context _localctx = new Outer_join_type_part2Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_outer_join_type_part2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << LEFT) | (1L << RIGHT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_specificationContext extends ParserRuleContext {
		public Named_columns_joinContext named_columns_join() {
			return getRuleContext(Named_columns_joinContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public Join_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoin_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoin_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitJoin_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_specificationContext join_specification() throws RecognitionException {
		Join_specificationContext _localctx = new Join_specificationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_join_specification);
		try {
			setState(1263);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262); named_columns_join();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoin_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265); match(ON);
			setState(1266); search_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Named_columns_joinContext extends ParserRuleContext {
		public Column_reference_listContext f;
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Named_columns_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_columns_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNamed_columns_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNamed_columns_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNamed_columns_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_columns_joinContext named_columns_join() throws RecognitionException {
		Named_columns_joinContext _localctx = new Named_columns_joinContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_named_columns_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268); match(USING);
			setState(1269); match(LEFT_PAREN);
			setState(1270); ((Named_columns_joinContext)_localctx).f = column_reference_list();
			setState(1271); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_primaryContext extends ParserRuleContext {
		public IdentifierContext alias;
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Table_or_query_nameContext table_or_query_name() {
			return getRuleContext(Table_or_query_nameContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_primaryContext table_primary() throws RecognitionException {
		Table_primaryContext _localctx = new Table_primaryContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_table_primary);
		int _la;
		try {
			setState(1297);
			switch (_input.LA(1)) {
			case AVG:
			case BETWEEN:
			case BY:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXISTS:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case REGEXP:
			case RLIKE:
			case ROLLUP:
			case SECOND:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNKNOWN:
			case VALUES:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case WEEK:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273); table_or_query_name();
				setState(1278);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << AVG) | (1L << BETWEEN) | (1L << BY) | (1L << CENTURY) | (1L << CHARACTER) | (1L << COLLECT) | (1L << COALESCE) | (1L << COLUMN) | (1L << COUNT) | (1L << CUBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAY - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXISTS - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAST - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (OVERWRITE - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (PRECISION - 64)) | (1L << (PURGE - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (REGEXP - 64)) | (1L << (RLIKE - 64)) | (1L << (ROLLUP - 64)) | (1L << (SECOND - 64)) | (1L << (SET - 64)) | (1L << (SIMILAR - 64)) | (1L << (STDDEV_POP - 64)) | (1L << (STDDEV_SAMP - 64)) | (1L << (SUBPARTITION - 64)) | (1L << (SUM - 64)) | (1L << (TABLESPACE - 64)) | (1L << (THAN - 64)) | (1L << (TIMEZONE - 64)) | (1L << (TIMEZONE_HOUR - 64)) | (1L << (TIMEZONE_MINUTE - 64)) | (1L << (TRIM - 64)) | (1L << (TO - 64)) | (1L << (UNKNOWN - 64)) | (1L << (VALUES - 64)) | (1L << (VAR_SAMP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)) | (1L << (DECIMAL - 128)) | (1L << (CHAR - 128)) | (1L << (VARCHAR - 128)) | (1L << (NCHAR - 128)) | (1L << (NVARCHAR - 128)) | (1L << (DATE - 128)) | (1L << (TIME - 128)) | (1L << (TIMETZ - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TIMESTAMPTZ - 128)) | (1L << (TEXT - 128)) | (1L << (VARBINARY - 128)) | (1L << (BLOB - 128)) | (1L << (BYTEA - 128)) | (1L << (INET4 - 128)))) != 0) || _la==Identifier) {
					{
					setState(1275);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1274); match(AS);
						}
					}

					setState(1277); ((Table_primaryContext)_localctx).alias = identifier();
					}
				}

				setState(1284);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1280); match(LEFT_PAREN);
					setState(1281); column_name_list();
					setState(1282); match(RIGHT_PAREN);
					}
				}

				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286); derived_table();
				setState(1288);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1287); match(AS);
					}
				}

				setState(1290); ((Table_primaryContext)_localctx).name = identifier();
				setState(1295);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1291); match(LEFT_PAREN);
					setState(1292); column_name_list();
					setState(1293); match(RIGHT_PAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); identifier();
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1300); match(COMMA);
				setState(1301); identifier();
				}
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_tableContext extends ParserRuleContext {
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDerived_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDerived_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDerived_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_derived_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307); table_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309); match(WHERE);
			setState(1310); search_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_conditionContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSearch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSearch_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312); value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public Grouping_element_listContext g;
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public Grouping_element_listContext grouping_element_list() {
			return getRuleContext(Grouping_element_listContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitGroupby_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitGroupby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_groupby_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314); match(GROUP);
			setState(1315); match(BY);
			setState(1316); ((Groupby_clauseContext)_localctx).g = grouping_element_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_element_listContext extends ParserRuleContext {
		public Grouping_elementContext grouping_element(int i) {
			return getRuleContext(Grouping_elementContext.class,i);
		}
		public List<Grouping_elementContext> grouping_element() {
			return getRuleContexts(Grouping_elementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Grouping_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterGrouping_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitGrouping_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitGrouping_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_element_listContext grouping_element_list() throws RecognitionException {
		Grouping_element_listContext _localctx = new Grouping_element_listContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_grouping_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318); grouping_element();
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1319); match(COMMA);
				setState(1320); grouping_element();
				}
				}
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_elementContext extends ParserRuleContext {
		public Cube_listContext cube_list() {
			return getRuleContext(Cube_listContext.class,0);
		}
		public Empty_grouping_setContext empty_grouping_set() {
			return getRuleContext(Empty_grouping_setContext.class,0);
		}
		public Ordinary_grouping_setContext ordinary_grouping_set() {
			return getRuleContext(Ordinary_grouping_setContext.class,0);
		}
		public Rollup_listContext rollup_list() {
			return getRuleContext(Rollup_listContext.class,0);
		}
		public Grouping_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterGrouping_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitGrouping_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitGrouping_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_elementContext grouping_element() throws RecognitionException {
		Grouping_elementContext _localctx = new Grouping_elementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_grouping_element);
		try {
			setState(1330);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326); rollup_list();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327); cube_list();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328); empty_grouping_set();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1329); ordinary_grouping_set();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordinary_grouping_setContext extends ParserRuleContext {
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public Row_value_predicand_listContext row_value_predicand_list() {
			return getRuleContext(Row_value_predicand_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Ordinary_grouping_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinary_grouping_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrdinary_grouping_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrdinary_grouping_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOrdinary_grouping_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordinary_grouping_setContext ordinary_grouping_set() throws RecognitionException {
		Ordinary_grouping_setContext _localctx = new Ordinary_grouping_setContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_ordinary_grouping_set);
		try {
			setState(1337);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332); row_value_predicand();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333); match(LEFT_PAREN);
				setState(1334); row_value_predicand_list();
				setState(1335); match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordinary_grouping_set_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Ordinary_grouping_setContext> ordinary_grouping_set() {
			return getRuleContexts(Ordinary_grouping_setContext.class);
		}
		public Ordinary_grouping_setContext ordinary_grouping_set(int i) {
			return getRuleContext(Ordinary_grouping_setContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Ordinary_grouping_set_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinary_grouping_set_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrdinary_grouping_set_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrdinary_grouping_set_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOrdinary_grouping_set_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordinary_grouping_set_listContext ordinary_grouping_set_list() throws RecognitionException {
		Ordinary_grouping_set_listContext _localctx = new Ordinary_grouping_set_listContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_ordinary_grouping_set_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339); ordinary_grouping_set();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1340); match(COMMA);
				setState(1341); ordinary_grouping_set();
				}
				}
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollup_listContext extends ParserRuleContext {
		public Ordinary_grouping_set_listContext c;
		public Ordinary_grouping_set_listContext ordinary_grouping_set_list() {
			return getRuleContext(Ordinary_grouping_set_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SQLParser.ROLLUP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Rollup_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollup_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRollup_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRollup_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRollup_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollup_listContext rollup_list() throws RecognitionException {
		Rollup_listContext _localctx = new Rollup_listContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_rollup_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347); match(ROLLUP);
			setState(1348); match(LEFT_PAREN);
			setState(1349); ((Rollup_listContext)_localctx).c = ordinary_grouping_set_list();
			setState(1350); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cube_listContext extends ParserRuleContext {
		public Ordinary_grouping_set_listContext c;
		public Ordinary_grouping_set_listContext ordinary_grouping_set_list() {
			return getRuleContext(Ordinary_grouping_set_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode CUBE() { return getToken(SQLParser.CUBE, 0); }
		public Cube_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cube_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCube_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCube_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCube_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cube_listContext cube_list() throws RecognitionException {
		Cube_listContext _localctx = new Cube_listContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_cube_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352); match(CUBE);
			setState(1353); match(LEFT_PAREN);
			setState(1354); ((Cube_listContext)_localctx).c = ordinary_grouping_set_list();
			setState(1355); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_grouping_setContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Empty_grouping_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_grouping_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterEmpty_grouping_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitEmpty_grouping_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitEmpty_grouping_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_grouping_setContext empty_grouping_set() throws RecognitionException {
		Empty_grouping_setContext _localctx = new Empty_grouping_setContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_empty_grouping_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357); match(LEFT_PAREN);
			setState(1358); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SQLParser.HAVING, 0); }
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360); match(HAVING);
			setState(1361); boolean_value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_predicand_listContext extends ParserRuleContext {
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Row_value_predicand_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_predicand_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRow_value_predicand_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRow_value_predicand_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRow_value_predicand_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_value_predicand_listContext row_value_predicand_list() throws RecognitionException {
		Row_value_predicand_listContext _localctx = new Row_value_predicand_listContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_row_value_predicand_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363); row_value_predicand();
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1364); match(COMMA);
				setState(1365); row_value_predicand();
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public Query_expression_bodyContext query_expression_body() {
			return getRuleContext(Query_expression_bodyContext.class,0);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuery_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQuery_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371); query_expression_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expression_bodyContext extends ParserRuleContext {
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Non_join_query_expressionContext non_join_query_expression() {
			return getRuleContext(Non_join_query_expressionContext.class,0);
		}
		public Query_expression_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuery_expression_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuery_expression_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQuery_expression_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_expression_bodyContext query_expression_body() throws RecognitionException {
		Query_expression_bodyContext _localctx = new Query_expression_bodyContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_query_expression_body);
		try {
			setState(1375);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373); non_join_query_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374); joined_table();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_join_query_expressionContext extends ParserRuleContext {
		public List<TerminalNode> EXCEPT() { return getTokens(SQLParser.EXCEPT); }
		public List<TerminalNode> UNION() { return getTokens(SQLParser.UNION); }
		public List<TerminalNode> ALL() { return getTokens(SQLParser.ALL); }
		public TerminalNode EXCEPT(int i) {
			return getToken(SQLParser.EXCEPT, i);
		}
		public Query_termContext query_term(int i) {
			return getRuleContext(Query_termContext.class,i);
		}
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Non_join_query_termContext non_join_query_term() {
			return getRuleContext(Non_join_query_termContext.class,0);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(SQLParser.DISTINCT); }
		public TerminalNode ALL(int i) {
			return getToken(SQLParser.ALL, i);
		}
		public TerminalNode DISTINCT(int i) {
			return getToken(SQLParser.DISTINCT, i);
		}
		public List<Query_termContext> query_term() {
			return getRuleContexts(Query_termContext.class);
		}
		public TerminalNode UNION(int i) {
			return getToken(SQLParser.UNION, i);
		}
		public Non_join_query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_join_query_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNon_join_query_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNon_join_query_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNon_join_query_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_join_query_expressionContext non_join_query_expression() throws RecognitionException {
		Non_join_query_expressionContext _localctx = new Non_join_query_expressionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_non_join_query_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1377); non_join_query_term();
				}
				break;

			case 2:
				{
				setState(1378); joined_table();
				setState(1379);
				_la = _input.LA(1);
				if ( !(_la==EXCEPT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1381);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(1380);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1383); query_term();
				}
				break;
			}
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCEPT || _la==UNION) {
				{
				{
				setState(1387);
				_la = _input.LA(1);
				if ( !(_la==EXCEPT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1389);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(1388);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1391); query_term();
				}
				}
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_termContext extends ParserRuleContext {
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Non_join_query_termContext non_join_query_term() {
			return getRuleContext(Non_join_query_termContext.class,0);
		}
		public Query_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuery_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuery_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQuery_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_termContext query_term() throws RecognitionException {
		Query_termContext _localctx = new Query_termContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_query_term);
		try {
			setState(1399);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397); non_join_query_term();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398); joined_table();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_join_query_termContext extends ParserRuleContext {
		public List<TerminalNode> ALL() { return getTokens(SQLParser.ALL); }
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(SQLParser.DISTINCT); }
		public TerminalNode ALL(int i) {
			return getToken(SQLParser.ALL, i);
		}
		public List<Query_primaryContext> query_primary() {
			return getRuleContexts(Query_primaryContext.class);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(SQLParser.INTERSECT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(SQLParser.DISTINCT, i);
		}
		public Query_primaryContext query_primary(int i) {
			return getRuleContext(Query_primaryContext.class,i);
		}
		public Non_join_query_primaryContext non_join_query_primary() {
			return getRuleContext(Non_join_query_primaryContext.class,0);
		}
		public TerminalNode INTERSECT(int i) {
			return getToken(SQLParser.INTERSECT, i);
		}
		public Non_join_query_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_join_query_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNon_join_query_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNon_join_query_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNon_join_query_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_join_query_termContext non_join_query_term() throws RecognitionException {
		Non_join_query_termContext _localctx = new Non_join_query_termContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_non_join_query_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1401); non_join_query_primary();
				}
				break;

			case 2:
				{
				setState(1402); joined_table();
				setState(1403); match(INTERSECT);
				setState(1405);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(1404);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1407); query_primary();
				}
				break;
			}
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERSECT) {
				{
				{
				setState(1411); match(INTERSECT);
				setState(1413);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(1412);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1415); query_primary();
				}
				}
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_primaryContext extends ParserRuleContext {
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Non_join_query_primaryContext non_join_query_primary() {
			return getRuleContext(Non_join_query_primaryContext.class,0);
		}
		public Query_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuery_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuery_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQuery_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_primaryContext query_primary() throws RecognitionException {
		Query_primaryContext _localctx = new Query_primaryContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_query_primary);
		try {
			setState(1423);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421); non_join_query_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1422); joined_table();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_join_query_primaryContext extends ParserRuleContext {
		public Simple_tableContext simple_table() {
			return getRuleContext(Simple_tableContext.class,0);
		}
		public Non_join_query_expressionContext non_join_query_expression() {
			return getRuleContext(Non_join_query_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Non_join_query_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_join_query_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNon_join_query_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNon_join_query_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNon_join_query_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_join_query_primaryContext non_join_query_primary() throws RecognitionException {
		Non_join_query_primaryContext _localctx = new Non_join_query_primaryContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_non_join_query_primary);
		try {
			setState(1430);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425); simple_table();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1426); match(LEFT_PAREN);
				setState(1427); non_join_query_expression();
				setState(1428); match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_tableContext extends ParserRuleContext {
		public Explicit_tableContext explicit_table() {
			return getRuleContext(Explicit_tableContext.class,0);
		}
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Simple_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSimple_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSimple_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSimple_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_tableContext simple_table() throws RecognitionException {
		Simple_tableContext _localctx = new Simple_tableContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_simple_table);
		try {
			setState(1434);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432); query_specification();
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433); explicit_table();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_tableContext extends ParserRuleContext {
		public Table_or_query_nameContext table_or_query_name() {
			return getRuleContext(Table_or_query_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public Explicit_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExplicit_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExplicit_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExplicit_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_tableContext explicit_table() throws RecognitionException {
		Explicit_tableContext _localctx = new Explicit_tableContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_explicit_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436); match(TABLE);
			setState(1437); table_or_query_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_query_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_or_query_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_query_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_or_query_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_or_query_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_or_query_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_query_nameContext table_or_query_name() throws RecognitionException {
		Table_or_query_nameContext _localctx = new Table_or_query_nameContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_table_or_query_name);
		try {
			setState(1441);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439); table_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440); identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443); identifier();
			setState(1450);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1444); match(DOT);
				setState(1445); identifier();
				setState(1448);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1446); match(DOT);
					setState(1447); identifier();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_specificationContext extends ParserRuleContext {
		public Table_expressionContext table_expression() {
			return getRuleContext(Table_expressionContext.class,0);
		}
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Query_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuery_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuery_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQuery_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_specificationContext query_specification() throws RecognitionException {
		Query_specificationContext _localctx = new Query_specificationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_query_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452); match(SELECT);
			setState(1454);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(1453); set_qualifier();
				}
			}

			setState(1456); select_list();
			setState(1458);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1457); table_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public Select_sublistContext select_sublist(int i) {
			return getRuleContext(Select_sublistContext.class,i);
		}
		public List<Select_sublistContext> select_sublist() {
			return getRuleContexts(Select_sublistContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460); select_sublist();
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1461); match(COMMA);
				setState(1462); select_sublist();
				}
				}
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_sublistContext extends ParserRuleContext {
		public Derived_columnContext derived_column() {
			return getRuleContext(Derived_columnContext.class,0);
		}
		public Qualified_asteriskContext qualified_asterisk() {
			return getRuleContext(Qualified_asteriskContext.class,0);
		}
		public Select_sublistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_sublist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelect_sublist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelect_sublist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSelect_sublist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_sublistContext select_sublist() throws RecognitionException {
		Select_sublistContext _localctx = new Select_sublistContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_select_sublist);
		try {
			setState(1470);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468); derived_column();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1469); qualified_asterisk();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_columnContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public As_clauseContext as_clause() {
			return getRuleContext(As_clauseContext.class,0);
		}
		public Derived_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDerived_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDerived_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDerived_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_columnContext derived_column() throws RecognitionException {
		Derived_columnContext _localctx = new Derived_columnContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_derived_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472); value_expression();
			setState(1474);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << AVG) | (1L << BETWEEN) | (1L << BY) | (1L << CENTURY) | (1L << CHARACTER) | (1L << COLLECT) | (1L << COALESCE) | (1L << COLUMN) | (1L << COUNT) | (1L << CUBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAY - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXISTS - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAST - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (OVERWRITE - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (PRECISION - 64)) | (1L << (PURGE - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (REGEXP - 64)) | (1L << (RLIKE - 64)) | (1L << (ROLLUP - 64)) | (1L << (SECOND - 64)) | (1L << (SET - 64)) | (1L << (SIMILAR - 64)) | (1L << (STDDEV_POP - 64)) | (1L << (STDDEV_SAMP - 64)) | (1L << (SUBPARTITION - 64)) | (1L << (SUM - 64)) | (1L << (TABLESPACE - 64)) | (1L << (THAN - 64)) | (1L << (TIMEZONE - 64)) | (1L << (TIMEZONE_HOUR - 64)) | (1L << (TIMEZONE_MINUTE - 64)) | (1L << (TRIM - 64)) | (1L << (TO - 64)) | (1L << (UNKNOWN - 64)) | (1L << (VALUES - 64)) | (1L << (VAR_SAMP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)) | (1L << (DECIMAL - 128)) | (1L << (CHAR - 128)) | (1L << (VARCHAR - 128)) | (1L << (NCHAR - 128)) | (1L << (NVARCHAR - 128)) | (1L << (DATE - 128)) | (1L << (TIME - 128)) | (1L << (TIMETZ - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TIMESTAMPTZ - 128)) | (1L << (TEXT - 128)) | (1L << (VARBINARY - 128)) | (1L << (BLOB - 128)) | (1L << (BYTEA - 128)) | (1L << (INET4 - 128)))) != 0) || _la==Identifier) {
				{
				setState(1473); as_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_asteriskContext extends ParserRuleContext {
		public Token tb_name;
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(SQLParser.Identifier, 0); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public Qualified_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQualified_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQualified_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQualified_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_asteriskContext qualified_asterisk() throws RecognitionException {
		Qualified_asteriskContext _localctx = new Qualified_asteriskContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_qualified_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1476); ((Qualified_asteriskContext)_localctx).tb_name = match(Identifier);
				setState(1477); match(DOT);
				}
			}

			setState(1480); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_qualifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public Set_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSet_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSet_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSet_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_qualifierContext set_qualifier() throws RecognitionException {
		Set_qualifierContext _localctx = new Set_qualifierContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_set_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_referenceContext extends ParserRuleContext {
		public IdentifierContext tb_name;
		public IdentifierContext name;
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Column_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumn_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_referenceContext column_reference() throws RecognitionException {
		Column_referenceContext _localctx = new Column_referenceContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_column_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1484); ((Column_referenceContext)_localctx).tb_name = identifier();
				setState(1485); match(DOT);
				}
				break;
			}
			setState(1489); ((Column_referenceContext)_localctx).name = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_clauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public As_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAs_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAs_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAs_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_clauseContext as_clause() throws RecognitionException {
		As_clauseContext _localctx = new As_clauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_as_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1491); match(AS);
				}
			}

			setState(1494); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_reference_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Column_referenceContext column_reference(int i) {
			return getRuleContext(Column_referenceContext.class,i);
		}
		public List<Column_referenceContext> column_reference() {
			return getRuleContexts(Column_referenceContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Column_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_reference_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_reference_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_reference_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumn_reference_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_reference_listContext column_reference_list() throws RecognitionException {
		Column_reference_listContext _localctx = new Column_reference_listContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_column_reference_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496); column_reference();
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1497); match(COMMA);
				setState(1498); column_reference();
				}
				}
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_subqueryContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Scalar_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterScalar_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitScalar_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitScalar_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_subqueryContext scalar_subquery() throws RecognitionException {
		Scalar_subqueryContext _localctx = new Scalar_subqueryContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504); subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_subqueryContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Row_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRow_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRow_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRow_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_subqueryContext row_subquery() throws RecognitionException {
		Row_subqueryContext _localctx = new Row_subqueryContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_row_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506); subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_subqueryContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Table_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTable_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTable_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTable_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_subqueryContext table_subquery() throws RecognitionException {
		Table_subqueryContext _localctx = new Table_subqueryContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_table_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508); subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510); match(LEFT_PAREN);
			setState(1511); query_expression();
			setState(1512); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Pattern_matching_predicateContext pattern_matching_predicate() {
			return getRuleContext(Pattern_matching_predicateContext.class,0);
		}
		public Exists_predicateContext exists_predicate() {
			return getRuleContext(Exists_predicateContext.class,0);
		}
		public In_predicateContext in_predicate() {
			return getRuleContext(In_predicateContext.class,0);
		}
		public Null_predicateContext null_predicate() {
			return getRuleContext(Null_predicateContext.class,0);
		}
		public Between_predicateContext between_predicate() {
			return getRuleContext(Between_predicateContext.class,0);
		}
		public Comparison_predicateContext comparison_predicate() {
			return getRuleContext(Comparison_predicateContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_predicate);
		try {
			setState(1520);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514); comparison_predicate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515); between_predicate();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1516); in_predicate();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1517); pattern_matching_predicate();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1518); null_predicate();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1519); exists_predicate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext left;
		public Comp_opContext c;
		public Row_value_predicandContext right;
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public Comparison_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterComparison_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitComparison_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitComparison_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_predicateContext comparison_predicate() throws RecognitionException {
		Comparison_predicateContext _localctx = new Comparison_predicateContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_comparison_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522); ((Comparison_predicateContext)_localctx).left = row_value_predicand();
			setState(1523); ((Comparison_predicateContext)_localctx).c = comp_op();
			setState(1524); ((Comparison_predicateContext)_localctx).right = row_value_predicand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode GEQ() { return getToken(SQLParser.GEQ, 0); }
		public TerminalNode GTH() { return getToken(SQLParser.GTH, 0); }
		public TerminalNode LEQ() { return getToken(SQLParser.LEQ, 0); }
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SQLParser.NOT_EQUAL, 0); }
		public TerminalNode LTH() { return getToken(SQLParser.LTH, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			_la = _input.LA(1);
			if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (EQUAL - 174)) | (1L << (NOT_EQUAL - 174)) | (1L << (LTH - 174)) | (1L << (LEQ - 174)) | (1L << (GTH - 174)) | (1L << (GEQ - 174)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext predicand;
		public Between_predicate_part_2Context between_predicate_part_2() {
			return getRuleContext(Between_predicate_part_2Context.class,0);
		}
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public Between_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBetween_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBetween_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBetween_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_predicateContext between_predicate() throws RecognitionException {
		Between_predicateContext _localctx = new Between_predicateContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_between_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528); ((Between_predicateContext)_localctx).predicand = row_value_predicand();
			setState(1529); between_predicate_part_2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_predicate_part_2Context extends ParserRuleContext {
		public Row_value_predicandContext begin;
		public Row_value_predicandContext end;
		public TerminalNode ASYMMETRIC() { return getToken(SQLParser.ASYMMETRIC, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLParser.SYMMETRIC, 0); }
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Between_predicate_part_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_predicate_part_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBetween_predicate_part_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBetween_predicate_part_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBetween_predicate_part_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_predicate_part_2Context between_predicate_part_2() throws RecognitionException {
		Between_predicate_part_2Context _localctx = new Between_predicate_part_2Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_between_predicate_part_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1531); match(NOT);
				}
			}

			setState(1534); match(BETWEEN);
			setState(1536);
			_la = _input.LA(1);
			if (_la==ASYMMETRIC || _la==SYMMETRIC) {
				{
				setState(1535);
				_la = _input.LA(1);
				if ( !(_la==ASYMMETRIC || _la==SYMMETRIC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1538); ((Between_predicate_part_2Context)_localctx).begin = row_value_predicand();
			setState(1539); match(AND);
			setState(1540); ((Between_predicate_part_2Context)_localctx).end = row_value_predicand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_predicateContext extends ParserRuleContext {
		public Numeric_value_expressionContext predicand;
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public In_predicate_valueContext in_predicate_value() {
			return getRuleContext(In_predicate_valueContext.class,0);
		}
		public In_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIn_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIn_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIn_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_predicateContext in_predicate() throws RecognitionException {
		In_predicateContext _localctx = new In_predicateContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_in_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542); ((In_predicateContext)_localctx).predicand = numeric_value_expression();
			setState(1544);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1543); match(NOT);
				}
			}

			setState(1546); match(IN);
			setState(1547); in_predicate_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_predicate_valueContext extends ParserRuleContext {
		public In_value_listContext in_value_list() {
			return getRuleContext(In_value_listContext.class,0);
		}
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public In_predicate_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_predicate_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIn_predicate_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIn_predicate_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIn_predicate_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_predicate_valueContext in_predicate_value() throws RecognitionException {
		In_predicate_valueContext _localctx = new In_predicate_valueContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_in_predicate_value);
		try {
			setState(1554);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549); table_subquery();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550); match(LEFT_PAREN);
				setState(1551); in_value_list();
				setState(1552); match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_value_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Row_value_expressionContext row_value_expression(int i) {
			return getRuleContext(Row_value_expressionContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Row_value_expressionContext> row_value_expression() {
			return getRuleContexts(Row_value_expressionContext.class);
		}
		public In_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIn_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIn_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIn_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_value_listContext in_value_list() throws RecognitionException {
		In_value_listContext _localctx = new In_value_listContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_in_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556); row_value_expression();
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1557); match(COMMA);
				setState(1558); row_value_expression();
				}
				}
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_matching_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext f;
		public Token s;
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public Pattern_matcherContext pattern_matcher() {
			return getRuleContext(Pattern_matcherContext.class,0);
		}
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Pattern_matching_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_matching_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPattern_matching_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPattern_matching_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPattern_matching_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_matching_predicateContext pattern_matching_predicate() throws RecognitionException {
		Pattern_matching_predicateContext _localctx = new Pattern_matching_predicateContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_pattern_matching_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564); ((Pattern_matching_predicateContext)_localctx).f = row_value_predicand();
			setState(1565); pattern_matcher();
			setState(1566); ((Pattern_matching_predicateContext)_localctx).s = match(Character_String_Literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_matcherContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Negativable_matcherContext negativable_matcher() {
			return getRuleContext(Negativable_matcherContext.class,0);
		}
		public Regex_matcherContext regex_matcher() {
			return getRuleContext(Regex_matcherContext.class,0);
		}
		public Pattern_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPattern_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPattern_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPattern_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_matcherContext pattern_matcher() throws RecognitionException {
		Pattern_matcherContext _localctx = new Pattern_matcherContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_pattern_matcher);
		int _la;
		try {
			setState(1573);
			switch (_input.LA(1)) {
			case ILIKE:
			case LIKE:
			case NOT:
			case REGEXP:
			case RLIKE:
			case SIMILAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1568); match(NOT);
					}
				}

				setState(1571); negativable_matcher();
				}
				break;
			case Similar_To:
			case Not_Similar_To:
			case Similar_To_Case_Insensitive:
			case Not_Similar_To_Case_Insensitive:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572); regex_matcher();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negativable_matcherContext extends ParserRuleContext {
		public TerminalNode SIMILAR() { return getToken(SQLParser.SIMILAR, 0); }
		public TerminalNode REGEXP() { return getToken(SQLParser.REGEXP, 0); }
		public TerminalNode ILIKE() { return getToken(SQLParser.ILIKE, 0); }
		public TerminalNode RLIKE() { return getToken(SQLParser.RLIKE, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode LIKE() { return getToken(SQLParser.LIKE, 0); }
		public Negativable_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativable_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNegativable_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNegativable_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNegativable_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negativable_matcherContext negativable_matcher() throws RecognitionException {
		Negativable_matcherContext _localctx = new Negativable_matcherContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_negativable_matcher);
		try {
			setState(1581);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1575); match(LIKE);
				}
				break;
			case ILIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576); match(ILIKE);
				}
				break;
			case SIMILAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1577); match(SIMILAR);
				setState(1578); match(TO);
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(1579); match(REGEXP);
				}
				break;
			case RLIKE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1580); match(RLIKE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Regex_matcherContext extends ParserRuleContext {
		public TerminalNode Not_Similar_To() { return getToken(SQLParser.Not_Similar_To, 0); }
		public TerminalNode Similar_To() { return getToken(SQLParser.Similar_To, 0); }
		public TerminalNode Not_Similar_To_Case_Insensitive() { return getToken(SQLParser.Not_Similar_To_Case_Insensitive, 0); }
		public TerminalNode Similar_To_Case_Insensitive() { return getToken(SQLParser.Similar_To_Case_Insensitive, 0); }
		public Regex_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRegex_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRegex_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRegex_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regex_matcherContext regex_matcher() throws RecognitionException {
		Regex_matcherContext _localctx = new Regex_matcherContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_regex_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			_la = _input.LA(1);
			if ( !(((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (Similar_To - 168)) | (1L << (Not_Similar_To - 168)) | (1L << (Similar_To_Case_Insensitive - 168)) | (1L << (Not_Similar_To_Case_Insensitive - 168)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext predicand;
		public Token n;
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Null_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNull_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNull_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNull_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_predicateContext null_predicate() throws RecognitionException {
		Null_predicateContext _localctx = new Null_predicateContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_null_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585); ((Null_predicateContext)_localctx).predicand = row_value_predicand();
			setState(1586); match(IS);
			setState(1588);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1587); ((Null_predicateContext)_localctx).n = match(NOT);
				}
			}

			setState(1590); match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantified_comparison_predicateContext extends ParserRuleContext {
		public Numeric_value_expressionContext l;
		public Comp_opContext c;
		public QuantifierContext q;
		public Table_subqueryContext s;
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public Quantified_comparison_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantified_comparison_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuantified_comparison_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuantified_comparison_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQuantified_comparison_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantified_comparison_predicateContext quantified_comparison_predicate() throws RecognitionException {
		Quantified_comparison_predicateContext _localctx = new Quantified_comparison_predicateContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_quantified_comparison_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592); ((Quantified_comparison_predicateContext)_localctx).l = numeric_value_expression();
			setState(1593); ((Quantified_comparison_predicateContext)_localctx).c = comp_op();
			setState(1594); ((Quantified_comparison_predicateContext)_localctx).q = quantifier();
			setState(1595); ((Quantified_comparison_predicateContext)_localctx).s = table_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public SomeContext some() {
			return getRuleContext(SomeContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_quantifier);
		try {
			setState(1599);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597); all();
				}
				break;
			case ANY:
			case SOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1598); some();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601); match(ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomeContext extends ParserRuleContext {
		public TerminalNode SOME() { return getToken(SQLParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SQLParser.ANY, 0); }
		public SomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeContext some() throws RecognitionException {
		SomeContext _localctx = new SomeContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_some);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			_la = _input.LA(1);
			if ( !(_la==ANY || _la==SOME) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exists_predicateContext extends ParserRuleContext {
		public Table_subqueryContext s;
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public Exists_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExists_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExists_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExists_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exists_predicateContext exists_predicate() throws RecognitionException {
		Exists_predicateContext _localctx = new Exists_predicateContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_exists_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1605); match(NOT);
				}
			}

			setState(1608); match(EXISTS);
			setState(1609); ((Exists_predicateContext)_localctx).s = table_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unique_predicateContext extends ParserRuleContext {
		public Table_subqueryContext s;
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public Unique_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unique_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUnique_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUnique_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUnique_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unique_predicateContext unique_predicate() throws RecognitionException {
		Unique_predicateContext _localctx = new Unique_predicateContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_unique_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611); match(UNIQUE);
			setState(1612); ((Unique_predicateContext)_localctx).s = table_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_datetime_fieldContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(SQLParser.SECOND, 0); }
		public Non_second_primary_datetime_fieldContext non_second_primary_datetime_field() {
			return getRuleContext(Non_second_primary_datetime_fieldContext.class,0);
		}
		public Primary_datetime_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_datetime_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPrimary_datetime_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPrimary_datetime_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPrimary_datetime_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_datetime_fieldContext primary_datetime_field() throws RecognitionException {
		Primary_datetime_fieldContext _localctx = new Primary_datetime_fieldContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primary_datetime_field);
		try {
			setState(1616);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1614); non_second_primary_datetime_field();
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615); match(SECOND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_second_primary_datetime_fieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SQLParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SQLParser.MONTH, 0); }
		public TerminalNode HOUR() { return getToken(SQLParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SQLParser.DAY, 0); }
		public TerminalNode MINUTE() { return getToken(SQLParser.MINUTE, 0); }
		public Non_second_primary_datetime_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_second_primary_datetime_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNon_second_primary_datetime_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNon_second_primary_datetime_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNon_second_primary_datetime_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_second_primary_datetime_fieldContext non_second_primary_datetime_field() throws RecognitionException {
		Non_second_primary_datetime_fieldContext _localctx = new Non_second_primary_datetime_fieldContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_non_second_primary_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAY - 64)) | (1L << (HOUR - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)))) != 0) || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extended_datetime_fieldContext extends ParserRuleContext {
		public TerminalNode ISODOW() { return getToken(SQLParser.ISODOW, 0); }
		public TerminalNode EPOCH() { return getToken(SQLParser.EPOCH, 0); }
		public TerminalNode QUARTER() { return getToken(SQLParser.QUARTER, 0); }
		public TerminalNode DOY() { return getToken(SQLParser.DOY, 0); }
		public TerminalNode MILLENNIUM() { return getToken(SQLParser.MILLENNIUM, 0); }
		public TerminalNode DECADE() { return getToken(SQLParser.DECADE, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SQLParser.MICROSECONDS, 0); }
		public TerminalNode WEEK() { return getToken(SQLParser.WEEK, 0); }
		public TerminalNode CENTURY() { return getToken(SQLParser.CENTURY, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SQLParser.MILLISECONDS, 0); }
		public TerminalNode ISOYEAR() { return getToken(SQLParser.ISOYEAR, 0); }
		public TerminalNode DOW() { return getToken(SQLParser.DOW, 0); }
		public Extended_datetime_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_datetime_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExtended_datetime_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExtended_datetime_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExtended_datetime_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extended_datetime_fieldContext extended_datetime_field() throws RecognitionException {
		Extended_datetime_fieldContext _localctx = new Extended_datetime_fieldContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_extended_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (CENTURY - 57)) | (1L << (DECADE - 57)) | (1L << (DOW - 57)) | (1L << (DOY - 57)) | (1L << (EPOCH - 57)) | (1L << (ISODOW - 57)) | (1L << (ISOYEAR - 57)) | (1L << (MICROSECONDS - 57)) | (1L << (MILLENNIUM - 57)) | (1L << (MILLISECONDS - 57)) | (1L << (QUARTER - 57)))) != 0) || _la==WEEK) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Routine_invocationContext extends ParserRuleContext {
		public Sql_argument_listContext sql_argument_list() {
			return getRuleContext(Sql_argument_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Routine_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRoutine_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRoutine_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRoutine_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Routine_invocationContext routine_invocation() throws RecognitionException {
		Routine_invocationContext _localctx = new Routine_invocationContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_routine_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622); function_name();
			setState(1623); match(LEFT_PAREN);
			setState(1625);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << FALSE) | (1L << LEFT) | (1L << NOT) | (1L << NULL) | (1L << RIGHT) | (1L << SOME) | (1L << TRUE) | (1L << AVG) | (1L << BETWEEN) | (1L << BY) | (1L << CENTURY) | (1L << CHARACTER) | (1L << COLLECT) | (1L << COALESCE) | (1L << COLUMN) | (1L << COUNT) | (1L << CUBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAY - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXISTS - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAST - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (OVERWRITE - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (PRECISION - 64)) | (1L << (PURGE - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (REGEXP - 64)) | (1L << (RLIKE - 64)) | (1L << (ROLLUP - 64)) | (1L << (SECOND - 64)) | (1L << (SET - 64)) | (1L << (SIMILAR - 64)) | (1L << (STDDEV_POP - 64)) | (1L << (STDDEV_SAMP - 64)) | (1L << (SUBPARTITION - 64)) | (1L << (SUM - 64)) | (1L << (TABLESPACE - 64)) | (1L << (THAN - 64)) | (1L << (TIMEZONE - 64)) | (1L << (TIMEZONE_HOUR - 64)) | (1L << (TIMEZONE_MINUTE - 64)) | (1L << (TRIM - 64)) | (1L << (TO - 64)) | (1L << (UNKNOWN - 64)) | (1L << (VALUES - 64)) | (1L << (VAR_SAMP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)) | (1L << (DECIMAL - 128)) | (1L << (CHAR - 128)) | (1L << (VARCHAR - 128)) | (1L << (NCHAR - 128)) | (1L << (NVARCHAR - 128)) | (1L << (DATE - 128)) | (1L << (TIME - 128)) | (1L << (TIMETZ - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TIMESTAMPTZ - 128)) | (1L << (TEXT - 128)) | (1L << (VARBINARY - 128)) | (1L << (BLOB - 128)) | (1L << (BYTEA - 128)) | (1L << (INET4 - 128)) | (1L << (LEFT_PAREN - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (NUMBER - 196)) | (1L << (REAL_NUMBER - 196)) | (1L << (Identifier - 196)) | (1L << (Character_String_Literal - 196)))) != 0)) {
				{
				setState(1624); sql_argument_list();
				}
			}

			setState(1627); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_names_for_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(SQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLParser.RIGHT, 0); }
		public Function_names_for_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_names_for_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunction_names_for_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunction_names_for_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitFunction_names_for_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_names_for_reserved_wordsContext function_names_for_reserved_words() throws RecognitionException {
		Function_names_for_reserved_wordsContext _localctx = new Function_names_for_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_function_names_for_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			_la = _input.LA(1);
			if ( !(_la==LEFT || _la==RIGHT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Function_names_for_reserved_wordsContext function_names_for_reserved_words() {
			return getRuleContext(Function_names_for_reserved_wordsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_function_name);
		try {
			setState(1633);
			switch (_input.LA(1)) {
			case AVG:
			case BETWEEN:
			case BY:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXISTS:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case REGEXP:
			case RLIKE:
			case ROLLUP:
			case SECOND:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNKNOWN:
			case VALUES:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case WEEK:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631); identifier();
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632); function_names_for_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_argument_listContext extends ParserRuleContext {
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Sql_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSql_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSql_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSql_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_argument_listContext sql_argument_list() throws RecognitionException {
		Sql_argument_listContext _localctx = new Sql_argument_listContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_sql_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635); value_expression();
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1636); match(COMMA);
				setState(1637); value_expression();
				}
				}
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public Sort_specifier_listContext sort_specifier_list() {
			return getRuleContext(Sort_specifier_listContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrderby_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOrderby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_orderby_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643); match(ORDER);
			setState(1644); match(BY);
			setState(1645); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sort_specifier_listContext extends ParserRuleContext {
		public List<Sort_specifierContext> sort_specifier() {
			return getRuleContexts(Sort_specifierContext.class);
		}
		public Sort_specifierContext sort_specifier(int i) {
			return getRuleContext(Sort_specifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Sort_specifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_specifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSort_specifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSort_specifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSort_specifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_specifier_listContext sort_specifier_list() throws RecognitionException {
		Sort_specifier_listContext _localctx = new Sort_specifier_listContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_sort_specifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647); sort_specifier();
			setState(1652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1648); match(COMMA);
				setState(1649); sort_specifier();
				}
				}
				setState(1654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sort_specifierContext extends ParserRuleContext {
		public Row_value_predicandContext key;
		public Order_specificationContext order;
		public Null_orderingContext null_order;
		public Order_specificationContext order_specification() {
			return getRuleContext(Order_specificationContext.class,0);
		}
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public Null_orderingContext null_ordering() {
			return getRuleContext(Null_orderingContext.class,0);
		}
		public Sort_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSort_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSort_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSort_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_specifierContext sort_specifier() throws RecognitionException {
		Sort_specifierContext _localctx = new Sort_specifierContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_sort_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655); ((Sort_specifierContext)_localctx).key = row_value_predicand();
			setState(1657);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1656); ((Sort_specifierContext)_localctx).order = order_specification();
				}
			}

			setState(1660);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(1659); ((Sort_specifierContext)_localctx).null_order = null_ordering();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_specificationContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(SQLParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(SQLParser.ASC, 0); }
		public Order_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrder_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrder_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOrder_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_specificationContext order_specification() throws RecognitionException {
		Order_specificationContext _localctx = new Order_specificationContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_order_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public Numeric_value_expressionContext e;
		public TerminalNode LIMIT() { return getToken(SQLParser.LIMIT, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLimit_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitLimit_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664); match(LIMIT);
			setState(1665); ((Limit_clauseContext)_localctx).e = numeric_value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_orderingContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SQLParser.FIRST, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public TerminalNode LAST() { return getToken(SQLParser.LAST, 0); }
		public Null_orderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_ordering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNull_ordering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNull_ordering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNull_ordering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_orderingContext null_ordering() throws RecognitionException {
		Null_orderingContext _localctx = new Null_orderingContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_null_ordering);
		try {
			setState(1671);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1667); match(NULL);
				setState(1668); match(FIRST);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669); match(NULL);
				setState(1670); match(LAST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public Table_nameContext tb_name;
		public Token path;
		public IdentifierContext file_type;
		public Param_clauseContext param_clause() {
			return getRuleContext(Param_clauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public Insert_value_listContext insert_value_list() {
			return getRuleContext(Insert_value_listContext.class,0);
		}
		public TerminalNode OVERWRITE() { return getToken(SQLParser.OVERWRITE, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitInsert_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_insert_statement);
		int _la;
		try {
			setState(1710);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673); match(INSERT);
				setState(1675);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(1674); match(OVERWRITE);
					}
				}

				setState(1677); match(INTO);
				setState(1678); ((Insert_statementContext)_localctx).tb_name = table_name();
				setState(1683);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1679); match(LEFT_PAREN);
					setState(1680); column_name_list();
					setState(1681); match(RIGHT_PAREN);
					}
					break;
				}
				setState(1690);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1685); match(VALUES);
					setState(1686); match(LEFT_PAREN);
					setState(1687); insert_value_list();
					setState(1688); match(RIGHT_PAREN);
					}
					break;
				}
				setState(1693);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (SELECT - 41)) | (1L << (TABLE - 41)) | (1L << (AVG - 41)) | (1L << (BETWEEN - 41)) | (1L << (BY - 41)) | (1L << (CENTURY - 41)) | (1L << (CHARACTER - 41)) | (1L << (COLLECT - 41)) | (1L << (COALESCE - 41)) | (1L << (COLUMN - 41)) | (1L << (COUNT - 41)) | (1L << (CUBE - 41)) | (1L << (DAY - 41)) | (1L << (DEC - 41)) | (1L << (DECADE - 41)) | (1L << (DOW - 41)) | (1L << (DOY - 41)) | (1L << (DROP - 41)) | (1L << (EPOCH - 41)) | (1L << (EVERY - 41)) | (1L << (EXISTS - 41)) | (1L << (EXTERNAL - 41)) | (1L << (EXTRACT - 41)) | (1L << (FILTER - 41)) | (1L << (FIRST - 41)) | (1L << (FORMAT - 41)) | (1L << (FUSION - 41)) | (1L << (GROUPING - 41)) | (1L << (HASH - 41)) | (1L << (INDEX - 41)) | (1L << (INSERT - 41)) | (1L << (INTERSECTION - 41)) | (1L << (ISODOW - 41)) | (1L << (ISOYEAR - 41)) | (1L << (LAST - 41)) | (1L << (LESS - 41)) | (1L << (LIST - 41)) | (1L << (LOCATION - 41)) | (1L << (MAX - 41)) | (1L << (MAXVALUE - 41)) | (1L << (MICROSECONDS - 41)) | (1L << (MILLENNIUM - 41)) | (1L << (MILLISECONDS - 41)) | (1L << (MIN - 41)) | (1L << (MINUTE - 41)) | (1L << (MONTH - 41)) | (1L << (NATIONAL - 41)) | (1L << (NULLIF - 41)) | (1L << (OVERWRITE - 41)) | (1L << (PARTITION - 41)) | (1L << (PARTITIONS - 41)) | (1L << (PRECISION - 41)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (PURGE - 105)) | (1L << (QUARTER - 105)) | (1L << (RANGE - 105)) | (1L << (REGEXP - 105)) | (1L << (RLIKE - 105)) | (1L << (ROLLUP - 105)) | (1L << (SECOND - 105)) | (1L << (SET - 105)) | (1L << (SIMILAR - 105)) | (1L << (STDDEV_POP - 105)) | (1L << (STDDEV_SAMP - 105)) | (1L << (SUBPARTITION - 105)) | (1L << (SUM - 105)) | (1L << (TABLESPACE - 105)) | (1L << (THAN - 105)) | (1L << (TIMEZONE - 105)) | (1L << (TIMEZONE_HOUR - 105)) | (1L << (TIMEZONE_MINUTE - 105)) | (1L << (TRIM - 105)) | (1L << (TO - 105)) | (1L << (UNKNOWN - 105)) | (1L << (VALUES - 105)) | (1L << (VAR_SAMP - 105)) | (1L << (VAR_POP - 105)) | (1L << (VARYING - 105)) | (1L << (WEEK - 105)) | (1L << (YEAR - 105)) | (1L << (ZONE - 105)) | (1L << (BOOLEAN - 105)) | (1L << (BOOL - 105)) | (1L << (BIT - 105)) | (1L << (VARBIT - 105)) | (1L << (INT1 - 105)) | (1L << (INT2 - 105)) | (1L << (INT4 - 105)) | (1L << (INT8 - 105)) | (1L << (TINYINT - 105)) | (1L << (SMALLINT - 105)) | (1L << (INT - 105)) | (1L << (INTEGER - 105)) | (1L << (BIGINT - 105)) | (1L << (FLOAT4 - 105)) | (1L << (FLOAT8 - 105)) | (1L << (REAL - 105)) | (1L << (FLOAT - 105)) | (1L << (DOUBLE - 105)) | (1L << (NUMERIC - 105)) | (1L << (DECIMAL - 105)) | (1L << (CHAR - 105)) | (1L << (VARCHAR - 105)) | (1L << (NCHAR - 105)) | (1L << (NVARCHAR - 105)) | (1L << (DATE - 105)) | (1L << (TIME - 105)) | (1L << (TIMETZ - 105)) | (1L << (TIMESTAMP - 105)) | (1L << (TIMESTAMPTZ - 105)) | (1L << (TEXT - 105)) | (1L << (VARBINARY - 105)) | (1L << (BLOB - 105)) | (1L << (BYTEA - 105)) | (1L << (INET4 - 105)))) != 0) || _la==LEFT_PAREN || _la==Identifier) {
					{
					setState(1692); query_expression();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1695); match(INSERT);
				setState(1697);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(1696); match(OVERWRITE);
					}
				}

				setState(1699); match(INTO);
				setState(1700); match(LOCATION);
				setState(1701); ((Insert_statementContext)_localctx).path = match(Character_String_Literal);
				setState(1707);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1702); match(USING);
					setState(1703); ((Insert_statementContext)_localctx).file_type = identifier();
					setState(1705);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(1704); param_clause();
						}
					}

					}
				}

				setState(1709); query_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_value_listContext extends ParserRuleContext {
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterInsert_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitInsert_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitInsert_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_value_listContext insert_value_list() throws RecognitionException {
		Insert_value_listContext _localctx = new Insert_value_listContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_insert_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712); value_expression();
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1713); match(COMMA);
				setState(1714); value_expression();
				}
				}
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00ce\u06bb\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\3\2\3\2\5\2\u0197\n\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3\u019f\n\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6\u01a7\n\6\3\7\3\7\5"+
		"\7\u01ab\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01b2\n\7\3\7\3\7\3\7\3\7\5\7\u01b8"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01c2\n\b\3\b\5\b\u01c5\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01d0\n\b\3\b\5\b\u01d3\n\b\3\b"+
		"\5\b\u01d6\n\b\3\b\3\b\5\b\u01da\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e1\n\b"+
		"\3\b\5\b\u01e4\n\b\3\b\5\b\u01e7\n\b\3\b\3\b\3\b\5\b\u01ec\n\b\3\t\3\t"+
		"\3\t\3\t\7\t\u01f2\n\t\f\t\16\t\u01f5\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\7\f\u0203\n\f\f\f\16\f\u0206\13\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\5\21\u021a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\7\23\u0229\n\23\f\23\16\23\u022c\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0238\n\24\3\24\3\24\5\24\u023c"+
		"\n\24\5\24\u023e\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u024b\n\25\3\26\3\26\3\26\7\26\u0250\n\26\f\26\16\26\u0253"+
		"\13\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0268\n\32\f\32\16\32\u026b\13\32"+
		"\3\33\3\33\3\33\3\33\5\33\u0271\n\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0282\n\36\3\37\3\37\5\37"+
		"\u0286\n\37\3 \3 \3!\3!\5!\u028c\n!\3\"\3\"\3\"\5\"\u0291\n\"\3#\3#\3"+
		"#\5#\u0296\n#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\5)\u02ad\n)\3*\3*\5*\u02b1\n*\3*\3*\5*\u02b5\n*\3*\3*\3*\5*"+
		"\u02ba\n*\3*\3*\3*\5*\u02bf\n*\3*\3*\5*\u02c3\n*\3*\5*\u02c6\n*\3+\3+"+
		"\3+\3+\3,\3,\3,\5,\u02cf\n,\3,\3,\3,\5,\u02d4\n,\3,\3,\5,\u02d8\n,\3,"+
		"\3,\3,\3,\5,\u02de\n,\3,\3,\3,\3,\5,\u02e4\n,\3,\3,\3,\5,\u02e9\n,\3,"+
		"\3,\5,\u02ed\n,\5,\u02ef\n,\3-\3-\5-\u02f3\n-\3-\3-\5-\u02f7\n-\5-\u02f9"+
		"\n-\3.\3.\5.\u02fd\n.\3/\3/\5/\u0301\n/\3/\3/\5/\u0305\n/\3/\3/\5/\u0309"+
		"\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0314\n/\3\60\3\60\5\60\u0318\n\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u0320\n\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u032a\n\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u033b\n\63\3\64\3\64\5\64\u033f"+
		"\n\64\3\64\3\64\5\64\u0343\n\64\3\64\3\64\3\64\5\64\u0348\n\64\5\64\u034a"+
		"\n\64\3\65\3\65\5\65\u034e\n\65\3\65\3\65\3\65\5\65\u0353\n\65\3\65\3"+
		"\65\5\65\u0357\n\65\5\65\u0359\n\65\3\66\3\66\5\66\u035d\n\66\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\58\u036a\n8\39\39\3:\3:\3;\5;\u0371\n"+
		";\3;\3;\3<\3<\3=\3=\3=\3=\3=\3=\5=\u037d\n=\5=\u037f\n=\3>\3>\3>\5>\u0384"+
		"\n>\3>\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\6C\u03a4\nC\rC\16C\u03a5\3C\3C\5C\u03aa\nC\3"+
		"D\3D\5D\u03ae\nD\3E\3E\3E\6E\u03b3\nE\rE\16E\u03b4\3E\5E\u03b8\nE\3E\3"+
		"E\3F\3F\6F\u03be\nF\rF\16F\u03bf\3F\5F\u03c3\nF\3F\3F\3G\3G\3G\3G\3G\3"+
		"H\3H\3H\3H\3H\3I\3I\3I\3J\3J\5J\u03d6\nJ\3K\3K\3K\3K\3K\3K\3K\3L\3L\3"+
		"M\3M\3N\3N\3N\5N\u03e6\nN\3O\3O\3O\5O\u03eb\nO\3P\3P\3P\7P\u03f0\nP\f"+
		"P\16P\u03f3\13P\3Q\3Q\3Q\7Q\u03f8\nQ\fQ\16Q\u03fb\13Q\3R\5R\u03fe\nR\3"+
		"R\3R\3S\3S\3S\3S\7S\u0406\nS\fS\16S\u0409\13S\3S\3S\3T\3T\3T\7T\u0410"+
		"\nT\fT\16T\u0413\13T\3T\5T\u0416\nT\3U\3U\3V\3V\3W\3W\3W\3W\3W\3W\3W\3"+
		"X\3X\3X\5X\u0426\nX\3Y\3Y\3Z\3Z\5Z\u042c\nZ\3[\3[\3\\\3\\\3\\\7\\\u0433"+
		"\n\\\f\\\16\\\u0436\13\\\3]\3]\3^\3^\5^\u043c\n^\3_\3_\3`\3`\3`\3`\3`"+
		"\3a\5a\u0446\na\3a\5a\u0449\na\3a\5a\u044c\na\3a\3a\3a\3a\3a\5a\u0453"+
		"\na\3b\3b\3c\3c\3d\3d\3d\7d\u045c\nd\fd\16d\u045f\13d\3e\3e\3e\7e\u0464"+
		"\ne\fe\16e\u0467\13e\3f\3f\3f\5f\u046c\nf\3g\3g\5g\u0470\ng\3h\3h\5h\u0474"+
		"\nh\3h\3h\3i\3i\3j\3j\5j\u047c\nj\3k\3k\5k\u0480\nk\3l\3l\3l\3l\3m\3m"+
		"\5m\u0488\nm\3n\3n\3o\3o\3p\3p\5p\u0490\np\3q\3q\5q\u0494\nq\3r\3r\5r"+
		"\u0498\nr\3r\5r\u049b\nr\3r\5r\u049e\nr\3r\5r\u04a1\nr\3r\5r\u04a4\nr"+
		"\3s\3s\3s\3t\3t\3t\7t\u04ac\nt\ft\16t\u04af\13t\3u\3u\5u\u04b3\nu\3v\3"+
		"v\6v\u04b7\nv\rv\16v\u04b8\3w\3w\3w\3w\5w\u04bf\nw\3w\3w\3w\3w\3w\3w\5"+
		"w\u04c7\nw\3w\3w\3w\3w\3w\5w\u04ce\nw\3x\3x\3x\3x\3y\5y\u04d5\ny\3y\3"+
		"y\3y\3y\3z\3z\5z\u04dd\nz\3z\3z\3z\3{\3{\3{\3{\3|\3|\5|\u04e8\n|\3}\3"+
		"}\5}\u04ec\n}\3~\3~\3\177\3\177\5\177\u04f2\n\177\3\u0080\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\5\u0082\u04fe"+
		"\n\u0082\3\u0082\5\u0082\u0501\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u0507\n\u0082\3\u0082\3\u0082\5\u0082\u050b\n\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0512\n\u0082\5\u0082\u0514\n\u0082"+
		"\3\u0083\3\u0083\3\u0083\7\u0083\u0519\n\u0083\f\u0083\16\u0083\u051c"+
		"\13\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\7\u0088\u052c\n\u0088"+
		"\f\u0088\16\u0088\u052f\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u0535\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u053c\n"+
		"\u008a\3\u008b\3\u008b\3\u008b\7\u008b\u0541\n\u008b\f\u008b\16\u008b"+
		"\u0544\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\7\u0090\u0559\n\u0090\f\u0090\16\u0090\u055c"+
		"\13\u0090\3\u0091\3\u0091\3\u0092\3\u0092\5\u0092\u0562\n\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u0568\n\u0093\3\u0093\3\u0093\5\u0093"+
		"\u056c\n\u0093\3\u0093\3\u0093\5\u0093\u0570\n\u0093\3\u0093\7\u0093\u0573"+
		"\n\u0093\f\u0093\16\u0093\u0576\13\u0093\3\u0094\3\u0094\5\u0094\u057a"+
		"\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0580\n\u0095\3\u0095"+
		"\3\u0095\5\u0095\u0584\n\u0095\3\u0095\3\u0095\5\u0095\u0588\n\u0095\3"+
		"\u0095\7\u0095\u058b\n\u0095\f\u0095\16\u0095\u058e\13\u0095\3\u0096\3"+
		"\u0096\5\u0096\u0592\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5"+
		"\u0097\u0599\n\u0097\3\u0098\3\u0098\5\u0098\u059d\n\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\5\u009a\u05a4\n\u009a\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u05ab\n\u009b\5\u009b\u05ad\n\u009b\3\u009c\3"+
		"\u009c\5\u009c\u05b1\n\u009c\3\u009c\3\u009c\5\u009c\u05b5\n\u009c\3\u009d"+
		"\3\u009d\3\u009d\7\u009d\u05ba\n\u009d\f\u009d\16\u009d\u05bd\13\u009d"+
		"\3\u009e\3\u009e\5\u009e\u05c1\n\u009e\3\u009f\3\u009f\5\u009f\u05c5\n"+
		"\u009f\3\u00a0\3\u00a0\5\u00a0\u05c9\n\u00a0\3\u00a0\3\u00a0\3\u00a1\3"+
		"\u00a1\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u05d2\n\u00a2\3\u00a2\3\u00a2\3"+
		"\u00a3\5\u00a3\u05d7\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\7"+
		"\u00a4\u05de\n\u00a4\f\u00a4\16\u00a4\u05e1\13\u00a4\3\u00a5\3\u00a5\3"+
		"\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u05f3\n\u00a9\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\5\u00ad\u05ff\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u0603\n\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\5\u00ae\u060b\n\u00ae\3\u00ae\3"+
		"\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0615\n"+
		"\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u061a\n\u00b0\f\u00b0\16\u00b0"+
		"\u061d\13\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\5\u00b2\u0624"+
		"\n\u00b2\3\u00b2\3\u00b2\5\u00b2\u0628\n\u00b2\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0630\n\u00b3\3\u00b4\3\u00b4\3\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u0637\n\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\5\u00b7\u0642\n\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\3\u00ba\5\u00ba\u0649\n\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\5\u00bc\u0653\n\u00bc"+
		"\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u065c"+
		"\n\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c1\3\u00c1\5\u00c1\u0664"+
		"\n\u00c1\3\u00c2\3\u00c2\3\u00c2\7\u00c2\u0669\n\u00c2\f\u00c2\16\u00c2"+
		"\u066c\13\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\7\u00c4\u0675\n\u00c4\f\u00c4\16\u00c4\u0678\13\u00c4\3\u00c5\3\u00c5"+
		"\5\u00c5\u067c\n\u00c5\3\u00c5\5\u00c5\u067f\n\u00c5\3\u00c6\3\u00c6\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u068a\n"+
		"\u00c8\3\u00c9\3\u00c9\5\u00c9\u068e\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\5\u00c9\u0696\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\5\u00c9\u069d\n\u00c9\3\u00c9\5\u00c9\u06a0\n\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u06a4\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u06ac\n\u00c9\5\u00c9\u06ae\n\u00c9\3\u00c9\5\u00c9\u06b1"+
		"\n\u00c9\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u06b6\n\u00ca\f\u00ca\16\u00ca"+
		"\u06b9\13\u00ca\3\u00ca\2\2\u00cb\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\2\26\5\28RT\u00a4\u00a6\u00a9\5\2\23\23\61\61"+
		"\177\177\3\2\u0087\u0088\3\2\u00c6\u00c7\17\2\6\6,,88==@@IIPPVV]]bbtu"+
		"ww\u0081\u0082\3\2\u00bc\u00bd\3\2\u00be\u00c0\3\2z|\5\2\t\t\37\37\60"+
		"\60\5\2\24\24  **\4\2\22\22\62\62\4\2\4\4\17\17\4\2\u00b0\u00b0\u00b5"+
		"\u00b9\4\2\7\7--\3\2\u00aa\u00ad\4\2\6\6,,\6\2BBSScd\u0085\u0085\t\2;"+
		";DFHHWX_all\u0084\u0084\4\2  **\4\2\b\b\16\16\u06ec\2\u0194\3\2\2\2\4"+
		"\u019e\3\2\2\2\6\u01a0\3\2\2\2\b\u01a2\3\2\2\2\n\u01a6\3\2\2\2\f\u01a8"+
		"\3\2\2\2\16\u01eb\3\2\2\2\20\u01ed\3\2\2\2\22\u01f8\3\2\2\2\24\u01fb\3"+
		"\2\2\2\26\u01fd\3\2\2\2\30\u0209\3\2\2\2\32\u020d\3\2\2\2\34\u0210\3\2"+
		"\2\2\36\u0213\3\2\2\2 \u0219\3\2\2\2\"\u021b\3\2\2\2$\u0225\3\2\2\2&\u022d"+
		"\3\2\2\2(\u023f\3\2\2\2*\u024c\3\2\2\2,\u0254\3\2\2\2.\u0257\3\2\2\2\60"+
		"\u025a\3\2\2\2\62\u0264\3\2\2\2\64\u026c\3\2\2\2\66\u0276\3\2\2\28\u027b"+
		"\3\2\2\2:\u027d\3\2\2\2<\u0285\3\2\2\2>\u0287\3\2\2\2@\u028b\3\2\2\2B"+
		"\u0290\3\2\2\2D\u0295\3\2\2\2F\u0297\3\2\2\2H\u029a\3\2\2\2J\u029d\3\2"+
		"\2\2L\u02a0\3\2\2\2N\u02a2\3\2\2\2P\u02ac\3\2\2\2R\u02c5\3\2\2\2T\u02c7"+
		"\3\2\2\2V\u02ee\3\2\2\2X\u02f8\3\2\2\2Z\u02fc\3\2\2\2\\\u0313\3\2\2\2"+
		"^\u031f\3\2\2\2`\u0329\3\2\2\2b\u032b\3\2\2\2d\u033a\3\2\2\2f\u0349\3"+
		"\2\2\2h\u0358\3\2\2\2j\u035c\3\2\2\2l\u035e\3\2\2\2n\u0369\3\2\2\2p\u036b"+
		"\3\2\2\2r\u036d\3\2\2\2t\u0370\3\2\2\2v\u0374\3\2\2\2x\u037e\3\2\2\2z"+
		"\u0380\3\2\2\2|\u0388\3\2\2\2~\u038a\3\2\2\2\u0080\u0390\3\2\2\2\u0082"+
		"\u0395\3\2\2\2\u0084\u03a9\3\2\2\2\u0086\u03ad\3\2\2\2\u0088\u03af\3\2"+
		"\2\2\u008a\u03bb\3\2\2\2\u008c\u03c6\3\2\2\2\u008e\u03cb\3\2\2\2\u0090"+
		"\u03d0\3\2\2\2\u0092\u03d5\3\2\2\2\u0094\u03d7\3\2\2\2\u0096\u03de\3\2"+
		"\2\2\u0098\u03e0\3\2\2\2\u009a\u03e5\3\2\2\2\u009c\u03ea\3\2\2\2\u009e"+
		"\u03ec\3\2\2\2\u00a0\u03f4\3\2\2\2\u00a2\u03fd\3\2\2\2\u00a4\u0401\3\2"+
		"\2\2\u00a6\u0415\3\2\2\2\u00a8\u0417\3\2\2\2\u00aa\u0419\3\2\2\2\u00ac"+
		"\u041b\3\2\2\2\u00ae\u0425\3\2\2\2\u00b0\u0427\3\2\2\2\u00b2\u042b\3\2"+
		"\2\2\u00b4\u042d\3\2\2\2\u00b6\u042f\3\2\2\2\u00b8\u0437\3\2\2\2\u00ba"+
		"\u043b\3\2\2\2\u00bc\u043d\3\2\2\2\u00be\u043f\3\2\2\2\u00c0\u0452\3\2"+
		"\2\2\u00c2\u0454\3\2\2\2\u00c4\u0456\3\2\2\2\u00c6\u0458\3\2\2\2\u00c8"+
		"\u0460\3\2\2\2\u00ca\u046b\3\2\2\2\u00cc\u046d\3\2\2\2\u00ce\u0471\3\2"+
		"\2\2\u00d0\u0477\3\2\2\2\u00d2\u047b\3\2\2\2\u00d4\u047f\3\2\2\2\u00d6"+
		"\u0481\3\2\2\2\u00d8\u0487\3\2\2\2\u00da\u0489\3\2\2\2\u00dc\u048b\3\2"+
		"\2\2\u00de\u048f\3\2\2\2\u00e0\u0493\3\2\2\2\u00e2\u0495\3\2\2\2\u00e4"+
		"\u04a5\3\2\2\2\u00e6\u04a8\3\2\2\2\u00e8\u04b2\3\2\2\2\u00ea\u04b4\3\2"+
		"\2\2\u00ec\u04cd\3\2\2\2\u00ee\u04cf\3\2\2\2\u00f0\u04d4\3\2\2\2\u00f2"+
		"\u04da\3\2\2\2\u00f4\u04e1\3\2\2\2\u00f6\u04e7\3\2\2\2\u00f8\u04e9\3\2"+
		"\2\2\u00fa\u04ed\3\2\2\2\u00fc\u04f1\3\2\2\2\u00fe\u04f3\3\2\2\2\u0100"+
		"\u04f6\3\2\2\2\u0102\u0513\3\2\2\2\u0104\u0515\3\2\2\2\u0106\u051d\3\2"+
		"\2\2\u0108\u051f\3\2\2\2\u010a\u0522\3\2\2\2\u010c\u0524\3\2\2\2\u010e"+
		"\u0528\3\2\2\2\u0110\u0534\3\2\2\2\u0112\u053b\3\2\2\2\u0114\u053d\3\2"+
		"\2\2\u0116\u0545\3\2\2\2\u0118\u054a\3\2\2\2\u011a\u054f\3\2\2\2\u011c"+
		"\u0552\3\2\2\2\u011e\u0555\3\2\2\2\u0120\u055d\3\2\2\2\u0122\u0561\3\2"+
		"\2\2\u0124\u056b\3\2\2\2\u0126\u0579\3\2\2\2\u0128\u0583\3\2\2\2\u012a"+
		"\u0591\3\2\2\2\u012c\u0598\3\2\2\2\u012e\u059c\3\2\2\2\u0130\u059e\3\2"+
		"\2\2\u0132\u05a3\3\2\2\2\u0134\u05a5\3\2\2\2\u0136\u05ae\3\2\2\2\u0138"+
		"\u05b6\3\2\2\2\u013a\u05c0\3\2\2\2\u013c\u05c2\3\2\2\2\u013e\u05c8\3\2"+
		"\2\2\u0140\u05cc\3\2\2\2\u0142\u05d1\3\2\2\2\u0144\u05d6\3\2\2\2\u0146"+
		"\u05da\3\2\2\2\u0148\u05e2\3\2\2\2\u014a\u05e4\3\2\2\2\u014c\u05e6\3\2"+
		"\2\2\u014e\u05e8\3\2\2\2\u0150\u05f2\3\2\2\2\u0152\u05f4\3\2\2\2\u0154"+
		"\u05f8\3\2\2\2\u0156\u05fa\3\2\2\2\u0158\u05fe\3\2\2\2\u015a\u0608\3\2"+
		"\2\2\u015c\u0614\3\2\2\2\u015e\u0616\3\2\2\2\u0160\u061e\3\2\2\2\u0162"+
		"\u0627\3\2\2\2\u0164\u062f\3\2\2\2\u0166\u0631\3\2\2\2\u0168\u0633\3\2"+
		"\2\2\u016a\u063a\3\2\2\2\u016c\u0641\3\2\2\2\u016e\u0643\3\2\2\2\u0170"+
		"\u0645\3\2\2\2\u0172\u0648\3\2\2\2\u0174\u064d\3\2\2\2\u0176\u0652\3\2"+
		"\2\2\u0178\u0654\3\2\2\2\u017a\u0656\3\2\2\2\u017c\u0658\3\2\2\2\u017e"+
		"\u065f\3\2\2\2\u0180\u0663\3\2\2\2\u0182\u0665\3\2\2\2\u0184\u066d\3\2"+
		"\2\2\u0186\u0671\3\2\2\2\u0188\u0679\3\2\2\2\u018a\u0680\3\2\2\2\u018c"+
		"\u0682\3\2\2\2\u018e\u0689\3\2\2\2\u0190\u06b0\3\2\2\2\u0192\u06b2\3\2"+
		"\2\2\u0194\u0196\5\4\3\2\u0195\u0197\7\u00b2\2\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7\2\2\3\u0199\3\3\2\2\2"+
		"\u019a\u019f\5\6\4\2\u019b\u019f\5\b\5\2\u019c\u019f\5\n\6\2\u019d\u019f"+
		"\5\f\7\2\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019d\3\2\2\2\u019f\5\3\2\2\2\u01a0\u01a1\5\u0120\u0091\2\u01a1\7\3\2"+
		"\2\2\u01a2\u01a3\5\u0190\u00c9\2\u01a3\t\3\2\2\2\u01a4\u01a7\5\16\b\2"+
		"\u01a5\u01a7\5:\36\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\13"+
		"\3\2\2\2\u01a8\u01aa\7\f\2\2\u01a9\u01ab\7\63\2\2\u01aa\u01a9\3\2\2\2"+
		"\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7T\2\2\u01ad\u01ae"+
		"\5<\37\2\u01ae\u01af\7&\2\2\u01af\u01b1\5\u0134\u009b\2\u01b0\u01b2\5"+
		"\32\16\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\7\u00ba\2\2\u01b4\u01b5\5\u0186\u00c4\2\u01b5\u01b7\7\u00bb\2\2"+
		"\u01b6\u01b8\5\26\f\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\r"+
		"\3\2\2\2\u01b9\u01ba\7\f\2\2\u01ba\u01bb\7K\2\2\u01bb\u01bc\7.\2\2\u01bc"+
		"\u01bd\5\u0134\u009b\2\u01bd\u01be\5\20\t\2\u01be\u01bf\7\64\2\2\u01bf"+
		"\u01c1\5<\37\2\u01c0\u01c2\5\26\f\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\5 \21\2\u01c4\u01c3\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\\\2\2\u01c7\u01c8\7\u00cb"+
		"\2\2\u01c8\u01ec\3\2\2\2\u01c9\u01ca\7\f\2\2\u01ca\u01cb\7.\2\2\u01cb"+
		"\u01cc\5\u0134\u009b\2\u01cc\u01cf\5\20\t\2\u01cd\u01ce\7\64\2\2\u01ce"+
		"\u01d0\5<\37\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2"+
		"\2\2\u01d1\u01d3\5\26\f\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01d6\5 \21\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d8\7\3\2\2\u01d8\u01da\5\u0120\u0091"+
		"\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01ec\3\2\2\2\u01db\u01dc"+
		"\7\f\2\2\u01dc\u01dd\7.\2\2\u01dd\u01e0\5\u0134\u009b\2\u01de\u01df\7"+
		"\64\2\2\u01df\u01e1\5<\37\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01e4\5\26\f\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3"+
		"\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\5 \21\2\u01e6\u01e5\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7\3\2\2\u01e9\u01ea\5\u0120"+
		"\u0091\2\u01ea\u01ec\3\2\2\2\u01eb\u01b9\3\2\2\2\u01eb\u01c9\3\2\2\2\u01eb"+
		"\u01db\3\2\2\2\u01ec\17\3\2\2\2\u01ed\u01ee\7\u00ba\2\2\u01ee\u01f3\5"+
		"\22\n\2\u01ef\u01f0\7\u00b3\2\2\u01f0\u01f2\5\22\n\2\u01f1\u01ef\3\2\2"+
		"\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6"+
		"\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7\u00bb\2\2\u01f7\21\3\2\2\2"+
		"\u01f8\u01f9\5<\37\2\u01f9\u01fa\5\24\13\2\u01fa\23\3\2\2\2\u01fb\u01fc"+
		"\5N(\2\u01fc\25\3\2\2\2\u01fd\u01fe\7\67\2\2\u01fe\u01ff\7\u00ba\2\2\u01ff"+
		"\u0204\5\30\r\2\u0200\u0201\7\u00b3\2\2\u0201\u0203\5\30\r\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\u00bb\2\2\u0208\27\3"+
		"\2\2\2\u0209\u020a\7\u00cb\2\2\u020a\u020b\7\u00b0\2\2\u020b\u020c\5\u009e"+
		"P\2\u020c\31\3\2\2\2\u020d\u020e\7\64\2\2\u020e\u020f\5<\37\2\u020f\33"+
		"\3\2\2\2\u0210\u0211\7x\2\2\u0211\u0212\5\36\20\2\u0212\35\3\2\2\2\u0213"+
		"\u0214\5<\37\2\u0214\37\3\2\2\2\u0215\u021a\5\"\22\2\u0216\u021a\5(\25"+
		"\2\u0217\u021a\5\60\31\2\u0218\u021a\5\66\34\2\u0219\u0215\3\2\2\2\u0219"+
		"\u0216\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a!\3\2\2\2"+
		"\u021b\u021c\7h\2\2\u021c\u021d\7:\2\2\u021d\u021e\7m\2\2\u021e\u021f"+
		"\7\u00ba\2\2\u021f\u0220\5\u0146\u00a4\2\u0220\u0221\7\u00bb\2\2\u0221"+
		"\u0222\7\u00ba\2\2\u0222\u0223\5$\23\2\u0223\u0224\7\u00bb\2\2\u0224#"+
		"\3\2\2\2\u0225\u022a\5&\24\2\u0226\u0227\7\u00b3\2\2\u0227\u0229\5&\24"+
		"\2\u0228\u0226\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b%\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7h\2\2\u022e\u022f"+
		"\58\35\2\u022f\u0230\7\u0080\2\2\u0230\u0231\7Z\2\2\u0231\u023d\7y\2\2"+
		"\u0232\u0233\7\u00ba\2\2\u0233\u0234\5\u009aN\2\u0234\u0235\7\u00bb\2"+
		"\2\u0235\u023e\3\2\2\2\u0236\u0238\7\u00ba\2\2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\7^\2\2\u023a\u023c\7\u00bb"+
		"\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u0232\3\2\2\2\u023d\u0237\3\2\2\2\u023e\'\3\2\2\2\u023f\u0240\7h\2\2"+
		"\u0240\u0241\7:\2\2\u0241\u0242\7R\2\2\u0242\u0243\7\u00ba\2\2\u0243\u0244"+
		"\5\u0146\u00a4\2\u0244\u024a\7\u00bb\2\2\u0245\u0246\7\u00ba\2\2\u0246"+
		"\u0247\5*\26\2\u0247\u0248\7\u00bb\2\2\u0248\u024b\3\2\2\2\u0249\u024b"+
		"\5.\30\2\u024a\u0245\3\2\2\2\u024a\u0249\3\2\2\2\u024b)\3\2\2\2\u024c"+
		"\u0251\5,\27\2\u024d\u024e\7\u00b3\2\2\u024e\u0250\5,\27\2\u024f\u024d"+
		"\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"+\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7h\2\2\u0255\u0256\58\35\2\u0256"+
		"-\3\2\2\2\u0257\u0258\7i\2\2\u0258\u0259\5\u009eP\2\u0259/\3\2\2\2\u025a"+
		"\u025b\7h\2\2\u025b\u025c\7:\2\2\u025c\u025d\7[\2\2\u025d\u025e\7\u00ba"+
		"\2\2\u025e\u025f\5\u0146\u00a4\2\u025f\u0260\7\u00bb\2\2\u0260\u0261\7"+
		"\u00ba\2\2\u0261\u0262\5\62\32\2\u0262\u0263\7\u00bb\2\2\u0263\61\3\2"+
		"\2\2\u0264\u0269\5\64\33\2\u0265\u0266\7\u00b3\2\2\u0266\u0268\5\64\33"+
		"\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\63\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d\7h\2\2\u026d"+
		"\u026e\58\35\2\u026e\u0270\7\u0080\2\2\u026f\u0271\7\31\2\2\u0270\u026f"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\7\u00ba\2"+
		"\2\u0273\u0274\5\u015e\u00b0\2\u0274\u0275\7\u00bb\2\2\u0275\65\3\2\2"+
		"\2\u0276\u0277\7h\2\2\u0277\u0278\7:\2\2\u0278\u0279\7?\2\2\u0279\u027a"+
		"\5\20\t\2\u027a\67\3\2\2\2\u027b\u027c\5<\37\2\u027c9\3\2\2\2\u027d\u027e"+
		"\7G\2\2\u027e\u027f\7.\2\2\u027f\u0281\5\u0134\u009b\2\u0280\u0282\7k"+
		"\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282;\3\2\2\2\u0283\u0286"+
		"\7\u00ca\2\2\u0284\u0286\5> \2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2"+
		"\u0286=\3\2\2\2\u0287\u0288\t\2\2\2\u0288?\3\2\2\2\u0289\u028c\5r:\2\u028a"+
		"\u028c\5B\"\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2\2\2\u028cA\3\2\2\2\u028d"+
		"\u0291\7\u00cb\2\2\u028e\u0291\5D#\2\u028f\u0291\5L\'\2\u0290\u028d\3"+
		"\2\2\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291C\3\2\2\2\u0292\u0296"+
		"\5H%\2\u0293\u0296\5F$\2\u0294\u0296\5J&\2\u0295\u0292\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0295\u0294\3\2\2\2\u0296E\3\2\2\2\u0297\u0298\7\u00a0\2\2\u0298"+
		"\u0299\7\u00cb\2\2\u0299G\3\2\2\2\u029a\u029b\7\u00a2\2\2\u029b\u029c"+
		"\7\u00cb\2\2\u029cI\3\2\2\2\u029d\u029e\7\u009f\2\2\u029e\u029f\7\u00cb"+
		"\2\2\u029fK\3\2\2\2\u02a0\u02a1\t\3\2\2\u02a1M\3\2\2\2\u02a2\u02a3\5P"+
		")\2\u02a3O\3\2\2\2\u02a4\u02ad\5R*\2\u02a5\u02ad\5V,\2\u02a6\u02ad\5X"+
		"-\2\u02a7\u02ad\5Z.\2\u02a8\u02ad\5b\62\2\u02a9\u02ad\5d\63\2\u02aa\u02ad"+
		"\5f\64\2\u02ab\u02ad\5h\65\2\u02ac\u02a4\3\2\2\2\u02ac\u02a5\3\2\2\2\u02ac"+
		"\u02a6\3\2\2\2\u02ac\u02a7\3\2\2\2\u02ac\u02a8\3\2\2\2\u02ac\u02a9\3\2"+
		"\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2\2\2\u02adQ\3\2\2\2\u02ae\u02b0"+
		"\7<\2\2\u02af\u02b1\5T+\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02c6\3\2\2\2\u02b2\u02b4\7\u009b\2\2\u02b3\u02b5\5T+\2\u02b4\u02b3\3"+
		"\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02c6\3\2\2\2\u02b6\u02b7\7<\2\2\u02b7"+
		"\u02b9\7\u0083\2\2\u02b8\u02ba\5T+\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3"+
		"\2\2\2\u02ba\u02c6\3\2\2\2\u02bb\u02bc\7\u009b\2\2\u02bc\u02be\7\u0083"+
		"\2\2\u02bd\u02bf\5T+\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c6"+
		"\3\2\2\2\u02c0\u02c2\7\u009c\2\2\u02c1\u02c3\5T+\2\u02c2\u02c1\3\2\2\2"+
		"\u02c2\u02c3\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c6\7\u00a4\2\2\u02c5"+
		"\u02ae\3\2\2\2\u02c5\u02b2\3\2\2\2\u02c5\u02b6\3\2\2\2\u02c5\u02bb\3\2"+
		"\2\2\u02c5\u02c0\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6S\3\2\2\2\u02c7\u02c8"+
		"\7\u00ba\2\2\u02c8\u02c9\7\u00c6\2\2\u02c9\u02ca\7\u00bb\2\2\u02caU\3"+
		"\2\2\2\u02cb\u02cc\7e\2\2\u02cc\u02ce\7<\2\2\u02cd\u02cf\5T+\2\u02ce\u02cd"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02ef\3\2\2\2\u02d0\u02d1\7e\2\2\u02d1"+
		"\u02d3\7\u009b\2\2\u02d2\u02d4\5T+\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3"+
		"\2\2\2\u02d4\u02ef\3\2\2\2\u02d5\u02d7\7\u009d\2\2\u02d6\u02d8\5T+\2\u02d7"+
		"\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02ef\3\2\2\2\u02d9\u02da\7e"+
		"\2\2\u02da\u02db\7<\2\2\u02db\u02dd\7\u0083\2\2\u02dc\u02de\5T+\2\u02dd"+
		"\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02ef\3\2\2\2\u02df\u02e0\7e"+
		"\2\2\u02e0\u02e1\7\u009b\2\2\u02e1\u02e3\7\u0083\2\2\u02e2\u02e4\5T+\2"+
		"\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02ef\3\2\2\2\u02e5\u02e6"+
		"\7\u009d\2\2\u02e6\u02e8\7\u0083\2\2\u02e7\u02e9\5T+\2\u02e8\u02e7\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ef\3\2\2\2\u02ea\u02ec\7\u009e\2\2\u02eb"+
		"\u02ed\5T+\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2"+
		"\2\u02ee\u02cb\3\2\2\2\u02ee\u02d0\3\2\2\2\u02ee\u02d5\3\2\2\2\u02ee\u02d9"+
		"\3\2\2\2\u02ee\u02df\3\2\2\2\u02ee\u02e5\3\2\2\2\u02ee\u02ea\3\2\2\2\u02ef"+
		"W\3\2\2\2\u02f0\u02f2\7\u00a7\2\2\u02f1\u02f3\5T+\2\u02f2\u02f1\3\2\2"+
		"\2\u02f2\u02f3\3\2\2\2\u02f3\u02f9\3\2\2\2\u02f4\u02f6\7\u00a8\2\2\u02f5"+
		"\u02f7\5T+\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2\2"+
		"\2\u02f8\u02f0\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f9Y\3\2\2\2\u02fa\u02fd"+
		"\5\\/\2\u02fb\u02fd\5^\60\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fd"+
		"[\3\2\2\2\u02fe\u0300\7\u0099\2\2\u02ff\u0301\5`\61\2\u0300\u02ff\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301\u0314\3\2\2\2\u0302\u0304\7\u009a\2\2\u0303"+
		"\u0305\5`\61\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0314\3\2"+
		"\2\2\u0306\u0308\7C\2\2\u0307\u0309\5`\61\2\u0308\u0307\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u0314\3\2\2\2\u030a\u0314\7\u008b\2\2\u030b\u0314"+
		"\7\u008f\2\2\u030c\u0314\7\u008c\2\2\u030d\u0314\7\u0090\2\2\u030e\u0314"+
		"\7\u008d\2\2\u030f\u0314\7\u0091\2\2\u0310\u0314\7\u0092\2\2\u0311\u0314"+
		"\7\u008e\2\2\u0312\u0314\7\u0093\2\2\u0313\u02fe\3\2\2\2\u0313\u0302\3"+
		"\2\2\2\u0313\u0306\3\2\2\2\u0313\u030a\3\2\2\2\u0313\u030b\3\2\2\2\u0313"+
		"\u030c\3\2\2\2\u0313\u030d\3\2\2\2\u0313\u030e\3\2\2\2\u0313\u030f\3\2"+
		"\2\2\u0313\u0310\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314"+
		"]\3\2\2\2\u0315\u0317\7\u0097\2\2\u0316\u0318\5`\61\2\u0317\u0316\3\2"+
		"\2\2\u0317\u0318\3\2\2\2\u0318\u0320\3\2\2\2\u0319\u0320\7\u0094\2\2\u031a"+
		"\u0320\7\u0096\2\2\u031b\u0320\7\u0095\2\2\u031c\u0320\7\u0098\2\2\u031d"+
		"\u031e\7\u0098\2\2\u031e\u0320\7j\2\2\u031f\u0315\3\2\2\2\u031f\u0319"+
		"\3\2\2\2\u031f\u031a\3\2\2\2\u031f\u031b\3\2\2\2\u031f\u031c\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u0320_\3\2\2\2\u0321\u0322\7\u00ba\2\2\u0322\u0323\7\u00c6"+
		"\2\2\u0323\u032a\7\u00bb\2\2\u0324\u0325\7\u00ba\2\2\u0325\u0326\7\u00c6"+
		"\2\2\u0326\u0327\7\u00b3\2\2\u0327\u0328\7\u00c6\2\2\u0328\u032a\7\u00bb"+
		"\2\2\u0329\u0321\3\2\2\2\u0329\u0324\3\2\2\2\u032aa\3\2\2\2\u032b\u032c"+
		"\t\4\2\2\u032cc\3\2\2\2\u032d\u033b\7\u009f\2\2\u032e\u033b\7\u00a0\2"+
		"\2\u032f\u0330\7\u00a0\2\2\u0330\u0331\7\67\2\2\u0331\u0332\7\u00a0\2"+
		"\2\u0332\u033b\7\u0086\2\2\u0333\u033b\7\u00a1\2\2\u0334\u033b\7\u00a2"+
		"\2\2\u0335\u0336\7\u00a2\2\2\u0336\u0337\7\67\2\2\u0337\u0338\7\u00a0"+
		"\2\2\u0338\u033b\7\u0086\2\2\u0339\u033b\7\u00a3\2\2\u033a\u032d\3\2\2"+
		"\2\u033a\u032e\3\2\2\2\u033a\u032f\3\2\2\2\u033a\u0333\3\2\2\2\u033a\u0334"+
		"\3\2\2\2\u033a\u0335\3\2\2\2\u033a\u0339\3\2\2\2\u033be\3\2\2\2\u033c"+
		"\u033e\7\u0089\2\2\u033d\u033f\5T+\2\u033e\u033d\3\2\2\2\u033e\u033f\3"+
		"\2\2\2\u033f\u034a\3\2\2\2\u0340\u0342\7\u008a\2\2\u0341\u0343\5T+\2\u0342"+
		"\u0341\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u034a\3\2\2\2\u0344\u0345\7\u0089"+
		"\2\2\u0345\u0347\7\u0083\2\2\u0346\u0348\5T+\2\u0347\u0346\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u034a\3\2\2\2\u0349\u033c\3\2\2\2\u0349\u0340\3\2"+
		"\2\2\u0349\u0344\3\2\2\2\u034ag\3\2\2\2\u034b\u034d\7\u00a5\2\2\u034c"+
		"\u034e\5T+\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0359\3\2\2"+
		"\2\u034f\u0350\7\u00a5\2\2\u0350\u0352\7\u0083\2\2\u0351\u0353\5T+\2\u0352"+
		"\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0359\3\2\2\2\u0354\u0356\7\u00a6"+
		"\2\2\u0355\u0357\5T+\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359"+
		"\3\2\2\2\u0358\u034b\3\2\2\2\u0358\u034f\3\2\2\2\u0358\u0354\3\2\2\2\u0359"+
		"i\3\2\2\2\u035a\u035d\5l\67\2\u035b\u035d\5n8\2\u035c\u035a\3\2\2\2\u035c"+
		"\u035b\3\2\2\2\u035dk\3\2\2\2\u035e\u035f\7\u00ba\2\2\u035f\u0360\5\u009a"+
		"N\2\u0360\u0361\7\u00bb\2\2\u0361m\3\2\2\2\u0362\u036a\5p9\2\u0363\u036a"+
		"\5\u0142\u00a2\2\u0364\u036a\5v<\2\u0365\u036a\5\u0148\u00a5\2\u0366\u036a"+
		"\5\u0082B\2\u0367\u036a\5\u0094K\2\u0368\u036a\5\u017c\u00bf\2\u0369\u0362"+
		"\3\2\2\2\u0369\u0363\3\2\2\2\u0369\u0364\3\2\2\2\u0369\u0365\3\2\2\2\u0369"+
		"\u0366\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036ao\3\2\2\2"+
		"\u036b\u036c\5@!\2\u036cq\3\2\2\2\u036d\u036e\t\5\2\2\u036es\3\2\2\2\u036f"+
		"\u0371\5\u00a8U\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372"+
		"\3\2\2\2\u0372\u0373\5r:\2\u0373u\3\2\2\2\u0374\u0375\5x=\2\u0375w\3\2"+
		"\2\2\u0376\u0377\7@\2\2\u0377\u0378\7\u00ba\2\2\u0378\u0379\7\u00be\2"+
		"\2\u0379\u037f\7\u00bb\2\2\u037a\u037c\5z>\2\u037b\u037d\5~@\2\u037c\u037b"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e\u0376\3\2\2\2\u037e"+
		"\u037a\3\2\2\2\u037fy\3\2\2\2\u0380\u0381\5|?\2\u0381\u0383\7\u00ba\2"+
		"\2\u0382\u0384\5\u0140\u00a1\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2"+
		"\u0384\u0385\3\2\2\2\u0385\u0386\5\u009aN\2\u0386\u0387\7\u00bb\2\2\u0387"+
		"{\3\2\2\2\u0388\u0389\t\6\2\2\u0389}\3\2\2\2\u038a\u038b\7M\2\2\u038b"+
		"\u038c\7\u00ba\2\2\u038c\u038d\7\66\2\2\u038d\u038e\5\u010a\u0086\2\u038e"+
		"\u038f\7\u00bb\2\2\u038f\177\3\2\2\2\u0390\u0391\7Q\2\2\u0391\u0392\7"+
		"\u00ba\2\2\u0392\u0393\5\u0146\u00a4\2\u0393\u0394\7\u00bb\2\2\u0394\u0081"+
		"\3\2\2\2\u0395\u0396\5\u0086D\2\u0396\u0083\3\2\2\2\u0397\u0398\7f\2\2"+
		"\u0398\u0399\7\u00ba\2\2\u0399\u039a\5\u009eP\2\u039a\u039b\7\u00b3\2"+
		"\2\u039b\u039c\5\u00c4c\2\u039c\u039d\7\u00bb\2\2\u039d\u03aa\3\2\2\2"+
		"\u039e\u039f\7>\2\2\u039f\u03a0\7\u00ba\2\2\u03a0\u03a3\5\u009eP\2\u03a1"+
		"\u03a2\7\u00b3\2\2\u03a2\u03a4\5\u00c4c\2\u03a3\u03a1\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a8\7\u00bb\2\2\u03a8\u03aa\3\2\2\2\u03a9\u0397\3\2\2\2\u03a9\u039e"+
		"\3\2\2\2\u03aa\u0085\3\2\2\2\u03ab\u03ae\5\u0088E\2\u03ac\u03ae\5\u008a"+
		"F\2\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u0087\3\2\2\2\u03af"+
		"\u03b0\7\n\2\2\u03b0\u03b2\5\u00c4c\2\u03b1\u03b3\5\u008cG\2\u03b2\u03b1"+
		"\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u03b7\3\2\2\2\u03b6\u03b8\5\u0090I\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\7\20\2\2\u03ba\u0089\3\2\2\2"+
		"\u03bb\u03bd\7\n\2\2\u03bc\u03be\5\u008eH\2\u03bd\u03bc\3\2\2\2\u03be"+
		"\u03bf\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\3\2"+
		"\2\2\u03c1\u03c3\5\u0090I\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c4\3\2\2\2\u03c4\u03c5\7\20\2\2\u03c5\u008b\3\2\2\2\u03c6\u03c7\7"+
		"\65\2\2\u03c7\u03c8\5\u010a\u0086\2\u03c8\u03c9\7/\2\2\u03c9\u03ca\5\u0092"+
		"J\2\u03ca\u008d\3\2\2\2\u03cb\u03cc\7\65\2\2\u03cc\u03cd\5\u010a\u0086"+
		"\2\u03cd\u03ce\7/\2\2\u03ce\u03cf\5\u0092J\2\u03cf\u008f\3\2\2\2\u03d0"+
		"\u03d1\7\21\2\2\u03d1\u03d2\5\u0092J\2\u03d2\u0091\3\2\2\2\u03d3\u03d6"+
		"\5\u009aN\2\u03d4\u03d6\7%\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d4\3\2\2\2"+
		"\u03d6\u0093\3\2\2\2\u03d7\u03d8\7\13\2\2\u03d8\u03d9\7\u00ba\2\2\u03d9"+
		"\u03da\5\u0096L\2\u03da\u03db\7\3\2\2\u03db\u03dc\5\u0098M\2\u03dc\u03dd"+
		"\7\u00bb\2\2\u03dd\u0095\3\2\2\2\u03de\u03df\5\u009aN\2\u03df\u0097\3"+
		"\2\2\2\u03e0\u03e1\5N(\2\u03e1\u0099\3\2\2\2\u03e2\u03e6\5\u009cO\2\u03e3"+
		"\u03e6\5\u00d8m\2\u03e4\u03e6\5\u00c4c\2\u03e5\u03e2\3\2\2\2\u03e5\u03e3"+
		"\3\2\2\2\u03e5\u03e4\3\2\2\2\u03e6\u009b\3\2\2\2\u03e7\u03eb\5\u009eP"+
		"\2\u03e8\u03eb\5\u00b4[\2\u03e9\u03eb\7%\2\2\u03ea\u03e7\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03ea\u03e9\3\2\2\2\u03eb\u009d\3\2\2\2\u03ec\u03f1\5\u00a0"+
		"Q\2\u03ed\u03ee\t\7\2\2\u03ee\u03f0\5\u00a0Q\2\u03ef\u03ed\3\2\2\2\u03f0"+
		"\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u009f\3\2"+
		"\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f9\5\u00a2R\2\u03f5\u03f6\t\b\2\2\u03f6"+
		"\u03f8\5\u00a2R\2\u03f7\u03f5\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7"+
		"\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u00a1\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc"+
		"\u03fe\5\u00a8U\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u0400\5\u00a6T\2\u0400\u00a3\3\2\2\2\u0401\u0402\7\u00ba"+
		"\2\2\u0402\u0407\5\u009eP\2\u0403\u0404\7\u00b3\2\2\u0404\u0406\5\u009e"+
		"P\2\u0405\u0403\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407"+
		"\u0408\3\2\2\2\u0408\u040a\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040b\7\u00bb"+
		"\2\2\u040b\u00a5\3\2\2\2\u040c\u0411\5j\66\2\u040d\u040e\7\u00ae\2\2\u040e"+
		"\u0410\5\u0098M\2\u040f\u040d\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f"+
		"\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0416\3\2\2\2\u0413\u0411\3\2\2\2\u0414"+
		"\u0416\5\u00aaV\2\u0415\u040c\3\2\2\2\u0415\u0414\3\2\2\2\u0416\u00a7"+
		"\3\2\2\2\u0417\u0418\t\7\2\2\u0418\u00a9\3\2\2\2\u0419\u041a\5\u00acW"+
		"\2\u041a\u00ab\3\2\2\2\u041b\u041c\7L\2\2\u041c\u041d\7\u00ba\2\2\u041d"+
		"\u041e\5\u00aeX\2\u041e\u041f\7\25\2\2\u041f\u0420\5\u00b2Z\2\u0420\u0421"+
		"\7\u00bb\2\2\u0421\u00ad\3\2\2\2\u0422\u0426\5\u0176\u00bc\2\u0423\u0426"+
		"\5\u00b0Y\2\u0424\u0426\5\u017a\u00be\2\u0425\u0422\3\2\2\2\u0425\u0423"+
		"\3\2\2\2\u0425\u0424\3\2\2\2\u0426\u00af\3\2\2\2\u0427\u0428\t\t\2\2\u0428"+
		"\u00b1\3\2\2\2\u0429\u042c\5\u0142\u00a2\2\u042a\u042c\5D#\2\u042b\u0429"+
		"\3\2\2\2\u042b\u042a\3\2\2\2\u042c\u00b3\3\2\2\2\u042d\u042e\5\u00b6\\"+
		"\2\u042e\u00b5\3\2\2\2\u042f\u0434\5\u00b8]\2\u0430\u0431\7\u00b4\2\2"+
		"\u0431\u0433\5\u00b8]\2\u0432\u0430\3\2\2\2\u0433\u0436\3\2\2\2\u0434"+
		"\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u00b7\3\2\2\2\u0436\u0434\3\2"+
		"\2\2\u0437\u0438\5\u00ba^\2\u0438\u00b9\3\2\2\2\u0439\u043c\5j\66\2\u043a"+
		"\u043c\5\u00bc_\2\u043b\u0439\3\2\2\2\u043b\u043a\3\2\2\2\u043c\u00bb"+
		"\3\2\2\2\u043d\u043e\5\u00be`\2\u043e\u00bd\3\2\2\2\u043f\u0440\7}\2\2"+
		"\u0440\u0441\7\u00ba\2\2\u0441\u0442\5\u00c0a\2\u0442\u0443\7\u00bb\2"+
		"\2\u0443\u00bf\3\2\2\2\u0444\u0446\5\u00c2b\2\u0445\u0444\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0449\5\u00b6\\\2\u0448\u0447"+
		"\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\7\25\2\2"+
		"\u044b\u0445\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0453"+
		"\5\u00b6\\\2\u044e\u044f\5\u00b6\\\2\u044f\u0450\7\u00b3\2\2\u0450\u0451"+
		"\5\u00b6\\\2\u0451\u0453\3\2\2\2\u0452\u044b\3\2\2\2\u0452\u044e\3\2\2"+
		"\2\u0453\u00c1\3\2\2\2\u0454\u0455\t\n\2\2\u0455\u00c3\3\2\2\2\u0456\u0457"+
		"\5\u00c6d\2\u0457\u00c5\3\2\2\2\u0458\u045d\5\u00c8e\2\u0459\u045a\7("+
		"\2\2\u045a\u045c\5\u00c6d\2\u045b\u0459\3\2\2\2\u045c\u045f\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u00c7\3\2\2\2\u045f\u045d\3\2"+
		"\2\2\u0460\u0465\5\u00caf\2\u0461\u0462\7\5\2\2\u0462\u0464\5\u00c8e\2"+
		"\u0463\u0461\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u00c9\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u046c\5\u00ccg"+
		"\2\u0469\u046a\7$\2\2\u046a\u046c\5\u00ccg\2\u046b\u0468\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046c\u00cb\3\2\2\2\u046d\u046f\5\u00d2j\2\u046e\u0470"+
		"\5\u00ceh\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u00cd\3\2\2"+
		"\2\u0471\u0473\7\35\2\2\u0472\u0474\7$\2\2\u0473\u0472\3\2\2\2\u0473\u0474"+
		"\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\5\u00d0i\2\u0476\u00cf\3\2\2"+
		"\2\u0477\u0478\t\3\2\2\u0478\u00d1\3\2\2\2\u0479\u047c\5\u0150\u00a9\2"+
		"\u047a\u047c\5\u00d4k\2\u047b\u0479\3\2\2\2\u047b\u047a\3\2\2\2\u047c"+
		"\u00d3\3\2\2\2\u047d\u0480\5\u00d6l\2\u047e\u0480\5n8\2\u047f\u047d\3"+
		"\2\2\2\u047f\u047e\3\2\2\2\u0480\u00d5\3\2\2\2\u0481\u0482\7\u00ba\2\2"+
		"\u0482\u0483\5\u00c4c\2\u0483\u0484\7\u00bb\2\2\u0484\u00d7\3\2\2\2\u0485"+
		"\u0488\5\u00dan\2\u0486\u0488\5\u00dco\2\u0487\u0485\3\2\2\2\u0487\u0486"+
		"\3\2\2\2\u0488\u00d9\3\2\2\2\u0489\u048a\5n8\2\u048a\u00db\3\2\2\2\u048b"+
		"\u048c\7%\2\2\u048c\u00dd\3\2\2\2\u048d\u0490\5\u00dan\2\u048e\u0490\5"+
		"\u00e0q\2\u048f\u048d\3\2\2\2\u048f\u048e\3\2\2\2\u0490\u00df\3\2\2\2"+
		"\u0491\u0494\5\u009cO\2\u0492\u0494\5\u00d4k\2\u0493\u0491\3\2\2\2\u0493"+
		"\u0492\3\2\2\2\u0494\u00e1\3\2\2\2\u0495\u0497\5\u00e4s\2\u0496\u0498"+
		"\5\u0108\u0085\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a\3"+
		"\2\2\2\u0499\u049b\5\u010c\u0087\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2"+
		"\2\2\u049b\u049d\3\2\2\2\u049c\u049e\5\u011c\u008f\2\u049d\u049c\3\2\2"+
		"\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u04a1\5\u0184\u00c3\2"+
		"\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\3\2\2\2\u04a2\u04a4"+
		"\5\u018c\u00c7\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u00e3\3"+
		"\2\2\2\u04a5\u04a6\7\25\2\2\u04a6\u04a7\5\u00e6t\2\u04a7\u00e5\3\2\2\2"+
		"\u04a8\u04ad\5\u00e8u\2\u04a9\u04aa\7\u00b3\2\2\u04aa\u04ac\5\u00e8u\2"+
		"\u04ab\u04a9\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae"+
		"\3\2\2\2\u04ae\u00e7\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b3\5\u00eav"+
		"\2\u04b1\u04b3\5\u0102\u0082\2\u04b2\u04b0\3\2\2\2\u04b2\u04b1\3\2\2\2"+
		"\u04b3\u00e9\3\2\2\2\u04b4\u04b6\5\u0102\u0082\2\u04b5\u04b7\5\u00ecw"+
		"\2\u04b6\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9"+
		"\3\2\2\2\u04b9\u00eb\3\2\2\2\u04ba\u04bb\7\r\2\2\u04bb\u04bc\7\36\2\2"+
		"\u04bc\u04ce\5\u0102\u0082\2\u04bd\u04bf\5\u00f6|\2\u04be\u04bd\3\2\2"+
		"\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\7\36\2\2\u04c1"+
		"\u04c2\5\u0102\u0082\2\u04c2\u04c3\5\u00fc\177\2\u04c3\u04ce\3\2\2\2\u04c4"+
		"\u04c6\7#\2\2\u04c5\u04c7\5\u00f6|\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3"+
		"\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\7\36\2\2\u04c9\u04ce\5\u0102\u0082"+
		"\2\u04ca\u04cb\7\62\2\2\u04cb\u04cc\7\36\2\2\u04cc\u04ce\5\u0102\u0082"+
		"\2\u04cd\u04ba\3\2\2\2\u04cd\u04be\3\2\2\2\u04cd\u04c4\3\2\2\2\u04cd\u04ca"+
		"\3\2\2\2\u04ce\u00ed\3\2\2\2\u04cf\u04d0\7\r\2\2\u04d0\u04d1\7\36\2\2"+
		"\u04d1\u04d2\5\u0102\u0082\2\u04d2\u00ef\3\2\2\2\u04d3\u04d5\5\u00f6|"+
		"\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7"+
		"\7\36\2\2\u04d7\u04d8\5\u0102\u0082\2\u04d8\u04d9\5\u00fc\177\2\u04d9"+
		"\u00f1\3\2\2\2\u04da\u04dc\7#\2\2\u04db\u04dd\5\u00f6|\2\u04dc\u04db\3"+
		"\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\7\36\2\2\u04df"+
		"\u04e0\5\u0102\u0082\2\u04e0\u00f3\3\2\2\2\u04e1\u04e2\7\62\2\2\u04e2"+
		"\u04e3\7\36\2\2\u04e3\u04e4\5\u0102\u0082\2\u04e4\u00f5\3\2\2\2\u04e5"+
		"\u04e8\7\32\2\2\u04e6\u04e8\5\u00f8}\2\u04e7\u04e5\3\2\2\2\u04e7\u04e6"+
		"\3\2\2\2\u04e8\u00f7\3\2\2\2\u04e9\u04eb\5\u00fa~\2\u04ea\u04ec\7\'\2"+
		"\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u00f9\3\2\2\2\u04ed\u04ee"+
		"\t\13\2\2\u04ee\u00fb\3\2\2\2\u04ef\u04f2\5\u00fe\u0080\2\u04f0\u04f2"+
		"\5\u0100\u0081\2\u04f1\u04ef\3\2\2\2\u04f1\u04f0\3\2\2\2\u04f2\u00fd\3"+
		"\2\2\2\u04f3\u04f4\7&\2\2\u04f4\u04f5\5\u010a\u0086\2\u04f5\u00ff\3\2"+
		"\2\2\u04f6\u04f7\7\64\2\2\u04f7\u04f8\7\u00ba\2\2\u04f8\u04f9\5\u0146"+
		"\u00a4\2\u04f9\u04fa\7\u00bb\2\2\u04fa\u0101\3\2\2\2\u04fb\u0500\5\u0132"+
		"\u009a\2\u04fc\u04fe\7\3\2\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u04ff\3\2\2\2\u04ff\u0501\5<\37\2\u0500\u04fd\3\2\2\2\u0500\u0501\3\2"+
		"\2\2\u0501\u0506\3\2\2\2\u0502\u0503\7\u00ba\2\2\u0503\u0504\5\u0104\u0083"+
		"\2\u0504\u0505\7\u00bb\2\2\u0505\u0507\3\2\2\2\u0506\u0502\3\2\2\2\u0506"+
		"\u0507\3\2\2\2\u0507\u0514\3\2\2\2\u0508\u050a\5\u0106\u0084\2\u0509\u050b"+
		"\7\3\2\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c"+
		"\u0511\5<\37\2\u050d\u050e\7\u00ba\2\2\u050e\u050f\5\u0104\u0083\2\u050f"+
		"\u0510\7\u00bb\2\2\u0510\u0512\3\2\2\2\u0511\u050d\3\2\2\2\u0511\u0512"+
		"\3\2\2\2\u0512\u0514\3\2\2\2\u0513\u04fb\3\2\2\2\u0513\u0508\3\2\2\2\u0514"+
		"\u0103\3\2\2\2\u0515\u051a\5<\37\2\u0516\u0517\7\u00b3\2\2\u0517\u0519"+
		"\5<\37\2\u0518\u0516\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051a"+
		"\u051b\3\2\2\2\u051b\u0105\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u051e\5\u014c"+
		"\u00a7\2\u051e\u0107\3\2\2\2\u051f\u0520\7\66\2\2\u0520\u0521\5\u010a"+
		"\u0086\2\u0521\u0109\3\2\2\2\u0522\u0523\5\u009aN\2\u0523\u010b\3\2\2"+
		"\2\u0524\u0525\7\26\2\2\u0525\u0526\7:\2\2\u0526\u0527\5\u010e\u0088\2"+
		"\u0527\u010d\3\2\2\2\u0528\u052d\5\u0110\u0089\2\u0529\u052a\7\u00b3\2"+
		"\2\u052a\u052c\5\u0110\u0089\2\u052b\u0529\3\2\2\2\u052c\u052f\3\2\2\2"+
		"\u052d\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u010f\3\2\2\2\u052f\u052d"+
		"\3\2\2\2\u0530\u0535\5\u0116\u008c\2\u0531\u0535\5\u0118\u008d\2\u0532"+
		"\u0535\5\u011a\u008e\2\u0533\u0535\5\u0112\u008a\2\u0534\u0530\3\2\2\2"+
		"\u0534\u0531\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0533\3\2\2\2\u0535\u0111"+
		"\3\2\2\2\u0536\u053c\5\u00dep\2\u0537\u0538\7\u00ba\2\2\u0538\u0539\5"+
		"\u011e\u0090\2\u0539\u053a\7\u00bb\2\2\u053a\u053c\3\2\2\2\u053b\u0536"+
		"\3\2\2\2\u053b\u0537\3\2\2\2\u053c\u0113\3\2\2\2\u053d\u0542\5\u0112\u008a"+
		"\2\u053e\u053f\7\u00b3\2\2\u053f\u0541\5\u0112\u008a\2\u0540\u053e\3\2"+
		"\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0115\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0546\7p\2\2\u0546\u0547\7\u00ba"+
		"\2\2\u0547\u0548\5\u0114\u008b\2\u0548\u0549\7\u00bb\2\2\u0549\u0117\3"+
		"\2\2\2\u054a\u054b\7A\2\2\u054b\u054c\7\u00ba\2\2\u054c\u054d\5\u0114"+
		"\u008b\2\u054d\u054e\7\u00bb\2\2\u054e\u0119\3\2\2\2\u054f\u0550\7\u00ba"+
		"\2\2\u0550\u0551\7\u00bb\2\2\u0551\u011b\3\2\2\2\u0552\u0553\7\27\2\2"+
		"\u0553\u0554\5\u00c4c\2\u0554\u011d\3\2\2\2\u0555\u055a\5\u00dep\2\u0556"+
		"\u0557\7\u00b3\2\2\u0557\u0559\5\u00dep\2\u0558\u0556\3\2\2\2\u0559\u055c"+
		"\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u011f\3\2\2\2\u055c"+
		"\u055a\3\2\2\2\u055d\u055e\5\u0122\u0092\2\u055e\u0121\3\2\2\2\u055f\u0562"+
		"\5\u0124\u0093\2\u0560\u0562\5\u00eav\2\u0561\u055f\3\2\2\2\u0561\u0560"+
		"\3\2\2\2\u0562\u0123\3\2\2\2\u0563\u056c\5\u0128\u0095\2\u0564\u0565\5"+
		"\u00eav\2\u0565\u0567\t\f\2\2\u0566\u0568\t\r\2\2\u0567\u0566\3\2\2\2"+
		"\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\5\u0126\u0094\2\u056a"+
		"\u056c\3\2\2\2\u056b\u0563\3\2\2\2\u056b\u0564\3\2\2\2\u056c\u0574\3\2"+
		"\2\2\u056d\u056f\t\f\2\2\u056e\u0570\t\r\2\2\u056f\u056e\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\5\u0126\u0094\2\u0572\u056d"+
		"\3\2\2\2\u0573\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0125\3\2\2\2\u0576\u0574\3\2\2\2\u0577\u057a\5\u0128\u0095\2\u0578\u057a"+
		"\5\u00eav\2\u0579\u0577\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u0127\3\2\2"+
		"\2\u057b\u0584\5\u012c\u0097\2\u057c\u057d\5\u00eav\2\u057d\u057f\7\33"+
		"\2\2\u057e\u0580\t\r\2\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580"+
		"\u0581\3\2\2\2\u0581\u0582\5\u012a\u0096\2\u0582\u0584\3\2\2\2\u0583\u057b"+
		"\3\2\2\2\u0583\u057c\3\2\2\2\u0584\u058c\3\2\2\2\u0585\u0587\7\33\2\2"+
		"\u0586\u0588\t\r\2\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589"+
		"\3\2\2\2\u0589\u058b\5\u012a\u0096\2\u058a\u0585\3\2\2\2\u058b\u058e\3"+
		"\2\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u0129\3\2\2\2\u058e"+
		"\u058c\3\2\2\2\u058f\u0592\5\u012c\u0097\2\u0590\u0592\5\u00eav\2\u0591"+
		"\u058f\3\2\2\2\u0591\u0590\3\2\2\2\u0592\u012b\3\2\2\2\u0593\u0599\5\u012e"+
		"\u0098\2\u0594\u0595\7\u00ba\2\2\u0595\u0596\5\u0124\u0093\2\u0596\u0597"+
		"\7\u00bb\2\2\u0597\u0599\3\2\2\2\u0598\u0593\3\2\2\2\u0598\u0594\3\2\2"+
		"\2\u0599\u012d\3\2\2\2\u059a\u059d\5\u0136\u009c\2\u059b\u059d\5\u0130"+
		"\u0099\2\u059c\u059a\3\2\2\2\u059c\u059b\3\2\2\2\u059d\u012f\3\2\2\2\u059e"+
		"\u059f\7.\2\2\u059f\u05a0\5\u0132\u009a\2\u05a0\u0131\3\2\2\2\u05a1\u05a4"+
		"\5\u0134\u009b\2\u05a2\u05a4\5<\37\2\u05a3\u05a1\3\2\2\2\u05a3\u05a2\3"+
		"\2\2\2\u05a4\u0133\3\2\2\2\u05a5\u05ac\5<\37\2\u05a6\u05a7\7\u00c1\2\2"+
		"\u05a7\u05aa\5<\37\2\u05a8\u05a9\7\u00c1\2\2\u05a9\u05ab\5<\37\2\u05aa"+
		"\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05a6\3\2"+
		"\2\2\u05ac\u05ad\3\2\2\2\u05ad\u0135\3\2\2\2\u05ae\u05b0\7+\2\2\u05af"+
		"\u05b1\5\u0140\u00a1\2\u05b0\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2"+
		"\3\2\2\2\u05b2\u05b4\5\u0138\u009d\2\u05b3\u05b5\5\u00e2r\2\u05b4\u05b3"+
		"\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u0137\3\2\2\2\u05b6\u05bb\5\u013a\u009e"+
		"\2\u05b7\u05b8\7\u00b3\2\2\u05b8\u05ba\5\u013a\u009e\2\u05b9\u05b7\3\2"+
		"\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc"+
		"\u0139\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05c1\5\u013c\u009f\2\u05bf\u05c1"+
		"\5\u013e\u00a0\2\u05c0\u05be\3\2\2\2\u05c0\u05bf\3\2\2\2\u05c1\u013b\3"+
		"\2\2\2\u05c2\u05c4\5\u009aN\2\u05c3\u05c5\5\u0144\u00a3\2\u05c4\u05c3"+
		"\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u013d\3\2\2\2\u05c6\u05c7\7\u00ca\2"+
		"\2\u05c7\u05c9\7\u00c1\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9"+
		"\u05ca\3\2\2\2\u05ca\u05cb\7\u00be\2\2\u05cb\u013f\3\2\2\2\u05cc\u05cd"+
		"\t\r\2\2\u05cd\u0141\3\2\2\2\u05ce\u05cf\5<\37\2\u05cf\u05d0\7\u00c1\2"+
		"\2\u05d0\u05d2\3\2\2\2\u05d1\u05ce\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3"+
		"\3\2\2\2\u05d3\u05d4\5<\37\2\u05d4\u0143\3\2\2\2\u05d5\u05d7\7\3\2\2\u05d6"+
		"\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\5<"+
		"\37\2\u05d9\u0145\3\2\2\2\u05da\u05df\5\u0142\u00a2\2\u05db\u05dc\7\u00b3"+
		"\2\2\u05dc\u05de\5\u0142\u00a2\2\u05dd\u05db\3\2\2\2\u05de\u05e1\3\2\2"+
		"\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u0147\3\2\2\2\u05e1\u05df"+
		"\3\2\2\2\u05e2\u05e3\5\u014e\u00a8\2\u05e3\u0149\3\2\2\2\u05e4\u05e5\5"+
		"\u014e\u00a8\2\u05e5\u014b\3\2\2\2\u05e6\u05e7\5\u014e\u00a8\2\u05e7\u014d"+
		"\3\2\2\2\u05e8\u05e9\7\u00ba\2\2\u05e9\u05ea\5\u0120\u0091\2\u05ea\u05eb"+
		"\7\u00bb\2\2\u05eb\u014f\3\2\2\2\u05ec\u05f3\5\u0152\u00aa\2\u05ed\u05f3"+
		"\5\u0156\u00ac\2\u05ee\u05f3\5\u015a\u00ae\2\u05ef\u05f3\5\u0160\u00b1"+
		"\2\u05f0\u05f3\5\u0168\u00b5\2\u05f1\u05f3\5\u0172\u00ba\2\u05f2\u05ec"+
		"\3\2\2\2\u05f2\u05ed\3\2\2\2\u05f2\u05ee\3\2\2\2\u05f2\u05ef\3\2\2\2\u05f2"+
		"\u05f0\3\2\2\2\u05f2\u05f1\3\2\2\2\u05f3\u0151\3\2\2\2\u05f4\u05f5\5\u00de"+
		"p\2\u05f5\u05f6\5\u0154\u00ab\2\u05f6\u05f7\5\u00dep\2\u05f7\u0153\3\2"+
		"\2\2\u05f8\u05f9\t\16\2\2\u05f9\u0155\3\2\2\2\u05fa\u05fb\5\u00dep\2\u05fb"+
		"\u05fc\5\u0158\u00ad\2\u05fc\u0157\3\2\2\2\u05fd\u05ff\7$\2\2\u05fe\u05fd"+
		"\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0602\79\2\2\u0601"+
		"\u0603\t\17\2\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0604\3"+
		"\2\2\2\u0604\u0605\5\u00dep\2\u0605\u0606\7\5\2\2\u0606\u0607\5\u00de"+
		"p\2\u0607\u0159\3\2\2\2\u0608\u060a\5\u009eP\2\u0609\u060b\7$\2\2\u060a"+
		"\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\7\31"+
		"\2\2\u060d\u060e\5\u015c\u00af\2\u060e\u015b\3\2\2\2\u060f\u0615\5\u014c"+
		"\u00a7\2\u0610\u0611\7\u00ba\2\2\u0611\u0612\5\u015e\u00b0\2\u0612\u0613"+
		"\7\u00bb\2\2\u0613\u0615\3\2\2\2\u0614\u060f\3\2\2\2\u0614\u0610\3\2\2"+
		"\2\u0615\u015d\3\2\2\2\u0616\u061b\5\u00d8m\2\u0617\u0618\7\u00b3\2\2"+
		"\u0618\u061a\5\u00d8m\2\u0619\u0617\3\2\2\2\u061a\u061d\3\2\2\2\u061b"+
		"\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u015f\3\2\2\2\u061d\u061b\3\2"+
		"\2\2\u061e\u061f\5\u00dep\2\u061f\u0620\5\u0162\u00b2\2\u0620\u0621\7"+
		"\u00cb\2\2\u0621\u0161\3\2\2\2\u0622\u0624\7$\2\2\u0623\u0622\3\2\2\2"+
		"\u0623\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0628\5\u0164\u00b3\2\u0626"+
		"\u0628\5\u0166\u00b4\2\u0627\u0623\3\2\2\2\u0627\u0626\3\2\2\2\u0628\u0163"+
		"\3\2\2\2\u0629\u0630\7!\2\2\u062a\u0630\7\30\2\2\u062b\u062c\7s\2\2\u062c"+
		"\u0630\7~\2\2\u062d\u0630\7n\2\2\u062e\u0630\7o\2\2\u062f\u0629\3\2\2"+
		"\2\u062f\u062a\3\2\2\2\u062f\u062b\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u062e"+
		"\3\2\2\2\u0630\u0165\3\2\2\2\u0631\u0632\t\20\2\2\u0632\u0167\3\2\2\2"+
		"\u0633\u0634\5\u00dep\2\u0634\u0636\7\35\2\2\u0635\u0637\7$\2\2\u0636"+
		"\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\7%"+
		"\2\2\u0639\u0169\3\2\2\2\u063a\u063b\5\u009eP\2\u063b\u063c\5\u0154\u00ab"+
		"\2\u063c\u063d\5\u016c\u00b7\2\u063d\u063e\5\u014c\u00a7\2\u063e\u016b"+
		"\3\2\2\2\u063f\u0642\5\u016e\u00b8\2\u0640\u0642\5\u0170\u00b9\2\u0641"+
		"\u063f\3\2\2\2\u0641\u0640\3\2\2\2\u0642\u016d\3\2\2\2\u0643\u0644\7\4"+
		"\2\2\u0644\u016f\3\2\2\2\u0645\u0646\t\21\2\2\u0646\u0171\3\2\2\2\u0647"+
		"\u0649\7$\2\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064a\3\2"+
		"\2\2\u064a\u064b\7J\2\2\u064b\u064c\5\u014c\u00a7\2\u064c\u0173\3\2\2"+
		"\2\u064d\u064e\7\63\2\2\u064e\u064f\5\u014c\u00a7\2\u064f\u0175\3\2\2"+
		"\2\u0650\u0653\5\u0178\u00bd\2\u0651\u0653\7q\2\2\u0652\u0650\3\2\2\2"+
		"\u0652\u0651\3\2\2\2\u0653\u0177\3\2\2\2\u0654\u0655\t\22\2\2\u0655\u0179"+
		"\3\2\2\2\u0656\u0657\t\23\2\2\u0657\u017b\3\2\2\2\u0658\u0659\5\u0180"+
		"\u00c1\2\u0659\u065b\7\u00ba\2\2\u065a\u065c\5\u0182\u00c2\2\u065b\u065a"+
		"\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\7\u00bb\2"+
		"\2\u065e\u017d\3\2\2\2\u065f\u0660\t\24\2\2\u0660\u017f\3\2\2\2\u0661"+
		"\u0664\5<\37\2\u0662\u0664\5\u017e\u00c0\2\u0663\u0661\3\2\2\2\u0663\u0662"+
		"\3\2\2\2\u0664\u0181\3\2\2\2\u0665\u066a\5\u009aN\2\u0666\u0667\7\u00b3"+
		"\2\2\u0667\u0669\5\u009aN\2\u0668\u0666\3\2\2\2\u0669\u066c\3\2\2\2\u066a"+
		"\u0668\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u0183\3\2\2\2\u066c\u066a\3\2"+
		"\2\2\u066d\u066e\7)\2\2\u066e\u066f\7:\2\2\u066f\u0670\5\u0186\u00c4\2"+
		"\u0670\u0185\3\2\2\2\u0671\u0676\5\u0188\u00c5\2\u0672\u0673\7\u00b3\2"+
		"\2\u0673\u0675\5\u0188\u00c5\2\u0674\u0672\3\2\2\2\u0675\u0678\3\2\2\2"+
		"\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0187\3\2\2\2\u0678\u0676"+
		"\3\2\2\2\u0679\u067b\5\u00dep\2\u067a\u067c\5\u018a\u00c6\2\u067b\u067a"+
		"\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\3\2\2\2\u067d\u067f\5\u018e\u00c8"+
		"\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0189\3\2\2\2\u0680\u0681"+
		"\t\25\2\2\u0681\u018b\3\2\2\2\u0682\u0683\7\"\2\2\u0683\u0684\5\u009e"+
		"P\2\u0684\u018d\3\2\2\2\u0685\u0686\7%\2\2\u0686\u068a\7N\2\2\u0687\u0688"+
		"\7%\2\2\u0688\u068a\7Y\2\2\u0689\u0685\3\2\2\2\u0689\u0687\3\2\2\2\u068a"+
		"\u018f\3\2\2\2\u068b\u068d\7U\2\2\u068c\u068e\7g\2\2\u068d\u068c\3\2\2"+
		"\2\u068d\u068e\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\7\34\2\2\u0690"+
		"\u0695\5\u0134\u009b\2\u0691\u0692\7\u00ba\2\2\u0692\u0693\5\u0104\u0083"+
		"\2\u0693\u0694\7\u00bb\2\2\u0694\u0696\3\2\2\2\u0695\u0691\3\2\2\2\u0695"+
		"\u0696\3\2\2\2\u0696\u069c\3\2\2\2\u0697\u0698\7\u0080\2\2\u0698\u0699"+
		"\7\u00ba\2\2\u0699\u069a\5\u0192\u00ca\2\u069a\u069b\7\u00bb\2\2\u069b"+
		"\u069d\3\2\2\2\u069c\u0697\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2"+
		"\2\2\u069e\u06a0\5\u0120\u0091\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2"+
		"\2\u06a0\u06b1\3\2\2\2\u06a1\u06a3\7U\2\2\u06a2\u06a4\7g\2\2\u06a3\u06a2"+
		"\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\7\34\2\2"+
		"\u06a6\u06a7\7\\\2\2\u06a7\u06ad\7\u00cb\2\2\u06a8\u06a9\7\64\2\2\u06a9"+
		"\u06ab\5<\37\2\u06aa\u06ac\5\26\f\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3"+
		"\2\2\2\u06ac\u06ae\3\2\2\2\u06ad\u06a8\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae"+
		"\u06af\3\2\2\2\u06af\u06b1\5\u0120\u0091\2\u06b0\u068b\3\2\2\2\u06b0\u06a1"+
		"\3\2\2\2\u06b1\u0191\3\2\2\2\u06b2\u06b7\5\u009aN\2\u06b3\u06b4\7\u00b3"+
		"\2\2\u06b4\u06b6\5\u009aN\2\u06b5\u06b3\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7"+
		"\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u0193\3\2\2\2\u06b9\u06b7\3\2"+
		"\2\2\u00bf\u0196\u019e\u01a6\u01aa\u01b1\u01b7\u01c1\u01c4\u01cf\u01d2"+
		"\u01d5\u01d9\u01e0\u01e3\u01e6\u01eb\u01f3\u0204\u0219\u022a\u0237\u023b"+
		"\u023d\u024a\u0251\u0269\u0270\u0281\u0285\u028b\u0290\u0295\u02ac\u02b0"+
		"\u02b4\u02b9\u02be\u02c2\u02c5\u02ce\u02d3\u02d7\u02dd\u02e3\u02e8\u02ec"+
		"\u02ee\u02f2\u02f6\u02f8\u02fc\u0300\u0304\u0308\u0313\u0317\u031f\u0329"+
		"\u033a\u033e\u0342\u0347\u0349\u034d\u0352\u0356\u0358\u035c\u0369\u0370"+
		"\u037c\u037e\u0383\u03a5\u03a9\u03ad\u03b4\u03b7\u03bf\u03c2\u03d5\u03e5"+
		"\u03ea\u03f1\u03f9\u03fd\u0407\u0411\u0415\u0425\u042b\u0434\u043b\u0445"+
		"\u0448\u044b\u0452\u045d\u0465\u046b\u046f\u0473\u047b\u047f\u0487\u048f"+
		"\u0493\u0497\u049a\u049d\u04a0\u04a3\u04ad\u04b2\u04b8\u04be\u04c6\u04cd"+
		"\u04d4\u04dc\u04e7\u04eb\u04f1\u04fd\u0500\u0506\u050a\u0511\u0513\u051a"+
		"\u052d\u0534\u053b\u0542\u055a\u0561\u0567\u056b\u056f\u0574\u0579\u057f"+
		"\u0583\u0587\u058c\u0591\u0598\u059c\u05a3\u05aa\u05ac\u05b0\u05b4\u05bb"+
		"\u05c0\u05c4\u05c8\u05d1\u05d6\u05df\u05f2\u05fe\u0602\u060a\u0614\u061b"+
		"\u0623\u0627\u062f\u0636\u0641\u0648\u0652\u065b\u0663\u066a\u0676\u067b"+
		"\u067e\u0689\u068d\u0695\u069c\u069f\u06a3\u06ab\u06ad\u06b0\u06b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}