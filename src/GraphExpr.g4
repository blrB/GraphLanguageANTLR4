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

CONTAIN : '<?>';
EQ : '==';
NEQ : '!=';
IS : 'is';

IN : 'in';

PRINT : 'print';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOREACH : 'forEach';

MAIN : 'main';

parse
 : create* main EOF
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
 ;

create
 : create_graph
 | create_vertex
 | create_edge
 ;

create_graph
 : GRAPH ID ASSIGN name_object
 ;

create_vertex
 : VERTEX ID ASSIGN name_object
 ;

create_edge
 : EDGE ID ASSIGN connect
 ;

name_object
 : STRING
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
 : OPAR condition CPAR stat_block
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
 | EDGE ID IN ID                        #forEachEdge
 ;

print
 : PRINT STRING
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
