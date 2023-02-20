// Generated from SQLParser.g4 by ANTLR 4.2
package com.camertron.SQLParser;


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parenthesized_boolean_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_boolean_value_expression(@NotNull SQLParser.Parenthesized_boolean_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#rank_function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRank_function_type(@NotNull SQLParser.Rank_function_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#parenthesized_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_value_expression(@NotNull SQLParser.Parenthesized_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#named_columns_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_columns_join(@NotNull SQLParser.Named_columns_joinContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#character_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_value_expression(@NotNull SQLParser.Character_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsterisk(@NotNull SQLParser.AsteriskContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#searched_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case(@NotNull SQLParser.Searched_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull SQLParser.Table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#column_reference_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_reference_list(@NotNull SQLParser.Column_reference_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(@NotNull SQLParser.PredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#trim_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_function(@NotNull SQLParser.Trim_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#in_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_predicate(@NotNull SQLParser.In_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#regex_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex_matcher(@NotNull SQLParser.Regex_matcherContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#time_zone_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone_field(@NotNull SQLParser.Time_zone_fieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#type_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_length(@NotNull SQLParser.Type_lengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_tablespace_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace_statement(@NotNull SQLParser.Alter_tablespace_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_name(@NotNull SQLParser.Partition_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#extract_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_expression(@NotNull SQLParser.Extract_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#list_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partitions(@NotNull SQLParser.List_partitionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#cube_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCube_list(@NotNull SQLParser.Cube_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#case_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_specification(@NotNull SQLParser.Case_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_function_type(@NotNull SQLParser.Window_function_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#national_character_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNational_character_string_type(@NotNull SQLParser.National_character_string_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#individual_hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_hash_partitions(@NotNull SQLParser.Individual_hash_partitionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#extract_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_field(@NotNull SQLParser.Extract_fieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#sort_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier(@NotNull SQLParser.Sort_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#range_value_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_value_clause(@NotNull SQLParser.Range_value_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#case_abbreviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_abbreviation(@NotNull SQLParser.Case_abbreviationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#string_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value_function(@NotNull SQLParser.String_value_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(@NotNull SQLParser.Query_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#query_expression_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression_body(@NotNull SQLParser.Query_expression_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_statement(@NotNull SQLParser.Schema_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(@NotNull SQLParser.Boolean_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#value_expression_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expression_primary(@NotNull SQLParser.Value_expression_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(@NotNull SQLParser.Insert_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_value_specification(@NotNull SQLParser.Unsigned_value_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(@NotNull SQLParser.ResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_test(@NotNull SQLParser.Boolean_testContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#general_set_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_set_function(@NotNull SQLParser.General_set_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull SQLParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#in_predicate_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_predicate_value(@NotNull SQLParser.In_predicate_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(@NotNull SQLParser.Having_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_order_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_order_clause(@NotNull SQLParser.Window_order_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#datetime_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_factor(@NotNull SQLParser.Datetime_factorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_statement(@NotNull SQLParser.Drop_table_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#row_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_value_expression(@NotNull SQLParser.Row_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_query_name(@NotNull SQLParser.Table_or_query_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#cast_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_operand(@NotNull SQLParser.Cast_operandContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specification(@NotNull SQLParser.Window_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#pattern_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_matcher(@NotNull SQLParser.Pattern_matcherContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#current_time_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_time_value_function(@NotNull SQLParser.Current_time_value_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#range_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partitions(@NotNull SQLParser.Range_partitionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#non_second_primary_datetime_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_second_primary_datetime_field(@NotNull SQLParser.Non_second_primary_datetime_fieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#grouping_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_operation(@NotNull SQLParser.Grouping_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_statement(@NotNull SQLParser.Drop_index_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#searched_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_when_clause(@NotNull SQLParser.Searched_when_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#query_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_term(@NotNull SQLParser.Query_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#order_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_specification(@NotNull SQLParser.Order_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(@NotNull SQLParser.Window_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#aggregate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function(@NotNull SQLParser.Aggregate_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(@NotNull SQLParser.Column_name_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#as_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_clause(@NotNull SQLParser.As_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#property_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_key(@NotNull SQLParser.Property_keyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#precision_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_param(@NotNull SQLParser.Precision_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#map_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_type(@NotNull SQLParser.Map_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#query_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_primary(@NotNull SQLParser.Query_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_statement(@NotNull SQLParser.Drop_database_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#datetime_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_primary(@NotNull SQLParser.Datetime_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#ordinary_grouping_set_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinary_grouping_set_list(@NotNull SQLParser.Ordinary_grouping_set_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_statement(@NotNull SQLParser.Alter_table_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#if_not_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_not_exists(@NotNull SQLParser.If_not_existsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#range_value_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_value_clause_list(@NotNull SQLParser.Range_value_clause_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#is_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_clause(@NotNull SQLParser.Is_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#or_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_predicate(@NotNull SQLParser.Or_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#nonreserved_keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonreserved_keywords(@NotNull SQLParser.Nonreserved_keywordsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_specification_details}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specification_details(@NotNull SQLParser.Window_specification_detailsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#datetime_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_literal(@NotNull SQLParser.Datetime_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#unsigned_numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_numeric_literal(@NotNull SQLParser.Unsigned_numeric_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_table_statement(@NotNull SQLParser.Truncate_table_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#data_change_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_change_statement(@NotNull SQLParser.Data_change_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#row_value_predicand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_value_predicand(@NotNull SQLParser.Row_value_predicandContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#set_function_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_function_specification(@NotNull SQLParser.Set_function_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#select_sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sublist(@NotNull SQLParser.Select_sublistContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_clause(@NotNull SQLParser.Window_frame_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier_list(@NotNull SQLParser.Sort_specifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#datetime_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_value_function(@NotNull SQLParser.Datetime_value_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(@NotNull SQLParser.Search_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#in_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_value_list(@NotNull SQLParser.In_value_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#interval_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_literal(@NotNull SQLParser.Interval_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#nonparenthesized_value_expression_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonparenthesized_value_expression_primary(@NotNull SQLParser.Nonparenthesized_value_expression_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#some}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome(@NotNull SQLParser.SomeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_primary(@NotNull SQLParser.Boolean_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#predefined_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_type(@NotNull SQLParser.Predefined_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_elements(@NotNull SQLParser.Table_elementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#individual_hash_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_hash_partition(@NotNull SQLParser.Individual_hash_partitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#join_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_specification(@NotNull SQLParser.Join_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#exact_numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExact_numeric_type(@NotNull SQLParser.Exact_numeric_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#negativable_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativable_matcher(@NotNull SQLParser.Negativable_matcherContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#character_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string_type(@NotNull SQLParser.Character_string_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_extent(@NotNull SQLParser.Window_frame_extentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(@NotNull SQLParser.Select_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull SQLParser.ParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SQLParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#primary_or_extended_datetime_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_or_extended_datetime_literal(@NotNull SQLParser.Primary_or_extended_datetime_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(@NotNull SQLParser.Array_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull SQLParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(@NotNull SQLParser.Date_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partitions(@NotNull SQLParser.Hash_partitionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#database_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_definition(@NotNull SQLParser.Database_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_type(@NotNull SQLParser.Boolean_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#explicit_row_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_row_value_constructor(@NotNull SQLParser.Explicit_row_value_constructorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#record_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type(@NotNull SQLParser.Record_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_function(@NotNull SQLParser.Window_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(@NotNull SQLParser.Limit_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_expression(@NotNull SQLParser.Table_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(@NotNull SQLParser.Outer_join_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#explain_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_clause(@NotNull SQLParser.Explain_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(@NotNull SQLParser.Join_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#row_value_predicand_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_value_predicand_list(@NotNull SQLParser.Row_value_predicand_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#non_join_query_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_join_query_primary(@NotNull SQLParser.Non_join_query_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull SQLParser.Function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#list_value_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_value_clause_list(@NotNull SQLParser.List_value_clause_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(@NotNull SQLParser.Data_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#datetime_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_term(@NotNull SQLParser.Datetime_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_statement(@NotNull SQLParser.Index_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#simple_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case(@NotNull SQLParser.Simple_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#grouping_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_element_list(@NotNull SQLParser.Grouping_element_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#character_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_primary(@NotNull SQLParser.Character_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#outer_join_type_part2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type_part2(@NotNull SQLParser.Outer_join_type_part2Context ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_argument_list(@NotNull SQLParser.Sql_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#param_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_clause(@NotNull SQLParser.Param_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#derived_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_column(@NotNull SQLParser.Derived_columnContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(@NotNull SQLParser.Query_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#session_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_statement(@NotNull SQLParser.Session_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#extract_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_source(@NotNull SQLParser.Extract_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_clause(@NotNull SQLParser.Window_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#explicit_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_table(@NotNull SQLParser.Explicit_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(@NotNull SQLParser.Derived_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#column_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_partitions(@NotNull SQLParser.Column_partitionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull SQLParser.PropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type(@NotNull SQLParser.Numeric_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_asterisk(@NotNull SQLParser.Qualified_asteriskContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull SQLParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#bit_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_type(@NotNull SQLParser.Bit_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#datetime_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_value_expression(@NotNull SQLParser.Datetime_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#datetime_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_type(@NotNull SQLParser.Datetime_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#between_predicate_part_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_predicate_part_2(@NotNull SQLParser.Between_predicate_part_2Context ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#field_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_type(@NotNull SQLParser.Field_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(@NotNull SQLParser.Time_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#non_join_query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_join_query_expression(@NotNull SQLParser.Non_join_query_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(@NotNull SQLParser.Orderby_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#grouping_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_element(@NotNull SQLParser.Grouping_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#ordinary_grouping_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinary_grouping_set(@NotNull SQLParser.Ordinary_grouping_setContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#quantified_comparison_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified_comparison_predicate(@NotNull SQLParser.Quantified_comparison_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#natural_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatural_join(@NotNull SQLParser.Natural_joinContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#between_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_predicate(@NotNull SQLParser.Between_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#cross_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_join(@NotNull SQLParser.Cross_joinContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#simple_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_table(@NotNull SQLParser.Simple_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#unsigned_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_literal(@NotNull SQLParser.Unsigned_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#joined_table_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table_primary(@NotNull SQLParser.Joined_table_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#approximate_numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApproximate_numeric_type(@NotNull SQLParser.Approximate_numeric_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#list_value_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_value_partition(@NotNull SQLParser.List_value_partitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#empty_grouping_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_grouping_set(@NotNull SQLParser.Empty_grouping_setContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_space_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_space_name(@NotNull SQLParser.Table_space_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#trim_operands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_operands(@NotNull SQLParser.Trim_operandsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_frame_units}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_units(@NotNull SQLParser.Window_frame_unitsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_column_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_column_value(@NotNull SQLParser.Partition_column_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_name(@NotNull SQLParser.Window_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#character_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_factor(@NotNull SQLParser.Character_factorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#current_timestamp_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_timestamp_value_function(@NotNull SQLParser.Current_timestamp_value_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#null_ordering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_ordering(@NotNull SQLParser.Null_orderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#cast_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_target(@NotNull SQLParser.Cast_targetContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#truth_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruth_value(@NotNull SQLParser.Truth_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#binary_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_type(@NotNull SQLParser.Binary_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#numeric_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_primary(@NotNull SQLParser.Numeric_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#complex_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_type(@NotNull SQLParser.Complex_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#common_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_value_expression(@NotNull SQLParser.Common_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#and_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_predicate(@NotNull SQLParser.And_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(@NotNull SQLParser.From_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#routine_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_invocation(@NotNull SQLParser.Routine_invocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#null_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_predicate(@NotNull SQLParser.Null_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#data_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_statement(@NotNull SQLParser.Data_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#general_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_literal(@NotNull SQLParser.General_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_numerical_literal(@NotNull SQLParser.Signed_numerical_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#property_key_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_key_list(@NotNull SQLParser.Property_key_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(@NotNull SQLParser.Else_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_qualifier(@NotNull SQLParser.Set_qualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_predicand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_predicand(@NotNull SQLParser.Boolean_predicandContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(@NotNull SQLParser.Where_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(@NotNull SQLParser.SubqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#string_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value_expression(@NotNull SQLParser.String_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(@NotNull SQLParser.SignContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#function_names_for_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_names_for_reserved_words(@NotNull SQLParser.Function_names_for_reserved_wordsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#filter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_clause(@NotNull SQLParser.Filter_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#trim_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_specification(@NotNull SQLParser.Trim_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_primary(@NotNull SQLParser.Table_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#row_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_subquery(@NotNull SQLParser.Row_subqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_factor(@NotNull SQLParser.Boolean_factorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(@NotNull SQLParser.AllContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#column_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_reference(@NotNull SQLParser.Column_referenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(@NotNull SQLParser.Join_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_space_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_space_specifier(@NotNull SQLParser.Table_space_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#numeric_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_value_function(@NotNull SQLParser.Numeric_value_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(@NotNull SQLParser.Case_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_name_or_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_name_or_specification(@NotNull SQLParser.Window_name_or_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#row_value_constructor_predicand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_value_constructor_predicand(@NotNull SQLParser.Row_value_constructor_predicandContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_frame_between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_between(@NotNull SQLParser.Window_frame_betweenContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(@NotNull SQLParser.Comp_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#binary_large_object_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_large_object_string_type(@NotNull SQLParser.Binary_large_object_string_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#pattern_matching_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_matching_predicate(@NotNull SQLParser.Pattern_matching_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_reference_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference_list(@NotNull SQLParser.Table_reference_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#field_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_element(@NotNull SQLParser.Field_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#current_date_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_date_value_function(@NotNull SQLParser.Current_date_value_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#non_join_query_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_join_query_term(@NotNull SQLParser.Non_join_query_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#scalar_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_subquery(@NotNull SQLParser.Scalar_subqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#primary_datetime_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_datetime_field(@NotNull SQLParser.Primary_datetime_fieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement(@NotNull SQLParser.Create_table_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#create_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_statement(@NotNull SQLParser.Create_index_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#existing_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExisting_window_name(@NotNull SQLParser.Existing_window_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_frame_end_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_end_bound(@NotNull SQLParser.Window_frame_end_boundContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#exists_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists_predicate(@NotNull SQLParser.Exists_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(@NotNull SQLParser.SqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#numeric_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_value_expression(@NotNull SQLParser.Numeric_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#union_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_join(@NotNull SQLParser.Union_joinContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_subquery(@NotNull SQLParser.Table_subqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_join(@NotNull SQLParser.Qualified_joinContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#set_function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_function_type(@NotNull SQLParser.Set_function_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_clause(@NotNull SQLParser.Groupby_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#unique_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_predicate(@NotNull SQLParser.Unique_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_value_expression(@NotNull SQLParser.Boolean_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_frame_start_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_start_bound(@NotNull SQLParser.Window_frame_start_boundContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_exists(@NotNull SQLParser.If_existsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#method_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_specifier(@NotNull SQLParser.Method_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#simple_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_when_clause(@NotNull SQLParser.Simple_when_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expression(@NotNull SQLParser.Value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#comparison_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_predicate(@NotNull SQLParser.Comparison_predicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#hash_partitions_by_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partitions_by_quantity(@NotNull SQLParser.Hash_partitions_by_quantityContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(@NotNull SQLParser.Timestamp_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_partition_clause(@NotNull SQLParser.Window_partition_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull SQLParser.Column_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(@NotNull SQLParser.Joined_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(@NotNull SQLParser.QuantifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition_list(@NotNull SQLParser.Window_definition_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#row_value_special_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_value_special_case(@NotNull SQLParser.Row_value_special_caseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#cast_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_specification(@NotNull SQLParser.Cast_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_list(@NotNull SQLParser.Property_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#rollup_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_list(@NotNull SQLParser.Rollup_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_column_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_column_value_list(@NotNull SQLParser.Partition_column_value_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(@NotNull SQLParser.Table_referenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#window_frame_exclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_exclusion(@NotNull SQLParser.Window_frame_exclusionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#extended_datetime_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_datetime_field(@NotNull SQLParser.Extended_datetime_fieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLParser#table_partitioning_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_partitioning_clauses(@NotNull SQLParser.Table_partitioning_clausesContext ctx);
}