grammar GraphExpr;

ASSIGN : '=';

GRAPH : 'graph';
VERTEX : 'vertex';
EDGE : 'edge';

OPAR : '(';
CPAR : ')';
OANGLEBR : '<';
CANGLEBR : '>';
OBRACKET : '{';
CBRACKET : '}';

PUSH : '<-';
PULL : '->';

NEGATION : '!';
CONTAIN : '<?>';
EQ : '==';
NEQ : '!=';
IS : 'is';
PLUS : '+';

IN : 'in';

PRINT : 'print';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOREACH : 'forEach';

MAIN : 'main';
FUNCTION : 'fn';
RETURN : 'return';

parse
 : create* main function* EOF
 ;

main
 : MAIN OBRACKET start CBRACKET
 ;

start
 : instruction*
 ;

instruction
 : create
 | push_in_graph
 | pull_from_graph
 | print
 | if_stat
 | while_stat
 | foreach_stat
 | function_call
 ;

create
 : create_graph
 | create_vertex
 | create_edge
 ;

create_graph
 : GRAPH ID ASSIGN name_object_graph
 ;

create_vertex
 : VERTEX ID ASSIGN name_object_vertex
 ;

create_edge
 : EDGE ID ASSIGN name_object_edge
 ;

name_object_graph
 : STRING                   #nameObjectGraph
 | function_call            #functionCallGraph
 ;

name_object_vertex
 : STRING                   #nameObjectVertex
 | function_call            #functionCallVertex
 ;

name_object_edge
 : connect                  #nameObjectEdge
 | function_call            #functionCallEdge
 ;

connect
 : OANGLEBR source = ID ',' target = ID CANGLEBR
 ;

push_in_graph
 : id = ID PUSH push_more
 ;

pull_from_graph
 : id = ID PULL pull_more
 ;

push_more
 : ID ',' push_more      #pushMore
 | ID                    #pushOne
 ;

pull_more
 : ID ',' pull_more      #pullMore
 | ID                    #pullOne
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : OPAR (NEGATION)? condition CPAR stat_block
 ;

stat_block
 : OBRACKET start CBRACKET
 ;

while_stat
 : WHILE condition_block
 ;

foreach_stat
 : FOREACH OPAR condition_for_each CPAR stat_block
 ;

condition
 : ID op=(EQ | NEQ) ID                  #equalityExpr
 | ID CONTAIN ID                        #contain
 | ID IS type                           #checkType
 ;

condition_for_each
 : VERTEX ID IN ID                      #forEachVertex
 | VERTEX ID IN ID IN ID                #forEachAdjacencyVertex
 | EDGE ID IN ID                        #forEachEdge
 ;

print
 : PRINT print_expr
 ;

print_expr
 : print_expr PLUS print_expr           #concatString
 | ID                                   #printId
 | STRING                               #printString
 ;

function_call
 : ID param_call
 ;

param_call
 : OPAR (arg_call)? CPAR
 ;

arg_call
 : ID                      #paramCallArg
 | ID ',' arg_call         #paramCallArgs
 ;

function
 : FUNCTION ID param stat_block                     #voidFunction
 | FUNCTION type ID param stat_block_with_return    #returnFunction
 ;

stat_block_with_return
 : OBRACKET start return_id CBRACKET
 ;

return_id
 : RETURN ID
 ;

param
 : OPAR (arg)? CPAR
 ;

arg
 : type ID                      #paramArg
 | type ID ',' arg              #paramArgs
 ;

type
 : VERTEX
 | EDGE
 | GRAPH
 ;

INT
 : [0-9]+
 ;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

SPACES
 : [ \t\r\n] -> skip
 ;
