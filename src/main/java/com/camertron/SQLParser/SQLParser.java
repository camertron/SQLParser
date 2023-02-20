// Generated from SQLParser.g4 by ANTLR 4.2
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
		AS=1, ALL=2, AND=3, ANY=4, ASYMMETRIC=5, ASC=6, BOTH=7, CASE=8, CAST=9, 
		CREATE=10, CROSS=11, CURRENT_DATE=12, CURRENT_TIME=13, CURRENT_TIMESTAMP=14, 
		DESC=15, DISTINCT=16, END=17, ELSE=18, EXCEPT=19, FALSE=20, FULL=21, FROM=22, 
		GROUP=23, HAVING=24, ILIKE=25, IN=26, INNER=27, INTERSECT=28, INTO=29, 
		IS=30, JOIN=31, LEADING=32, LEFT=33, LIKE=34, LIMIT=35, NATURAL=36, NOT=37, 
		NULL=38, NULLS=39, ON=40, OR=41, ORDER=42, OUTER=43, OVER=44, RIGHT=45, 
		SELECT=46, SOME=47, SYMMETRIC=48, TABLE=49, THEN=50, TRAILING=51, TRUE=52, 
		UNION=53, UNIQUE=54, USING=55, WHEN=56, WHERE=57, WITH=58, WINDOW=59, 
		AVG=60, ADD=61, ALTER=62, BETWEEN=63, BY=64, CATALOG=65, CENTURY=66, CHARACTER=67, 
		COLLECT=68, COALESCE=69, COLUMN=70, COUNT=71, CUBE=72, CUME_DIST=73, CURRENT=74, 
		DAY=75, DEFAULT=76, DATABASE=77, DEC=78, DECADE=79, DENSE_RANK=80, DOW=81, 
		DOY=82, DROP=83, EPOCH=84, EVERY=85, EXCLUDE=86, EXISTS=87, EXPLAIN=88, 
		EXTERNAL=89, EXTRACT=90, FILTER=91, FIRST=92, FIRST_VALUE=93, FOLLOWING=94, 
		FORMAT=95, FUSION=96, GLOBAL=97, GROUPING=98, HASH=99, HOUR=100, IF=101, 
		INDEX=102, INSERT=103, INTERSECTION=104, ISODOW=105, ISOYEAR=106, LAG=107, 
		LAST=108, LAST_VALUE=109, LEAD=110, LESS=111, LIST=112, LOCATION=113, 
		MAX=114, MAXVALUE=115, MICROSECONDS=116, MILLENNIUM=117, MILLISECONDS=118, 
		MIN=119, MINUTE=120, MONTH=121, NATIONAL=122, NULLIF=123, NO=124, OVERWRITE=125, 
		OTHERS=126, PARTITION=127, PARTITIONS=128, PERCENT_RANK=129, PRECEDING=130, 
		PRECISION=131, PURGE=132, PROPERTY=133, QUARTER=134, RANGE=135, RANK=136, 
		REGEXP=137, RENAME=138, REPAIR=139, RESET=140, RLIKE=141, ROLLUP=142, 
		ROW=143, ROWS=144, ROW_NUMBER=145, SECOND=146, SESSION=147, SET=148, SIMILAR=149, 
		STDDEV_POP=150, STDDEV_SAMP=151, SUBPARTITION=152, SUM=153, TABLESPACE=154, 
		THAN=155, TIES=156, TIMEZONE=157, TIMEZONE_HOUR=158, TIMEZONE_MINUTE=159, 
		TRIM=160, TO=161, TRUNCATE=162, UNBOUNDED=163, UNKNOWN=164, UNSET=165, 
		VALUES=166, VAR_SAMP=167, VAR_POP=168, VARYING=169, WEEK=170, YEAR=171, 
		ZONE=172, BOOLEAN=173, BOOL=174, BIT=175, VARBIT=176, INT1=177, INT2=178, 
		INT4=179, INT8=180, TINYINT=181, SMALLINT=182, INT=183, INTEGER=184, BIGINT=185, 
		FLOAT4=186, FLOAT8=187, REAL=188, FLOAT=189, DOUBLE=190, NUMERIC=191, 
		DECIMAL=192, CHAR=193, VARCHAR=194, NCHAR=195, NVARCHAR=196, DATE=197, 
		INTERVAL=198, TIME=199, TIMETZ=200, TIMESTAMP=201, TIMESTAMPTZ=202, TEXT=203, 
		BINARY=204, VARBINARY=205, BLOB=206, BYTEA=207, ARRAY=208, MAP=209, RECORD=210, 
		Similar_To=211, Not_Similar_To=212, Similar_To_Case_Insensitive=213, Not_Similar_To_Case_Insensitive=214, 
		CAST_EXPRESSION=215, ASSIGN=216, EQUAL=217, COLON=218, SEMI_COLON=219, 
		COMMA=220, CONCATENATION_OPERATOR=221, NOT_EQUAL=222, LTH=223, LEQ=224, 
		GTH=225, GEQ=226, LEFT_PAREN=227, RIGHT_PAREN=228, PLUS=229, MINUS=230, 
		MULTIPLY=231, DIVIDE=232, MODULAR=233, DOT=234, UNDERLINE=235, VERTICAL_BAR=236, 
		QUOTE=237, DOUBLE_QUOTE=238, INFIX_OPERATOR=239, JSON_GET_VALUE=240, JSON_GET_ELEMENT_AS_TEXT=241, 
		JSON_GET_OBJECT=242, JSON_GET_OBJECT_AS_TEXT=243, JSONB_CONTAINS_RIGHT=244, 
		JSONB_CONTAINS_LEFT=245, JSONB_CONTAINS_STRING=246, JSONB_CONTAINS_STRING_ANY=247, 
		JSONB_CONTAINS_STRING_ALL=248, JSONB_CONCAT=249, JSONB_DELETE=250, NUMBER=251, 
		REAL_NUMBER=252, BlockComment=253, LineComment=254, Regular_Identifier=255, 
		Quoted_Identifier=256, Character_String_Literal=257, Space=258, White_Space=259, 
		BAD=260, INET4=261;
	public static final String[] tokenNames = {
		"<INVALID>", "AS", "ALL", "AND", "ANY", "ASYMMETRIC", "ASC", "BOTH", "CASE", 
		"CAST", "CREATE", "CROSS", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
		"DESC", "DISTINCT", "END", "ELSE", "EXCEPT", "FALSE", "FULL", "FROM", 
		"GROUP", "HAVING", "ILIKE", "IN", "INNER", "INTERSECT", "INTO", "IS", 
		"JOIN", "LEADING", "LEFT", "LIKE", "LIMIT", "NATURAL", "NOT", "NULL", 
		"NULLS", "ON", "OR", "ORDER", "OUTER", "OVER", "RIGHT", "SELECT", "SOME", 
		"SYMMETRIC", "TABLE", "THEN", "TRAILING", "TRUE", "UNION", "UNIQUE", "USING", 
		"WHEN", "WHERE", "WITH", "WINDOW", "AVG", "ADD", "ALTER", "BETWEEN", "BY", 
		"CATALOG", "CENTURY", "CHARACTER", "COLLECT", "COALESCE", "COLUMN", "COUNT", 
		"CUBE", "CUME_DIST", "CURRENT", "DAY", "DEFAULT", "DATABASE", "DEC", "DECADE", 
		"DENSE_RANK", "DOW", "DOY", "DROP", "EPOCH", "EVERY", "EXCLUDE", "EXISTS", 
		"EXPLAIN", "EXTERNAL", "EXTRACT", "FILTER", "FIRST", "FIRST_VALUE", "FOLLOWING", 
		"FORMAT", "FUSION", "GLOBAL", "GROUPING", "HASH", "HOUR", "IF", "INDEX", 
		"INSERT", "INTERSECTION", "ISODOW", "ISOYEAR", "LAG", "LAST", "LAST_VALUE", 
		"LEAD", "LESS", "LIST", "LOCATION", "MAX", "MAXVALUE", "MICROSECONDS", 
		"MILLENNIUM", "MILLISECONDS", "MIN", "MINUTE", "MONTH", "NATIONAL", "NULLIF", 
		"NO", "OVERWRITE", "OTHERS", "PARTITION", "PARTITIONS", "PERCENT_RANK", 
		"PRECEDING", "PRECISION", "PURGE", "PROPERTY", "QUARTER", "RANGE", "RANK", 
		"REGEXP", "RENAME", "REPAIR", "RESET", "RLIKE", "ROLLUP", "ROW", "ROWS", 
		"ROW_NUMBER", "SECOND", "SESSION", "SET", "SIMILAR", "STDDEV_POP", "STDDEV_SAMP", 
		"SUBPARTITION", "SUM", "TABLESPACE", "THAN", "TIES", "TIMEZONE", "TIMEZONE_HOUR", 
		"TIMEZONE_MINUTE", "TRIM", "TO", "TRUNCATE", "UNBOUNDED", "UNKNOWN", "UNSET", 
		"VALUES", "VAR_SAMP", "VAR_POP", "VARYING", "WEEK", "YEAR", "ZONE", "BOOLEAN", 
		"BOOL", "BIT", "VARBIT", "INT1", "INT2", "INT4", "INT8", "TINYINT", "SMALLINT", 
		"INT", "INTEGER", "BIGINT", "FLOAT4", "FLOAT8", "REAL", "FLOAT", "DOUBLE", 
		"NUMERIC", "DECIMAL", "CHAR", "VARCHAR", "NCHAR", "NVARCHAR", "DATE", 
		"INTERVAL", "TIME", "TIMETZ", "TIMESTAMP", "TIMESTAMPTZ", "TEXT", "BINARY", 
		"VARBINARY", "BLOB", "BYTEA", "ARRAY", "MAP", "RECORD", "'~'", "'!~'", 
		"'~*'", "'!~*'", "CAST_EXPRESSION", "':='", "'='", "':'", "';'", "','", 
		"CONCATENATION_OPERATOR", "NOT_EQUAL", "'<'", "'<='", "'>'", "'>='", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'.'", "'_'", "'|'", "'''", 
		"'\"'", "INFIX_OPERATOR", "'->'", "'->>'", "'#>'", "'#>>'", "'@>'", "'<@'", 
		"'?'", "'?|'", "'?&'", "'||'", "'#-'", "NUMBER", "REAL_NUMBER", "BlockComment", 
		"LineComment", "Regular_Identifier", "Quoted_Identifier", "Character_String_Literal", 
		"' '", "White_Space", "BAD", "INET4"
	};
	public static final int
		RULE_sql = 0, RULE_explain_clause = 1, RULE_statement = 2, RULE_session_statement = 3, 
		RULE_data_statement = 4, RULE_data_change_statement = 5, RULE_schema_statement = 6, 
		RULE_index_statement = 7, RULE_create_index_statement = 8, RULE_drop_index_statement = 9, 
		RULE_database_definition = 10, RULE_if_not_exists = 11, RULE_drop_database_statement = 12, 
		RULE_if_exists = 13, RULE_create_table_statement = 14, RULE_table_elements = 15, 
		RULE_field_element = 16, RULE_field_type = 17, RULE_param_clause = 18, 
		RULE_param = 19, RULE_method_specifier = 20, RULE_table_space_specifier = 21, 
		RULE_table_space_name = 22, RULE_table_partitioning_clauses = 23, RULE_range_partitions = 24, 
		RULE_range_value_clause_list = 25, RULE_range_value_clause = 26, RULE_hash_partitions = 27, 
		RULE_individual_hash_partitions = 28, RULE_individual_hash_partition = 29, 
		RULE_hash_partitions_by_quantity = 30, RULE_list_partitions = 31, RULE_list_value_clause_list = 32, 
		RULE_list_value_partition = 33, RULE_column_partitions = 34, RULE_partition_name = 35, 
		RULE_truncate_table_statement = 36, RULE_drop_table_statement = 37, RULE_identifier = 38, 
		RULE_nonreserved_keywords = 39, RULE_unsigned_literal = 40, RULE_general_literal = 41, 
		RULE_datetime_literal = 42, RULE_time_literal = 43, RULE_timestamp_literal = 44, 
		RULE_date_literal = 45, RULE_interval_literal = 46, RULE_primary_or_extended_datetime_literal = 47, 
		RULE_boolean_literal = 48, RULE_data_type = 49, RULE_predefined_type = 50, 
		RULE_character_string_type = 51, RULE_type_length = 52, RULE_national_character_string_type = 53, 
		RULE_binary_large_object_string_type = 54, RULE_numeric_type = 55, RULE_exact_numeric_type = 56, 
		RULE_approximate_numeric_type = 57, RULE_precision_param = 58, RULE_boolean_type = 59, 
		RULE_datetime_type = 60, RULE_bit_type = 61, RULE_binary_type = 62, RULE_complex_type = 63, 
		RULE_array_type = 64, RULE_record_type = 65, RULE_map_type = 66, RULE_value_expression_primary = 67, 
		RULE_parenthesized_value_expression = 68, RULE_nonparenthesized_value_expression_primary = 69, 
		RULE_unsigned_value_specification = 70, RULE_unsigned_numeric_literal = 71, 
		RULE_signed_numerical_literal = 72, RULE_set_function_specification = 73, 
		RULE_aggregate_function = 74, RULE_general_set_function = 75, RULE_set_function_type = 76, 
		RULE_filter_clause = 77, RULE_grouping_operation = 78, RULE_window_function = 79, 
		RULE_window_function_type = 80, RULE_rank_function_type = 81, RULE_window_name_or_specification = 82, 
		RULE_case_expression = 83, RULE_case_abbreviation = 84, RULE_case_specification = 85, 
		RULE_simple_case = 86, RULE_searched_case = 87, RULE_simple_when_clause = 88, 
		RULE_searched_when_clause = 89, RULE_else_clause = 90, RULE_result = 91, 
		RULE_cast_specification = 92, RULE_cast_operand = 93, RULE_cast_target = 94, 
		RULE_value_expression = 95, RULE_common_value_expression = 96, RULE_numeric_value_expression = 97, 
		RULE_term = 98, RULE_factor = 99, RULE_numeric_primary = 100, RULE_sign = 101, 
		RULE_numeric_value_function = 102, RULE_extract_expression = 103, RULE_extract_field = 104, 
		RULE_time_zone_field = 105, RULE_extract_source = 106, RULE_string_value_expression = 107, 
		RULE_character_value_expression = 108, RULE_character_factor = 109, RULE_character_primary = 110, 
		RULE_string_value_function = 111, RULE_trim_function = 112, RULE_trim_operands = 113, 
		RULE_trim_specification = 114, RULE_datetime_value_expression = 115, RULE_datetime_term = 116, 
		RULE_datetime_factor = 117, RULE_datetime_primary = 118, RULE_datetime_value_function = 119, 
		RULE_current_date_value_function = 120, RULE_current_time_value_function = 121, 
		RULE_current_timestamp_value_function = 122, RULE_boolean_value_expression = 123, 
		RULE_or_predicate = 124, RULE_and_predicate = 125, RULE_boolean_factor = 126, 
		RULE_boolean_test = 127, RULE_is_clause = 128, RULE_truth_value = 129, 
		RULE_boolean_primary = 130, RULE_boolean_predicand = 131, RULE_parenthesized_boolean_value_expression = 132, 
		RULE_row_value_expression = 133, RULE_explicit_row_value_constructor = 134, 
		RULE_row_value_predicand = 135, RULE_row_value_constructor_predicand = 136, 
		RULE_row_value_special_case = 137, RULE_table_expression = 138, RULE_from_clause = 139, 
		RULE_table_reference_list = 140, RULE_table_reference = 141, RULE_joined_table = 142, 
		RULE_joined_table_primary = 143, RULE_cross_join = 144, RULE_qualified_join = 145, 
		RULE_natural_join = 146, RULE_union_join = 147, RULE_join_type = 148, 
		RULE_outer_join_type = 149, RULE_outer_join_type_part2 = 150, RULE_join_specification = 151, 
		RULE_join_condition = 152, RULE_named_columns_join = 153, RULE_table_primary = 154, 
		RULE_column_name_list = 155, RULE_derived_table = 156, RULE_where_clause = 157, 
		RULE_search_condition = 158, RULE_groupby_clause = 159, RULE_grouping_element_list = 160, 
		RULE_grouping_element = 161, RULE_ordinary_grouping_set = 162, RULE_ordinary_grouping_set_list = 163, 
		RULE_rollup_list = 164, RULE_cube_list = 165, RULE_empty_grouping_set = 166, 
		RULE_having_clause = 167, RULE_row_value_predicand_list = 168, RULE_window_clause = 169, 
		RULE_window_definition_list = 170, RULE_window_definition = 171, RULE_window_name = 172, 
		RULE_window_specification = 173, RULE_window_specification_details = 174, 
		RULE_existing_window_name = 175, RULE_window_partition_clause = 176, RULE_window_order_clause = 177, 
		RULE_window_frame_clause = 178, RULE_window_frame_units = 179, RULE_window_frame_extent = 180, 
		RULE_window_frame_start_bound = 181, RULE_window_frame_between = 182, 
		RULE_window_frame_end_bound = 183, RULE_window_frame_exclusion = 184, 
		RULE_query_expression = 185, RULE_query_expression_body = 186, RULE_non_join_query_expression = 187, 
		RULE_query_term = 188, RULE_non_join_query_term = 189, RULE_query_primary = 190, 
		RULE_non_join_query_primary = 191, RULE_simple_table = 192, RULE_explicit_table = 193, 
		RULE_table_or_query_name = 194, RULE_table_name = 195, RULE_column_name = 196, 
		RULE_query_specification = 197, RULE_select_list = 198, RULE_select_sublist = 199, 
		RULE_derived_column = 200, RULE_qualified_asterisk = 201, RULE_asterisk = 202, 
		RULE_set_qualifier = 203, RULE_column_reference = 204, RULE_as_clause = 205, 
		RULE_column_reference_list = 206, RULE_scalar_subquery = 207, RULE_row_subquery = 208, 
		RULE_table_subquery = 209, RULE_subquery = 210, RULE_predicate = 211, 
		RULE_comparison_predicate = 212, RULE_comp_op = 213, RULE_between_predicate = 214, 
		RULE_between_predicate_part_2 = 215, RULE_in_predicate = 216, RULE_in_predicate_value = 217, 
		RULE_in_value_list = 218, RULE_pattern_matching_predicate = 219, RULE_pattern_matcher = 220, 
		RULE_negativable_matcher = 221, RULE_regex_matcher = 222, RULE_null_predicate = 223, 
		RULE_quantified_comparison_predicate = 224, RULE_quantifier = 225, RULE_all = 226, 
		RULE_some = 227, RULE_exists_predicate = 228, RULE_unique_predicate = 229, 
		RULE_primary_datetime_field = 230, RULE_non_second_primary_datetime_field = 231, 
		RULE_extended_datetime_field = 232, RULE_routine_invocation = 233, RULE_function_names_for_reserved_words = 234, 
		RULE_function_name = 235, RULE_sql_argument_list = 236, RULE_orderby_clause = 237, 
		RULE_sort_specifier_list = 238, RULE_sort_specifier = 239, RULE_order_specification = 240, 
		RULE_limit_clause = 241, RULE_null_ordering = 242, RULE_insert_statement = 243, 
		RULE_alter_tablespace_statement = 244, RULE_alter_table_statement = 245, 
		RULE_partition_column_value_list = 246, RULE_partition_column_value = 247, 
		RULE_property_list = 248, RULE_property = 249, RULE_property_key_list = 250, 
		RULE_property_key = 251;
	public static final String[] ruleNames = {
		"sql", "explain_clause", "statement", "session_statement", "data_statement", 
		"data_change_statement", "schema_statement", "index_statement", "create_index_statement", 
		"drop_index_statement", "database_definition", "if_not_exists", "drop_database_statement", 
		"if_exists", "create_table_statement", "table_elements", "field_element", 
		"field_type", "param_clause", "param", "method_specifier", "table_space_specifier", 
		"table_space_name", "table_partitioning_clauses", "range_partitions", 
		"range_value_clause_list", "range_value_clause", "hash_partitions", "individual_hash_partitions", 
		"individual_hash_partition", "hash_partitions_by_quantity", "list_partitions", 
		"list_value_clause_list", "list_value_partition", "column_partitions", 
		"partition_name", "truncate_table_statement", "drop_table_statement", 
		"identifier", "nonreserved_keywords", "unsigned_literal", "general_literal", 
		"datetime_literal", "time_literal", "timestamp_literal", "date_literal", 
		"interval_literal", "primary_or_extended_datetime_literal", "boolean_literal", 
		"data_type", "predefined_type", "character_string_type", "type_length", 
		"national_character_string_type", "binary_large_object_string_type", "numeric_type", 
		"exact_numeric_type", "approximate_numeric_type", "precision_param", "boolean_type", 
		"datetime_type", "bit_type", "binary_type", "complex_type", "array_type", 
		"record_type", "map_type", "value_expression_primary", "parenthesized_value_expression", 
		"nonparenthesized_value_expression_primary", "unsigned_value_specification", 
		"unsigned_numeric_literal", "signed_numerical_literal", "set_function_specification", 
		"aggregate_function", "general_set_function", "set_function_type", "filter_clause", 
		"grouping_operation", "window_function", "window_function_type", "rank_function_type", 
		"window_name_or_specification", "case_expression", "case_abbreviation", 
		"case_specification", "simple_case", "searched_case", "simple_when_clause", 
		"searched_when_clause", "else_clause", "result", "cast_specification", 
		"cast_operand", "cast_target", "value_expression", "common_value_expression", 
		"numeric_value_expression", "term", "factor", "numeric_primary", "sign", 
		"numeric_value_function", "extract_expression", "extract_field", "time_zone_field", 
		"extract_source", "string_value_expression", "character_value_expression", 
		"character_factor", "character_primary", "string_value_function", "trim_function", 
		"trim_operands", "trim_specification", "datetime_value_expression", "datetime_term", 
		"datetime_factor", "datetime_primary", "datetime_value_function", "current_date_value_function", 
		"current_time_value_function", "current_timestamp_value_function", "boolean_value_expression", 
		"or_predicate", "and_predicate", "boolean_factor", "boolean_test", "is_clause", 
		"truth_value", "boolean_primary", "boolean_predicand", "parenthesized_boolean_value_expression", 
		"row_value_expression", "explicit_row_value_constructor", "row_value_predicand", 
		"row_value_constructor_predicand", "row_value_special_case", "table_expression", 
		"from_clause", "table_reference_list", "table_reference", "joined_table", 
		"joined_table_primary", "cross_join", "qualified_join", "natural_join", 
		"union_join", "join_type", "outer_join_type", "outer_join_type_part2", 
		"join_specification", "join_condition", "named_columns_join", "table_primary", 
		"column_name_list", "derived_table", "where_clause", "search_condition", 
		"groupby_clause", "grouping_element_list", "grouping_element", "ordinary_grouping_set", 
		"ordinary_grouping_set_list", "rollup_list", "cube_list", "empty_grouping_set", 
		"having_clause", "row_value_predicand_list", "window_clause", "window_definition_list", 
		"window_definition", "window_name", "window_specification", "window_specification_details", 
		"existing_window_name", "window_partition_clause", "window_order_clause", 
		"window_frame_clause", "window_frame_units", "window_frame_extent", "window_frame_start_bound", 
		"window_frame_between", "window_frame_end_bound", "window_frame_exclusion", 
		"query_expression", "query_expression_body", "non_join_query_expression", 
		"query_term", "non_join_query_term", "query_primary", "non_join_query_primary", 
		"simple_table", "explicit_table", "table_or_query_name", "table_name", 
		"column_name", "query_specification", "select_list", "select_sublist", 
		"derived_column", "qualified_asterisk", "asterisk", "set_qualifier", "column_reference", 
		"as_clause", "column_reference_list", "scalar_subquery", "row_subquery", 
		"table_subquery", "subquery", "predicate", "comparison_predicate", "comp_op", 
		"between_predicate", "between_predicate_part_2", "in_predicate", "in_predicate_value", 
		"in_value_list", "pattern_matching_predicate", "pattern_matcher", "negativable_matcher", 
		"regex_matcher", "null_predicate", "quantified_comparison_predicate", 
		"quantifier", "all", "some", "exists_predicate", "unique_predicate", "primary_datetime_field", 
		"non_second_primary_datetime_field", "extended_datetime_field", "routine_invocation", 
		"function_names_for_reserved_words", "function_name", "sql_argument_list", 
		"orderby_clause", "sort_specifier_list", "sort_specifier", "order_specification", 
		"limit_clause", "null_ordering", "insert_statement", "alter_tablespace_statement", 
		"alter_table_statement", "partition_column_value_list", "partition_column_value", 
		"property_list", "property", "property_key_list", "property_key"
	};

	@Override
	public String getGrammarFileName() { return "SQLParser.g4"; }

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
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public TerminalNode SEMI_COLON() { return getToken(SQLParser.SEMI_COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Explain_clauseContext explain_clause() {
			return getRuleContext(Explain_clauseContext.class,0);
		}
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
			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(504); explain_clause();
				}
				break;
			}
			setState(507); statement();
			setState(509);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(508); match(SEMI_COLON);
				}
			}

			setState(511); match(EOF);
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

	public static class Explain_clauseContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(SQLParser.GLOBAL, 0); }
		public TerminalNode EXPLAIN() { return getToken(SQLParser.EXPLAIN, 0); }
		public Explain_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExplain_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExplain_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExplain_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explain_clauseContext explain_clause() throws RecognitionException {
		Explain_clauseContext _localctx = new Explain_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_explain_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); match(EXPLAIN);
			setState(515);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(514); match(GLOBAL);
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

	public static class StatementContext extends ParserRuleContext {
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Session_statementContext session_statement() {
			return getRuleContext(Session_statementContext.class,0);
		}
		public Data_change_statementContext data_change_statement() {
			return getRuleContext(Data_change_statementContext.class,0);
		}
		public Schema_statementContext schema_statement() {
			return getRuleContext(Schema_statementContext.class,0);
		}
		public Index_statementContext index_statement() {
			return getRuleContext(Index_statementContext.class,0);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(522);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517); session_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518); data_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(519); data_change_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(520); schema_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(521); index_statement();
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

	public static class Session_statementContext extends ParserRuleContext {
		public IdentifierContext dbname;
		public IdentifierContext name;
		public TerminalNode ZONE() { return getToken(SQLParser.ZONE, 0); }
		public TerminalNode RESET() { return getToken(SQLParser.RESET, 0); }
		public TerminalNode TIME() { return getToken(SQLParser.TIME, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Signed_numerical_literalContext signed_numerical_literal() {
			return getRuleContext(Signed_numerical_literalContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public TerminalNode CATALOG() { return getToken(SQLParser.CATALOG, 0); }
		public TerminalNode SESSION() { return getToken(SQLParser.SESSION, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Session_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_session_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSession_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSession_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSession_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Session_statementContext session_statement() throws RecognitionException {
		Session_statementContext _localctx = new Session_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_session_statement);
		int _la;
		try {
			setState(554);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524); match(SET);
				setState(525); match(CATALOG);
				setState(526); ((Session_statementContext)_localctx).dbname = identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527); match(SET);
				setState(528); match(TIME);
				setState(529); match(ZONE);
				setState(531);
				_la = _input.LA(1);
				if (_la==TO || _la==EQUAL) {
					{
					setState(530);
					_la = _input.LA(1);
					if ( !(_la==TO || _la==EQUAL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(536);
				switch (_input.LA(1)) {
				case Character_String_Literal:
					{
					setState(533); match(Character_String_Literal);
					}
					break;
				case PLUS:
				case MINUS:
				case NUMBER:
				case REAL_NUMBER:
					{
					setState(534); signed_numerical_literal();
					}
					break;
				case DEFAULT:
					{
					setState(535); match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(538); match(SET);
				setState(540);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(539); match(SESSION);
					}
					break;
				}
				setState(542); ((Session_statementContext)_localctx).name = identifier();
				setState(544);
				_la = _input.LA(1);
				if (_la==TO || _la==EQUAL) {
					{
					setState(543);
					_la = _input.LA(1);
					if ( !(_la==TO || _la==EQUAL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(550);
				switch (_input.LA(1)) {
				case Character_String_Literal:
					{
					setState(546); match(Character_String_Literal);
					}
					break;
				case PLUS:
				case MINUS:
				case NUMBER:
				case REAL_NUMBER:
					{
					setState(547); signed_numerical_literal();
					}
					break;
				case FALSE:
				case TRUE:
				case UNKNOWN:
					{
					setState(548); boolean_literal();
					}
					break;
				case DEFAULT:
					{
					setState(549); match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(552); match(RESET);
				setState(553); ((Session_statementContext)_localctx).name = identifier();
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
		enterRule(_localctx, 8, RULE_data_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); query_expression();
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
		enterRule(_localctx, 10, RULE_data_change_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); insert_statement();
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
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Alter_tablespace_statementContext alter_tablespace_statement() {
			return getRuleContext(Alter_tablespace_statementContext.class,0);
		}
		public Database_definitionContext database_definition() {
			return getRuleContext(Database_definitionContext.class,0);
		}
		public Drop_database_statementContext drop_database_statement() {
			return getRuleContext(Drop_database_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Truncate_table_statementContext truncate_table_statement() {
			return getRuleContext(Truncate_table_statementContext.class,0);
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
		enterRule(_localctx, 12, RULE_schema_statement);
		try {
			setState(567);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560); database_definition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561); drop_database_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562); create_table_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(563); drop_table_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(564); alter_tablespace_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(565); alter_table_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(566); truncate_table_statement();
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

	public static class Index_statementContext extends ParserRuleContext {
		public Create_index_statementContext create_index_statement() {
			return getRuleContext(Create_index_statementContext.class,0);
		}
		public Drop_index_statementContext drop_index_statement() {
			return getRuleContext(Drop_index_statementContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_index_statement);
		try {
			setState(571);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(569); create_index_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(570); drop_index_statement();
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

	public static class Create_index_statementContext extends ParserRuleContext {
		public Token u;
		public IdentifierContext index_name;
		public Token path;
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public Sort_specifier_listContext sort_specifier_list() {
			return getRuleContext(Sort_specifier_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Param_clauseContext param_clause() {
			return getRuleContext(Param_clauseContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Method_specifierContext method_specifier() {
			return getRuleContext(Method_specifierContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Create_index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCreate_index_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCreate_index_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCreate_index_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_statementContext create_index_statement() throws RecognitionException {
		Create_index_statementContext _localctx = new Create_index_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_index_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(CREATE);
			setState(575);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(574); ((Create_index_statementContext)_localctx).u = match(UNIQUE);
				}
			}

			setState(577); match(INDEX);
			setState(578); ((Create_index_statementContext)_localctx).index_name = identifier();
			setState(579); match(ON);
			setState(580); table_name();
			setState(582);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(581); method_specifier();
				}
			}

			setState(584); match(LEFT_PAREN);
			setState(585); sort_specifier_list();
			setState(586); match(RIGHT_PAREN);
			setState(588);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(587); param_clause();
				}
			}

			setState(591);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(590); where_clause();
				}
			}

			setState(595);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(593); match(LOCATION);
				setState(594); ((Create_index_statementContext)_localctx).path = match(Character_String_Literal);
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

	public static class Drop_index_statementContext extends ParserRuleContext {
		public IdentifierContext index_name;
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Drop_index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDrop_index_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDrop_index_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDrop_index_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_statementContext drop_index_statement() throws RecognitionException {
		Drop_index_statementContext _localctx = new Drop_index_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_drop_index_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(DROP);
			setState(598); match(INDEX);
			setState(599); ((Drop_index_statementContext)_localctx).index_name = identifier();
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

	public static class Database_definitionContext extends ParserRuleContext {
		public IdentifierContext dbname;
		public If_not_existsContext if_not_exists() {
			return getRuleContext(If_not_existsContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(SQLParser.DATABASE, 0); }
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Database_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatabase_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatabase_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatabase_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_definitionContext database_definition() throws RecognitionException {
		Database_definitionContext _localctx = new Database_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_database_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(CREATE);
			setState(602); match(DATABASE);
			setState(604);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(603); if_not_exists();
				}
			}

			setState(606); ((Database_definitionContext)_localctx).dbname = identifier();
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

	public static class If_not_existsContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public If_not_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_not_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIf_not_exists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIf_not_exists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIf_not_exists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_not_existsContext if_not_exists() throws RecognitionException {
		If_not_existsContext _localctx = new If_not_existsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_not_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); match(IF);
			setState(609); match(NOT);
			setState(610); match(EXISTS);
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

	public static class Drop_database_statementContext extends ParserRuleContext {
		public IdentifierContext dbname;
		public If_existsContext if_exists() {
			return getRuleContext(If_existsContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(SQLParser.DATABASE, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Drop_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDrop_database_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDrop_database_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDrop_database_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_database_statementContext drop_database_statement() throws RecognitionException {
		Drop_database_statementContext _localctx = new Drop_database_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); match(DROP);
			setState(613); match(DATABASE);
			setState(615);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(614); if_exists();
				}
			}

			setState(617); ((Drop_database_statementContext)_localctx).dbname = identifier();
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

	public static class If_existsContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public If_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIf_exists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIf_exists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIf_exists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_existsContext if_exists() throws RecognitionException {
		If_existsContext _localctx = new If_existsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); match(IF);
			setState(620); match(EXISTS);
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
		public IdentifierContext spacename;
		public IdentifierContext storage_type;
		public Token uri;
		public Table_nameContext like_table_name;
		public TerminalNode TABLESPACE() { return getToken(SQLParser.TABLESPACE, 0); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLParser.EXTERNAL, 0); }
		public Table_elementsContext table_elements() {
			return getRuleContext(Table_elementsContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Param_clauseContext param_clause() {
			return getRuleContext(Param_clauseContext.class,0);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public If_not_existsContext if_not_exists() {
			return getRuleContext(If_not_existsContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode LIKE() { return getToken(SQLParser.LIKE, 0); }
		public Table_partitioning_clausesContext table_partitioning_clauses() {
			return getRuleContext(Table_partitioning_clausesContext.class,0);
		}
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
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
		enterRule(_localctx, 28, RULE_create_table_statement);
		int _la;
		try {
			setState(703);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622); match(CREATE);
				setState(623); match(EXTERNAL);
				setState(624); match(TABLE);
				setState(626);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(625); if_not_exists();
					}
				}

				setState(628); table_name();
				setState(629); table_elements();
				setState(632);
				_la = _input.LA(1);
				if (_la==TABLESPACE) {
					{
					setState(630); match(TABLESPACE);
					setState(631); ((Create_table_statementContext)_localctx).spacename = identifier();
					}
				}

				setState(634); match(USING);
				setState(635); ((Create_table_statementContext)_localctx).storage_type = identifier();
				setState(637);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(636); param_clause();
					}
				}

				setState(640);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(639); table_partitioning_clauses();
					}
				}

				setState(644);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(642); match(LOCATION);
					setState(643); ((Create_table_statementContext)_localctx).uri = match(Character_String_Literal);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646); match(CREATE);
				setState(647); match(TABLE);
				setState(649);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(648); if_not_exists();
					}
				}

				setState(651); table_name();
				setState(652); table_elements();
				setState(655);
				_la = _input.LA(1);
				if (_la==TABLESPACE) {
					{
					setState(653); match(TABLESPACE);
					setState(654); ((Create_table_statementContext)_localctx).spacename = identifier();
					}
				}

				setState(659);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(657); match(USING);
					setState(658); ((Create_table_statementContext)_localctx).storage_type = identifier();
					}
				}

				setState(662);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(661); param_clause();
					}
				}

				setState(665);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(664); table_partitioning_clauses();
					}
				}

				setState(669);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(667); match(AS);
					setState(668); query_expression();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671); match(CREATE);
				setState(672); match(TABLE);
				setState(674);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(673); if_not_exists();
					}
				}

				setState(676); table_name();
				setState(679);
				_la = _input.LA(1);
				if (_la==TABLESPACE) {
					{
					setState(677); match(TABLESPACE);
					setState(678); ((Create_table_statementContext)_localctx).spacename = identifier();
					}
				}

				setState(683);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(681); match(USING);
					setState(682); ((Create_table_statementContext)_localctx).storage_type = identifier();
					}
				}

				setState(686);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(685); param_clause();
					}
				}

				setState(689);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(688); table_partitioning_clauses();
					}
				}

				setState(691); match(AS);
				setState(692); query_expression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(694); match(CREATE);
				setState(695); match(TABLE);
				setState(697);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(696); if_not_exists();
					}
				}

				setState(699); table_name();
				setState(700); match(LIKE);
				setState(701); ((Create_table_statementContext)_localctx).like_table_name = table_name();
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
		public AsteriskContext asterisk() {
			return getRuleContext(AsteriskContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Field_elementContext field_element(int i) {
			return getRuleContext(Field_elementContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public List<Field_elementContext> field_element() {
			return getRuleContexts(Field_elementContext.class);
		}
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
		enterRule(_localctx, 30, RULE_table_elements);
		int _la;
		try {
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705); match(LEFT_PAREN);
				setState(706); field_element();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(707); match(COMMA);
					setState(708); field_element();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(714); match(RIGHT_PAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716); match(LEFT_PAREN);
				setState(717); asterisk();
				setState(718); match(RIGHT_PAREN);
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
		enterRule(_localctx, 32, RULE_field_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722); ((Field_elementContext)_localctx).name = identifier();
			setState(723); field_type();
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
		enterRule(_localctx, 34, RULE_field_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725); data_type();
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
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
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
		enterRule(_localctx, 36, RULE_param_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727); match(WITH);
			setState(728); match(LEFT_PAREN);
			setState(729); param();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(730); match(COMMA);
				setState(731); param();
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737); match(RIGHT_PAREN);
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
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); ((ParamContext)_localctx).key = match(Character_String_Literal);
			setState(740); match(EQUAL);
			setState(741); ((ParamContext)_localctx).value = numeric_value_expression();
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
		enterRule(_localctx, 40, RULE_method_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743); match(USING);
			setState(744); ((Method_specifierContext)_localctx).m = identifier();
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
		public TerminalNode TABLESPACE() { return getToken(SQLParser.TABLESPACE, 0); }
		public Table_space_nameContext table_space_name() {
			return getRuleContext(Table_space_nameContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_table_space_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746); match(TABLESPACE);
			setState(747); table_space_name();
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
		enterRule(_localctx, 44, RULE_table_space_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749); identifier();
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
		public Range_partitionsContext range_partitions() {
			return getRuleContext(Range_partitionsContext.class,0);
		}
		public List_partitionsContext list_partitions() {
			return getRuleContext(List_partitionsContext.class,0);
		}
		public Hash_partitionsContext hash_partitions() {
			return getRuleContext(Hash_partitionsContext.class,0);
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
		enterRule(_localctx, 46, RULE_table_partitioning_clauses);
		try {
			setState(755);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751); range_partitions();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752); hash_partitions();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753); list_partitions();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(754); column_partitions();
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
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public Range_value_clause_listContext range_value_clause_list() {
			return getRuleContext(Range_value_clause_listContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(SQLParser.RANGE, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
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
		enterRule(_localctx, 48, RULE_range_partitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); match(PARTITION);
			setState(758); match(BY);
			setState(759); match(RANGE);
			setState(760); match(LEFT_PAREN);
			setState(761); column_reference_list();
			setState(762); match(RIGHT_PAREN);
			setState(763); match(LEFT_PAREN);
			setState(764); range_value_clause_list();
			setState(765); match(RIGHT_PAREN);
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
		public List<Range_value_clauseContext> range_value_clause() {
			return getRuleContexts(Range_value_clauseContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
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
		enterRule(_localctx, 50, RULE_range_value_clause_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); range_value_clause();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(768); match(COMMA);
				setState(769); range_value_clause();
				}
				}
				setState(774);
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
		public TerminalNode LESS() { return getToken(SQLParser.LESS, 0); }
		public TerminalNode MAXVALUE() { return getToken(SQLParser.MAXVALUE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode THAN() { return getToken(SQLParser.THAN, 0); }
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
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
		enterRule(_localctx, 52, RULE_range_value_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775); match(PARTITION);
			setState(776); partition_name();
			setState(777); match(VALUES);
			setState(778); match(LESS);
			setState(779); match(THAN);
			setState(791);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(780); match(LEFT_PAREN);
				setState(781); value_expression();
				setState(782); match(RIGHT_PAREN);
				}
				break;

			case 2:
				{
				setState(785);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(784); match(LEFT_PAREN);
					}
				}

				setState(787); match(MAXVALUE);
				setState(789);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(788); match(RIGHT_PAREN);
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
		public Individual_hash_partitionsContext individual_hash_partitions() {
			return getRuleContext(Individual_hash_partitionsContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public Hash_partitions_by_quantityContext hash_partitions_by_quantity() {
			return getRuleContext(Hash_partitions_by_quantityContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public TerminalNode HASH() { return getToken(SQLParser.HASH, 0); }
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
		enterRule(_localctx, 54, RULE_hash_partitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793); match(PARTITION);
			setState(794); match(BY);
			setState(795); match(HASH);
			setState(796); match(LEFT_PAREN);
			setState(797); column_reference_list();
			setState(798); match(RIGHT_PAREN);
			setState(804);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(799); match(LEFT_PAREN);
				setState(800); individual_hash_partitions();
				setState(801); match(RIGHT_PAREN);
				}
				break;
			case PARTITIONS:
				{
				setState(803); hash_partitions_by_quantity();
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
		public Individual_hash_partitionContext individual_hash_partition(int i) {
			return getRuleContext(Individual_hash_partitionContext.class,i);
		}
		public List<Individual_hash_partitionContext> individual_hash_partition() {
			return getRuleContexts(Individual_hash_partitionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
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
		enterRule(_localctx, 56, RULE_individual_hash_partitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806); individual_hash_partition();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(807); match(COMMA);
				setState(808); individual_hash_partition();
				}
				}
				setState(813);
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
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_individual_hash_partition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); match(PARTITION);
			setState(815); partition_name();
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
		public TerminalNode PARTITIONS() { return getToken(SQLParser.PARTITIONS, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_hash_partitions_by_quantity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817); match(PARTITIONS);
			setState(818); ((Hash_partitions_by_quantityContext)_localctx).quantity = numeric_value_expression();
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
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public List_value_clause_listContext list_value_clause_list() {
			return getRuleContext(List_value_clause_listContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public TerminalNode LIST() { return getToken(SQLParser.LIST, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
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
		enterRule(_localctx, 62, RULE_list_partitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820); match(PARTITION);
			setState(821); match(BY);
			setState(822); match(LIST);
			setState(823); match(LEFT_PAREN);
			setState(824); column_reference_list();
			setState(825); match(RIGHT_PAREN);
			setState(826); match(LEFT_PAREN);
			setState(827); list_value_clause_list();
			setState(828); match(RIGHT_PAREN);
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
		public List_value_partitionContext list_value_partition(int i) {
			return getRuleContext(List_value_partitionContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<List_value_partitionContext> list_value_partition() {
			return getRuleContexts(List_value_partitionContext.class);
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
		enterRule(_localctx, 64, RULE_list_value_clause_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830); list_value_partition();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(831); match(COMMA);
				setState(832); list_value_partition();
				}
				}
				setState(837);
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public In_value_listContext in_value_list() {
			return getRuleContext(In_value_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
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
		enterRule(_localctx, 66, RULE_list_value_partition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838); match(PARTITION);
			setState(839); partition_name();
			setState(840); match(VALUES);
			setState(842);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(841); match(IN);
				}
			}

			setState(844); match(LEFT_PAREN);
			setState(845); in_value_list();
			setState(846); match(RIGHT_PAREN);
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
		public Table_elementsContext table_elements() {
			return getRuleContext(Table_elementsContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
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
		enterRule(_localctx, 68, RULE_column_partitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848); match(PARTITION);
			setState(849); match(BY);
			setState(850); match(COLUMN);
			setState(851); table_elements();
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
		enterRule(_localctx, 70, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853); identifier();
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

	public static class Truncate_table_statementContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SQLParser.TRUNCATE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Truncate_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTruncate_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTruncate_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTruncate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truncate_table_statementContext truncate_table_statement() throws RecognitionException {
		Truncate_table_statementContext _localctx = new Truncate_table_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_truncate_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855); match(TRUNCATE);
			setState(857);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(856); match(TABLE);
				}
			}

			setState(859); table_name();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(860); match(COMMA);
				setState(861); table_name();
				}
				}
				setState(866);
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

	public static class Drop_table_statementContext extends ParserRuleContext {
		public If_existsContext if_exists() {
			return getRuleContext(If_existsContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode PURGE() { return getToken(SQLParser.PURGE, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
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
		enterRule(_localctx, 74, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867); match(DROP);
			setState(868); match(TABLE);
			setState(870);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(869); if_exists();
				}
			}

			setState(872); table_name();
			setState(874);
			_la = _input.LA(1);
			if (_la==PURGE) {
				{
				setState(873); match(PURGE);
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
		public TerminalNode Quoted_Identifier() { return getToken(SQLParser.Quoted_Identifier, 0); }
		public TerminalNode Regular_Identifier() { return getToken(SQLParser.Regular_Identifier, 0); }
		public Nonreserved_keywordsContext nonreserved_keywords() {
			return getRuleContext(Nonreserved_keywordsContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_identifier);
		try {
			setState(879);
			switch (_input.LA(1)) {
			case Regular_Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(876); match(Regular_Identifier);
				}
				break;
			case AVG:
			case ADD:
			case ALTER:
			case BETWEEN:
			case BY:
			case CATALOG:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case DAY:
			case DEFAULT:
			case DEC:
			case DECADE:
			case DENSE_RANK:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
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
			case LAST_VALUE:
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
			case NO:
			case OVERWRITE:
			case OTHERS:
			case PARTITION:
			case PARTITIONS:
			case PERCENT_RANK:
			case PRECEDING:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case RANK:
			case REGEXP:
			case RENAME:
			case REPAIR:
			case RESET:
			case RLIKE:
			case ROLLUP:
			case ROW:
			case ROWS:
			case ROW_NUMBER:
			case SECOND:
			case SESSION:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIES:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNBOUNDED:
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
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case MAP:
			case RECORD:
			case INET4:
				enterOuterAlt(_localctx, 2);
				{
				setState(877); nonreserved_keywords();
				}
				break;
			case Quoted_Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(878); match(Quoted_Identifier);
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
		public TerminalNode TABLESPACE() { return getToken(SQLParser.TABLESPACE, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLParser.DECIMAL, 0); }
		public TerminalNode FLOAT4() { return getToken(SQLParser.FLOAT4, 0); }
		public TerminalNode MINUTE() { return getToken(SQLParser.MINUTE, 0); }
		public TerminalNode RESET() { return getToken(SQLParser.RESET, 0); }
		public TerminalNode INET4() { return getToken(SQLParser.INET4, 0); }
		public TerminalNode FUSION() { return getToken(SQLParser.FUSION, 0); }
		public TerminalNode TIME() { return getToken(SQLParser.TIME, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SQLParser.MILLISECONDS, 0); }
		public TerminalNode FIRST() { return getToken(SQLParser.FIRST, 0); }
		public TerminalNode OVERWRITE() { return getToken(SQLParser.OVERWRITE, 0); }
		public TerminalNode DEC() { return getToken(SQLParser.DEC, 0); }
		public TerminalNode INT8() { return getToken(SQLParser.INT8, 0); }
		public TerminalNode EXTRACT() { return getToken(SQLParser.EXTRACT, 0); }
		public TerminalNode PRECISION() { return getToken(SQLParser.PRECISION, 0); }
		public TerminalNode RECORD() { return getToken(SQLParser.RECORD, 0); }
		public TerminalNode SESSION() { return getToken(SQLParser.SESSION, 0); }
		public TerminalNode TIES() { return getToken(SQLParser.TIES, 0); }
		public TerminalNode MILLENNIUM() { return getToken(SQLParser.MILLENNIUM, 0); }
		public TerminalNode MIN() { return getToken(SQLParser.MIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLParser.EXTERNAL, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode OTHERS() { return getToken(SQLParser.OTHERS, 0); }
		public TerminalNode CENTURY() { return getToken(SQLParser.CENTURY, 0); }
		public TerminalNode TIMETZ() { return getToken(SQLParser.TIMETZ, 0); }
		public TerminalNode AVG() { return getToken(SQLParser.AVG, 0); }
		public TerminalNode DOUBLE() { return getToken(SQLParser.DOUBLE, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
		public TerminalNode COALESCE() { return getToken(SQLParser.COALESCE, 0); }
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public TerminalNode CUME_DIST() { return getToken(SQLParser.CUME_DIST, 0); }
		public TerminalNode TEXT() { return getToken(SQLParser.TEXT, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLParser.PRECEDING, 0); }
		public TerminalNode DOW() { return getToken(SQLParser.DOW, 0); }
		public TerminalNode GROUPING() { return getToken(SQLParser.GROUPING, 0); }
		public TerminalNode INTERVAL() { return getToken(SQLParser.INTERVAL, 0); }
		public TerminalNode RLIKE() { return getToken(SQLParser.RLIKE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SQLParser.LAST_VALUE, 0); }
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(SQLParser.STDDEV_SAMP, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(SQLParser.TIMEZONE_HOUR, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SQLParser.MICROSECONDS, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public TerminalNode FORMAT() { return getToken(SQLParser.FORMAT, 0); }
		public TerminalNode THAN() { return getToken(SQLParser.THAN, 0); }
		public TerminalNode DAY() { return getToken(SQLParser.DAY, 0); }
		public TerminalNode INTERSECTION() { return getToken(SQLParser.INTERSECTION, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public TerminalNode NCHAR() { return getToken(SQLParser.NCHAR, 0); }
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode YEAR() { return getToken(SQLParser.YEAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(SQLParser.NVARCHAR, 0); }
		public TerminalNode BOOL() { return getToken(SQLParser.BOOL, 0); }
		public TerminalNode TIMEZONE() { return getToken(SQLParser.TIMEZONE, 0); }
		public TerminalNode COLLECT() { return getToken(SQLParser.COLLECT, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLParser.BOOLEAN, 0); }
		public TerminalNode NULLIF() { return getToken(SQLParser.NULLIF, 0); }
		public TerminalNode EXPLAIN() { return getToken(SQLParser.EXPLAIN, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode RENAME() { return getToken(SQLParser.RENAME, 0); }
		public TerminalNode SUBPARTITION() { return getToken(SQLParser.SUBPARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLParser.PARTITIONS, 0); }
		public TerminalNode FLOAT8() { return getToken(SQLParser.FLOAT8, 0); }
		public TerminalNode VARBINARY() { return getToken(SQLParser.VARBINARY, 0); }
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public TerminalNode FILTER() { return getToken(SQLParser.FILTER, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode NATIONAL() { return getToken(SQLParser.NATIONAL, 0); }
		public TerminalNode ROW() { return getToken(SQLParser.ROW, 0); }
		public TerminalNode VAR_POP() { return getToken(SQLParser.VAR_POP, 0); }
		public TerminalNode ZONE() { return getToken(SQLParser.ZONE, 0); }
		public TerminalNode INT2() { return getToken(SQLParser.INT2, 0); }
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode SIMILAR() { return getToken(SQLParser.SIMILAR, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public TerminalNode MAXVALUE() { return getToken(SQLParser.MAXVALUE, 0); }
		public TerminalNode LIST() { return getToken(SQLParser.LIST, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SQLParser.UNBOUNDED, 0); }
		public TerminalNode EXCLUDE() { return getToken(SQLParser.EXCLUDE, 0); }
		public TerminalNode DOY() { return getToken(SQLParser.DOY, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLParser.FOLLOWING, 0); }
		public TerminalNode INT1() { return getToken(SQLParser.INT1, 0); }
		public TerminalNode RANGE() { return getToken(SQLParser.RANGE, 0); }
		public TerminalNode RANK() { return getToken(SQLParser.RANK, 0); }
		public TerminalNode DECADE() { return getToken(SQLParser.DECADE, 0); }
		public TerminalNode VAR_SAMP() { return getToken(SQLParser.VAR_SAMP, 0); }
		public TerminalNode BIGINT() { return getToken(SQLParser.BIGINT, 0); }
		public TerminalNode DENSE_RANK() { return getToken(SQLParser.DENSE_RANK, 0); }
		public TerminalNode EVERY() { return getToken(SQLParser.EVERY, 0); }
		public TerminalNode STDDEV_POP() { return getToken(SQLParser.STDDEV_POP, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public TerminalNode VARBIT() { return getToken(SQLParser.VARBIT, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLParser.NUMERIC, 0); }
		public TerminalNode MAP() { return getToken(SQLParser.MAP, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(SQLParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(SQLParser.PERCENT_RANK, 0); }
		public TerminalNode REPAIR() { return getToken(SQLParser.REPAIR, 0); }
		public TerminalNode ISOYEAR() { return getToken(SQLParser.ISOYEAR, 0); }
		public TerminalNode REGEXP() { return getToken(SQLParser.REGEXP, 0); }
		public TerminalNode LESS() { return getToken(SQLParser.LESS, 0); }
		public TerminalNode ROLLUP() { return getToken(SQLParser.ROLLUP, 0); }
		public TerminalNode REAL() { return getToken(SQLParser.REAL, 0); }
		public TerminalNode EPOCH() { return getToken(SQLParser.EPOCH, 0); }
		public TerminalNode CURRENT() { return getToken(SQLParser.CURRENT, 0); }
		public TerminalNode INT4() { return getToken(SQLParser.INT4, 0); }
		public TerminalNode PURGE() { return getToken(SQLParser.PURGE, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode TINYINT() { return getToken(SQLParser.TINYINT, 0); }
		public TerminalNode TRIM() { return getToken(SQLParser.TRIM, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(SQLParser.ROW_NUMBER, 0); }
		public TerminalNode MAX() { return getToken(SQLParser.MAX, 0); }
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public TerminalNode QUARTER() { return getToken(SQLParser.QUARTER, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SQLParser.FIRST_VALUE, 0); }
		public TerminalNode MONTH() { return getToken(SQLParser.MONTH, 0); }
		public TerminalNode BIT() { return getToken(SQLParser.BIT, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public TerminalNode HASH() { return getToken(SQLParser.HASH, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLParser.SMALLINT, 0); }
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public TerminalNode BYTEA() { return getToken(SQLParser.BYTEA, 0); }
		public TerminalNode SUM() { return getToken(SQLParser.SUM, 0); }
		public TerminalNode LAST() { return getToken(SQLParser.LAST, 0); }
		public TerminalNode ROWS() { return getToken(SQLParser.ROWS, 0); }
		public TerminalNode TIMESTAMPTZ() { return getToken(SQLParser.TIMESTAMPTZ, 0); }
		public TerminalNode CUBE() { return getToken(SQLParser.CUBE, 0); }
		public TerminalNode BLOB() { return getToken(SQLParser.BLOB, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public TerminalNode CATALOG() { return getToken(SQLParser.CATALOG, 0); }
		public TerminalNode WEEK() { return getToken(SQLParser.WEEK, 0); }
		public TerminalNode SECOND() { return getToken(SQLParser.SECOND, 0); }
		public TerminalNode ISODOW() { return getToken(SQLParser.ISODOW, 0); }
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
		enterRule(_localctx, 78, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (AVG - 60)) | (1L << (ADD - 60)) | (1L << (ALTER - 60)) | (1L << (BETWEEN - 60)) | (1L << (BY - 60)) | (1L << (CATALOG - 60)) | (1L << (CENTURY - 60)) | (1L << (CHARACTER - 60)) | (1L << (COLLECT - 60)) | (1L << (COALESCE - 60)) | (1L << (COLUMN - 60)) | (1L << (COUNT - 60)) | (1L << (CUBE - 60)) | (1L << (CUME_DIST - 60)) | (1L << (CURRENT - 60)) | (1L << (DAY - 60)) | (1L << (DEFAULT - 60)) | (1L << (DEC - 60)) | (1L << (DECADE - 60)) | (1L << (DENSE_RANK - 60)) | (1L << (DOW - 60)) | (1L << (DOY - 60)) | (1L << (DROP - 60)) | (1L << (EPOCH - 60)) | (1L << (EVERY - 60)) | (1L << (EXCLUDE - 60)) | (1L << (EXISTS - 60)) | (1L << (EXPLAIN - 60)) | (1L << (EXTERNAL - 60)) | (1L << (EXTRACT - 60)) | (1L << (FILTER - 60)) | (1L << (FIRST - 60)) | (1L << (FIRST_VALUE - 60)) | (1L << (FOLLOWING - 60)) | (1L << (FORMAT - 60)) | (1L << (FUSION - 60)) | (1L << (GROUPING - 60)) | (1L << (HASH - 60)) | (1L << (INDEX - 60)) | (1L << (INSERT - 60)) | (1L << (INTERSECTION - 60)) | (1L << (ISODOW - 60)) | (1L << (ISOYEAR - 60)) | (1L << (LAST - 60)) | (1L << (LAST_VALUE - 60)) | (1L << (LESS - 60)) | (1L << (LIST - 60)) | (1L << (LOCATION - 60)) | (1L << (MAX - 60)) | (1L << (MAXVALUE - 60)) | (1L << (MICROSECONDS - 60)) | (1L << (MILLENNIUM - 60)) | (1L << (MILLISECONDS - 60)) | (1L << (MIN - 60)) | (1L << (MINUTE - 60)) | (1L << (MONTH - 60)) | (1L << (NATIONAL - 60)) | (1L << (NULLIF - 60)))) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (NO - 124)) | (1L << (OVERWRITE - 124)) | (1L << (OTHERS - 124)) | (1L << (PARTITION - 124)) | (1L << (PARTITIONS - 124)) | (1L << (PERCENT_RANK - 124)) | (1L << (PRECEDING - 124)) | (1L << (PRECISION - 124)) | (1L << (PURGE - 124)) | (1L << (QUARTER - 124)) | (1L << (RANGE - 124)) | (1L << (RANK - 124)) | (1L << (REGEXP - 124)) | (1L << (RENAME - 124)) | (1L << (REPAIR - 124)) | (1L << (RESET - 124)) | (1L << (RLIKE - 124)) | (1L << (ROLLUP - 124)) | (1L << (ROW - 124)) | (1L << (ROWS - 124)) | (1L << (ROW_NUMBER - 124)) | (1L << (SECOND - 124)) | (1L << (SESSION - 124)) | (1L << (SET - 124)) | (1L << (SIMILAR - 124)) | (1L << (STDDEV_POP - 124)) | (1L << (STDDEV_SAMP - 124)) | (1L << (SUBPARTITION - 124)) | (1L << (SUM - 124)) | (1L << (TABLESPACE - 124)) | (1L << (THAN - 124)) | (1L << (TIES - 124)) | (1L << (TIMEZONE - 124)) | (1L << (TIMEZONE_HOUR - 124)) | (1L << (TIMEZONE_MINUTE - 124)) | (1L << (TRIM - 124)) | (1L << (TO - 124)) | (1L << (UNBOUNDED - 124)) | (1L << (UNKNOWN - 124)) | (1L << (VALUES - 124)) | (1L << (VAR_SAMP - 124)) | (1L << (VAR_POP - 124)) | (1L << (VARYING - 124)) | (1L << (WEEK - 124)) | (1L << (YEAR - 124)) | (1L << (ZONE - 124)) | (1L << (BOOLEAN - 124)) | (1L << (BOOL - 124)) | (1L << (BIT - 124)) | (1L << (VARBIT - 124)) | (1L << (INT1 - 124)) | (1L << (INT2 - 124)) | (1L << (INT4 - 124)) | (1L << (INT8 - 124)) | (1L << (TINYINT - 124)) | (1L << (SMALLINT - 124)) | (1L << (INT - 124)) | (1L << (INTEGER - 124)) | (1L << (BIGINT - 124)) | (1L << (FLOAT4 - 124)) | (1L << (FLOAT8 - 124)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (REAL - 188)) | (1L << (FLOAT - 188)) | (1L << (DOUBLE - 188)) | (1L << (NUMERIC - 188)) | (1L << (DECIMAL - 188)) | (1L << (CHAR - 188)) | (1L << (VARCHAR - 188)) | (1L << (NCHAR - 188)) | (1L << (NVARCHAR - 188)) | (1L << (DATE - 188)) | (1L << (INTERVAL - 188)) | (1L << (TIME - 188)) | (1L << (TIMETZ - 188)) | (1L << (TIMESTAMP - 188)) | (1L << (TIMESTAMPTZ - 188)) | (1L << (TEXT - 188)) | (1L << (VARBINARY - 188)) | (1L << (BLOB - 188)) | (1L << (BYTEA - 188)) | (1L << (MAP - 188)) | (1L << (RECORD - 188)))) != 0) || _la==INET4) ) {
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
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public General_literalContext general_literal() {
			return getRuleContext(General_literalContext.class,0);
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
		enterRule(_localctx, 80, RULE_unsigned_literal);
		try {
			setState(885);
			switch (_input.LA(1)) {
			case NUMBER:
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(883); unsigned_numeric_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case Character_String_Literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(884); general_literal();
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
		public Datetime_literalContext datetime_literal() {
			return getRuleContext(Datetime_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
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
		enterRule(_localctx, 82, RULE_general_literal);
		try {
			setState(890);
			switch (_input.LA(1)) {
			case Character_String_Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(887); match(Character_String_Literal);
				}
				break;
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(888); datetime_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
				enterOuterAlt(_localctx, 3);
				{
				setState(889); boolean_literal();
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
		public Time_literalContext time_literal() {
			return getRuleContext(Time_literalContext.class,0);
		}
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Interval_literalContext interval_literal() {
			return getRuleContext(Interval_literalContext.class,0);
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
		enterRule(_localctx, 84, RULE_datetime_literal);
		try {
			setState(896);
			switch (_input.LA(1)) {
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(892); timestamp_literal();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(893); time_literal();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(894); date_literal();
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(895); interval_literal();
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
		enterRule(_localctx, 86, RULE_time_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898); match(TIME);
			setState(899); ((Time_literalContext)_localctx).time_string = match(Character_String_Literal);
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
		enterRule(_localctx, 88, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901); match(TIMESTAMP);
			setState(902); ((Timestamp_literalContext)_localctx).timestamp_string = match(Character_String_Literal);
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
		enterRule(_localctx, 90, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); match(DATE);
			setState(905); ((Date_literalContext)_localctx).date_string = match(Character_String_Literal);
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

	public static class Interval_literalContext extends ParserRuleContext {
		public Value_expression_primaryContext interval_expression;
		public Primary_or_extended_datetime_literalContext interval;
		public Value_expression_primaryContext value_expression_primary() {
			return getRuleContext(Value_expression_primaryContext.class,0);
		}
		public TerminalNode INTERVAL() { return getToken(SQLParser.INTERVAL, 0); }
		public Primary_or_extended_datetime_literalContext primary_or_extended_datetime_literal() {
			return getRuleContext(Primary_or_extended_datetime_literalContext.class,0);
		}
		public Interval_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterInterval_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitInterval_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitInterval_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_literalContext interval_literal() throws RecognitionException {
		Interval_literalContext _localctx = new Interval_literalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interval_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907); match(INTERVAL);
			setState(908); ((Interval_literalContext)_localctx).interval_expression = value_expression_primary();
			setState(909); ((Interval_literalContext)_localctx).interval = primary_or_extended_datetime_literal();
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

	public static class Primary_or_extended_datetime_literalContext extends ParserRuleContext {
		public Extended_datetime_fieldContext extended_datetime_field() {
			return getRuleContext(Extended_datetime_fieldContext.class,0);
		}
		public Primary_datetime_fieldContext primary_datetime_field() {
			return getRuleContext(Primary_datetime_fieldContext.class,0);
		}
		public Primary_or_extended_datetime_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_or_extended_datetime_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPrimary_or_extended_datetime_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPrimary_or_extended_datetime_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPrimary_or_extended_datetime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_or_extended_datetime_literalContext primary_or_extended_datetime_literal() throws RecognitionException {
		Primary_or_extended_datetime_literalContext _localctx = new Primary_or_extended_datetime_literalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_primary_or_extended_datetime_literal);
		try {
			setState(913);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(911); primary_datetime_field();
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
				enterOuterAlt(_localctx, 2);
				{
				setState(912); extended_datetime_field();
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
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
		enterRule(_localctx, 96, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
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
		enterRule(_localctx, 98, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917); predefined_type();
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
		public Complex_typeContext complex_type() {
			return getRuleContext(Complex_typeContext.class,0);
		}
		public Datetime_typeContext datetime_type() {
			return getRuleContext(Datetime_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Binary_large_object_string_typeContext binary_large_object_string_type() {
			return getRuleContext(Binary_large_object_string_typeContext.class,0);
		}
		public Binary_typeContext binary_type() {
			return getRuleContext(Binary_typeContext.class,0);
		}
		public National_character_string_typeContext national_character_string_type() {
			return getRuleContext(National_character_string_typeContext.class,0);
		}
		public Character_string_typeContext character_string_type() {
			return getRuleContext(Character_string_typeContext.class,0);
		}
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public Bit_typeContext bit_type() {
			return getRuleContext(Bit_typeContext.class,0);
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
		enterRule(_localctx, 100, RULE_predefined_type);
		try {
			setState(928);
			switch (_input.LA(1)) {
			case CHARACTER:
			case CHAR:
			case VARCHAR:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(919); character_string_type();
				}
				break;
			case NATIONAL:
			case NCHAR:
			case NVARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(920); national_character_string_type();
				}
				break;
			case BLOB:
			case BYTEA:
				enterOuterAlt(_localctx, 3);
				{
				setState(921); binary_large_object_string_type();
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
				setState(922); numeric_type();
				}
				break;
			case BOOLEAN:
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(923); boolean_type();
				}
				break;
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
				enterOuterAlt(_localctx, 6);
				{
				setState(924); datetime_type();
				}
				break;
			case BIT:
			case VARBIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(925); bit_type();
				}
				break;
			case BINARY:
			case VARBINARY:
				enterOuterAlt(_localctx, 8);
				{
				setState(926); binary_type();
				}
				break;
			case ARRAY:
			case MAP:
			case RECORD:
				enterOuterAlt(_localctx, 9);
				{
				setState(927); complex_type();
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
		public TerminalNode TEXT() { return getToken(SQLParser.TEXT, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
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
		enterRule(_localctx, 102, RULE_character_string_type);
		int _la;
		try {
			setState(953);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930); match(CHARACTER);
				setState(932);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(931); type_length();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934); match(CHAR);
				setState(936);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(935); type_length();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938); match(CHARACTER);
				setState(939); match(VARYING);
				setState(941);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(940); type_length();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(943); match(CHAR);
				setState(944); match(VARYING);
				setState(946);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(945); type_length();
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(948); match(VARCHAR);
				setState(950);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(949); type_length();
					}
				}

				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(952); match(TEXT);
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
		enterRule(_localctx, 104, RULE_type_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955); match(LEFT_PAREN);
			setState(956); match(NUMBER);
			setState(957); match(RIGHT_PAREN);
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
		public TerminalNode NVARCHAR() { return getToken(SQLParser.NVARCHAR, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode NCHAR() { return getToken(SQLParser.NCHAR, 0); }
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
		enterRule(_localctx, 106, RULE_national_character_string_type);
		int _la;
		try {
			setState(994);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959); match(NATIONAL);
				setState(960); match(CHARACTER);
				setState(962);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(961); type_length();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964); match(NATIONAL);
				setState(965); match(CHAR);
				setState(967);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(966); type_length();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(969); match(NCHAR);
				setState(971);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(970); type_length();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(973); match(NATIONAL);
				setState(974); match(CHARACTER);
				setState(975); match(VARYING);
				setState(977);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(976); type_length();
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(979); match(NATIONAL);
				setState(980); match(CHAR);
				setState(981); match(VARYING);
				setState(983);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(982); type_length();
					}
				}

				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(985); match(NCHAR);
				setState(986); match(VARYING);
				setState(988);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(987); type_length();
					}
				}

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(990); match(NVARCHAR);
				setState(992);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(991); type_length();
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
		public TerminalNode BLOB() { return getToken(SQLParser.BLOB, 0); }
		public TerminalNode BYTEA() { return getToken(SQLParser.BYTEA, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
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
		enterRule(_localctx, 108, RULE_binary_large_object_string_type);
		int _la;
		try {
			setState(1004);
			switch (_input.LA(1)) {
			case BLOB:
				enterOuterAlt(_localctx, 1);
				{
				setState(996); match(BLOB);
				setState(998);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(997); type_length();
					}
				}

				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000); match(BYTEA);
				setState(1002);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1001); type_length();
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
		public Approximate_numeric_typeContext approximate_numeric_type() {
			return getRuleContext(Approximate_numeric_typeContext.class,0);
		}
		public Exact_numeric_typeContext exact_numeric_type() {
			return getRuleContext(Exact_numeric_typeContext.class,0);
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
		enterRule(_localctx, 110, RULE_numeric_type);
		try {
			setState(1008);
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
				setState(1006); exact_numeric_type();
				}
				break;
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1007); approximate_numeric_type();
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
		public TerminalNode DECIMAL() { return getToken(SQLParser.DECIMAL, 0); }
		public TerminalNode INT2() { return getToken(SQLParser.INT2, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLParser.SMALLINT, 0); }
		public TerminalNode INT1() { return getToken(SQLParser.INT1, 0); }
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(SQLParser.BIGINT, 0); }
		public TerminalNode INT4() { return getToken(SQLParser.INT4, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode TINYINT() { return getToken(SQLParser.TINYINT, 0); }
		public TerminalNode DEC() { return getToken(SQLParser.DEC, 0); }
		public TerminalNode INT8() { return getToken(SQLParser.INT8, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLParser.NUMERIC, 0); }
		public Precision_paramContext precision_param() {
			return getRuleContext(Precision_paramContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_exact_numeric_type);
		int _la;
		try {
			setState(1031);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010); match(NUMERIC);
				setState(1012);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1011); precision_param();
					}
				}

				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014); match(DECIMAL);
				setState(1016);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1015); precision_param();
					}
				}

				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1018); match(DEC);
				setState(1020);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1019); precision_param();
					}
				}

				}
				break;
			case INT1:
				enterOuterAlt(_localctx, 4);
				{
				setState(1022); match(INT1);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1023); match(TINYINT);
				}
				break;
			case INT2:
				enterOuterAlt(_localctx, 6);
				{
				setState(1024); match(INT2);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1025); match(SMALLINT);
				}
				break;
			case INT4:
				enterOuterAlt(_localctx, 8);
				{
				setState(1026); match(INT4);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 9);
				{
				setState(1027); match(INT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 10);
				{
				setState(1028); match(INTEGER);
				}
				break;
			case INT8:
				enterOuterAlt(_localctx, 11);
				{
				setState(1029); match(INT8);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 12);
				{
				setState(1030); match(BIGINT);
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
		public TerminalNode FLOAT4() { return getToken(SQLParser.FLOAT4, 0); }
		public TerminalNode REAL() { return getToken(SQLParser.REAL, 0); }
		public TerminalNode PRECISION() { return getToken(SQLParser.PRECISION, 0); }
		public TerminalNode FLOAT8() { return getToken(SQLParser.FLOAT8, 0); }
		public TerminalNode DOUBLE() { return getToken(SQLParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public Precision_paramContext precision_param() {
			return getRuleContext(Precision_paramContext.class,0);
		}
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
		enterRule(_localctx, 114, RULE_approximate_numeric_type);
		int _la;
		try {
			setState(1043);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033); match(FLOAT);
				setState(1035);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1034); precision_param();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037); match(FLOAT4);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1038); match(REAL);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1039); match(FLOAT8);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1040); match(DOUBLE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1041); match(DOUBLE);
				setState(1042); match(PRECISION);
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
		public TerminalNode NUMBER(int i) {
			return getToken(SQLParser.NUMBER, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SQLParser.NUMBER); }
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
		enterRule(_localctx, 116, RULE_precision_param);
		try {
			setState(1053);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045); match(LEFT_PAREN);
				setState(1046); ((Precision_paramContext)_localctx).precision = match(NUMBER);
				setState(1047); match(RIGHT_PAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048); match(LEFT_PAREN);
				setState(1049); ((Precision_paramContext)_localctx).precision = match(NUMBER);
				setState(1050); match(COMMA);
				setState(1051); ((Precision_paramContext)_localctx).scale = match(NUMBER);
				setState(1052); match(RIGHT_PAREN);
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
		enterRule(_localctx, 118, RULE_boolean_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
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
		public TerminalNode ZONE() { return getToken(SQLParser.ZONE, 0); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public List<TerminalNode> TIME() { return getTokens(SQLParser.TIME); }
		public TerminalNode TIMETZ() { return getToken(SQLParser.TIMETZ, 0); }
		public TerminalNode INTERVAL() { return getToken(SQLParser.INTERVAL, 0); }
		public TerminalNode TIME(int i) {
			return getToken(SQLParser.TIME, i);
		}
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
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
		enterRule(_localctx, 120, RULE_datetime_type);
		try {
			setState(1071);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057); match(DATE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058); match(INTERVAL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059); match(TIME);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1060); match(TIME);
				setState(1061); match(WITH);
				setState(1062); match(TIME);
				setState(1063); match(ZONE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1064); match(TIMETZ);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1065); match(TIMESTAMP);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1066); match(TIMESTAMP);
				setState(1067); match(WITH);
				setState(1068); match(TIME);
				setState(1069); match(ZONE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1070); match(TIMESTAMPTZ);
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
		public TerminalNode VARBIT() { return getToken(SQLParser.VARBIT, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode BIT() { return getToken(SQLParser.BIT, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
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
		enterRule(_localctx, 122, RULE_bit_type);
		int _la;
		try {
			setState(1086);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073); match(BIT);
				setState(1075);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1074); type_length();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077); match(VARBIT);
				setState(1079);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1078); type_length();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1081); match(BIT);
				setState(1082); match(VARYING);
				setState(1084);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1083); type_length();
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
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode VARBINARY() { return getToken(SQLParser.VARBINARY, 0); }
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
		enterRule(_localctx, 124, RULE_binary_type);
		int _la;
		try {
			setState(1101);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088); match(BINARY);
				setState(1090);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1089); type_length();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092); match(BINARY);
				setState(1093); match(VARYING);
				setState(1095);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1094); type_length();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097); match(VARBINARY);
				setState(1099);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1098); type_length();
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

	public static class Complex_typeContext extends ParserRuleContext {
		public Record_typeContext record_type() {
			return getRuleContext(Record_typeContext.class,0);
		}
		public Map_typeContext map_type() {
			return getRuleContext(Map_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Complex_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterComplex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitComplex_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitComplex_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_typeContext complex_type() throws RecognitionException {
		Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_complex_type);
		try {
			setState(1106);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103); array_type();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104); record_type();
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105); map_type();
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

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SQLParser.ARRAY, 0); }
		public TerminalNode GTH() { return getToken(SQLParser.GTH, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode LTH() { return getToken(SQLParser.LTH, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108); match(ARRAY);
			setState(1109); match(LTH);
			setState(1110); data_type();
			setState(1111); match(GTH);
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

	public static class Record_typeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(SQLParser.RECORD, 0); }
		public Table_elementsContext table_elements() {
			return getRuleContext(Table_elementsContext.class,0);
		}
		public Record_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRecord_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRecord_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRecord_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_typeContext record_type() throws RecognitionException {
		Record_typeContext _localctx = new Record_typeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_record_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); match(RECORD);
			setState(1114); table_elements();
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

	public static class Map_typeContext extends ParserRuleContext {
		public Data_typeContext key_type;
		public Data_typeContext value_type;
		public TerminalNode GTH() { return getToken(SQLParser.GTH, 0); }
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public TerminalNode MAP() { return getToken(SQLParser.MAP, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode LTH() { return getToken(SQLParser.LTH, 0); }
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public Map_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterMap_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitMap_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitMap_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_typeContext map_type() throws RecognitionException {
		Map_typeContext _localctx = new Map_typeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_map_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116); match(MAP);
			setState(1117); match(LTH);
			setState(1118); ((Map_typeContext)_localctx).key_type = data_type();
			setState(1119); match(COMMA);
			setState(1120); ((Map_typeContext)_localctx).value_type = data_type();
			setState(1121); match(GTH);
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
		enterRule(_localctx, 134, RULE_value_expression_primary);
		try {
			setState(1125);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123); parenthesized_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1124); nonparenthesized_value_expression_primary();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_parenthesized_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127); match(LEFT_PAREN);
			setState(1128); value_expression();
			setState(1129); match(RIGHT_PAREN);
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
		public Cast_specificationContext cast_specification() {
			return getRuleContext(Cast_specificationContext.class,0);
		}
		public Window_functionContext window_function() {
			return getRuleContext(Window_functionContext.class,0);
		}
		public Set_function_specificationContext set_function_specification() {
			return getRuleContext(Set_function_specificationContext.class,0);
		}
		public Unsigned_value_specificationContext unsigned_value_specification() {
			return getRuleContext(Unsigned_value_specificationContext.class,0);
		}
		public Column_referenceContext column_reference() {
			return getRuleContext(Column_referenceContext.class,0);
		}
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public Routine_invocationContext routine_invocation() {
			return getRuleContext(Routine_invocationContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
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
		enterRule(_localctx, 138, RULE_nonparenthesized_value_expression_primary);
		try {
			setState(1139);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131); unsigned_value_specification();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132); column_reference();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1133); set_function_specification();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1134); window_function();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1135); scalar_subquery();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1136); case_expression();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1137); cast_specification();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1138); routine_invocation();
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
		enterRule(_localctx, 140, RULE_unsigned_value_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141); unsigned_literal();
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
		enterRule(_localctx, 142, RULE_unsigned_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
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
		enterRule(_localctx, 144, RULE_signed_numerical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1145); sign();
				}
			}

			setState(1148); unsigned_numeric_literal();
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
		enterRule(_localctx, 146, RULE_set_function_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150); aggregate_function();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public General_set_functionContext general_set_function() {
			return getRuleContext(General_set_functionContext.class,0);
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
		enterRule(_localctx, 148, RULE_aggregate_function);
		try {
			setState(1160);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152); match(COUNT);
				setState(1153); match(LEFT_PAREN);
				setState(1154); match(MULTIPLY);
				setState(1155); match(RIGHT_PAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156); general_set_function();
				setState(1158);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1157); filter_clause();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
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
		enterRule(_localctx, 150, RULE_general_set_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162); set_function_type();
			setState(1163); match(LEFT_PAREN);
			setState(1165);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(1164); set_qualifier();
				}
			}

			setState(1167); value_expression();
			setState(1168); match(RIGHT_PAREN);
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
		public TerminalNode MIN() { return getToken(SQLParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode VAR_POP() { return getToken(SQLParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(SQLParser.VAR_SAMP, 0); }
		public TerminalNode COLLECT() { return getToken(SQLParser.COLLECT, 0); }
		public TerminalNode FUSION() { return getToken(SQLParser.FUSION, 0); }
		public TerminalNode AVG() { return getToken(SQLParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(SQLParser.SUM, 0); }
		public TerminalNode ANY() { return getToken(SQLParser.ANY, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(SQLParser.STDDEV_SAMP, 0); }
		public TerminalNode EVERY() { return getToken(SQLParser.EVERY, 0); }
		public TerminalNode SOME() { return getToken(SQLParser.SOME, 0); }
		public TerminalNode STDDEV_POP() { return getToken(SQLParser.STDDEV_POP, 0); }
		public TerminalNode MAX() { return getToken(SQLParser.MAX, 0); }
		public TerminalNode INTERSECTION() { return getToken(SQLParser.INTERSECTION, 0); }
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
		enterRule(_localctx, 152, RULE_set_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << SOME) | (1L << AVG))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (COLLECT - 68)) | (1L << (COUNT - 68)) | (1L << (EVERY - 68)) | (1L << (FUSION - 68)) | (1L << (INTERSECTION - 68)) | (1L << (MAX - 68)) | (1L << (MIN - 68)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (STDDEV_POP - 150)) | (1L << (STDDEV_SAMP - 150)) | (1L << (SUM - 150)) | (1L << (VAR_SAMP - 150)) | (1L << (VAR_POP - 150)))) != 0)) ) {
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode FILTER() { return getToken(SQLParser.FILTER, 0); }
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
		enterRule(_localctx, 154, RULE_filter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172); match(FILTER);
			setState(1173); match(LEFT_PAREN);
			setState(1174); match(WHERE);
			setState(1175); search_condition();
			setState(1176); match(RIGHT_PAREN);
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
		enterRule(_localctx, 156, RULE_grouping_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178); match(GROUPING);
			setState(1179); match(LEFT_PAREN);
			setState(1180); column_reference_list();
			setState(1181); match(RIGHT_PAREN);
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

	public static class Window_functionContext extends ParserRuleContext {
		public Window_function_typeContext window_function_type() {
			return getRuleContext(Window_function_typeContext.class,0);
		}
		public Window_name_or_specificationContext window_name_or_specification() {
			return getRuleContext(Window_name_or_specificationContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SQLParser.OVER, 0); }
		public Window_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_functionContext window_function() throws RecognitionException {
		Window_functionContext _localctx = new Window_functionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_window_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183); window_function_type();
			setState(1184); match(OVER);
			setState(1185); window_name_or_specification();
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

	public static class Window_function_typeContext extends ParserRuleContext {
		public TerminalNode LAG() { return getToken(SQLParser.LAG, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Column_referenceContext column_reference() {
			return getRuleContext(Column_referenceContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode ROW_NUMBER() { return getToken(SQLParser.ROW_NUMBER, 0); }
		public TerminalNode LEAD() { return getToken(SQLParser.LEAD, 0); }
		public Rank_function_typeContext rank_function_type() {
			return getRuleContext(Rank_function_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode FIRST_VALUE() { return getToken(SQLParser.FIRST_VALUE, 0); }
		public Common_value_expressionContext common_value_expression() {
			return getRuleContext(Common_value_expressionContext.class,0);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public TerminalNode LAST_VALUE() { return getToken(SQLParser.LAST_VALUE, 0); }
		public Window_function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_function_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_function_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_function_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_function_typeContext window_function_type() throws RecognitionException {
		Window_function_typeContext _localctx = new Window_function_typeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_window_function_type);
		int _la;
		try {
			setState(1231);
			switch (_input.LA(1)) {
			case CUME_DIST:
			case DENSE_RANK:
			case PERCENT_RANK:
			case RANK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1187); rank_function_type();
				setState(1188); match(LEFT_PAREN);
				setState(1189); match(RIGHT_PAREN);
				}
				break;
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191); match(ROW_NUMBER);
				setState(1192); match(LEFT_PAREN);
				setState(1193); match(RIGHT_PAREN);
				}
				break;
			case ANY:
			case SOME:
			case AVG:
			case COLLECT:
			case COUNT:
			case EVERY:
			case FUSION:
			case INTERSECTION:
			case MAX:
			case MIN:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUM:
			case VAR_SAMP:
			case VAR_POP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1194); aggregate_function();
				}
				break;
			case FIRST_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1195); match(FIRST_VALUE);
				setState(1196); match(LEFT_PAREN);
				setState(1197); column_reference();
				setState(1198); match(RIGHT_PAREN);
				}
				break;
			case LAST_VALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1200); match(LAST_VALUE);
				setState(1201); match(LEFT_PAREN);
				setState(1202); column_reference();
				setState(1203); match(RIGHT_PAREN);
				}
				break;
			case LAG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1205); match(LAG);
				setState(1206); match(LEFT_PAREN);
				setState(1207); column_reference();
				setState(1214);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1208); match(COMMA);
					setState(1209); numeric_value_expression();
					setState(1212);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1210); match(COMMA);
						setState(1211); common_value_expression();
						}
					}

					}
				}

				setState(1216); match(RIGHT_PAREN);
				}
				break;
			case LEAD:
				enterOuterAlt(_localctx, 7);
				{
				setState(1218); match(LEAD);
				setState(1219); match(LEFT_PAREN);
				setState(1220); column_reference();
				setState(1227);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1221); match(COMMA);
					setState(1222); numeric_value_expression();
					setState(1225);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1223); match(COMMA);
						setState(1224); common_value_expression();
						}
					}

					}
				}

				setState(1229); match(RIGHT_PAREN);
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

	public static class Rank_function_typeContext extends ParserRuleContext {
		public TerminalNode CUME_DIST() { return getToken(SQLParser.CUME_DIST, 0); }
		public TerminalNode RANK() { return getToken(SQLParser.RANK, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(SQLParser.PERCENT_RANK, 0); }
		public TerminalNode DENSE_RANK() { return getToken(SQLParser.DENSE_RANK, 0); }
		public Rank_function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRank_function_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRank_function_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRank_function_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rank_function_typeContext rank_function_type() throws RecognitionException {
		Rank_function_typeContext _localctx = new Rank_function_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rank_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (CUME_DIST - 73)) | (1L << (DENSE_RANK - 73)) | (1L << (PERCENT_RANK - 73)) | (1L << (RANK - 73)))) != 0)) ) {
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

	public static class Window_name_or_specificationContext extends ParserRuleContext {
		public Window_specificationContext window_specification() {
			return getRuleContext(Window_specificationContext.class,0);
		}
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public Window_name_or_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name_or_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_name_or_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_name_or_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_name_or_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_name_or_specificationContext window_name_or_specification() throws RecognitionException {
		Window_name_or_specificationContext _localctx = new Window_name_or_specificationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_window_name_or_specification);
		try {
			setState(1237);
			switch (_input.LA(1)) {
			case AVG:
			case ADD:
			case ALTER:
			case BETWEEN:
			case BY:
			case CATALOG:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case DAY:
			case DEFAULT:
			case DEC:
			case DECADE:
			case DENSE_RANK:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
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
			case LAST_VALUE:
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
			case NO:
			case OVERWRITE:
			case OTHERS:
			case PARTITION:
			case PARTITIONS:
			case PERCENT_RANK:
			case PRECEDING:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case RANK:
			case REGEXP:
			case RENAME:
			case REPAIR:
			case RESET:
			case RLIKE:
			case ROLLUP:
			case ROW:
			case ROWS:
			case ROW_NUMBER:
			case SECOND:
			case SESSION:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIES:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNBOUNDED:
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
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case MAP:
			case RECORD:
			case Regular_Identifier:
			case Quoted_Identifier:
			case INET4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235); window_name();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1236); window_specification();
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
		enterRule(_localctx, 166, RULE_case_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239); case_specification();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Boolean_value_expressionContext> boolean_value_expression() {
			return getRuleContexts(Boolean_value_expressionContext.class);
		}
		public Boolean_value_expressionContext boolean_value_expression(int i) {
			return getRuleContext(Boolean_value_expressionContext.class,i);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode NULLIF() { return getToken(SQLParser.NULLIF, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode COALESCE() { return getToken(SQLParser.COALESCE, 0); }
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
		enterRule(_localctx, 168, RULE_case_abbreviation);
		int _la;
		try {
			setState(1259);
			switch (_input.LA(1)) {
			case NULLIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241); match(NULLIF);
				setState(1242); match(LEFT_PAREN);
				setState(1243); numeric_value_expression();
				setState(1244); match(COMMA);
				setState(1245); boolean_value_expression();
				setState(1246); match(RIGHT_PAREN);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248); match(COALESCE);
				setState(1249); match(LEFT_PAREN);
				setState(1250); numeric_value_expression();
				setState(1253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1251); match(COMMA);
					setState(1252); boolean_value_expression();
					}
					}
					setState(1255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(1257); match(RIGHT_PAREN);
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
		enterRule(_localctx, 170, RULE_case_specification);
		try {
			setState(1263);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261); simple_case();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262); searched_case();
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
		public TerminalNode CASE() { return getToken(SQLParser.CASE, 0); }
		public Simple_when_clauseContext simple_when_clause(int i) {
			return getRuleContext(Simple_when_clauseContext.class,i);
		}
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public TerminalNode END() { return getToken(SQLParser.END, 0); }
		public List<Simple_when_clauseContext> simple_when_clause() {
			return getRuleContexts(Simple_when_clauseContext.class);
		}
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
		enterRule(_localctx, 172, RULE_simple_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265); match(CASE);
			setState(1266); boolean_value_expression();
			setState(1268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1267); simple_when_clause();
				}
				}
				setState(1270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1273);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1272); else_clause();
				}
			}

			setState(1275); match(END);
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
		public TerminalNode CASE() { return getToken(SQLParser.CASE, 0); }
		public List<Searched_when_clauseContext> searched_when_clause() {
			return getRuleContexts(Searched_when_clauseContext.class);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public Searched_when_clauseContext searched_when_clause(int i) {
			return getRuleContext(Searched_when_clauseContext.class,i);
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
		enterRule(_localctx, 174, RULE_searched_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277); match(CASE);
			setState(1279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1278); searched_when_clause();
				}
				}
				setState(1281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1284);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1283); else_clause();
				}
			}

			setState(1286); match(END);
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
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SQLParser.THEN, 0); }
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
		enterRule(_localctx, 176, RULE_simple_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288); match(WHEN);
			setState(1289); search_condition();
			setState(1290); match(THEN);
			setState(1291); result();
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
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SQLParser.THEN, 0); }
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
		enterRule(_localctx, 178, RULE_searched_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293); match(WHEN);
			setState(1294); ((Searched_when_clauseContext)_localctx).c = search_condition();
			setState(1295); match(THEN);
			setState(1296); ((Searched_when_clauseContext)_localctx).r = result();
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
		public TerminalNode ELSE() { return getToken(SQLParser.ELSE, 0); }
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
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
		enterRule(_localctx, 180, RULE_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298); match(ELSE);
			setState(1299); ((Else_clauseContext)_localctx).r = result();
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
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
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
		enterRule(_localctx, 182, RULE_result);
		try {
			setState(1303);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301); value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302); match(NULL);
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
		public Cast_operandContext cast_operand() {
			return getRuleContext(Cast_operandContext.class,0);
		}
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(SQLParser.CAST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
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
		enterRule(_localctx, 184, RULE_cast_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305); match(CAST);
			setState(1306); match(LEFT_PAREN);
			setState(1307); cast_operand();
			setState(1308); match(AS);
			setState(1309); cast_target();
			setState(1310); match(RIGHT_PAREN);
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
		enterRule(_localctx, 186, RULE_cast_operand);
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
		enterRule(_localctx, 188, RULE_cast_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314); data_type();
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
		public Row_value_expressionContext row_value_expression() {
			return getRuleContext(Row_value_expressionContext.class,0);
		}
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public Common_value_expressionContext common_value_expression() {
			return getRuleContext(Common_value_expressionContext.class,0);
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
		enterRule(_localctx, 190, RULE_value_expression);
		try {
			setState(1319);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316); common_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317); row_value_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1318); boolean_value_expression();
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
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public Datetime_value_expressionContext datetime_value_expression() {
			return getRuleContext(Datetime_value_expressionContext.class,0);
		}
		public String_value_expressionContext string_value_expression() {
			return getRuleContext(String_value_expressionContext.class,0);
		}
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
		enterRule(_localctx, 192, RULE_common_value_expression);
		try {
			setState(1325);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321); numeric_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322); string_value_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323); datetime_value_expression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1324); match(NULL);
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
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
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
		enterRule(_localctx, 194, RULE_numeric_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327); ((Numeric_value_expressionContext)_localctx).left = term();
			setState(1332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(1328);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1329); ((Numeric_value_expressionContext)_localctx).right = term();
				}
				}
				setState(1334);
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
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TerminalNode DIVIDE(int i) {
			return getToken(SQLParser.DIVIDE, i);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MULTIPLY(int i) {
			return getToken(SQLParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SQLParser.DIVIDE); }
		public List<TerminalNode> MULTIPLY() { return getTokens(SQLParser.MULTIPLY); }
		public List<TerminalNode> INFIX_OPERATOR() { return getTokens(SQLParser.INFIX_OPERATOR); }
		public TerminalNode MODULAR(int i) {
			return getToken(SQLParser.MODULAR, i);
		}
		public TerminalNode INFIX_OPERATOR(int i) {
			return getToken(SQLParser.INFIX_OPERATOR, i);
		}
		public List<TerminalNode> MODULAR() { return getTokens(SQLParser.MODULAR); }
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
		enterRule(_localctx, 196, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335); ((TermContext)_localctx).left = factor();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (MULTIPLY - 231)) | (1L << (DIVIDE - 231)) | (1L << (MODULAR - 231)) | (1L << (INFIX_OPERATOR - 231)))) != 0)) {
				{
				{
				setState(1336);
				_la = _input.LA(1);
				if ( !(((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (MULTIPLY - 231)) | (1L << (DIVIDE - 231)) | (1L << (MODULAR - 231)) | (1L << (INFIX_OPERATOR - 231)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1337); ((TermContext)_localctx).right = factor();
				}
				}
				setState(1342);
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
		enterRule(_localctx, 198, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1343); sign();
				}
			}

			setState(1346); numeric_primary();
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
		public List<Cast_targetContext> cast_target() {
			return getRuleContexts(Cast_targetContext.class);
		}
		public Value_expression_primaryContext value_expression_primary() {
			return getRuleContext(Value_expression_primaryContext.class,0);
		}
		public List<TerminalNode> CAST_EXPRESSION() { return getTokens(SQLParser.CAST_EXPRESSION); }
		public Cast_targetContext cast_target(int i) {
			return getRuleContext(Cast_targetContext.class,i);
		}
		public Numeric_value_functionContext numeric_value_function() {
			return getRuleContext(Numeric_value_functionContext.class,0);
		}
		public TerminalNode CAST_EXPRESSION(int i) {
			return getToken(SQLParser.CAST_EXPRESSION, i);
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
		enterRule(_localctx, 200, RULE_numeric_primary);
		int _la;
		try {
			setState(1357);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348); value_expression_primary();
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CAST_EXPRESSION) {
					{
					{
					setState(1349); match(CAST_EXPRESSION);
					setState(1350); cast_target();
					}
					}
					setState(1355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356); numeric_value_function();
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
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
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
		enterRule(_localctx, 202, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
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
		public Datetime_value_functionContext datetime_value_function() {
			return getRuleContext(Datetime_value_functionContext.class,0);
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
		enterRule(_localctx, 204, RULE_numeric_value_function);
		try {
			setState(1363);
			switch (_input.LA(1)) {
			case EXTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361); extract_expression();
				}
				break;
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1362); datetime_value_function();
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

	public static class Extract_expressionContext extends ParserRuleContext {
		public Extract_fieldContext extract_field_string;
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode EXTRACT() { return getToken(SQLParser.EXTRACT, 0); }
		public Extract_fieldContext extract_field() {
			return getRuleContext(Extract_fieldContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Extract_sourceContext extract_source() {
			return getRuleContext(Extract_sourceContext.class,0);
		}
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
		enterRule(_localctx, 206, RULE_extract_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365); match(EXTRACT);
			setState(1366); match(LEFT_PAREN);
			setState(1367); ((Extract_expressionContext)_localctx).extract_field_string = extract_field();
			setState(1368); match(FROM);
			setState(1369); extract_source();
			setState(1370); match(RIGHT_PAREN);
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
		enterRule(_localctx, 208, RULE_extract_field);
		try {
			setState(1375);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1372); primary_datetime_field();
				}
				break;
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373); time_zone_field();
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
				setState(1374); extended_datetime_field();
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
		public TerminalNode TIMEZONE() { return getToken(SQLParser.TIMEZONE, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(SQLParser.TIMEZONE_MINUTE, 0); }
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
		enterRule(_localctx, 210, RULE_time_zone_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			_la = _input.LA(1);
			if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (TIMEZONE - 157)) | (1L << (TIMEZONE_HOUR - 157)) | (1L << (TIMEZONE_MINUTE - 157)))) != 0)) ) {
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
		public Datetime_value_expressionContext datetime_value_expression() {
			return getRuleContext(Datetime_value_expressionContext.class,0);
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
		enterRule(_localctx, 212, RULE_extract_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379); datetime_value_expression();
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
		enterRule(_localctx, 214, RULE_string_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381); character_value_expression();
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
		public TerminalNode CONCATENATION_OPERATOR(int i) {
			return getToken(SQLParser.CONCATENATION_OPERATOR, i);
		}
		public List<Character_factorContext> character_factor() {
			return getRuleContexts(Character_factorContext.class);
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
		enterRule(_localctx, 216, RULE_character_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383); character_factor();
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCATENATION_OPERATOR) {
				{
				{
				setState(1384); match(CONCATENATION_OPERATOR);
				setState(1385); character_factor();
				}
				}
				setState(1390);
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
		enterRule(_localctx, 218, RULE_character_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391); character_primary();
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
		enterRule(_localctx, 220, RULE_character_primary);
		try {
			setState(1395);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393); value_expression_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394); string_value_function();
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
		enterRule(_localctx, 222, RULE_string_value_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397); trim_function();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Trim_operandsContext trim_operands() {
			return getRuleContext(Trim_operandsContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode TRIM() { return getToken(SQLParser.TRIM, 0); }
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
		enterRule(_localctx, 224, RULE_trim_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399); match(TRIM);
			setState(1400); match(LEFT_PAREN);
			setState(1401); trim_operands();
			setState(1402); match(RIGHT_PAREN);
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
		public Trim_specificationContext trim_specification() {
			return getRuleContext(Trim_specificationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public List<Character_value_expressionContext> character_value_expression() {
			return getRuleContexts(Character_value_expressionContext.class);
		}
		public Character_value_expressionContext character_value_expression(int i) {
			return getRuleContext(Character_value_expressionContext.class,i);
		}
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
		enterRule(_localctx, 226, RULE_trim_operands);
		int _la;
		try {
			setState(1418);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1405);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOTH) | (1L << LEADING) | (1L << TRAILING))) != 0)) {
						{
						setState(1404); trim_specification();
						}
					}

					setState(1408);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << FALSE) | (1L << LEFT) | (1L << RIGHT) | (1L << SOME) | (1L << TRUE) | (1L << AVG) | (1L << ADD) | (1L << ALTER) | (1L << BETWEEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BY - 64)) | (1L << (CATALOG - 64)) | (1L << (CENTURY - 64)) | (1L << (CHARACTER - 64)) | (1L << (COLLECT - 64)) | (1L << (COALESCE - 64)) | (1L << (COLUMN - 64)) | (1L << (COUNT - 64)) | (1L << (CUBE - 64)) | (1L << (CUME_DIST - 64)) | (1L << (CURRENT - 64)) | (1L << (DAY - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DENSE_RANK - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUDE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FIRST_VALUE - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAG - 64)) | (1L << (LAST - 64)) | (1L << (LAST_VALUE - 64)) | (1L << (LEAD - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (NO - 64)) | (1L << (OVERWRITE - 64)) | (1L << (OTHERS - 64)) | (1L << (PARTITION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PARTITIONS - 128)) | (1L << (PERCENT_RANK - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PURGE - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RANK - 128)) | (1L << (REGEXP - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (RESET - 128)) | (1L << (RLIKE - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (ROW_NUMBER - 128)) | (1L << (SECOND - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SIMILAR - 128)) | (1L << (STDDEV_POP - 128)) | (1L << (STDDEV_SAMP - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUM - 128)) | (1L << (TABLESPACE - 128)) | (1L << (THAN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEZONE - 128)) | (1L << (TIMEZONE_HOUR - 128)) | (1L << (TIMEZONE_MINUTE - 128)) | (1L << (TRIM - 128)) | (1L << (TO - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNKNOWN - 128)) | (1L << (VALUES - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (DECIMAL - 192)) | (1L << (CHAR - 192)) | (1L << (VARCHAR - 192)) | (1L << (NCHAR - 192)) | (1L << (NVARCHAR - 192)) | (1L << (DATE - 192)) | (1L << (INTERVAL - 192)) | (1L << (TIME - 192)) | (1L << (TIMETZ - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TIMESTAMPTZ - 192)) | (1L << (TEXT - 192)) | (1L << (VARBINARY - 192)) | (1L << (BLOB - 192)) | (1L << (BYTEA - 192)) | (1L << (MAP - 192)) | (1L << (RECORD - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (NUMBER - 192)) | (1L << (REAL_NUMBER - 192)) | (1L << (Regular_Identifier - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (Quoted_Identifier - 256)) | (1L << (Character_String_Literal - 256)) | (1L << (INET4 - 256)))) != 0)) {
						{
						setState(1407); ((Trim_operandsContext)_localctx).trim_character = character_value_expression();
						}
					}

					setState(1410); match(FROM);
					}
					break;
				}
				setState(1413); ((Trim_operandsContext)_localctx).trim_source = character_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414); ((Trim_operandsContext)_localctx).trim_source = character_value_expression();
				setState(1415); match(COMMA);
				setState(1416); ((Trim_operandsContext)_localctx).trim_character = character_value_expression();
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
		public TerminalNode LEADING() { return getToken(SQLParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SQLParser.TRAILING, 0); }
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
		enterRule(_localctx, 228, RULE_trim_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
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

	public static class Datetime_value_expressionContext extends ParserRuleContext {
		public Datetime_termContext datetime_term() {
			return getRuleContext(Datetime_termContext.class,0);
		}
		public Datetime_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatetime_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatetime_value_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatetime_value_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_value_expressionContext datetime_value_expression() throws RecognitionException {
		Datetime_value_expressionContext _localctx = new Datetime_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_datetime_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422); datetime_term();
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

	public static class Datetime_termContext extends ParserRuleContext {
		public Datetime_factorContext datetime_factor() {
			return getRuleContext(Datetime_factorContext.class,0);
		}
		public Datetime_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatetime_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatetime_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatetime_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_termContext datetime_term() throws RecognitionException {
		Datetime_termContext _localctx = new Datetime_termContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_datetime_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424); datetime_factor();
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

	public static class Datetime_factorContext extends ParserRuleContext {
		public Datetime_primaryContext datetime_primary() {
			return getRuleContext(Datetime_primaryContext.class,0);
		}
		public Datetime_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatetime_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatetime_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatetime_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_factorContext datetime_factor() throws RecognitionException {
		Datetime_factorContext _localctx = new Datetime_factorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_datetime_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426); datetime_primary();
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

	public static class Datetime_primaryContext extends ParserRuleContext {
		public Value_expression_primaryContext value_expression_primary() {
			return getRuleContext(Value_expression_primaryContext.class,0);
		}
		public Datetime_value_functionContext datetime_value_function() {
			return getRuleContext(Datetime_value_functionContext.class,0);
		}
		public Datetime_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatetime_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatetime_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatetime_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_primaryContext datetime_primary() throws RecognitionException {
		Datetime_primaryContext _localctx = new Datetime_primaryContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_datetime_primary);
		try {
			setState(1430);
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
			case ADD:
			case ALTER:
			case BETWEEN:
			case BY:
			case CATALOG:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case DAY:
			case DEFAULT:
			case DEC:
			case DECADE:
			case DENSE_RANK:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
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
			case NO:
			case OVERWRITE:
			case OTHERS:
			case PARTITION:
			case PARTITIONS:
			case PERCENT_RANK:
			case PRECEDING:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case RANK:
			case REGEXP:
			case RENAME:
			case REPAIR:
			case RESET:
			case RLIKE:
			case ROLLUP:
			case ROW:
			case ROWS:
			case ROW_NUMBER:
			case SECOND:
			case SESSION:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIES:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNBOUNDED:
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
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case MAP:
			case RECORD:
			case LEFT_PAREN:
			case NUMBER:
			case REAL_NUMBER:
			case Regular_Identifier:
			case Quoted_Identifier:
			case Character_String_Literal:
			case INET4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428); value_expression_primary();
				}
				break;
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429); datetime_value_function();
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

	public static class Datetime_value_functionContext extends ParserRuleContext {
		public Current_timestamp_value_functionContext current_timestamp_value_function() {
			return getRuleContext(Current_timestamp_value_functionContext.class,0);
		}
		public Current_time_value_functionContext current_time_value_function() {
			return getRuleContext(Current_time_value_functionContext.class,0);
		}
		public Current_date_value_functionContext current_date_value_function() {
			return getRuleContext(Current_date_value_functionContext.class,0);
		}
		public Datetime_value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_value_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatetime_value_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatetime_value_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatetime_value_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_value_functionContext datetime_value_function() throws RecognitionException {
		Datetime_value_functionContext _localctx = new Datetime_value_functionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_datetime_value_function);
		try {
			setState(1435);
			switch (_input.LA(1)) {
			case CURRENT_DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432); current_date_value_function();
				}
				break;
			case CURRENT_TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433); current_time_value_function();
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1434); current_timestamp_value_function();
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

	public static class Current_date_value_functionContext extends ParserRuleContext {
		public TerminalNode CURRENT_DATE() { return getToken(SQLParser.CURRENT_DATE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Current_date_value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_current_date_value_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCurrent_date_value_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCurrent_date_value_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCurrent_date_value_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Current_date_value_functionContext current_date_value_function() throws RecognitionException {
		Current_date_value_functionContext _localctx = new Current_date_value_functionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_current_date_value_function);
		try {
			setState(1441);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437); match(CURRENT_DATE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438); match(CURRENT_DATE);
				setState(1439); match(LEFT_PAREN);
				setState(1440); match(RIGHT_PAREN);
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

	public static class Current_time_value_functionContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SQLParser.CURRENT_TIME, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Current_time_value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_current_time_value_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCurrent_time_value_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCurrent_time_value_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCurrent_time_value_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Current_time_value_functionContext current_time_value_function() throws RecognitionException {
		Current_time_value_functionContext _localctx = new Current_time_value_functionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_current_time_value_function);
		try {
			setState(1447);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443); match(CURRENT_TIME);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1444); match(CURRENT_TIME);
				setState(1445); match(LEFT_PAREN);
				setState(1446); match(RIGHT_PAREN);
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

	public static class Current_timestamp_value_functionContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SQLParser.CURRENT_TIMESTAMP, 0); }
		public Current_timestamp_value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_current_timestamp_value_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCurrent_timestamp_value_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCurrent_timestamp_value_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCurrent_timestamp_value_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Current_timestamp_value_functionContext current_timestamp_value_function() throws RecognitionException {
		Current_timestamp_value_functionContext _localctx = new Current_timestamp_value_functionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_current_timestamp_value_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449); match(CURRENT_TIMESTAMP);
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
		enterRule(_localctx, 246, RULE_boolean_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451); or_predicate();
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
		public And_predicateContext and_predicate() {
			return getRuleContext(And_predicateContext.class,0);
		}
		public Or_predicateContext or_predicate(int i) {
			return getRuleContext(Or_predicateContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SQLParser.OR); }
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
		enterRule(_localctx, 248, RULE_or_predicate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1453); and_predicate();
			setState(1458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1454); match(OR);
					setState(1455); or_predicate();
					}
					} 
				}
				setState(1460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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
		public TerminalNode AND(int i) {
			return getToken(SQLParser.AND, i);
		}
		public Boolean_factorContext boolean_factor() {
			return getRuleContext(Boolean_factorContext.class,0);
		}
		public List<And_predicateContext> and_predicate() {
			return getRuleContexts(And_predicateContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(SQLParser.AND); }
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
		enterRule(_localctx, 250, RULE_and_predicate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1461); boolean_factor();
			setState(1466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1462); match(AND);
					setState(1463); and_predicate();
					}
					} 
				}
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Boolean_testContext boolean_test() {
			return getRuleContext(Boolean_testContext.class,0);
		}
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
		enterRule(_localctx, 252, RULE_boolean_factor);
		try {
			setState(1472);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469); boolean_test();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470); match(NOT);
				setState(1471); boolean_test();
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
		enterRule(_localctx, 254, RULE_boolean_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474); boolean_primary();
			setState(1476);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1475); is_clause();
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
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public Truth_valueContext truth_value() {
			return getRuleContext(Truth_valueContext.class,0);
		}
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
		enterRule(_localctx, 256, RULE_is_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478); match(IS);
			setState(1480);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1479); match(NOT);
				}
			}

			setState(1482); ((Is_clauseContext)_localctx).t = truth_value();
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
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
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
		enterRule(_localctx, 258, RULE_truth_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
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
		enterRule(_localctx, 260, RULE_boolean_primary);
		try {
			setState(1488);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486); predicate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487); boolean_predicand();
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
		public Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() {
			return getRuleContext(Nonparenthesized_value_expression_primaryContext.class,0);
		}
		public Parenthesized_boolean_value_expressionContext parenthesized_boolean_value_expression() {
			return getRuleContext(Parenthesized_boolean_value_expressionContext.class,0);
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
		enterRule(_localctx, 262, RULE_boolean_predicand);
		try {
			setState(1492);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490); parenthesized_boolean_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491); nonparenthesized_value_expression_primary();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
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
		enterRule(_localctx, 264, RULE_parenthesized_boolean_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494); match(LEFT_PAREN);
			setState(1495); boolean_value_expression();
			setState(1496); match(RIGHT_PAREN);
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
		public Explicit_row_value_constructorContext explicit_row_value_constructor() {
			return getRuleContext(Explicit_row_value_constructorContext.class,0);
		}
		public Row_value_special_caseContext row_value_special_case() {
			return getRuleContext(Row_value_special_caseContext.class,0);
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
		enterRule(_localctx, 266, RULE_row_value_expression);
		try {
			setState(1500);
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
			case ADD:
			case ALTER:
			case BETWEEN:
			case BY:
			case CATALOG:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case DAY:
			case DEFAULT:
			case DEC:
			case DECADE:
			case DENSE_RANK:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
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
			case NO:
			case OVERWRITE:
			case OTHERS:
			case PARTITION:
			case PARTITIONS:
			case PERCENT_RANK:
			case PRECEDING:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case RANK:
			case REGEXP:
			case RENAME:
			case REPAIR:
			case RESET:
			case RLIKE:
			case ROLLUP:
			case ROW:
			case ROWS:
			case ROW_NUMBER:
			case SECOND:
			case SESSION:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIES:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNBOUNDED:
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
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case MAP:
			case RECORD:
			case LEFT_PAREN:
			case NUMBER:
			case REAL_NUMBER:
			case Regular_Identifier:
			case Quoted_Identifier:
			case Character_String_Literal:
			case INET4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498); row_value_special_case();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499); explicit_row_value_constructor();
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
		enterRule(_localctx, 268, RULE_explicit_row_value_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502); match(NULL);
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
		public Row_value_constructor_predicandContext row_value_constructor_predicand() {
			return getRuleContext(Row_value_constructor_predicandContext.class,0);
		}
		public Row_value_special_caseContext row_value_special_case() {
			return getRuleContext(Row_value_special_caseContext.class,0);
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
		enterRule(_localctx, 270, RULE_row_value_predicand);
		try {
			setState(1506);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1504); row_value_special_case();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1505); row_value_constructor_predicand();
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
		public Common_value_expressionContext common_value_expression() {
			return getRuleContext(Common_value_expressionContext.class,0);
		}
		public Boolean_predicandContext boolean_predicand() {
			return getRuleContext(Boolean_predicandContext.class,0);
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
		enterRule(_localctx, 272, RULE_row_value_constructor_predicand);
		try {
			setState(1510);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1508); common_value_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1509); boolean_predicand();
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
		enterRule(_localctx, 274, RULE_row_value_special_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512); nonparenthesized_value_expression_primary();
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
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Window_clauseContext window_clause() {
			return getRuleContext(Window_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
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
		enterRule(_localctx, 276, RULE_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514); from_clause();
			setState(1516);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1515); where_clause();
				}
			}

			setState(1519);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1518); groupby_clause();
				}
			}

			setState(1522);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1521); having_clause();
				}
			}

			setState(1525);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1524); orderby_clause();
				}
			}

			setState(1528);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1527); window_clause();
				}
			}

			setState(1531);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1530); limit_clause();
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
		enterRule(_localctx, 278, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533); match(FROM);
			setState(1534); table_reference_list();
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
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
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
		enterRule(_localctx, 280, RULE_table_reference_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536); table_reference();
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1537); match(COMMA);
				setState(1538); table_reference();
				}
				}
				setState(1543);
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
		enterRule(_localctx, 282, RULE_table_reference);
		try {
			setState(1546);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1544); joined_table();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545); table_primary();
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
		public List<Joined_table_primaryContext> joined_table_primary() {
			return getRuleContexts(Joined_table_primaryContext.class);
		}
		public Joined_table_primaryContext joined_table_primary(int i) {
			return getRuleContext(Joined_table_primaryContext.class,i);
		}
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
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
		enterRule(_localctx, 284, RULE_joined_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1548); table_primary();
			setState(1550); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1549); joined_table_primary();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1552); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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
		public TerminalNode UNION() { return getToken(SQLParser.UNION, 0); }
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode CROSS() { return getToken(SQLParser.CROSS, 0); }
		public TerminalNode NATURAL() { return getToken(SQLParser.NATURAL, 0); }
		public Join_specificationContext join_specification() {
			return getRuleContext(Join_specificationContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
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
		enterRule(_localctx, 286, RULE_joined_table_primary);
		int _la;
		try {
			setState(1573);
			switch (_input.LA(1)) {
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1554); match(CROSS);
				setState(1555); match(JOIN);
				setState(1556); ((Joined_table_primaryContext)_localctx).right = table_primary();
				}
				break;
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1558);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
					{
					setState(1557); ((Joined_table_primaryContext)_localctx).t = join_type();
					}
				}

				setState(1560); match(JOIN);
				setState(1561); ((Joined_table_primaryContext)_localctx).right = table_primary();
				setState(1562); ((Joined_table_primaryContext)_localctx).s = join_specification();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564); match(NATURAL);
				setState(1566);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
					{
					setState(1565); ((Joined_table_primaryContext)_localctx).t = join_type();
					}
				}

				setState(1568); match(JOIN);
				setState(1569); ((Joined_table_primaryContext)_localctx).right = table_primary();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 4);
				{
				setState(1570); match(UNION);
				setState(1571); match(JOIN);
				setState(1572); ((Joined_table_primaryContext)_localctx).right = table_primary();
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
		public TerminalNode CROSS() { return getToken(SQLParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
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
		enterRule(_localctx, 288, RULE_cross_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575); match(CROSS);
			setState(1576); match(JOIN);
			setState(1577); ((Cross_joinContext)_localctx).r = table_primary();
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
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public Join_specificationContext join_specification() {
			return getRuleContext(Join_specificationContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
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
		enterRule(_localctx, 290, RULE_qualified_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
				{
				setState(1579); ((Qualified_joinContext)_localctx).t = join_type();
				}
			}

			setState(1582); match(JOIN);
			setState(1583); ((Qualified_joinContext)_localctx).r = table_primary();
			setState(1584); ((Qualified_joinContext)_localctx).s = join_specification();
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
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SQLParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
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
		enterRule(_localctx, 292, RULE_natural_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586); match(NATURAL);
			setState(1588);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
				{
				setState(1587); ((Natural_joinContext)_localctx).t = join_type();
				}
			}

			setState(1590); match(JOIN);
			setState(1591); ((Natural_joinContext)_localctx).r = table_primary();
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
		public TerminalNode UNION() { return getToken(SQLParser.UNION, 0); }
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
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
		enterRule(_localctx, 294, RULE_union_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593); match(UNION);
			setState(1594); match(JOIN);
			setState(1595); ((Union_joinContext)_localctx).r = table_primary();
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
		enterRule(_localctx, 296, RULE_join_type);
		try {
			setState(1599);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1598); ((Join_typeContext)_localctx).t = outer_join_type();
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
		enterRule(_localctx, 298, RULE_outer_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601); outer_join_type_part2();
			setState(1603);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(1602); match(OUTER);
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
		public TerminalNode LEFT() { return getToken(SQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SQLParser.FULL, 0); }
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
		enterRule(_localctx, 300, RULE_outer_join_type_part2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
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
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public Named_columns_joinContext named_columns_join() {
			return getRuleContext(Named_columns_joinContext.class,0);
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
		enterRule(_localctx, 302, RULE_join_specification);
		try {
			setState(1609);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1608); named_columns_join();
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
		enterRule(_localctx, 304, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611); match(ON);
			setState(1612); search_condition();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
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
		enterRule(_localctx, 306, RULE_named_columns_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614); match(USING);
			setState(1615); match(LEFT_PAREN);
			setState(1616); ((Named_columns_joinContext)_localctx).f = column_reference_list();
			setState(1617); match(RIGHT_PAREN);
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
		public Table_or_query_nameContext table_or_query_name() {
			return getRuleContext(Table_or_query_nameContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
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
		enterRule(_localctx, 308, RULE_table_primary);
		int _la;
		try {
			setState(1659);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619); table_or_query_name();
				setState(1624);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << AVG) | (1L << ADD) | (1L << ALTER) | (1L << BETWEEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BY - 64)) | (1L << (CATALOG - 64)) | (1L << (CENTURY - 64)) | (1L << (CHARACTER - 64)) | (1L << (COLLECT - 64)) | (1L << (COALESCE - 64)) | (1L << (COLUMN - 64)) | (1L << (COUNT - 64)) | (1L << (CUBE - 64)) | (1L << (CUME_DIST - 64)) | (1L << (CURRENT - 64)) | (1L << (DAY - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DENSE_RANK - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUDE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FIRST_VALUE - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAST - 64)) | (1L << (LAST_VALUE - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (NO - 64)) | (1L << (OVERWRITE - 64)) | (1L << (OTHERS - 64)) | (1L << (PARTITION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PARTITIONS - 128)) | (1L << (PERCENT_RANK - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PURGE - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RANK - 128)) | (1L << (REGEXP - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (RESET - 128)) | (1L << (RLIKE - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (ROW_NUMBER - 128)) | (1L << (SECOND - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SIMILAR - 128)) | (1L << (STDDEV_POP - 128)) | (1L << (STDDEV_SAMP - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUM - 128)) | (1L << (TABLESPACE - 128)) | (1L << (THAN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEZONE - 128)) | (1L << (TIMEZONE_HOUR - 128)) | (1L << (TIMEZONE_MINUTE - 128)) | (1L << (TRIM - 128)) | (1L << (TO - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNKNOWN - 128)) | (1L << (VALUES - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (DECIMAL - 192)) | (1L << (CHAR - 192)) | (1L << (VARCHAR - 192)) | (1L << (NCHAR - 192)) | (1L << (NVARCHAR - 192)) | (1L << (DATE - 192)) | (1L << (INTERVAL - 192)) | (1L << (TIME - 192)) | (1L << (TIMETZ - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TIMESTAMPTZ - 192)) | (1L << (TEXT - 192)) | (1L << (VARBINARY - 192)) | (1L << (BLOB - 192)) | (1L << (BYTEA - 192)) | (1L << (MAP - 192)) | (1L << (RECORD - 192)) | (1L << (Regular_Identifier - 192)))) != 0) || _la==Quoted_Identifier || _la==INET4) {
					{
					setState(1621);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1620); match(AS);
						}
					}

					setState(1623); ((Table_primaryContext)_localctx).alias = identifier();
					}
				}

				setState(1630);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1626); match(LEFT_PAREN);
					setState(1627); column_name_list();
					setState(1628); match(RIGHT_PAREN);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632); match(LEFT_PAREN);
				setState(1633); table_or_query_name();
				setState(1638);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << AVG) | (1L << ADD) | (1L << ALTER) | (1L << BETWEEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BY - 64)) | (1L << (CATALOG - 64)) | (1L << (CENTURY - 64)) | (1L << (CHARACTER - 64)) | (1L << (COLLECT - 64)) | (1L << (COALESCE - 64)) | (1L << (COLUMN - 64)) | (1L << (COUNT - 64)) | (1L << (CUBE - 64)) | (1L << (CUME_DIST - 64)) | (1L << (CURRENT - 64)) | (1L << (DAY - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DENSE_RANK - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUDE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FIRST_VALUE - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAST - 64)) | (1L << (LAST_VALUE - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (NO - 64)) | (1L << (OVERWRITE - 64)) | (1L << (OTHERS - 64)) | (1L << (PARTITION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PARTITIONS - 128)) | (1L << (PERCENT_RANK - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PURGE - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RANK - 128)) | (1L << (REGEXP - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (RESET - 128)) | (1L << (RLIKE - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (ROW_NUMBER - 128)) | (1L << (SECOND - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SIMILAR - 128)) | (1L << (STDDEV_POP - 128)) | (1L << (STDDEV_SAMP - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUM - 128)) | (1L << (TABLESPACE - 128)) | (1L << (THAN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEZONE - 128)) | (1L << (TIMEZONE_HOUR - 128)) | (1L << (TIMEZONE_MINUTE - 128)) | (1L << (TRIM - 128)) | (1L << (TO - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNKNOWN - 128)) | (1L << (VALUES - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (DECIMAL - 192)) | (1L << (CHAR - 192)) | (1L << (VARCHAR - 192)) | (1L << (NCHAR - 192)) | (1L << (NVARCHAR - 192)) | (1L << (DATE - 192)) | (1L << (INTERVAL - 192)) | (1L << (TIME - 192)) | (1L << (TIMETZ - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TIMESTAMPTZ - 192)) | (1L << (TEXT - 192)) | (1L << (VARBINARY - 192)) | (1L << (BLOB - 192)) | (1L << (BYTEA - 192)) | (1L << (MAP - 192)) | (1L << (RECORD - 192)) | (1L << (Regular_Identifier - 192)))) != 0) || _la==Quoted_Identifier || _la==INET4) {
					{
					setState(1635);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1634); match(AS);
						}
					}

					setState(1637); ((Table_primaryContext)_localctx).alias = identifier();
					}
				}

				setState(1644);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1640); match(LEFT_PAREN);
					setState(1641); column_name_list();
					setState(1642); match(RIGHT_PAREN);
					}
				}

				setState(1646); match(RIGHT_PAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1648); derived_table();
				setState(1650);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1649); match(AS);
					}
				}

				setState(1652); ((Table_primaryContext)_localctx).name = identifier();
				setState(1657);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1653); match(LEFT_PAREN);
					setState(1654); column_name_list();
					setState(1655); match(RIGHT_PAREN);
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

	public static class Column_name_listContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
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
		enterRule(_localctx, 310, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); identifier();
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1662); match(COMMA);
				setState(1663); identifier();
				}
				}
				setState(1668);
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
		enterRule(_localctx, 312, RULE_derived_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669); table_subquery();
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
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
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
		enterRule(_localctx, 314, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671); match(WHERE);
			setState(1672); search_condition();
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
		enterRule(_localctx, 316, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674); value_expression();
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
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public Grouping_element_listContext grouping_element_list() {
			return getRuleContext(Grouping_element_listContext.class,0);
		}
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
		enterRule(_localctx, 318, RULE_groupby_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676); match(GROUP);
			setState(1677); match(BY);
			setState(1678); ((Groupby_clauseContext)_localctx).g = grouping_element_list();
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
		public List<Grouping_elementContext> grouping_element() {
			return getRuleContexts(Grouping_elementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Grouping_elementContext grouping_element(int i) {
			return getRuleContext(Grouping_elementContext.class,i);
		}
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
		enterRule(_localctx, 320, RULE_grouping_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680); grouping_element();
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1681); match(COMMA);
				setState(1682); grouping_element();
				}
				}
				setState(1687);
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
		public Rollup_listContext rollup_list() {
			return getRuleContext(Rollup_listContext.class,0);
		}
		public Ordinary_grouping_setContext ordinary_grouping_set() {
			return getRuleContext(Ordinary_grouping_setContext.class,0);
		}
		public Empty_grouping_setContext empty_grouping_set() {
			return getRuleContext(Empty_grouping_setContext.class,0);
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
		enterRule(_localctx, 322, RULE_grouping_element);
		try {
			setState(1692);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688); rollup_list();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689); cube_list();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1690); empty_grouping_set();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1691); ordinary_grouping_set();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Row_value_predicand_listContext row_value_predicand_list() {
			return getRuleContext(Row_value_predicand_listContext.class,0);
		}
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
		enterRule(_localctx, 324, RULE_ordinary_grouping_set);
		try {
			setState(1699);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1694); row_value_predicand();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1695); match(LEFT_PAREN);
				setState(1696); row_value_predicand_list();
				setState(1697); match(RIGHT_PAREN);
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
		enterRule(_localctx, 326, RULE_ordinary_grouping_set_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701); ordinary_grouping_set();
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1702); match(COMMA);
				setState(1703); ordinary_grouping_set();
				}
				}
				setState(1708);
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
		public TerminalNode ROLLUP() { return getToken(SQLParser.ROLLUP, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Ordinary_grouping_set_listContext ordinary_grouping_set_list() {
			return getRuleContext(Ordinary_grouping_set_listContext.class,0);
		}
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
		enterRule(_localctx, 328, RULE_rollup_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709); match(ROLLUP);
			setState(1710); match(LEFT_PAREN);
			setState(1711); ((Rollup_listContext)_localctx).c = ordinary_grouping_set_list();
			setState(1712); match(RIGHT_PAREN);
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
		public TerminalNode CUBE() { return getToken(SQLParser.CUBE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Ordinary_grouping_set_listContext ordinary_grouping_set_list() {
			return getRuleContext(Ordinary_grouping_set_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
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
		enterRule(_localctx, 330, RULE_cube_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714); match(CUBE);
			setState(1715); match(LEFT_PAREN);
			setState(1716); ((Cube_listContext)_localctx).c = ordinary_grouping_set_list();
			setState(1717); match(RIGHT_PAREN);
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
		enterRule(_localctx, 332, RULE_empty_grouping_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719); match(LEFT_PAREN);
			setState(1720); match(RIGHT_PAREN);
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
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SQLParser.HAVING, 0); }
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
		enterRule(_localctx, 334, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722); match(HAVING);
			setState(1723); boolean_value_expression();
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
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
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
		enterRule(_localctx, 336, RULE_row_value_predicand_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725); row_value_predicand();
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1726); match(COMMA);
				setState(1727); row_value_predicand();
				}
				}
				setState(1732);
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

	public static class Window_clauseContext extends ParserRuleContext {
		public Window_definition_listContext window_definition_list() {
			return getRuleContext(Window_definition_listContext.class,0);
		}
		public TerminalNode WINDOW() { return getToken(SQLParser.WINDOW, 0); }
		public Window_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_clauseContext window_clause() throws RecognitionException {
		Window_clauseContext _localctx = new Window_clauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_window_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733); match(WINDOW);
			setState(1734); window_definition_list();
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

	public static class Window_definition_listContext extends ParserRuleContext {
		public List<Window_definitionContext> window_definition() {
			return getRuleContexts(Window_definitionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Window_definitionContext window_definition(int i) {
			return getRuleContext(Window_definitionContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Window_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_definition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_definition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_definition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_definition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_definition_listContext window_definition_list() throws RecognitionException {
		Window_definition_listContext _localctx = new Window_definition_listContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_window_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736); window_definition();
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1737); match(COMMA);
				setState(1738); window_definition();
				}
				}
				setState(1743);
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

	public static class Window_definitionContext extends ParserRuleContext {
		public Window_specificationContext window_specification() {
			return getRuleContext(Window_specificationContext.class,0);
		}
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Window_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_definitionContext window_definition() throws RecognitionException {
		Window_definitionContext _localctx = new Window_definitionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_window_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744); window_name();
			setState(1745); match(AS);
			setState(1746); window_specification();
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

	public static class Window_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748); identifier();
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

	public static class Window_specificationContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Window_specification_detailsContext window_specification_details() {
			return getRuleContext(Window_specification_detailsContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Window_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_specificationContext window_specification() throws RecognitionException {
		Window_specificationContext _localctx = new Window_specificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_window_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750); match(LEFT_PAREN);
			setState(1751); window_specification_details();
			setState(1752); match(RIGHT_PAREN);
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

	public static class Window_specification_detailsContext extends ParserRuleContext {
		public Existing_window_nameContext existing_window_name() {
			return getRuleContext(Existing_window_nameContext.class,0);
		}
		public Window_frame_clauseContext window_frame_clause() {
			return getRuleContext(Window_frame_clauseContext.class,0);
		}
		public Window_partition_clauseContext window_partition_clause() {
			return getRuleContext(Window_partition_clauseContext.class,0);
		}
		public Window_order_clauseContext window_order_clause() {
			return getRuleContext(Window_order_clauseContext.class,0);
		}
		public Window_specification_detailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_specification_details; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_specification_details(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_specification_details(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_specification_details(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_specification_detailsContext window_specification_details() throws RecognitionException {
		Window_specification_detailsContext _localctx = new Window_specification_detailsContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_window_specification_details);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1754); existing_window_name();
				}
				break;
			}
			setState(1758);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1757); window_partition_clause();
				}
			}

			setState(1761);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1760); window_order_clause();
				}
			}

			setState(1764);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1763); window_frame_clause();
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

	public static class Existing_window_nameContext extends ParserRuleContext {
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public Existing_window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existing_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExisting_window_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExisting_window_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExisting_window_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Existing_window_nameContext existing_window_name() throws RecognitionException {
		Existing_window_nameContext _localctx = new Existing_window_nameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_existing_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766); window_name();
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

	public static class Window_partition_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public Row_value_predicand_listContext row_value_predicand_list() {
			return getRuleContext(Row_value_predicand_listContext.class,0);
		}
		public Window_partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_partition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_partition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_partition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_partition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_partition_clauseContext window_partition_clause() throws RecognitionException {
		Window_partition_clauseContext _localctx = new Window_partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_window_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768); match(PARTITION);
			setState(1769); match(BY);
			setState(1770); row_value_predicand_list();
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

	public static class Window_order_clauseContext extends ParserRuleContext {
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Window_order_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_order_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_order_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_order_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_order_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_order_clauseContext window_order_clause() throws RecognitionException {
		Window_order_clauseContext _localctx = new Window_order_clauseContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_window_order_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772); orderby_clause();
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

	public static class Window_frame_clauseContext extends ParserRuleContext {
		public Window_frame_unitsContext window_frame_units() {
			return getRuleContext(Window_frame_unitsContext.class,0);
		}
		public Window_frame_exclusionContext window_frame_exclusion() {
			return getRuleContext(Window_frame_exclusionContext.class,0);
		}
		public Window_frame_extentContext window_frame_extent() {
			return getRuleContext(Window_frame_extentContext.class,0);
		}
		public Window_frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_frame_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_frame_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_frame_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_clauseContext window_frame_clause() throws RecognitionException {
		Window_frame_clauseContext _localctx = new Window_frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_window_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774); window_frame_units();
			setState(1775); window_frame_extent();
			setState(1777);
			_la = _input.LA(1);
			if (_la==EXCLUDE) {
				{
				setState(1776); window_frame_exclusion();
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

	public static class Window_frame_unitsContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(SQLParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SQLParser.ROWS, 0); }
		public Window_frame_unitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_units; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_frame_units(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_frame_units(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_frame_units(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_unitsContext window_frame_units() throws RecognitionException {
		Window_frame_unitsContext _localctx = new Window_frame_unitsContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_window_frame_units);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
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

	public static class Window_frame_extentContext extends ParserRuleContext {
		public Window_frame_start_boundContext window_frame_start_bound() {
			return getRuleContext(Window_frame_start_boundContext.class,0);
		}
		public Window_frame_betweenContext window_frame_between() {
			return getRuleContext(Window_frame_betweenContext.class,0);
		}
		public Window_frame_extentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_extent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_frame_extent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_frame_extent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_frame_extent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_extentContext window_frame_extent() throws RecognitionException {
		Window_frame_extentContext _localctx = new Window_frame_extentContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_window_frame_extent);
		try {
			setState(1783);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
			case CURRENT:
			case UNBOUNDED:
			case UNKNOWN:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case NUMBER:
			case REAL_NUMBER:
			case Character_String_Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781); window_frame_start_bound();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782); window_frame_between();
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

	public static class Window_frame_start_boundContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(SQLParser.ROW, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLParser.PRECEDING, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SQLParser.UNBOUNDED, 0); }
		public TerminalNode CURRENT() { return getToken(SQLParser.CURRENT, 0); }
		public Unsigned_value_specificationContext unsigned_value_specification() {
			return getRuleContext(Unsigned_value_specificationContext.class,0);
		}
		public Window_frame_start_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_start_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_frame_start_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_frame_start_bound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_frame_start_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_start_boundContext window_frame_start_bound() throws RecognitionException {
		Window_frame_start_boundContext _localctx = new Window_frame_start_boundContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_window_frame_start_bound);
		try {
			setState(1792);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1785); match(UNBOUNDED);
				setState(1786); match(PRECEDING);
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case NUMBER:
			case REAL_NUMBER:
			case Character_String_Literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1787); unsigned_value_specification();
				setState(1788); match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1790); match(CURRENT);
				setState(1791); match(ROW);
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

	public static class Window_frame_betweenContext extends ParserRuleContext {
		public Window_frame_start_boundContext bound1;
		public Window_frame_end_boundContext bound2;
		public Window_frame_start_boundContext window_frame_start_bound() {
			return getRuleContext(Window_frame_start_boundContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public Window_frame_end_boundContext window_frame_end_bound() {
			return getRuleContext(Window_frame_end_boundContext.class,0);
		}
		public Window_frame_betweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_between; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_frame_between(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_frame_between(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_frame_between(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_betweenContext window_frame_between() throws RecognitionException {
		Window_frame_betweenContext _localctx = new Window_frame_betweenContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_window_frame_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794); match(BETWEEN);
			setState(1795); ((Window_frame_betweenContext)_localctx).bound1 = window_frame_start_bound();
			setState(1796); match(AND);
			setState(1797); ((Window_frame_betweenContext)_localctx).bound2 = window_frame_end_bound();
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

	public static class Window_frame_end_boundContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(SQLParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SQLParser.UNBOUNDED, 0); }
		public TerminalNode CURRENT() { return getToken(SQLParser.CURRENT, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLParser.FOLLOWING, 0); }
		public Unsigned_value_specificationContext unsigned_value_specification() {
			return getRuleContext(Unsigned_value_specificationContext.class,0);
		}
		public Window_frame_end_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_end_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_frame_end_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_frame_end_bound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_frame_end_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_end_boundContext window_frame_end_bound() throws RecognitionException {
		Window_frame_end_boundContext _localctx = new Window_frame_end_boundContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_window_frame_end_bound);
		try {
			setState(1806);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1799); match(UNBOUNDED);
				setState(1800); match(FOLLOWING);
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case NUMBER:
			case REAL_NUMBER:
			case Character_String_Literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1801); unsigned_value_specification();
				setState(1802); match(FOLLOWING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1804); match(CURRENT);
				setState(1805); match(ROW);
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

	public static class Window_frame_exclusionContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(SQLParser.ROW, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public TerminalNode CURRENT() { return getToken(SQLParser.CURRENT, 0); }
		public TerminalNode OTHERS() { return getToken(SQLParser.OTHERS, 0); }
		public TerminalNode EXCLUDE() { return getToken(SQLParser.EXCLUDE, 0); }
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public TerminalNode TIES() { return getToken(SQLParser.TIES, 0); }
		public Window_frame_exclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_exclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWindow_frame_exclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWindow_frame_exclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitWindow_frame_exclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_exclusionContext window_frame_exclusion() throws RecognitionException {
		Window_frame_exclusionContext _localctx = new Window_frame_exclusionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_window_frame_exclusion);
		try {
			setState(1818);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808); match(EXCLUDE);
				setState(1809); match(CURRENT);
				setState(1810); match(ROW);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1811); match(EXCLUDE);
				setState(1812); match(GROUP);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1813); match(EXCLUDE);
				setState(1814); match(TIES);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1815); match(EXCLUDE);
				setState(1816); match(NO);
				setState(1817); match(OTHERS);
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
		enterRule(_localctx, 370, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820); query_expression_body();
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
		enterRule(_localctx, 372, RULE_query_expression_body);
		try {
			setState(1824);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1822); non_join_query_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1823); joined_table();
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
		public Non_join_query_termContext non_join_query_term() {
			return getRuleContext(Non_join_query_termContext.class,0);
		}
		public List<TerminalNode> UNION() { return getTokens(SQLParser.UNION); }
		public Query_termContext query_term(int i) {
			return getRuleContext(Query_termContext.class,i);
		}
		public TerminalNode DISTINCT(int i) {
			return getToken(SQLParser.DISTINCT, i);
		}
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public TerminalNode UNION(int i) {
			return getToken(SQLParser.UNION, i);
		}
		public TerminalNode EXCEPT(int i) {
			return getToken(SQLParser.EXCEPT, i);
		}
		public TerminalNode ALL(int i) {
			return getToken(SQLParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(SQLParser.DISTINCT); }
		public List<TerminalNode> EXCEPT() { return getTokens(SQLParser.EXCEPT); }
		public List<Query_termContext> query_term() {
			return getRuleContexts(Query_termContext.class);
		}
		public List<TerminalNode> ALL() { return getTokens(SQLParser.ALL); }
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
		enterRule(_localctx, 374, RULE_non_join_query_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1826); non_join_query_term();
				}
				break;

			case 2:
				{
				setState(1827); joined_table();
				setState(1828);
				_la = _input.LA(1);
				if ( !(_la==EXCEPT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1830);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(1829);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1832); query_term();
				}
				break;
			}
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCEPT || _la==UNION) {
				{
				{
				setState(1836);
				_la = _input.LA(1);
				if ( !(_la==EXCEPT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1838);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(1837);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1840); query_term();
				}
				}
				setState(1845);
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
		public Non_join_query_termContext non_join_query_term() {
			return getRuleContext(Non_join_query_termContext.class,0);
		}
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
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
		enterRule(_localctx, 376, RULE_query_term);
		try {
			setState(1848);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1846); non_join_query_term();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1847); joined_table();
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
		public TerminalNode INTERSECT(int i) {
			return getToken(SQLParser.INTERSECT, i);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(SQLParser.INTERSECT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(SQLParser.DISTINCT, i);
		}
		public Non_join_query_primaryContext non_join_query_primary() {
			return getRuleContext(Non_join_query_primaryContext.class,0);
		}
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public TerminalNode ALL(int i) {
			return getToken(SQLParser.ALL, i);
		}
		public Query_primaryContext query_primary(int i) {
			return getRuleContext(Query_primaryContext.class,i);
		}
		public List<Query_primaryContext> query_primary() {
			return getRuleContexts(Query_primaryContext.class);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(SQLParser.DISTINCT); }
		public List<TerminalNode> ALL() { return getTokens(SQLParser.ALL); }
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
		enterRule(_localctx, 378, RULE_non_join_query_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1850); non_join_query_primary();
				}
				break;

			case 2:
				{
				setState(1851); joined_table();
				setState(1852); match(INTERSECT);
				setState(1854);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(1853);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1856); query_primary();
				}
				break;
			}
			setState(1867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERSECT) {
				{
				{
				setState(1860); match(INTERSECT);
				setState(1862);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(1861);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1864); query_primary();
				}
				}
				setState(1869);
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
		public Non_join_query_primaryContext non_join_query_primary() {
			return getRuleContext(Non_join_query_primaryContext.class,0);
		}
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
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
		enterRule(_localctx, 380, RULE_query_primary);
		try {
			setState(1872);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1870); non_join_query_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1871); joined_table();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Non_join_query_expressionContext non_join_query_expression() {
			return getRuleContext(Non_join_query_expressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Simple_tableContext simple_table() {
			return getRuleContext(Simple_tableContext.class,0);
		}
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
		enterRule(_localctx, 382, RULE_non_join_query_primary);
		try {
			setState(1879);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1874); simple_table();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1875); match(LEFT_PAREN);
				setState(1876); non_join_query_expression();
				setState(1877); match(RIGHT_PAREN);
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
		enterRule(_localctx, 384, RULE_simple_table);
		try {
			setState(1883);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881); query_specification();
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882); explicit_table();
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
		enterRule(_localctx, 386, RULE_explicit_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885); match(TABLE);
			setState(1886); table_or_query_name();
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
		enterRule(_localctx, 388, RULE_table_or_query_name);
		try {
			setState(1890);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1888); table_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889); identifier();
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
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
		enterRule(_localctx, 390, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892); identifier();
			setState(1899);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1893); match(DOT);
				setState(1894); identifier();
				setState(1897);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1895); match(DOT);
					setState(1896); identifier();
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

	public static class Column_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901); identifier();
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
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
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
		enterRule(_localctx, 394, RULE_query_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903); match(SELECT);
			setState(1905);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(1904); set_qualifier();
				}
			}

			setState(1907); select_list();
			setState(1909);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1908); table_expression();
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
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Select_sublistContext select_sublist(int i) {
			return getRuleContext(Select_sublistContext.class,i);
		}
		public List<Select_sublistContext> select_sublist() {
			return getRuleContexts(Select_sublistContext.class);
		}
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
		enterRule(_localctx, 396, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911); select_sublist();
			setState(1916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1912); match(COMMA);
				setState(1913); select_sublist();
				}
				}
				setState(1918);
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
		public Qualified_asteriskContext qualified_asterisk() {
			return getRuleContext(Qualified_asteriskContext.class,0);
		}
		public Derived_columnContext derived_column() {
			return getRuleContext(Derived_columnContext.class,0);
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
		enterRule(_localctx, 398, RULE_select_sublist);
		try {
			setState(1921);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1919); derived_column();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1920); qualified_asterisk();
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
		enterRule(_localctx, 400, RULE_derived_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923); value_expression();
			setState(1925);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << AVG) | (1L << ADD) | (1L << ALTER) | (1L << BETWEEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BY - 64)) | (1L << (CATALOG - 64)) | (1L << (CENTURY - 64)) | (1L << (CHARACTER - 64)) | (1L << (COLLECT - 64)) | (1L << (COALESCE - 64)) | (1L << (COLUMN - 64)) | (1L << (COUNT - 64)) | (1L << (CUBE - 64)) | (1L << (CUME_DIST - 64)) | (1L << (CURRENT - 64)) | (1L << (DAY - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DENSE_RANK - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUDE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FIRST_VALUE - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAST - 64)) | (1L << (LAST_VALUE - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (NO - 64)) | (1L << (OVERWRITE - 64)) | (1L << (OTHERS - 64)) | (1L << (PARTITION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PARTITIONS - 128)) | (1L << (PERCENT_RANK - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PURGE - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RANK - 128)) | (1L << (REGEXP - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (RESET - 128)) | (1L << (RLIKE - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (ROW_NUMBER - 128)) | (1L << (SECOND - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SIMILAR - 128)) | (1L << (STDDEV_POP - 128)) | (1L << (STDDEV_SAMP - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUM - 128)) | (1L << (TABLESPACE - 128)) | (1L << (THAN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEZONE - 128)) | (1L << (TIMEZONE_HOUR - 128)) | (1L << (TIMEZONE_MINUTE - 128)) | (1L << (TRIM - 128)) | (1L << (TO - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNKNOWN - 128)) | (1L << (VALUES - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (DECIMAL - 192)) | (1L << (CHAR - 192)) | (1L << (VARCHAR - 192)) | (1L << (NCHAR - 192)) | (1L << (NVARCHAR - 192)) | (1L << (DATE - 192)) | (1L << (INTERVAL - 192)) | (1L << (TIME - 192)) | (1L << (TIMETZ - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TIMESTAMPTZ - 192)) | (1L << (TEXT - 192)) | (1L << (VARBINARY - 192)) | (1L << (BLOB - 192)) | (1L << (BYTEA - 192)) | (1L << (MAP - 192)) | (1L << (RECORD - 192)) | (1L << (Regular_Identifier - 192)))) != 0) || _la==Quoted_Identifier || _la==INET4) {
				{
				setState(1924); as_clause();
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
		public IdentifierContext tb_name;
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public AsteriskContext asterisk() {
			return getRuleContext(AsteriskContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 402, RULE_qualified_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (AVG - 60)) | (1L << (ADD - 60)) | (1L << (ALTER - 60)) | (1L << (BETWEEN - 60)) | (1L << (BY - 60)) | (1L << (CATALOG - 60)) | (1L << (CENTURY - 60)) | (1L << (CHARACTER - 60)) | (1L << (COLLECT - 60)) | (1L << (COALESCE - 60)) | (1L << (COLUMN - 60)) | (1L << (COUNT - 60)) | (1L << (CUBE - 60)) | (1L << (CUME_DIST - 60)) | (1L << (CURRENT - 60)) | (1L << (DAY - 60)) | (1L << (DEFAULT - 60)) | (1L << (DEC - 60)) | (1L << (DECADE - 60)) | (1L << (DENSE_RANK - 60)) | (1L << (DOW - 60)) | (1L << (DOY - 60)) | (1L << (DROP - 60)) | (1L << (EPOCH - 60)) | (1L << (EVERY - 60)) | (1L << (EXCLUDE - 60)) | (1L << (EXISTS - 60)) | (1L << (EXPLAIN - 60)) | (1L << (EXTERNAL - 60)) | (1L << (EXTRACT - 60)) | (1L << (FILTER - 60)) | (1L << (FIRST - 60)) | (1L << (FIRST_VALUE - 60)) | (1L << (FOLLOWING - 60)) | (1L << (FORMAT - 60)) | (1L << (FUSION - 60)) | (1L << (GROUPING - 60)) | (1L << (HASH - 60)) | (1L << (INDEX - 60)) | (1L << (INSERT - 60)) | (1L << (INTERSECTION - 60)) | (1L << (ISODOW - 60)) | (1L << (ISOYEAR - 60)) | (1L << (LAST - 60)) | (1L << (LAST_VALUE - 60)) | (1L << (LESS - 60)) | (1L << (LIST - 60)) | (1L << (LOCATION - 60)) | (1L << (MAX - 60)) | (1L << (MAXVALUE - 60)) | (1L << (MICROSECONDS - 60)) | (1L << (MILLENNIUM - 60)) | (1L << (MILLISECONDS - 60)) | (1L << (MIN - 60)) | (1L << (MINUTE - 60)) | (1L << (MONTH - 60)) | (1L << (NATIONAL - 60)) | (1L << (NULLIF - 60)))) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (NO - 124)) | (1L << (OVERWRITE - 124)) | (1L << (OTHERS - 124)) | (1L << (PARTITION - 124)) | (1L << (PARTITIONS - 124)) | (1L << (PERCENT_RANK - 124)) | (1L << (PRECEDING - 124)) | (1L << (PRECISION - 124)) | (1L << (PURGE - 124)) | (1L << (QUARTER - 124)) | (1L << (RANGE - 124)) | (1L << (RANK - 124)) | (1L << (REGEXP - 124)) | (1L << (RENAME - 124)) | (1L << (REPAIR - 124)) | (1L << (RESET - 124)) | (1L << (RLIKE - 124)) | (1L << (ROLLUP - 124)) | (1L << (ROW - 124)) | (1L << (ROWS - 124)) | (1L << (ROW_NUMBER - 124)) | (1L << (SECOND - 124)) | (1L << (SESSION - 124)) | (1L << (SET - 124)) | (1L << (SIMILAR - 124)) | (1L << (STDDEV_POP - 124)) | (1L << (STDDEV_SAMP - 124)) | (1L << (SUBPARTITION - 124)) | (1L << (SUM - 124)) | (1L << (TABLESPACE - 124)) | (1L << (THAN - 124)) | (1L << (TIES - 124)) | (1L << (TIMEZONE - 124)) | (1L << (TIMEZONE_HOUR - 124)) | (1L << (TIMEZONE_MINUTE - 124)) | (1L << (TRIM - 124)) | (1L << (TO - 124)) | (1L << (UNBOUNDED - 124)) | (1L << (UNKNOWN - 124)) | (1L << (VALUES - 124)) | (1L << (VAR_SAMP - 124)) | (1L << (VAR_POP - 124)) | (1L << (VARYING - 124)) | (1L << (WEEK - 124)) | (1L << (YEAR - 124)) | (1L << (ZONE - 124)) | (1L << (BOOLEAN - 124)) | (1L << (BOOL - 124)) | (1L << (BIT - 124)) | (1L << (VARBIT - 124)) | (1L << (INT1 - 124)) | (1L << (INT2 - 124)) | (1L << (INT4 - 124)) | (1L << (INT8 - 124)) | (1L << (TINYINT - 124)) | (1L << (SMALLINT - 124)) | (1L << (INT - 124)) | (1L << (INTEGER - 124)) | (1L << (BIGINT - 124)) | (1L << (FLOAT4 - 124)) | (1L << (FLOAT8 - 124)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (REAL - 188)) | (1L << (FLOAT - 188)) | (1L << (DOUBLE - 188)) | (1L << (NUMERIC - 188)) | (1L << (DECIMAL - 188)) | (1L << (CHAR - 188)) | (1L << (VARCHAR - 188)) | (1L << (NCHAR - 188)) | (1L << (NVARCHAR - 188)) | (1L << (DATE - 188)) | (1L << (INTERVAL - 188)) | (1L << (TIME - 188)) | (1L << (TIMETZ - 188)) | (1L << (TIMESTAMP - 188)) | (1L << (TIMESTAMPTZ - 188)) | (1L << (TEXT - 188)) | (1L << (VARBINARY - 188)) | (1L << (BLOB - 188)) | (1L << (BYTEA - 188)) | (1L << (MAP - 188)) | (1L << (RECORD - 188)))) != 0) || ((((_la - 255)) & ~0x3f) == 0 && ((1L << (_la - 255)) & ((1L << (Regular_Identifier - 255)) | (1L << (Quoted_Identifier - 255)) | (1L << (INET4 - 255)))) != 0)) {
				{
				setState(1927); ((Qualified_asteriskContext)_localctx).tb_name = identifier();
				setState(1928); match(DOT);
				}
			}

			setState(1932); asterisk();
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

	public static class AsteriskContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934); match(MULTIPLY);
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
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
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
		enterRule(_localctx, 406, RULE_set_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
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
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
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
		enterRule(_localctx, 408, RULE_column_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938); identifier();
			setState(1943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1939); match(DOT);
				setState(1940); identifier();
				}
				}
				setState(1945);
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

	public static class As_clauseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
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
		enterRule(_localctx, 410, RULE_as_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1946); match(AS);
				}
			}

			setState(1949); identifier();
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
		public Column_referenceContext column_reference(int i) {
			return getRuleContext(Column_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
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
		enterRule(_localctx, 412, RULE_column_reference_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951); column_reference();
			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1952); match(COMMA);
				setState(1953); column_reference();
				}
				}
				setState(1958);
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
		enterRule(_localctx, 414, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959); subquery();
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
		enterRule(_localctx, 416, RULE_row_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961); subquery();
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
		enterRule(_localctx, 418, RULE_table_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963); subquery();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
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
		enterRule(_localctx, 420, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965); match(LEFT_PAREN);
			setState(1966); query_expression();
			setState(1967); match(RIGHT_PAREN);
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
		public Null_predicateContext null_predicate() {
			return getRuleContext(Null_predicateContext.class,0);
		}
		public In_predicateContext in_predicate() {
			return getRuleContext(In_predicateContext.class,0);
		}
		public Exists_predicateContext exists_predicate() {
			return getRuleContext(Exists_predicateContext.class,0);
		}
		public Comparison_predicateContext comparison_predicate() {
			return getRuleContext(Comparison_predicateContext.class,0);
		}
		public Between_predicateContext between_predicate() {
			return getRuleContext(Between_predicateContext.class,0);
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
		enterRule(_localctx, 422, RULE_predicate);
		try {
			setState(1975);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1969); comparison_predicate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1970); between_predicate();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1971); in_predicate();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1972); pattern_matching_predicate();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1973); null_predicate();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1974); exists_predicate();
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
		enterRule(_localctx, 424, RULE_comparison_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977); ((Comparison_predicateContext)_localctx).left = row_value_predicand();
			setState(1978); ((Comparison_predicateContext)_localctx).c = comp_op();
			setState(1979); ((Comparison_predicateContext)_localctx).right = row_value_predicand();
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
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public TerminalNode GEQ() { return getToken(SQLParser.GEQ, 0); }
		public TerminalNode GTH() { return getToken(SQLParser.GTH, 0); }
		public TerminalNode LEQ() { return getToken(SQLParser.LEQ, 0); }
		public TerminalNode LTH() { return getToken(SQLParser.LTH, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SQLParser.NOT_EQUAL, 0); }
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
		enterRule(_localctx, 426, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_la = _input.LA(1);
			if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (EQUAL - 217)) | (1L << (NOT_EQUAL - 217)) | (1L << (LTH - 217)) | (1L << (LEQ - 217)) | (1L << (GTH - 217)) | (1L << (GEQ - 217)))) != 0)) ) {
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
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public Between_predicate_part_2Context between_predicate_part_2() {
			return getRuleContext(Between_predicate_part_2Context.class,0);
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
		enterRule(_localctx, 428, RULE_between_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983); ((Between_predicateContext)_localctx).predicand = row_value_predicand();
			setState(1984); between_predicate_part_2();
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
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLParser.ASYMMETRIC, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLParser.SYMMETRIC, 0); }
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
		enterRule(_localctx, 430, RULE_between_predicate_part_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1986); match(NOT);
				}
			}

			setState(1989); match(BETWEEN);
			setState(1991);
			_la = _input.LA(1);
			if (_la==ASYMMETRIC || _la==SYMMETRIC) {
				{
				setState(1990);
				_la = _input.LA(1);
				if ( !(_la==ASYMMETRIC || _la==SYMMETRIC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1993); ((Between_predicate_part_2Context)_localctx).begin = row_value_predicand();
			setState(1994); match(AND);
			setState(1995); ((Between_predicate_part_2Context)_localctx).end = row_value_predicand();
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
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public In_predicate_valueContext in_predicate_value() {
			return getRuleContext(In_predicate_valueContext.class,0);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
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
		enterRule(_localctx, 432, RULE_in_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997); ((In_predicateContext)_localctx).predicand = numeric_value_expression();
			setState(1999);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1998); match(NOT);
				}
			}

			setState(2001); match(IN);
			setState(2002); in_predicate_value();
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public In_value_listContext in_value_list() {
			return getRuleContext(In_value_listContext.class,0);
		}
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
		enterRule(_localctx, 434, RULE_in_predicate_value);
		try {
			setState(2009);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2004); table_subquery();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2005); match(LEFT_PAREN);
				setState(2006); in_value_list();
				setState(2007); match(RIGHT_PAREN);
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
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
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
		enterRule(_localctx, 436, RULE_in_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011); row_value_predicand();
			setState(2016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2012); match(COMMA);
				setState(2013); row_value_predicand();
				}
				}
				setState(2018);
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
		public Pattern_matcherContext pattern_matcher() {
			return getRuleContext(Pattern_matcherContext.class,0);
		}
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
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
		enterRule(_localctx, 438, RULE_pattern_matching_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019); ((Pattern_matching_predicateContext)_localctx).f = row_value_predicand();
			setState(2020); pattern_matcher();
			setState(2021); ((Pattern_matching_predicateContext)_localctx).s = match(Character_String_Literal);
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
		enterRule(_localctx, 440, RULE_pattern_matcher);
		int _la;
		try {
			setState(2028);
			switch (_input.LA(1)) {
			case ILIKE:
			case LIKE:
			case NOT:
			case REGEXP:
			case RLIKE:
			case SIMILAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2023); match(NOT);
					}
				}

				setState(2026); negativable_matcher();
				}
				break;
			case Similar_To:
			case Not_Similar_To:
			case Similar_To_Case_Insensitive:
			case Not_Similar_To_Case_Insensitive:
				enterOuterAlt(_localctx, 2);
				{
				setState(2027); regex_matcher();
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
		public TerminalNode ILIKE() { return getToken(SQLParser.ILIKE, 0); }
		public TerminalNode SIMILAR() { return getToken(SQLParser.SIMILAR, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode LIKE() { return getToken(SQLParser.LIKE, 0); }
		public TerminalNode RLIKE() { return getToken(SQLParser.RLIKE, 0); }
		public TerminalNode REGEXP() { return getToken(SQLParser.REGEXP, 0); }
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
		enterRule(_localctx, 442, RULE_negativable_matcher);
		try {
			setState(2036);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2030); match(LIKE);
				}
				break;
			case ILIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2031); match(ILIKE);
				}
				break;
			case SIMILAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2032); match(SIMILAR);
				setState(2033); match(TO);
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(2034); match(REGEXP);
				}
				break;
			case RLIKE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2035); match(RLIKE);
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
		public TerminalNode Similar_To_Case_Insensitive() { return getToken(SQLParser.Similar_To_Case_Insensitive, 0); }
		public TerminalNode Not_Similar_To_Case_Insensitive() { return getToken(SQLParser.Not_Similar_To_Case_Insensitive, 0); }
		public TerminalNode Similar_To() { return getToken(SQLParser.Similar_To, 0); }
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
		enterRule(_localctx, 444, RULE_regex_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			_la = _input.LA(1);
			if ( !(((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (Similar_To - 211)) | (1L << (Not_Similar_To - 211)) | (1L << (Similar_To_Case_Insensitive - 211)) | (1L << (Not_Similar_To_Case_Insensitive - 211)))) != 0)) ) {
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
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
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
		enterRule(_localctx, 446, RULE_null_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040); ((Null_predicateContext)_localctx).predicand = row_value_predicand();
			setState(2041); match(IS);
			setState(2043);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2042); ((Null_predicateContext)_localctx).n = match(NOT);
				}
			}

			setState(2045); match(NULL);
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
		enterRule(_localctx, 448, RULE_quantified_comparison_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047); ((Quantified_comparison_predicateContext)_localctx).l = numeric_value_expression();
			setState(2048); ((Quantified_comparison_predicateContext)_localctx).c = comp_op();
			setState(2049); ((Quantified_comparison_predicateContext)_localctx).q = quantifier();
			setState(2050); ((Quantified_comparison_predicateContext)_localctx).s = table_subquery();
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
		enterRule(_localctx, 450, RULE_quantifier);
		try {
			setState(2054);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052); all();
				}
				break;
			case ANY:
			case SOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053); some();
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
		enterRule(_localctx, 452, RULE_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056); match(ALL);
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
		public TerminalNode ANY() { return getToken(SQLParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SQLParser.SOME, 0); }
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
		enterRule(_localctx, 454, RULE_some);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
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
		enterRule(_localctx, 456, RULE_exists_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2060); match(NOT);
				}
			}

			setState(2063); match(EXISTS);
			setState(2064); ((Exists_predicateContext)_localctx).s = table_subquery();
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
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
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
		enterRule(_localctx, 458, RULE_unique_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066); match(UNIQUE);
			setState(2067); ((Unique_predicateContext)_localctx).s = table_subquery();
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
		public Non_second_primary_datetime_fieldContext non_second_primary_datetime_field() {
			return getRuleContext(Non_second_primary_datetime_fieldContext.class,0);
		}
		public TerminalNode SECOND() { return getToken(SQLParser.SECOND, 0); }
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
		enterRule(_localctx, 460, RULE_primary_datetime_field);
		try {
			setState(2071);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2069); non_second_primary_datetime_field();
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(2070); match(SECOND);
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
		public TerminalNode MINUTE() { return getToken(SQLParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SQLParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SQLParser.HOUR, 0); }
		public TerminalNode YEAR() { return getToken(SQLParser.YEAR, 0); }
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
		enterRule(_localctx, 462, RULE_non_second_primary_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DAY - 75)) | (1L << (HOUR - 75)) | (1L << (MINUTE - 75)) | (1L << (MONTH - 75)))) != 0) || _la==YEAR) ) {
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
		public TerminalNode MILLENNIUM() { return getToken(SQLParser.MILLENNIUM, 0); }
		public TerminalNode DECADE() { return getToken(SQLParser.DECADE, 0); }
		public TerminalNode DOW() { return getToken(SQLParser.DOW, 0); }
		public TerminalNode EPOCH() { return getToken(SQLParser.EPOCH, 0); }
		public TerminalNode WEEK() { return getToken(SQLParser.WEEK, 0); }
		public TerminalNode CENTURY() { return getToken(SQLParser.CENTURY, 0); }
		public TerminalNode QUARTER() { return getToken(SQLParser.QUARTER, 0); }
		public TerminalNode DOY() { return getToken(SQLParser.DOY, 0); }
		public TerminalNode ISODOW() { return getToken(SQLParser.ISODOW, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SQLParser.MILLISECONDS, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SQLParser.MICROSECONDS, 0); }
		public TerminalNode ISOYEAR() { return getToken(SQLParser.ISOYEAR, 0); }
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
		enterRule(_localctx, 464, RULE_extended_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CENTURY - 66)) | (1L << (DECADE - 66)) | (1L << (DOW - 66)) | (1L << (DOY - 66)) | (1L << (EPOCH - 66)) | (1L << (ISODOW - 66)) | (1L << (ISOYEAR - 66)) | (1L << (MICROSECONDS - 66)) | (1L << (MILLENNIUM - 66)) | (1L << (MILLISECONDS - 66)))) != 0) || _la==QUARTER || _la==WEEK) ) {
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
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Sql_argument_listContext sql_argument_list() {
			return getRuleContext(Sql_argument_listContext.class,0);
		}
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
		enterRule(_localctx, 466, RULE_routine_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2077); function_name();
			setState(2078); match(LEFT_PAREN);
			setState(2080);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << FALSE) | (1L << LEFT) | (1L << NOT) | (1L << NULL) | (1L << RIGHT) | (1L << SOME) | (1L << TRUE) | (1L << AVG) | (1L << ADD) | (1L << ALTER) | (1L << BETWEEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BY - 64)) | (1L << (CATALOG - 64)) | (1L << (CENTURY - 64)) | (1L << (CHARACTER - 64)) | (1L << (COLLECT - 64)) | (1L << (COALESCE - 64)) | (1L << (COLUMN - 64)) | (1L << (COUNT - 64)) | (1L << (CUBE - 64)) | (1L << (CUME_DIST - 64)) | (1L << (CURRENT - 64)) | (1L << (DAY - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEC - 64)) | (1L << (DECADE - 64)) | (1L << (DENSE_RANK - 64)) | (1L << (DOW - 64)) | (1L << (DOY - 64)) | (1L << (DROP - 64)) | (1L << (EPOCH - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUDE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FIRST_VALUE - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUSION - 64)) | (1L << (GROUPING - 64)) | (1L << (HASH - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTERSECTION - 64)) | (1L << (ISODOW - 64)) | (1L << (ISOYEAR - 64)) | (1L << (LAG - 64)) | (1L << (LAST - 64)) | (1L << (LAST_VALUE - 64)) | (1L << (LEAD - 64)) | (1L << (LESS - 64)) | (1L << (LIST - 64)) | (1L << (LOCATION - 64)) | (1L << (MAX - 64)) | (1L << (MAXVALUE - 64)) | (1L << (MICROSECONDS - 64)) | (1L << (MILLENNIUM - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NATIONAL - 64)) | (1L << (NULLIF - 64)) | (1L << (NO - 64)) | (1L << (OVERWRITE - 64)) | (1L << (OTHERS - 64)) | (1L << (PARTITION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PARTITIONS - 128)) | (1L << (PERCENT_RANK - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PURGE - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RANK - 128)) | (1L << (REGEXP - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (RESET - 128)) | (1L << (RLIKE - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (ROW_NUMBER - 128)) | (1L << (SECOND - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SIMILAR - 128)) | (1L << (STDDEV_POP - 128)) | (1L << (STDDEV_SAMP - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUM - 128)) | (1L << (TABLESPACE - 128)) | (1L << (THAN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEZONE - 128)) | (1L << (TIMEZONE_HOUR - 128)) | (1L << (TIMEZONE_MINUTE - 128)) | (1L << (TRIM - 128)) | (1L << (TO - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNKNOWN - 128)) | (1L << (VALUES - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VARYING - 128)) | (1L << (WEEK - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)) | (1L << (BOOLEAN - 128)) | (1L << (BOOL - 128)) | (1L << (BIT - 128)) | (1L << (VARBIT - 128)) | (1L << (INT1 - 128)) | (1L << (INT2 - 128)) | (1L << (INT4 - 128)) | (1L << (INT8 - 128)) | (1L << (TINYINT - 128)) | (1L << (SMALLINT - 128)) | (1L << (INT - 128)) | (1L << (INTEGER - 128)) | (1L << (BIGINT - 128)) | (1L << (FLOAT4 - 128)) | (1L << (FLOAT8 - 128)) | (1L << (REAL - 128)) | (1L << (FLOAT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NUMERIC - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (DECIMAL - 192)) | (1L << (CHAR - 192)) | (1L << (VARCHAR - 192)) | (1L << (NCHAR - 192)) | (1L << (NVARCHAR - 192)) | (1L << (DATE - 192)) | (1L << (INTERVAL - 192)) | (1L << (TIME - 192)) | (1L << (TIMETZ - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TIMESTAMPTZ - 192)) | (1L << (TEXT - 192)) | (1L << (VARBINARY - 192)) | (1L << (BLOB - 192)) | (1L << (BYTEA - 192)) | (1L << (MAP - 192)) | (1L << (RECORD - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (NUMBER - 192)) | (1L << (REAL_NUMBER - 192)) | (1L << (Regular_Identifier - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (Quoted_Identifier - 256)) | (1L << (Character_String_Literal - 256)) | (1L << (INET4 - 256)))) != 0)) {
				{
				setState(2079); sql_argument_list();
				}
			}

			setState(2082); match(RIGHT_PAREN);
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
		enterRule(_localctx, 468, RULE_function_names_for_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_names_for_reserved_wordsContext function_names_for_reserved_words() {
			return getRuleContext(Function_names_for_reserved_wordsContext.class,0);
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
		enterRule(_localctx, 470, RULE_function_name);
		try {
			setState(2088);
			switch (_input.LA(1)) {
			case AVG:
			case ADD:
			case ALTER:
			case BETWEEN:
			case BY:
			case CATALOG:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case DAY:
			case DEFAULT:
			case DEC:
			case DECADE:
			case DENSE_RANK:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FOLLOWING:
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
			case LAST_VALUE:
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
			case NO:
			case OVERWRITE:
			case OTHERS:
			case PARTITION:
			case PARTITIONS:
			case PERCENT_RANK:
			case PRECEDING:
			case PRECISION:
			case PURGE:
			case QUARTER:
			case RANGE:
			case RANK:
			case REGEXP:
			case RENAME:
			case REPAIR:
			case RESET:
			case RLIKE:
			case ROLLUP:
			case ROW:
			case ROWS:
			case ROW_NUMBER:
			case SECOND:
			case SESSION:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLESPACE:
			case THAN:
			case TIES:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case UNBOUNDED:
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
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case MAP:
			case RECORD:
			case Regular_Identifier:
			case Quoted_Identifier:
			case INET4:
				enterOuterAlt(_localctx, 1);
				{
				setState(2086); identifier();
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2087); function_names_for_reserved_words();
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
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
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
		enterRule(_localctx, 472, RULE_sql_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090); value_expression();
			setState(2095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2091); match(COMMA);
				setState(2092); value_expression();
				}
				}
				setState(2097);
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
		enterRule(_localctx, 474, RULE_orderby_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098); match(ORDER);
			setState(2099); match(BY);
			setState(2100); sort_specifier_list();
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
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Sort_specifierContext> sort_specifier() {
			return getRuleContexts(Sort_specifierContext.class);
		}
		public Sort_specifierContext sort_specifier(int i) {
			return getRuleContext(Sort_specifierContext.class,i);
		}
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
		enterRule(_localctx, 476, RULE_sort_specifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102); sort_specifier();
			setState(2107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2103); match(COMMA);
				setState(2104); sort_specifier();
				}
				}
				setState(2109);
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
		public Null_orderingContext null_ordering() {
			return getRuleContext(Null_orderingContext.class,0);
		}
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public Order_specificationContext order_specification() {
			return getRuleContext(Order_specificationContext.class,0);
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
		enterRule(_localctx, 478, RULE_sort_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110); ((Sort_specifierContext)_localctx).key = row_value_predicand();
			setState(2112);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2111); ((Sort_specifierContext)_localctx).order = order_specification();
				}
			}

			setState(2115);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(2114); ((Sort_specifierContext)_localctx).null_order = null_ordering();
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
		public TerminalNode ASC() { return getToken(SQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLParser.DESC, 0); }
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
		enterRule(_localctx, 480, RULE_order_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
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
		enterRule(_localctx, 482, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119); match(LIMIT);
			setState(2120); ((Limit_clauseContext)_localctx).e = numeric_value_expression();
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
		public TerminalNode NULLS() { return getToken(SQLParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(SQLParser.FIRST, 0); }
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
		enterRule(_localctx, 484, RULE_null_ordering);
		try {
			setState(2126);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2122); match(NULLS);
				setState(2123); match(FIRST);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2124); match(NULLS);
				setState(2125); match(LAST);
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
		public Token path;
		public IdentifierContext storage_type;
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Param_clauseContext param_clause() {
			return getRuleContext(Param_clauseContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OVERWRITE() { return getToken(SQLParser.OVERWRITE, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
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
		enterRule(_localctx, 486, RULE_insert_statement);
		int _la;
		try {
			setState(2181);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2128); match(INSERT);
				setState(2130);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(2129); match(OVERWRITE);
					}
				}

				setState(2132); match(INTO);
				setState(2133); table_name();
				setState(2138);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(2134); match(LEFT_PAREN);
					setState(2135); column_reference_list();
					setState(2136); match(RIGHT_PAREN);
					}
					break;
				}
				setState(2140); query_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2142); match(INSERT);
				setState(2144);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(2143); match(OVERWRITE);
					}
				}

				setState(2146); match(INTO);
				setState(2147); table_name();
				setState(2152);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(2148); match(LEFT_PAREN);
					setState(2149); column_reference_list();
					setState(2150); match(RIGHT_PAREN);
					}
				}

				setState(2154); match(VALUES);
				setState(2155); match(LEFT_PAREN);
				setState(2156); row_value_predicand();
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2157); match(COMMA);
					setState(2158); row_value_predicand();
					}
					}
					setState(2163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2164); match(RIGHT_PAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2166); match(INSERT);
				setState(2168);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(2167); match(OVERWRITE);
					}
				}

				setState(2170); match(INTO);
				setState(2171); match(LOCATION);
				setState(2172); ((Insert_statementContext)_localctx).path = match(Character_String_Literal);
				setState(2178);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(2173); match(USING);
					setState(2174); ((Insert_statementContext)_localctx).storage_type = identifier();
					setState(2176);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(2175); param_clause();
						}
					}

					}
				}

				setState(2180); query_expression();
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

	public static class Alter_tablespace_statementContext extends ParserRuleContext {
		public IdentifierContext space_name;
		public Token uri;
		public TerminalNode TABLESPACE() { return getToken(SQLParser.TABLESPACE, 0); }
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Alter_tablespace_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_tablespace_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAlter_tablespace_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAlter_tablespace_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAlter_tablespace_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_tablespace_statementContext alter_tablespace_statement() throws RecognitionException {
		Alter_tablespace_statementContext _localctx = new Alter_tablespace_statementContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_alter_tablespace_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183); match(ALTER);
			setState(2184); match(TABLESPACE);
			setState(2185); ((Alter_tablespace_statementContext)_localctx).space_name = identifier();
			setState(2186); match(LOCATION);
			setState(2187); ((Alter_tablespace_statementContext)_localctx).uri = match(Character_String_Literal);
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

	public static class Alter_table_statementContext extends ParserRuleContext {
		public Token path;
		public TerminalNode UNSET() { return getToken(SQLParser.UNSET, 0); }
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public Partition_column_value_listContext partition_column_value_list() {
			return getRuleContext(Partition_column_value_listContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode PURGE() { return getToken(SQLParser.PURGE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Field_elementContext field_element() {
			return getRuleContext(Field_elementContext.class,0);
		}
		public If_existsContext if_exists() {
			return getRuleContext(If_existsContext.class,0);
		}
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode PROPERTY() { return getToken(SQLParser.PROPERTY, 0); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public Property_listContext property_list() {
			return getRuleContext(Property_listContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SQLParser.RENAME, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Property_key_listContext property_key_list() {
			return getRuleContext(Property_key_listContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public If_not_existsContext if_not_exists() {
			return getRuleContext(If_not_existsContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public TerminalNode REPAIR() { return getToken(SQLParser.REPAIR, 0); }
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Alter_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAlter_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAlter_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAlter_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_statementContext alter_table_statement() throws RecognitionException {
		Alter_table_statementContext _localctx = new Alter_table_statementContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_alter_table_statement);
		int _la;
		try {
			setState(2261);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2189); match(ALTER);
				setState(2190); match(TABLE);
				setState(2191); table_name();
				setState(2192); match(RENAME);
				setState(2193); match(TO);
				setState(2194); table_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2196); match(ALTER);
				setState(2197); match(TABLE);
				setState(2198); table_name();
				setState(2199); match(RENAME);
				setState(2200); match(COLUMN);
				setState(2201); column_name();
				setState(2202); match(TO);
				setState(2203); column_name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2205); match(ALTER);
				setState(2206); match(TABLE);
				setState(2207); table_name();
				setState(2208); match(ADD);
				setState(2209); match(COLUMN);
				setState(2210); field_element();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2212); match(ALTER);
				setState(2213); match(TABLE);
				setState(2214); table_name();
				setState(2215); match(ADD);
				setState(2217);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(2216); if_not_exists();
					}
				}

				setState(2219); match(PARTITION);
				setState(2220); match(LEFT_PAREN);
				setState(2221); partition_column_value_list();
				setState(2222); match(RIGHT_PAREN);
				setState(2225);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(2223); match(LOCATION);
					setState(2224); ((Alter_table_statementContext)_localctx).path = match(Character_String_Literal);
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2227); match(ALTER);
				setState(2228); match(TABLE);
				setState(2229); table_name();
				setState(2230); match(DROP);
				setState(2232);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(2231); if_exists();
					}
				}

				setState(2234); match(PARTITION);
				setState(2235); match(LEFT_PAREN);
				setState(2236); partition_column_value_list();
				setState(2237); match(RIGHT_PAREN);
				setState(2239);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(2238); match(PURGE);
					}
				}

				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2241); match(ALTER);
				setState(2242); match(TABLE);
				setState(2243); table_name();
				setState(2244); match(SET);
				setState(2245); match(PROPERTY);
				setState(2246); property_list();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2248); match(ALTER);
				setState(2249); match(TABLE);
				setState(2250); table_name();
				setState(2251); match(UNSET);
				setState(2252); match(PROPERTY);
				setState(2253); property_key_list();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2255); match(ALTER);
				setState(2256); match(TABLE);
				setState(2257); table_name();
				setState(2258); match(REPAIR);
				setState(2259); match(PARTITION);
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

	public static class Partition_column_value_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Partition_column_valueContext> partition_column_value() {
			return getRuleContexts(Partition_column_valueContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Partition_column_valueContext partition_column_value(int i) {
			return getRuleContext(Partition_column_valueContext.class,i);
		}
		public Partition_column_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_column_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPartition_column_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPartition_column_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPartition_column_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_column_value_listContext partition_column_value_list() throws RecognitionException {
		Partition_column_value_listContext _localctx = new Partition_column_value_listContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_partition_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2263); partition_column_value();
			setState(2268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2264); match(COMMA);
				setState(2265); partition_column_value();
				}
				}
				setState(2270);
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

	public static class Partition_column_valueContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Partition_column_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_column_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPartition_column_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPartition_column_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPartition_column_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_column_valueContext partition_column_value() throws RecognitionException {
		Partition_column_valueContext _localctx = new Partition_column_valueContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_partition_column_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271); identifier();
			setState(2272); match(EQUAL);
			setState(2273); row_value_predicand();
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

	public static class Property_listContext extends ParserRuleContext {
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public Property_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterProperty_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitProperty_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitProperty_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_listContext property_list() throws RecognitionException {
		Property_listContext _localctx = new Property_listContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_property_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2275); property();
			setState(2280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2276); match(COMMA);
				setState(2277); property();
				}
				}
				setState(2282);
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

	public static class PropertyContext extends ParserRuleContext {
		public Token key;
		public Token value;
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public TerminalNode Character_String_Literal(int i) {
			return getToken(SQLParser.Character_String_Literal, i);
		}
		public List<TerminalNode> Character_String_Literal() { return getTokens(SQLParser.Character_String_Literal); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283); ((PropertyContext)_localctx).key = match(Character_String_Literal);
			setState(2284); match(EQUAL);
			setState(2285); ((PropertyContext)_localctx).value = match(Character_String_Literal);
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

	public static class Property_key_listContext extends ParserRuleContext {
		public List<Property_keyContext> property_key() {
			return getRuleContexts(Property_keyContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Property_keyContext property_key(int i) {
			return getRuleContext(Property_keyContext.class,i);
		}
		public Property_key_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_key_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterProperty_key_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitProperty_key_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitProperty_key_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_key_listContext property_key_list() throws RecognitionException {
		Property_key_listContext _localctx = new Property_key_listContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_property_key_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287); property_key();
			setState(2292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2288); match(COMMA);
				setState(2289); property_key();
				}
				}
				setState(2294);
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

	public static class Property_keyContext extends ParserRuleContext {
		public Token key;
		public TerminalNode Character_String_Literal() { return getToken(SQLParser.Character_String_Literal, 0); }
		public Property_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterProperty_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitProperty_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitProperty_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_keyContext property_key() throws RecognitionException {
		Property_keyContext _localctx = new Property_keyContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_property_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295); ((Property_keyContext)_localctx).key = match(Character_String_Literal);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0107\u08fc\4\2\t"+
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
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\3\2\5\2\u01fc"+
		"\n\2\3\2\3\2\5\2\u0200\n\2\3\2\3\2\3\3\3\3\5\3\u0206\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u020d\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0216\n\5\3\5\3\5"+
		"\3\5\5\5\u021b\n\5\3\5\3\5\5\5\u021f\n\5\3\5\3\5\5\5\u0223\n\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0229\n\5\3\5\3\5\5\5\u022d\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u023a\n\b\3\t\3\t\5\t\u023e\n\t\3\n\3\n\5\n\u0242"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0249\n\n\3\n\3\n\3\n\3\n\5\n\u024f\n\n\3"+
		"\n\5\n\u0252\n\n\3\n\3\n\5\n\u0256\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\5\f\u025f\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u026a\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0275\n\20\3\20\3\20"+
		"\3\20\3\20\5\20\u027b\n\20\3\20\3\20\3\20\5\20\u0280\n\20\3\20\5\20\u0283"+
		"\n\20\3\20\3\20\5\20\u0287\n\20\3\20\3\20\3\20\5\20\u028c\n\20\3\20\3"+
		"\20\3\20\3\20\5\20\u0292\n\20\3\20\3\20\5\20\u0296\n\20\3\20\5\20\u0299"+
		"\n\20\3\20\5\20\u029c\n\20\3\20\3\20\5\20\u02a0\n\20\3\20\3\20\3\20\5"+
		"\20\u02a5\n\20\3\20\3\20\3\20\5\20\u02aa\n\20\3\20\3\20\5\20\u02ae\n\20"+
		"\3\20\5\20\u02b1\n\20\3\20\5\20\u02b4\n\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u02bc\n\20\3\20\3\20\3\20\3\20\5\20\u02c2\n\20\3\21\3\21\3\21"+
		"\3\21\7\21\u02c8\n\21\f\21\16\21\u02cb\13\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u02d3\n\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u02df\n\24\f\24\16\24\u02e2\13\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u02f6"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\7\33\u0305\n\33\f\33\16\33\u0308\13\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0314\n\34\3\34\3\34\5\34\u0318\n\34\5\34\u031a"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0327"+
		"\n\35\3\36\3\36\3\36\7\36\u032c\n\36\f\36\16\36\u032f\13\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u0344\n\""+
		"\f\"\16\"\u0347\13\"\3#\3#\3#\3#\5#\u034d\n#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3&\3&\5&\u035c\n&\3&\3&\3&\7&\u0361\n&\f&\16&\u0364\13&\3\'\3"+
		"\'\3\'\5\'\u0369\n\'\3\'\3\'\5\'\u036d\n\'\3(\3(\3(\5(\u0372\n(\3)\3)"+
		"\3*\3*\5*\u0378\n*\3+\3+\3+\5+\u037d\n+\3,\3,\3,\3,\5,\u0383\n,\3-\3-"+
		"\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\5\61\u0394\n\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03a3"+
		"\n\64\3\65\3\65\5\65\u03a7\n\65\3\65\3\65\5\65\u03ab\n\65\3\65\3\65\3"+
		"\65\5\65\u03b0\n\65\3\65\3\65\3\65\5\65\u03b5\n\65\3\65\3\65\5\65\u03b9"+
		"\n\65\3\65\5\65\u03bc\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67\u03c5"+
		"\n\67\3\67\3\67\3\67\5\67\u03ca\n\67\3\67\3\67\5\67\u03ce\n\67\3\67\3"+
		"\67\3\67\3\67\5\67\u03d4\n\67\3\67\3\67\3\67\3\67\5\67\u03da\n\67\3\67"+
		"\3\67\3\67\5\67\u03df\n\67\3\67\3\67\5\67\u03e3\n\67\5\67\u03e5\n\67\3"+
		"8\38\58\u03e9\n8\38\38\58\u03ed\n8\58\u03ef\n8\39\39\59\u03f3\n9\3:\3"+
		":\5:\u03f7\n:\3:\3:\5:\u03fb\n:\3:\3:\5:\u03ff\n:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\5:\u040a\n:\3;\3;\5;\u040e\n;\3;\3;\3;\3;\3;\3;\5;\u0416\n;\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\5<\u0420\n<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\5>\u0432\n>\3?\3?\5?\u0436\n?\3?\3?\5?\u043a\n?\3?\3?\3"+
		"?\5?\u043f\n?\5?\u0441\n?\3@\3@\5@\u0445\n@\3@\3@\3@\5@\u044a\n@\3@\3"+
		"@\5@\u044e\n@\5@\u0450\n@\3A\3A\3A\5A\u0455\nA\3B\3B\3B\3B\3B\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\3E\3E\5E\u0468\nE\3F\3F\3F\3F\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\5G\u0476\nG\3H\3H\3I\3I\3J\5J\u047d\nJ\3J\3J\3K\3K\3L\3L\3L\3"+
		"L\3L\3L\5L\u0489\nL\5L\u048b\nL\3M\3M\3M\5M\u0490\nM\3M\3M\3M\3N\3N\3"+
		"O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04bf\nR\5R\u04c1"+
		"\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04cc\nR\5R\u04ce\nR\3R\3R\5R\u04d2"+
		"\nR\3S\3S\3T\3T\5T\u04d8\nT\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\6V\u04e8\nV\rV\16V\u04e9\3V\3V\5V\u04ee\nV\3W\3W\5W\u04f2\nW\3X\3X\3"+
		"X\6X\u04f7\nX\rX\16X\u04f8\3X\5X\u04fc\nX\3X\3X\3Y\3Y\6Y\u0502\nY\rY\16"+
		"Y\u0503\3Y\5Y\u0507\nY\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\\3\\"+
		"\3]\3]\5]\u051a\n]\3^\3^\3^\3^\3^\3^\3^\3_\3_\3`\3`\3a\3a\3a\5a\u052a"+
		"\na\3b\3b\3b\3b\5b\u0530\nb\3c\3c\3c\7c\u0535\nc\fc\16c\u0538\13c\3d\3"+
		"d\3d\7d\u053d\nd\fd\16d\u0540\13d\3e\5e\u0543\ne\3e\3e\3f\3f\3f\7f\u054a"+
		"\nf\ff\16f\u054d\13f\3f\5f\u0550\nf\3g\3g\3h\3h\5h\u0556\nh\3i\3i\3i\3"+
		"i\3i\3i\3i\3j\3j\3j\5j\u0562\nj\3k\3k\3l\3l\3m\3m\3n\3n\3n\7n\u056d\n"+
		"n\fn\16n\u0570\13n\3o\3o\3p\3p\5p\u0576\np\3q\3q\3r\3r\3r\3r\3r\3s\5s"+
		"\u0580\ns\3s\5s\u0583\ns\3s\5s\u0586\ns\3s\3s\3s\3s\3s\5s\u058d\ns\3t"+
		"\3t\3u\3u\3v\3v\3w\3w\3x\3x\5x\u0599\nx\3y\3y\3y\5y\u059e\ny\3z\3z\3z"+
		"\3z\5z\u05a4\nz\3{\3{\3{\3{\5{\u05aa\n{\3|\3|\3}\3}\3~\3~\3~\7~\u05b3"+
		"\n~\f~\16~\u05b6\13~\3\177\3\177\3\177\7\177\u05bb\n\177\f\177\16\177"+
		"\u05be\13\177\3\u0080\3\u0080\3\u0080\5\u0080\u05c3\n\u0080\3\u0081\3"+
		"\u0081\5\u0081\u05c7\n\u0081\3\u0082\3\u0082\5\u0082\u05cb\n\u0082\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\5\u0084\u05d3\n\u0084\3\u0085"+
		"\3\u0085\5\u0085\u05d7\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\5\u0087\u05df\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\5\u0089"+
		"\u05e5\n\u0089\3\u008a\3\u008a\5\u008a\u05e9\n\u008a\3\u008b\3\u008b\3"+
		"\u008c\3\u008c\5\u008c\u05ef\n\u008c\3\u008c\5\u008c\u05f2\n\u008c\3\u008c"+
		"\5\u008c\u05f5\n\u008c\3\u008c\5\u008c\u05f8\n\u008c\3\u008c\5\u008c\u05fb"+
		"\n\u008c\3\u008c\5\u008c\u05fe\n\u008c\3\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\7\u008e\u0606\n\u008e\f\u008e\16\u008e\u0609\13\u008e"+
		"\3\u008f\3\u008f\5\u008f\u060d\n\u008f\3\u0090\3\u0090\6\u0090\u0611\n"+
		"\u0090\r\u0090\16\u0090\u0612\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u0619\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u0621\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0628\n"+
		"\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\5\u0093\u062f\n\u0093\3"+
		"\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\5\u0094\u0637\n\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096"+
		"\5\u0096\u0642\n\u0096\3\u0097\3\u0097\5\u0097\u0646\n\u0097\3\u0098\3"+
		"\u0098\3\u0099\3\u0099\5\u0099\u064c\n\u0099\3\u009a\3\u009a\3\u009a\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\5\u009c\u0658\n"+
		"\u009c\3\u009c\5\u009c\u065b\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5"+
		"\u009c\u0661\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0666\n\u009c\3\u009c"+
		"\5\u009c\u0669\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u066f\n"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0675\n\u009c\3\u009c\3"+
		"\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u067c\n\u009c\5\u009c\u067e\n\u009c"+
		"\3\u009d\3\u009d\3\u009d\7\u009d\u0683\n\u009d\f\u009d\16\u009d\u0686"+
		"\13\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u0696\n\u00a2"+
		"\f\u00a2\16\u00a2\u0699\13\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u069f\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u06a6\n"+
		"\u00a4\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u06ab\n\u00a5\f\u00a5\16\u00a5"+
		"\u06ae\13\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u06c3\n\u00aa\f\u00aa\16\u00aa\u06c6"+
		"\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u06ce"+
		"\n\u00ac\f\u00ac\16\u00ac\u06d1\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\5\u00b0\u06de"+
		"\n\u00b0\3\u00b0\5\u00b0\u06e1\n\u00b0\3\u00b0\5\u00b0\u06e4\n\u00b0\3"+
		"\u00b0\5\u00b0\u06e7\n\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u06f4\n\u00b4\3"+
		"\u00b5\3\u00b5\3\u00b6\3\u00b6\5\u00b6\u06fa\n\u00b6\3\u00b7\3\u00b7\3"+
		"\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0703\n\u00b7\3\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\5\u00b9\u0711\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u071d\n\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bc\3\u00bc\5\u00bc\u0723\n\u00bc\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0729\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u072d\n"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u0731\n\u00bd\3\u00bd\7\u00bd\u0734\n\u00bd"+
		"\f\u00bd\16\u00bd\u0737\13\u00bd\3\u00be\3\u00be\5\u00be\u073b\n\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0741\n\u00bf\3\u00bf\3\u00bf"+
		"\5\u00bf\u0745\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0749\n\u00bf\3\u00bf\7"+
		"\u00bf\u074c\n\u00bf\f\u00bf\16\u00bf\u074f\13\u00bf\3\u00c0\3\u00c0\5"+
		"\u00c0\u0753\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u075a"+
		"\n\u00c1\3\u00c2\3\u00c2\5\u00c2\u075e\n\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c4\3\u00c4\5\u00c4\u0765\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u076c\n\u00c5\5\u00c5\u076e\n\u00c5\3\u00c6\3\u00c6\3"+
		"\u00c7\3\u00c7\5\u00c7\u0774\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u0778\n\u00c7"+
		"\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u077d\n\u00c8\f\u00c8\16\u00c8\u0780"+
		"\13\u00c8\3\u00c9\3\u00c9\5\u00c9\u0784\n\u00c9\3\u00ca\3\u00ca\5\u00ca"+
		"\u0788\n\u00ca\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u078d\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\7\u00ce"+
		"\u0798\n\u00ce\f\u00ce\16\u00ce\u079b\13\u00ce\3\u00cf\5\u00cf\u079e\n"+
		"\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u07a5\n\u00d0\f"+
		"\u00d0\16\u00d0\u07a8\13\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3"+
		"\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\5\u00d5\u07ba\n\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d9\5\u00d9\u07c6\n\u00d9"+
		"\3\u00d9\3\u00d9\5\u00d9\u07ca\n\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00da\3\u00da\5\u00da\u07d2\n\u00da\3\u00da\3\u00da\3\u00da\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u07dc\n\u00db\3\u00dc\3\u00dc"+
		"\3\u00dc\7\u00dc\u07e1\n\u00dc\f\u00dc\16\u00dc\u07e4\13\u00dc\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00de\5\u00de\u07eb\n\u00de\3\u00de\3\u00de"+
		"\5\u00de\u07ef\n\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\5\u00df\u07f7\n\u00df\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1\5\u00e1"+
		"\u07fe\n\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e3\3\u00e3\5\u00e3\u0809\n\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5"+
		"\3\u00e6\5\u00e6\u0810\n\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e8\3\u00e8\5\u00e8\u081a\n\u00e8\3\u00e9\3\u00e9\3\u00ea"+
		"\3\u00ea\3\u00eb\3\u00eb\3\u00eb\5\u00eb\u0823\n\u00eb\3\u00eb\3\u00eb"+
		"\3\u00ec\3\u00ec\3\u00ed\3\u00ed\5\u00ed\u082b\n\u00ed\3\u00ee\3\u00ee"+
		"\3\u00ee\7\u00ee\u0830\n\u00ee\f\u00ee\16\u00ee\u0833\13\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u083c\n\u00f0"+
		"\f\u00f0\16\u00f0\u083f\13\u00f0\3\u00f1\3\u00f1\5\u00f1\u0843\n\u00f1"+
		"\3\u00f1\5\u00f1\u0846\n\u00f1\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f4\3\u00f4\3\u00f4\3\u00f4\5\u00f4\u0851\n\u00f4\3\u00f5\3\u00f5"+
		"\5\u00f5\u0855\n\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\5\u00f5\u085d\n\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5\u0863\n"+
		"\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5\u086b\n"+
		"\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\7\u00f5\u0872\n\u00f5\f"+
		"\u00f5\16\u00f5\u0875\13\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5"+
		"\u087b\n\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5"+
		"\u0883\n\u00f5\5\u00f5\u0885\n\u00f5\3\u00f5\5\u00f5\u0888\n\u00f5\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u08ac\n\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u08b4\n\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u08bb\n\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u08c2\n\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\5\u00f7\u08d8\n\u00f7\3\u00f8\3\u00f8\3\u00f8\7\u00f8\u08dd\n\u00f8\f"+
		"\u00f8\16\u00f8\u08e0\13\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00fa"+
		"\3\u00fa\3\u00fa\7\u00fa\u08e9\n\u00fa\f\u00fa\16\u00fa\u08ec\13\u00fa"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc\7\u00fc\u08f5"+
		"\n\u00fc\f\u00fc\16\u00fc\u08f8\13\u00fc\3\u00fd\3\u00fd\3\u00fd\2\2\u00fe"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac"+
		"\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4"+
		"\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc"+
		"\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4"+
		"\u01f6\u01f8\2\31\4\2\u00a3\u00a3\u00db\u00db\16\2>NPbdehlnoq\u0086\u0088"+
		"\u00a3\u00a5\u00a6\u00a8\u00cd\u00cf\u00d1\u00d3\u00d4\u0107\u0107\5\2"+
		"\26\26\66\66\u00a6\u00a6\3\2\u00af\u00b0\3\2\u00fd\u00fe\17\2\6\6\61\61"+
		">>FFIIWWbbjjttyy\u0098\u0099\u009b\u009b\u00a9\u00aa\6\2KKRR\u0083\u0083"+
		"\u008a\u008a\3\2\u00e7\u00e8\4\2\u00e9\u00eb\u00f1\u00f1\3\2\u009f\u00a1"+
		"\5\2\t\t\"\"\65\65\5\2\27\27##//\4\2\u0089\u0089\u0092\u0092\4\2\25\25"+
		"\67\67\4\2\4\4\22\22\4\2\u00db\u00db\u00e0\u00e4\4\2\7\7\62\62\3\2\u00d5"+
		"\u00d8\4\2\6\6\61\61\6\2MMffz{\u00ad\u00ad\n\2DDQQSTVVklvx\u0088\u0088"+
		"\u00ac\u00ac\4\2##//\4\2\b\b\21\21\u0959\2\u01fb\3\2\2\2\4\u0203\3\2\2"+
		"\2\6\u020c\3\2\2\2\b\u022c\3\2\2\2\n\u022e\3\2\2\2\f\u0230\3\2\2\2\16"+
		"\u0239\3\2\2\2\20\u023d\3\2\2\2\22\u023f\3\2\2\2\24\u0257\3\2\2\2\26\u025b"+
		"\3\2\2\2\30\u0262\3\2\2\2\32\u0266\3\2\2\2\34\u026d\3\2\2\2\36\u02c1\3"+
		"\2\2\2 \u02d2\3\2\2\2\"\u02d4\3\2\2\2$\u02d7\3\2\2\2&\u02d9\3\2\2\2(\u02e5"+
		"\3\2\2\2*\u02e9\3\2\2\2,\u02ec\3\2\2\2.\u02ef\3\2\2\2\60\u02f5\3\2\2\2"+
		"\62\u02f7\3\2\2\2\64\u0301\3\2\2\2\66\u0309\3\2\2\28\u031b\3\2\2\2:\u0328"+
		"\3\2\2\2<\u0330\3\2\2\2>\u0333\3\2\2\2@\u0336\3\2\2\2B\u0340\3\2\2\2D"+
		"\u0348\3\2\2\2F\u0352\3\2\2\2H\u0357\3\2\2\2J\u0359\3\2\2\2L\u0365\3\2"+
		"\2\2N\u0371\3\2\2\2P\u0373\3\2\2\2R\u0377\3\2\2\2T\u037c\3\2\2\2V\u0382"+
		"\3\2\2\2X\u0384\3\2\2\2Z\u0387\3\2\2\2\\\u038a\3\2\2\2^\u038d\3\2\2\2"+
		"`\u0393\3\2\2\2b\u0395\3\2\2\2d\u0397\3\2\2\2f\u03a2\3\2\2\2h\u03bb\3"+
		"\2\2\2j\u03bd\3\2\2\2l\u03e4\3\2\2\2n\u03ee\3\2\2\2p\u03f2\3\2\2\2r\u0409"+
		"\3\2\2\2t\u0415\3\2\2\2v\u041f\3\2\2\2x\u0421\3\2\2\2z\u0431\3\2\2\2|"+
		"\u0440\3\2\2\2~\u044f\3\2\2\2\u0080\u0454\3\2\2\2\u0082\u0456\3\2\2\2"+
		"\u0084\u045b\3\2\2\2\u0086\u045e\3\2\2\2\u0088\u0467\3\2\2\2\u008a\u0469"+
		"\3\2\2\2\u008c\u0475\3\2\2\2\u008e\u0477\3\2\2\2\u0090\u0479\3\2\2\2\u0092"+
		"\u047c\3\2\2\2\u0094\u0480\3\2\2\2\u0096\u048a\3\2\2\2\u0098\u048c\3\2"+
		"\2\2\u009a\u0494\3\2\2\2\u009c\u0496\3\2\2\2\u009e\u049c\3\2\2\2\u00a0"+
		"\u04a1\3\2\2\2\u00a2\u04d1\3\2\2\2\u00a4\u04d3\3\2\2\2\u00a6\u04d7\3\2"+
		"\2\2\u00a8\u04d9\3\2\2\2\u00aa\u04ed\3\2\2\2\u00ac\u04f1\3\2\2\2\u00ae"+
		"\u04f3\3\2\2\2\u00b0\u04ff\3\2\2\2\u00b2\u050a\3\2\2\2\u00b4\u050f\3\2"+
		"\2\2\u00b6\u0514\3\2\2\2\u00b8\u0519\3\2\2\2\u00ba\u051b\3\2\2\2\u00bc"+
		"\u0522\3\2\2\2\u00be\u0524\3\2\2\2\u00c0\u0529\3\2\2\2\u00c2\u052f\3\2"+
		"\2\2\u00c4\u0531\3\2\2\2\u00c6\u0539\3\2\2\2\u00c8\u0542\3\2\2\2\u00ca"+
		"\u054f\3\2\2\2\u00cc\u0551\3\2\2\2\u00ce\u0555\3\2\2\2\u00d0\u0557\3\2"+
		"\2\2\u00d2\u0561\3\2\2\2\u00d4\u0563\3\2\2\2\u00d6\u0565\3\2\2\2\u00d8"+
		"\u0567\3\2\2\2\u00da\u0569\3\2\2\2\u00dc\u0571\3\2\2\2\u00de\u0575\3\2"+
		"\2\2\u00e0\u0577\3\2\2\2\u00e2\u0579\3\2\2\2\u00e4\u058c\3\2\2\2\u00e6"+
		"\u058e\3\2\2\2\u00e8\u0590\3\2\2\2\u00ea\u0592\3\2\2\2\u00ec\u0594\3\2"+
		"\2\2\u00ee\u0598\3\2\2\2\u00f0\u059d\3\2\2\2\u00f2\u05a3\3\2\2\2\u00f4"+
		"\u05a9\3\2\2\2\u00f6\u05ab\3\2\2\2\u00f8\u05ad\3\2\2\2\u00fa\u05af\3\2"+
		"\2\2\u00fc\u05b7\3\2\2\2\u00fe\u05c2\3\2\2\2\u0100\u05c4\3\2\2\2\u0102"+
		"\u05c8\3\2\2\2\u0104\u05ce\3\2\2\2\u0106\u05d2\3\2\2\2\u0108\u05d6\3\2"+
		"\2\2\u010a\u05d8\3\2\2\2\u010c\u05de\3\2\2\2\u010e\u05e0\3\2\2\2\u0110"+
		"\u05e4\3\2\2\2\u0112\u05e8\3\2\2\2\u0114\u05ea\3\2\2\2\u0116\u05ec\3\2"+
		"\2\2\u0118\u05ff\3\2\2\2\u011a\u0602\3\2\2\2\u011c\u060c\3\2\2\2\u011e"+
		"\u060e\3\2\2\2\u0120\u0627\3\2\2\2\u0122\u0629\3\2\2\2\u0124\u062e\3\2"+
		"\2\2\u0126\u0634\3\2\2\2\u0128\u063b\3\2\2\2\u012a\u0641\3\2\2\2\u012c"+
		"\u0643\3\2\2\2\u012e\u0647\3\2\2\2\u0130\u064b\3\2\2\2\u0132\u064d\3\2"+
		"\2\2\u0134\u0650\3\2\2\2\u0136\u067d\3\2\2\2\u0138\u067f\3\2\2\2\u013a"+
		"\u0687\3\2\2\2\u013c\u0689\3\2\2\2\u013e\u068c\3\2\2\2\u0140\u068e\3\2"+
		"\2\2\u0142\u0692\3\2\2\2\u0144\u069e\3\2\2\2\u0146\u06a5\3\2\2\2\u0148"+
		"\u06a7\3\2\2\2\u014a\u06af\3\2\2\2\u014c\u06b4\3\2\2\2\u014e\u06b9\3\2"+
		"\2\2\u0150\u06bc\3\2\2\2\u0152\u06bf\3\2\2\2\u0154\u06c7\3\2\2\2\u0156"+
		"\u06ca\3\2\2\2\u0158\u06d2\3\2\2\2\u015a\u06d6\3\2\2\2\u015c\u06d8\3\2"+
		"\2\2\u015e\u06dd\3\2\2\2\u0160\u06e8\3\2\2\2\u0162\u06ea\3\2\2\2\u0164"+
		"\u06ee\3\2\2\2\u0166\u06f0\3\2\2\2\u0168\u06f5\3\2\2\2\u016a\u06f9\3\2"+
		"\2\2\u016c\u0702\3\2\2\2\u016e\u0704\3\2\2\2\u0170\u0710\3\2\2\2\u0172"+
		"\u071c\3\2\2\2\u0174\u071e\3\2\2\2\u0176\u0722\3\2\2\2\u0178\u072c\3\2"+
		"\2\2\u017a\u073a\3\2\2\2\u017c\u0744\3\2\2\2\u017e\u0752\3\2\2\2\u0180"+
		"\u0759\3\2\2\2\u0182\u075d\3\2\2\2\u0184\u075f\3\2\2\2\u0186\u0764\3\2"+
		"\2\2\u0188\u0766\3\2\2\2\u018a\u076f\3\2\2\2\u018c\u0771\3\2\2\2\u018e"+
		"\u0779\3\2\2\2\u0190\u0783\3\2\2\2\u0192\u0785\3\2\2\2\u0194\u078c\3\2"+
		"\2\2\u0196\u0790\3\2\2\2\u0198\u0792\3\2\2\2\u019a\u0794\3\2\2\2\u019c"+
		"\u079d\3\2\2\2\u019e\u07a1\3\2\2\2\u01a0\u07a9\3\2\2\2\u01a2\u07ab\3\2"+
		"\2\2\u01a4\u07ad\3\2\2\2\u01a6\u07af\3\2\2\2\u01a8\u07b9\3\2\2\2\u01aa"+
		"\u07bb\3\2\2\2\u01ac\u07bf\3\2\2\2\u01ae\u07c1\3\2\2\2\u01b0\u07c5\3\2"+
		"\2\2\u01b2\u07cf\3\2\2\2\u01b4\u07db\3\2\2\2\u01b6\u07dd\3\2\2\2\u01b8"+
		"\u07e5\3\2\2\2\u01ba\u07ee\3\2\2\2\u01bc\u07f6\3\2\2\2\u01be\u07f8\3\2"+
		"\2\2\u01c0\u07fa\3\2\2\2\u01c2\u0801\3\2\2\2\u01c4\u0808\3\2\2\2\u01c6"+
		"\u080a\3\2\2\2\u01c8\u080c\3\2\2\2\u01ca\u080f\3\2\2\2\u01cc\u0814\3\2"+
		"\2\2\u01ce\u0819\3\2\2\2\u01d0\u081b\3\2\2\2\u01d2\u081d\3\2\2\2\u01d4"+
		"\u081f\3\2\2\2\u01d6\u0826\3\2\2\2\u01d8\u082a\3\2\2\2\u01da\u082c\3\2"+
		"\2\2\u01dc\u0834\3\2\2\2\u01de\u0838\3\2\2\2\u01e0\u0840\3\2\2\2\u01e2"+
		"\u0847\3\2\2\2\u01e4\u0849\3\2\2\2\u01e6\u0850\3\2\2\2\u01e8\u0887\3\2"+
		"\2\2\u01ea\u0889\3\2\2\2\u01ec\u08d7\3\2\2\2\u01ee\u08d9\3\2\2\2\u01f0"+
		"\u08e1\3\2\2\2\u01f2\u08e5\3\2\2\2\u01f4\u08ed\3\2\2\2\u01f6\u08f1\3\2"+
		"\2\2\u01f8\u08f9\3\2\2\2\u01fa\u01fc\5\4\3\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\5\6\4\2\u01fe\u0200\7\u00dd"+
		"\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0202\7\2\2\3\u0202\3\3\2\2\2\u0203\u0205\7Z\2\2\u0204\u0206\7c\2\2\u0205"+
		"\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\5\3\2\2\2\u0207\u020d\5\b\5\2"+
		"\u0208\u020d\5\n\6\2\u0209\u020d\5\f\7\2\u020a\u020d\5\16\b\2\u020b\u020d"+
		"\5\20\t\2\u020c\u0207\3\2\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2"+
		"\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\7\3\2\2\2\u020e\u020f\7"+
		"\u0096\2\2\u020f\u0210\7C\2\2\u0210\u022d\5N(\2\u0211\u0212\7\u0096\2"+
		"\2\u0212\u0213\7\u00c9\2\2\u0213\u0215\7\u00ae\2\2\u0214\u0216\t\2\2\2"+
		"\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021a\3\2\2\2\u0217\u021b"+
		"\7\u0103\2\2\u0218\u021b\5\u0092J\2\u0219\u021b\7N\2\2\u021a\u0217\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u022d\3\2\2\2\u021c"+
		"\u021e\7\u0096\2\2\u021d\u021f\7\u0095\2\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\5N(\2\u0221\u0223\t\2\2\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0228\3\2\2\2\u0224\u0229\7\u0103"+
		"\2\2\u0225\u0229\5\u0092J\2\u0226\u0229\5b\62\2\u0227\u0229\7N\2\2\u0228"+
		"\u0224\3\2\2\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2"+
		"\2\2\u0229\u022d\3\2\2\2\u022a\u022b\7\u008e\2\2\u022b\u022d\5N(\2\u022c"+
		"\u020e\3\2\2\2\u022c\u0211\3\2\2\2\u022c\u021c\3\2\2\2\u022c\u022a\3\2"+
		"\2\2\u022d\t\3\2\2\2\u022e\u022f\5\u0174\u00bb\2\u022f\13\3\2\2\2\u0230"+
		"\u0231\5\u01e8\u00f5\2\u0231\r\3\2\2\2\u0232\u023a\5\26\f\2\u0233\u023a"+
		"\5\32\16\2\u0234\u023a\5\36\20\2\u0235\u023a\5L\'\2\u0236\u023a\5\u01ea"+
		"\u00f6\2\u0237\u023a\5\u01ec\u00f7\2\u0238\u023a\5J&\2\u0239\u0232\3\2"+
		"\2\2\u0239\u0233\3\2\2\2\u0239\u0234\3\2\2\2\u0239\u0235\3\2\2\2\u0239"+
		"\u0236\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a\17\3\2\2"+
		"\2\u023b\u023e\5\22\n\2\u023c\u023e\5\24\13\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023c\3\2\2\2\u023e\21\3\2\2\2\u023f\u0241\7\f\2\2\u0240\u0242\78\2\2"+
		"\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244"+
		"\7h\2\2\u0244\u0245\5N(\2\u0245\u0246\7*\2\2\u0246\u0248\5\u0188\u00c5"+
		"\2\u0247\u0249\5*\26\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024b\7\u00e5\2\2\u024b\u024c\5\u01de\u00f0\2\u024c\u024e"+
		"\7\u00e6\2\2\u024d\u024f\5&\24\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2"+
		"\2\u024f\u0251\3\2\2\2\u0250\u0252\5\u013c\u009f\2\u0251\u0250\3\2\2\2"+
		"\u0251\u0252\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0254\7s\2\2\u0254\u0256"+
		"\7\u0103\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\23\3\2\2\2"+
		"\u0257\u0258\7U\2\2\u0258\u0259\7h\2\2\u0259\u025a\5N(\2\u025a\25\3\2"+
		"\2\2\u025b\u025c\7\f\2\2\u025c\u025e\7O\2\2\u025d\u025f\5\30\r\2\u025e"+
		"\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5N"+
		"(\2\u0261\27\3\2\2\2\u0262\u0263\7g\2\2\u0263\u0264\7\'\2\2\u0264\u0265"+
		"\7Y\2\2\u0265\31\3\2\2\2\u0266\u0267\7U\2\2\u0267\u0269\7O\2\2\u0268\u026a"+
		"\5\34\17\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2"+
		"\u026b\u026c\5N(\2\u026c\33\3\2\2\2\u026d\u026e\7g\2\2\u026e\u026f\7Y"+
		"\2\2\u026f\35\3\2\2\2\u0270\u0271\7\f\2\2\u0271\u0272\7[\2\2\u0272\u0274"+
		"\7\63\2\2\u0273\u0275\5\30\r\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2"+
		"\u0275\u0276\3\2\2\2\u0276\u0277\5\u0188\u00c5\2\u0277\u027a\5 \21\2\u0278"+
		"\u0279\7\u009c\2\2\u0279\u027b\5N(\2\u027a\u0278\3\2\2\2\u027a\u027b\3"+
		"\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\79\2\2\u027d\u027f\5N(\2\u027e"+
		"\u0280\5&\24\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2"+
		"\2\2\u0281\u0283\5\60\31\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0285\7s\2\2\u0285\u0287\7\u0103\2\2\u0286\u0284"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u02c2\3\2\2\2\u0288\u0289\7\f\2\2\u0289"+
		"\u028b\7\63\2\2\u028a\u028c\5\30\r\2\u028b\u028a\3\2\2\2\u028b\u028c\3"+
		"\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\5\u0188\u00c5\2\u028e\u0291\5 "+
		"\21\2\u028f\u0290\7\u009c\2\2\u0290\u0292\5N(\2\u0291\u028f\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0294\79\2\2\u0294\u0296\5N("+
		"\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0299"+
		"\5&\24\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a"+
		"\u029c\5\60\31\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029f\3"+
		"\2\2\2\u029d\u029e\7\3\2\2\u029e\u02a0\5\u0174\u00bb\2\u029f\u029d\3\2"+
		"\2\2\u029f\u02a0\3\2\2\2\u02a0\u02c2\3\2\2\2\u02a1\u02a2\7\f\2\2\u02a2"+
		"\u02a4\7\63\2\2\u02a3\u02a5\5\30\r\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3"+
		"\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a9\5\u0188\u00c5\2\u02a7\u02a8\7\u009c"+
		"\2\2\u02a8\u02aa\5N(\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ad"+
		"\3\2\2\2\u02ab\u02ac\79\2\2\u02ac\u02ae\5N(\2\u02ad\u02ab\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02b1\5&\24\2\u02b0\u02af\3\2"+
		"\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b4\5\60\31\2\u02b3"+
		"\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7\3"+
		"\2\2\u02b6\u02b7\5\u0174\u00bb\2\u02b7\u02c2\3\2\2\2\u02b8\u02b9\7\f\2"+
		"\2\u02b9\u02bb\7\63\2\2\u02ba\u02bc\5\30\r\2\u02bb\u02ba\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\5\u0188\u00c5\2\u02be\u02bf"+
		"\7$\2\2\u02bf\u02c0\5\u0188\u00c5\2\u02c0\u02c2\3\2\2\2\u02c1\u0270\3"+
		"\2\2\2\u02c1\u0288\3\2\2\2\u02c1\u02a1\3\2\2\2\u02c1\u02b8\3\2\2\2\u02c2"+
		"\37\3\2\2\2\u02c3\u02c4\7\u00e5\2\2\u02c4\u02c9\5\"\22\2\u02c5\u02c6\7"+
		"\u00de\2\2\u02c6\u02c8\5\"\22\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2"+
		"\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c9"+
		"\3\2\2\2\u02cc\u02cd\7\u00e6\2\2\u02cd\u02d3\3\2\2\2\u02ce\u02cf\7\u00e5"+
		"\2\2\u02cf\u02d0\5\u0196\u00cc\2\u02d0\u02d1\7\u00e6\2\2\u02d1\u02d3\3"+
		"\2\2\2\u02d2\u02c3\3\2\2\2\u02d2\u02ce\3\2\2\2\u02d3!\3\2\2\2\u02d4\u02d5"+
		"\5N(\2\u02d5\u02d6\5$\23\2\u02d6#\3\2\2\2\u02d7\u02d8\5d\63\2\u02d8%\3"+
		"\2\2\2\u02d9\u02da\7<\2\2\u02da\u02db\7\u00e5\2\2\u02db\u02e0\5(\25\2"+
		"\u02dc\u02dd\7\u00de\2\2\u02dd\u02df\5(\25\2\u02de\u02dc\3\2\2\2\u02df"+
		"\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\3\2"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\7\u00e6\2\2\u02e4\'\3\2\2\2\u02e5"+
		"\u02e6\7\u0103\2\2\u02e6\u02e7\7\u00db\2\2\u02e7\u02e8\5\u00c4c\2\u02e8"+
		")\3\2\2\2\u02e9\u02ea\79\2\2\u02ea\u02eb\5N(\2\u02eb+\3\2\2\2\u02ec\u02ed"+
		"\7\u009c\2\2\u02ed\u02ee\5.\30\2\u02ee-\3\2\2\2\u02ef\u02f0\5N(\2\u02f0"+
		"/\3\2\2\2\u02f1\u02f6\5\62\32\2\u02f2\u02f6\58\35\2\u02f3\u02f6\5@!\2"+
		"\u02f4\u02f6\5F$\2\u02f5\u02f1\3\2\2\2\u02f5\u02f2\3\2\2\2\u02f5\u02f3"+
		"\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6\61\3\2\2\2\u02f7\u02f8\7\u0081\2\2"+
		"\u02f8\u02f9\7B\2\2\u02f9\u02fa\7\u0089\2\2\u02fa\u02fb\7\u00e5\2\2\u02fb"+
		"\u02fc\5\u019e\u00d0\2\u02fc\u02fd\7\u00e6\2\2\u02fd\u02fe\7\u00e5\2\2"+
		"\u02fe\u02ff\5\64\33\2\u02ff\u0300\7\u00e6\2\2\u0300\63\3\2\2\2\u0301"+
		"\u0306\5\66\34\2\u0302\u0303\7\u00de\2\2\u0303\u0305\5\66\34\2\u0304\u0302"+
		"\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\65\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\7\u0081\2\2\u030a\u030b\5"+
		"H%\2\u030b\u030c\7\u00a8\2\2\u030c\u030d\7q\2\2\u030d\u0319\7\u009d\2"+
		"\2\u030e\u030f\7\u00e5\2\2\u030f\u0310\5\u00c0a\2\u0310\u0311\7\u00e6"+
		"\2\2\u0311\u031a\3\2\2\2\u0312\u0314\7\u00e5\2\2\u0313\u0312\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\7u\2\2\u0316\u0318\7\u00e6"+
		"\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3\2\2\2\u0319"+
		"\u030e\3\2\2\2\u0319\u0313\3\2\2\2\u031a\67\3\2\2\2\u031b\u031c\7\u0081"+
		"\2\2\u031c\u031d\7B\2\2\u031d\u031e\7e\2\2\u031e\u031f\7\u00e5\2\2\u031f"+
		"\u0320\5\u019e\u00d0\2\u0320\u0326\7\u00e6\2\2\u0321\u0322\7\u00e5\2\2"+
		"\u0322\u0323\5:\36\2\u0323\u0324\7\u00e6\2\2\u0324\u0327\3\2\2\2\u0325"+
		"\u0327\5> \2\u0326\u0321\3\2\2\2\u0326\u0325\3\2\2\2\u03279\3\2\2\2\u0328"+
		"\u032d\5<\37\2\u0329\u032a\7\u00de\2\2\u032a\u032c\5<\37\2\u032b\u0329"+
		"\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		";\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331\7\u0081\2\2\u0331\u0332\5H%"+
		"\2\u0332=\3\2\2\2\u0333\u0334\7\u0082\2\2\u0334\u0335\5\u00c4c\2\u0335"+
		"?\3\2\2\2\u0336\u0337\7\u0081\2\2\u0337\u0338\7B\2\2\u0338\u0339\7r\2"+
		"\2\u0339\u033a\7\u00e5\2\2\u033a\u033b\5\u019e\u00d0\2\u033b\u033c\7\u00e6"+
		"\2\2\u033c\u033d\7\u00e5\2\2\u033d\u033e\5B\"\2\u033e\u033f\7\u00e6\2"+
		"\2\u033fA\3\2\2\2\u0340\u0345\5D#\2\u0341\u0342\7\u00de\2\2\u0342\u0344"+
		"\5D#\2\u0343\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345"+
		"\u0346\3\2\2\2\u0346C\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349\7\u0081"+
		"\2\2\u0349\u034a\5H%\2\u034a\u034c\7\u00a8\2\2\u034b\u034d\7\34\2\2\u034c"+
		"\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\7\u00e5"+
		"\2\2\u034f\u0350\5\u01b6\u00dc\2\u0350\u0351\7\u00e6\2\2\u0351E\3\2\2"+
		"\2\u0352\u0353\7\u0081\2\2\u0353\u0354\7B\2\2\u0354\u0355\7H\2\2\u0355"+
		"\u0356\5 \21\2\u0356G\3\2\2\2\u0357\u0358\5N(\2\u0358I\3\2\2\2\u0359\u035b"+
		"\7\u00a4\2\2\u035a\u035c\7\63\2\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2"+
		"\2\2\u035c\u035d\3\2\2\2\u035d\u0362\5\u0188\u00c5\2\u035e\u035f\7\u00de"+
		"\2\2\u035f\u0361\5\u0188\u00c5\2\u0360\u035e\3\2\2\2\u0361\u0364\3\2\2"+
		"\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363K\3\2\2\2\u0364\u0362"+
		"\3\2\2\2\u0365\u0366\7U\2\2\u0366\u0368\7\63\2\2\u0367\u0369\5\34\17\2"+
		"\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c"+
		"\5\u0188\u00c5\2\u036b\u036d\7\u0086\2\2\u036c\u036b\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036dM\3\2\2\2\u036e\u0372\7\u0101\2\2\u036f\u0372\5P)\2\u0370"+
		"\u0372\7\u0102\2\2\u0371\u036e\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0370"+
		"\3\2\2\2\u0372O\3\2\2\2\u0373\u0374\t\3\2\2\u0374Q\3\2\2\2\u0375\u0378"+
		"\5\u0090I\2\u0376\u0378\5T+\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2"+
		"\u0378S\3\2\2\2\u0379\u037d\7\u0103\2\2\u037a\u037d\5V,\2\u037b\u037d"+
		"\5b\62\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b\3\2\2\2\u037d"+
		"U\3\2\2\2\u037e\u0383\5Z.\2\u037f\u0383\5X-\2\u0380\u0383\5\\/\2\u0381"+
		"\u0383\5^\60\2\u0382\u037e\3\2\2\2\u0382\u037f\3\2\2\2\u0382\u0380\3\2"+
		"\2\2\u0382\u0381\3\2\2\2\u0383W\3\2\2\2\u0384\u0385\7\u00c9\2\2\u0385"+
		"\u0386\7\u0103\2\2\u0386Y\3\2\2\2\u0387\u0388\7\u00cb\2\2\u0388\u0389"+
		"\7\u0103\2\2\u0389[\3\2\2\2\u038a\u038b\7\u00c7\2\2\u038b\u038c\7\u0103"+
		"\2\2\u038c]\3\2\2\2\u038d\u038e\7\u00c8\2\2\u038e\u038f\5\u0088E\2\u038f"+
		"\u0390\5`\61\2\u0390_\3\2\2\2\u0391\u0394\5\u01ce\u00e8\2\u0392\u0394"+
		"\5\u01d2\u00ea\2\u0393\u0391\3\2\2\2\u0393\u0392\3\2\2\2\u0394a\3\2\2"+
		"\2\u0395\u0396\t\4\2\2\u0396c\3\2\2\2\u0397\u0398\5f\64\2\u0398e\3\2\2"+
		"\2\u0399\u03a3\5h\65\2\u039a\u03a3\5l\67\2\u039b\u03a3\5n8\2\u039c\u03a3"+
		"\5p9\2\u039d\u03a3\5x=\2\u039e\u03a3\5z>\2\u039f\u03a3\5|?\2\u03a0\u03a3"+
		"\5~@\2\u03a1\u03a3\5\u0080A\2\u03a2\u0399\3\2\2\2\u03a2\u039a\3\2\2\2"+
		"\u03a2\u039b\3\2\2\2\u03a2\u039c\3\2\2\2\u03a2\u039d\3\2\2\2\u03a2\u039e"+
		"\3\2\2\2\u03a2\u039f\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3"+
		"g\3\2\2\2\u03a4\u03a6\7E\2\2\u03a5\u03a7\5j\66\2\u03a6\u03a5\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03bc\3\2\2\2\u03a8\u03aa\7\u00c3\2\2\u03a9\u03ab"+
		"\5j\66\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03bc\3\2\2\2\u03ac"+
		"\u03ad\7E\2\2\u03ad\u03af\7\u00ab\2\2\u03ae\u03b0\5j\66\2\u03af\u03ae"+
		"\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03bc\3\2\2\2\u03b1\u03b2\7\u00c3\2"+
		"\2\u03b2\u03b4\7\u00ab\2\2\u03b3\u03b5\5j\66\2\u03b4\u03b3\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03bc\3\2\2\2\u03b6\u03b8\7\u00c4\2\2\u03b7\u03b9"+
		"\5j\66\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba"+
		"\u03bc\7\u00cd\2\2\u03bb\u03a4\3\2\2\2\u03bb\u03a8\3\2\2\2\u03bb\u03ac"+
		"\3\2\2\2\u03bb\u03b1\3\2\2\2\u03bb\u03b6\3\2\2\2\u03bb\u03ba\3\2\2\2\u03bc"+
		"i\3\2\2\2\u03bd\u03be\7\u00e5\2\2\u03be\u03bf\7\u00fd\2\2\u03bf\u03c0"+
		"\7\u00e6\2\2\u03c0k\3\2\2\2\u03c1\u03c2\7|\2\2\u03c2\u03c4\7E\2\2\u03c3"+
		"\u03c5\5j\66\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03e5\3\2"+
		"\2\2\u03c6\u03c7\7|\2\2\u03c7\u03c9\7\u00c3\2\2\u03c8\u03ca\5j\66\2\u03c9"+
		"\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03e5\3\2\2\2\u03cb\u03cd\7\u00c5"+
		"\2\2\u03cc\u03ce\5j\66\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03e5\3\2\2\2\u03cf\u03d0\7|\2\2\u03d0\u03d1\7E\2\2\u03d1\u03d3\7\u00ab"+
		"\2\2\u03d2\u03d4\5j\66\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u03e5\3\2\2\2\u03d5\u03d6\7|\2\2\u03d6\u03d7\7\u00c3\2\2\u03d7\u03d9"+
		"\7\u00ab\2\2\u03d8\u03da\5j\66\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2"+
		"\2\u03da\u03e5\3\2\2\2\u03db\u03dc\7\u00c5\2\2\u03dc\u03de\7\u00ab\2\2"+
		"\u03dd\u03df\5j\66\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e5"+
		"\3\2\2\2\u03e0\u03e2\7\u00c6\2\2\u03e1\u03e3\5j\66\2\u03e2\u03e1\3\2\2"+
		"\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03c1\3\2\2\2\u03e4\u03c6"+
		"\3\2\2\2\u03e4\u03cb\3\2\2\2\u03e4\u03cf\3\2\2\2\u03e4\u03d5\3\2\2\2\u03e4"+
		"\u03db\3\2\2\2\u03e4\u03e0\3\2\2\2\u03e5m\3\2\2\2\u03e6\u03e8\7\u00d0"+
		"\2\2\u03e7\u03e9\5j\66\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03ef\3\2\2\2\u03ea\u03ec\7\u00d1\2\2\u03eb\u03ed\5j\66\2\u03ec\u03eb"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03e6\3\2\2\2\u03ee"+
		"\u03ea\3\2\2\2\u03efo\3\2\2\2\u03f0\u03f3\5r:\2\u03f1\u03f3\5t;\2\u03f2"+
		"\u03f0\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f3q\3\2\2\2\u03f4\u03f6\7\u00c1"+
		"\2\2\u03f5\u03f7\5v<\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u040a"+
		"\3\2\2\2\u03f8\u03fa\7\u00c2\2\2\u03f9\u03fb\5v<\2\u03fa\u03f9\3\2\2\2"+
		"\u03fa\u03fb\3\2\2\2\u03fb\u040a\3\2\2\2\u03fc\u03fe\7P\2\2\u03fd\u03ff"+
		"\5v<\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u040a\3\2\2\2\u0400"+
		"\u040a\7\u00b3\2\2\u0401\u040a\7\u00b7\2\2\u0402\u040a\7\u00b4\2\2\u0403"+
		"\u040a\7\u00b8\2\2\u0404\u040a\7\u00b5\2\2\u0405\u040a\7\u00b9\2\2\u0406"+
		"\u040a\7\u00ba\2\2\u0407\u040a\7\u00b6\2\2\u0408\u040a\7\u00bb\2\2\u0409"+
		"\u03f4\3\2\2\2\u0409\u03f8\3\2\2\2\u0409\u03fc\3\2\2\2\u0409\u0400\3\2"+
		"\2\2\u0409\u0401\3\2\2\2\u0409\u0402\3\2\2\2\u0409\u0403\3\2\2\2\u0409"+
		"\u0404\3\2\2\2\u0409\u0405\3\2\2\2\u0409\u0406\3\2\2\2\u0409\u0407\3\2"+
		"\2\2\u0409\u0408\3\2\2\2\u040as\3\2\2\2\u040b\u040d\7\u00bf\2\2\u040c"+
		"\u040e\5v<\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0416\3\2\2"+
		"\2\u040f\u0416\7\u00bc\2\2\u0410\u0416\7\u00be\2\2\u0411\u0416\7\u00bd"+
		"\2\2\u0412\u0416\7\u00c0\2\2\u0413\u0414\7\u00c0\2\2\u0414\u0416\7\u0085"+
		"\2\2\u0415\u040b\3\2\2\2\u0415\u040f\3\2\2\2\u0415\u0410\3\2\2\2\u0415"+
		"\u0411\3\2\2\2\u0415\u0412\3\2\2\2\u0415\u0413\3\2\2\2\u0416u\3\2\2\2"+
		"\u0417\u0418\7\u00e5\2\2\u0418\u0419\7\u00fd\2\2\u0419\u0420\7\u00e6\2"+
		"\2\u041a\u041b\7\u00e5\2\2\u041b\u041c\7\u00fd\2\2\u041c\u041d\7\u00de"+
		"\2\2\u041d\u041e\7\u00fd\2\2\u041e\u0420\7\u00e6\2\2\u041f\u0417\3\2\2"+
		"\2\u041f\u041a\3\2\2\2\u0420w\3\2\2\2\u0421\u0422\t\5\2\2\u0422y\3\2\2"+
		"\2\u0423\u0432\7\u00c7\2\2\u0424\u0432\7\u00c8\2\2\u0425\u0432\7\u00c9"+
		"\2\2\u0426\u0427\7\u00c9\2\2\u0427\u0428\7<\2\2\u0428\u0429\7\u00c9\2"+
		"\2\u0429\u0432\7\u00ae\2\2\u042a\u0432\7\u00ca\2\2\u042b\u0432\7\u00cb"+
		"\2\2\u042c\u042d\7\u00cb\2\2\u042d\u042e\7<\2\2\u042e\u042f\7\u00c9\2"+
		"\2\u042f\u0432\7\u00ae\2\2\u0430\u0432\7\u00cc\2\2\u0431\u0423\3\2\2\2"+
		"\u0431\u0424\3\2\2\2\u0431\u0425\3\2\2\2\u0431\u0426\3\2\2\2\u0431\u042a"+
		"\3\2\2\2\u0431\u042b\3\2\2\2\u0431\u042c\3\2\2\2\u0431\u0430\3\2\2\2\u0432"+
		"{\3\2\2\2\u0433\u0435\7\u00b1\2\2\u0434\u0436\5j\66\2\u0435\u0434\3\2"+
		"\2\2\u0435\u0436\3\2\2\2\u0436\u0441\3\2\2\2\u0437\u0439\7\u00b2\2\2\u0438"+
		"\u043a\5j\66\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u0441\3\2"+
		"\2\2\u043b\u043c\7\u00b1\2\2\u043c\u043e\7\u00ab\2\2\u043d\u043f\5j\66"+
		"\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u0433"+
		"\3\2\2\2\u0440\u0437\3\2\2\2\u0440\u043b\3\2\2\2\u0441}\3\2\2\2\u0442"+
		"\u0444\7\u00ce\2\2\u0443\u0445\5j\66\2\u0444\u0443\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u0450\3\2\2\2\u0446\u0447\7\u00ce\2\2\u0447\u0449\7\u00ab"+
		"\2\2\u0448\u044a\5j\66\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u0450\3\2\2\2\u044b\u044d\7\u00cf\2\2\u044c\u044e\5j\66\2\u044d\u044c"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u0442\3\2\2\2\u044f"+
		"\u0446\3\2\2\2\u044f\u044b\3\2\2\2\u0450\177\3\2\2\2\u0451\u0455\5\u0082"+
		"B\2\u0452\u0455\5\u0084C\2\u0453\u0455\5\u0086D\2\u0454\u0451\3\2\2\2"+
		"\u0454\u0452\3\2\2\2\u0454\u0453\3\2\2\2\u0455\u0081\3\2\2\2\u0456\u0457"+
		"\7\u00d2\2\2\u0457\u0458\7\u00e1\2\2\u0458\u0459\5d\63\2\u0459\u045a\7"+
		"\u00e3\2\2\u045a\u0083\3\2\2\2\u045b\u045c\7\u00d4\2\2\u045c\u045d\5 "+
		"\21\2\u045d\u0085\3\2\2\2\u045e\u045f\7\u00d3\2\2\u045f\u0460\7\u00e1"+
		"\2\2\u0460\u0461\5d\63\2\u0461\u0462\7\u00de\2\2\u0462\u0463\5d\63\2\u0463"+
		"\u0464\7\u00e3\2\2\u0464\u0087\3\2\2\2\u0465\u0468\5\u008aF\2\u0466\u0468"+
		"\5\u008cG\2\u0467\u0465\3\2\2\2\u0467\u0466\3\2\2\2\u0468\u0089\3\2\2"+
		"\2\u0469\u046a\7\u00e5\2\2\u046a\u046b\5\u00c0a\2\u046b\u046c\7\u00e6"+
		"\2\2\u046c\u008b\3\2\2\2\u046d\u0476\5\u008eH\2\u046e\u0476\5\u019a\u00ce"+
		"\2\u046f\u0476\5\u0094K\2\u0470\u0476\5\u00a0Q\2\u0471\u0476\5\u01a0\u00d1"+
		"\2\u0472\u0476\5\u00a8U\2\u0473\u0476\5\u00ba^\2\u0474\u0476\5\u01d4\u00eb"+
		"\2\u0475\u046d\3\2\2\2\u0475\u046e\3\2\2\2\u0475\u046f\3\2\2\2\u0475\u0470"+
		"\3\2\2\2\u0475\u0471\3\2\2\2\u0475\u0472\3\2\2\2\u0475\u0473\3\2\2\2\u0475"+
		"\u0474\3\2\2\2\u0476\u008d\3\2\2\2\u0477\u0478\5R*\2\u0478\u008f\3\2\2"+
		"\2\u0479\u047a\t\6\2\2\u047a\u0091\3\2\2\2\u047b\u047d\5\u00ccg\2\u047c"+
		"\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\5\u0090"+
		"I\2\u047f\u0093\3\2\2\2\u0480\u0481\5\u0096L\2\u0481\u0095\3\2\2\2\u0482"+
		"\u0483\7I\2\2\u0483\u0484\7\u00e5\2\2\u0484\u0485\7\u00e9\2\2\u0485\u048b"+
		"\7\u00e6\2\2\u0486\u0488\5\u0098M\2\u0487\u0489\5\u009cO\2\u0488\u0487"+
		"\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a\u0482\3\2\2\2\u048a"+
		"\u0486\3\2\2\2\u048b\u0097\3\2\2\2\u048c\u048d\5\u009aN\2\u048d\u048f"+
		"\7\u00e5\2\2\u048e\u0490\5\u0198\u00cd\2\u048f\u048e\3\2\2\2\u048f\u0490"+
		"\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\5\u00c0a\2\u0492\u0493\7\u00e6"+
		"\2\2\u0493\u0099\3\2\2\2\u0494\u0495\t\7\2\2\u0495\u009b\3\2\2\2\u0496"+
		"\u0497\7]\2\2\u0497\u0498\7\u00e5\2\2\u0498\u0499\7;\2\2\u0499\u049a\5"+
		"\u013e\u00a0\2\u049a\u049b\7\u00e6\2\2\u049b\u009d\3\2\2\2\u049c\u049d"+
		"\7d\2\2\u049d\u049e\7\u00e5\2\2\u049e\u049f\5\u019e\u00d0\2\u049f\u04a0"+
		"\7\u00e6\2\2\u04a0\u009f\3\2\2\2\u04a1\u04a2\5\u00a2R\2\u04a2\u04a3\7"+
		".\2\2\u04a3\u04a4\5\u00a6T\2\u04a4\u00a1\3\2\2\2\u04a5\u04a6\5\u00a4S"+
		"\2\u04a6\u04a7\7\u00e5\2\2\u04a7\u04a8\7\u00e6\2\2\u04a8\u04d2\3\2\2\2"+
		"\u04a9\u04aa\7\u0093\2\2\u04aa\u04ab\7\u00e5\2\2\u04ab\u04d2\7\u00e6\2"+
		"\2\u04ac\u04d2\5\u0096L\2\u04ad\u04ae\7_\2\2\u04ae\u04af\7\u00e5\2\2\u04af"+
		"\u04b0\5\u019a\u00ce\2\u04b0\u04b1\7\u00e6\2\2\u04b1\u04d2\3\2\2\2\u04b2"+
		"\u04b3\7o\2\2\u04b3\u04b4\7\u00e5\2\2\u04b4\u04b5\5\u019a\u00ce\2\u04b5"+
		"\u04b6\7\u00e6\2\2\u04b6\u04d2\3\2\2\2\u04b7\u04b8\7m\2\2\u04b8\u04b9"+
		"\7\u00e5\2\2\u04b9\u04c0\5\u019a\u00ce\2\u04ba\u04bb\7\u00de\2\2\u04bb"+
		"\u04be\5\u00c4c\2\u04bc\u04bd\7\u00de\2\2\u04bd\u04bf\5\u00c2b\2\u04be"+
		"\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\3\2\2\2\u04c0\u04ba\3\2"+
		"\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7\u00e6\2\2\u04c3"+
		"\u04d2\3\2\2\2\u04c4\u04c5\7p\2\2\u04c5\u04c6\7\u00e5\2\2\u04c6\u04cd"+
		"\5\u019a\u00ce\2\u04c7\u04c8\7\u00de\2\2\u04c8\u04cb\5\u00c4c\2\u04c9"+
		"\u04ca\7\u00de\2\2\u04ca\u04cc\5\u00c2b\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc"+
		"\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04c7\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04d0\7\u00e6\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04a5"+
		"\3\2\2\2\u04d1\u04a9\3\2\2\2\u04d1\u04ac\3\2\2\2\u04d1\u04ad\3\2\2\2\u04d1"+
		"\u04b2\3\2\2\2\u04d1\u04b7\3\2\2\2\u04d1\u04c4\3\2\2\2\u04d2\u00a3\3\2"+
		"\2\2\u04d3\u04d4\t\b\2\2\u04d4\u00a5\3\2\2\2\u04d5\u04d8\5\u015a\u00ae"+
		"\2\u04d6\u04d8\5\u015c\u00af\2\u04d7\u04d5\3\2\2\2\u04d7\u04d6\3\2\2\2"+
		"\u04d8\u00a7\3\2\2\2\u04d9\u04da\5\u00acW\2\u04da\u00a9\3\2\2\2\u04db"+
		"\u04dc\7}\2\2\u04dc\u04dd\7\u00e5\2\2\u04dd\u04de\5\u00c4c\2\u04de\u04df"+
		"\7\u00de\2\2\u04df\u04e0\5\u00f8}\2\u04e0\u04e1\7\u00e6\2\2\u04e1\u04ee"+
		"\3\2\2\2\u04e2\u04e3\7G\2\2\u04e3\u04e4\7\u00e5\2\2\u04e4\u04e7\5\u00c4"+
		"c\2\u04e5\u04e6\7\u00de\2\2\u04e6\u04e8\5\u00f8}\2\u04e7\u04e5\3\2\2\2"+
		"\u04e8\u04e9\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb"+
		"\3\2\2\2\u04eb\u04ec\7\u00e6\2\2\u04ec\u04ee\3\2\2\2\u04ed\u04db\3\2\2"+
		"\2\u04ed\u04e2\3\2\2\2\u04ee\u00ab\3\2\2\2\u04ef\u04f2\5\u00aeX\2\u04f0"+
		"\u04f2\5\u00b0Y\2\u04f1\u04ef\3\2\2\2\u04f1\u04f0\3\2\2\2\u04f2\u00ad"+
		"\3\2\2\2\u04f3\u04f4\7\n\2\2\u04f4\u04f6\5\u00f8}\2\u04f5\u04f7\5\u00b2"+
		"Z\2\u04f6\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8"+
		"\u04f9\3\2\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04fc\5\u00b6\\\2\u04fb\u04fa"+
		"\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\7\23\2\2"+
		"\u04fe\u00af\3\2\2\2\u04ff\u0501\7\n\2\2\u0500\u0502\5\u00b4[\2\u0501"+
		"\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2"+
		"\2\2\u0504\u0506\3\2\2\2\u0505\u0507\5\u00b6\\\2\u0506\u0505\3\2\2\2\u0506"+
		"\u0507\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\7\23\2\2\u0509\u00b1\3"+
		"\2\2\2\u050a\u050b\7:\2\2\u050b\u050c\5\u013e\u00a0\2\u050c\u050d\7\64"+
		"\2\2\u050d\u050e\5\u00b8]\2\u050e\u00b3\3\2\2\2\u050f\u0510\7:\2\2\u0510"+
		"\u0511\5\u013e\u00a0\2\u0511\u0512\7\64\2\2\u0512\u0513\5\u00b8]\2\u0513"+
		"\u00b5\3\2\2\2\u0514\u0515\7\24\2\2\u0515\u0516\5\u00b8]\2\u0516\u00b7"+
		"\3\2\2\2\u0517\u051a\5\u00c0a\2\u0518\u051a\7(\2\2\u0519\u0517\3\2\2\2"+
		"\u0519\u0518\3\2\2\2\u051a\u00b9\3\2\2\2\u051b\u051c\7\13\2\2\u051c\u051d"+
		"\7\u00e5\2\2\u051d\u051e\5\u00bc_\2\u051e\u051f\7\3\2\2\u051f\u0520\5"+
		"\u00be`\2\u0520\u0521\7\u00e6\2\2\u0521\u00bb\3\2\2\2\u0522\u0523\5\u00c0"+
		"a\2\u0523\u00bd\3\2\2\2\u0524\u0525\5d\63\2\u0525\u00bf\3\2\2\2\u0526"+
		"\u052a\5\u00c2b\2\u0527\u052a\5\u010c\u0087\2\u0528\u052a\5\u00f8}\2\u0529"+
		"\u0526\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u0528\3\2\2\2\u052a\u00c1\3\2"+
		"\2\2\u052b\u0530\5\u00c4c\2\u052c\u0530\5\u00d8m\2\u052d\u0530\5\u00e8"+
		"u\2\u052e\u0530\7(\2\2\u052f\u052b\3\2\2\2\u052f\u052c\3\2\2\2\u052f\u052d"+
		"\3\2\2\2\u052f\u052e\3\2\2\2\u0530\u00c3\3\2\2\2\u0531\u0536\5\u00c6d"+
		"\2\u0532\u0533\t\t\2\2\u0533\u0535\5\u00c6d\2\u0534\u0532\3\2\2\2\u0535"+
		"\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u00c5\3\2"+
		"\2\2\u0538\u0536\3\2\2\2\u0539\u053e\5\u00c8e\2\u053a\u053b\t\n\2\2\u053b"+
		"\u053d\5\u00c8e\2\u053c\u053a\3\2\2\2\u053d\u0540\3\2\2\2\u053e\u053c"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u00c7\3\2\2\2\u0540\u053e\3\2\2\2\u0541"+
		"\u0543\5\u00ccg\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544"+
		"\3\2\2\2\u0544\u0545\5\u00caf\2\u0545\u00c9\3\2\2\2\u0546\u054b\5\u0088"+
		"E\2\u0547\u0548\7\u00d9\2\2\u0548\u054a\5\u00be`\2\u0549\u0547\3\2\2\2"+
		"\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u0550"+
		"\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u0550\5\u00ceh\2\u054f\u0546\3\2\2"+
		"\2\u054f\u054e\3\2\2\2\u0550\u00cb\3\2\2\2\u0551\u0552\t\t\2\2\u0552\u00cd"+
		"\3\2\2\2\u0553\u0556\5\u00d0i\2\u0554\u0556\5\u00f0y\2\u0555\u0553\3\2"+
		"\2\2\u0555\u0554\3\2\2\2\u0556\u00cf\3\2\2\2\u0557\u0558\7\\\2\2\u0558"+
		"\u0559\7\u00e5\2\2\u0559\u055a\5\u00d2j\2\u055a\u055b\7\30\2\2\u055b\u055c"+
		"\5\u00d6l\2\u055c\u055d\7\u00e6\2\2\u055d\u00d1\3\2\2\2\u055e\u0562\5"+
		"\u01ce\u00e8\2\u055f\u0562\5\u00d4k\2\u0560\u0562\5\u01d2\u00ea\2\u0561"+
		"\u055e\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0560\3\2\2\2\u0562\u00d3\3\2"+
		"\2\2\u0563\u0564\t\13\2\2\u0564\u00d5\3\2\2\2\u0565\u0566\5\u00e8u\2\u0566"+
		"\u00d7\3\2\2\2\u0567\u0568\5\u00dan\2\u0568\u00d9\3\2\2\2\u0569\u056e"+
		"\5\u00dco\2\u056a\u056b\7\u00df\2\2\u056b\u056d\5\u00dco\2\u056c\u056a"+
		"\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u00db\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u0572\5\u00dep\2\u0572\u00dd"+
		"\3\2\2\2\u0573\u0576\5\u0088E\2\u0574\u0576\5\u00e0q\2\u0575\u0573\3\2"+
		"\2\2\u0575\u0574\3\2\2\2\u0576\u00df\3\2\2\2\u0577\u0578\5\u00e2r\2\u0578"+
		"\u00e1\3\2\2\2\u0579\u057a\7\u00a2\2\2\u057a\u057b\7\u00e5\2\2\u057b\u057c"+
		"\5\u00e4s\2\u057c\u057d\7\u00e6\2\2\u057d\u00e3\3\2\2\2\u057e\u0580\5"+
		"\u00e6t\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2"+
		"\u0581\u0583\5\u00dan\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583"+
		"\u0584\3\2\2\2\u0584\u0586\7\30\2\2\u0585\u057f\3\2\2\2\u0585\u0586\3"+
		"\2\2\2\u0586\u0587\3\2\2\2\u0587\u058d\5\u00dan\2\u0588\u0589\5\u00da"+
		"n\2\u0589\u058a\7\u00de\2\2\u058a\u058b\5\u00dan\2\u058b\u058d\3\2\2\2"+
		"\u058c\u0585\3\2\2\2\u058c\u0588\3\2\2\2\u058d\u00e5\3\2\2\2\u058e\u058f"+
		"\t\f\2\2\u058f\u00e7\3\2\2\2\u0590\u0591\5\u00eav\2\u0591\u00e9\3\2\2"+
		"\2\u0592\u0593\5\u00ecw\2\u0593\u00eb\3\2\2\2\u0594\u0595\5\u00eex\2\u0595"+
		"\u00ed\3\2\2\2\u0596\u0599\5\u0088E\2\u0597\u0599\5\u00f0y\2\u0598\u0596"+
		"\3\2\2\2\u0598\u0597\3\2\2\2\u0599\u00ef\3\2\2\2\u059a\u059e\5\u00f2z"+
		"\2\u059b\u059e\5\u00f4{\2\u059c\u059e\5\u00f6|\2\u059d\u059a\3\2\2\2\u059d"+
		"\u059b\3\2\2\2\u059d\u059c\3\2\2\2\u059e\u00f1\3\2\2\2\u059f\u05a4\7\16"+
		"\2\2\u05a0\u05a1\7\16\2\2\u05a1\u05a2\7\u00e5\2\2\u05a2\u05a4\7\u00e6"+
		"\2\2\u05a3\u059f\3\2\2\2\u05a3\u05a0\3\2\2\2\u05a4\u00f3\3\2\2\2\u05a5"+
		"\u05aa\7\17\2\2\u05a6\u05a7\7\17\2\2\u05a7\u05a8\7\u00e5\2\2\u05a8\u05aa"+
		"\7\u00e6\2\2\u05a9\u05a5\3\2\2\2\u05a9\u05a6\3\2\2\2\u05aa\u00f5\3\2\2"+
		"\2\u05ab\u05ac\7\20\2\2\u05ac\u00f7\3\2\2\2\u05ad\u05ae\5\u00fa~\2\u05ae"+
		"\u00f9\3\2\2\2\u05af\u05b4\5\u00fc\177\2\u05b0\u05b1\7+\2\2\u05b1\u05b3"+
		"\5\u00fa~\2\u05b2\u05b0\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2"+
		"\2\u05b4\u05b5\3\2\2\2\u05b5\u00fb\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05bc"+
		"\5\u00fe\u0080\2\u05b8\u05b9\7\5\2\2\u05b9\u05bb\5\u00fc\177\2\u05ba\u05b8"+
		"\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd"+
		"\u00fd\3\2\2\2\u05be\u05bc\3\2\2\2\u05bf\u05c3\5\u0100\u0081\2\u05c0\u05c1"+
		"\7\'\2\2\u05c1\u05c3\5\u0100\u0081\2\u05c2\u05bf\3\2\2\2\u05c2\u05c0\3"+
		"\2\2\2\u05c3\u00ff\3\2\2\2\u05c4\u05c6\5\u0106\u0084\2\u05c5\u05c7\5\u0102"+
		"\u0082\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u0101\3\2\2\2\u05c8"+
		"\u05ca\7 \2\2\u05c9\u05cb\7\'\2\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2"+
		"\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\5\u0104\u0083\2\u05cd\u0103\3\2\2"+
		"\2\u05ce\u05cf\t\4\2\2\u05cf\u0105\3\2\2\2\u05d0\u05d3\5\u01a8\u00d5\2"+
		"\u05d1\u05d3\5\u0108\u0085\2\u05d2\u05d0\3\2\2\2\u05d2\u05d1\3\2\2\2\u05d3"+
		"\u0107\3\2\2\2\u05d4\u05d7\5\u010a\u0086\2\u05d5\u05d7\5\u008cG\2\u05d6"+
		"\u05d4\3\2\2\2\u05d6\u05d5\3\2\2\2\u05d7\u0109\3\2\2\2\u05d8\u05d9\7\u00e5"+
		"\2\2\u05d9\u05da\5\u00f8}\2\u05da\u05db\7\u00e6\2\2\u05db\u010b\3\2\2"+
		"\2\u05dc\u05df\5\u0114\u008b\2\u05dd\u05df\5\u010e\u0088\2\u05de\u05dc"+
		"\3\2\2\2\u05de\u05dd\3\2\2\2\u05df\u010d\3\2\2\2\u05e0\u05e1\7(\2\2\u05e1"+
		"\u010f\3\2\2\2\u05e2\u05e5\5\u0114\u008b\2\u05e3\u05e5\5\u0112\u008a\2"+
		"\u05e4\u05e2\3\2\2\2\u05e4\u05e3\3\2\2\2\u05e5\u0111\3\2\2\2\u05e6\u05e9"+
		"\5\u00c2b\2\u05e7\u05e9\5\u0108\u0085\2\u05e8\u05e6\3\2\2\2\u05e8\u05e7"+
		"\3\2\2\2\u05e9\u0113\3\2\2\2\u05ea\u05eb\5\u008cG\2\u05eb\u0115\3\2\2"+
		"\2\u05ec\u05ee\5\u0118\u008d\2\u05ed\u05ef\5\u013c\u009f\2\u05ee\u05ed"+
		"\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f1\3\2\2\2\u05f0\u05f2\5\u0140\u00a1"+
		"\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05f5"+
		"\5\u0150\u00a9\2\u05f4\u05f3\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f7\3"+
		"\2\2\2\u05f6\u05f8\5\u01dc\u00ef\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2"+
		"\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05fb\5\u0154\u00ab\2\u05fa\u05f9\3\2\2"+
		"\2\u05fa\u05fb\3\2\2\2\u05fb\u05fd\3\2\2\2\u05fc\u05fe\5\u01e4\u00f3\2"+
		"\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0117\3\2\2\2\u05ff\u0600"+
		"\7\30\2\2\u0600\u0601\5\u011a\u008e\2\u0601\u0119\3\2\2\2\u0602\u0607"+
		"\5\u011c\u008f\2\u0603\u0604\7\u00de\2\2\u0604\u0606\5\u011c\u008f\2\u0605"+
		"\u0603\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2"+
		"\2\2\u0608\u011b\3\2\2\2\u0609\u0607\3\2\2\2\u060a\u060d\5\u011e\u0090"+
		"\2\u060b\u060d\5\u0136\u009c\2\u060c\u060a\3\2\2\2\u060c\u060b\3\2\2\2"+
		"\u060d\u011d\3\2\2\2\u060e\u0610\5\u0136\u009c\2\u060f\u0611\5\u0120\u0091"+
		"\2\u0610\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613"+
		"\3\2\2\2\u0613\u011f\3\2\2\2\u0614\u0615\7\r\2\2\u0615\u0616\7!\2\2\u0616"+
		"\u0628\5\u0136\u009c\2\u0617\u0619\5\u012a\u0096\2\u0618\u0617\3\2\2\2"+
		"\u0618\u0619\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\7!\2\2\u061b\u061c"+
		"\5\u0136\u009c\2\u061c\u061d\5\u0130\u0099\2\u061d\u0628\3\2\2\2\u061e"+
		"\u0620\7&\2\2\u061f\u0621\5\u012a\u0096\2\u0620\u061f\3\2\2\2\u0620\u0621"+
		"\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623\7!\2\2\u0623\u0628\5\u0136\u009c"+
		"\2\u0624\u0625\7\67\2\2\u0625\u0626\7!\2\2\u0626\u0628\5\u0136\u009c\2"+
		"\u0627\u0614\3\2\2\2\u0627\u0618\3\2\2\2\u0627\u061e\3\2\2\2\u0627\u0624"+
		"\3\2\2\2\u0628\u0121\3\2\2\2\u0629\u062a\7\r\2\2\u062a\u062b\7!\2\2\u062b"+
		"\u062c\5\u0136\u009c\2\u062c\u0123\3\2\2\2\u062d\u062f\5\u012a\u0096\2"+
		"\u062e\u062d\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631"+
		"\7!\2\2\u0631\u0632\5\u0136\u009c\2\u0632\u0633\5\u0130\u0099\2\u0633"+
		"\u0125\3\2\2\2\u0634\u0636\7&\2\2\u0635\u0637\5\u012a\u0096\2\u0636\u0635"+
		"\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\7!\2\2\u0639"+
		"\u063a\5\u0136\u009c\2\u063a\u0127\3\2\2\2\u063b\u063c\7\67\2\2\u063c"+
		"\u063d\7!\2\2\u063d\u063e\5\u0136\u009c\2\u063e\u0129\3\2\2\2\u063f\u0642"+
		"\7\35\2\2\u0640\u0642\5\u012c\u0097\2\u0641\u063f\3\2\2\2\u0641\u0640"+
		"\3\2\2\2\u0642\u012b\3\2\2\2\u0643\u0645\5\u012e\u0098\2\u0644\u0646\7"+
		"-\2\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u012d\3\2\2\2\u0647"+
		"\u0648\t\r\2\2\u0648\u012f\3\2\2\2\u0649\u064c\5\u0132\u009a\2\u064a\u064c"+
		"\5\u0134\u009b\2\u064b\u0649\3\2\2\2\u064b\u064a\3\2\2\2\u064c\u0131\3"+
		"\2\2\2\u064d\u064e\7*\2\2\u064e\u064f\5\u013e\u00a0\2\u064f\u0133\3\2"+
		"\2\2\u0650\u0651\79\2\2\u0651\u0652\7\u00e5\2\2\u0652\u0653\5\u019e\u00d0"+
		"\2\u0653\u0654\7\u00e6\2\2\u0654\u0135\3\2\2\2\u0655\u065a\5\u0186\u00c4"+
		"\2\u0656\u0658\7\3\2\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u0659"+
		"\3\2\2\2\u0659\u065b\5N(\2\u065a\u0657\3\2\2\2\u065a\u065b\3\2\2\2\u065b"+
		"\u0660\3\2\2\2\u065c\u065d\7\u00e5\2\2\u065d\u065e\5\u0138\u009d\2\u065e"+
		"\u065f\7\u00e6\2\2\u065f\u0661\3\2\2\2\u0660\u065c\3\2\2\2\u0660\u0661"+
		"\3\2\2\2\u0661\u067e\3\2\2\2\u0662\u0663\7\u00e5\2\2\u0663\u0668\5\u0186"+
		"\u00c4\2\u0664\u0666\7\3\2\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666"+
		"\u0667\3\2\2\2\u0667\u0669\5N(\2\u0668\u0665\3\2\2\2\u0668\u0669\3\2\2"+
		"\2\u0669\u066e\3\2\2\2\u066a\u066b\7\u00e5\2\2\u066b\u066c\5\u0138\u009d"+
		"\2\u066c\u066d\7\u00e6\2\2\u066d\u066f\3\2\2\2\u066e\u066a\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\7\u00e6\2\2\u0671\u067e"+
		"\3\2\2\2\u0672\u0674\5\u013a\u009e\2\u0673\u0675\7\3\2\2\u0674\u0673\3"+
		"\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u067b\5N(\2\u0677"+
		"\u0678\7\u00e5\2\2\u0678\u0679\5\u0138\u009d\2\u0679\u067a\7\u00e6\2\2"+
		"\u067a\u067c\3\2\2\2\u067b\u0677\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e"+
		"\3\2\2\2\u067d\u0655\3\2\2\2\u067d\u0662\3\2\2\2\u067d\u0672\3\2\2\2\u067e"+
		"\u0137\3\2\2\2\u067f\u0684\5N(\2\u0680\u0681\7\u00de\2\2\u0681\u0683\5"+
		"N(\2\u0682\u0680\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684"+
		"\u0685\3\2\2\2\u0685\u0139\3\2\2\2\u0686\u0684\3\2\2\2\u0687\u0688\5\u01a4"+
		"\u00d3\2\u0688\u013b\3\2\2\2\u0689\u068a\7;\2\2\u068a\u068b\5\u013e\u00a0"+
		"\2\u068b\u013d\3\2\2\2\u068c\u068d\5\u00c0a\2\u068d\u013f\3\2\2\2\u068e"+
		"\u068f\7\31\2\2\u068f\u0690\7B\2\2\u0690\u0691\5\u0142\u00a2\2\u0691\u0141"+
		"\3\2\2\2\u0692\u0697\5\u0144\u00a3\2\u0693\u0694\7\u00de\2\2\u0694\u0696"+
		"\5\u0144\u00a3\2\u0695\u0693\3\2\2\2\u0696\u0699\3\2\2\2\u0697\u0695\3"+
		"\2\2\2\u0697\u0698\3\2\2\2\u0698\u0143\3\2\2\2\u0699\u0697\3\2\2\2\u069a"+
		"\u069f\5\u014a\u00a6\2\u069b\u069f\5\u014c\u00a7\2\u069c\u069f\5\u014e"+
		"\u00a8\2\u069d\u069f\5\u0146\u00a4\2\u069e\u069a\3\2\2\2\u069e\u069b\3"+
		"\2\2\2\u069e\u069c\3\2\2\2\u069e\u069d\3\2\2\2\u069f\u0145\3\2\2\2\u06a0"+
		"\u06a6\5\u0110\u0089\2\u06a1\u06a2\7\u00e5\2\2\u06a2\u06a3\5\u0152\u00aa"+
		"\2\u06a3\u06a4\7\u00e6\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a0\3\2\2\2\u06a5"+
		"\u06a1\3\2\2\2\u06a6\u0147\3\2\2\2\u06a7\u06ac\5\u0146\u00a4\2\u06a8\u06a9"+
		"\7\u00de\2\2\u06a9\u06ab\5\u0146\u00a4\2\u06aa\u06a8\3\2\2\2\u06ab\u06ae"+
		"\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u0149\3\2\2\2\u06ae"+
		"\u06ac\3\2\2\2\u06af\u06b0\7\u0090\2\2\u06b0\u06b1\7\u00e5\2\2\u06b1\u06b2"+
		"\5\u0148\u00a5\2\u06b2\u06b3\7\u00e6\2\2\u06b3\u014b\3\2\2\2\u06b4\u06b5"+
		"\7J\2\2\u06b5\u06b6\7\u00e5\2\2\u06b6\u06b7\5\u0148\u00a5\2\u06b7\u06b8"+
		"\7\u00e6\2\2\u06b8\u014d\3\2\2\2\u06b9\u06ba\7\u00e5\2\2\u06ba\u06bb\7"+
		"\u00e6\2\2\u06bb\u014f\3\2\2\2\u06bc\u06bd\7\32\2\2\u06bd\u06be\5\u00f8"+
		"}\2\u06be\u0151\3\2\2\2\u06bf\u06c4\5\u0110\u0089\2\u06c0\u06c1\7\u00de"+
		"\2\2\u06c1\u06c3\5\u0110\u0089\2\u06c2\u06c0\3\2\2\2\u06c3\u06c6\3\2\2"+
		"\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u0153\3\2\2\2\u06c6\u06c4"+
		"\3\2\2\2\u06c7\u06c8\7=\2\2\u06c8\u06c9\5\u0156\u00ac\2\u06c9\u0155\3"+
		"\2\2\2\u06ca\u06cf\5\u0158\u00ad\2\u06cb\u06cc\7\u00de\2\2\u06cc\u06ce"+
		"\5\u0158\u00ad\2\u06cd\u06cb\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3"+
		"\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u0157\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d2"+
		"\u06d3\5\u015a\u00ae\2\u06d3\u06d4\7\3\2\2\u06d4\u06d5\5\u015c\u00af\2"+
		"\u06d5\u0159\3\2\2\2\u06d6\u06d7\5N(\2\u06d7\u015b\3\2\2\2\u06d8\u06d9"+
		"\7\u00e5\2\2\u06d9\u06da\5\u015e\u00b0\2\u06da\u06db\7\u00e6\2\2\u06db"+
		"\u015d\3\2\2\2\u06dc\u06de\5\u0160\u00b1\2\u06dd\u06dc\3\2\2\2\u06dd\u06de"+
		"\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06e1\5\u0162\u00b2\2\u06e0\u06df\3"+
		"\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06e4\5\u0164\u00b3"+
		"\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e7"+
		"\5\u0166\u00b4\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u015f\3"+
		"\2\2\2\u06e8\u06e9\5\u015a\u00ae\2\u06e9\u0161\3\2\2\2\u06ea\u06eb\7\u0081"+
		"\2\2\u06eb\u06ec\7B\2\2\u06ec\u06ed\5\u0152\u00aa\2\u06ed\u0163\3\2\2"+
		"\2\u06ee\u06ef\5\u01dc\u00ef\2\u06ef\u0165\3\2\2\2\u06f0\u06f1\5\u0168"+
		"\u00b5\2\u06f1\u06f3\5\u016a\u00b6\2\u06f2\u06f4\5\u0172\u00ba\2\u06f3"+
		"\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u0167\3\2\2\2\u06f5\u06f6\t\16"+
		"\2\2\u06f6\u0169\3\2\2\2\u06f7\u06fa\5\u016c\u00b7\2\u06f8\u06fa\5\u016e"+
		"\u00b8\2\u06f9\u06f7\3\2\2\2\u06f9\u06f8\3\2\2\2\u06fa\u016b\3\2\2\2\u06fb"+
		"\u06fc\7\u00a5\2\2\u06fc\u0703\7\u0084\2\2\u06fd\u06fe\5\u008eH\2\u06fe"+
		"\u06ff\7\u0084\2\2\u06ff\u0703\3\2\2\2\u0700\u0701\7L\2\2\u0701\u0703"+
		"\7\u0091\2\2\u0702\u06fb\3\2\2\2\u0702\u06fd\3\2\2\2\u0702\u0700\3\2\2"+
		"\2\u0703\u016d\3\2\2\2\u0704\u0705\7A\2\2\u0705\u0706\5\u016c\u00b7\2"+
		"\u0706\u0707\7\5\2\2\u0707\u0708\5\u0170\u00b9\2\u0708\u016f\3\2\2\2\u0709"+
		"\u070a\7\u00a5\2\2\u070a\u0711\7`\2\2\u070b\u070c\5\u008eH\2\u070c\u070d"+
		"\7`\2\2\u070d\u0711\3\2\2\2\u070e\u070f\7L\2\2\u070f\u0711\7\u0091\2\2"+
		"\u0710\u0709\3\2\2\2\u0710\u070b\3\2\2\2\u0710\u070e\3\2\2\2\u0711\u0171"+
		"\3\2\2\2\u0712\u0713\7X\2\2\u0713\u0714\7L\2\2\u0714\u071d\7\u0091\2\2"+
		"\u0715\u0716\7X\2\2\u0716\u071d\7\31\2\2\u0717\u0718\7X\2\2\u0718\u071d"+
		"\7\u009e\2\2\u0719\u071a\7X\2\2\u071a\u071b\7~\2\2\u071b\u071d\7\u0080"+
		"\2\2\u071c\u0712\3\2\2\2\u071c\u0715\3\2\2\2\u071c\u0717\3\2\2\2\u071c"+
		"\u0719\3\2\2\2\u071d\u0173\3\2\2\2\u071e\u071f\5\u0176\u00bc\2\u071f\u0175"+
		"\3\2\2\2\u0720\u0723\5\u0178\u00bd\2\u0721\u0723\5\u011e\u0090\2\u0722"+
		"\u0720\3\2\2\2\u0722\u0721\3\2\2\2\u0723\u0177\3\2\2\2\u0724\u072d\5\u017c"+
		"\u00bf\2\u0725\u0726\5\u011e\u0090\2\u0726\u0728\t\17\2\2\u0727\u0729"+
		"\t\20\2\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\3\2\2\2"+
		"\u072a\u072b\5\u017a\u00be\2\u072b\u072d\3\2\2\2\u072c\u0724\3\2\2\2\u072c"+
		"\u0725\3\2\2\2\u072d\u0735\3\2\2\2\u072e\u0730\t\17\2\2\u072f\u0731\t"+
		"\20\2\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\3\2\2\2\u0732"+
		"\u0734\5\u017a\u00be\2\u0733\u072e\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733"+
		"\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0179\3\2\2\2\u0737\u0735\3\2\2\2\u0738"+
		"\u073b\5\u017c\u00bf\2\u0739\u073b\5\u011e\u0090\2\u073a\u0738\3\2\2\2"+
		"\u073a\u0739\3\2\2\2\u073b\u017b\3\2\2\2\u073c\u0745\5\u0180\u00c1\2\u073d"+
		"\u073e\5\u011e\u0090\2\u073e\u0740\7\36\2\2\u073f\u0741\t\20\2\2\u0740"+
		"\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743\5\u017e"+
		"\u00c0\2\u0743\u0745\3\2\2\2\u0744\u073c\3\2\2\2\u0744\u073d\3\2\2\2\u0745"+
		"\u074d\3\2\2\2\u0746\u0748\7\36\2\2\u0747\u0749\t\20\2\2\u0748\u0747\3"+
		"\2\2\2\u0748\u0749\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074c\5\u017e\u00c0"+
		"\2\u074b\u0746\3\2\2\2\u074c\u074f\3\2\2\2\u074d\u074b\3\2\2\2\u074d\u074e"+
		"\3\2\2\2\u074e\u017d\3\2\2\2\u074f\u074d\3\2\2\2\u0750\u0753\5\u0180\u00c1"+
		"\2\u0751\u0753\5\u011e\u0090\2\u0752\u0750\3\2\2\2\u0752\u0751\3\2\2\2"+
		"\u0753\u017f\3\2\2\2\u0754\u075a\5\u0182\u00c2\2\u0755\u0756\7\u00e5\2"+
		"\2\u0756\u0757\5\u0178\u00bd\2\u0757\u0758\7\u00e6\2\2\u0758\u075a\3\2"+
		"\2\2\u0759\u0754\3\2\2\2\u0759\u0755\3\2\2\2\u075a\u0181\3\2\2\2\u075b"+
		"\u075e\5\u018c\u00c7\2\u075c\u075e\5\u0184\u00c3\2\u075d\u075b\3\2\2\2"+
		"\u075d\u075c\3\2\2\2\u075e\u0183\3\2\2\2\u075f\u0760\7\63\2\2\u0760\u0761"+
		"\5\u0186\u00c4\2\u0761\u0185\3\2\2\2\u0762\u0765\5\u0188\u00c5\2\u0763"+
		"\u0765\5N(\2\u0764\u0762\3\2\2\2\u0764\u0763\3\2\2\2\u0765\u0187\3\2\2"+
		"\2\u0766\u076d\5N(\2\u0767\u0768\7\u00ec\2\2\u0768\u076b\5N(\2\u0769\u076a"+
		"\7\u00ec\2\2\u076a\u076c\5N(\2\u076b\u0769\3\2\2\2\u076b\u076c\3\2\2\2"+
		"\u076c\u076e\3\2\2\2\u076d\u0767\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u0189"+
		"\3\2\2\2\u076f\u0770\5N(\2\u0770\u018b\3\2\2\2\u0771\u0773\7\60\2\2\u0772"+
		"\u0774\5\u0198\u00cd\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775"+
		"\3\2\2\2\u0775\u0777\5\u018e\u00c8\2\u0776\u0778\5\u0116\u008c\2\u0777"+
		"\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u018d\3\2\2\2\u0779\u077e\5\u0190"+
		"\u00c9\2\u077a\u077b\7\u00de\2\2\u077b\u077d\5\u0190\u00c9\2\u077c\u077a"+
		"\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f\3\2\2\2\u077f"+
		"\u018f\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0784\5\u0192\u00ca\2\u0782\u0784"+
		"\5\u0194\u00cb\2\u0783\u0781\3\2\2\2\u0783\u0782\3\2\2\2\u0784\u0191\3"+
		"\2\2\2\u0785\u0787\5\u00c0a\2\u0786\u0788\5\u019c\u00cf\2\u0787\u0786"+
		"\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0193\3\2\2\2\u0789\u078a\5N(\2\u078a"+
		"\u078b\7\u00ec\2\2\u078b\u078d\3\2\2\2\u078c\u0789\3\2\2\2\u078c\u078d"+
		"\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\5\u0196\u00cc\2\u078f\u0195\3"+
		"\2\2\2\u0790\u0791\7\u00e9\2\2\u0791\u0197\3\2\2\2\u0792\u0793\t\20\2"+
		"\2\u0793\u0199\3\2\2\2\u0794\u0799\5N(\2\u0795\u0796\7\u00ec\2\2\u0796"+
		"\u0798\5N(\2\u0797\u0795\3\2\2\2\u0798\u079b\3\2\2\2\u0799\u0797\3\2\2"+
		"\2\u0799\u079a\3\2\2\2\u079a\u019b\3\2\2\2\u079b\u0799\3\2\2\2\u079c\u079e"+
		"\7\3\2\2\u079d\u079c\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\3\2\2\2\u079f"+
		"\u07a0\5N(\2\u07a0\u019d\3\2\2\2\u07a1\u07a6\5\u019a\u00ce\2\u07a2\u07a3"+
		"\7\u00de\2\2\u07a3\u07a5\5\u019a\u00ce\2\u07a4\u07a2\3\2\2\2\u07a5\u07a8"+
		"\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u019f\3\2\2\2\u07a8"+
		"\u07a6\3\2\2\2\u07a9\u07aa\5\u01a6\u00d4\2\u07aa\u01a1\3\2\2\2\u07ab\u07ac"+
		"\5\u01a6\u00d4\2\u07ac\u01a3\3\2\2\2\u07ad\u07ae\5\u01a6\u00d4\2\u07ae"+
		"\u01a5\3\2\2\2\u07af\u07b0\7\u00e5\2\2\u07b0\u07b1\5\u0174\u00bb\2\u07b1"+
		"\u07b2\7\u00e6\2\2\u07b2\u01a7\3\2\2\2\u07b3\u07ba\5\u01aa\u00d6\2\u07b4"+
		"\u07ba\5\u01ae\u00d8\2\u07b5\u07ba\5\u01b2\u00da\2\u07b6\u07ba\5\u01b8"+
		"\u00dd\2\u07b7\u07ba\5\u01c0\u00e1\2\u07b8\u07ba\5\u01ca\u00e6\2\u07b9"+
		"\u07b3\3\2\2\2\u07b9\u07b4\3\2\2\2\u07b9\u07b5\3\2\2\2\u07b9\u07b6\3\2"+
		"\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07b8\3\2\2\2\u07ba\u01a9\3\2\2\2\u07bb"+
		"\u07bc\5\u0110\u0089\2\u07bc\u07bd\5\u01ac\u00d7\2\u07bd\u07be\5\u0110"+
		"\u0089\2\u07be\u01ab\3\2\2\2\u07bf\u07c0\t\21\2\2\u07c0\u01ad\3\2\2\2"+
		"\u07c1\u07c2\5\u0110\u0089\2\u07c2\u07c3\5\u01b0\u00d9\2\u07c3\u01af\3"+
		"\2\2\2\u07c4\u07c6\7\'\2\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6"+
		"\u07c7\3\2\2\2\u07c7\u07c9\7A\2\2\u07c8\u07ca\t\22\2\2\u07c9\u07c8\3\2"+
		"\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cc\5\u0110\u0089"+
		"\2\u07cc\u07cd\7\5\2\2\u07cd\u07ce\5\u0110\u0089\2\u07ce\u01b1\3\2\2\2"+
		"\u07cf\u07d1\5\u00c4c\2\u07d0\u07d2\7\'\2\2\u07d1\u07d0\3\2\2\2\u07d1"+
		"\u07d2\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d4\7\34\2\2\u07d4\u07d5\5"+
		"\u01b4\u00db\2\u07d5\u01b3\3\2\2\2\u07d6\u07dc\5\u01a4\u00d3\2\u07d7\u07d8"+
		"\7\u00e5\2\2\u07d8\u07d9\5\u01b6\u00dc\2\u07d9\u07da\7\u00e6\2\2\u07da"+
		"\u07dc\3\2\2\2\u07db\u07d6\3\2\2\2\u07db\u07d7\3\2\2\2\u07dc\u01b5\3\2"+
		"\2\2\u07dd\u07e2\5\u0110\u0089\2\u07de\u07df\7\u00de\2\2\u07df\u07e1\5"+
		"\u0110\u0089\2\u07e0\u07de\3\2\2\2\u07e1\u07e4\3\2\2\2\u07e2\u07e0\3\2"+
		"\2\2\u07e2\u07e3\3\2\2\2\u07e3\u01b7\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e5"+
		"\u07e6\5\u0110\u0089\2\u07e6\u07e7\5\u01ba\u00de\2\u07e7\u07e8\7\u0103"+
		"\2\2\u07e8\u01b9\3\2\2\2\u07e9\u07eb\7\'\2\2\u07ea\u07e9\3\2\2\2\u07ea"+
		"\u07eb\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ef\5\u01bc\u00df\2\u07ed\u07ef"+
		"\5\u01be\u00e0\2\u07ee\u07ea\3\2\2\2\u07ee\u07ed\3\2\2\2\u07ef\u01bb\3"+
		"\2\2\2\u07f0\u07f7\7$\2\2\u07f1\u07f7\7\33\2\2\u07f2\u07f3\7\u0097\2\2"+
		"\u07f3\u07f7\7\u00a3\2\2\u07f4\u07f7\7\u008b\2\2\u07f5\u07f7\7\u008f\2"+
		"\2\u07f6\u07f0\3\2\2\2\u07f6\u07f1\3\2\2\2\u07f6\u07f2\3\2\2\2\u07f6\u07f4"+
		"\3\2\2\2\u07f6\u07f5\3\2\2\2\u07f7\u01bd\3\2\2\2\u07f8\u07f9\t\23\2\2"+
		"\u07f9\u01bf\3\2\2\2\u07fa\u07fb\5\u0110\u0089\2\u07fb\u07fd\7 \2\2\u07fc"+
		"\u07fe\7\'\2\2\u07fd\u07fc\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u07ff\3\2"+
		"\2\2\u07ff\u0800\7(\2\2\u0800\u01c1\3\2\2\2\u0801\u0802\5\u00c4c\2\u0802"+
		"\u0803\5\u01ac\u00d7\2\u0803\u0804\5\u01c4\u00e3\2\u0804\u0805\5\u01a4"+
		"\u00d3\2\u0805\u01c3\3\2\2\2\u0806\u0809\5\u01c6\u00e4\2\u0807\u0809\5"+
		"\u01c8\u00e5\2\u0808\u0806\3\2\2\2\u0808\u0807\3\2\2\2\u0809\u01c5\3\2"+
		"\2\2\u080a\u080b\7\4\2\2\u080b\u01c7\3\2\2\2\u080c\u080d\t\24\2\2\u080d"+
		"\u01c9\3\2\2\2\u080e\u0810\7\'\2\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2"+
		"\2\2\u0810\u0811\3\2\2\2\u0811\u0812\7Y\2\2\u0812\u0813\5\u01a4\u00d3"+
		"\2\u0813\u01cb\3\2\2\2\u0814\u0815\78\2\2\u0815\u0816\5\u01a4\u00d3\2"+
		"\u0816\u01cd\3\2\2\2\u0817\u081a\5\u01d0\u00e9\2\u0818\u081a\7\u0094\2"+
		"\2\u0819\u0817\3\2\2\2\u0819\u0818\3\2\2\2\u081a\u01cf\3\2\2\2\u081b\u081c"+
		"\t\25\2\2\u081c\u01d1\3\2\2\2\u081d\u081e\t\26\2\2\u081e\u01d3\3\2\2\2"+
		"\u081f\u0820\5\u01d8\u00ed\2\u0820\u0822\7\u00e5\2\2\u0821\u0823\5\u01da"+
		"\u00ee\2\u0822\u0821\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\3\2\2\2\u0824"+
		"\u0825\7\u00e6\2\2\u0825\u01d5\3\2\2\2\u0826\u0827\t\27\2\2\u0827\u01d7"+
		"\3\2\2\2\u0828\u082b\5N(\2\u0829\u082b\5\u01d6\u00ec\2\u082a\u0828\3\2"+
		"\2\2\u082a\u0829\3\2\2\2\u082b\u01d9\3\2\2\2\u082c\u0831\5\u00c0a\2\u082d"+
		"\u082e\7\u00de\2\2\u082e\u0830\5\u00c0a\2\u082f\u082d\3\2\2\2\u0830\u0833"+
		"\3\2\2\2\u0831\u082f\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u01db\3\2\2\2\u0833"+
		"\u0831\3\2\2\2\u0834\u0835\7,\2\2\u0835\u0836\7B\2\2\u0836\u0837\5\u01de"+
		"\u00f0\2\u0837\u01dd\3\2\2\2\u0838\u083d\5\u01e0\u00f1\2\u0839\u083a\7"+
		"\u00de\2\2\u083a\u083c\5\u01e0\u00f1\2\u083b\u0839\3\2\2\2\u083c\u083f"+
		"\3\2\2\2\u083d\u083b\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u01df\3\2\2\2\u083f"+
		"\u083d\3\2\2\2\u0840\u0842\5\u0110\u0089\2\u0841\u0843\5\u01e2\u00f2\2"+
		"\u0842\u0841\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0845\3\2\2\2\u0844\u0846"+
		"\5\u01e6\u00f4\2\u0845\u0844\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u01e1\3"+
		"\2\2\2\u0847\u0848\t\30\2\2\u0848\u01e3\3\2\2\2\u0849\u084a\7%\2\2\u084a"+
		"\u084b\5\u00c4c\2\u084b\u01e5\3\2\2\2\u084c\u084d\7)\2\2\u084d\u0851\7"+
		"^\2\2\u084e\u084f\7)\2\2\u084f\u0851\7n\2\2\u0850\u084c\3\2\2\2\u0850"+
		"\u084e\3\2\2\2\u0851\u01e7\3\2\2\2\u0852\u0854\7i\2\2\u0853\u0855\7\177"+
		"\2\2\u0854\u0853\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\3\2\2\2\u0856"+
		"\u0857\7\37\2\2\u0857\u085c\5\u0188\u00c5\2\u0858\u0859\7\u00e5\2\2\u0859"+
		"\u085a\5\u019e\u00d0\2\u085a\u085b\7\u00e6\2\2\u085b\u085d\3\2\2\2\u085c"+
		"\u0858\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\5\u0174"+
		"\u00bb\2\u085f\u0888\3\2\2\2\u0860\u0862\7i\2\2\u0861\u0863\7\177\2\2"+
		"\u0862\u0861\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0865"+
		"\7\37\2\2\u0865\u086a\5\u0188\u00c5\2\u0866\u0867\7\u00e5\2\2\u0867\u0868"+
		"\5\u019e\u00d0\2\u0868\u0869\7\u00e6\2\2\u0869\u086b\3\2\2\2\u086a\u0866"+
		"\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086d\7\u00a8\2"+
		"\2\u086d\u086e\7\u00e5\2\2\u086e\u0873\5\u0110\u0089\2\u086f\u0870\7\u00de"+
		"\2\2\u0870\u0872\5\u0110\u0089\2\u0871\u086f\3\2\2\2\u0872\u0875\3\2\2"+
		"\2\u0873\u0871\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0876\3\2\2\2\u0875\u0873"+
		"\3\2\2\2\u0876\u0877\7\u00e6\2\2\u0877\u0888\3\2\2\2\u0878\u087a\7i\2"+
		"\2\u0879\u087b\7\177\2\2\u087a\u0879\3\2\2\2\u087a\u087b\3\2\2\2\u087b"+
		"\u087c\3\2\2\2\u087c\u087d\7\37\2\2\u087d\u087e\7s\2\2\u087e\u0884\7\u0103"+
		"\2\2\u087f\u0880\79\2\2\u0880\u0882\5N(\2\u0881\u0883\5&\24\2\u0882\u0881"+
		"\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0885\3\2\2\2\u0884\u087f\3\2\2\2\u0884"+
		"\u0885\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0888\5\u0174\u00bb\2\u0887\u0852"+
		"\3\2\2\2\u0887\u0860\3\2\2\2\u0887\u0878\3\2\2\2\u0888\u01e9\3\2\2\2\u0889"+
		"\u088a\7@\2\2\u088a\u088b\7\u009c\2\2\u088b\u088c\5N(\2\u088c\u088d\7"+
		"s\2\2\u088d\u088e\7\u0103\2\2\u088e\u01eb\3\2\2\2\u088f\u0890\7@\2\2\u0890"+
		"\u0891\7\63\2\2\u0891\u0892\5\u0188\u00c5\2\u0892\u0893\7\u008c\2\2\u0893"+
		"\u0894\7\u00a3\2\2\u0894\u0895\5\u0188\u00c5\2\u0895\u08d8\3\2\2\2\u0896"+
		"\u0897\7@\2\2\u0897\u0898\7\63\2\2\u0898\u0899\5\u0188\u00c5\2\u0899\u089a"+
		"\7\u008c\2\2\u089a\u089b\7H\2\2\u089b\u089c\5\u018a\u00c6\2\u089c\u089d"+
		"\7\u00a3\2\2\u089d\u089e\5\u018a\u00c6\2\u089e\u08d8\3\2\2\2\u089f\u08a0"+
		"\7@\2\2\u08a0\u08a1\7\63\2\2\u08a1\u08a2\5\u0188\u00c5\2\u08a2\u08a3\7"+
		"?\2\2\u08a3\u08a4\7H\2\2\u08a4\u08a5\5\"\22\2\u08a5\u08d8\3\2\2\2\u08a6"+
		"\u08a7\7@\2\2\u08a7\u08a8\7\63\2\2\u08a8\u08a9\5\u0188\u00c5\2\u08a9\u08ab"+
		"\7?\2\2\u08aa\u08ac\5\30\r\2\u08ab\u08aa\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac"+
		"\u08ad\3\2\2\2\u08ad\u08ae\7\u0081\2\2\u08ae\u08af\7\u00e5\2\2\u08af\u08b0"+
		"\5\u01ee\u00f8\2\u08b0\u08b3\7\u00e6\2\2\u08b1\u08b2\7s\2\2\u08b2\u08b4"+
		"\7\u0103\2\2\u08b3\u08b1\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08d8\3\2\2"+
		"\2\u08b5\u08b6\7@\2\2\u08b6\u08b7\7\63\2\2\u08b7\u08b8\5\u0188\u00c5\2"+
		"\u08b8\u08ba\7U\2\2\u08b9\u08bb\5\34\17\2\u08ba\u08b9\3\2\2\2\u08ba\u08bb"+
		"\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd\7\u0081\2\2\u08bd\u08be\7\u00e5"+
		"\2\2\u08be\u08bf\5\u01ee\u00f8\2\u08bf\u08c1\7\u00e6\2\2\u08c0\u08c2\7"+
		"\u0086\2\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08d8\3\2\2\2"+
		"\u08c3\u08c4\7@\2\2\u08c4\u08c5\7\63\2\2\u08c5\u08c6\5\u0188\u00c5\2\u08c6"+
		"\u08c7\7\u0096\2\2\u08c7\u08c8\7\u0087\2\2\u08c8\u08c9\5\u01f2\u00fa\2"+
		"\u08c9\u08d8\3\2\2\2\u08ca\u08cb\7@\2\2\u08cb\u08cc\7\63\2\2\u08cc\u08cd"+
		"\5\u0188\u00c5\2\u08cd\u08ce\7\u00a7\2\2\u08ce\u08cf\7\u0087\2\2\u08cf"+
		"\u08d0\5\u01f6\u00fc\2\u08d0\u08d8\3\2\2\2\u08d1\u08d2\7@\2\2\u08d2\u08d3"+
		"\7\63\2\2\u08d3\u08d4\5\u0188\u00c5\2\u08d4\u08d5\7\u008d\2\2\u08d5\u08d6"+
		"\7\u0081\2\2\u08d6\u08d8\3\2\2\2\u08d7\u088f\3\2\2\2\u08d7\u0896\3\2\2"+
		"\2\u08d7\u089f\3\2\2\2\u08d7\u08a6\3\2\2\2\u08d7\u08b5\3\2\2\2\u08d7\u08c3"+
		"\3\2\2\2\u08d7\u08ca\3\2\2\2\u08d7\u08d1\3\2\2\2\u08d8\u01ed\3\2\2\2\u08d9"+
		"\u08de\5\u01f0\u00f9\2\u08da\u08db\7\u00de\2\2\u08db\u08dd\5\u01f0\u00f9"+
		"\2\u08dc\u08da\3\2\2\2\u08dd\u08e0\3\2\2\2\u08de\u08dc\3\2\2\2\u08de\u08df"+
		"\3\2\2\2\u08df\u01ef\3\2\2\2\u08e0\u08de\3\2\2\2\u08e1\u08e2\5N(\2\u08e2"+
		"\u08e3\7\u00db\2\2\u08e3\u08e4\5\u0110\u0089\2\u08e4\u01f1\3\2\2\2\u08e5"+
		"\u08ea\5\u01f4\u00fb\2\u08e6\u08e7\7\u00de\2\2\u08e7\u08e9\5\u01f4\u00fb"+
		"\2\u08e8\u08e6\3\2\2\2\u08e9\u08ec\3\2\2\2\u08ea\u08e8\3\2\2\2\u08ea\u08eb"+
		"\3\2\2\2\u08eb\u01f3\3\2\2\2\u08ec\u08ea\3\2\2\2\u08ed\u08ee\7\u0103\2"+
		"\2\u08ee\u08ef\7\u00db\2\2\u08ef\u08f0\7\u0103\2\2\u08f0\u01f5\3\2\2\2"+
		"\u08f1\u08f6\5\u01f8\u00fd\2\u08f2\u08f3\7\u00de\2\2\u08f3\u08f5\5\u01f8"+
		"\u00fd\2\u08f4\u08f2\3\2\2\2\u08f5\u08f8\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f6"+
		"\u08f7\3\2\2\2\u08f7\u01f7\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fa\7\u0103"+
		"\2\2\u08fa\u01f9\3\2\2\2\u00f9\u01fb\u01ff\u0205\u020c\u0215\u021a\u021e"+
		"\u0222\u0228\u022c\u0239\u023d\u0241\u0248\u024e\u0251\u0255\u025e\u0269"+
		"\u0274\u027a\u027f\u0282\u0286\u028b\u0291\u0295\u0298\u029b\u029f\u02a4"+
		"\u02a9\u02ad\u02b0\u02b3\u02bb\u02c1\u02c9\u02d2\u02e0\u02f5\u0306\u0313"+
		"\u0317\u0319\u0326\u032d\u0345\u034c\u035b\u0362\u0368\u036c\u0371\u0377"+
		"\u037c\u0382\u0393\u03a2\u03a6\u03aa\u03af\u03b4\u03b8\u03bb\u03c4\u03c9"+
		"\u03cd\u03d3\u03d9\u03de\u03e2\u03e4\u03e8\u03ec\u03ee\u03f2\u03f6\u03fa"+
		"\u03fe\u0409\u040d\u0415\u041f\u0431\u0435\u0439\u043e\u0440\u0444\u0449"+
		"\u044d\u044f\u0454\u0467\u0475\u047c\u0488\u048a\u048f\u04be\u04c0\u04cb"+
		"\u04cd\u04d1\u04d7\u04e9\u04ed\u04f1\u04f8\u04fb\u0503\u0506\u0519\u0529"+
		"\u052f\u0536\u053e\u0542\u054b\u054f\u0555\u0561\u056e\u0575\u057f\u0582"+
		"\u0585\u058c\u0598\u059d\u05a3\u05a9\u05b4\u05bc\u05c2\u05c6\u05ca\u05d2"+
		"\u05d6\u05de\u05e4\u05e8\u05ee\u05f1\u05f4\u05f7\u05fa\u05fd\u0607\u060c"+
		"\u0612\u0618\u0620\u0627\u062e\u0636\u0641\u0645\u064b\u0657\u065a\u0660"+
		"\u0665\u0668\u066e\u0674\u067b\u067d\u0684\u0697\u069e\u06a5\u06ac\u06c4"+
		"\u06cf\u06dd\u06e0\u06e3\u06e6\u06f3\u06f9\u0702\u0710\u071c\u0722\u0728"+
		"\u072c\u0730\u0735\u073a\u0740\u0744\u0748\u074d\u0752\u0759\u075d\u0764"+
		"\u076b\u076d\u0773\u0777\u077e\u0783\u0787\u078c\u0799\u079d\u07a6\u07b9"+
		"\u07c5\u07c9\u07d1\u07db\u07e2\u07ea\u07ee\u07f6\u07fd\u0808\u080f\u0819"+
		"\u0822\u082a\u0831\u083d\u0842\u0845\u0850\u0854\u085c\u0862\u086a\u0873"+
		"\u087a\u0882\u0884\u0887\u08ab\u08b3\u08ba\u08c1\u08d7\u08de\u08ea\u08f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}